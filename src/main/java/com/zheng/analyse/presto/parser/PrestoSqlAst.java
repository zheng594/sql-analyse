package com.zheng.analyse.presto.parser;

import com.zheng.analyse.spark.model.SqlParseVO;
import com.zheng.analyse.presto.antlr4.PrestoSqlBaseVisitor;
import com.zheng.analyse.presto.antlr4.PrestoSqlParser;
import com.zheng.analyse.spark.model.SqlTypeEnum;
import org.antlr.v4.runtime.tree.ParseTree;

public class PrestoSqlAst extends PrestoSqlBaseVisitor {
    private SqlParseVO sqlParseVO = new SqlParseVO();
    private SqlTypeEnum curSqlType = SqlTypeEnum.UNKOWN;
    private int level = 1;

    @Override
    public SqlParseVO visit(ParseTree tree) {
        super.visit(tree);
        return sqlParseVO;
    }

    @Override
    public Object visitQueryNoWith(PrestoSqlParser.QueryNoWithContext ctx) {
        if (level == 1 && ctx.limit != null) {
            sqlParseVO.setLimit(true);
        }
        level++;
        return super.visitQueryNoWith(ctx);
    }

    @Override
    public Object visitStatementDefault(PrestoSqlParser.StatementDefaultContext ctx) {
        curSqlType = SqlTypeEnum.SELECT;
        sqlParseVO.setSqlType(curSqlType);
        super.visitStatementDefault(ctx);
        return sqlParseVO;
    }

    @Override
    public SqlParseVO visitShowCreateTable(PrestoSqlParser.ShowCreateTableContext ctx) {
        curSqlType = SqlTypeEnum.SHOW_CREATE_TABLE;
        sqlParseVO.setSqlType(curSqlType);
        super.visitShowCreateTable(ctx);
        return sqlParseVO;
    }

    @Override
    public SqlParseVO visitShowCreateView(PrestoSqlParser.ShowCreateViewContext ctx) {
        curSqlType = SqlTypeEnum.SHOW_CREATE_VIEW;
        sqlParseVO.setSqlType(curSqlType);
        super.visitShowCreateView(ctx);
        return sqlParseVO;
    }

    @Override
    public SqlParseVO visitShowTables(PrestoSqlParser.ShowTablesContext ctx) {
        curSqlType = SqlTypeEnum.SHOW_TABLES;
        sqlParseVO.setSqlType(curSqlType);
        super.visitShowTables(ctx);
        return sqlParseVO;

    }

    @Override
    public SqlParseVO visitShowSchemas(PrestoSqlParser.ShowSchemasContext ctx) {
        curSqlType = SqlTypeEnum.SHOW_SCHEMAS;
        sqlParseVO.setSqlType(curSqlType);
        super.visitShowSchemas(ctx);
        return sqlParseVO;
    }

    @Override
    public SqlParseVO visitShowCatalogs(PrestoSqlParser.ShowCatalogsContext ctx) {
        curSqlType = SqlTypeEnum.SHOW_CATALOGS;
        sqlParseVO.setSqlType(curSqlType);
        super.visitShowCatalogs(ctx);
        return sqlParseVO;
    }

    @Override
    public SqlParseVO visitShowColumns(PrestoSqlParser.ShowColumnsContext ctx) {
        curSqlType = SqlTypeEnum.SHOW_COLUMNS;
        sqlParseVO.setSqlType(curSqlType);
        super.visitShowColumns(ctx);
        return sqlParseVO;
    }


    @Override
    public SqlParseVO visitShowFunctions(PrestoSqlParser.ShowFunctionsContext ctx) {
        super.visitShowFunctions(ctx);
        return sqlParseVO;
    }

}
