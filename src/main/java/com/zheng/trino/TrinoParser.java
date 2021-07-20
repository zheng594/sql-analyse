package com.zheng.trino;

import io.trino.sql.parser.CaseInsensitiveStream;
import io.trino.sql.parser.ParsingException;
import io.trino.sql.tree.Node;
import io.trino.sql.tree.Statement;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class TrinoParser {
    private TrinoAstBuilder builder = new TrinoAstBuilder();
    private static final BaseErrorListener LEXER_ERROR_LISTENER = new BaseErrorListener();
    private static final BiConsumer<TrinoSqlBaseLexer, TrinoSqlBaseParser> DEFAULT_PARSER_INITIALIZER = (TrinoSqlBaseLexer lexer, TrinoSqlBaseParser parser) -> {
    };
//    private static final ErrorHandler PARSER_ERROR_HANDLER = ErrorHandler.builder()
//            .specialRule(SqlBaseParser.RULE_expression, "<expression>")
//            .specialRule(SqlBaseParser.RULE_booleanExpression, "<expression>")
//            .specialRule(SqlBaseParser.RULE_valueExpression, "<expression>")
//            .specialRule(SqlBaseParser.RULE_primaryExpression, "<expression>")
//            .specialRule(SqlBaseParser.RULE_predicate, "<predicate>")
//            .specialRule(SqlBaseParser.RULE_identifier, "<identifier>")
//            .specialRule(SqlBaseParser.RULE_string, "<string>")
//            .specialRule(SqlBaseParser.RULE_query, "<query>")
//            .specialRule(SqlBaseParser.RULE_type, "<type>")
//            .specialToken(SqlBaseLexer.INTEGER_VALUE, "<integer>")
//            .ignoredRule(SqlBaseParser.RULE_nonReserved)
//            .build();

    public Statement createStatement(String sql) {
        return (Statement) invokeParser("statement", sql, TrinoSqlBaseParser::singleStatement);
    }

    private Node invokeParser(String name, String sql, Function<TrinoSqlBaseParser, ParserRuleContext> parseFunction) {
        try {
            TrinoSqlBaseLexer lexer = new TrinoSqlBaseLexer(new CaseInsensitiveStream(CharStreams.fromString(sql)));
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            TrinoSqlBaseParser parser = new TrinoSqlBaseParser(tokenStream);
//            initializer.accept(lexer, parser);

            // Override the default error strategy to not attempt inserting or deleting a token.
            // Otherwise, it messes up error reporting
            parser.setErrorHandler(new DefaultErrorStrategy() {
                @Override
                public Token recoverInline(Parser recognizer)
                        throws RecognitionException {
                    if (nextTokensContext == null) {
                        throw new InputMismatchException(recognizer);
                    } else {
                        throw new InputMismatchException(recognizer, nextTokensState, nextTokensContext);
                    }
                }
            });

            parser.addParseListener(new PostProcessor(Arrays.asList(parser.getRuleNames()), parser));

            lexer.removeErrorListeners();
            lexer.addErrorListener(LEXER_ERROR_LISTENER);

            parser.removeErrorListeners();
//            parser.addErrorListener(PARSER_ERROR_HANDLER);

            ParserRuleContext tree;
            try {
                // first, try parsing with potentially faster SLL mode
                parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
                tree = parseFunction.apply(parser);
            } catch (ParseCancellationException ex) {
                // if we fail, parse with LL mode
                tokenStream.seek(0); // rewind input stream
                parser.reset();

                parser.getInterpreter().setPredictionMode(PredictionMode.LL);
                tree = parseFunction.apply(parser);
            }

            return (Node) new TrinoAstBuilder().visit(tree);
        } catch (StackOverflowError e) {
            throw new ParsingException(name + " is too large (stack overflow while parsing)");
        }
    }


    private static class PostProcessor
            extends TrinoSqlBaseBaseListener {
        private final List<String> ruleNames;
        private final TrinoSqlBaseParser parser;

        public PostProcessor(List<String> ruleNames, TrinoSqlBaseParser parser) {
            this.ruleNames = ruleNames;
            this.parser = parser;
        }

        @Override
        public void exitQuotedIdentifier(TrinoSqlBaseParser.QuotedIdentifierContext context) {
            Token token = context.QUOTED_IDENTIFIER().getSymbol();
            if (token.getText().length() == 2) { // empty identifier
                throw new ParsingException("Zero-length delimited identifier not allowed", null, token.getLine(), token.getCharPositionInLine() + 1);
            }
        }

        @Override
        public void exitBackQuotedIdentifier(TrinoSqlBaseParser.BackQuotedIdentifierContext context) {
            Token token = context.BACKQUOTED_IDENTIFIER().getSymbol();
            throw new ParsingException(
                    "backquoted identifiers are not supported; use double quotes to quote identifiers",
                    null,
                    token.getLine(),
                    token.getCharPositionInLine() + 1);
        }

        @Override
        public void exitDigitIdentifier(TrinoSqlBaseParser.DigitIdentifierContext context) {
            Token token = context.DIGIT_IDENTIFIER().getSymbol();
            throw new ParsingException(
                    "identifiers must not start with a digit; surround the identifier with double quotes",
                    null,
                    token.getLine(),
                    token.getCharPositionInLine() + 1);
        }

        @Override
        public void exitNonReserved(TrinoSqlBaseParser.NonReservedContext context) {
            // we can't modify the tree during rule enter/exit event handling unless we're dealing with a terminal.
            // Otherwise, ANTLR gets confused and fires spurious notifications.
            if (!(context.getChild(0) instanceof TerminalNode)) {
                int rule = ((ParserRuleContext) context.getChild(0)).getRuleIndex();
                throw new AssertionError("nonReserved can only contain tokens. Found nested rule: " + ruleNames.get(rule));
            }

            // replace nonReserved words with IDENT tokens
            context.getParent().removeLastChild();

            Token token = (Token) context.getChild(0).getPayload();
            Token newToken = new CommonToken(
                    new Pair<>(token.getTokenSource(), token.getInputStream()),
                    TrinoSqlBaseLexer.IDENTIFIER,
                    token.getChannel(),
                    token.getStartIndex(),
                    token.getStopIndex());

            context.getParent().addChild(parser.createTerminalNode(context.getParent(), newToken));
        }
    }
}
