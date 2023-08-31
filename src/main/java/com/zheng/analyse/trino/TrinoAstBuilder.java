package com.zheng.analyse.trino;

import com.zheng.analyse.trino.antlr4.TrinoSqlBaseBaseVisitor;
import com.zheng.analyse.trino.antlr4.TrinoSqlBaseParser;

public class TrinoAstBuilder extends TrinoSqlBaseBaseVisitor {
    @Override
    public Object visitSingleStatement(TrinoSqlBaseParser.SingleStatementContext ctx) {
        return super.visitSingleStatement(ctx);
    }

    @Override
    public Object visitStandaloneExpression(TrinoSqlBaseParser.StandaloneExpressionContext ctx) {
        return super.visitStandaloneExpression(ctx);
    }

    @Override
    public Object visitStandalonePathSpecification(TrinoSqlBaseParser.StandalonePathSpecificationContext ctx) {
        return super.visitStandalonePathSpecification(ctx);
    }

    @Override
    public Object visitStandaloneType(TrinoSqlBaseParser.StandaloneTypeContext ctx) {
        return super.visitStandaloneType(ctx);
    }

    @Override
    public Object visitStatementDefault(TrinoSqlBaseParser.StatementDefaultContext ctx) {
        return super.visitStatementDefault(ctx);
    }

    @Override
    public Object visitUse(TrinoSqlBaseParser.UseContext ctx) {
        return super.visitUse(ctx);
    }

    @Override
    public Object visitCreateSchema(TrinoSqlBaseParser.CreateSchemaContext ctx) {
        return super.visitCreateSchema(ctx);
    }

    @Override
    public Object visitDropSchema(TrinoSqlBaseParser.DropSchemaContext ctx) {
        return super.visitDropSchema(ctx);
    }

    @Override
    public Object visitRenameSchema(TrinoSqlBaseParser.RenameSchemaContext ctx) {
        return super.visitRenameSchema(ctx);
    }

    @Override
    public Object visitSetSchemaAuthorization(TrinoSqlBaseParser.SetSchemaAuthorizationContext ctx) {
        return super.visitSetSchemaAuthorization(ctx);
    }

    @Override
    public Object visitCreateTableAsSelect(TrinoSqlBaseParser.CreateTableAsSelectContext ctx) {
        return super.visitCreateTableAsSelect(ctx);
    }

    @Override
    public Object visitCreateTable(TrinoSqlBaseParser.CreateTableContext ctx) {
        return super.visitCreateTable(ctx);
    }

    @Override
    public Object visitDropTable(TrinoSqlBaseParser.DropTableContext ctx) {
        return super.visitDropTable(ctx);
    }

    @Override
    public Object visitInsertInto(TrinoSqlBaseParser.InsertIntoContext ctx) {
        return super.visitInsertInto(ctx);
    }

    @Override
    public Object visitDelete(TrinoSqlBaseParser.DeleteContext ctx) {
        return super.visitDelete(ctx);
    }

    @Override
    public Object visitRenameTable(TrinoSqlBaseParser.RenameTableContext ctx) {
        return super.visitRenameTable(ctx);
    }

    @Override
    public Object visitCommentTable(TrinoSqlBaseParser.CommentTableContext ctx) {
        return super.visitCommentTable(ctx);
    }

    @Override
    public Object visitCommentColumn(TrinoSqlBaseParser.CommentColumnContext ctx) {
        return super.visitCommentColumn(ctx);
    }

    @Override
    public Object visitRenameColumn(TrinoSqlBaseParser.RenameColumnContext ctx) {
        return super.visitRenameColumn(ctx);
    }

    @Override
    public Object visitDropColumn(TrinoSqlBaseParser.DropColumnContext ctx) {
        return super.visitDropColumn(ctx);
    }

    @Override
    public Object visitAddColumn(TrinoSqlBaseParser.AddColumnContext ctx) {
        return super.visitAddColumn(ctx);
    }

    @Override
    public Object visitSetTableAuthorization(TrinoSqlBaseParser.SetTableAuthorizationContext ctx) {
        return super.visitSetTableAuthorization(ctx);
    }

    @Override
    public Object visitAnalyze(TrinoSqlBaseParser.AnalyzeContext ctx) {
        return super.visitAnalyze(ctx);
    }

    @Override
    public Object visitCreateMaterializedView(TrinoSqlBaseParser.CreateMaterializedViewContext ctx) {
        return super.visitCreateMaterializedView(ctx);
    }

    @Override
    public Object visitCreateView(TrinoSqlBaseParser.CreateViewContext ctx) {
        return super.visitCreateView(ctx);
    }

    @Override
    public Object visitRefreshMaterializedView(TrinoSqlBaseParser.RefreshMaterializedViewContext ctx) {
        return super.visitRefreshMaterializedView(ctx);
    }

    @Override
    public Object visitDropMaterializedView(TrinoSqlBaseParser.DropMaterializedViewContext ctx) {
        return super.visitDropMaterializedView(ctx);
    }

    @Override
    public Object visitDropView(TrinoSqlBaseParser.DropViewContext ctx) {
        return super.visitDropView(ctx);
    }

    @Override
    public Object visitRenameView(TrinoSqlBaseParser.RenameViewContext ctx) {
        return super.visitRenameView(ctx);
    }

    @Override
    public Object visitSetViewAuthorization(TrinoSqlBaseParser.SetViewAuthorizationContext ctx) {
        return super.visitSetViewAuthorization(ctx);
    }

    @Override
    public Object visitCall(TrinoSqlBaseParser.CallContext ctx) {
        return super.visitCall(ctx);
    }

    @Override
    public Object visitCreateRole(TrinoSqlBaseParser.CreateRoleContext ctx) {
        return super.visitCreateRole(ctx);
    }

    @Override
    public Object visitDropRole(TrinoSqlBaseParser.DropRoleContext ctx) {
        return super.visitDropRole(ctx);
    }

    @Override
    public Object visitGrantRoles(TrinoSqlBaseParser.GrantRolesContext ctx) {
        return super.visitGrantRoles(ctx);
    }

    @Override
    public Object visitRevokeRoles(TrinoSqlBaseParser.RevokeRolesContext ctx) {
        return super.visitRevokeRoles(ctx);
    }

    @Override
    public Object visitSetRole(TrinoSqlBaseParser.SetRoleContext ctx) {
        return super.visitSetRole(ctx);
    }

    @Override
    public Object visitGrant(TrinoSqlBaseParser.GrantContext ctx) {
        return super.visitGrant(ctx);
    }

    @Override
    public Object visitRevoke(TrinoSqlBaseParser.RevokeContext ctx) {
        return super.visitRevoke(ctx);
    }

    @Override
    public Object visitShowGrants(TrinoSqlBaseParser.ShowGrantsContext ctx) {
        return super.visitShowGrants(ctx);
    }

    @Override
    public Object visitExplain(TrinoSqlBaseParser.ExplainContext ctx) {
        return super.visitExplain(ctx);
    }

    @Override
    public Object visitShowCreateTable(TrinoSqlBaseParser.ShowCreateTableContext ctx) {
        return super.visitShowCreateTable(ctx);
    }

    @Override
    public Object visitShowCreateSchema(TrinoSqlBaseParser.ShowCreateSchemaContext ctx) {
        return super.visitShowCreateSchema(ctx);
    }

    @Override
    public Object visitShowCreateView(TrinoSqlBaseParser.ShowCreateViewContext ctx) {
        return super.visitShowCreateView(ctx);
    }

    @Override
    public Object visitShowCreateMaterializedView(TrinoSqlBaseParser.ShowCreateMaterializedViewContext ctx) {
        return super.visitShowCreateMaterializedView(ctx);
    }

    @Override
    public Object visitShowTables(TrinoSqlBaseParser.ShowTablesContext ctx) {
        return super.visitShowTables(ctx);
    }

    @Override
    public Object visitShowSchemas(TrinoSqlBaseParser.ShowSchemasContext ctx) {
        return super.visitShowSchemas(ctx);
    }

    @Override
    public Object visitShowCatalogs(TrinoSqlBaseParser.ShowCatalogsContext ctx) {
        return super.visitShowCatalogs(ctx);
    }

    @Override
    public Object visitShowColumns(TrinoSqlBaseParser.ShowColumnsContext ctx) {
        return super.visitShowColumns(ctx);
    }

    @Override
    public Object visitShowStats(TrinoSqlBaseParser.ShowStatsContext ctx) {
        return super.visitShowStats(ctx);
    }

    @Override
    public Object visitShowStatsForQuery(TrinoSqlBaseParser.ShowStatsForQueryContext ctx) {
        return super.visitShowStatsForQuery(ctx);
    }

    @Override
    public Object visitShowRoles(TrinoSqlBaseParser.ShowRolesContext ctx) {
        return super.visitShowRoles(ctx);
    }

    @Override
    public Object visitShowRoleGrants(TrinoSqlBaseParser.ShowRoleGrantsContext ctx) {
        return super.visitShowRoleGrants(ctx);
    }

    @Override
    public Object visitShowFunctions(TrinoSqlBaseParser.ShowFunctionsContext ctx) {
        return super.visitShowFunctions(ctx);
    }

    @Override
    public Object visitShowSession(TrinoSqlBaseParser.ShowSessionContext ctx) {
        return super.visitShowSession(ctx);
    }

    @Override
    public Object visitSetSession(TrinoSqlBaseParser.SetSessionContext ctx) {
        return super.visitSetSession(ctx);
    }

    @Override
    public Object visitResetSession(TrinoSqlBaseParser.ResetSessionContext ctx) {
        return super.visitResetSession(ctx);
    }

    @Override
    public Object visitStartTransaction(TrinoSqlBaseParser.StartTransactionContext ctx) {
        return super.visitStartTransaction(ctx);
    }

    @Override
    public Object visitCommit(TrinoSqlBaseParser.CommitContext ctx) {
        return super.visitCommit(ctx);
    }

    @Override
    public Object visitRollback(TrinoSqlBaseParser.RollbackContext ctx) {
        return super.visitRollback(ctx);
    }

    @Override
    public Object visitPrepare(TrinoSqlBaseParser.PrepareContext ctx) {
        return super.visitPrepare(ctx);
    }

    @Override
    public Object visitDeallocate(TrinoSqlBaseParser.DeallocateContext ctx) {
        return super.visitDeallocate(ctx);
    }

    @Override
    public Object visitExecute(TrinoSqlBaseParser.ExecuteContext ctx) {
        return super.visitExecute(ctx);
    }

    @Override
    public Object visitDescribeInput(TrinoSqlBaseParser.DescribeInputContext ctx) {
        return super.visitDescribeInput(ctx);
    }

    @Override
    public Object visitDescribeOutput(TrinoSqlBaseParser.DescribeOutputContext ctx) {
        return super.visitDescribeOutput(ctx);
    }

    @Override
    public Object visitSetPath(TrinoSqlBaseParser.SetPathContext ctx) {
        return super.visitSetPath(ctx);
    }

    @Override
    public Object visitUpdate(TrinoSqlBaseParser.UpdateContext ctx) {
        return super.visitUpdate(ctx);
    }

    @Override
    public Object visitMerge(TrinoSqlBaseParser.MergeContext ctx) {
        return super.visitMerge(ctx);
    }

    @Override
    public Object visitQuery(TrinoSqlBaseParser.QueryContext ctx) {
        return super.visitQuery(ctx);
    }

    @Override
    public Object visitWith(TrinoSqlBaseParser.WithContext ctx) {
        return super.visitWith(ctx);
    }

    @Override
    public Object visitTableElement(TrinoSqlBaseParser.TableElementContext ctx) {
        return super.visitTableElement(ctx);
    }

    @Override
    public Object visitColumnDefinition(TrinoSqlBaseParser.ColumnDefinitionContext ctx) {
        return super.visitColumnDefinition(ctx);
    }

    @Override
    public Object visitLikeClause(TrinoSqlBaseParser.LikeClauseContext ctx) {
        return super.visitLikeClause(ctx);
    }

    @Override
    public Object visitProperties(TrinoSqlBaseParser.PropertiesContext ctx) {
        return super.visitProperties(ctx);
    }

    @Override
    public Object visitProperty(TrinoSqlBaseParser.PropertyContext ctx) {
        return super.visitProperty(ctx);
    }

    @Override
    public Object visitQueryNoWith(TrinoSqlBaseParser.QueryNoWithContext ctx) {
        return super.visitQueryNoWith(ctx);
    }

    @Override
    public Object visitLimitRowCount(TrinoSqlBaseParser.LimitRowCountContext ctx) {
        return super.visitLimitRowCount(ctx);
    }

    @Override
    public Object visitRowCount(TrinoSqlBaseParser.RowCountContext ctx) {
        return super.visitRowCount(ctx);
    }

    @Override
    public Object visitQueryTermDefault(TrinoSqlBaseParser.QueryTermDefaultContext ctx) {
        return super.visitQueryTermDefault(ctx);
    }

    @Override
    public Object visitSetOperation(TrinoSqlBaseParser.SetOperationContext ctx) {
        return super.visitSetOperation(ctx);
    }

    @Override
    public Object visitQueryPrimaryDefault(TrinoSqlBaseParser.QueryPrimaryDefaultContext ctx) {
        return super.visitQueryPrimaryDefault(ctx);
    }

    @Override
    public Object visitTable(TrinoSqlBaseParser.TableContext ctx) {
        return super.visitTable(ctx);
    }

    @Override
    public Object visitInlineTable(TrinoSqlBaseParser.InlineTableContext ctx) {
        return super.visitInlineTable(ctx);
    }

    @Override
    public Object visitSubquery(TrinoSqlBaseParser.SubqueryContext ctx) {
        return super.visitSubquery(ctx);
    }

    @Override
    public Object visitSortItem(TrinoSqlBaseParser.SortItemContext ctx) {
        return super.visitSortItem(ctx);
    }

    @Override
    public Object visitQuerySpecification(TrinoSqlBaseParser.QuerySpecificationContext ctx) {
        return super.visitQuerySpecification(ctx);
    }

    @Override
    public Object visitGroupBy(TrinoSqlBaseParser.GroupByContext ctx) {
        return super.visitGroupBy(ctx);
    }

    @Override
    public Object visitSingleGroupingSet(TrinoSqlBaseParser.SingleGroupingSetContext ctx) {
        return super.visitSingleGroupingSet(ctx);
    }

    @Override
    public Object visitRollup(TrinoSqlBaseParser.RollupContext ctx) {
        return super.visitRollup(ctx);
    }

    @Override
    public Object visitCube(TrinoSqlBaseParser.CubeContext ctx) {
        return super.visitCube(ctx);
    }

    @Override
    public Object visitMultipleGroupingSets(TrinoSqlBaseParser.MultipleGroupingSetsContext ctx) {
        return super.visitMultipleGroupingSets(ctx);
    }

    @Override
    public Object visitGroupingSet(TrinoSqlBaseParser.GroupingSetContext ctx) {
        return super.visitGroupingSet(ctx);
    }

    @Override
    public Object visitWindowDefinition(TrinoSqlBaseParser.WindowDefinitionContext ctx) {
        return super.visitWindowDefinition(ctx);
    }

    @Override
    public Object visitWindowSpecification(TrinoSqlBaseParser.WindowSpecificationContext ctx) {
        return super.visitWindowSpecification(ctx);
    }

    @Override
    public Object visitNamedQuery(TrinoSqlBaseParser.NamedQueryContext ctx) {
        return super.visitNamedQuery(ctx);
    }

    @Override
    public Object visitSetQuantifier(TrinoSqlBaseParser.SetQuantifierContext ctx) {
        return super.visitSetQuantifier(ctx);
    }

    @Override
    public Object visitSelectSingle(TrinoSqlBaseParser.SelectSingleContext ctx) {
        return super.visitSelectSingle(ctx);
    }

    @Override
    public Object visitSelectAll(TrinoSqlBaseParser.SelectAllContext ctx) {
        return super.visitSelectAll(ctx);
    }

    @Override
    public Object visitRelationDefault(TrinoSqlBaseParser.RelationDefaultContext ctx) {
        return super.visitRelationDefault(ctx);
    }

    @Override
    public Object visitJoinRelation(TrinoSqlBaseParser.JoinRelationContext ctx) {
        return super.visitJoinRelation(ctx);
    }

    @Override
    public Object visitJoinType(TrinoSqlBaseParser.JoinTypeContext ctx) {
        return super.visitJoinType(ctx);
    }

    @Override
    public Object visitJoinCriteria(TrinoSqlBaseParser.JoinCriteriaContext ctx) {
        return super.visitJoinCriteria(ctx);
    }

    @Override
    public Object visitSampledRelation(TrinoSqlBaseParser.SampledRelationContext ctx) {
        return super.visitSampledRelation(ctx);
    }

    @Override
    public Object visitSampleType(TrinoSqlBaseParser.SampleTypeContext ctx) {
        return super.visitSampleType(ctx);
    }

    @Override
    public Object visitAliasedRelation(TrinoSqlBaseParser.AliasedRelationContext ctx) {
        return super.visitAliasedRelation(ctx);
    }

    @Override
    public Object visitColumnAliases(TrinoSqlBaseParser.ColumnAliasesContext ctx) {
        return super.visitColumnAliases(ctx);
    }

    @Override
    public Object visitTableName(TrinoSqlBaseParser.TableNameContext ctx) {
        return super.visitTableName(ctx);
    }

    @Override
    public Object visitSubqueryRelation(TrinoSqlBaseParser.SubqueryRelationContext ctx) {
        return super.visitSubqueryRelation(ctx);
    }

    @Override
    public Object visitUnnest(TrinoSqlBaseParser.UnnestContext ctx) {
        return super.visitUnnest(ctx);
    }

    @Override
    public Object visitLateral(TrinoSqlBaseParser.LateralContext ctx) {
        return super.visitLateral(ctx);
    }

    @Override
    public Object visitParenthesizedRelation(TrinoSqlBaseParser.ParenthesizedRelationContext ctx) {
        return super.visitParenthesizedRelation(ctx);
    }

    @Override
    public Object visitExpression(TrinoSqlBaseParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public Object visitLogicalNot(TrinoSqlBaseParser.LogicalNotContext ctx) {
        return super.visitLogicalNot(ctx);
    }

    @Override
    public Object visitPredicated(TrinoSqlBaseParser.PredicatedContext ctx) {
        return super.visitPredicated(ctx);
    }

    @Override
    public Object visitLogicalBinary(TrinoSqlBaseParser.LogicalBinaryContext ctx) {
        return super.visitLogicalBinary(ctx);
    }

    @Override
    public Object visitComparison(TrinoSqlBaseParser.ComparisonContext ctx) {
        return super.visitComparison(ctx);
    }

    @Override
    public Object visitQuantifiedComparison(TrinoSqlBaseParser.QuantifiedComparisonContext ctx) {
        return super.visitQuantifiedComparison(ctx);
    }

    @Override
    public Object visitBetween(TrinoSqlBaseParser.BetweenContext ctx) {
        return super.visitBetween(ctx);
    }

    @Override
    public Object visitInList(TrinoSqlBaseParser.InListContext ctx) {
        return super.visitInList(ctx);
    }

    @Override
    public Object visitInSubquery(TrinoSqlBaseParser.InSubqueryContext ctx) {
        return super.visitInSubquery(ctx);
    }

    @Override
    public Object visitLike(TrinoSqlBaseParser.LikeContext ctx) {
        return super.visitLike(ctx);
    }

    @Override
    public Object visitNullPredicate(TrinoSqlBaseParser.NullPredicateContext ctx) {
        return super.visitNullPredicate(ctx);
    }

    @Override
    public Object visitDistinctFrom(TrinoSqlBaseParser.DistinctFromContext ctx) {
        return super.visitDistinctFrom(ctx);
    }

    @Override
    public Object visitValueExpressionDefault(TrinoSqlBaseParser.ValueExpressionDefaultContext ctx) {
        return super.visitValueExpressionDefault(ctx);
    }

    @Override
    public Object visitConcatenation(TrinoSqlBaseParser.ConcatenationContext ctx) {
        return super.visitConcatenation(ctx);
    }

    @Override
    public Object visitArithmeticBinary(TrinoSqlBaseParser.ArithmeticBinaryContext ctx) {
        return super.visitArithmeticBinary(ctx);
    }

    @Override
    public Object visitArithmeticUnary(TrinoSqlBaseParser.ArithmeticUnaryContext ctx) {
        return super.visitArithmeticUnary(ctx);
    }

    @Override
    public Object visitAtTimeZone(TrinoSqlBaseParser.AtTimeZoneContext ctx) {
        return super.visitAtTimeZone(ctx);
    }

    @Override
    public Object visitDereference(TrinoSqlBaseParser.DereferenceContext ctx) {
        return super.visitDereference(ctx);
    }

    @Override
    public Object visitTypeConstructor(TrinoSqlBaseParser.TypeConstructorContext ctx) {
        return super.visitTypeConstructor(ctx);
    }

    @Override
    public Object visitSpecialDateTimeFunction(TrinoSqlBaseParser.SpecialDateTimeFunctionContext ctx) {
        return super.visitSpecialDateTimeFunction(ctx);
    }

    @Override
    public Object visitSubstring(TrinoSqlBaseParser.SubstringContext ctx) {
        return super.visitSubstring(ctx);
    }

    @Override
    public Object visitCast(TrinoSqlBaseParser.CastContext ctx) {
        return super.visitCast(ctx);
    }

    @Override
    public Object visitLambda(TrinoSqlBaseParser.LambdaContext ctx) {
        return super.visitLambda(ctx);
    }

    @Override
    public Object visitParenthesizedExpression(TrinoSqlBaseParser.ParenthesizedExpressionContext ctx) {
        return super.visitParenthesizedExpression(ctx);
    }

    @Override
    public Object visitParameter(TrinoSqlBaseParser.ParameterContext ctx) {
        return super.visitParameter(ctx);
    }

    @Override
    public Object visitNormalize(TrinoSqlBaseParser.NormalizeContext ctx) {
        return super.visitNormalize(ctx);
    }

    @Override
    public Object visitIntervalLiteral(TrinoSqlBaseParser.IntervalLiteralContext ctx) {
        return super.visitIntervalLiteral(ctx);
    }

    @Override
    public Object visitNumericLiteral(TrinoSqlBaseParser.NumericLiteralContext ctx) {
        return super.visitNumericLiteral(ctx);
    }

    @Override
    public Object visitBooleanLiteral(TrinoSqlBaseParser.BooleanLiteralContext ctx) {
        return super.visitBooleanLiteral(ctx);
    }

    @Override
    public Object visitSimpleCase(TrinoSqlBaseParser.SimpleCaseContext ctx) {
        return super.visitSimpleCase(ctx);
    }

    /**
     * 字段别名
     * @param ctx
     * @return
     */
    @Override
    public Object visitColumnReference(TrinoSqlBaseParser.ColumnReferenceContext ctx) {
        return super.visitColumnReference(ctx);
    }

    @Override
    public Object visitNullLiteral(TrinoSqlBaseParser.NullLiteralContext ctx) {
        return super.visitNullLiteral(ctx);
    }

    @Override
    public Object visitRowConstructor(TrinoSqlBaseParser.RowConstructorContext ctx) {
        return super.visitRowConstructor(ctx);
    }

    @Override
    public Object visitSubscript(TrinoSqlBaseParser.SubscriptContext ctx) {
        return super.visitSubscript(ctx);
    }

    @Override
    public Object visitCurrentPath(TrinoSqlBaseParser.CurrentPathContext ctx) {
        return super.visitCurrentPath(ctx);
    }

    @Override
    public Object visitSubqueryExpression(TrinoSqlBaseParser.SubqueryExpressionContext ctx) {
        return super.visitSubqueryExpression(ctx);
    }

    @Override
    public Object visitBinaryLiteral(TrinoSqlBaseParser.BinaryLiteralContext ctx) {
        return super.visitBinaryLiteral(ctx);
    }

    @Override
    public Object visitCurrentUser(TrinoSqlBaseParser.CurrentUserContext ctx) {
        return super.visitCurrentUser(ctx);
    }

    @Override
    public Object visitExtract(TrinoSqlBaseParser.ExtractContext ctx) {
        return super.visitExtract(ctx);
    }

    @Override
    public Object visitStringLiteral(TrinoSqlBaseParser.StringLiteralContext ctx) {
        return super.visitStringLiteral(ctx);
    }

    @Override
    public Object visitArrayConstructor(TrinoSqlBaseParser.ArrayConstructorContext ctx) {
        return super.visitArrayConstructor(ctx);
    }

    @Override
    public Object visitFunctionCall(TrinoSqlBaseParser.FunctionCallContext ctx) {
        return super.visitFunctionCall(ctx);
    }

    @Override
    public Object visitExists(TrinoSqlBaseParser.ExistsContext ctx) {
        return super.visitExists(ctx);
    }

    @Override
    public Object visitPosition(TrinoSqlBaseParser.PositionContext ctx) {
        return super.visitPosition(ctx);
    }

    @Override
    public Object visitSearchedCase(TrinoSqlBaseParser.SearchedCaseContext ctx) {
        return super.visitSearchedCase(ctx);
    }

    @Override
    public Object visitGroupingOperation(TrinoSqlBaseParser.GroupingOperationContext ctx) {
        return super.visitGroupingOperation(ctx);
    }

    @Override
    public Object visitNullTreatment(TrinoSqlBaseParser.NullTreatmentContext ctx) {
        return super.visitNullTreatment(ctx);
    }

    @Override
    public Object visitBasicStringLiteral(TrinoSqlBaseParser.BasicStringLiteralContext ctx) {
        return super.visitBasicStringLiteral(ctx);
    }

    @Override
    public Object visitUnicodeStringLiteral(TrinoSqlBaseParser.UnicodeStringLiteralContext ctx) {
        return super.visitUnicodeStringLiteral(ctx);
    }

    @Override
    public Object visitTimeZoneInterval(TrinoSqlBaseParser.TimeZoneIntervalContext ctx) {
        return super.visitTimeZoneInterval(ctx);
    }

    @Override
    public Object visitTimeZoneString(TrinoSqlBaseParser.TimeZoneStringContext ctx) {
        return super.visitTimeZoneString(ctx);
    }

    @Override
    public Object visitComparisonOperator(TrinoSqlBaseParser.ComparisonOperatorContext ctx) {
        return super.visitComparisonOperator(ctx);
    }

    @Override
    public Object visitComparisonQuantifier(TrinoSqlBaseParser.ComparisonQuantifierContext ctx) {
        return super.visitComparisonQuantifier(ctx);
    }

    @Override
    public Object visitBooleanValue(TrinoSqlBaseParser.BooleanValueContext ctx) {
        return super.visitBooleanValue(ctx);
    }

    @Override
    public Object visitInterval(TrinoSqlBaseParser.IntervalContext ctx) {
        return super.visitInterval(ctx);
    }

    @Override
    public Object visitIntervalField(TrinoSqlBaseParser.IntervalFieldContext ctx) {
        return super.visitIntervalField(ctx);
    }

    @Override
    public Object visitNormalForm(TrinoSqlBaseParser.NormalFormContext ctx) {
        return super.visitNormalForm(ctx);
    }

    @Override
    public Object visitRowType(TrinoSqlBaseParser.RowTypeContext ctx) {
        return super.visitRowType(ctx);
    }

    @Override
    public Object visitIntervalType(TrinoSqlBaseParser.IntervalTypeContext ctx) {
        return super.visitIntervalType(ctx);
    }

    @Override
    public Object visitArrayType(TrinoSqlBaseParser.ArrayTypeContext ctx) {
        return super.visitArrayType(ctx);
    }

    @Override
    public Object visitDoublePrecisionType(TrinoSqlBaseParser.DoublePrecisionTypeContext ctx) {
        return super.visitDoublePrecisionType(ctx);
    }

    @Override
    public Object visitLegacyArrayType(TrinoSqlBaseParser.LegacyArrayTypeContext ctx) {
        return super.visitLegacyArrayType(ctx);
    }

    @Override
    public Object visitGenericType(TrinoSqlBaseParser.GenericTypeContext ctx) {
        return super.visitGenericType(ctx);
    }

    @Override
    public Object visitDateTimeType(TrinoSqlBaseParser.DateTimeTypeContext ctx) {
        return super.visitDateTimeType(ctx);
    }

    @Override
    public Object visitLegacyMapType(TrinoSqlBaseParser.LegacyMapTypeContext ctx) {
        return super.visitLegacyMapType(ctx);
    }

    @Override
    public Object visitRowField(TrinoSqlBaseParser.RowFieldContext ctx) {
        return super.visitRowField(ctx);
    }

    @Override
    public Object visitTypeParameter(TrinoSqlBaseParser.TypeParameterContext ctx) {
        return super.visitTypeParameter(ctx);
    }

    @Override
    public Object visitWhenClause(TrinoSqlBaseParser.WhenClauseContext ctx) {
        return super.visitWhenClause(ctx);
    }

    @Override
    public Object visitFilter(TrinoSqlBaseParser.FilterContext ctx) {
        return super.visitFilter(ctx);
    }

    @Override
    public Object visitMergeUpdate(TrinoSqlBaseParser.MergeUpdateContext ctx) {
        return super.visitMergeUpdate(ctx);
    }

    @Override
    public Object visitMergeDelete(TrinoSqlBaseParser.MergeDeleteContext ctx) {
        return super.visitMergeDelete(ctx);
    }

    @Override
    public Object visitMergeInsert(TrinoSqlBaseParser.MergeInsertContext ctx) {
        return super.visitMergeInsert(ctx);
    }

    @Override
    public Object visitOver(TrinoSqlBaseParser.OverContext ctx) {
        return super.visitOver(ctx);
    }

    @Override
    public Object visitWindowFrame(TrinoSqlBaseParser.WindowFrameContext ctx) {
        return super.visitWindowFrame(ctx);
    }

    @Override
    public Object visitUnboundedFrame(TrinoSqlBaseParser.UnboundedFrameContext ctx) {
        return super.visitUnboundedFrame(ctx);
    }

    @Override
    public Object visitCurrentRowBound(TrinoSqlBaseParser.CurrentRowBoundContext ctx) {
        return super.visitCurrentRowBound(ctx);
    }

    @Override
    public Object visitBoundedFrame(TrinoSqlBaseParser.BoundedFrameContext ctx) {
        return super.visitBoundedFrame(ctx);
    }

    @Override
    public Object visitUpdateAssignment(TrinoSqlBaseParser.UpdateAssignmentContext ctx) {
        return super.visitUpdateAssignment(ctx);
    }

    @Override
    public Object visitExplainFormat(TrinoSqlBaseParser.ExplainFormatContext ctx) {
        return super.visitExplainFormat(ctx);
    }

    @Override
    public Object visitExplainType(TrinoSqlBaseParser.ExplainTypeContext ctx) {
        return super.visitExplainType(ctx);
    }

    @Override
    public Object visitIsolationLevel(TrinoSqlBaseParser.IsolationLevelContext ctx) {
        return super.visitIsolationLevel(ctx);
    }

    @Override
    public Object visitTransactionAccessMode(TrinoSqlBaseParser.TransactionAccessModeContext ctx) {
        return super.visitTransactionAccessMode(ctx);
    }

    @Override
    public Object visitReadUncommitted(TrinoSqlBaseParser.ReadUncommittedContext ctx) {
        return super.visitReadUncommitted(ctx);
    }

    @Override
    public Object visitReadCommitted(TrinoSqlBaseParser.ReadCommittedContext ctx) {
        return super.visitReadCommitted(ctx);
    }

    @Override
    public Object visitRepeatableRead(TrinoSqlBaseParser.RepeatableReadContext ctx) {
        return super.visitRepeatableRead(ctx);
    }

    @Override
    public Object visitSerializable(TrinoSqlBaseParser.SerializableContext ctx) {
        return super.visitSerializable(ctx);
    }

    @Override
    public Object visitPositionalArgument(TrinoSqlBaseParser.PositionalArgumentContext ctx) {
        return super.visitPositionalArgument(ctx);
    }

    @Override
    public Object visitNamedArgument(TrinoSqlBaseParser.NamedArgumentContext ctx) {
        return super.visitNamedArgument(ctx);
    }

    @Override
    public Object visitQualifiedArgument(TrinoSqlBaseParser.QualifiedArgumentContext ctx) {
        return super.visitQualifiedArgument(ctx);
    }

    @Override
    public Object visitUnqualifiedArgument(TrinoSqlBaseParser.UnqualifiedArgumentContext ctx) {
        return super.visitUnqualifiedArgument(ctx);
    }

    @Override
    public Object visitPathSpecification(TrinoSqlBaseParser.PathSpecificationContext ctx) {
        return super.visitPathSpecification(ctx);
    }

    @Override
    public Object visitPrivilege(TrinoSqlBaseParser.PrivilegeContext ctx) {
        return super.visitPrivilege(ctx);
    }

    @Override
    public Object visitQualifiedName(TrinoSqlBaseParser.QualifiedNameContext ctx) {
        return super.visitQualifiedName(ctx);
    }

    @Override
    public Object visitSpecifiedPrincipal(TrinoSqlBaseParser.SpecifiedPrincipalContext ctx) {
        return super.visitSpecifiedPrincipal(ctx);
    }

    @Override
    public Object visitCurrentUserGrantor(TrinoSqlBaseParser.CurrentUserGrantorContext ctx) {
        return super.visitCurrentUserGrantor(ctx);
    }

    @Override
    public Object visitCurrentRoleGrantor(TrinoSqlBaseParser.CurrentRoleGrantorContext ctx) {
        return super.visitCurrentRoleGrantor(ctx);
    }

    @Override
    public Object visitUnspecifiedPrincipal(TrinoSqlBaseParser.UnspecifiedPrincipalContext ctx) {
        return super.visitUnspecifiedPrincipal(ctx);
    }

    @Override
    public Object visitUserPrincipal(TrinoSqlBaseParser.UserPrincipalContext ctx) {
        return super.visitUserPrincipal(ctx);
    }

    @Override
    public Object visitRolePrincipal(TrinoSqlBaseParser.RolePrincipalContext ctx) {
        return super.visitRolePrincipal(ctx);
    }

    @Override
    public Object visitRoles(TrinoSqlBaseParser.RolesContext ctx) {
        return super.visitRoles(ctx);
    }

    @Override
    public Object visitUnquotedIdentifier(TrinoSqlBaseParser.UnquotedIdentifierContext ctx) {
        return super.visitUnquotedIdentifier(ctx);
    }

    @Override
    public Object visitQuotedIdentifier(TrinoSqlBaseParser.QuotedIdentifierContext ctx) {
        return super.visitQuotedIdentifier(ctx);
    }

    @Override
    public Object visitBackQuotedIdentifier(TrinoSqlBaseParser.BackQuotedIdentifierContext ctx) {
        return super.visitBackQuotedIdentifier(ctx);
    }

    @Override
    public Object visitDigitIdentifier(TrinoSqlBaseParser.DigitIdentifierContext ctx) {
        return super.visitDigitIdentifier(ctx);
    }

    @Override
    public Object visitDecimalLiteral(TrinoSqlBaseParser.DecimalLiteralContext ctx) {
        return super.visitDecimalLiteral(ctx);
    }

    @Override
    public Object visitDoubleLiteral(TrinoSqlBaseParser.DoubleLiteralContext ctx) {
        return super.visitDoubleLiteral(ctx);
    }

    @Override
    public Object visitIntegerLiteral(TrinoSqlBaseParser.IntegerLiteralContext ctx) {
        return super.visitIntegerLiteral(ctx);
    }

    @Override
    public Object visitNonReserved(TrinoSqlBaseParser.NonReservedContext ctx) {
        return super.visitNonReserved(ctx);
    }
}