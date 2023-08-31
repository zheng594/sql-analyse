package com.zheng.analyse.starrocks.parser;

import com.zheng.analyse.spark.model.*;
import com.zheng.analyse.starrocks.antlr4.StarRocksBaseVisitor;
import com.zheng.analyse.starrocks.antlr4.StarRocksParser;
import com.google.common.collect.Lists;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StarRocksAst extends StarRocksBaseVisitor {
    private SqlParseVO sqlParseVO = new SqlParseVO();
    private SqlTypeEnum curSqlType = SqlTypeEnum.UNKOWN;
    private List<String> withList = new ArrayList<>();
    private List<SqlTypeEnum> outputTypeList = Lists.newArrayList(SqlTypeEnum.INSERT_VALUES, SqlTypeEnum.CREATE_TABLE);
    private List<SqlTypeEnum> inputTypeList = Lists.newArrayList(SqlTypeEnum.INSERT_SELECT, SqlTypeEnum.CREATE_TABLE_AS_SELECT, SqlTypeEnum.SELECT);
    private int level = 0;

//    @Override
//    public TableSib visit(ParseTree tree) {
//        super.visit(tree);
//        return tableSib;
//    }


    @Override
    public SqlParseVO visitSingleStatement(StarRocksParser.SingleStatementContext context) {
        if (context.statement() != null) {
            Object obj = visit(context.statement());
            return null;
        } else {
            Object obj = visit(context.emptyStatement());
            return null;
        }
    }

    @Override
    public SqlParseVO visit(ParseTree tree) {
        super.visit(tree);
        return sqlParseVO;
    }

    private <T> List<T> visit(List<? extends ParserRuleContext> contexts, Class<T> clazz) {
        return contexts.stream()
                .map(this::visit)
                .map(clazz::cast)
                .collect(toList());
    }

    @Override
    public Object visitQueryStatement(StarRocksParser.QueryStatementContext context) {
        curSqlType = SqlTypeEnum.SELECT;
        sqlParseVO.setSqlType(curSqlType);
//        QueryRelation queryRelation = (QueryRelation) visit(context.queryRelation());
//        QueryStatement queryStatement = new QueryStatement(queryRelation);
//        if (context.outfile() != null) {
//            queryStatement.setOutFileClause((OutFileClause) visit(context.outfile()));
//        }
//
//        if (context.explainDesc() != null) {
//            queryStatement.setIsExplain(true, getExplainType(context.explainDesc()));
//        }
//
//        if (context.optimizerTrace() != null) {
//            queryStatement.setIsExplain(true, StatementBase.ExplainLevel.OPTIMIZER);
//        }

        return super.visitQueryStatement(context);
    }

    @Override
    public Object visitQueryRelation(StarRocksParser.QueryRelationContext ctx) {
        return super.visitQueryRelation(ctx);
    }

    @Override
    public SqlParseVO visitQueryPrimaryDefault(StarRocksParser.QueryPrimaryDefaultContext ctx) {
        level++;
        if (level == 1) {
            List<ColunmObj> inputFullColList = new ArrayList<>();
            ctx.querySpecification().selectItem().stream().forEach(i -> {
                StarRocksParser.SelectSingleContext item = ((StarRocksParser.SelectSingleContext) i);
                String name = item.expression().getText();
                if (name.indexOf(".") != -1) {
                    name = name.split("\\.")[1];
                }
                String alias = item.identifier() == null ? name : item.identifier().getText();
                inputFullColList.add(new ColunmObj(name, alias));

                sqlParseVO.setInputFullColList(inputFullColList);
            });
        }

        super.visitQueryPrimaryDefault(ctx);
        return sqlParseVO;
    }

    @Override
    public Object visitQueryWithParentheses(StarRocksParser.QueryWithParenthesesContext ctx) {
        return super.visitQueryWithParentheses(ctx);
    }

    @Override
    public Object visitRelations(StarRocksParser.RelationsContext ctx) {
        return super.visitRelations(ctx);
    }

    /**
     * 表名
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitRelation(StarRocksParser.RelationContext ctx) {
        return super.visitRelation(ctx);
    }


    @Override
    public Object visitQuerySpecification(StarRocksParser.QuerySpecificationContext ctx) {
        return super.visitQuerySpecification(ctx);
    }

    @Override
    public Object visitQualifiedName(StarRocksParser.QualifiedNameContext ctx) {
        return super.visitQualifiedName(ctx);
    }

    @Override
    public SqlParseVO visitTableAtom(StarRocksParser.TableAtomContext ctx) {
        List<StarRocksParser.IdentifierContext> identifiers = ctx.qualifiedName().identifier();
        if (curSqlType == SqlTypeEnum.SELECT) {
            String db = "";
            String tableName = "";
            if (identifiers.size() == 3) {
                db = identifiers.get(1).getText();
                tableName = identifiers.get(2).getText();
            } else if (identifiers.size() == 2) {
                db = identifiers.get(0).getText();
                tableName = identifiers.get(1).getText();
            } else {
                throw new BizException("表信息输入错误,请遵循database.tableName的形式");
            }
            db = db.replaceAll("`", "");
            tableName = tableName.replaceAll("`", "");
            sqlParseVO.getInputTables().add(new TableObj(db, tableName));
        }
        super.visitTableAtom(ctx);
        return sqlParseVO;
    }

    @Override
    public Object visitQueryNoWith(StarRocksParser.QueryNoWithContext ctx) {
        return super.visitQueryNoWith(ctx);
    }

    @Override
    public Object visitSelectSingle(StarRocksParser.SelectSingleContext ctx) {
        StarRocksParser.IdentifierContext identifierContext = ctx.identifier();
        if (identifierContext != null) {
            identifierContext.getText();
        }
        return super.visitSelectSingle(ctx);
    }

    @Override
    public Object visitInlineTable(StarRocksParser.InlineTableContext ctx) {
        return super.visitInlineTable(ctx);
    }


}
