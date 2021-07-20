package com.zheng.sparksql

//import com.zheng.sparksql.antlr4.SqlBaseParser.{BooleanExpressionContext, StatementContext}
//import org.antlr.v4.runtime.misc
//import org.apache.spark.sql.catalyst.parser.ParserUtils.withOrigin
import com.zheng.model.NameExpression
import org.apache.spark.sql.catalyst.parser.{SqlBaseBaseVisitor, SqlBaseParser}

import java.util

class SparkSqlAstBuilder extends SqlBaseBaseVisitor[AnyRef]{


    /**
     * {@inheritDoc  }
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    override def visitSelectClause(ctx: SqlBaseParser.SelectClauseContext): util.ArrayList[NameExpression] = {
        val exps = ctx.namedExpressionSeq().namedExpression()
        val list = new util.ArrayList[NameExpression]()
        exps.forEach(exp=>{
            val name = exp.expression().getText
            val alias  = if (exp.name==null) null else exp.name.getText
            list.add(new NameExpression(name,alias))
        })
        list
    }

//
//    /**
//     * {@inheritDoc  }
//     *
//     * <p>The default implementation returns the result of calling
//     * {@link #visitChildren} on {@code ctx}.</p>
//     */
//    override def visitWhereClause(ctx: SqlBaseParser.WhereClauseContext): AnyRef = {
//        super.visitWhereClause(ctx)
//    }
//
//    /**
//     * {@inheritDoc  }
//     *
//     * <p>The default implementation returns the result of calling
//     * {@link #visitChildren} on {@code ctx}.</p>
//     */
//    override def visitQuery(ctx: SqlBaseParser.QueryContext): AnyRef =  withOrigin(ctx){
//
//        super.visitQuery(ctx)
//    }
//
//    /**
//     * {@inheritDoc  }
//     *
//     * <p>The default implementation returns the result of calling
//     * {@link #visitChildren} on {@code ctx}.</p>
//     */
//    override def visitAggregationClause(ctx: SqlBaseParser.AggregationClauseContext): AnyRef = {
//        super.visitAggregationClause(ctx)
//    }
//
//    /**
//     * {@inheritDoc  }
//     *
//     * <p>The default implementation returns the result of calling
//     * {@link #visitChildren} on {@code ctx}.</p>
//     */
//    override def visitAssignmentList(ctx: SqlBaseParser.AssignmentListContext): AnyRef = {
//        super.visitAssignmentList(ctx)
//    }
//
//    /**
//     * {@inheritDoc  }
//     *
//     * <p>The default implementation returns the result of calling
//     * {@link #visitChildren} on {@code ctx}.</p>
//     */
//    override def visitAssignment(ctx: SqlBaseParser.AssignmentContext): AnyRef = {
//        super.visitAssignment(ctx)
//    }
}
