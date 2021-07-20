// Generated from /Users/zheng/project/sql-analyse/src/main/java/com/zheng/custom/CustomSqlBase.g4 by ANTLR 4.9.1
package com.zheng.custom;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CustomSqlBaseParser}.
 */
public interface CustomSqlBaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(CustomSqlBaseParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(CustomSqlBaseParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CustomSqlBaseParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CustomSqlBaseParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#configKey}.
	 * @param ctx the parse tree
	 */
	void enterConfigKey(CustomSqlBaseParser.ConfigKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#configKey}.
	 * @param ctx the parse tree
	 */
	void exitConfigKey(CustomSqlBaseParser.ConfigKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#configValue}.
	 * @param ctx the parse tree
	 */
	void enterConfigValue(CustomSqlBaseParser.ConfigValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#configValue}.
	 * @param ctx the parse tree
	 */
	void exitConfigValue(CustomSqlBaseParser.ConfigValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void enterUnsupportedHiveNativeCommands(CustomSqlBaseParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void exitUnsupportedHiveNativeCommands(CustomSqlBaseParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterReplaceTableHeader(CustomSqlBaseParser.ReplaceTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitReplaceTableHeader(CustomSqlBaseParser.ReplaceTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void enterBucketSpec(CustomSqlBaseParser.BucketSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void exitBucketSpec(CustomSqlBaseParser.BucketSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void enterSkewSpec(CustomSqlBaseParser.SkewSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void exitSkewSpec(CustomSqlBaseParser.SkewSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocationSpec(CustomSqlBaseParser.LocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocationSpec(CustomSqlBaseParser.LocationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void enterCommentSpec(CustomSqlBaseParser.CommentSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void exitCommentSpec(CustomSqlBaseParser.CommentSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(CustomSqlBaseParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(CustomSqlBaseParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link CustomSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteTable(CustomSqlBaseParser.InsertOverwriteTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link CustomSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteTable(CustomSqlBaseParser.InsertOverwriteTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link CustomSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoTable(CustomSqlBaseParser.InsertIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link CustomSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoTable(CustomSqlBaseParser.InsertIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link CustomSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteHiveDir(CustomSqlBaseParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link CustomSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteHiveDir(CustomSqlBaseParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link CustomSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteDir(CustomSqlBaseParser.InsertOverwriteDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link CustomSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteDir(CustomSqlBaseParser.InsertOverwriteDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpecLocation(CustomSqlBaseParser.PartitionSpecLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpecLocation(CustomSqlBaseParser.PartitionSpecLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(CustomSqlBaseParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(CustomSqlBaseParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void enterPartitionVal(CustomSqlBaseParser.PartitionValContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void exitPartitionVal(CustomSqlBaseParser.PartitionValContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(CustomSqlBaseParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(CustomSqlBaseParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFuncName(CustomSqlBaseParser.DescribeFuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFuncName(CustomSqlBaseParser.DescribeFuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeColName(CustomSqlBaseParser.DescribeColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeColName(CustomSqlBaseParser.DescribeColNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterCtes(CustomSqlBaseParser.CtesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitCtes(CustomSqlBaseParser.CtesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(CustomSqlBaseParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(CustomSqlBaseParser.NamedQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void enterTableProvider(CustomSqlBaseParser.TableProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void exitTableProvider(CustomSqlBaseParser.TableProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#createTableClauses}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableClauses(CustomSqlBaseParser.CreateTableClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#createTableClauses}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableClauses(CustomSqlBaseParser.CreateTableClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(CustomSqlBaseParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(CustomSqlBaseParser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(CustomSqlBaseParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(CustomSqlBaseParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(CustomSqlBaseParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(CustomSqlBaseParser.TablePropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(CustomSqlBaseParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(CustomSqlBaseParser.TablePropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(CustomSqlBaseParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(CustomSqlBaseParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void enterNestedConstantList(CustomSqlBaseParser.NestedConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void exitNestedConstantList(CustomSqlBaseParser.NestedConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void enterCreateFileFormat(CustomSqlBaseParser.CreateFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void exitCreateFileFormat(CustomSqlBaseParser.CreateFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link CustomSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterTableFileFormat(CustomSqlBaseParser.TableFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link CustomSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitTableFileFormat(CustomSqlBaseParser.TableFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link CustomSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterGenericFileFormat(CustomSqlBaseParser.GenericFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link CustomSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitGenericFileFormat(CustomSqlBaseParser.GenericFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void enterStorageHandler(CustomSqlBaseParser.StorageHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void exitStorageHandler(CustomSqlBaseParser.StorageHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(CustomSqlBaseParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(CustomSqlBaseParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link CustomSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleInsertQuery(CustomSqlBaseParser.SingleInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link CustomSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleInsertQuery(CustomSqlBaseParser.SingleInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link CustomSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQuery(CustomSqlBaseParser.MultiInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link CustomSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQuery(CustomSqlBaseParser.MultiInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link CustomSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterDeleteFromTable(CustomSqlBaseParser.DeleteFromTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link CustomSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitDeleteFromTable(CustomSqlBaseParser.DeleteFromTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link CustomSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterUpdateTable(CustomSqlBaseParser.UpdateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link CustomSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitUpdateTable(CustomSqlBaseParser.UpdateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link CustomSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMergeIntoTable(CustomSqlBaseParser.MergeIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link CustomSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMergeIntoTable(CustomSqlBaseParser.MergeIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(CustomSqlBaseParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(CustomSqlBaseParser.QueryOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQueryBody(CustomSqlBaseParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQueryBody(CustomSqlBaseParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link CustomSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(CustomSqlBaseParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link CustomSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(CustomSqlBaseParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link CustomSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(CustomSqlBaseParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link CustomSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(CustomSqlBaseParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link CustomSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(CustomSqlBaseParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link CustomSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(CustomSqlBaseParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link CustomSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterFromStmt(CustomSqlBaseParser.FromStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link CustomSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitFromStmt(CustomSqlBaseParser.FromStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link CustomSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(CustomSqlBaseParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link CustomSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(CustomSqlBaseParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link CustomSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault1(CustomSqlBaseParser.InlineTableDefault1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link CustomSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault1(CustomSqlBaseParser.InlineTableDefault1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link CustomSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(CustomSqlBaseParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link CustomSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(CustomSqlBaseParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(CustomSqlBaseParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(CustomSqlBaseParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#fromStatement}.
	 * @param ctx the parse tree
	 */
	void enterFromStatement(CustomSqlBaseParser.FromStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#fromStatement}.
	 * @param ctx the parse tree
	 */
	void exitFromStatement(CustomSqlBaseParser.FromStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#fromStatementBody}.
	 * @param ctx the parse tree
	 */
	void enterFromStatementBody(CustomSqlBaseParser.FromStatementBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#fromStatementBody}.
	 * @param ctx the parse tree
	 */
	void exitFromStatementBody(CustomSqlBaseParser.FromStatementBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code transformQuerySpecification}
	 * labeled alternative in {@link CustomSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterTransformQuerySpecification(CustomSqlBaseParser.TransformQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code transformQuerySpecification}
	 * labeled alternative in {@link CustomSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitTransformQuerySpecification(CustomSqlBaseParser.TransformQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link CustomSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterRegularQuerySpecification(CustomSqlBaseParser.RegularQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link CustomSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitRegularQuerySpecification(CustomSqlBaseParser.RegularQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#transformClause}.
	 * @param ctx the parse tree
	 */
	void enterTransformClause(CustomSqlBaseParser.TransformClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#transformClause}.
	 * @param ctx the parse tree
	 */
	void exitTransformClause(CustomSqlBaseParser.TransformClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(CustomSqlBaseParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(CustomSqlBaseParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#setClause}.
	 * @param ctx the parse tree
	 */
	void enterSetClause(CustomSqlBaseParser.SetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#setClause}.
	 * @param ctx the parse tree
	 */
	void exitSetClause(CustomSqlBaseParser.SetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#matchedClause}.
	 * @param ctx the parse tree
	 */
	void enterMatchedClause(CustomSqlBaseParser.MatchedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#matchedClause}.
	 * @param ctx the parse tree
	 */
	void exitMatchedClause(CustomSqlBaseParser.MatchedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#notMatchedClause}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedClause(CustomSqlBaseParser.NotMatchedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#notMatchedClause}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedClause(CustomSqlBaseParser.NotMatchedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#matchedAction}.
	 * @param ctx the parse tree
	 */
	void enterMatchedAction(CustomSqlBaseParser.MatchedActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#matchedAction}.
	 * @param ctx the parse tree
	 */
	void exitMatchedAction(CustomSqlBaseParser.MatchedActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#notMatchedAction}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedAction(CustomSqlBaseParser.NotMatchedActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#notMatchedAction}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedAction(CustomSqlBaseParser.NotMatchedActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(CustomSqlBaseParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(CustomSqlBaseParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CustomSqlBaseParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CustomSqlBaseParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(CustomSqlBaseParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(CustomSqlBaseParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(CustomSqlBaseParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(CustomSqlBaseParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#hint}.
	 * @param ctx the parse tree
	 */
	void enterHint(CustomSqlBaseParser.HintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#hint}.
	 * @param ctx the parse tree
	 */
	void exitHint(CustomSqlBaseParser.HintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void enterHintStatement(CustomSqlBaseParser.HintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void exitHintStatement(CustomSqlBaseParser.HintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(CustomSqlBaseParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(CustomSqlBaseParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#aggregationClause}.
	 * @param ctx the parse tree
	 */
	void enterAggregationClause(CustomSqlBaseParser.AggregationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#aggregationClause}.
	 * @param ctx the parse tree
	 */
	void exitAggregationClause(CustomSqlBaseParser.AggregationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(CustomSqlBaseParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(CustomSqlBaseParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#groupingAnalytics}.
	 * @param ctx the parse tree
	 */
	void enterGroupingAnalytics(CustomSqlBaseParser.GroupingAnalyticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#groupingAnalytics}.
	 * @param ctx the parse tree
	 */
	void exitGroupingAnalytics(CustomSqlBaseParser.GroupingAnalyticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void enterGroupingElement(CustomSqlBaseParser.GroupingElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void exitGroupingElement(CustomSqlBaseParser.GroupingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(CustomSqlBaseParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(CustomSqlBaseParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void enterPivotClause(CustomSqlBaseParser.PivotClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void exitPivotClause(CustomSqlBaseParser.PivotClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#pivotColumn}.
	 * @param ctx the parse tree
	 */
	void enterPivotColumn(CustomSqlBaseParser.PivotColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#pivotColumn}.
	 * @param ctx the parse tree
	 */
	void exitPivotColumn(CustomSqlBaseParser.PivotColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#pivotValue}.
	 * @param ctx the parse tree
	 */
	void enterPivotValue(CustomSqlBaseParser.PivotValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#pivotValue}.
	 * @param ctx the parse tree
	 */
	void exitPivotValue(CustomSqlBaseParser.PivotValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void enterLateralView(CustomSqlBaseParser.LateralViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void exitLateralView(CustomSqlBaseParser.LateralViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(CustomSqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(CustomSqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(CustomSqlBaseParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(CustomSqlBaseParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(CustomSqlBaseParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(CustomSqlBaseParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(CustomSqlBaseParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(CustomSqlBaseParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(CustomSqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(CustomSqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(CustomSqlBaseParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(CustomSqlBaseParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link CustomSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByPercentile(CustomSqlBaseParser.SampleByPercentileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link CustomSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByPercentile(CustomSqlBaseParser.SampleByPercentileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link CustomSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByRows(CustomSqlBaseParser.SampleByRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link CustomSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByRows(CustomSqlBaseParser.SampleByRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link CustomSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBucket(CustomSqlBaseParser.SampleByBucketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link CustomSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBucket(CustomSqlBaseParser.SampleByBucketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link CustomSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBytes(CustomSqlBaseParser.SampleByBytesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link CustomSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBytes(CustomSqlBaseParser.SampleByBytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(CustomSqlBaseParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(CustomSqlBaseParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(CustomSqlBaseParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(CustomSqlBaseParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifierList(CustomSqlBaseParser.OrderedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifierList(CustomSqlBaseParser.OrderedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifier(CustomSqlBaseParser.OrderedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifier(CustomSqlBaseParser.OrderedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCommentList(CustomSqlBaseParser.IdentifierCommentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCommentList(CustomSqlBaseParser.IdentifierCommentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierComment(CustomSqlBaseParser.IdentifierCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierComment(CustomSqlBaseParser.IdentifierCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link CustomSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(CustomSqlBaseParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link CustomSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(CustomSqlBaseParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link CustomSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(CustomSqlBaseParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link CustomSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(CustomSqlBaseParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link CustomSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(CustomSqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link CustomSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(CustomSqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link CustomSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault2(CustomSqlBaseParser.InlineTableDefault2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link CustomSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault2(CustomSqlBaseParser.InlineTableDefault2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link CustomSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableValuedFunction(CustomSqlBaseParser.TableValuedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link CustomSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableValuedFunction(CustomSqlBaseParser.TableValuedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(CustomSqlBaseParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(CustomSqlBaseParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTable(CustomSqlBaseParser.FunctionTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTable(CustomSqlBaseParser.FunctionTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(CustomSqlBaseParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(CustomSqlBaseParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link CustomSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatSerde(CustomSqlBaseParser.RowFormatSerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link CustomSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatSerde(CustomSqlBaseParser.RowFormatSerdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link CustomSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatDelimited(CustomSqlBaseParser.RowFormatDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link CustomSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatDelimited(CustomSqlBaseParser.RowFormatDelimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#multipartIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifierList(CustomSqlBaseParser.MultipartIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#multipartIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifierList(CustomSqlBaseParser.MultipartIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifier(CustomSqlBaseParser.MultipartIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifier(CustomSqlBaseParser.MultipartIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(CustomSqlBaseParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(CustomSqlBaseParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(CustomSqlBaseParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(CustomSqlBaseParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(CustomSqlBaseParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(CustomSqlBaseParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(CustomSqlBaseParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(CustomSqlBaseParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#partitionFieldList}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFieldList(CustomSqlBaseParser.PartitionFieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#partitionFieldList}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFieldList(CustomSqlBaseParser.PartitionFieldListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionTransform}
	 * labeled alternative in {@link CustomSqlBaseParser#partitionField}.
	 * @param ctx the parse tree
	 */
	void enterPartitionTransform(CustomSqlBaseParser.PartitionTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionTransform}
	 * labeled alternative in {@link CustomSqlBaseParser#partitionField}.
	 * @param ctx the parse tree
	 */
	void exitPartitionTransform(CustomSqlBaseParser.PartitionTransformContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionColumn}
	 * labeled alternative in {@link CustomSqlBaseParser#partitionField}.
	 * @param ctx the parse tree
	 */
	void enterPartitionColumn(CustomSqlBaseParser.PartitionColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionColumn}
	 * labeled alternative in {@link CustomSqlBaseParser#partitionField}.
	 * @param ctx the parse tree
	 */
	void exitPartitionColumn(CustomSqlBaseParser.PartitionColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link CustomSqlBaseParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterIdentityTransform(CustomSqlBaseParser.IdentityTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link CustomSqlBaseParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitIdentityTransform(CustomSqlBaseParser.IdentityTransformContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link CustomSqlBaseParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterApplyTransform(CustomSqlBaseParser.ApplyTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link CustomSqlBaseParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitApplyTransform(CustomSqlBaseParser.ApplyTransformContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#transformArgument}.
	 * @param ctx the parse tree
	 */
	void enterTransformArgument(CustomSqlBaseParser.TransformArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#transformArgument}.
	 * @param ctx the parse tree
	 */
	void exitTransformArgument(CustomSqlBaseParser.TransformArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CustomSqlBaseParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CustomSqlBaseParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#expressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSeq(CustomSqlBaseParser.ExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#expressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSeq(CustomSqlBaseParser.ExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link CustomSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(CustomSqlBaseParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link CustomSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(CustomSqlBaseParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link CustomSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(CustomSqlBaseParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link CustomSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(CustomSqlBaseParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link CustomSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(CustomSqlBaseParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link CustomSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(CustomSqlBaseParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link CustomSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(CustomSqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link CustomSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(CustomSqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(CustomSqlBaseParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(CustomSqlBaseParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link CustomSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(CustomSqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link CustomSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(CustomSqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link CustomSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(CustomSqlBaseParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link CustomSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(CustomSqlBaseParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link CustomSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(CustomSqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link CustomSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(CustomSqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link CustomSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(CustomSqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link CustomSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(CustomSqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code struct}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStruct(CustomSqlBaseParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStruct(CustomSqlBaseParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(CustomSqlBaseParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(CustomSqlBaseParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(CustomSqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(CustomSqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(CustomSqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(CustomSqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(CustomSqlBaseParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(CustomSqlBaseParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code last}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLast(CustomSqlBaseParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code last}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLast(CustomSqlBaseParser.LastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(CustomSqlBaseParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(CustomSqlBaseParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterOverlay(CustomSqlBaseParser.OverlayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitOverlay(CustomSqlBaseParser.OverlayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(CustomSqlBaseParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(CustomSqlBaseParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(CustomSqlBaseParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(CustomSqlBaseParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substring}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubstring(CustomSqlBaseParser.SubstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substring}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubstring(CustomSqlBaseParser.SubstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentDatetime}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentDatetime(CustomSqlBaseParser.CurrentDatetimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentDatetime}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentDatetime(CustomSqlBaseParser.CurrentDatetimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(CustomSqlBaseParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(CustomSqlBaseParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(CustomSqlBaseParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(CustomSqlBaseParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambda(CustomSqlBaseParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambda(CustomSqlBaseParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(CustomSqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(CustomSqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extract}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExtract(CustomSqlBaseParser.ExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExtract(CustomSqlBaseParser.ExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trim}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTrim(CustomSqlBaseParser.TrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trim}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTrim(CustomSqlBaseParser.TrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CustomSqlBaseParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CustomSqlBaseParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(CustomSqlBaseParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(CustomSqlBaseParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPosition(CustomSqlBaseParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPosition(CustomSqlBaseParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code first}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFirst(CustomSqlBaseParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code first}
	 * labeled alternative in {@link CustomSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFirst(CustomSqlBaseParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(CustomSqlBaseParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(CustomSqlBaseParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(CustomSqlBaseParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(CustomSqlBaseParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link CustomSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(CustomSqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link CustomSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(CustomSqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(CustomSqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(CustomSqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(CustomSqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(CustomSqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(CustomSqlBaseParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(CustomSqlBaseParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(CustomSqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(CustomSqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(CustomSqlBaseParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(CustomSqlBaseParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(CustomSqlBaseParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(CustomSqlBaseParser.PredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(CustomSqlBaseParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(CustomSqlBaseParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(CustomSqlBaseParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(CustomSqlBaseParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingMultiUnitsInterval(CustomSqlBaseParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingMultiUnitsInterval(CustomSqlBaseParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void enterMultiUnitsInterval(CustomSqlBaseParser.MultiUnitsIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void exitMultiUnitsInterval(CustomSqlBaseParser.MultiUnitsIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingUnitToUnitInterval(CustomSqlBaseParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingUnitToUnitInterval(CustomSqlBaseParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void enterUnitToUnitInterval(CustomSqlBaseParser.UnitToUnitIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void exitUnitToUnitInterval(CustomSqlBaseParser.UnitToUnitIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(CustomSqlBaseParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(CustomSqlBaseParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void enterColPosition(CustomSqlBaseParser.ColPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void exitColPosition(CustomSqlBaseParser.ColPositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link CustomSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(CustomSqlBaseParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link CustomSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(CustomSqlBaseParser.ComplexDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code yearMonthIntervalDataType}
	 * labeled alternative in {@link CustomSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterYearMonthIntervalDataType(CustomSqlBaseParser.YearMonthIntervalDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code yearMonthIntervalDataType}
	 * labeled alternative in {@link CustomSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitYearMonthIntervalDataType(CustomSqlBaseParser.YearMonthIntervalDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dayTimeIntervalDataType}
	 * labeled alternative in {@link CustomSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDayTimeIntervalDataType(CustomSqlBaseParser.DayTimeIntervalDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dayTimeIntervalDataType}
	 * labeled alternative in {@link CustomSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDayTimeIntervalDataType(CustomSqlBaseParser.DayTimeIntervalDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link CustomSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(CustomSqlBaseParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link CustomSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(CustomSqlBaseParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#qualifiedColTypeWithPositionList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedColTypeWithPositionList(CustomSqlBaseParser.QualifiedColTypeWithPositionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#qualifiedColTypeWithPositionList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedColTypeWithPositionList(CustomSqlBaseParser.QualifiedColTypeWithPositionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#qualifiedColTypeWithPosition}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedColTypeWithPosition(CustomSqlBaseParser.QualifiedColTypeWithPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#qualifiedColTypeWithPosition}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedColTypeWithPosition(CustomSqlBaseParser.QualifiedColTypeWithPositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(CustomSqlBaseParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(CustomSqlBaseParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(CustomSqlBaseParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(CustomSqlBaseParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void enterComplexColTypeList(CustomSqlBaseParser.ComplexColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void exitComplexColTypeList(CustomSqlBaseParser.ComplexColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void enterComplexColType(CustomSqlBaseParser.ComplexColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void exitComplexColType(CustomSqlBaseParser.ComplexColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(CustomSqlBaseParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(CustomSqlBaseParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(CustomSqlBaseParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(CustomSqlBaseParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(CustomSqlBaseParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(CustomSqlBaseParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link CustomSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowRef(CustomSqlBaseParser.WindowRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link CustomSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowRef(CustomSqlBaseParser.WindowRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link CustomSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowDef(CustomSqlBaseParser.WindowDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link CustomSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowDef(CustomSqlBaseParser.WindowDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(CustomSqlBaseParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(CustomSqlBaseParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(CustomSqlBaseParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(CustomSqlBaseParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(CustomSqlBaseParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(CustomSqlBaseParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(CustomSqlBaseParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(CustomSqlBaseParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(CustomSqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(CustomSqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingIdentifier(CustomSqlBaseParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingIdentifier(CustomSqlBaseParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link CustomSqlBaseParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterErrorIdent(CustomSqlBaseParser.ErrorIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link CustomSqlBaseParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitErrorIdent(CustomSqlBaseParser.ErrorIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link CustomSqlBaseParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterRealIdent(CustomSqlBaseParser.RealIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link CustomSqlBaseParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitRealIdent(CustomSqlBaseParser.RealIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CustomSqlBaseParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CustomSqlBaseParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link CustomSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(CustomSqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link CustomSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(CustomSqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link CustomSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(CustomSqlBaseParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link CustomSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(CustomSqlBaseParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(CustomSqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(CustomSqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterExponentLiteral(CustomSqlBaseParser.ExponentLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitExponentLiteral(CustomSqlBaseParser.ExponentLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(CustomSqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(CustomSqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code legacyDecimalLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterLegacyDecimalLiteral(CustomSqlBaseParser.LegacyDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code legacyDecimalLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitLegacyDecimalLiteral(CustomSqlBaseParser.LegacyDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(CustomSqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(CustomSqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(CustomSqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(CustomSqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(CustomSqlBaseParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(CustomSqlBaseParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(CustomSqlBaseParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(CustomSqlBaseParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(CustomSqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(CustomSqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(CustomSqlBaseParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(CustomSqlBaseParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigDecimalLiteral(CustomSqlBaseParser.BigDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link CustomSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigDecimalLiteral(CustomSqlBaseParser.BigDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#alterColumnAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumnAction(CustomSqlBaseParser.AlterColumnActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#alterColumnAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumnAction(CustomSqlBaseParser.AlterColumnActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 */
	void enterAnsiNonReserved(CustomSqlBaseParser.AnsiNonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 */
	void exitAnsiNonReserved(CustomSqlBaseParser.AnsiNonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#strictNonReserved}.
	 * @param ctx the parse tree
	 */
	void enterStrictNonReserved(CustomSqlBaseParser.StrictNonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#strictNonReserved}.
	 * @param ctx the parse tree
	 */
	void exitStrictNonReserved(CustomSqlBaseParser.StrictNonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomSqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(CustomSqlBaseParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomSqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(CustomSqlBaseParser.NonReservedContext ctx);
}