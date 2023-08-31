package com.zheng.analyse.spark.parser;

import com.zheng.analyse.spark.antlr4.SparkSqlBaseVisitor;
import com.zheng.analyse.spark.antlr4.SparkSqlParser;
import com.zheng.analyse.spark.model.*;
import com.google.common.base.CharMatcher;
import com.google.common.collect.Lists;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SparkSqlAst extends SparkSqlBaseVisitor {
    private SqlParseVO tableSib = new SqlParseVO();
    private SqlTypeEnum curSqlType = SqlTypeEnum.UNKOWN;
    private List<String> withList = new ArrayList<>();
    private List<SqlTypeEnum> outputTypeList = Lists.newArrayList(SqlTypeEnum.INSERT_VALUES, SqlTypeEnum.CREATE_TABLE);
    private List<SqlTypeEnum> inputTypeList = Lists.newArrayList(SqlTypeEnum.INSERT_SELECT, SqlTypeEnum.CREATE_TABLE_AS_SELECT, SqlTypeEnum.SELECT);

    @Override
    public SqlParseVO visit(ParseTree tree) {
        super.visit(tree);
        return tableSib;
    }

    /**
     * 新增字段
     *
     * @param ctx
     * @return
     */
    @Override
    public SqlParseVO visitAddTableColumns(SparkSqlParser.AddTableColumnsContext ctx) {
        curSqlType = SqlTypeEnum.ADD_COLUMN;
        tableSib.setSqlType(curSqlType);

        this.setOutputTab(ctx.tableIdentifier());

        List<ColunmObj> colList = ctx.columns.colType().stream().map(col -> {
            String name = col.identifier().getText();
            String dateType = col.dataType().getText();
            String comment = col.STRING() == null ? "" : col.STRING().getText();
            comment = CharMatcher.is('\"').trimFrom(comment);
            comment = CharMatcher.is('\'').trimFrom(comment);

            return new ColunmObj(name, dateType, comment, false);
        }).collect(Collectors.toList());

        tableSib.getOutputTable().setColList(colList);

        return tableSib;
    }

    private void setOutputTab(SparkSqlParser.TableIdentifierContext tableIdentifier) {
        String db = tableIdentifier.db == null ? "" : tableIdentifier.db.getText();
        String tableName = tableIdentifier.table == null ? "" : tableIdentifier.table.getText();
        tableSib.setOutputTable(new TableObj(db, tableName));
    }

    /**
     * 修改字段
     *
     * @param ctx
     * @return
     */
    @Override
    public SqlParseVO visitChangeColumn(SparkSqlParser.ChangeColumnContext ctx) {
        curSqlType = SqlTypeEnum.ALTER_COLUMN;
        tableSib.setSqlType(curSqlType);

        this.setOutputTab(ctx.tableIdentifier());
        String oldName = ctx.identifier().getText();

        SparkSqlParser.ColTypeContext colType = ctx.colType();
        String name = colType.identifier().getText();
        String dateType = colType.dataType().getText();
        String comment = colType.STRING() == null ? "" : colType.STRING().getText();
        comment = CharMatcher.is('\"').trimFrom(comment);
        comment = CharMatcher.is('\'').trimFrom(comment);

        List<ColunmObj> colList = Lists.newArrayList(new ColunmObj(oldName, name, dateType, comment, false));
        tableSib.getOutputTable().setColList(colList);

        return tableSib;
    }


    /**
     * create table …… 、create tale …… as select ……
     *
     * @param ctx the parse tree
     * @return
     */
    @Override
    public SqlParseVO visitCreateHiveTable(SparkSqlParser.CreateHiveTableContext ctx) {
        curSqlType = SqlTypeEnum.CREATE_TABLE;
        tableSib.setSqlType(curSqlType);

        super.visitCreateHiveTable(ctx);

        if (curSqlType == SqlTypeEnum.CREATE_TABLE) {
            //非分区字段
            List<ColunmObj> colList = tableSib.getOutputTable().getColList();
            if (colList == null) {
                colList = new ArrayList<>();
            }

            Set<String> colSet = new HashSet<>();
            if (ctx.columns != null) {
                List<SparkSqlParser.ColTypeContext> colTypes = ctx.columns.colType();
                for (SparkSqlParser.ColTypeContext col : colTypes) {
                    String name = col.identifier().getText();
                    String dateType = col.dataType().getText();
                    String comment = col.STRING() == null ? "" : col.STRING().getText();
                    comment = CharMatcher.is('\"').trimFrom(comment);
                    comment = CharMatcher.is('\'').trimFrom(comment);

                    colList.add(new ColunmObj(name, dateType, comment, false));
                    colSet.add(name);
                }
                tableSib.getOutputTable().setColList(colList);
            }

            //分区字段
            if (ctx.partitionColumns != null) {
                List<SparkSqlParser.ColTypeContext> partColTypes = ctx.partitionColumns.colType();
                for (SparkSqlParser.ColTypeContext col : partColTypes) {
                    String name = col.identifier().getText();
                    String dateType = col.dataType().getText();
                    String comment = col.STRING() == null ? "" : col.STRING().getText();
                    comment = CharMatcher.is('\"').trimFrom(comment);
                    comment = CharMatcher.is('\'').trimFrom(comment);

                    colList.add(new ColunmObj(name, dateType, comment, true));
                    colSet.add(name);
                }
            }
            if (colSet.size() != colList.size()) {
                throw new BizException("字段名重复");
            }

            tableSib.getOutputTable().setComment(ctx.comment == null ? "" : ctx.comment.getText());
            tableSib.getOutputTable().setPartition(ctx.partitionColumns != null);
        }

        return tableSib;
    }

    /**
     * create table tab1 like tab2
     * 区别于create …… as select……，该语法只建表不拷贝数据
     *
     * @param ctx the parse tree
     * @return
     */
    @Override
    public SqlParseVO visitCreateTableLike(SparkSqlParser.CreateTableLikeContext ctx) {
        curSqlType = SqlTypeEnum.CREATE_TABLE_AS_LIKE;

        super.visitCreateTableLike(ctx);
        return tableSib;
    }

    @Override
    public SqlParseVO visitQuery(SparkSqlParser.QueryContext ctx) {
        super.visitQuery(ctx);
        return null;
    }

    /**
     * select …… 、with ……
     * insert into/overwrite …… (as select ……)
     *
     * @param ctx the parse tree
     * @return
     */
    @Override
    public SqlParseVO visitStatementDefault(SparkSqlParser.StatementDefaultContext ctx) {
        String start = ctx.start.getText().toLowerCase();
        curSqlType = SqlTypeEnum.SELECT;

        if ("select".equals(start) || "with".equals(start)) {
            curSqlType = SqlTypeEnum.SELECT;

        } else if ("insert".equals(start)) {
            curSqlType = SqlTypeEnum.INSERT_VALUES;
        }
        tableSib.setSqlType(curSqlType);

        super.visitStatementDefault(ctx);
        return tableSib;
    }

    @Override
    public Object visitNamedQuery(SparkSqlParser.NamedQueryContext ctx) {
        withList.add(ctx.name.getText());
        return super.visitNamedQuery(ctx);
    }

    /**
     * create table ,from ,insert into, join
     *
     * @param ctx the parse tree
     * @return
     */
    @Override
    public SqlParseVO visitTableIdentifier(SparkSqlParser.TableIdentifierContext ctx) {
        String db = ctx.db == null ? "" : ctx.db.getText();
        String tableName = ctx.table == null ? "" : ctx.table.getText();

        String full = "".equals(db) ? tableName : db + "." + tableName;
        if (withList.contains(db + full)) {
            return null;
        }

        if (outputTypeList.contains(curSqlType)) {
            tableSib.setOutputTable(new TableObj(db, tableName));

        } else if (inputTypeList.contains(curSqlType)) {
            tableSib.getInputTables().add(new TableObj(db, tableName));
        }
        return null;
    }


    @Override
    public SqlParseVO visitQueryOrganization(SparkSqlParser.QueryOrganizationContext ctx) {
        super.visitQueryOrganization(ctx);
        return null;
    }

    /**
     * insert into table …… (as select ……）
     *
     * @param ctx the parse tree
     * @return
     */
    @Override
    public SqlParseVO visitInsertIntoTable(SparkSqlParser.InsertIntoTableContext ctx) {
        curSqlType = SqlTypeEnum.INSERT_VALUES;
        tableSib.setSqlType(curSqlType);

        super.visitInsertIntoTable(ctx);
        return null;
    }


    /**
     * insert overwrite …… (as select ……）
     *
     * @param ctx the parse tree
     * @return
     */
    @Override
    public SqlParseVO visitInsertOverwriteTable(SparkSqlParser.InsertOverwriteTableContext ctx) {
        curSqlType = SqlTypeEnum.INSERT_VALUES;
        tableSib.setSqlType(curSqlType);

        super.visitInsertOverwriteTable(ctx);
        return null;
    }

    @Override
    public SqlParseVO visitQuerySpecification(SparkSqlParser.QuerySpecificationContext ctx) {
        if (curSqlType == SqlTypeEnum.INSERT_VALUES) {
            curSqlType = SqlTypeEnum.INSERT_SELECT;

        } else if (curSqlType == SqlTypeEnum.CREATE_TABLE) {
            curSqlType = SqlTypeEnum.CREATE_TABLE_AS_SELECT;
        }

        tableSib.setSqlType(curSqlType);

        super.visitQuerySpecification(ctx);
        return null;
    }

    @Override
    public SqlParseVO visitInlineTableDefault1(SparkSqlParser.InlineTableDefault1Context ctx) {
        curSqlType = SqlTypeEnum.INSERT_VALUES;
        tableSib.setSqlType(curSqlType);

        super.visitInlineTableDefault1(ctx);
        return null;
    }

    @Override
    public Object visitNamedExpressionSeq(SparkSqlParser.NamedExpressionSeqContext ctx) {
        Set<ColunmObj> colList = ctx.namedExpression().stream().map(exp -> {
            String colName = exp.expression().getText();
            String colAlias = colName;
            if (exp.identifier() != null) {
                colAlias = exp.identifier().getText();
            }
            return new ColunmObj(colName,colAlias);
        }).collect(Collectors.toSet());
        tableSib.setInputColList(colList);
        return tableSib;
    }

}
