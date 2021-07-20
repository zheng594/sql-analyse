package com.zheng.custom
import org.antlr.v4.runtime.tree.{ErrorNode, ParseTree, RuleNode, TerminalNode}


class CustomSqlAstBuilder extends CustomSqlBaseVisitor[AnyRef]{
    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser#   singleStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSingleStatement(ctx: CustomSqlBaseParser.SingleStatementContext): AnyRef = {
        ctx.statement()
    }

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitStatement(ctx: CustomSqlBaseParser.StatementContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# configKey}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitConfigKey(ctx: CustomSqlBaseParser.ConfigKeyContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# configValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitConfigValue(ctx: CustomSqlBaseParser.ConfigValueContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# unsupportedHiveNativeCommands}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitUnsupportedHiveNativeCommands(ctx: CustomSqlBaseParser.UnsupportedHiveNativeCommandsContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# replaceTableHeader}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitReplaceTableHeader(ctx: CustomSqlBaseParser.ReplaceTableHeaderContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# bucketSpec}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitBucketSpec(ctx: CustomSqlBaseParser.BucketSpecContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# skewSpec}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSkewSpec(ctx: CustomSqlBaseParser.SkewSpecContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# locationSpec}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitLocationSpec(ctx: CustomSqlBaseParser.LocationSpecContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# commentSpec}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitCommentSpec(ctx: CustomSqlBaseParser.CommentSpecContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# query}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitQuery(ctx: CustomSqlBaseParser.QueryContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code insertOverwriteTable}
     * labeled alternative in {@link CustomSqlBaseParser# insertInto}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitInsertOverwriteTable(ctx: CustomSqlBaseParser.InsertOverwriteTableContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code insertIntoTable}
     * labeled alternative in {@link CustomSqlBaseParser# insertInto}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitInsertIntoTable(ctx: CustomSqlBaseParser.InsertIntoTableContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code insertOverwriteHiveDir}
     * labeled alternative in {@link CustomSqlBaseParser# insertInto}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitInsertOverwriteHiveDir(ctx: CustomSqlBaseParser.InsertOverwriteHiveDirContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code insertOverwriteDir}
     * labeled alternative in {@link CustomSqlBaseParser# insertInto}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitInsertOverwriteDir(ctx: CustomSqlBaseParser.InsertOverwriteDirContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# partitionSpecLocation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitPartitionSpecLocation(ctx: CustomSqlBaseParser.PartitionSpecLocationContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# partitionSpec}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitPartitionSpec(ctx: CustomSqlBaseParser.PartitionSpecContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# partitionVal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitPartitionVal(ctx: CustomSqlBaseParser.PartitionValContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# namespace}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitNamespace(ctx: CustomSqlBaseParser.NamespaceContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# describeFuncName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitDescribeFuncName(ctx: CustomSqlBaseParser.DescribeFuncNameContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# describeColName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitDescribeColName(ctx: CustomSqlBaseParser.DescribeColNameContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# ctes}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitCtes(ctx: CustomSqlBaseParser.CtesContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# namedQuery}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitNamedQuery(ctx: CustomSqlBaseParser.NamedQueryContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# tableProvider}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitTableProvider(ctx: CustomSqlBaseParser.TableProviderContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# createTableClauses}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitCreateTableClauses(ctx: CustomSqlBaseParser.CreateTableClausesContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# tablePropertyList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitTablePropertyList(ctx: CustomSqlBaseParser.TablePropertyListContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# tableProperty}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitTableProperty(ctx: CustomSqlBaseParser.TablePropertyContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# tablePropertyKey}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitTablePropertyKey(ctx: CustomSqlBaseParser.TablePropertyKeyContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# tablePropertyValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitTablePropertyValue(ctx: CustomSqlBaseParser.TablePropertyValueContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# constantList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitConstantList(ctx: CustomSqlBaseParser.ConstantListContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# nestedConstantList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitNestedConstantList(ctx: CustomSqlBaseParser.NestedConstantListContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# createFileFormat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitCreateFileFormat(ctx: CustomSqlBaseParser.CreateFileFormatContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code tableFileFormat}
     * labeled alternative in {@link CustomSqlBaseParser# fileFormat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitTableFileFormat(ctx: CustomSqlBaseParser.TableFileFormatContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code genericFileFormat}
     * labeled alternative in {@link CustomSqlBaseParser# fileFormat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitGenericFileFormat(ctx: CustomSqlBaseParser.GenericFileFormatContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# storageHandler}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitStorageHandler(ctx: CustomSqlBaseParser.StorageHandlerContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# resource}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitResource(ctx: CustomSqlBaseParser.ResourceContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code singleInsertQuery}
     * labeled alternative in {@link CustomSqlBaseParser# dmlStatementNoWith}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSingleInsertQuery(ctx: CustomSqlBaseParser.SingleInsertQueryContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code multiInsertQuery}
     * labeled alternative in {@link CustomSqlBaseParser# dmlStatementNoWith}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitMultiInsertQuery(ctx: CustomSqlBaseParser.MultiInsertQueryContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code deleteFromTable}
     * labeled alternative in {@link CustomSqlBaseParser# dmlStatementNoWith}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitDeleteFromTable(ctx: CustomSqlBaseParser.DeleteFromTableContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code updateTable}
     * labeled alternative in {@link CustomSqlBaseParser# dmlStatementNoWith}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitUpdateTable(ctx: CustomSqlBaseParser.UpdateTableContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code mergeIntoTable}
     * labeled alternative in {@link CustomSqlBaseParser# dmlStatementNoWith}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitMergeIntoTable(ctx: CustomSqlBaseParser.MergeIntoTableContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# queryOrganization}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitQueryOrganization(ctx: CustomSqlBaseParser.QueryOrganizationContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# multiInsertQueryBody}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitMultiInsertQueryBody(ctx: CustomSqlBaseParser.MultiInsertQueryBodyContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code queryTermDefault}
     * labeled alternative in {@link CustomSqlBaseParser# queryTerm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitQueryTermDefault(ctx: CustomSqlBaseParser.QueryTermDefaultContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code setOperation}
     * labeled alternative in {@link CustomSqlBaseParser# queryTerm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSetOperation(ctx: CustomSqlBaseParser.SetOperationContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code queryPrimaryDefault}
     * labeled alternative in {@link CustomSqlBaseParser# queryPrimary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitQueryPrimaryDefault(ctx: CustomSqlBaseParser.QueryPrimaryDefaultContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code fromStmt}
     * labeled alternative in {@link CustomSqlBaseParser# queryPrimary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitFromStmt(ctx: CustomSqlBaseParser.FromStmtContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code table}
     * labeled alternative in {@link CustomSqlBaseParser# queryPrimary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitTable(ctx: CustomSqlBaseParser.TableContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code inlineTableDefault1}
     * labeled alternative in {@link CustomSqlBaseParser# queryPrimary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitInlineTableDefault1(ctx: CustomSqlBaseParser.InlineTableDefault1Context): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code subquery}
     * labeled alternative in {@link CustomSqlBaseParser# queryPrimary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSubquery(ctx: CustomSqlBaseParser.SubqueryContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# sortItem}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSortItem(ctx: CustomSqlBaseParser.SortItemContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# fromStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitFromStatement(ctx: CustomSqlBaseParser.FromStatementContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# fromStatementBody}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitFromStatementBody(ctx: CustomSqlBaseParser.FromStatementBodyContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code transformQuerySpecification}
     * labeled alternative in {@link CustomSqlBaseParser# querySpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitTransformQuerySpecification(ctx: CustomSqlBaseParser.TransformQuerySpecificationContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code regularQuerySpecification}
     * labeled alternative in {@link CustomSqlBaseParser# querySpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitRegularQuerySpecification(ctx: CustomSqlBaseParser.RegularQuerySpecificationContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# transformClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitTransformClause(ctx: CustomSqlBaseParser.TransformClauseContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# selectClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSelectClause(ctx: CustomSqlBaseParser.SelectClauseContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# setClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSetClause(ctx: CustomSqlBaseParser.SetClauseContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# matchedClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitMatchedClause(ctx: CustomSqlBaseParser.MatchedClauseContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# notMatchedClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitNotMatchedClause(ctx: CustomSqlBaseParser.NotMatchedClauseContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# matchedAction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitMatchedAction(ctx: CustomSqlBaseParser.MatchedActionContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# notMatchedAction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitNotMatchedAction(ctx: CustomSqlBaseParser.NotMatchedActionContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# assignmentList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitAssignmentList(ctx: CustomSqlBaseParser.AssignmentListContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# assignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitAssignment(ctx: CustomSqlBaseParser.AssignmentContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# whereClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitWhereClause(ctx: CustomSqlBaseParser.WhereClauseContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# havingClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitHavingClause(ctx: CustomSqlBaseParser.HavingClauseContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# hint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitHint(ctx: CustomSqlBaseParser.HintContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# hintStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitHintStatement(ctx: CustomSqlBaseParser.HintStatementContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# fromClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitFromClause(ctx: CustomSqlBaseParser.FromClauseContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# aggregationClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitAggregationClause(ctx: CustomSqlBaseParser.AggregationClauseContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# groupByClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitGroupByClause(ctx: CustomSqlBaseParser.GroupByClauseContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# groupingAnalytics}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitGroupingAnalytics(ctx: CustomSqlBaseParser.GroupingAnalyticsContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# groupingElement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitGroupingElement(ctx: CustomSqlBaseParser.GroupingElementContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# groupingSet}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitGroupingSet(ctx: CustomSqlBaseParser.GroupingSetContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# pivotClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitPivotClause(ctx: CustomSqlBaseParser.PivotClauseContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# pivotColumn}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitPivotColumn(ctx: CustomSqlBaseParser.PivotColumnContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# pivotValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitPivotValue(ctx: CustomSqlBaseParser.PivotValueContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# lateralView}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitLateralView(ctx: CustomSqlBaseParser.LateralViewContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# setQuantifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSetQuantifier(ctx: CustomSqlBaseParser.SetQuantifierContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# relation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitRelation(ctx: CustomSqlBaseParser.RelationContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# joinRelation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitJoinRelation(ctx: CustomSqlBaseParser.JoinRelationContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# joinType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitJoinType(ctx: CustomSqlBaseParser.JoinTypeContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# joinCriteria}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitJoinCriteria(ctx: CustomSqlBaseParser.JoinCriteriaContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# sample}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSample(ctx: CustomSqlBaseParser.SampleContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code sampleByPercentile}
     * labeled alternative in {@link CustomSqlBaseParser# sampleMethod}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSampleByPercentile(ctx: CustomSqlBaseParser.SampleByPercentileContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code sampleByRows}
     * labeled alternative in {@link CustomSqlBaseParser# sampleMethod}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSampleByRows(ctx: CustomSqlBaseParser.SampleByRowsContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code sampleByBucket}
     * labeled alternative in {@link CustomSqlBaseParser# sampleMethod}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSampleByBucket(ctx: CustomSqlBaseParser.SampleByBucketContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code sampleByBytes}
     * labeled alternative in {@link CustomSqlBaseParser# sampleMethod}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSampleByBytes(ctx: CustomSqlBaseParser.SampleByBytesContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# identifierList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitIdentifierList(ctx: CustomSqlBaseParser.IdentifierListContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# identifierSeq}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitIdentifierSeq(ctx: CustomSqlBaseParser.IdentifierSeqContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# orderedIdentifierList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitOrderedIdentifierList(ctx: CustomSqlBaseParser.OrderedIdentifierListContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# orderedIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitOrderedIdentifier(ctx: CustomSqlBaseParser.OrderedIdentifierContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# identifierCommentList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitIdentifierCommentList(ctx: CustomSqlBaseParser.IdentifierCommentListContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# identifierComment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitIdentifierComment(ctx: CustomSqlBaseParser.IdentifierCommentContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code tableName}
     * labeled alternative in {@link CustomSqlBaseParser# relationPrimary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitTableName(ctx: CustomSqlBaseParser.TableNameContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code aliasedQuery}
     * labeled alternative in {@link CustomSqlBaseParser# relationPrimary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitAliasedQuery(ctx: CustomSqlBaseParser.AliasedQueryContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code aliasedRelation}
     * labeled alternative in {@link CustomSqlBaseParser# relationPrimary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitAliasedRelation(ctx: CustomSqlBaseParser.AliasedRelationContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code inlineTableDefault2}
     * labeled alternative in {@link CustomSqlBaseParser# relationPrimary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitInlineTableDefault2(ctx: CustomSqlBaseParser.InlineTableDefault2Context): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code tableValuedFunction}
     * labeled alternative in {@link CustomSqlBaseParser# relationPrimary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitTableValuedFunction(ctx: CustomSqlBaseParser.TableValuedFunctionContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# inlineTable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitInlineTable(ctx: CustomSqlBaseParser.InlineTableContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# functionTable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitFunctionTable(ctx: CustomSqlBaseParser.FunctionTableContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# tableAlias}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitTableAlias(ctx: CustomSqlBaseParser.TableAliasContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code rowFormatSerde}
     * labeled alternative in {@link CustomSqlBaseParser# rowFormat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitRowFormatSerde(ctx: CustomSqlBaseParser.RowFormatSerdeContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code rowFormatDelimited}
     * labeled alternative in {@link CustomSqlBaseParser# rowFormat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitRowFormatDelimited(ctx: CustomSqlBaseParser.RowFormatDelimitedContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# multipartIdentifierList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitMultipartIdentifierList(ctx: CustomSqlBaseParser.MultipartIdentifierListContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# multipartIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitMultipartIdentifier(ctx: CustomSqlBaseParser.MultipartIdentifierContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# tableIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitTableIdentifier(ctx: CustomSqlBaseParser.TableIdentifierContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# functionIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitFunctionIdentifier(ctx: CustomSqlBaseParser.FunctionIdentifierContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# namedExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitNamedExpression(ctx: CustomSqlBaseParser.NamedExpressionContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# namedExpressionSeq}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitNamedExpressionSeq(ctx: CustomSqlBaseParser.NamedExpressionSeqContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# partitionFieldList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitPartitionFieldList(ctx: CustomSqlBaseParser.PartitionFieldListContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code partitionTransform}
     * labeled alternative in {@link CustomSqlBaseParser# partitionField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitPartitionTransform(ctx: CustomSqlBaseParser.PartitionTransformContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code partitionColumn}
     * labeled alternative in {@link CustomSqlBaseParser# partitionField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitPartitionColumn(ctx: CustomSqlBaseParser.PartitionColumnContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code identityTransform}
     * labeled alternative in {@link CustomSqlBaseParser# transform}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitIdentityTransform(ctx: CustomSqlBaseParser.IdentityTransformContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code applyTransform}
     * labeled alternative in {@link CustomSqlBaseParser# transform}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitApplyTransform(ctx: CustomSqlBaseParser.ApplyTransformContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# transformArgument}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitTransformArgument(ctx: CustomSqlBaseParser.TransformArgumentContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitExpression(ctx: CustomSqlBaseParser.ExpressionContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# expressionSeq}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitExpressionSeq(ctx: CustomSqlBaseParser.ExpressionSeqContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code logicalNot}
     * labeled alternative in {@link CustomSqlBaseParser# booleanExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitLogicalNot(ctx: CustomSqlBaseParser.LogicalNotContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code predicated}
     * labeled alternative in {@link CustomSqlBaseParser# booleanExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitPredicated(ctx: CustomSqlBaseParser.PredicatedContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code exists}
     * labeled alternative in {@link CustomSqlBaseParser# booleanExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitExists(ctx: CustomSqlBaseParser.ExistsContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code logicalBinary}
     * labeled alternative in {@link CustomSqlBaseParser# booleanExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitLogicalBinary(ctx: CustomSqlBaseParser.LogicalBinaryContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# predicate}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitPredicate(ctx: CustomSqlBaseParser.PredicateContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code valueExpressionDefault}
     * labeled alternative in {@link CustomSqlBaseParser# valueExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitValueExpressionDefault(ctx: CustomSqlBaseParser.ValueExpressionDefaultContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code comparison}
     * labeled alternative in {@link CustomSqlBaseParser# valueExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitComparison(ctx: CustomSqlBaseParser.ComparisonContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code arithmeticBinary}
     * labeled alternative in {@link CustomSqlBaseParser# valueExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitArithmeticBinary(ctx: CustomSqlBaseParser.ArithmeticBinaryContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code arithmeticUnary}
     * labeled alternative in {@link CustomSqlBaseParser# valueExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitArithmeticUnary(ctx: CustomSqlBaseParser.ArithmeticUnaryContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code struct}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitStruct(ctx: CustomSqlBaseParser.StructContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code dereference}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitDereference(ctx: CustomSqlBaseParser.DereferenceContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code simpleCase}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSimpleCase(ctx: CustomSqlBaseParser.SimpleCaseContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code columnReference}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitColumnReference(ctx: CustomSqlBaseParser.ColumnReferenceContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code rowConstructor}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitRowConstructor(ctx: CustomSqlBaseParser.RowConstructorContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code last}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitLast(ctx: CustomSqlBaseParser.LastContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code star}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitStar(ctx: CustomSqlBaseParser.StarContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code overlay}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitOverlay(ctx: CustomSqlBaseParser.OverlayContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code subscript}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSubscript(ctx: CustomSqlBaseParser.SubscriptContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code subqueryExpression}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSubqueryExpression(ctx: CustomSqlBaseParser.SubqueryExpressionContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code substring}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSubstring(ctx: CustomSqlBaseParser.SubstringContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code currentDatetime}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitCurrentDatetime(ctx: CustomSqlBaseParser.CurrentDatetimeContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code cast}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitCast(ctx: CustomSqlBaseParser.CastContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code constantDefault}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitConstantDefault(ctx: CustomSqlBaseParser.ConstantDefaultContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code lambda}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitLambda(ctx: CustomSqlBaseParser.LambdaContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code parenthesizedExpression}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitParenthesizedExpression(ctx: CustomSqlBaseParser.ParenthesizedExpressionContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code extract}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitExtract(ctx: CustomSqlBaseParser.ExtractContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code trim}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitTrim(ctx: CustomSqlBaseParser.TrimContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code functionCall}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitFunctionCall(ctx: CustomSqlBaseParser.FunctionCallContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code searchedCase}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSearchedCase(ctx: CustomSqlBaseParser.SearchedCaseContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code position}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitPosition(ctx: CustomSqlBaseParser.PositionContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code first}
     * labeled alternative in {@link CustomSqlBaseParser# primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitFirst(ctx: CustomSqlBaseParser.FirstContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code nullLiteral}
     * labeled alternative in {@link CustomSqlBaseParser# constant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitNullLiteral(ctx: CustomSqlBaseParser.NullLiteralContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code intervalLiteral}
     * labeled alternative in {@link CustomSqlBaseParser# constant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitIntervalLiteral(ctx: CustomSqlBaseParser.IntervalLiteralContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code typeConstructor}
     * labeled alternative in {@link CustomSqlBaseParser# constant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitTypeConstructor(ctx: CustomSqlBaseParser.TypeConstructorContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code numericLiteral}
     * labeled alternative in {@link CustomSqlBaseParser# constant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitNumericLiteral(ctx: CustomSqlBaseParser.NumericLiteralContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code booleanLiteral}
     * labeled alternative in {@link CustomSqlBaseParser# constant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitBooleanLiteral(ctx: CustomSqlBaseParser.BooleanLiteralContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code stringLiteral}
     * labeled alternative in {@link CustomSqlBaseParser# constant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitStringLiteral(ctx: CustomSqlBaseParser.StringLiteralContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# comparisonOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitComparisonOperator(ctx: CustomSqlBaseParser.ComparisonOperatorContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# arithmeticOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitArithmeticOperator(ctx: CustomSqlBaseParser.ArithmeticOperatorContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# predicateOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitPredicateOperator(ctx: CustomSqlBaseParser.PredicateOperatorContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# booleanValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitBooleanValue(ctx: CustomSqlBaseParser.BooleanValueContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# interval}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitInterval(ctx: CustomSqlBaseParser.IntervalContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# errorCapturingMultiUnitsInterval}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitErrorCapturingMultiUnitsInterval(ctx: CustomSqlBaseParser.ErrorCapturingMultiUnitsIntervalContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# multiUnitsInterval}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitMultiUnitsInterval(ctx: CustomSqlBaseParser.MultiUnitsIntervalContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# errorCapturingUnitToUnitInterval}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitErrorCapturingUnitToUnitInterval(ctx: CustomSqlBaseParser.ErrorCapturingUnitToUnitIntervalContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# unitToUnitInterval}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitUnitToUnitInterval(ctx: CustomSqlBaseParser.UnitToUnitIntervalContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# intervalValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitIntervalValue(ctx: CustomSqlBaseParser.IntervalValueContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# colPosition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitColPosition(ctx: CustomSqlBaseParser.ColPositionContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code complexDataType}
     * labeled alternative in {@link CustomSqlBaseParser# dataType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitComplexDataType(ctx: CustomSqlBaseParser.ComplexDataTypeContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code yearMonthIntervalDataType}
     * labeled alternative in {@link CustomSqlBaseParser# dataType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitYearMonthIntervalDataType(ctx: CustomSqlBaseParser.YearMonthIntervalDataTypeContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code dayTimeIntervalDataType}
     * labeled alternative in {@link CustomSqlBaseParser# dataType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitDayTimeIntervalDataType(ctx: CustomSqlBaseParser.DayTimeIntervalDataTypeContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code primitiveDataType}
     * labeled alternative in {@link CustomSqlBaseParser# dataType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitPrimitiveDataType(ctx: CustomSqlBaseParser.PrimitiveDataTypeContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# qualifiedColTypeWithPositionList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitQualifiedColTypeWithPositionList(ctx: CustomSqlBaseParser.QualifiedColTypeWithPositionListContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# qualifiedColTypeWithPosition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitQualifiedColTypeWithPosition(ctx: CustomSqlBaseParser.QualifiedColTypeWithPositionContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# colTypeList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitColTypeList(ctx: CustomSqlBaseParser.ColTypeListContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# colType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitColType(ctx: CustomSqlBaseParser.ColTypeContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# complexColTypeList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitComplexColTypeList(ctx: CustomSqlBaseParser.ComplexColTypeListContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# complexColType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitComplexColType(ctx: CustomSqlBaseParser.ComplexColTypeContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# whenClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitWhenClause(ctx: CustomSqlBaseParser.WhenClauseContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# windowClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitWindowClause(ctx: CustomSqlBaseParser.WindowClauseContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# namedWindow}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitNamedWindow(ctx: CustomSqlBaseParser.NamedWindowContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code windowRef}
     * labeled alternative in {@link CustomSqlBaseParser# windowSpec}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitWindowRef(ctx: CustomSqlBaseParser.WindowRefContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code windowDef}
     * labeled alternative in {@link CustomSqlBaseParser# windowSpec}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitWindowDef(ctx: CustomSqlBaseParser.WindowDefContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# windowFrame}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitWindowFrame(ctx: CustomSqlBaseParser.WindowFrameContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# frameBound}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitFrameBound(ctx: CustomSqlBaseParser.FrameBoundContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# qualifiedNameList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitQualifiedNameList(ctx: CustomSqlBaseParser.QualifiedNameListContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# functionName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitFunctionName(ctx: CustomSqlBaseParser.FunctionNameContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# qualifiedName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitQualifiedName(ctx: CustomSqlBaseParser.QualifiedNameContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# errorCapturingIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitErrorCapturingIdentifier(ctx: CustomSqlBaseParser.ErrorCapturingIdentifierContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code errorIdent}
     * labeled alternative in {@link CustomSqlBaseParser# errorCapturingIdentifierExtra}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitErrorIdent(ctx: CustomSqlBaseParser.ErrorIdentContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code realIdent}
     * labeled alternative in {@link CustomSqlBaseParser# errorCapturingIdentifierExtra}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitRealIdent(ctx: CustomSqlBaseParser.RealIdentContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# identifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitIdentifier(ctx: CustomSqlBaseParser.IdentifierContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code unquotedIdentifier}
     * labeled alternative in {@link CustomSqlBaseParser# strictIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitUnquotedIdentifier(ctx: CustomSqlBaseParser.UnquotedIdentifierContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
     * labeled alternative in {@link CustomSqlBaseParser# strictIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitQuotedIdentifierAlternative(ctx: CustomSqlBaseParser.QuotedIdentifierAlternativeContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# quotedIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitQuotedIdentifier(ctx: CustomSqlBaseParser.QuotedIdentifierContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code exponentLiteral}
     * labeled alternative in {@link CustomSqlBaseParser# number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitExponentLiteral(ctx: CustomSqlBaseParser.ExponentLiteralContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code decimalLiteral}
     * labeled alternative in {@link CustomSqlBaseParser# number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitDecimalLiteral(ctx: CustomSqlBaseParser.DecimalLiteralContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code legacyDecimalLiteral}
     * labeled alternative in {@link CustomSqlBaseParser# number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitLegacyDecimalLiteral(ctx: CustomSqlBaseParser.LegacyDecimalLiteralContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code integerLiteral}
     * labeled alternative in {@link CustomSqlBaseParser# number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitIntegerLiteral(ctx: CustomSqlBaseParser.IntegerLiteralContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code bigIntLiteral}
     * labeled alternative in {@link CustomSqlBaseParser# number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitBigIntLiteral(ctx: CustomSqlBaseParser.BigIntLiteralContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code smallIntLiteral}
     * labeled alternative in {@link CustomSqlBaseParser# number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitSmallIntLiteral(ctx: CustomSqlBaseParser.SmallIntLiteralContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code tinyIntLiteral}
     * labeled alternative in {@link CustomSqlBaseParser# number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitTinyIntLiteral(ctx: CustomSqlBaseParser.TinyIntLiteralContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code doubleLiteral}
     * labeled alternative in {@link CustomSqlBaseParser# number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitDoubleLiteral(ctx: CustomSqlBaseParser.DoubleLiteralContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code floatLiteral}
     * labeled alternative in {@link CustomSqlBaseParser# number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitFloatLiteral(ctx: CustomSqlBaseParser.FloatLiteralContext): AnyRef = ???

    /**
     * Visit a parse tree produced by the {@code bigDecimalLiteral}
     * labeled alternative in {@link CustomSqlBaseParser# number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitBigDecimalLiteral(ctx: CustomSqlBaseParser.BigDecimalLiteralContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# alterColumnAction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitAlterColumnAction(ctx: CustomSqlBaseParser.AlterColumnActionContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# ansiNonReserved}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitAnsiNonReserved(ctx: CustomSqlBaseParser.AnsiNonReservedContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# strictNonReserved}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitStrictNonReserved(ctx: CustomSqlBaseParser.StrictNonReservedContext): AnyRef = ???

    /**
     * Visit a parse tree produced by {@link CustomSqlBaseParser# nonReserved}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    override def visitNonReserved(ctx: CustomSqlBaseParser.NonReservedContext): AnyRef = ???

    override def visit(parseTree: ParseTree): AnyRef = ???

    override def visitChildren(ruleNode: RuleNode): AnyRef = ???

    override def visitTerminal(terminalNode: TerminalNode): AnyRef = ???

    override def visitErrorNode(errorNode: ErrorNode): AnyRef = ???
}