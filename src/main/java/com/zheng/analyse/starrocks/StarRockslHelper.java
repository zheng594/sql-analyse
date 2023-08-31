package com.zheng.analyse.starrocks;

import com.zheng.analyse.spark.model.SqlParseVO;
import com.zheng.analyse.spark.model.UpperCaseCharStream;
import com.zheng.analyse.spark.parser.ParseErrorListener;
import com.zheng.analyse.spark.parser.PostProcessor;
import com.zheng.analyse.starrocks.antlr4.StarRocksLexer;
import com.zheng.analyse.starrocks.antlr4.StarRocksParser;
import com.zheng.analyse.starrocks.parser.StarRocksAst;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.apache.commons.lang3.StringUtils;

public class StarRockslHelper {

    public static SqlParseVO parseSql(String sql) {
        String trimCmd = StringUtils.trim(sql);

        UpperCaseCharStream charStream = new UpperCaseCharStream(CharStreams.fromString(trimCmd));
        StarRocksLexer lexer = new StarRocksLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ParseErrorListener());

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        StarRocksParser parser = new StarRocksParser(tokenStream);
        parser.addParseListener(new PostProcessor());
        parser.removeErrorListeners();
        parser.addErrorListener(new ParseErrorListener());
        // first, try parsing with potentially faster SLL mode
        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);

//        System.out.println(parser.singleStatement().toStringTree(parser));

        StarRocksAst visitor = new StarRocksAst();

        try {
            return visitor.visit(parser.singleStatement());
        } catch (ParseCancellationException e) {
            tokenStream.seek(0);
            parser.reset();

            // Try Again.
            parser.getInterpreter().setPredictionMode(PredictionMode.LL);
            return visitor.visit(parser.statement());
        }
    }

}
