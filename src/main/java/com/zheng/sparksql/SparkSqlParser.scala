package com.zheng.sparksql

import com.zheng.custom.UpperCaseCharStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import org.apache.spark.sql.AnalysisException
import org.apache.spark.sql.catalyst.parser.{ParseErrorListener, ParseException, PostProcessor, SqlBaseLexer, SqlBaseParser}
import org.apache.spark.sql.catalyst.trees.Origin

/**
 * spark sql解析器
 */
class SparkSqlParser {
    private var parser: SqlBaseParser = null
    private val builder = new SparkSqlAstBuilder()

    def getParser(command: String): SqlBaseParser = {
        val lexer = new SqlBaseLexer(new UpperCaseCharStream(CharStreams.fromString(command)))
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener)

        val tokenStream = new CommonTokenStream(lexer)
        if (parser != null) {
            return parser
        }
        parser = new SqlBaseParser(tokenStream)
        parser.addParseListener(PostProcessor)
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener)
//                parser.legacy_setops_precedence_enabled = conf.setOpsPrecedenceEnforced
//                parser.legacy_exponent_literal_as_decimal_enabled = conf.exponentLiteralAsDecimalEnabled
//                parser.SQL_standard_keyword_behavior = conf.ansiEnabled

        try {
            try {
                // first, try parsing with potentially faster SLL mode
                parser.getInterpreter.setPredictionMode(PredictionMode.SLL)
                //                toResult(parser)
                parser
            }
            catch {
                case e: ParseCancellationException =>
                    // if we fail, parse with LL mode
                    tokenStream.seek(0) // rewind input stream
                    parser.reset()

                    // Try Again.
                    parser.getInterpreter.setPredictionMode(PredictionMode.LL)
                //                    toResult(parser)
            }
        }
        catch {
            case e: ParseException if e.command.isDefined =>
                throw e
            case e: ParseException =>
                throw e.withCommand(command)
            case e: AnalysisException =>
                val position = Origin(e.line, e.startPosition)
                throw new ParseException(Option(command), e.message, position, position)
        }
        parser
    }

    /**
     * 获取select的字段和别名
     * @param command
     * @tparam T
     * @return
     */
    def getNameExpression[T](command: String): AnyRef = {
        val parser = getParser(command)
        builder.visitSelectClause(parser.selectClause())
    }
}
