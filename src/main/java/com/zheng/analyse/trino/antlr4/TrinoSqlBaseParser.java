// Generated from /Users/zheng/project/sql-analyse/src/main/java/com/zheng/trino/antlr4/TrinoSqlBase.g4 by ANTLR 4.9.1
package com.zheng.analyse.trino.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TrinoSqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ADD=9, 
		ADMIN=10, ALL=11, ALTER=12, ANALYZE=13, AND=14, ANY=15, ARRAY=16, AS=17, 
		ASC=18, AT=19, AUTHORIZATION=20, BERNOULLI=21, BETWEEN=22, BY=23, CALL=24, 
		CASCADE=25, CASE=26, CAST=27, CATALOGS=28, COLUMN=29, COLUMNS=30, COMMENT=31, 
		COMMIT=32, COMMITTED=33, CONSTRAINT=34, CREATE=35, CROSS=36, CUBE=37, 
		CURRENT=38, CURRENT_DATE=39, CURRENT_PATH=40, CURRENT_ROLE=41, CURRENT_TIME=42, 
		CURRENT_TIMESTAMP=43, CURRENT_USER=44, DATA=45, DATE=46, DAY=47, DEALLOCATE=48, 
		DEFINER=49, DELETE=50, DESC=51, DESCRIBE=52, DISTINCT=53, DISTRIBUTED=54, 
		DOUBLE=55, DROP=56, ELSE=57, END=58, ESCAPE=59, EXCEPT=60, EXCLUDING=61, 
		EXECUTE=62, EXISTS=63, EXPLAIN=64, EXTRACT=65, FALSE=66, FETCH=67, FILTER=68, 
		FIRST=69, FOLLOWING=70, FOR=71, FORMAT=72, FROM=73, FULL=74, FUNCTIONS=75, 
		GRANT=76, GRANTED=77, GRANTS=78, GRAPHVIZ=79, GROUP=80, GROUPING=81, GROUPS=82, 
		HAVING=83, HOUR=84, IF=85, IGNORE=86, IN=87, INCLUDING=88, INNER=89, INPUT=90, 
		INSERT=91, INTERSECT=92, INTERVAL=93, INTO=94, INVOKER=95, IO=96, IS=97, 
		ISOLATION=98, JOIN=99, JSON=100, LAST=101, LATERAL=102, LEFT=103, LEVEL=104, 
		LIKE=105, LIMIT=106, LOCALTIME=107, LOCALTIMESTAMP=108, LOGICAL=109, MAP=110, 
		MATCHED=111, MATERIALIZED=112, MERGE=113, MINUTE=114, MONTH=115, NATURAL=116, 
		NEXT=117, NFC=118, NFD=119, NFKC=120, NFKD=121, NO=122, NONE=123, NORMALIZE=124, 
		NOT=125, NULL=126, NULLIF=127, NULLS=128, OFFSET=129, ON=130, ONLY=131, 
		OPTION=132, OR=133, ORDER=134, ORDINALITY=135, OUTER=136, OUTPUT=137, 
		OVER=138, PARTITION=139, PARTITIONS=140, PATH=141, POSITION=142, PRECEDING=143, 
		PRECISION=144, PREPARE=145, PRIVILEGES=146, PROPERTIES=147, RANGE=148, 
		READ=149, RECURSIVE=150, REFRESH=151, RENAME=152, REPEATABLE=153, REPLACE=154, 
		RESET=155, RESPECT=156, RESTRICT=157, REVOKE=158, RIGHT=159, ROLE=160, 
		ROLES=161, ROLLBACK=162, ROLLUP=163, ROW=164, ROWS=165, SCHEMA=166, SCHEMAS=167, 
		SECOND=168, SECURITY=169, SELECT=170, SERIALIZABLE=171, SESSION=172, SET=173, 
		SETS=174, SHOW=175, SOME=176, START=177, STATS=178, SUBSTRING=179, SYSTEM=180, 
		TABLE=181, TABLES=182, TABLESAMPLE=183, TEXT=184, THEN=185, TIES=186, 
		TIME=187, TIMESTAMP=188, TO=189, TRANSACTION=190, TRUE=191, TRY_CAST=192, 
		TYPE=193, UESCAPE=194, UNBOUNDED=195, UNCOMMITTED=196, UNION=197, UNNEST=198, 
		UPDATE=199, USE=200, USER=201, USING=202, VALIDATE=203, VALUES=204, VERBOSE=205, 
		VIEW=206, WHEN=207, WHERE=208, WINDOW=209, WITH=210, WITHOUT=211, WORK=212, 
		WRITE=213, YEAR=214, ZONE=215, EQ=216, NEQ=217, LT=218, LTE=219, GT=220, 
		GTE=221, PLUS=222, MINUS=223, ASTERISK=224, SLASH=225, PERCENT=226, CONCAT=227, 
		STRING=228, UNICODE_STRING=229, BINARY_LITERAL=230, INTEGER_VALUE=231, 
		DECIMAL_VALUE=232, DOUBLE_VALUE=233, IDENTIFIER=234, DIGIT_IDENTIFIER=235, 
		QUOTED_IDENTIFIER=236, BACKQUOTED_IDENTIFIER=237, SIMPLE_COMMENT=238, 
		BRACKETED_COMMENT=239, WS=240, PARAMETER=241, UNRECOGNIZED=242, DELIMITER=243;
	public static final int
		RULE_singleStatement = 0, RULE_standaloneExpression = 1, RULE_standalonePathSpecification = 2, 
		RULE_standaloneType = 3, RULE_statement = 4, RULE_query = 5, RULE_with = 6, 
		RULE_tableElement = 7, RULE_columnDefinition = 8, RULE_likeClause = 9, 
		RULE_properties = 10, RULE_property = 11, RULE_queryNoWith = 12, RULE_limitRowCount = 13, 
		RULE_rowCount = 14, RULE_queryTerm = 15, RULE_queryPrimary = 16, RULE_sortItem = 17, 
		RULE_querySpecification = 18, RULE_groupBy = 19, RULE_groupingElement = 20, 
		RULE_groupingSet = 21, RULE_windowDefinition = 22, RULE_windowSpecification = 23, 
		RULE_namedQuery = 24, RULE_setQuantifier = 25, RULE_selectItem = 26, RULE_relation = 27, 
		RULE_joinType = 28, RULE_joinCriteria = 29, RULE_sampledRelation = 30, 
		RULE_sampleType = 31, RULE_aliasedRelation = 32, RULE_columnAliases = 33, 
		RULE_relationPrimary = 34, RULE_expression = 35, RULE_booleanExpression = 36, 
		RULE_predicate = 37, RULE_valueExpression = 38, RULE_primaryExpression = 39, 
		RULE_nullTreatment = 40, RULE_string = 41, RULE_timeZoneSpecifier = 42, 
		RULE_comparisonOperator = 43, RULE_comparisonQuantifier = 44, RULE_booleanValue = 45, 
		RULE_interval = 46, RULE_intervalField = 47, RULE_normalForm = 48, RULE_type = 49, 
		RULE_rowField = 50, RULE_typeParameter = 51, RULE_whenClause = 52, RULE_filter = 53, 
		RULE_mergeCase = 54, RULE_over = 55, RULE_windowFrame = 56, RULE_frameBound = 57, 
		RULE_updateAssignment = 58, RULE_explainOption = 59, RULE_transactionMode = 60, 
		RULE_levelOfIsolation = 61, RULE_callArgument = 62, RULE_pathElement = 63, 
		RULE_pathSpecification = 64, RULE_privilege = 65, RULE_qualifiedName = 66, 
		RULE_grantor = 67, RULE_principal = 68, RULE_roles = 69, RULE_identifier = 70, 
		RULE_number = 71, RULE_nonReserved = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "standaloneExpression", "standalonePathSpecification", 
			"standaloneType", "statement", "query", "with", "tableElement", "columnDefinition", 
			"likeClause", "properties", "property", "queryNoWith", "limitRowCount", 
			"rowCount", "queryTerm", "queryPrimary", "sortItem", "querySpecification", 
			"groupBy", "groupingElement", "groupingSet", "windowDefinition", "windowSpecification", 
			"namedQuery", "setQuantifier", "selectItem", "relation", "joinType", 
			"joinCriteria", "sampledRelation", "sampleType", "aliasedRelation", "columnAliases", 
			"relationPrimary", "expression", "booleanExpression", "predicate", "valueExpression", 
			"primaryExpression", "nullTreatment", "string", "timeZoneSpecifier", 
			"comparisonOperator", "comparisonQuantifier", "booleanValue", "interval", 
			"intervalField", "normalForm", "type", "rowField", "typeParameter", "whenClause", 
			"filter", "mergeCase", "over", "windowFrame", "frameBound", "updateAssignment", 
			"explainOption", "transactionMode", "levelOfIsolation", "callArgument", 
			"pathElement", "pathSpecification", "privilege", "qualifiedName", "grantor", 
			"principal", "roles", "identifier", "number", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'('", "')'", "','", "'->'", "'['", "']'", "'=>'", "'ADD'", 
			"'ADMIN'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'ANY'", "'ARRAY'", 
			"'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", "'BERNOULLI'", "'BETWEEN'", 
			"'BY'", "'CALL'", "'CASCADE'", "'CASE'", "'CAST'", "'CATALOGS'", "'COLUMN'", 
			"'COLUMNS'", "'COMMENT'", "'COMMIT'", "'COMMITTED'", "'CONSTRAINT'", 
			"'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", "'CURRENT_DATE'", "'CURRENT_PATH'", 
			"'CURRENT_ROLE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CURRENT_USER'", 
			"'DATA'", "'DATE'", "'DAY'", "'DEALLOCATE'", "'DEFINER'", "'DELETE'", 
			"'DESC'", "'DESCRIBE'", "'DISTINCT'", "'DISTRIBUTED'", "'DOUBLE'", "'DROP'", 
			"'ELSE'", "'END'", "'ESCAPE'", "'EXCEPT'", "'EXCLUDING'", "'EXECUTE'", 
			"'EXISTS'", "'EXPLAIN'", "'EXTRACT'", "'FALSE'", "'FETCH'", "'FILTER'", 
			"'FIRST'", "'FOLLOWING'", "'FOR'", "'FORMAT'", "'FROM'", "'FULL'", "'FUNCTIONS'", 
			"'GRANT'", "'GRANTED'", "'GRANTS'", "'GRAPHVIZ'", "'GROUP'", "'GROUPING'", 
			"'GROUPS'", "'HAVING'", "'HOUR'", "'IF'", "'IGNORE'", "'IN'", "'INCLUDING'", 
			"'INNER'", "'INPUT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", "'INTO'", 
			"'INVOKER'", "'IO'", "'IS'", "'ISOLATION'", "'JOIN'", "'JSON'", "'LAST'", 
			"'LATERAL'", "'LEFT'", "'LEVEL'", "'LIKE'", "'LIMIT'", "'LOCALTIME'", 
			"'LOCALTIMESTAMP'", "'LOGICAL'", "'MAP'", "'MATCHED'", "'MATERIALIZED'", 
			"'MERGE'", "'MINUTE'", "'MONTH'", "'NATURAL'", "'NEXT'", "'NFC'", "'NFD'", 
			"'NFKC'", "'NFKD'", "'NO'", "'NONE'", "'NORMALIZE'", "'NOT'", "'NULL'", 
			"'NULLIF'", "'NULLS'", "'OFFSET'", "'ON'", "'ONLY'", "'OPTION'", "'OR'", 
			"'ORDER'", "'ORDINALITY'", "'OUTER'", "'OUTPUT'", "'OVER'", "'PARTITION'", 
			"'PARTITIONS'", "'PATH'", "'POSITION'", "'PRECEDING'", "'PRECISION'", 
			"'PREPARE'", "'PRIVILEGES'", "'PROPERTIES'", "'RANGE'", "'READ'", "'RECURSIVE'", 
			"'REFRESH'", "'RENAME'", "'REPEATABLE'", "'REPLACE'", "'RESET'", "'RESPECT'", 
			"'RESTRICT'", "'REVOKE'", "'RIGHT'", "'ROLE'", "'ROLES'", "'ROLLBACK'", 
			"'ROLLUP'", "'ROW'", "'ROWS'", "'SCHEMA'", "'SCHEMAS'", "'SECOND'", "'SECURITY'", 
			"'SELECT'", "'SERIALIZABLE'", "'SESSION'", "'SET'", "'SETS'", "'SHOW'", 
			"'SOME'", "'START'", "'STATS'", "'SUBSTRING'", "'SYSTEM'", "'TABLE'", 
			"'TABLES'", "'TABLESAMPLE'", "'TEXT'", "'THEN'", "'TIES'", "'TIME'", 
			"'TIMESTAMP'", "'TO'", "'TRANSACTION'", "'TRUE'", "'TRY_CAST'", "'TYPE'", 
			"'UESCAPE'", "'UNBOUNDED'", "'UNCOMMITTED'", "'UNION'", "'UNNEST'", "'UPDATE'", 
			"'USE'", "'USER'", "'USING'", "'VALIDATE'", "'VALUES'", "'VERBOSE'", 
			"'VIEW'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", "'WITHOUT'", "'WORK'", 
			"'WRITE'", "'YEAR'", "'ZONE'", "'='", null, "'<'", "'<='", "'>'", "'>='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'||'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ADD", "ADMIN", 
			"ALL", "ALTER", "ANALYZE", "AND", "ANY", "ARRAY", "AS", "ASC", "AT", 
			"AUTHORIZATION", "BERNOULLI", "BETWEEN", "BY", "CALL", "CASCADE", "CASE", 
			"CAST", "CATALOGS", "COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMMITTED", 
			"CONSTRAINT", "CREATE", "CROSS", "CUBE", "CURRENT", "CURRENT_DATE", "CURRENT_PATH", 
			"CURRENT_ROLE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", 
			"DATA", "DATE", "DAY", "DEALLOCATE", "DEFINER", "DELETE", "DESC", "DESCRIBE", 
			"DISTINCT", "DISTRIBUTED", "DOUBLE", "DROP", "ELSE", "END", "ESCAPE", 
			"EXCEPT", "EXCLUDING", "EXECUTE", "EXISTS", "EXPLAIN", "EXTRACT", "FALSE", 
			"FETCH", "FILTER", "FIRST", "FOLLOWING", "FOR", "FORMAT", "FROM", "FULL", 
			"FUNCTIONS", "GRANT", "GRANTED", "GRANTS", "GRAPHVIZ", "GROUP", "GROUPING", 
			"GROUPS", "HAVING", "HOUR", "IF", "IGNORE", "IN", "INCLUDING", "INNER", 
			"INPUT", "INSERT", "INTERSECT", "INTERVAL", "INTO", "INVOKER", "IO", 
			"IS", "ISOLATION", "JOIN", "JSON", "LAST", "LATERAL", "LEFT", "LEVEL", 
			"LIKE", "LIMIT", "LOCALTIME", "LOCALTIMESTAMP", "LOGICAL", "MAP", "MATCHED", 
			"MATERIALIZED", "MERGE", "MINUTE", "MONTH", "NATURAL", "NEXT", "NFC", 
			"NFD", "NFKC", "NFKD", "NO", "NONE", "NORMALIZE", "NOT", "NULL", "NULLIF", 
			"NULLS", "OFFSET", "ON", "ONLY", "OPTION", "OR", "ORDER", "ORDINALITY", 
			"OUTER", "OUTPUT", "OVER", "PARTITION", "PARTITIONS", "PATH", "POSITION", 
			"PRECEDING", "PRECISION", "PREPARE", "PRIVILEGES", "PROPERTIES", "RANGE", 
			"READ", "RECURSIVE", "REFRESH", "RENAME", "REPEATABLE", "REPLACE", "RESET", 
			"RESPECT", "RESTRICT", "REVOKE", "RIGHT", "ROLE", "ROLES", "ROLLBACK", 
			"ROLLUP", "ROW", "ROWS", "SCHEMA", "SCHEMAS", "SECOND", "SECURITY", "SELECT", 
			"SERIALIZABLE", "SESSION", "SET", "SETS", "SHOW", "SOME", "START", "STATS", 
			"SUBSTRING", "SYSTEM", "TABLE", "TABLES", "TABLESAMPLE", "TEXT", "THEN", 
			"TIES", "TIME", "TIMESTAMP", "TO", "TRANSACTION", "TRUE", "TRY_CAST", 
			"TYPE", "UESCAPE", "UNBOUNDED", "UNCOMMITTED", "UNION", "UNNEST", "UPDATE", 
			"USE", "USER", "USING", "VALIDATE", "VALUES", "VERBOSE", "VIEW", "WHEN", 
			"WHERE", "WINDOW", "WITH", "WITHOUT", "WORK", "WRITE", "YEAR", "ZONE", 
			"EQ", "NEQ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", 
			"PERCENT", "CONCAT", "STRING", "UNICODE_STRING", "BINARY_LITERAL", "INTEGER_VALUE", 
			"DECIMAL_VALUE", "DOUBLE_VALUE", "IDENTIFIER", "DIGIT_IDENTIFIER", "QUOTED_IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", 
			"PARAMETER", "UNRECOGNIZED", "DELIMITER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TrinoSqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TrinoSqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TrinoSqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			statement();
			setState(147);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandaloneExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TrinoSqlBaseParser.EOF, 0); }
		public StandaloneExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterStandaloneExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitStandaloneExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitStandaloneExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneExpressionContext standaloneExpression() throws RecognitionException {
		StandaloneExpressionContext _localctx = new StandaloneExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_standaloneExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			expression();
			setState(150);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandalonePathSpecificationContext extends ParserRuleContext {
		public PathSpecificationContext pathSpecification() {
			return getRuleContext(PathSpecificationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TrinoSqlBaseParser.EOF, 0); }
		public StandalonePathSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalonePathSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterStandalonePathSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitStandalonePathSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitStandalonePathSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandalonePathSpecificationContext standalonePathSpecification() throws RecognitionException {
		StandalonePathSpecificationContext _localctx = new StandalonePathSpecificationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_standalonePathSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			pathSpecification();
			setState(153);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandaloneTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TrinoSqlBaseParser.EOF, 0); }
		public StandaloneTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterStandaloneType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitStandaloneType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitStandaloneType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneTypeContext standaloneType() throws RecognitionException {
		StandaloneTypeContext _localctx = new StandaloneTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_standaloneType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			type(0);
			setState(156);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(TrinoSqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ANALYZE() { return getToken(TrinoSqlBaseParser.ANALYZE, 0); }
		public TerminalNode VERBOSE() { return getToken(TrinoSqlBaseParser.VERBOSE, 0); }
		public List<ExplainOptionContext> explainOption() {
			return getRuleContexts(ExplainOptionContext.class);
		}
		public ExplainOptionContext explainOption(int i) {
			return getRuleContext(ExplainOptionContext.class,i);
		}
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrepareContext extends StatementContext {
		public TerminalNode PREPARE() { return getToken(TrinoSqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public PrepareContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterPrepare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitPrepare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitPrepare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropMaterializedViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(TrinoSqlBaseParser.DROP, 0); }
		public TerminalNode MATERIALIZED() { return getToken(TrinoSqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public DropMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterDropMaterializedView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitDropMaterializedView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitDropMaterializedView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext schema;
		public IdentifierContext catalog;
		public TerminalNode USE() { return getToken(TrinoSqlBaseParser.USE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeallocateContext extends StatementContext {
		public TerminalNode DEALLOCATE() { return getToken(TrinoSqlBaseParser.DEALLOCATE, 0); }
		public TerminalNode PREPARE() { return getToken(TrinoSqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeallocateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterDeallocate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitDeallocate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitDeallocate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public QualifiedNameContext from;
		public QualifiedNameContext to;
		public TerminalNode ALTER() { return getToken(TrinoSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(TrinoSqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommitContext extends StatementContext {
		public TerminalNode COMMIT() { return getToken(TrinoSqlBaseParser.COMMIT, 0); }
		public TerminalNode WORK() { return getToken(TrinoSqlBaseParser.WORK, 0); }
		public CommitContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterCommit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitCommit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateRoleContext extends StatementContext {
		public IdentifierContext name;
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(TrinoSqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public TerminalNode ADMIN() { return getToken(TrinoSqlBaseParser.ADMIN, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public CreateRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterCreateRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitCreateRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitCreateRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public QualifiedNameContext column;
		public TerminalNode ALTER() { return getToken(TrinoSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public TerminalNode DROP() { return getToken(TrinoSqlBaseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(TrinoSqlBaseParser.COLUMN, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(TrinoSqlBaseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(TrinoSqlBaseParser.IF, i);
		}
		public List<TerminalNode> EXISTS() { return getTokens(TrinoSqlBaseParser.EXISTS); }
		public TerminalNode EXISTS(int i) {
			return getToken(TrinoSqlBaseParser.EXISTS, i);
		}
		public DropColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterDropColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitDropColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(TrinoSqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(TrinoSqlBaseParser.TABLES, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(TrinoSqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(TrinoSqlBaseParser.IN, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(TrinoSqlBaseParser.ESCAPE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetViewAuthorizationContext extends StatementContext {
		public QualifiedNameContext from;
		public TerminalNode ALTER() { return getToken(TrinoSqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public TerminalNode SET() { return getToken(TrinoSqlBaseParser.SET, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(TrinoSqlBaseParser.AUTHORIZATION, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SetViewAuthorizationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSetViewAuthorization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSetViewAuthorization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSetViewAuthorization(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCatalogsContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode CATALOGS() { return getToken(TrinoSqlBaseParser.CATALOGS, 0); }
		public TerminalNode LIKE() { return getToken(TrinoSqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(TrinoSqlBaseParser.ESCAPE, 0); }
		public ShowCatalogsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterShowCatalogs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitShowCatalogs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitShowCatalogs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowRolesContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode ROLES() { return getToken(TrinoSqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(TrinoSqlBaseParser.CURRENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(TrinoSqlBaseParser.IN, 0); }
		public ShowRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterShowRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitShowRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitShowRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeContext extends StatementContext {
		public TerminalNode MERGE() { return getToken(TrinoSqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(TrinoSqlBaseParser.INTO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode USING() { return getToken(TrinoSqlBaseParser.USING, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TerminalNode ON() { return getToken(TrinoSqlBaseParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<MergeCaseContext> mergeCase() {
			return getRuleContexts(MergeCaseContext.class);
		}
		public MergeCaseContext mergeCase(int i) {
			return getRuleContext(MergeCaseContext.class,i);
		}
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public MergeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterMerge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitMerge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitMerge(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode ALTER() { return getToken(TrinoSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(TrinoSqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(TrinoSqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(TrinoSqlBaseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(TrinoSqlBaseParser.IF, i);
		}
		public List<TerminalNode> EXISTS() { return getTokens(TrinoSqlBaseParser.EXISTS); }
		public TerminalNode EXISTS(int i) {
			return getToken(TrinoSqlBaseParser.EXISTS, i);
		}
		public RenameColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterRenameColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitRenameColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitRenameColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentColumnContext extends StatementContext {
		public TerminalNode COMMENT() { return getToken(TrinoSqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(TrinoSqlBaseParser.ON, 0); }
		public TerminalNode COLUMN() { return getToken(TrinoSqlBaseParser.COLUMN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IS() { return getToken(TrinoSqlBaseParser.IS, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NULL() { return getToken(TrinoSqlBaseParser.NULL, 0); }
		public CommentColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterCommentColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitCommentColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitCommentColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RevokeRolesContext extends StatementContext {
		public TerminalNode REVOKE() { return getToken(TrinoSqlBaseParser.REVOKE, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public List<PrincipalContext> principal() {
			return getRuleContexts(PrincipalContext.class);
		}
		public PrincipalContext principal(int i) {
			return getRuleContext(PrincipalContext.class,i);
		}
		public TerminalNode ADMIN() { return getToken(TrinoSqlBaseParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(TrinoSqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(TrinoSqlBaseParser.FOR, 0); }
		public TerminalNode GRANTED() { return getToken(TrinoSqlBaseParser.GRANTED, 0); }
		public TerminalNode BY() { return getToken(TrinoSqlBaseParser.BY, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public RevokeRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterRevokeRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitRevokeRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitRevokeRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(TrinoSqlBaseParser.COLUMNS, 0); }
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(TrinoSqlBaseParser.IN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(TrinoSqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(TrinoSqlBaseParser.ESCAPE, 0); }
		public TerminalNode DESCRIBE() { return getToken(TrinoSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(TrinoSqlBaseParser.DESC, 0); }
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowRoleGrantsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode ROLE() { return getToken(TrinoSqlBaseParser.ROLE, 0); }
		public TerminalNode GRANTS() { return getToken(TrinoSqlBaseParser.GRANTS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(TrinoSqlBaseParser.IN, 0); }
		public ShowRoleGrantsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterShowRoleGrants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitShowRoleGrants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitShowRoleGrants(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public ColumnDefinitionContext column;
		public TerminalNode ALTER() { return getToken(TrinoSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public TerminalNode ADD() { return getToken(TrinoSqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(TrinoSqlBaseParser.COLUMN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public List<TerminalNode> IF() { return getTokens(TrinoSqlBaseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(TrinoSqlBaseParser.IF, i);
		}
		public List<TerminalNode> EXISTS() { return getTokens(TrinoSqlBaseParser.EXISTS); }
		public TerminalNode EXISTS(int i) {
			return getToken(TrinoSqlBaseParser.EXISTS, i);
		}
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public AddColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitAddColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetSessionContext extends StatementContext {
		public TerminalNode RESET() { return getToken(TrinoSqlBaseParser.RESET, 0); }
		public TerminalNode SESSION() { return getToken(TrinoSqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ResetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterResetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitResetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitResetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(TrinoSqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(TrinoSqlBaseParser.INTO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public InsertIntoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSessionContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode SESSION() { return getToken(TrinoSqlBaseParser.SESSION, 0); }
		public TerminalNode LIKE() { return getToken(TrinoSqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(TrinoSqlBaseParser.ESCAPE, 0); }
		public ShowSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterShowSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitShowSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitShowSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateSchemaContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(TrinoSqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(TrinoSqlBaseParser.AUTHORIZATION, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterCreateSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitCreateSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitCreateSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExecuteContext extends StatementContext {
		public TerminalNode EXECUTE() { return getToken(TrinoSqlBaseParser.EXECUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode USING() { return getToken(TrinoSqlBaseParser.USING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExecuteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameSchemaContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(TrinoSqlBaseParser.ALTER, 0); }
		public TerminalNode SCHEMA() { return getToken(TrinoSqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(TrinoSqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RenameSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterRenameSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitRenameSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitRenameSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropRoleContext extends StatementContext {
		public IdentifierContext name;
		public TerminalNode DROP() { return getToken(TrinoSqlBaseParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(TrinoSqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DropRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterDropRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitDropRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitDropRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(TrinoSqlBaseParser.ANALYZE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetRoleContext extends StatementContext {
		public IdentifierContext role;
		public TerminalNode SET() { return getToken(TrinoSqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(TrinoSqlBaseParser.ROLE, 0); }
		public TerminalNode ALL() { return getToken(TrinoSqlBaseParser.ALL, 0); }
		public TerminalNode NONE() { return getToken(TrinoSqlBaseParser.NONE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SetRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSetRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSetRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSetRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowGrantsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode GRANTS() { return getToken(TrinoSqlBaseParser.GRANTS, 0); }
		public TerminalNode ON() { return getToken(TrinoSqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public ShowGrantsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterShowGrants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitShowGrants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitShowGrants(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropSchemaContext extends StatementContext {
		public TerminalNode DROP() { return getToken(TrinoSqlBaseParser.DROP, 0); }
		public TerminalNode SCHEMA() { return getToken(TrinoSqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(TrinoSqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(TrinoSqlBaseParser.RESTRICT, 0); }
		public DropSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterDropSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitDropSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitDropSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableAuthorizationContext extends StatementContext {
		public QualifiedNameContext tableName;
		public TerminalNode ALTER() { return getToken(TrinoSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public TerminalNode SET() { return getToken(TrinoSqlBaseParser.SET, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(TrinoSqlBaseParser.AUTHORIZATION, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SetTableAuthorizationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSetTableAuthorization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSetTableAuthorization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSetTableAuthorization(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateViewContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterShowCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitShowCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitShowCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(TrinoSqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StartTransactionContext extends StatementContext {
		public TerminalNode START() { return getToken(TrinoSqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(TrinoSqlBaseParser.TRANSACTION, 0); }
		public List<TransactionModeContext> transactionMode() {
			return getRuleContexts(TransactionModeContext.class);
		}
		public TransactionModeContext transactionMode(int i) {
			return getRuleContext(TransactionModeContext.class,i);
		}
		public StartTransactionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterStartTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitStartTransaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitStartTransaction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableAsSelectContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(TrinoSqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> WITH() { return getTokens(TrinoSqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(TrinoSqlBaseParser.WITH, i);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public TerminalNode DATA() { return getToken(TrinoSqlBaseParser.DATA, 0); }
		public TerminalNode NO() { return getToken(TrinoSqlBaseParser.NO, 0); }
		public CreateTableAsSelectContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterCreateTableAsSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitCreateTableAsSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitCreateTableAsSelect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowStatsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode STATS() { return getToken(TrinoSqlBaseParser.STATS, 0); }
		public TerminalNode FOR() { return getToken(TrinoSqlBaseParser.FOR, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowStatsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterShowStats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitShowStats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitShowStats(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateSchemaContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(TrinoSqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterShowCreateSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitShowCreateSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitShowCreateSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RevokeContext extends StatementContext {
		public PrincipalContext grantee;
		public TerminalNode REVOKE() { return getToken(TrinoSqlBaseParser.REVOKE, 0); }
		public TerminalNode ON() { return getToken(TrinoSqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(TrinoSqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(TrinoSqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode GRANT() { return getToken(TrinoSqlBaseParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(TrinoSqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(TrinoSqlBaseParser.FOR, 0); }
		public TerminalNode SCHEMA() { return getToken(TrinoSqlBaseParser.SCHEMA, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public RevokeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterRevoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitRevoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitRevoke(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateContext extends StatementContext {
		public BooleanExpressionContext where;
		public TerminalNode UPDATE() { return getToken(TrinoSqlBaseParser.UPDATE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(TrinoSqlBaseParser.SET, 0); }
		public List<UpdateAssignmentContext> updateAssignment() {
			return getRuleContexts(UpdateAssignmentContext.class);
		}
		public UpdateAssignmentContext updateAssignment(int i) {
			return getRuleContext(UpdateAssignmentContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(TrinoSqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public UpdateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteContext extends StatementContext {
		public TerminalNode DELETE() { return getToken(TrinoSqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(TrinoSqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public DeleteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeInputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(TrinoSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode INPUT() { return getToken(TrinoSqlBaseParser.INPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeInputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterDescribeInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitDescribeInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitDescribeInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowStatsForQueryContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode STATS() { return getToken(TrinoSqlBaseParser.STATS, 0); }
		public TerminalNode FOR() { return getToken(TrinoSqlBaseParser.FOR, 0); }
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public ShowStatsForQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterShowStatsForQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitShowStatsForQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitShowStatsForQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateMaterializedViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(TrinoSqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(TrinoSqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(TrinoSqlBaseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(TrinoSqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterCreateMaterializedView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitCreateMaterializedView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitCreateMaterializedView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetSessionContext extends StatementContext {
		public TerminalNode SET() { return getToken(TrinoSqlBaseParser.SET, 0); }
		public TerminalNode SESSION() { return getToken(TrinoSqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(TrinoSqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(TrinoSqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(TrinoSqlBaseParser.REPLACE, 0); }
		public TerminalNode COMMENT() { return getToken(TrinoSqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode SECURITY() { return getToken(TrinoSqlBaseParser.SECURITY, 0); }
		public TerminalNode DEFINER() { return getToken(TrinoSqlBaseParser.DEFINER, 0); }
		public TerminalNode INVOKER() { return getToken(TrinoSqlBaseParser.INVOKER, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSchemasContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode SCHEMAS() { return getToken(TrinoSqlBaseParser.SCHEMAS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(TrinoSqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(TrinoSqlBaseParser.IN, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(TrinoSqlBaseParser.ESCAPE, 0); }
		public ShowSchemasContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterShowSchemas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitShowSchemas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitShowSchemas(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(TrinoSqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetSchemaAuthorizationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(TrinoSqlBaseParser.ALTER, 0); }
		public TerminalNode SCHEMA() { return getToken(TrinoSqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(TrinoSqlBaseParser.SET, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(TrinoSqlBaseParser.AUTHORIZATION, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public SetSchemaAuthorizationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSetSchemaAuthorization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSetSchemaAuthorization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSetSchemaAuthorization(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollbackContext extends StatementContext {
		public TerminalNode ROLLBACK() { return getToken(TrinoSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode WORK() { return getToken(TrinoSqlBaseParser.WORK, 0); }
		public RollbackContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterRollback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitRollback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentTableContext extends StatementContext {
		public TerminalNode COMMENT() { return getToken(TrinoSqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(TrinoSqlBaseParser.ON, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IS() { return getToken(TrinoSqlBaseParser.IS, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NULL() { return getToken(TrinoSqlBaseParser.NULL, 0); }
		public CommentTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterCommentTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitCommentTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitCommentTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameViewContext extends StatementContext {
		public QualifiedNameContext from;
		public QualifiedNameContext to;
		public TerminalNode ALTER() { return getToken(TrinoSqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public TerminalNode RENAME() { return getToken(TrinoSqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public RenameViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterRenameView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitRenameView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitRenameView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetPathContext extends StatementContext {
		public TerminalNode SET() { return getToken(TrinoSqlBaseParser.SET, 0); }
		public TerminalNode PATH() { return getToken(TrinoSqlBaseParser.PATH, 0); }
		public PathSpecificationContext pathSpecification() {
			return getRuleContext(PathSpecificationContext.class,0);
		}
		public SetPathContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSetPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSetPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSetPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrantRolesContext extends StatementContext {
		public TerminalNode GRANT() { return getToken(TrinoSqlBaseParser.GRANT, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public List<PrincipalContext> principal() {
			return getRuleContexts(PrincipalContext.class);
		}
		public PrincipalContext principal(int i) {
			return getRuleContext(PrincipalContext.class,i);
		}
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public TerminalNode ADMIN() { return getToken(TrinoSqlBaseParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(TrinoSqlBaseParser.OPTION, 0); }
		public TerminalNode GRANTED() { return getToken(TrinoSqlBaseParser.GRANTED, 0); }
		public TerminalNode BY() { return getToken(TrinoSqlBaseParser.BY, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public GrantRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterGrantRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitGrantRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitGrantRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallContext extends StatementContext {
		public TerminalNode CALL() { return getToken(TrinoSqlBaseParser.CALL, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<CallArgumentContext> callArgument() {
			return getRuleContexts(CallArgumentContext.class);
		}
		public CallArgumentContext callArgument(int i) {
			return getRuleContext(CallArgumentContext.class,i);
		}
		public CallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshMaterializedViewContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(TrinoSqlBaseParser.REFRESH, 0); }
		public TerminalNode MATERIALIZED() { return getToken(TrinoSqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public RefreshMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterRefreshMaterializedView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitRefreshMaterializedView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitRefreshMaterializedView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateMaterializedViewContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(TrinoSqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterShowCreateMaterializedView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitShowCreateMaterializedView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitShowCreateMaterializedView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(TrinoSqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode LIKE() { return getToken(TrinoSqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(TrinoSqlBaseParser.ESCAPE, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeOutputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(TrinoSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode OUTPUT() { return getToken(TrinoSqlBaseParser.OUTPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeOutputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterDescribeOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitDescribeOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitDescribeOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrantContext extends StatementContext {
		public PrincipalContext grantee;
		public List<TerminalNode> GRANT() { return getTokens(TrinoSqlBaseParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(TrinoSqlBaseParser.GRANT, i);
		}
		public TerminalNode ON() { return getToken(TrinoSqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(TrinoSqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(TrinoSqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(TrinoSqlBaseParser.OPTION, 0); }
		public TerminalNode SCHEMA() { return getToken(TrinoSqlBaseParser.SCHEMA, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public GrantContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterGrant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitGrant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitGrant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(USE);
				setState(160);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(USE);
				setState(162);
				((UseContext)_localctx).catalog = identifier();
				setState(163);
				match(T__0);
				setState(164);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 4:
				_localctx = new CreateSchemaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				match(CREATE);
				setState(167);
				match(SCHEMA);
				setState(171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(168);
					match(IF);
					setState(169);
					match(NOT);
					setState(170);
					match(EXISTS);
					}
					break;
				}
				setState(173);
				qualifiedName();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUTHORIZATION) {
					{
					setState(174);
					match(AUTHORIZATION);
					setState(175);
					principal();
					}
				}

				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(178);
					match(WITH);
					setState(179);
					properties();
					}
				}

				}
				break;
			case 5:
				_localctx = new DropSchemaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				match(DROP);
				setState(183);
				match(SCHEMA);
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(184);
					match(IF);
					setState(185);
					match(EXISTS);
					}
					break;
				}
				setState(188);
				qualifiedName();
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(189);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 6:
				_localctx = new RenameSchemaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(192);
				match(ALTER);
				setState(193);
				match(SCHEMA);
				setState(194);
				qualifiedName();
				setState(195);
				match(RENAME);
				setState(196);
				match(TO);
				setState(197);
				identifier();
				}
				break;
			case 7:
				_localctx = new SetSchemaAuthorizationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(199);
				match(ALTER);
				setState(200);
				match(SCHEMA);
				setState(201);
				qualifiedName();
				setState(202);
				match(SET);
				setState(203);
				match(AUTHORIZATION);
				setState(204);
				principal();
				}
				break;
			case 8:
				_localctx = new CreateTableAsSelectContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(206);
				match(CREATE);
				setState(207);
				match(TABLE);
				setState(211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(208);
					match(IF);
					setState(209);
					match(NOT);
					setState(210);
					match(EXISTS);
					}
					break;
				}
				setState(213);
				qualifiedName();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(214);
					columnAliases();
					}
				}

				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(217);
					match(COMMENT);
					setState(218);
					string();
					}
				}

				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(221);
					match(WITH);
					setState(222);
					properties();
					}
				}

				setState(225);
				match(AS);
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(226);
					query();
					}
					break;
				case 2:
					{
					setState(227);
					match(T__1);
					setState(228);
					query();
					setState(229);
					match(T__2);
					}
					break;
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(233);
					match(WITH);
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(234);
						match(NO);
						}
					}

					setState(237);
					match(DATA);
					}
				}

				}
				break;
			case 9:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(240);
				match(CREATE);
				setState(241);
				match(TABLE);
				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(242);
					match(IF);
					setState(243);
					match(NOT);
					setState(244);
					match(EXISTS);
					}
					break;
				}
				setState(247);
				qualifiedName();
				setState(248);
				match(T__1);
				setState(249);
				tableElement();
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(250);
					match(T__3);
					setState(251);
					tableElement();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				match(T__2);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(258);
					match(COMMENT);
					setState(259);
					string();
					}
				}

				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(262);
					match(WITH);
					setState(263);
					properties();
					}
				}

				}
				break;
			case 10:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(266);
				match(DROP);
				setState(267);
				match(TABLE);
				setState(270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(268);
					match(IF);
					setState(269);
					match(EXISTS);
					}
					break;
				}
				setState(272);
				qualifiedName();
				}
				break;
			case 11:
				_localctx = new InsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(273);
				match(INSERT);
				setState(274);
				match(INTO);
				setState(275);
				qualifiedName();
				setState(277);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(276);
					columnAliases();
					}
					break;
				}
				setState(279);
				query();
				}
				break;
			case 12:
				_localctx = new DeleteContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(281);
				match(DELETE);
				setState(282);
				match(FROM);
				setState(283);
				qualifiedName();
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(284);
					match(WHERE);
					setState(285);
					booleanExpression(0);
					}
				}

				}
				break;
			case 13:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(288);
				match(ALTER);
				setState(289);
				match(TABLE);
				setState(292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(290);
					match(IF);
					setState(291);
					match(EXISTS);
					}
					break;
				}
				setState(294);
				((RenameTableContext)_localctx).from = qualifiedName();
				setState(295);
				match(RENAME);
				setState(296);
				match(TO);
				setState(297);
				((RenameTableContext)_localctx).to = qualifiedName();
				}
				break;
			case 14:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(299);
				match(COMMENT);
				setState(300);
				match(ON);
				setState(301);
				match(TABLE);
				setState(302);
				qualifiedName();
				setState(303);
				match(IS);
				setState(306);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
				case UNICODE_STRING:
					{
					setState(304);
					string();
					}
					break;
				case NULL:
					{
					setState(305);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 15:
				_localctx = new CommentColumnContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(308);
				match(COMMENT);
				setState(309);
				match(ON);
				setState(310);
				match(COLUMN);
				setState(311);
				qualifiedName();
				setState(312);
				match(IS);
				setState(315);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
				case UNICODE_STRING:
					{
					setState(313);
					string();
					}
					break;
				case NULL:
					{
					setState(314);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 16:
				_localctx = new RenameColumnContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(317);
				match(ALTER);
				setState(318);
				match(TABLE);
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(319);
					match(IF);
					setState(320);
					match(EXISTS);
					}
					break;
				}
				setState(323);
				((RenameColumnContext)_localctx).tableName = qualifiedName();
				setState(324);
				match(RENAME);
				setState(325);
				match(COLUMN);
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(326);
					match(IF);
					setState(327);
					match(EXISTS);
					}
					break;
				}
				setState(330);
				((RenameColumnContext)_localctx).from = identifier();
				setState(331);
				match(TO);
				setState(332);
				((RenameColumnContext)_localctx).to = identifier();
				}
				break;
			case 17:
				_localctx = new DropColumnContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(334);
				match(ALTER);
				setState(335);
				match(TABLE);
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(336);
					match(IF);
					setState(337);
					match(EXISTS);
					}
					break;
				}
				setState(340);
				((DropColumnContext)_localctx).tableName = qualifiedName();
				setState(341);
				match(DROP);
				setState(342);
				match(COLUMN);
				setState(345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(343);
					match(IF);
					setState(344);
					match(EXISTS);
					}
					break;
				}
				setState(347);
				((DropColumnContext)_localctx).column = qualifiedName();
				}
				break;
			case 18:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(349);
				match(ALTER);
				setState(350);
				match(TABLE);
				setState(353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(351);
					match(IF);
					setState(352);
					match(EXISTS);
					}
					break;
				}
				setState(355);
				((AddColumnContext)_localctx).tableName = qualifiedName();
				setState(356);
				match(ADD);
				setState(357);
				match(COLUMN);
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(358);
					match(IF);
					setState(359);
					match(NOT);
					setState(360);
					match(EXISTS);
					}
					break;
				}
				setState(363);
				((AddColumnContext)_localctx).column = columnDefinition();
				}
				break;
			case 19:
				_localctx = new SetTableAuthorizationContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(365);
				match(ALTER);
				setState(366);
				match(TABLE);
				setState(367);
				((SetTableAuthorizationContext)_localctx).tableName = qualifiedName();
				setState(368);
				match(SET);
				setState(369);
				match(AUTHORIZATION);
				setState(370);
				principal();
				}
				break;
			case 20:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(372);
				match(ANALYZE);
				setState(373);
				qualifiedName();
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(374);
					match(WITH);
					setState(375);
					properties();
					}
				}

				}
				break;
			case 21:
				_localctx = new CreateMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(378);
				match(CREATE);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(379);
					match(OR);
					setState(380);
					match(REPLACE);
					}
				}

				setState(383);
				match(MATERIALIZED);
				setState(384);
				match(VIEW);
				setState(388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(385);
					match(IF);
					setState(386);
					match(NOT);
					setState(387);
					match(EXISTS);
					}
					break;
				}
				setState(390);
				qualifiedName();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(391);
					match(COMMENT);
					setState(392);
					string();
					}
				}

				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(395);
					match(WITH);
					setState(396);
					properties();
					}
				}

				setState(399);
				match(AS);
				setState(400);
				query();
				}
				break;
			case 22:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(402);
				match(CREATE);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(403);
					match(OR);
					setState(404);
					match(REPLACE);
					}
				}

				setState(407);
				match(VIEW);
				setState(408);
				qualifiedName();
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(409);
					match(COMMENT);
					setState(410);
					string();
					}
				}

				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SECURITY) {
					{
					setState(413);
					match(SECURITY);
					setState(414);
					_la = _input.LA(1);
					if ( !(_la==DEFINER || _la==INVOKER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(417);
				match(AS);
				setState(418);
				query();
				}
				break;
			case 23:
				_localctx = new RefreshMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(420);
				match(REFRESH);
				setState(421);
				match(MATERIALIZED);
				setState(422);
				match(VIEW);
				setState(423);
				qualifiedName();
				}
				break;
			case 24:
				_localctx = new DropMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(424);
				match(DROP);
				setState(425);
				match(MATERIALIZED);
				setState(426);
				match(VIEW);
				setState(429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(427);
					match(IF);
					setState(428);
					match(EXISTS);
					}
					break;
				}
				setState(431);
				qualifiedName();
				}
				break;
			case 25:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(432);
				match(DROP);
				setState(433);
				match(VIEW);
				setState(436);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(434);
					match(IF);
					setState(435);
					match(EXISTS);
					}
					break;
				}
				setState(438);
				qualifiedName();
				}
				break;
			case 26:
				_localctx = new RenameViewContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(439);
				match(ALTER);
				setState(440);
				match(VIEW);
				setState(441);
				((RenameViewContext)_localctx).from = qualifiedName();
				setState(442);
				match(RENAME);
				setState(443);
				match(TO);
				setState(444);
				((RenameViewContext)_localctx).to = qualifiedName();
				}
				break;
			case 27:
				_localctx = new SetViewAuthorizationContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(446);
				match(ALTER);
				setState(447);
				match(VIEW);
				setState(448);
				((SetViewAuthorizationContext)_localctx).from = qualifiedName();
				setState(449);
				match(SET);
				setState(450);
				match(AUTHORIZATION);
				setState(451);
				principal();
				}
				break;
			case 28:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(453);
				match(CALL);
				setState(454);
				qualifiedName();
				setState(455);
				match(T__1);
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCHED - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MERGE - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (STRING - 192)) | (1L << (UNICODE_STRING - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)) | (1L << (PARAMETER - 192)))) != 0)) {
					{
					setState(456);
					callArgument();
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(457);
						match(T__3);
						setState(458);
						callArgument();
						}
						}
						setState(463);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(466);
				match(T__2);
				}
				break;
			case 29:
				_localctx = new CreateRoleContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(468);
				match(CREATE);
				setState(469);
				match(ROLE);
				setState(470);
				((CreateRoleContext)_localctx).name = identifier();
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(471);
					match(WITH);
					setState(472);
					match(ADMIN);
					setState(473);
					grantor();
					}
				}

				}
				break;
			case 30:
				_localctx = new DropRoleContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(476);
				match(DROP);
				setState(477);
				match(ROLE);
				setState(478);
				((DropRoleContext)_localctx).name = identifier();
				}
				break;
			case 31:
				_localctx = new GrantRolesContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(479);
				match(GRANT);
				setState(480);
				roles();
				setState(481);
				match(TO);
				setState(482);
				principal();
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(483);
					match(T__3);
					setState(484);
					principal();
					}
					}
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(490);
					match(WITH);
					setState(491);
					match(ADMIN);
					setState(492);
					match(OPTION);
					}
				}

				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANTED) {
					{
					setState(495);
					match(GRANTED);
					setState(496);
					match(BY);
					setState(497);
					grantor();
					}
				}

				}
				break;
			case 32:
				_localctx = new RevokeRolesContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(500);
				match(REVOKE);
				setState(504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(501);
					match(ADMIN);
					setState(502);
					match(OPTION);
					setState(503);
					match(FOR);
					}
					break;
				}
				setState(506);
				roles();
				setState(507);
				match(FROM);
				setState(508);
				principal();
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(509);
					match(T__3);
					setState(510);
					principal();
					}
					}
					setState(515);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANTED) {
					{
					setState(516);
					match(GRANTED);
					setState(517);
					match(BY);
					setState(518);
					grantor();
					}
				}

				}
				break;
			case 33:
				_localctx = new SetRoleContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(521);
				match(SET);
				setState(522);
				match(ROLE);
				setState(526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(523);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(524);
					match(NONE);
					}
					break;
				case 3:
					{
					setState(525);
					((SetRoleContext)_localctx).role = identifier();
					}
					break;
				}
				}
				break;
			case 34:
				_localctx = new GrantContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(528);
				match(GRANT);
				setState(539);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DELETE:
				case INSERT:
				case SELECT:
					{
					setState(529);
					privilege();
					setState(534);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(530);
						match(T__3);
						setState(531);
						privilege();
						}
						}
						setState(536);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case ALL:
					{
					setState(537);
					match(ALL);
					setState(538);
					match(PRIVILEGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(541);
				match(ON);
				setState(543);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(542);
					_la = _input.LA(1);
					if ( !(_la==SCHEMA || _la==TABLE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(545);
				qualifiedName();
				setState(546);
				match(TO);
				setState(547);
				((GrantContext)_localctx).grantee = principal();
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(548);
					match(WITH);
					setState(549);
					match(GRANT);
					setState(550);
					match(OPTION);
					}
				}

				}
				break;
			case 35:
				_localctx = new RevokeContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(553);
				match(REVOKE);
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANT) {
					{
					setState(554);
					match(GRANT);
					setState(555);
					match(OPTION);
					setState(556);
					match(FOR);
					}
				}

				setState(569);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DELETE:
				case INSERT:
				case SELECT:
					{
					setState(559);
					privilege();
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(560);
						match(T__3);
						setState(561);
						privilege();
						}
						}
						setState(566);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case ALL:
					{
					setState(567);
					match(ALL);
					setState(568);
					match(PRIVILEGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(571);
				match(ON);
				setState(573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(572);
					_la = _input.LA(1);
					if ( !(_la==SCHEMA || _la==TABLE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(575);
				qualifiedName();
				setState(576);
				match(FROM);
				setState(577);
				((RevokeContext)_localctx).grantee = principal();
				}
				break;
			case 36:
				_localctx = new ShowGrantsContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(579);
				match(SHOW);
				setState(580);
				match(GRANTS);
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(581);
					match(ON);
					setState(583);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TABLE) {
						{
						setState(582);
						match(TABLE);
						}
					}

					setState(585);
					qualifiedName();
					}
				}

				}
				break;
			case 37:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(588);
				match(EXPLAIN);
				setState(590);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(589);
					match(ANALYZE);
					}
					break;
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VERBOSE) {
					{
					setState(592);
					match(VERBOSE);
					}
				}

				setState(606);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(595);
					match(T__1);
					setState(596);
					explainOption();
					setState(601);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(597);
						match(T__3);
						setState(598);
						explainOption();
						}
						}
						setState(603);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(604);
					match(T__2);
					}
					break;
				}
				setState(608);
				statement();
				}
				break;
			case 38:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(609);
				match(SHOW);
				setState(610);
				match(CREATE);
				setState(611);
				match(TABLE);
				setState(612);
				qualifiedName();
				}
				break;
			case 39:
				_localctx = new ShowCreateSchemaContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(613);
				match(SHOW);
				setState(614);
				match(CREATE);
				setState(615);
				match(SCHEMA);
				setState(616);
				qualifiedName();
				}
				break;
			case 40:
				_localctx = new ShowCreateViewContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(617);
				match(SHOW);
				setState(618);
				match(CREATE);
				setState(619);
				match(VIEW);
				setState(620);
				qualifiedName();
				}
				break;
			case 41:
				_localctx = new ShowCreateMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(621);
				match(SHOW);
				setState(622);
				match(CREATE);
				setState(623);
				match(MATERIALIZED);
				setState(624);
				match(VIEW);
				setState(625);
				qualifiedName();
				}
				break;
			case 42:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(626);
				match(SHOW);
				setState(627);
				match(TABLES);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(628);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(629);
					qualifiedName();
					}
				}

				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(632);
					match(LIKE);
					setState(633);
					((ShowTablesContext)_localctx).pattern = string();
					setState(636);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(634);
						match(ESCAPE);
						setState(635);
						((ShowTablesContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 43:
				_localctx = new ShowSchemasContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(640);
				match(SHOW);
				setState(641);
				match(SCHEMAS);
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(642);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(643);
					identifier();
					}
				}

				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(646);
					match(LIKE);
					setState(647);
					((ShowSchemasContext)_localctx).pattern = string();
					setState(650);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(648);
						match(ESCAPE);
						setState(649);
						((ShowSchemasContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 44:
				_localctx = new ShowCatalogsContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(654);
				match(SHOW);
				setState(655);
				match(CATALOGS);
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(656);
					match(LIKE);
					setState(657);
					((ShowCatalogsContext)_localctx).pattern = string();
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(658);
						match(ESCAPE);
						setState(659);
						((ShowCatalogsContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 45:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(664);
				match(SHOW);
				setState(665);
				match(COLUMNS);
				setState(666);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCHED - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MERGE - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NULLIF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(667);
					qualifiedName();
					}
				}

				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(670);
					match(LIKE);
					setState(671);
					((ShowColumnsContext)_localctx).pattern = string();
					setState(674);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(672);
						match(ESCAPE);
						setState(673);
						((ShowColumnsContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 46:
				_localctx = new ShowStatsContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(678);
				match(SHOW);
				setState(679);
				match(STATS);
				setState(680);
				match(FOR);
				setState(681);
				qualifiedName();
				}
				break;
			case 47:
				_localctx = new ShowStatsForQueryContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(682);
				match(SHOW);
				setState(683);
				match(STATS);
				setState(684);
				match(FOR);
				setState(685);
				match(T__1);
				setState(686);
				querySpecification();
				setState(687);
				match(T__2);
				}
				break;
			case 48:
				_localctx = new ShowRolesContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(689);
				match(SHOW);
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CURRENT) {
					{
					setState(690);
					match(CURRENT);
					}
				}

				setState(693);
				match(ROLES);
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(694);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(695);
					identifier();
					}
				}

				}
				break;
			case 49:
				_localctx = new ShowRoleGrantsContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(698);
				match(SHOW);
				setState(699);
				match(ROLE);
				setState(700);
				match(GRANTS);
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(701);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(702);
					identifier();
					}
				}

				}
				break;
			case 50:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(705);
				match(DESCRIBE);
				setState(706);
				qualifiedName();
				}
				break;
			case 51:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(707);
				match(DESC);
				setState(708);
				qualifiedName();
				}
				break;
			case 52:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(709);
				match(SHOW);
				setState(710);
				match(FUNCTIONS);
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(711);
					match(LIKE);
					setState(712);
					((ShowFunctionsContext)_localctx).pattern = string();
					setState(715);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(713);
						match(ESCAPE);
						setState(714);
						((ShowFunctionsContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 53:
				_localctx = new ShowSessionContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(719);
				match(SHOW);
				setState(720);
				match(SESSION);
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(721);
					match(LIKE);
					setState(722);
					((ShowSessionContext)_localctx).pattern = string();
					setState(725);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(723);
						match(ESCAPE);
						setState(724);
						((ShowSessionContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 54:
				_localctx = new SetSessionContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(729);
				match(SET);
				setState(730);
				match(SESSION);
				setState(731);
				qualifiedName();
				setState(732);
				match(EQ);
				setState(733);
				expression();
				}
				break;
			case 55:
				_localctx = new ResetSessionContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(735);
				match(RESET);
				setState(736);
				match(SESSION);
				setState(737);
				qualifiedName();
				}
				break;
			case 56:
				_localctx = new StartTransactionContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(738);
				match(START);
				setState(739);
				match(TRANSACTION);
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ISOLATION || _la==READ) {
					{
					setState(740);
					transactionMode();
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(741);
						match(T__3);
						setState(742);
						transactionMode();
						}
						}
						setState(747);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 57:
				_localctx = new CommitContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(750);
				match(COMMIT);
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(751);
					match(WORK);
					}
				}

				}
				break;
			case 58:
				_localctx = new RollbackContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(754);
				match(ROLLBACK);
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(755);
					match(WORK);
					}
				}

				}
				break;
			case 59:
				_localctx = new PrepareContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(758);
				match(PREPARE);
				setState(759);
				identifier();
				setState(760);
				match(FROM);
				setState(761);
				statement();
				}
				break;
			case 60:
				_localctx = new DeallocateContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(763);
				match(DEALLOCATE);
				setState(764);
				match(PREPARE);
				setState(765);
				identifier();
				}
				break;
			case 61:
				_localctx = new ExecuteContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(766);
				match(EXECUTE);
				setState(767);
				identifier();
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(768);
					match(USING);
					setState(769);
					expression();
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(770);
						match(T__3);
						setState(771);
						expression();
						}
						}
						setState(776);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 62:
				_localctx = new DescribeInputContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(779);
				match(DESCRIBE);
				setState(780);
				match(INPUT);
				setState(781);
				identifier();
				}
				break;
			case 63:
				_localctx = new DescribeOutputContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(782);
				match(DESCRIBE);
				setState(783);
				match(OUTPUT);
				setState(784);
				identifier();
				}
				break;
			case 64:
				_localctx = new SetPathContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(785);
				match(SET);
				setState(786);
				match(PATH);
				setState(787);
				pathSpecification();
				}
				break;
			case 65:
				_localctx = new UpdateContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(788);
				match(UPDATE);
				setState(789);
				qualifiedName();
				setState(790);
				match(SET);
				setState(791);
				updateAssignment();
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(792);
					match(T__3);
					setState(793);
					updateAssignment();
					}
					}
					setState(798);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(799);
					match(WHERE);
					setState(800);
					((UpdateContext)_localctx).where = booleanExpression(0);
					}
				}

				}
				break;
			case 66:
				_localctx = new MergeContext(_localctx);
				enterOuterAlt(_localctx, 66);
				{
				setState(803);
				match(MERGE);
				setState(804);
				match(INTO);
				setState(805);
				qualifiedName();
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCHED - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MERGE - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NULLIF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(807);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(806);
						match(AS);
						}
					}

					setState(809);
					identifier();
					}
				}

				setState(812);
				match(USING);
				setState(813);
				relation(0);
				setState(814);
				match(ON);
				setState(815);
				expression();
				setState(817); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(816);
					mergeCase();
					}
					}
					setState(819); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(823);
				with();
				}
			}

			setState(826);
			queryNoWith();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public TerminalNode RECURSIVE() { return getToken(TrinoSqlBaseParser.RECURSIVE, 0); }
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(WITH);
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(829);
				match(RECURSIVE);
				}
			}

			setState(832);
			namedQuery();
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(833);
				match(T__3);
				setState(834);
				namedQuery();
				}
				}
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableElementContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public LikeClauseContext likeClause() {
			return getRuleContext(LikeClauseContext.class,0);
		}
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterTableElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitTableElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitTableElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableElement);
		try {
			setState(842);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DISTRIBUTED:
			case DOUBLE:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATCHED:
			case MATERIALIZED:
			case MERGE:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PATH:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UPDATE:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WINDOW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				columnDefinition();
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				likeClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(TrinoSqlBaseParser.NULL, 0); }
		public TerminalNode COMMENT() { return getToken(TrinoSqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			identifier();
			setState(845);
			type(0);
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(846);
				match(NOT);
				setState(847);
				match(NULL);
				}
			}

			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(850);
				match(COMMENT);
				setState(851);
				string();
				}
			}

			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(854);
				match(WITH);
				setState(855);
				properties();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LikeClauseContext extends ParserRuleContext {
		public Token optionType;
		public TerminalNode LIKE() { return getToken(TrinoSqlBaseParser.LIKE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode PROPERTIES() { return getToken(TrinoSqlBaseParser.PROPERTIES, 0); }
		public TerminalNode INCLUDING() { return getToken(TrinoSqlBaseParser.INCLUDING, 0); }
		public TerminalNode EXCLUDING() { return getToken(TrinoSqlBaseParser.EXCLUDING, 0); }
		public LikeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterLikeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitLikeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitLikeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeClauseContext likeClause() throws RecognitionException {
		LikeClauseContext _localctx = new LikeClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_likeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(LIKE);
			setState(859);
			qualifiedName();
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUDING || _la==INCLUDING) {
				{
				setState(860);
				((LikeClauseContext)_localctx).optionType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EXCLUDING || _la==INCLUDING) ) {
					((LikeClauseContext)_localctx).optionType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(861);
				match(PROPERTIES);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertiesContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(T__1);
			setState(865);
			property();
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(866);
				match(T__3);
				setState(867);
				property();
				}
				}
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(873);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(TrinoSqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			identifier();
			setState(876);
			match(EQ);
			setState(877);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryNoWithContext extends ParserRuleContext {
		public RowCountContext offset;
		public LimitRowCountContext limit;
		public RowCountContext fetchFirst;
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(TrinoSqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(TrinoSqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode OFFSET() { return getToken(TrinoSqlBaseParser.OFFSET, 0); }
		public List<RowCountContext> rowCount() {
			return getRuleContexts(RowCountContext.class);
		}
		public RowCountContext rowCount(int i) {
			return getRuleContext(RowCountContext.class,i);
		}
		public TerminalNode LIMIT() { return getToken(TrinoSqlBaseParser.LIMIT, 0); }
		public TerminalNode FETCH() { return getToken(TrinoSqlBaseParser.FETCH, 0); }
		public LimitRowCountContext limitRowCount() {
			return getRuleContext(LimitRowCountContext.class,0);
		}
		public TerminalNode FIRST() { return getToken(TrinoSqlBaseParser.FIRST, 0); }
		public TerminalNode NEXT() { return getToken(TrinoSqlBaseParser.NEXT, 0); }
		public List<TerminalNode> ROW() { return getTokens(TrinoSqlBaseParser.ROW); }
		public TerminalNode ROW(int i) {
			return getToken(TrinoSqlBaseParser.ROW, i);
		}
		public List<TerminalNode> ROWS() { return getTokens(TrinoSqlBaseParser.ROWS); }
		public TerminalNode ROWS(int i) {
			return getToken(TrinoSqlBaseParser.ROWS, i);
		}
		public TerminalNode ONLY() { return getToken(TrinoSqlBaseParser.ONLY, 0); }
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(TrinoSqlBaseParser.TIES, 0); }
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterQueryNoWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitQueryNoWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitQueryNoWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_queryNoWith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			queryTerm(0);
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(880);
				match(ORDER);
				setState(881);
				match(BY);
				setState(882);
				sortItem();
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(883);
					match(T__3);
					setState(884);
					sortItem();
					}
					}
					setState(889);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(892);
				match(OFFSET);
				setState(893);
				((QueryNoWithContext)_localctx).offset = rowCount();
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW || _la==ROWS) {
					{
					setState(894);
					_la = _input.LA(1);
					if ( !(_la==ROW || _la==ROWS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
			}

			setState(912);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIMIT:
				{
				{
				setState(899);
				match(LIMIT);
				setState(900);
				((QueryNoWithContext)_localctx).limit = limitRowCount();
				}
				}
				break;
			case FETCH:
				{
				{
				setState(901);
				match(FETCH);
				setState(902);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==NEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER_VALUE || _la==PARAMETER) {
					{
					setState(903);
					((QueryNoWithContext)_localctx).fetchFirst = rowCount();
					}
				}

				setState(906);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(910);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ONLY:
					{
					setState(907);
					match(ONLY);
					}
					break;
				case WITH:
					{
					setState(908);
					match(WITH);
					setState(909);
					match(TIES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case EOF:
			case T__2:
			case WITH:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitRowCountContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(TrinoSqlBaseParser.ALL, 0); }
		public RowCountContext rowCount() {
			return getRuleContext(RowCountContext.class,0);
		}
		public LimitRowCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitRowCount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterLimitRowCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitLimitRowCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitLimitRowCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitRowCountContext limitRowCount() throws RecognitionException {
		LimitRowCountContext _localctx = new LimitRowCountContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_limitRowCount);
		try {
			setState(916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				match(ALL);
				}
				break;
			case INTEGER_VALUE:
			case PARAMETER:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				rowCount();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowCountContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(TrinoSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode PARAMETER() { return getToken(TrinoSqlBaseParser.PARAMETER, 0); }
		public RowCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowCount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterRowCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitRowCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitRowCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowCountContext rowCount() throws RecognitionException {
		RowCountContext _localctx = new RowCountContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rowCount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_VALUE || _la==PARAMETER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(TrinoSqlBaseParser.INTERSECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode UNION() { return getToken(TrinoSqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(TrinoSqlBaseParser.EXCEPT, 0); }
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(921);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(937);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(935);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(923);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(924);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(926);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(925);
							setQuantifier();
							}
						}

						setState(928);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(929);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(930);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(932);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(931);
							setQuantifier();
							}
						}

						setState(934);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableContext extends QueryPrimaryContext {
		public TerminalNode VALUES() { return getToken(TrinoSqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InlineTableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_queryPrimary);
		try {
			int _alt;
			setState(956);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(940);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
				match(TABLE);
				setState(942);
				qualifiedName();
				}
				break;
			case VALUES:
				_localctx = new InlineTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(943);
				match(VALUES);
				setState(944);
				expression();
				setState(949);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(945);
						match(T__3);
						setState(946);
						expression();
						}
						} 
					}
					setState(951);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				}
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(952);
				match(T__1);
				setState(953);
				queryNoWith();
				setState(954);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrdering;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(TrinoSqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(TrinoSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(TrinoSqlBaseParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(TrinoSqlBaseParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(TrinoSqlBaseParser.LAST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			expression();
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(959);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(962);
				match(NULLS);
				setState(963);
				((SortItemContext)_localctx).nullOrdering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrdering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public BooleanExpressionContext where;
		public BooleanExpressionContext having;
		public TerminalNode SELECT() { return getToken(TrinoSqlBaseParser.SELECT, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(TrinoSqlBaseParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(TrinoSqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(TrinoSqlBaseParser.BY, 0); }
		public GroupByContext groupBy() {
			return getRuleContext(GroupByContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(TrinoSqlBaseParser.HAVING, 0); }
		public TerminalNode WINDOW() { return getToken(TrinoSqlBaseParser.WINDOW, 0); }
		public List<WindowDefinitionContext> windowDefinition() {
			return getRuleContexts(WindowDefinitionContext.class);
		}
		public WindowDefinitionContext windowDefinition(int i) {
			return getRuleContext(WindowDefinitionContext.class,i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_querySpecification);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			match(SELECT);
			setState(968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(967);
				setQuantifier();
				}
				break;
			}
			setState(970);
			selectItem();
			setState(975);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(971);
					match(T__3);
					setState(972);
					selectItem();
					}
					} 
				}
				setState(977);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			setState(987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(978);
				match(FROM);
				setState(979);
				relation(0);
				setState(984);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(980);
						match(T__3);
						setState(981);
						relation(0);
						}
						} 
					}
					setState(986);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				}
				break;
			}
			setState(991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(989);
				match(WHERE);
				setState(990);
				((QuerySpecificationContext)_localctx).where = booleanExpression(0);
				}
				break;
			}
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(993);
				match(GROUP);
				setState(994);
				match(BY);
				setState(995);
				groupBy();
				}
				break;
			}
			setState(1000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(998);
				match(HAVING);
				setState(999);
				((QuerySpecificationContext)_localctx).having = booleanExpression(0);
				}
				break;
			}
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1002);
				match(WINDOW);
				setState(1003);
				windowDefinition();
				setState(1008);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1004);
						match(T__3);
						setState(1005);
						windowDefinition();
						}
						} 
					}
					setState(1010);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByContext extends ParserRuleContext {
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public GroupByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterGroupBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitGroupBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitGroupBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByContext groupBy() throws RecognitionException {
		GroupByContext _localctx = new GroupByContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_groupBy);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1013);
				setQuantifier();
				}
				break;
			}
			setState(1016);
			groupingElement();
			setState(1021);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1017);
					match(T__3);
					setState(1018);
					groupingElement();
					}
					} 
				}
				setState(1023);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
	 
		public GroupingElementContext() { }
		public void copyFrom(GroupingElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleGroupingSetsContext extends GroupingElementContext {
		public TerminalNode GROUPING() { return getToken(TrinoSqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(TrinoSqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public MultipleGroupingSetsContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterMultipleGroupingSets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitMultipleGroupingSets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitMultipleGroupingSets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleGroupingSetContext extends GroupingElementContext {
		public GroupingSetContext groupingSet() {
			return getRuleContext(GroupingSetContext.class,0);
		}
		public SingleGroupingSetContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSingleGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSingleGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSingleGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CubeContext extends GroupingElementContext {
		public TerminalNode CUBE() { return getToken(TrinoSqlBaseParser.CUBE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CubeContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterCube(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitCube(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitCube(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollupContext extends GroupingElementContext {
		public TerminalNode ROLLUP() { return getToken(TrinoSqlBaseParser.ROLLUP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RollupContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterRollup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitRollup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitRollup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_groupingElement);
		int _la;
		try {
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				_localctx = new SingleGroupingSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1024);
				groupingSet();
				}
				break;
			case 2:
				_localctx = new RollupContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1025);
				match(ROLLUP);
				setState(1026);
				match(T__1);
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCHED - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MERGE - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (STRING - 192)) | (1L << (UNICODE_STRING - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)) | (1L << (PARAMETER - 192)))) != 0)) {
					{
					setState(1027);
					expression();
					setState(1032);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1028);
						match(T__3);
						setState(1029);
						expression();
						}
						}
						setState(1034);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1037);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new CubeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1038);
				match(CUBE);
				setState(1039);
				match(T__1);
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCHED - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MERGE - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (STRING - 192)) | (1L << (UNICODE_STRING - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)) | (1L << (PARAMETER - 192)))) != 0)) {
					{
					setState(1040);
					expression();
					setState(1045);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1041);
						match(T__3);
						setState(1042);
						expression();
						}
						}
						setState(1047);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1050);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new MultipleGroupingSetsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1051);
				match(GROUPING);
				setState(1052);
				match(SETS);
				setState(1053);
				match(T__1);
				setState(1054);
				groupingSet();
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1055);
					match(T__3);
					setState(1056);
					groupingSet();
					}
					}
					setState(1061);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1062);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_groupingSet);
		int _la;
		try {
			setState(1079);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1066);
				match(T__1);
				setState(1075);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCHED - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MERGE - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (STRING - 192)) | (1L << (UNICODE_STRING - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)) | (1L << (PARAMETER - 192)))) != 0)) {
					{
					setState(1067);
					expression();
					setState(1072);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1068);
						match(T__3);
						setState(1069);
						expression();
						}
						}
						setState(1074);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1077);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1078);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public WindowSpecificationContext windowSpecification() {
			return getRuleContext(WindowSpecificationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterWindowDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitWindowDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitWindowDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowDefinitionContext windowDefinition() throws RecognitionException {
		WindowDefinitionContext _localctx = new WindowDefinitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_windowDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			((WindowDefinitionContext)_localctx).name = identifier();
			setState(1082);
			match(AS);
			setState(1083);
			match(T__1);
			setState(1084);
			windowSpecification();
			setState(1085);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecificationContext extends ParserRuleContext {
		public IdentifierContext existingWindowName;
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode PARTITION() { return getToken(TrinoSqlBaseParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(TrinoSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(TrinoSqlBaseParser.BY, i);
		}
		public TerminalNode ORDER() { return getToken(TrinoSqlBaseParser.ORDER, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterWindowSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitWindowSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitWindowSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecificationContext windowSpecification() throws RecognitionException {
		WindowSpecificationContext _localctx = new WindowSpecificationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_windowSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1087);
				((WindowSpecificationContext)_localctx).existingWindowName = identifier();
				}
				break;
			}
			setState(1100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1090);
				match(PARTITION);
				setState(1091);
				match(BY);
				setState(1092);
				((WindowSpecificationContext)_localctx).expression = expression();
				((WindowSpecificationContext)_localctx).partition.add(((WindowSpecificationContext)_localctx).expression);
				setState(1097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1093);
					match(T__3);
					setState(1094);
					((WindowSpecificationContext)_localctx).expression = expression();
					((WindowSpecificationContext)_localctx).partition.add(((WindowSpecificationContext)_localctx).expression);
					}
					}
					setState(1099);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1102);
				match(ORDER);
				setState(1103);
				match(BY);
				setState(1104);
				sortItem();
				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1105);
					match(T__3);
					setState(1106);
					sortItem();
					}
					}
					setState(1111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUPS || _la==RANGE || _la==ROWS) {
				{
				setState(1114);
				windowFrame();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			((NamedQueryContext)_localctx).name = identifier();
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1118);
				columnAliases();
				}
			}

			setState(1121);
			match(AS);
			setState(1122);
			match(T__1);
			setState(1123);
			query();
			setState(1124);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(TrinoSqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(TrinoSqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemContext extends ParserRuleContext {
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	 
		public SelectItemContext() { }
		public void copyFrom(SelectItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectAllContext extends SelectItemContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(TrinoSqlBaseParser.ASTERISK, 0); }
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public SelectAllContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSelectAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectSingleContext extends SelectItemContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public SelectSingleContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSelectSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSelectSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSelectSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_selectItem);
		int _la;
		try {
			setState(1143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				_localctx = new SelectSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1128);
				expression();
				setState(1133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1130);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1129);
						match(AS);
						}
					}

					setState(1132);
					identifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1135);
				primaryExpression(0);
				setState(1136);
				match(T__0);
				setState(1137);
				match(ASTERISK);
				setState(1140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1138);
					match(AS);
					setState(1139);
					columnAliases();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1142);
				match(ASTERISK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationDefaultContext extends RelationContext {
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public RelationDefaultContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterRelationDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitRelationDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitRelationDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinRelationContext extends RelationContext {
		public RelationContext left;
		public SampledRelationContext right;
		public RelationContext rightRelation;
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode CROSS() { return getToken(TrinoSqlBaseParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(TrinoSqlBaseParser.JOIN, 0); }
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(TrinoSqlBaseParser.NATURAL, 0); }
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public JoinRelationContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		return relation(0);
	}

	private RelationContext relation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationContext _localctx = new RelationContext(_ctx, _parentState);
		RelationContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1146);
			sampledRelation();
			}
			_ctx.stop = _input.LT(-1);
			setState(1166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinRelationContext(new RelationContext(_parentctx, _parentState));
					((JoinRelationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_relation);
					setState(1148);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1162);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CROSS:
						{
						setState(1149);
						match(CROSS);
						setState(1150);
						match(JOIN);
						setState(1151);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					case FULL:
					case INNER:
					case JOIN:
					case LEFT:
					case RIGHT:
						{
						setState(1152);
						joinType();
						setState(1153);
						match(JOIN);
						setState(1154);
						((JoinRelationContext)_localctx).rightRelation = relation(0);
						setState(1155);
						joinCriteria();
						}
						break;
					case NATURAL:
						{
						setState(1157);
						match(NATURAL);
						setState(1158);
						joinType();
						setState(1159);
						match(JOIN);
						setState(1160);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(TrinoSqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(TrinoSqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(TrinoSqlBaseParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(TrinoSqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(TrinoSqlBaseParser.FULL, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_joinType);
		int _la;
		try {
			setState(1184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
			case JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1169);
					match(INNER);
					}
				}

				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1172);
				match(LEFT);
				setState(1174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1173);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1176);
				match(RIGHT);
				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1177);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1180);
				match(FULL);
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1181);
					match(OUTER);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(TrinoSqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(TrinoSqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_joinCriteria);
		int _la;
		try {
			setState(1200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1186);
				match(ON);
				setState(1187);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1188);
				match(USING);
				setState(1189);
				match(T__1);
				setState(1190);
				identifier();
				setState(1195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1191);
					match(T__3);
					setState(1192);
					identifier();
					}
					}
					setState(1197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1198);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampledRelationContext extends ParserRuleContext {
		public ExpressionContext percentage;
		public AliasedRelationContext aliasedRelation() {
			return getRuleContext(AliasedRelationContext.class,0);
		}
		public TerminalNode TABLESAMPLE() { return getToken(TrinoSqlBaseParser.TABLESAMPLE, 0); }
		public SampleTypeContext sampleType() {
			return getRuleContext(SampleTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampledRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampledRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSampledRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSampledRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSampledRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampledRelationContext sampledRelation() throws RecognitionException {
		SampledRelationContext _localctx = new SampledRelationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sampledRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			aliasedRelation();
			setState(1209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1203);
				match(TABLESAMPLE);
				setState(1204);
				sampleType();
				setState(1205);
				match(T__1);
				setState(1206);
				((SampledRelationContext)_localctx).percentage = expression();
				setState(1207);
				match(T__2);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleTypeContext extends ParserRuleContext {
		public TerminalNode BERNOULLI() { return getToken(TrinoSqlBaseParser.BERNOULLI, 0); }
		public TerminalNode SYSTEM() { return getToken(TrinoSqlBaseParser.SYSTEM, 0); }
		public SampleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSampleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSampleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSampleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleTypeContext sampleType() throws RecognitionException {
		SampleTypeContext _localctx = new SampleTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sampleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			_la = _input.LA(1);
			if ( !(_la==BERNOULLI || _la==SYSTEM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasedRelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public AliasedRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasedRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasedRelationContext aliasedRelation() throws RecognitionException {
		AliasedRelationContext _localctx = new AliasedRelationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_aliasedRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			relationPrimary();
			setState(1221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1214);
					match(AS);
					}
				}

				setState(1217);
				identifier();
				setState(1219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1218);
					columnAliases();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnAliasesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ColumnAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterColumnAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitColumnAliases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitColumnAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasesContext columnAliases() throws RecognitionException {
		ColumnAliasesContext _localctx = new ColumnAliasesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_columnAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			match(T__1);
			setState(1224);
			identifier();
			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1225);
				match(T__3);
				setState(1226);
				identifier();
				}
				}
				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1232);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryRelationContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSubqueryRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSubqueryRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSubqueryRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public ParenthesizedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterParenthesizedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitParenthesizedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitParenthesizedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnestContext extends RelationPrimaryContext {
		public TerminalNode UNNEST() { return getToken(TrinoSqlBaseParser.UNNEST, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public TerminalNode ORDINALITY() { return getToken(TrinoSqlBaseParser.ORDINALITY, 0); }
		public UnnestContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterUnnest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitUnnest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitUnnest(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LateralContext extends RelationPrimaryContext {
		public TerminalNode LATERAL() { return getToken(TrinoSqlBaseParser.LATERAL, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public LateralContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterLateral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitLateral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitLateral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_relationPrimary);
		int _la;
		try {
			setState(1263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1234);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new SubqueryRelationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1235);
				match(T__1);
				setState(1236);
				query();
				setState(1237);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new UnnestContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1239);
				match(UNNEST);
				setState(1240);
				match(T__1);
				setState(1241);
				expression();
				setState(1246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1242);
					match(T__3);
					setState(1243);
					expression();
					}
					}
					setState(1248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1249);
				match(T__2);
				setState(1252);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1250);
					match(WITH);
					setState(1251);
					match(ORDINALITY);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new LateralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1254);
				match(LATERAL);
				setState(1255);
				match(T__1);
				setState(1256);
				query();
				setState(1257);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new ParenthesizedRelationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1259);
				match(T__1);
				setState(1260);
				relation(0);
				setState(1261);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(TrinoSqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(TrinoSqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CASE:
			case CAST:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_PATH:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DISTRIBUTED:
			case DOUBLE:
			case EXCLUDING:
			case EXISTS:
			case EXPLAIN:
			case EXTRACT:
			case FALSE:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPING:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOGICAL:
			case MAP:
			case MATCHED:
			case MATERIALIZED:
			case MERGE:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NORMALIZE:
			case NULL:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PATH:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRUE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UPDATE:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WINDOW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case PLUS:
			case MINUS:
			case STRING:
			case UNICODE_STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case PARAMETER:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1268);
				((PredicatedContext)_localctx).valueExpression = valueExpression(0);
				setState(1270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1269);
					predicate(((PredicatedContext)_localctx).valueExpression);
					}
					break;
				}
				}
				break;
			case NOT:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1272);
				match(NOT);
				setState(1273);
				booleanExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1282);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1276);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1277);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1278);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1279);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1280);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1281);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public ParserRuleContext value;
		public PredicateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PredicateContext(ParserRuleContext parent, int invokingState, ParserRuleContext value) {
			super(parent, invokingState);
			this.value = value;
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ComparisonContext extends PredicateContext {
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeContext extends PredicateContext {
		public ValueExpressionContext pattern;
		public ValueExpressionContext escape;
		public TerminalNode LIKE() { return getToken(TrinoSqlBaseParser.LIKE, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public TerminalNode ESCAPE() { return getToken(TrinoSqlBaseParser.ESCAPE, 0); }
		public LikeContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InSubqueryContext extends PredicateContext {
		public TerminalNode IN() { return getToken(TrinoSqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public InSubqueryContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterInSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitInSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitInSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DistinctFromContext extends PredicateContext {
		public ValueExpressionContext right;
		public TerminalNode IS() { return getToken(TrinoSqlBaseParser.IS, 0); }
		public TerminalNode DISTINCT() { return getToken(TrinoSqlBaseParser.DISTINCT, 0); }
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public DistinctFromContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterDistinctFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitDistinctFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitDistinctFrom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InListContext extends PredicateContext {
		public TerminalNode IN() { return getToken(TrinoSqlBaseParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public InListContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterInList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitInList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitInList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullPredicateContext extends PredicateContext {
		public TerminalNode IS() { return getToken(TrinoSqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(TrinoSqlBaseParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public NullPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterNullPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitNullPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitNullPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenContext extends PredicateContext {
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public TerminalNode BETWEEN() { return getToken(TrinoSqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(TrinoSqlBaseParser.AND, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public BetweenContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuantifiedComparisonContext extends PredicateContext {
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonQuantifierContext comparisonQuantifier() {
			return getRuleContext(ComparisonQuantifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QuantifiedComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterQuantifiedComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitQuantifiedComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitQuantifiedComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate(ParserRuleContext value) throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState(), value);
		enterRule(_localctx, 74, RULE_predicate);
		int _la;
		try {
			setState(1348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1287);
				comparisonOperator();
				setState(1288);
				((ComparisonContext)_localctx).right = valueExpression(0);
				}
				break;
			case 2:
				_localctx = new QuantifiedComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1290);
				comparisonOperator();
				setState(1291);
				comparisonQuantifier();
				setState(1292);
				match(T__1);
				setState(1293);
				query();
				setState(1294);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new BetweenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1296);
					match(NOT);
					}
				}

				setState(1299);
				match(BETWEEN);
				setState(1300);
				((BetweenContext)_localctx).lower = valueExpression(0);
				setState(1301);
				match(AND);
				setState(1302);
				((BetweenContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 4:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1304);
					match(NOT);
					}
				}

				setState(1307);
				match(IN);
				setState(1308);
				match(T__1);
				setState(1309);
				expression();
				setState(1314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1310);
					match(T__3);
					setState(1311);
					expression();
					}
					}
					setState(1316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1317);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new InSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1319);
					match(NOT);
					}
				}

				setState(1322);
				match(IN);
				setState(1323);
				match(T__1);
				setState(1324);
				query();
				setState(1325);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1327);
					match(NOT);
					}
				}

				setState(1330);
				match(LIKE);
				setState(1331);
				((LikeContext)_localctx).pattern = valueExpression(0);
				setState(1334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1332);
					match(ESCAPE);
					setState(1333);
					((LikeContext)_localctx).escape = valueExpression(0);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new NullPredicateContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1336);
				match(IS);
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1337);
					match(NOT);
					}
				}

				setState(1340);
				match(NULL);
				}
				break;
			case 8:
				_localctx = new DistinctFromContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1341);
				match(IS);
				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1342);
					match(NOT);
					}
				}

				setState(1345);
				match(DISTINCT);
				setState(1346);
				match(FROM);
				setState(1347);
				((DistinctFromContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatenationContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public TerminalNode CONCAT() { return getToken(TrinoSqlBaseParser.CONCAT, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ConcatenationContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitConcatenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(TrinoSqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(TrinoSqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(TrinoSqlBaseParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(TrinoSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TrinoSqlBaseParser.MINUS, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(TrinoSqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(TrinoSqlBaseParser.PLUS, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtTimeZoneContext extends ValueExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode AT() { return getToken(TrinoSqlBaseParser.AT, 0); }
		public TimeZoneSpecifierContext timeZoneSpecifier() {
			return getRuleContext(TimeZoneSpecifierContext.class,0);
		}
		public AtTimeZoneContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterAtTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitAtTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitAtTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1351);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1352);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1353);
				valueExpression(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1368);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1356);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1357);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & ((1L << (ASTERISK - 224)) | (1L << (SLASH - 224)) | (1L << (PERCENT - 224)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1358);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1359);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1360);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1361);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new ConcatenationContext(new ValueExpressionContext(_parentctx, _parentState));
						((ConcatenationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1362);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1363);
						match(CONCAT);
						setState(1364);
						((ConcatenationContext)_localctx).right = valueExpression(2);
						}
						break;
					case 4:
						{
						_localctx = new AtTimeZoneContext(new ValueExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1365);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1366);
						match(AT);
						setState(1367);
						timeZoneSpecifier();
						}
						break;
					}
					} 
				}
				setState(1372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(TrinoSqlBaseParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(TrinoSqlBaseParser.PRECISION, 0); }
		public TypeConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialDateTimeFunctionContext extends PrimaryExpressionContext {
		public Token name;
		public Token precision;
		public TerminalNode CURRENT_DATE() { return getToken(TrinoSqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(TrinoSqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(TrinoSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(TrinoSqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(TrinoSqlBaseParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(TrinoSqlBaseParser.LOCALTIMESTAMP, 0); }
		public SpecialDateTimeFunctionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSpecialDateTimeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSpecialDateTimeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSpecialDateTimeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public TerminalNode SUBSTRING() { return getToken(TrinoSqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(TrinoSqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(TrinoSqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TRY_CAST() { return getToken(TrinoSqlBaseParser.TRY_CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParameterContext extends PrimaryExpressionContext {
		public TerminalNode PARAMETER() { return getToken(TrinoSqlBaseParser.PARAMETER, 0); }
		public ParameterContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalizeContext extends PrimaryExpressionContext {
		public TerminalNode NORMALIZE() { return getToken(TrinoSqlBaseParser.NORMALIZE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public NormalFormContext normalForm() {
			return getRuleContext(NormalFormContext.class,0);
		}
		public NormalizeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterNormalize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitNormalize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitNormalize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends PrimaryExpressionContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends PrimaryExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends PrimaryExpressionContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext operand;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(TrinoSqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(TrinoSqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TrinoSqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralContext extends PrimaryExpressionContext {
		public TerminalNode NULL() { return getToken(TrinoSqlBaseParser.NULL, 0); }
		public NullLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ROW() { return getToken(TrinoSqlBaseParser.ROW, 0); }
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentPathContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_PATH() { return getToken(TrinoSqlBaseParser.CURRENT_PATH, 0); }
		public CurrentPathContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterCurrentPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitCurrentPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitCurrentPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryLiteralContext extends PrimaryExpressionContext {
		public TerminalNode BINARY_LITERAL() { return getToken(TrinoSqlBaseParser.BINARY_LITERAL, 0); }
		public BinaryLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterBinaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitBinaryLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitBinaryLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentUserContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_USER() { return getToken(TrinoSqlBaseParser.CURRENT_USER, 0); }
		public CurrentUserContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterCurrentUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitCurrentUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitCurrentUser(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public TerminalNode EXTRACT() { return getToken(TrinoSqlBaseParser.EXTRACT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends PrimaryExpressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayConstructorContext extends PrimaryExpressionContext {
		public TerminalNode ARRAY() { return getToken(TrinoSqlBaseParser.ARRAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterArrayConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitArrayConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(TrinoSqlBaseParser.ASTERISK, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public OverContext over() {
			return getRuleContext(OverContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ORDER() { return getToken(TrinoSqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(TrinoSqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public NullTreatmentContext nullTreatment() {
			return getRuleContext(NullTreatmentContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends PrimaryExpressionContext {
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public TerminalNode POSITION() { return getToken(TrinoSqlBaseParser.POSITION, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(TrinoSqlBaseParser.IN, 0); }
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(TrinoSqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(TrinoSqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TrinoSqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupingOperationContext extends PrimaryExpressionContext {
		public TerminalNode GROUPING() { return getToken(TrinoSqlBaseParser.GROUPING, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public GroupingOperationContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterGroupingOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitGroupingOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitGroupingOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1374);
				match(NULL);
				}
				break;
			case 2:
				{
				_localctx = new IntervalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1375);
				interval();
				}
				break;
			case 3:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1376);
				identifier();
				setState(1377);
				string();
				}
				break;
			case 4:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1379);
				match(DOUBLE);
				setState(1380);
				match(PRECISION);
				setState(1381);
				string();
				}
				break;
			case 5:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1382);
				number();
				}
				break;
			case 6:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1383);
				booleanValue();
				}
				break;
			case 7:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1384);
				string();
				}
				break;
			case 8:
				{
				_localctx = new BinaryLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1385);
				match(BINARY_LITERAL);
				}
				break;
			case 9:
				{
				_localctx = new ParameterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1386);
				match(PARAMETER);
				}
				break;
			case 10:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1387);
				match(POSITION);
				setState(1388);
				match(T__1);
				setState(1389);
				valueExpression(0);
				setState(1390);
				match(IN);
				setState(1391);
				valueExpression(0);
				setState(1392);
				match(T__2);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1394);
				match(T__1);
				setState(1395);
				expression();
				setState(1398); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1396);
					match(T__3);
					setState(1397);
					expression();
					}
					}
					setState(1400); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(1402);
				match(T__2);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1404);
				match(ROW);
				setState(1405);
				match(T__1);
				setState(1406);
				expression();
				setState(1411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1407);
					match(T__3);
					setState(1408);
					expression();
					}
					}
					setState(1413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1414);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1416);
				qualifiedName();
				setState(1417);
				match(T__1);
				setState(1418);
				match(ASTERISK);
				setState(1419);
				match(T__2);
				setState(1421);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1420);
					filter();
					}
					break;
				}
				setState(1424);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1423);
					over();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1426);
				qualifiedName();
				setState(1427);
				match(T__1);
				setState(1439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCHED - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MERGE - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (STRING - 192)) | (1L << (UNICODE_STRING - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)) | (1L << (PARAMETER - 192)))) != 0)) {
					{
					setState(1429);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						setState(1428);
						setQuantifier();
						}
						break;
					}
					setState(1431);
					expression();
					setState(1436);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1432);
						match(T__3);
						setState(1433);
						expression();
						}
						}
						setState(1438);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1441);
					match(ORDER);
					setState(1442);
					match(BY);
					setState(1443);
					sortItem();
					setState(1448);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1444);
						match(T__3);
						setState(1445);
						sortItem();
						}
						}
						setState(1450);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1453);
				match(T__2);
				setState(1455);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1454);
					filter();
					}
					break;
				}
				setState(1461);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1458);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IGNORE || _la==RESPECT) {
						{
						setState(1457);
						nullTreatment();
						}
					}

					setState(1460);
					over();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1463);
				identifier();
				setState(1464);
				match(T__4);
				setState(1465);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1467);
				match(T__1);
				setState(1476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCHED - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MERGE - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NULLIF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(1468);
					identifier();
					setState(1473);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1469);
						match(T__3);
						setState(1470);
						identifier();
						}
						}
						setState(1475);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1478);
				match(T__2);
				setState(1479);
				match(T__4);
				setState(1480);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1481);
				match(T__1);
				setState(1482);
				query();
				setState(1483);
				match(T__2);
				}
				break;
			case 18:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1485);
				match(EXISTS);
				setState(1486);
				match(T__1);
				setState(1487);
				query();
				setState(1488);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1490);
				match(CASE);
				setState(1491);
				((SimpleCaseContext)_localctx).operand = expression();
				setState(1493); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1492);
					whenClause();
					}
					}
					setState(1495); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1497);
					match(ELSE);
					setState(1498);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1501);
				match(END);
				}
				break;
			case 20:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1503);
				match(CASE);
				setState(1505); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1504);
					whenClause();
					}
					}
					setState(1507); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1509);
					match(ELSE);
					setState(1510);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1513);
				match(END);
				}
				break;
			case 21:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1515);
				match(CAST);
				setState(1516);
				match(T__1);
				setState(1517);
				expression();
				setState(1518);
				match(AS);
				setState(1519);
				type(0);
				setState(1520);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1522);
				match(TRY_CAST);
				setState(1523);
				match(T__1);
				setState(1524);
				expression();
				setState(1525);
				match(AS);
				setState(1526);
				type(0);
				setState(1527);
				match(T__2);
				}
				break;
			case 23:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1529);
				match(ARRAY);
				setState(1530);
				match(T__5);
				setState(1539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCHED - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MERGE - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (STRING - 192)) | (1L << (UNICODE_STRING - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)) | (1L << (PARAMETER - 192)))) != 0)) {
					{
					setState(1531);
					expression();
					setState(1536);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1532);
						match(T__3);
						setState(1533);
						expression();
						}
						}
						setState(1538);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1541);
				match(T__6);
				}
				break;
			case 24:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1542);
				identifier();
				}
				break;
			case 25:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1543);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_DATE);
				}
				break;
			case 26:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1544);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIME);
				setState(1548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1545);
					match(T__1);
					setState(1546);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1547);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 27:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1550);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIMESTAMP);
				setState(1554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1551);
					match(T__1);
					setState(1552);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1553);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 28:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1556);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIME);
				setState(1560);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1557);
					match(T__1);
					setState(1558);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1559);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 29:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1562);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIMESTAMP);
				setState(1566);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1563);
					match(T__1);
					setState(1564);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1565);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 30:
				{
				_localctx = new CurrentUserContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1568);
				((CurrentUserContext)_localctx).name = match(CURRENT_USER);
				}
				break;
			case 31:
				{
				_localctx = new CurrentPathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1569);
				((CurrentPathContext)_localctx).name = match(CURRENT_PATH);
				}
				break;
			case 32:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1570);
				match(SUBSTRING);
				setState(1571);
				match(T__1);
				setState(1572);
				valueExpression(0);
				setState(1573);
				match(FROM);
				setState(1574);
				valueExpression(0);
				setState(1577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1575);
					match(FOR);
					setState(1576);
					valueExpression(0);
					}
				}

				setState(1579);
				match(T__2);
				}
				break;
			case 33:
				{
				_localctx = new NormalizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1581);
				match(NORMALIZE);
				setState(1582);
				match(T__1);
				setState(1583);
				valueExpression(0);
				setState(1586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(1584);
					match(T__3);
					setState(1585);
					normalForm();
					}
				}

				setState(1588);
				match(T__2);
				}
				break;
			case 34:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1590);
				match(EXTRACT);
				setState(1591);
				match(T__1);
				setState(1592);
				identifier();
				setState(1593);
				match(FROM);
				setState(1594);
				valueExpression(0);
				setState(1595);
				match(T__2);
				}
				break;
			case 35:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1597);
				match(T__1);
				setState(1598);
				expression();
				setState(1599);
				match(T__2);
				}
				break;
			case 36:
				{
				_localctx = new GroupingOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1601);
				match(GROUPING);
				setState(1602);
				match(T__1);
				setState(1611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCHED - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MERGE - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NULLIF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(1603);
					qualifiedName();
					setState(1608);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1604);
						match(T__3);
						setState(1605);
						qualifiedName();
						}
						}
						setState(1610);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1613);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1624);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1616);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1617);
						match(T__5);
						setState(1618);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(1619);
						match(T__6);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1621);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1622);
						match(T__0);
						setState(1623);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(1628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NullTreatmentContext extends ParserRuleContext {
		public TerminalNode IGNORE() { return getToken(TrinoSqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(TrinoSqlBaseParser.NULLS, 0); }
		public TerminalNode RESPECT() { return getToken(TrinoSqlBaseParser.RESPECT, 0); }
		public NullTreatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullTreatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterNullTreatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitNullTreatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitNullTreatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullTreatmentContext nullTreatment() throws RecognitionException {
		NullTreatmentContext _localctx = new NullTreatmentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_nullTreatment);
		try {
			setState(1633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGNORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1629);
				match(IGNORE);
				setState(1630);
				match(NULLS);
				}
				break;
			case RESPECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1631);
				match(RESPECT);
				setState(1632);
				match(NULLS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnicodeStringLiteralContext extends StringContext {
		public TerminalNode UNICODE_STRING() { return getToken(TrinoSqlBaseParser.UNICODE_STRING, 0); }
		public TerminalNode UESCAPE() { return getToken(TrinoSqlBaseParser.UESCAPE, 0); }
		public TerminalNode STRING() { return getToken(TrinoSqlBaseParser.STRING, 0); }
		public UnicodeStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterUnicodeStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitUnicodeStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitUnicodeStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicStringLiteralContext extends StringContext {
		public TerminalNode STRING() { return getToken(TrinoSqlBaseParser.STRING, 0); }
		public BasicStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterBasicStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitBasicStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitBasicStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_string);
		try {
			setState(1641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new BasicStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1635);
				match(STRING);
				}
				break;
			case UNICODE_STRING:
				_localctx = new UnicodeStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1636);
				match(UNICODE_STRING);
				setState(1639);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1637);
					match(UESCAPE);
					setState(1638);
					match(STRING);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeZoneSpecifierContext extends ParserRuleContext {
		public TimeZoneSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneSpecifier; }
	 
		public TimeZoneSpecifierContext() { }
		public void copyFrom(TimeZoneSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeZoneIntervalContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(TrinoSqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(TrinoSqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TimeZoneIntervalContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterTimeZoneInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitTimeZoneInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitTimeZoneInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeZoneStringContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(TrinoSqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(TrinoSqlBaseParser.ZONE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TimeZoneStringContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterTimeZoneString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitTimeZoneString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitTimeZoneString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeZoneSpecifierContext timeZoneSpecifier() throws RecognitionException {
		TimeZoneSpecifierContext _localctx = new TimeZoneSpecifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_timeZoneSpecifier);
		try {
			setState(1649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				_localctx = new TimeZoneIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1643);
				match(TIME);
				setState(1644);
				match(ZONE);
				setState(1645);
				interval();
				}
				break;
			case 2:
				_localctx = new TimeZoneStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1646);
				match(TIME);
				setState(1647);
				match(ZONE);
				setState(1648);
				string();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(TrinoSqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(TrinoSqlBaseParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(TrinoSqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(TrinoSqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(TrinoSqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(TrinoSqlBaseParser.GTE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			_la = _input.LA(1);
			if ( !(((((_la - 216)) & ~0x3f) == 0 && ((1L << (_la - 216)) & ((1L << (EQ - 216)) | (1L << (NEQ - 216)) | (1L << (LT - 216)) | (1L << (LTE - 216)) | (1L << (GT - 216)) | (1L << (GTE - 216)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonQuantifierContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(TrinoSqlBaseParser.ALL, 0); }
		public TerminalNode SOME() { return getToken(TrinoSqlBaseParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(TrinoSqlBaseParser.ANY, 0); }
		public ComparisonQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterComparisonQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitComparisonQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitComparisonQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonQuantifierContext comparisonQuantifier() throws RecognitionException {
		ComparisonQuantifierContext _localctx = new ComparisonQuantifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_comparisonQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(TrinoSqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TrinoSqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public Token sign;
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode INTERVAL() { return getToken(TrinoSqlBaseParser.INTERVAL, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public TerminalNode PLUS() { return getToken(TrinoSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TrinoSqlBaseParser.MINUS, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			match(INTERVAL);
			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1658);
				((IntervalContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((IntervalContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1661);
			string();
			setState(1662);
			((IntervalContext)_localctx).from = intervalField();
			setState(1665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1663);
				match(TO);
				setState(1664);
				((IntervalContext)_localctx).to = intervalField();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalFieldContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(TrinoSqlBaseParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(TrinoSqlBaseParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(TrinoSqlBaseParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(TrinoSqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(TrinoSqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(TrinoSqlBaseParser.SECOND, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_intervalField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			_la = _input.LA(1);
			if ( !(_la==DAY || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (HOUR - 84)) | (1L << (MINUTE - 84)) | (1L << (MONTH - 84)))) != 0) || _la==SECOND || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalFormContext extends ParserRuleContext {
		public TerminalNode NFD() { return getToken(TrinoSqlBaseParser.NFD, 0); }
		public TerminalNode NFC() { return getToken(TrinoSqlBaseParser.NFC, 0); }
		public TerminalNode NFKD() { return getToken(TrinoSqlBaseParser.NFKD, 0); }
		public TerminalNode NFKC() { return getToken(TrinoSqlBaseParser.NFKC, 0); }
		public NormalFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterNormalForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitNormalForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitNormalForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFormContext normalForm() throws RecognitionException {
		NormalFormContext _localctx = new NormalFormContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_normalForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			_la = _input.LA(1);
			if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (NFC - 118)) | (1L << (NFD - 118)) | (1L << (NFKC - 118)) | (1L << (NFKD - 118)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowTypeContext extends TypeContext {
		public TerminalNode ROW() { return getToken(TrinoSqlBaseParser.ROW, 0); }
		public List<RowFieldContext> rowField() {
			return getRuleContexts(RowFieldContext.class);
		}
		public RowFieldContext rowField(int i) {
			return getRuleContext(RowFieldContext.class,i);
		}
		public RowTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterRowType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitRowType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitRowType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalTypeContext extends TypeContext {
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode INTERVAL() { return getToken(TrinoSqlBaseParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public IntervalTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterIntervalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitIntervalType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitIntervalType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(TrinoSqlBaseParser.ARRAY, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(TrinoSqlBaseParser.INTEGER_VALUE, 0); }
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoublePrecisionTypeContext extends TypeContext {
		public TerminalNode DOUBLE() { return getToken(TrinoSqlBaseParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(TrinoSqlBaseParser.PRECISION, 0); }
		public DoublePrecisionTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterDoublePrecisionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitDoublePrecisionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitDoublePrecisionType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LegacyArrayTypeContext extends TypeContext {
		public TerminalNode ARRAY() { return getToken(TrinoSqlBaseParser.ARRAY, 0); }
		public TerminalNode LT() { return getToken(TrinoSqlBaseParser.LT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode GT() { return getToken(TrinoSqlBaseParser.GT, 0); }
		public LegacyArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterLegacyArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitLegacyArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitLegacyArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericTypeContext extends TypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public GenericTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitGenericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitGenericType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DateTimeTypeContext extends TypeContext {
		public Token base;
		public TypeParameterContext precision;
		public TerminalNode TIMESTAMP() { return getToken(TrinoSqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode WITHOUT() { return getToken(TrinoSqlBaseParser.WITHOUT, 0); }
		public List<TerminalNode> TIME() { return getTokens(TrinoSqlBaseParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(TrinoSqlBaseParser.TIME, i);
		}
		public TerminalNode ZONE() { return getToken(TrinoSqlBaseParser.ZONE, 0); }
		public TypeParameterContext typeParameter() {
			return getRuleContext(TypeParameterContext.class,0);
		}
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public DateTimeTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterDateTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitDateTimeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitDateTimeType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LegacyMapTypeContext extends TypeContext {
		public TypeContext keyType;
		public TypeContext valueType;
		public TerminalNode MAP() { return getToken(TrinoSqlBaseParser.MAP, 0); }
		public TerminalNode LT() { return getToken(TrinoSqlBaseParser.LT, 0); }
		public TerminalNode GT() { return getToken(TrinoSqlBaseParser.GT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public LegacyMapTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterLegacyMapType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitLegacyMapType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitLegacyMapType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				_localctx = new RowTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1672);
				match(ROW);
				setState(1673);
				match(T__1);
				setState(1674);
				rowField();
				setState(1679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1675);
					match(T__3);
					setState(1676);
					rowField();
					}
					}
					setState(1681);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1682);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new IntervalTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1684);
				match(INTERVAL);
				setState(1685);
				((IntervalTypeContext)_localctx).from = intervalField();
				setState(1688);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1686);
					match(TO);
					setState(1687);
					((IntervalTypeContext)_localctx).to = intervalField();
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new DateTimeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1690);
				((DateTimeTypeContext)_localctx).base = match(TIMESTAMP);
				setState(1695);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1691);
					match(T__1);
					setState(1692);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1693);
					match(T__2);
					}
					break;
				}
				setState(1700);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1697);
					match(WITHOUT);
					setState(1698);
					match(TIME);
					setState(1699);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new DateTimeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1702);
				((DateTimeTypeContext)_localctx).base = match(TIMESTAMP);
				setState(1707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1703);
					match(T__1);
					setState(1704);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1705);
					match(T__2);
					}
				}

				setState(1709);
				match(WITH);
				setState(1710);
				match(TIME);
				setState(1711);
				match(ZONE);
				}
				break;
			case 5:
				{
				_localctx = new DateTimeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1712);
				((DateTimeTypeContext)_localctx).base = match(TIME);
				setState(1717);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1713);
					match(T__1);
					setState(1714);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1715);
					match(T__2);
					}
					break;
				}
				setState(1722);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1719);
					match(WITHOUT);
					setState(1720);
					match(TIME);
					setState(1721);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new DateTimeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1724);
				((DateTimeTypeContext)_localctx).base = match(TIME);
				setState(1729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1725);
					match(T__1);
					setState(1726);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1727);
					match(T__2);
					}
				}

				setState(1731);
				match(WITH);
				setState(1732);
				match(TIME);
				setState(1733);
				match(ZONE);
				}
				break;
			case 7:
				{
				_localctx = new DoublePrecisionTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1734);
				match(DOUBLE);
				setState(1735);
				match(PRECISION);
				}
				break;
			case 8:
				{
				_localctx = new LegacyArrayTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1736);
				match(ARRAY);
				setState(1737);
				match(LT);
				setState(1738);
				type(0);
				setState(1739);
				match(GT);
				}
				break;
			case 9:
				{
				_localctx = new LegacyMapTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1741);
				match(MAP);
				setState(1742);
				match(LT);
				setState(1743);
				((LegacyMapTypeContext)_localctx).keyType = type(0);
				setState(1744);
				match(T__3);
				setState(1745);
				((LegacyMapTypeContext)_localctx).valueType = type(0);
				setState(1746);
				match(GT);
				}
				break;
			case 10:
				{
				_localctx = new GenericTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1748);
				identifier();
				setState(1760);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1749);
					match(T__1);
					setState(1750);
					typeParameter();
					setState(1755);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1751);
						match(T__3);
						setState(1752);
						typeParameter();
						}
						}
						setState(1757);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1758);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1773);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(new TypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(1764);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1765);
					match(ARRAY);
					setState(1769);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
					case 1:
						{
						setState(1766);
						match(T__5);
						setState(1767);
						match(INTEGER_VALUE);
						setState(1768);
						match(T__6);
						}
						break;
					}
					}
					} 
				}
				setState(1775);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RowFieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RowFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterRowField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitRowField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitRowField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFieldContext rowField() throws RecognitionException {
		RowFieldContext _localctx = new RowFieldContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_rowField);
		try {
			setState(1780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1776);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1777);
				identifier();
				setState(1778);
				type(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(TrinoSqlBaseParser.INTEGER_VALUE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_typeParameter);
		try {
			setState(1784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1782);
				match(INTEGER_VALUE);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DISTRIBUTED:
			case DOUBLE:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATCHED:
			case MATERIALIZED:
			case MERGE:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PATH:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UPDATE:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WINDOW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1783);
				type(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(TrinoSqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(TrinoSqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1786);
			match(WHEN);
			setState(1787);
			((WhenClauseContext)_localctx).condition = expression();
			setState(1788);
			match(THEN);
			setState(1789);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(TrinoSqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(TrinoSqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1791);
			match(FILTER);
			setState(1792);
			match(T__1);
			setState(1793);
			match(WHERE);
			setState(1794);
			booleanExpression(0);
			setState(1795);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MergeCaseContext extends ParserRuleContext {
		public MergeCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeCase; }
	 
		public MergeCaseContext() { }
		public void copyFrom(MergeCaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MergeInsertContext extends MergeCaseContext {
		public ExpressionContext condition;
		public IdentifierContext identifier;
		public List<IdentifierContext> targets = new ArrayList<IdentifierContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> values = new ArrayList<ExpressionContext>();
		public TerminalNode WHEN() { return getToken(TrinoSqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(TrinoSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(TrinoSqlBaseParser.THEN, 0); }
		public TerminalNode INSERT() { return getToken(TrinoSqlBaseParser.INSERT, 0); }
		public TerminalNode VALUES() { return getToken(TrinoSqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(TrinoSqlBaseParser.AND, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MergeInsertContext(MergeCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterMergeInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitMergeInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitMergeInsert(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeUpdateContext extends MergeCaseContext {
		public ExpressionContext condition;
		public IdentifierContext identifier;
		public List<IdentifierContext> targets = new ArrayList<IdentifierContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> values = new ArrayList<ExpressionContext>();
		public TerminalNode WHEN() { return getToken(TrinoSqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(TrinoSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(TrinoSqlBaseParser.THEN, 0); }
		public TerminalNode UPDATE() { return getToken(TrinoSqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(TrinoSqlBaseParser.SET, 0); }
		public List<TerminalNode> EQ() { return getTokens(TrinoSqlBaseParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(TrinoSqlBaseParser.EQ, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(TrinoSqlBaseParser.AND, 0); }
		public MergeUpdateContext(MergeCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterMergeUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitMergeUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitMergeUpdate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeDeleteContext extends MergeCaseContext {
		public ExpressionContext condition;
		public TerminalNode WHEN() { return getToken(TrinoSqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(TrinoSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(TrinoSqlBaseParser.THEN, 0); }
		public TerminalNode DELETE() { return getToken(TrinoSqlBaseParser.DELETE, 0); }
		public TerminalNode AND() { return getToken(TrinoSqlBaseParser.AND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MergeDeleteContext(MergeCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterMergeDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitMergeDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitMergeDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeCaseContext mergeCase() throws RecognitionException {
		MergeCaseContext _localctx = new MergeCaseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_mergeCase);
		int _la;
		try {
			setState(1861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				_localctx = new MergeUpdateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1797);
				match(WHEN);
				setState(1798);
				match(MATCHED);
				setState(1801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(1799);
					match(AND);
					setState(1800);
					((MergeUpdateContext)_localctx).condition = expression();
					}
				}

				setState(1803);
				match(THEN);
				setState(1804);
				match(UPDATE);
				setState(1805);
				match(SET);
				setState(1806);
				((MergeUpdateContext)_localctx).identifier = identifier();
				((MergeUpdateContext)_localctx).targets.add(((MergeUpdateContext)_localctx).identifier);
				setState(1807);
				match(EQ);
				setState(1808);
				((MergeUpdateContext)_localctx).expression = expression();
				((MergeUpdateContext)_localctx).values.add(((MergeUpdateContext)_localctx).expression);
				setState(1816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1809);
					match(T__3);
					setState(1810);
					((MergeUpdateContext)_localctx).identifier = identifier();
					((MergeUpdateContext)_localctx).targets.add(((MergeUpdateContext)_localctx).identifier);
					setState(1811);
					match(EQ);
					setState(1812);
					((MergeUpdateContext)_localctx).expression = expression();
					((MergeUpdateContext)_localctx).values.add(((MergeUpdateContext)_localctx).expression);
					}
					}
					setState(1818);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new MergeDeleteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1819);
				match(WHEN);
				setState(1820);
				match(MATCHED);
				setState(1823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(1821);
					match(AND);
					setState(1822);
					((MergeDeleteContext)_localctx).condition = expression();
					}
				}

				setState(1825);
				match(THEN);
				setState(1826);
				match(DELETE);
				}
				break;
			case 3:
				_localctx = new MergeInsertContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1827);
				match(WHEN);
				setState(1828);
				match(NOT);
				setState(1829);
				match(MATCHED);
				setState(1832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(1830);
					match(AND);
					setState(1831);
					((MergeInsertContext)_localctx).condition = expression();
					}
				}

				setState(1834);
				match(THEN);
				setState(1835);
				match(INSERT);
				setState(1847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1836);
					match(T__1);
					setState(1837);
					((MergeInsertContext)_localctx).identifier = identifier();
					((MergeInsertContext)_localctx).targets.add(((MergeInsertContext)_localctx).identifier);
					setState(1842);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1838);
						match(T__3);
						setState(1839);
						((MergeInsertContext)_localctx).identifier = identifier();
						((MergeInsertContext)_localctx).targets.add(((MergeInsertContext)_localctx).identifier);
						}
						}
						setState(1844);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1845);
					match(T__2);
					}
				}

				setState(1849);
				match(VALUES);
				setState(1850);
				match(T__1);
				setState(1851);
				((MergeInsertContext)_localctx).expression = expression();
				((MergeInsertContext)_localctx).values.add(((MergeInsertContext)_localctx).expression);
				setState(1856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1852);
					match(T__3);
					setState(1853);
					((MergeInsertContext)_localctx).expression = expression();
					((MergeInsertContext)_localctx).values.add(((MergeInsertContext)_localctx).expression);
					}
					}
					setState(1858);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1859);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverContext extends ParserRuleContext {
		public IdentifierContext windowName;
		public TerminalNode OVER() { return getToken(TrinoSqlBaseParser.OVER, 0); }
		public WindowSpecificationContext windowSpecification() {
			return getRuleContext(WindowSpecificationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitOver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverContext over() throws RecognitionException {
		OverContext _localctx = new OverContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_over);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			match(OVER);
			setState(1869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DISTRIBUTED:
			case DOUBLE:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATCHED:
			case MATERIALIZED:
			case MERGE:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PATH:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UPDATE:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WINDOW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				setState(1864);
				((OverContext)_localctx).windowName = identifier();
				}
				break;
			case T__1:
				{
				setState(1865);
				match(T__1);
				setState(1866);
				windowSpecification();
				setState(1867);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(TrinoSqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(TrinoSqlBaseParser.ROWS, 0); }
		public TerminalNode GROUPS() { return getToken(TrinoSqlBaseParser.GROUPS, 0); }
		public TerminalNode BETWEEN() { return getToken(TrinoSqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(TrinoSqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_windowFrame);
		try {
			setState(1895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1871);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1872);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1873);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1874);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1875);
				((WindowFrameContext)_localctx).frameType = match(GROUPS);
				setState(1876);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1877);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1878);
				match(BETWEEN);
				setState(1879);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1880);
				match(AND);
				setState(1881);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1883);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1884);
				match(BETWEEN);
				setState(1885);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1886);
				match(AND);
				setState(1887);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1889);
				((WindowFrameContext)_localctx).frameType = match(GROUPS);
				setState(1890);
				match(BETWEEN);
				setState(1891);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1892);
				match(AND);
				setState(1893);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
	 
		public FrameBoundContext() { }
		public void copyFrom(FrameBoundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRECEDING() { return getToken(TrinoSqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(TrinoSqlBaseParser.FOLLOWING, 0); }
		public BoundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterBoundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitBoundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitBoundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnboundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(TrinoSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(TrinoSqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(TrinoSqlBaseParser.FOLLOWING, 0); }
		public UnboundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterUnboundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitUnboundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitUnboundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentRowBoundContext extends FrameBoundContext {
		public TerminalNode CURRENT() { return getToken(TrinoSqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(TrinoSqlBaseParser.ROW, 0); }
		public CurrentRowBoundContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterCurrentRowBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitCurrentRowBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitCurrentRowBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_frameBound);
		int _la;
		try {
			setState(1906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1897);
				match(UNBOUNDED);
				setState(1898);
				((UnboundedFrameContext)_localctx).boundType = match(PRECEDING);
				}
				break;
			case 2:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1899);
				match(UNBOUNDED);
				setState(1900);
				((UnboundedFrameContext)_localctx).boundType = match(FOLLOWING);
				}
				break;
			case 3:
				_localctx = new CurrentRowBoundContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1901);
				match(CURRENT);
				setState(1902);
				match(ROW);
				}
				break;
			case 4:
				_localctx = new BoundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1903);
				expression();
				setState(1904);
				((BoundedFrameContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((BoundedFrameContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(TrinoSqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UpdateAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterUpdateAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitUpdateAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitUpdateAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateAssignmentContext updateAssignment() throws RecognitionException {
		UpdateAssignmentContext _localctx = new UpdateAssignmentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_updateAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
			identifier();
			setState(1909);
			match(EQ);
			setState(1910);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplainOptionContext extends ParserRuleContext {
		public ExplainOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainOption; }
	 
		public ExplainOptionContext() { }
		public void copyFrom(ExplainOptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainFormatContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode FORMAT() { return getToken(TrinoSqlBaseParser.FORMAT, 0); }
		public TerminalNode TEXT() { return getToken(TrinoSqlBaseParser.TEXT, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(TrinoSqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode JSON() { return getToken(TrinoSqlBaseParser.JSON, 0); }
		public ExplainFormatContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterExplainFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitExplainFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitExplainFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplainTypeContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode TYPE() { return getToken(TrinoSqlBaseParser.TYPE, 0); }
		public TerminalNode LOGICAL() { return getToken(TrinoSqlBaseParser.LOGICAL, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(TrinoSqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode VALIDATE() { return getToken(TrinoSqlBaseParser.VALIDATE, 0); }
		public TerminalNode IO() { return getToken(TrinoSqlBaseParser.IO, 0); }
		public ExplainTypeContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterExplainType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitExplainType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitExplainType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplainOptionContext explainOption() throws RecognitionException {
		ExplainOptionContext _localctx = new ExplainOptionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_explainOption);
		int _la;
		try {
			setState(1916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORMAT:
				_localctx = new ExplainFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1912);
				match(FORMAT);
				setState(1913);
				((ExplainFormatContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GRAPHVIZ || _la==JSON || _la==TEXT) ) {
					((ExplainFormatContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TYPE:
				_localctx = new ExplainTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1914);
				match(TYPE);
				setState(1915);
				((ExplainTypeContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (DISTRIBUTED - 54)) | (1L << (IO - 54)) | (1L << (LOGICAL - 54)))) != 0) || _la==VALIDATE) ) {
					((ExplainTypeContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransactionModeContext extends ParserRuleContext {
		public TransactionModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionMode; }
	 
		public TransactionModeContext() { }
		public void copyFrom(TransactionModeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TransactionAccessModeContext extends TransactionModeContext {
		public Token accessMode;
		public TerminalNode READ() { return getToken(TrinoSqlBaseParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(TrinoSqlBaseParser.ONLY, 0); }
		public TerminalNode WRITE() { return getToken(TrinoSqlBaseParser.WRITE, 0); }
		public TransactionAccessModeContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterTransactionAccessMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitTransactionAccessMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitTransactionAccessMode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsolationLevelContext extends TransactionModeContext {
		public TerminalNode ISOLATION() { return getToken(TrinoSqlBaseParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(TrinoSqlBaseParser.LEVEL, 0); }
		public LevelOfIsolationContext levelOfIsolation() {
			return getRuleContext(LevelOfIsolationContext.class,0);
		}
		public IsolationLevelContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterIsolationLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitIsolationLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitIsolationLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionModeContext transactionMode() throws RecognitionException {
		TransactionModeContext _localctx = new TransactionModeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_transactionMode);
		int _la;
		try {
			setState(1923);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ISOLATION:
				_localctx = new IsolationLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1918);
				match(ISOLATION);
				setState(1919);
				match(LEVEL);
				setState(1920);
				levelOfIsolation();
				}
				break;
			case READ:
				_localctx = new TransactionAccessModeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1921);
				match(READ);
				setState(1922);
				((TransactionAccessModeContext)_localctx).accessMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ONLY || _la==WRITE) ) {
					((TransactionAccessModeContext)_localctx).accessMode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LevelOfIsolationContext extends ParserRuleContext {
		public LevelOfIsolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelOfIsolation; }
	 
		public LevelOfIsolationContext() { }
		public void copyFrom(LevelOfIsolationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadUncommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(TrinoSqlBaseParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(TrinoSqlBaseParser.UNCOMMITTED, 0); }
		public ReadUncommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterReadUncommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitReadUncommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitReadUncommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SerializableContext extends LevelOfIsolationContext {
		public TerminalNode SERIALIZABLE() { return getToken(TrinoSqlBaseParser.SERIALIZABLE, 0); }
		public SerializableContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSerializable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSerializable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSerializable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadCommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(TrinoSqlBaseParser.READ, 0); }
		public TerminalNode COMMITTED() { return getToken(TrinoSqlBaseParser.COMMITTED, 0); }
		public ReadCommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterReadCommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitReadCommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitReadCommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatableReadContext extends LevelOfIsolationContext {
		public TerminalNode REPEATABLE() { return getToken(TrinoSqlBaseParser.REPEATABLE, 0); }
		public TerminalNode READ() { return getToken(TrinoSqlBaseParser.READ, 0); }
		public RepeatableReadContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterRepeatableRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitRepeatableRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitRepeatableRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelOfIsolationContext levelOfIsolation() throws RecognitionException {
		LevelOfIsolationContext _localctx = new LevelOfIsolationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_levelOfIsolation);
		try {
			setState(1932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				_localctx = new ReadUncommittedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1925);
				match(READ);
				setState(1926);
				match(UNCOMMITTED);
				}
				break;
			case 2:
				_localctx = new ReadCommittedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1927);
				match(READ);
				setState(1928);
				match(COMMITTED);
				}
				break;
			case 3:
				_localctx = new RepeatableReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1929);
				match(REPEATABLE);
				setState(1930);
				match(READ);
				}
				break;
			case 4:
				_localctx = new SerializableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1931);
				match(SERIALIZABLE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallArgumentContext extends ParserRuleContext {
		public CallArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgument; }
	 
		public CallArgumentContext() { }
		public void copyFrom(CallArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PositionalArgumentContext extends CallArgumentContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PositionalArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterPositionalArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitPositionalArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitPositionalArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedArgumentContext extends CallArgumentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentContext callArgument() throws RecognitionException {
		CallArgumentContext _localctx = new CallArgumentContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_callArgument);
		try {
			setState(1939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				_localctx = new PositionalArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1934);
				expression();
				}
				break;
			case 2:
				_localctx = new NamedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1935);
				identifier();
				setState(1936);
				match(T__7);
				setState(1937);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathElementContext extends ParserRuleContext {
		public PathElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathElement; }
	 
		public PathElementContext() { }
		public void copyFrom(PathElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QualifiedArgumentContext extends PathElementContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedArgumentContext(PathElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterQualifiedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitQualifiedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitQualifiedArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnqualifiedArgumentContext extends PathElementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnqualifiedArgumentContext(PathElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterUnqualifiedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitUnqualifiedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitUnqualifiedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathElementContext pathElement() throws RecognitionException {
		PathElementContext _localctx = new PathElementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_pathElement);
		try {
			setState(1946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				_localctx = new QualifiedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1941);
				identifier();
				setState(1942);
				match(T__0);
				setState(1943);
				identifier();
				}
				break;
			case 2:
				_localctx = new UnqualifiedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1945);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathSpecificationContext extends ParserRuleContext {
		public List<PathElementContext> pathElement() {
			return getRuleContexts(PathElementContext.class);
		}
		public PathElementContext pathElement(int i) {
			return getRuleContext(PathElementContext.class,i);
		}
		public PathSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterPathSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitPathSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitPathSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathSpecificationContext pathSpecification() throws RecognitionException {
		PathSpecificationContext _localctx = new PathSpecificationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_pathSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1948);
			pathElement();
			setState(1953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1949);
				match(T__3);
				setState(1950);
				pathElement();
				}
				}
				setState(1955);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(TrinoSqlBaseParser.SELECT, 0); }
		public TerminalNode DELETE() { return getToken(TrinoSqlBaseParser.DELETE, 0); }
		public TerminalNode INSERT() { return getToken(TrinoSqlBaseParser.INSERT, 0); }
		public PrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilege; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterPrivilege(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitPrivilege(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeContext privilege() throws RecognitionException {
		PrivilegeContext _localctx = new PrivilegeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_privilege);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1956);
			_la = _input.LA(1);
			if ( !(_la==DELETE || _la==INSERT || _la==SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			identifier();
			setState(1963);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1959);
					match(T__0);
					setState(1960);
					identifier();
					}
					} 
				}
				setState(1965);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantorContext extends ParserRuleContext {
		public GrantorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantor; }
	 
		public GrantorContext() { }
		public void copyFrom(GrantorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CurrentUserGrantorContext extends GrantorContext {
		public TerminalNode CURRENT_USER() { return getToken(TrinoSqlBaseParser.CURRENT_USER, 0); }
		public CurrentUserGrantorContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterCurrentUserGrantor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitCurrentUserGrantor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitCurrentUserGrantor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecifiedPrincipalContext extends GrantorContext {
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public SpecifiedPrincipalContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterSpecifiedPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitSpecifiedPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitSpecifiedPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentRoleGrantorContext extends GrantorContext {
		public TerminalNode CURRENT_ROLE() { return getToken(TrinoSqlBaseParser.CURRENT_ROLE, 0); }
		public CurrentRoleGrantorContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterCurrentRoleGrantor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitCurrentRoleGrantor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitCurrentRoleGrantor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantorContext grantor() throws RecognitionException {
		GrantorContext _localctx = new GrantorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_grantor);
		try {
			setState(1969);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DISTRIBUTED:
			case DOUBLE:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATCHED:
			case MATERIALIZED:
			case MERGE:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PATH:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UPDATE:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WINDOW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new SpecifiedPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1966);
				principal();
				}
				break;
			case CURRENT_USER:
				_localctx = new CurrentUserGrantorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1967);
				match(CURRENT_USER);
				}
				break;
			case CURRENT_ROLE:
				_localctx = new CurrentRoleGrantorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1968);
				match(CURRENT_ROLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrincipalContext extends ParserRuleContext {
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
	 
		public PrincipalContext() { }
		public void copyFrom(PrincipalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnspecifiedPrincipalContext extends PrincipalContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnspecifiedPrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterUnspecifiedPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitUnspecifiedPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitUnspecifiedPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UserPrincipalContext extends PrincipalContext {
		public TerminalNode USER() { return getToken(TrinoSqlBaseParser.USER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UserPrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterUserPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitUserPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitUserPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RolePrincipalContext extends PrincipalContext {
		public TerminalNode ROLE() { return getToken(TrinoSqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RolePrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterRolePrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitRolePrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitRolePrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_principal);
		try {
			setState(1976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				_localctx = new UnspecifiedPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1971);
				identifier();
				}
				break;
			case 2:
				_localctx = new UserPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1972);
				match(USER);
				setState(1973);
				identifier();
				}
				break;
			case 3:
				_localctx = new RolePrincipalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1974);
				match(ROLE);
				setState(1975);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RolesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public RolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitRoles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RolesContext roles() throws RecognitionException {
		RolesContext _localctx = new RolesContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_roles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1978);
			identifier();
			setState(1983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1979);
				match(T__3);
				setState(1980);
				identifier();
				}
				}
				setState(1985);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BackQuotedIdentifierContext extends IdentifierContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(TrinoSqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public BackQuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterBackQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitBackQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitBackQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuotedIdentifierContext extends IdentifierContext {
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(TrinoSqlBaseParser.QUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DigitIdentifierContext extends IdentifierContext {
		public TerminalNode DIGIT_IDENTIFIER() { return getToken(TrinoSqlBaseParser.DIGIT_IDENTIFIER, 0); }
		public DigitIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterDigitIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitDigitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitDigitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(TrinoSqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_identifier);
		try {
			setState(1991);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1986);
				match(IDENTIFIER);
				}
				break;
			case QUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1987);
				match(QUOTED_IDENTIFIER);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DISTRIBUTED:
			case DOUBLE:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATCHED:
			case MATERIALIZED:
			case MERGE:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PATH:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UPDATE:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WINDOW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1988);
				nonReserved();
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new BackQuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1989);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			case DIGIT_IDENTIFIER:
				_localctx = new DigitIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1990);
				match(DIGIT_IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(TrinoSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(TrinoSqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_VALUE() { return getToken(TrinoSqlBaseParser.DOUBLE_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(TrinoSqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(TrinoSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(TrinoSqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_number);
		int _la;
		try {
			setState(2005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1993);
					match(MINUS);
					}
				}

				setState(1996);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1997);
					match(MINUS);
					}
				}

				setState(2000);
				match(DOUBLE_VALUE);
				}
				break;
			case 3:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2001);
					match(MINUS);
					}
				}

				setState(2004);
				match(INTEGER_VALUE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(TrinoSqlBaseParser.ADD, 0); }
		public TerminalNode ADMIN() { return getToken(TrinoSqlBaseParser.ADMIN, 0); }
		public TerminalNode ALL() { return getToken(TrinoSqlBaseParser.ALL, 0); }
		public TerminalNode ANALYZE() { return getToken(TrinoSqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANY() { return getToken(TrinoSqlBaseParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(TrinoSqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(TrinoSqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(TrinoSqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(TrinoSqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BERNOULLI() { return getToken(TrinoSqlBaseParser.BERNOULLI, 0); }
		public TerminalNode CALL() { return getToken(TrinoSqlBaseParser.CALL, 0); }
		public TerminalNode CASCADE() { return getToken(TrinoSqlBaseParser.CASCADE, 0); }
		public TerminalNode CATALOGS() { return getToken(TrinoSqlBaseParser.CATALOGS, 0); }
		public TerminalNode COLUMN() { return getToken(TrinoSqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(TrinoSqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(TrinoSqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(TrinoSqlBaseParser.COMMIT, 0); }
		public TerminalNode COMMITTED() { return getToken(TrinoSqlBaseParser.COMMITTED, 0); }
		public TerminalNode CURRENT() { return getToken(TrinoSqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(TrinoSqlBaseParser.DATA, 0); }
		public TerminalNode DATE() { return getToken(TrinoSqlBaseParser.DATE, 0); }
		public TerminalNode DAY() { return getToken(TrinoSqlBaseParser.DAY, 0); }
		public TerminalNode DEFINER() { return getToken(TrinoSqlBaseParser.DEFINER, 0); }
		public TerminalNode DESC() { return getToken(TrinoSqlBaseParser.DESC, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(TrinoSqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode DOUBLE() { return getToken(TrinoSqlBaseParser.DOUBLE, 0); }
		public TerminalNode EXCLUDING() { return getToken(TrinoSqlBaseParser.EXCLUDING, 0); }
		public TerminalNode EXPLAIN() { return getToken(TrinoSqlBaseParser.EXPLAIN, 0); }
		public TerminalNode FETCH() { return getToken(TrinoSqlBaseParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(TrinoSqlBaseParser.FILTER, 0); }
		public TerminalNode FIRST() { return getToken(TrinoSqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(TrinoSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(TrinoSqlBaseParser.FORMAT, 0); }
		public TerminalNode FUNCTIONS() { return getToken(TrinoSqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GRANT() { return getToken(TrinoSqlBaseParser.GRANT, 0); }
		public TerminalNode GRANTED() { return getToken(TrinoSqlBaseParser.GRANTED, 0); }
		public TerminalNode GRANTS() { return getToken(TrinoSqlBaseParser.GRANTS, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(TrinoSqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode GROUPS() { return getToken(TrinoSqlBaseParser.GROUPS, 0); }
		public TerminalNode HOUR() { return getToken(TrinoSqlBaseParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(TrinoSqlBaseParser.IGNORE, 0); }
		public TerminalNode INCLUDING() { return getToken(TrinoSqlBaseParser.INCLUDING, 0); }
		public TerminalNode INPUT() { return getToken(TrinoSqlBaseParser.INPUT, 0); }
		public TerminalNode INTERVAL() { return getToken(TrinoSqlBaseParser.INTERVAL, 0); }
		public TerminalNode INVOKER() { return getToken(TrinoSqlBaseParser.INVOKER, 0); }
		public TerminalNode IO() { return getToken(TrinoSqlBaseParser.IO, 0); }
		public TerminalNode ISOLATION() { return getToken(TrinoSqlBaseParser.ISOLATION, 0); }
		public TerminalNode JSON() { return getToken(TrinoSqlBaseParser.JSON, 0); }
		public TerminalNode LAST() { return getToken(TrinoSqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(TrinoSqlBaseParser.LATERAL, 0); }
		public TerminalNode LEVEL() { return getToken(TrinoSqlBaseParser.LEVEL, 0); }
		public TerminalNode LIMIT() { return getToken(TrinoSqlBaseParser.LIMIT, 0); }
		public TerminalNode LOGICAL() { return getToken(TrinoSqlBaseParser.LOGICAL, 0); }
		public TerminalNode MAP() { return getToken(TrinoSqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(TrinoSqlBaseParser.MATCHED, 0); }
		public TerminalNode MATERIALIZED() { return getToken(TrinoSqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode MERGE() { return getToken(TrinoSqlBaseParser.MERGE, 0); }
		public TerminalNode MINUTE() { return getToken(TrinoSqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(TrinoSqlBaseParser.MONTH, 0); }
		public TerminalNode NEXT() { return getToken(TrinoSqlBaseParser.NEXT, 0); }
		public TerminalNode NFC() { return getToken(TrinoSqlBaseParser.NFC, 0); }
		public TerminalNode NFD() { return getToken(TrinoSqlBaseParser.NFD, 0); }
		public TerminalNode NFKC() { return getToken(TrinoSqlBaseParser.NFKC, 0); }
		public TerminalNode NFKD() { return getToken(TrinoSqlBaseParser.NFKD, 0); }
		public TerminalNode NO() { return getToken(TrinoSqlBaseParser.NO, 0); }
		public TerminalNode NONE() { return getToken(TrinoSqlBaseParser.NONE, 0); }
		public TerminalNode NULLIF() { return getToken(TrinoSqlBaseParser.NULLIF, 0); }
		public TerminalNode NULLS() { return getToken(TrinoSqlBaseParser.NULLS, 0); }
		public TerminalNode OFFSET() { return getToken(TrinoSqlBaseParser.OFFSET, 0); }
		public TerminalNode ONLY() { return getToken(TrinoSqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(TrinoSqlBaseParser.OPTION, 0); }
		public TerminalNode ORDINALITY() { return getToken(TrinoSqlBaseParser.ORDINALITY, 0); }
		public TerminalNode OUTPUT() { return getToken(TrinoSqlBaseParser.OUTPUT, 0); }
		public TerminalNode OVER() { return getToken(TrinoSqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(TrinoSqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONS() { return getToken(TrinoSqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PATH() { return getToken(TrinoSqlBaseParser.PATH, 0); }
		public TerminalNode POSITION() { return getToken(TrinoSqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(TrinoSqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRECISION() { return getToken(TrinoSqlBaseParser.PRECISION, 0); }
		public TerminalNode PRIVILEGES() { return getToken(TrinoSqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode PROPERTIES() { return getToken(TrinoSqlBaseParser.PROPERTIES, 0); }
		public TerminalNode RANGE() { return getToken(TrinoSqlBaseParser.RANGE, 0); }
		public TerminalNode READ() { return getToken(TrinoSqlBaseParser.READ, 0); }
		public TerminalNode REFRESH() { return getToken(TrinoSqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(TrinoSqlBaseParser.RENAME, 0); }
		public TerminalNode REPEATABLE() { return getToken(TrinoSqlBaseParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(TrinoSqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(TrinoSqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(TrinoSqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(TrinoSqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(TrinoSqlBaseParser.REVOKE, 0); }
		public TerminalNode ROLE() { return getToken(TrinoSqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(TrinoSqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(TrinoSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROW() { return getToken(TrinoSqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(TrinoSqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(TrinoSqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(TrinoSqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(TrinoSqlBaseParser.SECOND, 0); }
		public TerminalNode SECURITY() { return getToken(TrinoSqlBaseParser.SECURITY, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(TrinoSqlBaseParser.SERIALIZABLE, 0); }
		public TerminalNode SESSION() { return getToken(TrinoSqlBaseParser.SESSION, 0); }
		public TerminalNode SET() { return getToken(TrinoSqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(TrinoSqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode SOME() { return getToken(TrinoSqlBaseParser.SOME, 0); }
		public TerminalNode START() { return getToken(TrinoSqlBaseParser.START, 0); }
		public TerminalNode STATS() { return getToken(TrinoSqlBaseParser.STATS, 0); }
		public TerminalNode SUBSTRING() { return getToken(TrinoSqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYSTEM() { return getToken(TrinoSqlBaseParser.SYSTEM, 0); }
		public TerminalNode TABLES() { return getToken(TrinoSqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(TrinoSqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TEXT() { return getToken(TrinoSqlBaseParser.TEXT, 0); }
		public TerminalNode TIES() { return getToken(TrinoSqlBaseParser.TIES, 0); }
		public TerminalNode TIME() { return getToken(TrinoSqlBaseParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(TrinoSqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public TerminalNode TRANSACTION() { return getToken(TrinoSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRY_CAST() { return getToken(TrinoSqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(TrinoSqlBaseParser.TYPE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(TrinoSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(TrinoSqlBaseParser.UNCOMMITTED, 0); }
		public TerminalNode UPDATE() { return getToken(TrinoSqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(TrinoSqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(TrinoSqlBaseParser.USER, 0); }
		public TerminalNode VALIDATE() { return getToken(TrinoSqlBaseParser.VALIDATE, 0); }
		public TerminalNode VERBOSE() { return getToken(TrinoSqlBaseParser.VERBOSE, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public TerminalNode WINDOW() { return getToken(TrinoSqlBaseParser.WINDOW, 0); }
		public TerminalNode WITHOUT() { return getToken(TrinoSqlBaseParser.WITHOUT, 0); }
		public TerminalNode WORK() { return getToken(TrinoSqlBaseParser.WORK, 0); }
		public TerminalNode WRITE() { return getToken(TrinoSqlBaseParser.WRITE, 0); }
		public TerminalNode YEAR() { return getToken(TrinoSqlBaseParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(TrinoSqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrinoSqlBaseListener ) ((TrinoSqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrinoSqlBaseVisitor ) return ((TrinoSqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2007);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCHED - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MERGE - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NULLIF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 27:
			return relation_sempred((RelationContext)_localctx, predIndex);
		case 36:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 38:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 39:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 49:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_sempred(RelationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 15);
		case 10:
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00f5\u07dc\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ae\n\6\3\6\3\6\3\6\5\6"+
		"\u00b3\n\6\3\6\3\6\5\6\u00b7\n\6\3\6\3\6\3\6\3\6\5\6\u00bd\n\6\3\6\3\6"+
		"\5\6\u00c1\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00d6\n\6\3\6\3\6\5\6\u00da\n\6\3\6\3\6\5\6\u00de"+
		"\n\6\3\6\3\6\5\6\u00e2\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ea\n\6\3\6\3"+
		"\6\5\6\u00ee\n\6\3\6\5\6\u00f1\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00f8\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6\u00ff\n\6\f\6\16\6\u0102\13\6\3\6\3\6\3\6\5\6\u0107"+
		"\n\6\3\6\3\6\5\6\u010b\n\6\3\6\3\6\3\6\3\6\5\6\u0111\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u0118\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0121\n\6\3\6\3\6"+
		"\3\6\3\6\5\6\u0127\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u0135\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u013e\n\6\3\6\3\6\3\6\3"+
		"\6\5\6\u0144\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u014b\n\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u0155\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u015c\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u0164\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u016c\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u017b\n\6\3\6\3\6"+
		"\3\6\5\6\u0180\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u0187\n\6\3\6\3\6\3\6\5\6\u018c"+
		"\n\6\3\6\3\6\5\6\u0190\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0198\n\6\3\6\3"+
		"\6\3\6\3\6\5\6\u019e\n\6\3\6\3\6\5\6\u01a2\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01b0\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u01b7\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6\u01ce\n\6\f\6\16\6\u01d1\13\6\5\6\u01d3\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01dd\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6\u01e8\n\6\f\6\16\6\u01eb\13\6\3\6\3\6\3\6\5\6\u01f0\n\6\3\6"+
		"\3\6\3\6\5\6\u01f5\n\6\3\6\3\6\3\6\3\6\5\6\u01fb\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6\u0202\n\6\f\6\16\6\u0205\13\6\3\6\3\6\3\6\5\6\u020a\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u0211\n\6\3\6\3\6\3\6\3\6\7\6\u0217\n\6\f\6\16\6\u021a"+
		"\13\6\3\6\3\6\5\6\u021e\n\6\3\6\3\6\5\6\u0222\n\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u022a\n\6\3\6\3\6\3\6\3\6\5\6\u0230\n\6\3\6\3\6\3\6\7\6\u0235"+
		"\n\6\f\6\16\6\u0238\13\6\3\6\3\6\5\6\u023c\n\6\3\6\3\6\5\6\u0240\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u024a\n\6\3\6\5\6\u024d\n\6\3\6\3\6"+
		"\5\6\u0251\n\6\3\6\5\6\u0254\n\6\3\6\3\6\3\6\3\6\7\6\u025a\n\6\f\6\16"+
		"\6\u025d\13\6\3\6\3\6\5\6\u0261\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0279\n\6\3"+
		"\6\3\6\3\6\3\6\5\6\u027f\n\6\5\6\u0281\n\6\3\6\3\6\3\6\3\6\5\6\u0287\n"+
		"\6\3\6\3\6\3\6\3\6\5\6\u028d\n\6\5\6\u028f\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u0297\n\6\5\6\u0299\n\6\3\6\3\6\3\6\3\6\5\6\u029f\n\6\3\6\3\6\3\6"+
		"\3\6\5\6\u02a5\n\6\5\6\u02a7\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u02b6\n\6\3\6\3\6\3\6\5\6\u02bb\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u02c2\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u02ce\n"+
		"\6\5\6\u02d0\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u02d8\n\6\5\6\u02da\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u02ea\n\6\f"+
		"\6\16\6\u02ed\13\6\5\6\u02ef\n\6\3\6\3\6\5\6\u02f3\n\6\3\6\3\6\5\6\u02f7"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0307"+
		"\n\6\f\6\16\6\u030a\13\6\5\6\u030c\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u031d\n\6\f\6\16\6\u0320\13\6\3\6\3\6"+
		"\5\6\u0324\n\6\3\6\3\6\3\6\3\6\5\6\u032a\n\6\3\6\5\6\u032d\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\6\6\u0334\n\6\r\6\16\6\u0335\5\6\u0338\n\6\3\7\5\7\u033b"+
		"\n\7\3\7\3\7\3\b\3\b\5\b\u0341\n\b\3\b\3\b\3\b\7\b\u0346\n\b\f\b\16\b"+
		"\u0349\13\b\3\t\3\t\5\t\u034d\n\t\3\n\3\n\3\n\3\n\5\n\u0353\n\n\3\n\3"+
		"\n\5\n\u0357\n\n\3\n\3\n\5\n\u035b\n\n\3\13\3\13\3\13\3\13\5\13\u0361"+
		"\n\13\3\f\3\f\3\f\3\f\7\f\u0367\n\f\f\f\16\f\u036a\13\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0378\n\16\f\16\16\16\u037b"+
		"\13\16\5\16\u037d\n\16\3\16\3\16\3\16\5\16\u0382\n\16\5\16\u0384\n\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u038b\n\16\3\16\3\16\3\16\3\16\5\16\u0391"+
		"\n\16\5\16\u0393\n\16\3\17\3\17\5\17\u0397\n\17\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u03a1\n\21\3\21\3\21\3\21\3\21\5\21\u03a7\n\21"+
		"\3\21\7\21\u03aa\n\21\f\21\16\21\u03ad\13\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u03b6\n\22\f\22\16\22\u03b9\13\22\3\22\3\22\3\22\3\22"+
		"\5\22\u03bf\n\22\3\23\3\23\5\23\u03c3\n\23\3\23\3\23\5\23\u03c7\n\23\3"+
		"\24\3\24\5\24\u03cb\n\24\3\24\3\24\3\24\7\24\u03d0\n\24\f\24\16\24\u03d3"+
		"\13\24\3\24\3\24\3\24\3\24\7\24\u03d9\n\24\f\24\16\24\u03dc\13\24\5\24"+
		"\u03de\n\24\3\24\3\24\5\24\u03e2\n\24\3\24\3\24\3\24\5\24\u03e7\n\24\3"+
		"\24\3\24\5\24\u03eb\n\24\3\24\3\24\3\24\3\24\7\24\u03f1\n\24\f\24\16\24"+
		"\u03f4\13\24\5\24\u03f6\n\24\3\25\5\25\u03f9\n\25\3\25\3\25\3\25\7\25"+
		"\u03fe\n\25\f\25\16\25\u0401\13\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u0409\n\26\f\26\16\26\u040c\13\26\5\26\u040e\n\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u0416\n\26\f\26\16\26\u0419\13\26\5\26\u041b\n\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0424\n\26\f\26\16\26\u0427\13\26"+
		"\3\26\3\26\5\26\u042b\n\26\3\27\3\27\3\27\3\27\7\27\u0431\n\27\f\27\16"+
		"\27\u0434\13\27\5\27\u0436\n\27\3\27\3\27\5\27\u043a\n\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\5\31\u0443\n\31\3\31\3\31\3\31\3\31\3\31\7\31"+
		"\u044a\n\31\f\31\16\31\u044d\13\31\5\31\u044f\n\31\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u0456\n\31\f\31\16\31\u0459\13\31\5\31\u045b\n\31\3\31\5\31"+
		"\u045e\n\31\3\32\3\32\5\32\u0462\n\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\5\34\u046d\n\34\3\34\5\34\u0470\n\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0477\n\34\3\34\5\34\u047a\n\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u048d"+
		"\n\35\7\35\u048f\n\35\f\35\16\35\u0492\13\35\3\36\5\36\u0495\n\36\3\36"+
		"\3\36\5\36\u0499\n\36\3\36\3\36\5\36\u049d\n\36\3\36\3\36\5\36\u04a1\n"+
		"\36\5\36\u04a3\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u04ac\n\37"+
		"\f\37\16\37\u04af\13\37\3\37\3\37\5\37\u04b3\n\37\3 \3 \3 \3 \3 \3 \3"+
		" \5 \u04bc\n \3!\3!\3\"\3\"\5\"\u04c2\n\"\3\"\3\"\5\"\u04c6\n\"\5\"\u04c8"+
		"\n\"\3#\3#\3#\3#\7#\u04ce\n#\f#\16#\u04d1\13#\3#\3#\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\7$\u04df\n$\f$\16$\u04e2\13$\3$\3$\3$\5$\u04e7\n$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\5$\u04f2\n$\3%\3%\3&\3&\3&\5&\u04f9\n&\3&\3&\5&\u04fd"+
		"\n&\3&\3&\3&\3&\3&\3&\7&\u0505\n&\f&\16&\u0508\13&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\5\'\u0514\n\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u051c\n"+
		"\'\3\'\3\'\3\'\3\'\3\'\7\'\u0523\n\'\f\'\16\'\u0526\13\'\3\'\3\'\3\'\5"+
		"\'\u052b\n\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0533\n\'\3\'\3\'\3\'\3\'\5\'"+
		"\u0539\n\'\3\'\3\'\5\'\u053d\n\'\3\'\3\'\3\'\5\'\u0542\n\'\3\'\3\'\3\'"+
		"\5\'\u0547\n\'\3(\3(\3(\3(\5(\u054d\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\7(\u055b\n(\f(\16(\u055e\13(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\6)\u0579\n)\r)\16)\u057a\3)\3"+
		")\3)\3)\3)\3)\3)\7)\u0584\n)\f)\16)\u0587\13)\3)\3)\3)\3)\3)\3)\3)\5)"+
		"\u0590\n)\3)\5)\u0593\n)\3)\3)\3)\5)\u0598\n)\3)\3)\3)\7)\u059d\n)\f)"+
		"\16)\u05a0\13)\5)\u05a2\n)\3)\3)\3)\3)\3)\7)\u05a9\n)\f)\16)\u05ac\13"+
		")\5)\u05ae\n)\3)\3)\5)\u05b2\n)\3)\5)\u05b5\n)\3)\5)\u05b8\n)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\7)\u05c2\n)\f)\16)\u05c5\13)\5)\u05c7\n)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\6)\u05d8\n)\r)\16)\u05d9\3)\3)\5)\u05de"+
		"\n)\3)\3)\3)\3)\6)\u05e4\n)\r)\16)\u05e5\3)\3)\5)\u05ea\n)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0601\n)\f)\16"+
		")\u0604\13)\5)\u0606\n)\3)\3)\3)\3)\3)\3)\3)\5)\u060f\n)\3)\3)\3)\3)\5"+
		")\u0615\n)\3)\3)\3)\3)\5)\u061b\n)\3)\3)\3)\3)\5)\u0621\n)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\5)\u062c\n)\3)\3)\3)\3)\3)\3)\3)\5)\u0635\n)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0649\n)\f)\16)\u064c"+
		"\13)\5)\u064e\n)\3)\5)\u0651\n)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u065b\n)\f"+
		")\16)\u065e\13)\3*\3*\3*\3*\5*\u0664\n*\3+\3+\3+\3+\5+\u066a\n+\5+\u066c"+
		"\n+\3,\3,\3,\3,\3,\3,\5,\u0674\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\5\60\u067e"+
		"\n\60\3\60\3\60\3\60\3\60\5\60\u0684\n\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\7\63\u0690\n\63\f\63\16\63\u0693\13\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\5\63\u069b\n\63\3\63\3\63\3\63\3\63\3\63\5\63\u06a2"+
		"\n\63\3\63\3\63\3\63\5\63\u06a7\n\63\3\63\3\63\3\63\3\63\3\63\5\63\u06ae"+
		"\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u06b8\n\63\3\63\3\63"+
		"\3\63\5\63\u06bd\n\63\3\63\3\63\3\63\3\63\3\63\5\63\u06c4\n\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u06dc\n\63\f\63\16\63\u06df\13"+
		"\63\3\63\3\63\5\63\u06e3\n\63\5\63\u06e5\n\63\3\63\3\63\3\63\3\63\3\63"+
		"\5\63\u06ec\n\63\7\63\u06ee\n\63\f\63\16\63\u06f1\13\63\3\64\3\64\3\64"+
		"\3\64\5\64\u06f7\n\64\3\65\3\65\5\65\u06fb\n\65\3\66\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\58\u070c\n8\38\38\38\38"+
		"\38\38\38\38\38\38\38\78\u0719\n8\f8\168\u071c\138\38\38\38\38\58\u0722"+
		"\n8\38\38\38\38\38\38\38\58\u072b\n8\38\38\38\38\38\38\78\u0733\n8\f8"+
		"\168\u0736\138\38\38\58\u073a\n8\38\38\38\38\38\78\u0741\n8\f8\168\u0744"+
		"\138\38\38\58\u0748\n8\39\39\39\39\39\39\59\u0750\n9\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u076a\n:\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0775\n;\3<\3<\3<\3<\3=\3=\3=\3=\5=\u077f"+
		"\n=\3>\3>\3>\3>\3>\5>\u0786\n>\3?\3?\3?\3?\3?\3?\3?\5?\u078f\n?\3@\3@"+
		"\3@\3@\3@\5@\u0796\n@\3A\3A\3A\3A\3A\5A\u079d\nA\3B\3B\3B\7B\u07a2\nB"+
		"\fB\16B\u07a5\13B\3C\3C\3D\3D\3D\7D\u07ac\nD\fD\16D\u07af\13D\3E\3E\3"+
		"E\5E\u07b4\nE\3F\3F\3F\3F\3F\5F\u07bb\nF\3G\3G\3G\7G\u07c0\nG\fG\16G\u07c3"+
		"\13G\3H\3H\3H\3H\3H\5H\u07ca\nH\3I\5I\u07cd\nI\3I\3I\5I\u07d1\nI\3I\3"+
		"I\5I\u07d5\nI\3I\5I\u07d8\nI\3J\3J\3J\2\b 8JNPdK\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\2"+
		"\34\4\2\33\33\u009f\u009f\4\2\63\63aa\4\2\u00a8\u00a8\u00b7\u00b7\4\2"+
		"KKYY\4\2??ZZ\3\2\u00a6\u00a7\4\2GGww\4\2\u00e9\u00e9\u00f3\u00f3\4\2>"+
		">\u00c7\u00c7\4\2\24\24\65\65\4\2GGgg\4\2\r\r\67\67\4\2\27\27\u00b6\u00b6"+
		"\3\2\u00e0\u00e1\3\2\u00e2\u00e4\3\2\u00da\u00df\5\2\r\r\21\21\u00b2\u00b2"+
		"\4\2DD\u00c1\u00c1\7\2\61\61VVtu\u00aa\u00aa\u00d8\u00d8\3\2x{\4\2HH\u0091"+
		"\u0091\5\2QQff\u00ba\u00ba\6\288bboo\u00cd\u00cd\4\2\u0085\u0085\u00d7"+
		"\u00d7\5\2\64\64]]\u00ac\u00ac\60\2\13\r\17\17\21\22\24\27\32\33\36#("+
		"(/\61\63\63\65\6589??BBEHJJMQTTVXZZ\\\\__abddfhjjllouw}\u0081\u0083\u0085"+
		"\u0086\u0089\u0089\u008b\u0092\u0094\u0097\u0099\u00a0\u00a2\u00a4\u00a6"+
		"\u00ab\u00ad\u00b6\u00b8\u00ba\u00bc\u00c0\u00c2\u00c3\u00c5\u00c6\u00c9"+
		"\u00cb\u00cd\u00cd\u00cf\u00d0\u00d3\u00d3\u00d5\u00d9\2\u0923\2\u0094"+
		"\3\2\2\2\4\u0097\3\2\2\2\6\u009a\3\2\2\2\b\u009d\3\2\2\2\n\u0337\3\2\2"+
		"\2\f\u033a\3\2\2\2\16\u033e\3\2\2\2\20\u034c\3\2\2\2\22\u034e\3\2\2\2"+
		"\24\u035c\3\2\2\2\26\u0362\3\2\2\2\30\u036d\3\2\2\2\32\u0371\3\2\2\2\34"+
		"\u0396\3\2\2\2\36\u0398\3\2\2\2 \u039a\3\2\2\2\"\u03be\3\2\2\2$\u03c0"+
		"\3\2\2\2&\u03c8\3\2\2\2(\u03f8\3\2\2\2*\u042a\3\2\2\2,\u0439\3\2\2\2."+
		"\u043b\3\2\2\2\60\u0442\3\2\2\2\62\u045f\3\2\2\2\64\u0468\3\2\2\2\66\u0479"+
		"\3\2\2\28\u047b\3\2\2\2:\u04a2\3\2\2\2<\u04b2\3\2\2\2>\u04b4\3\2\2\2@"+
		"\u04bd\3\2\2\2B\u04bf\3\2\2\2D\u04c9\3\2\2\2F\u04f1\3\2\2\2H\u04f3\3\2"+
		"\2\2J\u04fc\3\2\2\2L\u0546\3\2\2\2N\u054c\3\2\2\2P\u0650\3\2\2\2R\u0663"+
		"\3\2\2\2T\u066b\3\2\2\2V\u0673\3\2\2\2X\u0675\3\2\2\2Z\u0677\3\2\2\2\\"+
		"\u0679\3\2\2\2^\u067b\3\2\2\2`\u0685\3\2\2\2b\u0687\3\2\2\2d\u06e4\3\2"+
		"\2\2f\u06f6\3\2\2\2h\u06fa\3\2\2\2j\u06fc\3\2\2\2l\u0701\3\2\2\2n\u0747"+
		"\3\2\2\2p\u0749\3\2\2\2r\u0769\3\2\2\2t\u0774\3\2\2\2v\u0776\3\2\2\2x"+
		"\u077e\3\2\2\2z\u0785\3\2\2\2|\u078e\3\2\2\2~\u0795\3\2\2\2\u0080\u079c"+
		"\3\2\2\2\u0082\u079e\3\2\2\2\u0084\u07a6\3\2\2\2\u0086\u07a8\3\2\2\2\u0088"+
		"\u07b3\3\2\2\2\u008a\u07ba\3\2\2\2\u008c\u07bc\3\2\2\2\u008e\u07c9\3\2"+
		"\2\2\u0090\u07d7\3\2\2\2\u0092\u07d9\3\2\2\2\u0094\u0095\5\n\6\2\u0095"+
		"\u0096\7\2\2\3\u0096\3\3\2\2\2\u0097\u0098\5H%\2\u0098\u0099\7\2\2\3\u0099"+
		"\5\3\2\2\2\u009a\u009b\5\u0082B\2\u009b\u009c\7\2\2\3\u009c\7\3\2\2\2"+
		"\u009d\u009e\5d\63\2\u009e\u009f\7\2\2\3\u009f\t\3\2\2\2\u00a0\u0338\5"+
		"\f\7\2\u00a1\u00a2\7\u00ca\2\2\u00a2\u0338\5\u008eH\2\u00a3\u00a4\7\u00ca"+
		"\2\2\u00a4\u00a5\5\u008eH\2\u00a5\u00a6\7\3\2\2\u00a6\u00a7\5\u008eH\2"+
		"\u00a7\u0338\3\2\2\2\u00a8\u00a9\7%\2\2\u00a9\u00ad\7\u00a8\2\2\u00aa"+
		"\u00ab\7W\2\2\u00ab\u00ac\7\177\2\2\u00ac\u00ae\7A\2\2\u00ad\u00aa\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\5\u0086D\2\u00b0"+
		"\u00b1\7\26\2\2\u00b1\u00b3\5\u008aF\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b5\7\u00d4\2\2\u00b5\u00b7\5\26"+
		"\f\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u0338\3\2\2\2\u00b8"+
		"\u00b9\7:\2\2\u00b9\u00bc\7\u00a8\2\2\u00ba\u00bb\7W\2\2\u00bb\u00bd\7"+
		"A\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c0\5\u0086D\2\u00bf\u00c1\t\2\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u0338\3\2\2\2\u00c2\u00c3\7\16\2\2\u00c3\u00c4\7\u00a8"+
		"\2\2\u00c4\u00c5\5\u0086D\2\u00c5\u00c6\7\u009a\2\2\u00c6\u00c7\7\u00bf"+
		"\2\2\u00c7\u00c8\5\u008eH\2\u00c8\u0338\3\2\2\2\u00c9\u00ca\7\16\2\2\u00ca"+
		"\u00cb\7\u00a8\2\2\u00cb\u00cc\5\u0086D\2\u00cc\u00cd\7\u00af\2\2\u00cd"+
		"\u00ce\7\26\2\2\u00ce\u00cf\5\u008aF\2\u00cf\u0338\3\2\2\2\u00d0\u00d1"+
		"\7%\2\2\u00d1\u00d5\7\u00b7\2\2\u00d2\u00d3\7W\2\2\u00d3\u00d4\7\177\2"+
		"\2\u00d4\u00d6\7A\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d9\5\u0086D\2\u00d8\u00da\5D#\2\u00d9\u00d8\3\2\2\2"+
		"\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00dc\7!\2\2\u00dc\u00de"+
		"\5T+\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00e0\7\u00d4\2\2\u00e0\u00e2\5\26\f\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e9\7\23\2\2\u00e4\u00ea\5\f\7\2"+
		"\u00e5\u00e6\7\4\2\2\u00e6\u00e7\5\f\7\2\u00e7\u00e8\7\5\2\2\u00e8\u00ea"+
		"\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e5\3\2\2\2\u00ea\u00f0\3\2\2\2\u00eb"+
		"\u00ed\7\u00d4\2\2\u00ec\u00ee\7|\2\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\7/\2\2\u00f0\u00eb\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u0338\3\2\2\2\u00f2\u00f3\7%\2\2\u00f3\u00f7\7\u00b7"+
		"\2\2\u00f4\u00f5\7W\2\2\u00f5\u00f6\7\177\2\2\u00f6\u00f8\7A\2\2\u00f7"+
		"\u00f4\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\5\u0086"+
		"D\2\u00fa\u00fb\7\4\2\2\u00fb\u0100\5\20\t\2\u00fc\u00fd\7\6\2\2\u00fd"+
		"\u00ff\5\20\t\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u0106\7\5\2\2\u0104\u0105\7!\2\2\u0105\u0107\5T+\2\u0106\u0104\3\2\2"+
		"\2\u0106\u0107\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0109\7\u00d4\2\2\u0109"+
		"\u010b\5\26\f\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0338\3"+
		"\2\2\2\u010c\u010d\7:\2\2\u010d\u0110\7\u00b7\2\2\u010e\u010f\7W\2\2\u010f"+
		"\u0111\7A\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0338\5\u0086D\2\u0113\u0114\7]\2\2\u0114\u0115\7`\2\2\u0115"+
		"\u0117\5\u0086D\2\u0116\u0118\5D#\2\u0117\u0116\3\2\2\2\u0117\u0118\3"+
		"\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\5\f\7\2\u011a\u0338\3\2\2\2\u011b"+
		"\u011c\7\64\2\2\u011c\u011d\7K\2\2\u011d\u0120\5\u0086D\2\u011e\u011f"+
		"\7\u00d2\2\2\u011f\u0121\5J&\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2"+
		"\u0121\u0338\3\2\2\2\u0122\u0123\7\16\2\2\u0123\u0126\7\u00b7\2\2\u0124"+
		"\u0125\7W\2\2\u0125\u0127\7A\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2"+
		"\2\u0127\u0128\3\2\2\2\u0128\u0129\5\u0086D\2\u0129\u012a\7\u009a\2\2"+
		"\u012a\u012b\7\u00bf\2\2\u012b\u012c\5\u0086D\2\u012c\u0338\3\2\2\2\u012d"+
		"\u012e\7!\2\2\u012e\u012f\7\u0084\2\2\u012f\u0130\7\u00b7\2\2\u0130\u0131"+
		"\5\u0086D\2\u0131\u0134\7c\2\2\u0132\u0135\5T+\2\u0133\u0135\7\u0080\2"+
		"\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0338\3\2\2\2\u0136\u0137"+
		"\7!\2\2\u0137\u0138\7\u0084\2\2\u0138\u0139\7\37\2\2\u0139\u013a\5\u0086"+
		"D\2\u013a\u013d\7c\2\2\u013b\u013e\5T+\2\u013c\u013e\7\u0080\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u0338\3\2\2\2\u013f\u0140\7\16"+
		"\2\2\u0140\u0143\7\u00b7\2\2\u0141\u0142\7W\2\2\u0142\u0144\7A\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\5\u0086"+
		"D\2\u0146\u0147\7\u009a\2\2\u0147\u014a\7\37\2\2\u0148\u0149\7W\2\2\u0149"+
		"\u014b\7A\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014d\5\u008eH\2\u014d\u014e\7\u00bf\2\2\u014e\u014f\5\u008e"+
		"H\2\u014f\u0338\3\2\2\2\u0150\u0151\7\16\2\2\u0151\u0154\7\u00b7\2\2\u0152"+
		"\u0153\7W\2\2\u0153\u0155\7A\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2"+
		"\2\u0155\u0156\3\2\2\2\u0156\u0157\5\u0086D\2\u0157\u0158\7:\2\2\u0158"+
		"\u015b\7\37\2\2\u0159\u015a\7W\2\2\u015a\u015c\7A\2\2\u015b\u0159\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\5\u0086D\2\u015e"+
		"\u0338\3\2\2\2\u015f\u0160\7\16\2\2\u0160\u0163\7\u00b7\2\2\u0161\u0162"+
		"\7W\2\2\u0162\u0164\7A\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0166\5\u0086D\2\u0166\u0167\7\13\2\2\u0167\u016b"+
		"\7\37\2\2\u0168\u0169\7W\2\2\u0169\u016a\7\177\2\2\u016a\u016c\7A\2\2"+
		"\u016b\u0168\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e"+
		"\5\22\n\2\u016e\u0338\3\2\2\2\u016f\u0170\7\16\2\2\u0170\u0171\7\u00b7"+
		"\2\2\u0171\u0172\5\u0086D\2\u0172\u0173\7\u00af\2\2\u0173\u0174\7\26\2"+
		"\2\u0174\u0175\5\u008aF\2\u0175\u0338\3\2\2\2\u0176\u0177\7\17\2\2\u0177"+
		"\u017a\5\u0086D\2\u0178\u0179\7\u00d4\2\2\u0179\u017b\5\26\f\2\u017a\u0178"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0338\3\2\2\2\u017c\u017f\7%\2\2\u017d"+
		"\u017e\7\u0087\2\2\u017e\u0180\7\u009c\2\2\u017f\u017d\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\7r\2\2\u0182\u0186\7\u00d0\2"+
		"\2\u0183\u0184\7W\2\2\u0184\u0185\7\177\2\2\u0185\u0187\7A\2\2\u0186\u0183"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018b\5\u0086D"+
		"\2\u0189\u018a\7!\2\2\u018a\u018c\5T+\2\u018b\u0189\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018e\7\u00d4\2\2\u018e\u0190\5\26"+
		"\f\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0192\7\23\2\2\u0192\u0193\5\f\7\2\u0193\u0338\3\2\2\2\u0194\u0197\7"+
		"%\2\2\u0195\u0196\7\u0087\2\2\u0196\u0198\7\u009c\2\2\u0197\u0195\3\2"+
		"\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\7\u00d0\2\2\u019a"+
		"\u019d\5\u0086D\2\u019b\u019c\7!\2\2\u019c\u019e\5T+\2\u019d\u019b\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u01a0\7\u00ab\2\2\u01a0"+
		"\u01a2\t\3\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3\u01a4\7\23\2\2\u01a4\u01a5\5\f\7\2\u01a5\u0338\3\2\2\2\u01a6"+
		"\u01a7\7\u0099\2\2\u01a7\u01a8\7r\2\2\u01a8\u01a9\7\u00d0\2\2\u01a9\u0338"+
		"\5\u0086D\2\u01aa\u01ab\7:\2\2\u01ab\u01ac\7r\2\2\u01ac\u01af\7\u00d0"+
		"\2\2\u01ad\u01ae\7W\2\2\u01ae\u01b0\7A\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u0338\5\u0086D\2\u01b2\u01b3\7:\2\2"+
		"\u01b3\u01b6\7\u00d0\2\2\u01b4\u01b5\7W\2\2\u01b5\u01b7\7A\2\2\u01b6\u01b4"+
		"\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u0338\5\u0086D"+
		"\2\u01b9\u01ba\7\16\2\2\u01ba\u01bb\7\u00d0\2\2\u01bb\u01bc\5\u0086D\2"+
		"\u01bc\u01bd\7\u009a\2\2\u01bd\u01be\7\u00bf\2\2\u01be\u01bf\5\u0086D"+
		"\2\u01bf\u0338\3\2\2\2\u01c0\u01c1\7\16\2\2\u01c1\u01c2\7\u00d0\2\2\u01c2"+
		"\u01c3\5\u0086D\2\u01c3\u01c4\7\u00af\2\2\u01c4\u01c5\7\26\2\2\u01c5\u01c6"+
		"\5\u008aF\2\u01c6\u0338\3\2\2\2\u01c7\u01c8\7\32\2\2\u01c8\u01c9\5\u0086"+
		"D\2\u01c9\u01d2\7\4\2\2\u01ca\u01cf\5~@\2\u01cb\u01cc\7\6\2\2\u01cc\u01ce"+
		"\5~@\2\u01cd\u01cb\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01ca\3\2"+
		"\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\7\5\2\2\u01d5"+
		"\u0338\3\2\2\2\u01d6\u01d7\7%\2\2\u01d7\u01d8\7\u00a2\2\2\u01d8\u01dc"+
		"\5\u008eH\2\u01d9\u01da\7\u00d4\2\2\u01da\u01db\7\f\2\2\u01db\u01dd\5"+
		"\u0088E\2\u01dc\u01d9\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u0338\3\2\2\2"+
		"\u01de\u01df\7:\2\2\u01df\u01e0\7\u00a2\2\2\u01e0\u0338\5\u008eH\2\u01e1"+
		"\u01e2\7N\2\2\u01e2\u01e3\5\u008cG\2\u01e3\u01e4\7\u00bf\2\2\u01e4\u01e9"+
		"\5\u008aF\2\u01e5\u01e6\7\6\2\2\u01e6\u01e8\5\u008aF\2\u01e7\u01e5\3\2"+
		"\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01ef\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\7\u00d4\2\2\u01ed\u01ee"+
		"\7\f\2\2\u01ee\u01f0\7\u0086\2\2\u01ef\u01ec\3\2\2\2\u01ef\u01f0\3\2\2"+
		"\2\u01f0\u01f4\3\2\2\2\u01f1\u01f2\7O\2\2\u01f2\u01f3\7\31\2\2\u01f3\u01f5"+
		"\5\u0088E\2\u01f4\u01f1\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u0338\3\2\2"+
		"\2\u01f6\u01fa\7\u00a0\2\2\u01f7\u01f8\7\f\2\2\u01f8\u01f9\7\u0086\2\2"+
		"\u01f9\u01fb\7I\2\2\u01fa\u01f7\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fc\u01fd\5\u008cG\2\u01fd\u01fe\7K\2\2\u01fe\u0203\5\u008a"+
		"F\2\u01ff\u0200\7\6\2\2\u0200\u0202\5\u008aF\2\u0201\u01ff\3\2\2\2\u0202"+
		"\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0209\3\2"+
		"\2\2\u0205\u0203\3\2\2\2\u0206\u0207\7O\2\2\u0207\u0208\7\31\2\2\u0208"+
		"\u020a\5\u0088E\2\u0209\u0206\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0338"+
		"\3\2\2\2\u020b\u020c\7\u00af\2\2\u020c\u0210\7\u00a2\2\2\u020d\u0211\7"+
		"\r\2\2\u020e\u0211\7}\2\2\u020f\u0211\5\u008eH\2\u0210\u020d\3\2\2\2\u0210"+
		"\u020e\3\2\2\2\u0210\u020f\3\2\2\2\u0211\u0338\3\2\2\2\u0212\u021d\7N"+
		"\2\2\u0213\u0218\5\u0084C\2\u0214\u0215\7\6\2\2\u0215\u0217\5\u0084C\2"+
		"\u0216\u0214\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219"+
		"\3\2\2\2\u0219\u021e\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021c\7\r\2\2\u021c"+
		"\u021e\7\u0094\2\2\u021d\u0213\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021f\u0221\7\u0084\2\2\u0220\u0222\t\4\2\2\u0221\u0220\3\2\2"+
		"\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\5\u0086D\2\u0224"+
		"\u0225\7\u00bf\2\2\u0225\u0229\5\u008aF\2\u0226\u0227\7\u00d4\2\2\u0227"+
		"\u0228\7N\2\2\u0228\u022a\7\u0086\2\2\u0229\u0226\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a\u0338\3\2\2\2\u022b\u022f\7\u00a0\2\2\u022c\u022d\7N\2"+
		"\2\u022d\u022e\7\u0086\2\2\u022e\u0230\7I\2\2\u022f\u022c\3\2\2\2\u022f"+
		"\u0230\3\2\2\2\u0230\u023b\3\2\2\2\u0231\u0236\5\u0084C\2\u0232\u0233"+
		"\7\6\2\2\u0233\u0235\5\u0084C\2\u0234\u0232\3\2\2\2\u0235\u0238\3\2\2"+
		"\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u023c\3\2\2\2\u0238\u0236"+
		"\3\2\2\2\u0239\u023a\7\r\2\2\u023a\u023c\7\u0094\2\2\u023b\u0231\3\2\2"+
		"\2\u023b\u0239\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f\7\u0084\2\2\u023e"+
		"\u0240\t\4\2\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2"+
		"\2\2\u0241\u0242\5\u0086D\2\u0242\u0243\7K\2\2\u0243\u0244\5\u008aF\2"+
		"\u0244\u0338\3\2\2\2\u0245\u0246\7\u00b1\2\2\u0246\u024c\7P\2\2\u0247"+
		"\u0249\7\u0084\2\2\u0248\u024a\7\u00b7\2\2\u0249\u0248\3\2\2\2\u0249\u024a"+
		"\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\5\u0086D\2\u024c\u0247\3\2\2"+
		"\2\u024c\u024d\3\2\2\2\u024d\u0338\3\2\2\2\u024e\u0250\7B\2\2\u024f\u0251"+
		"\7\17\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0253\3\2\2\2"+
		"\u0252\u0254\7\u00cf\2\2\u0253\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u0254"+
		"\u0260\3\2\2\2\u0255\u0256\7\4\2\2\u0256\u025b\5x=\2\u0257\u0258\7\6\2"+
		"\2\u0258\u025a\5x=\2\u0259\u0257\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259"+
		"\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025e\3\2\2\2\u025d\u025b\3\2\2\2\u025e"+
		"\u025f\7\5\2\2\u025f\u0261\3\2\2\2\u0260\u0255\3\2\2\2\u0260\u0261\3\2"+
		"\2\2\u0261\u0262\3\2\2\2\u0262\u0338\5\n\6\2\u0263\u0264\7\u00b1\2\2\u0264"+
		"\u0265\7%\2\2\u0265\u0266\7\u00b7\2\2\u0266\u0338\5\u0086D\2\u0267\u0268"+
		"\7\u00b1\2\2\u0268\u0269\7%\2\2\u0269\u026a\7\u00a8\2\2\u026a\u0338\5"+
		"\u0086D\2\u026b\u026c\7\u00b1\2\2\u026c\u026d\7%\2\2\u026d\u026e\7\u00d0"+
		"\2\2\u026e\u0338\5\u0086D\2\u026f\u0270\7\u00b1\2\2\u0270\u0271\7%\2\2"+
		"\u0271\u0272\7r\2\2\u0272\u0273\7\u00d0\2\2\u0273\u0338\5\u0086D\2\u0274"+
		"\u0275\7\u00b1\2\2\u0275\u0278\7\u00b8\2\2\u0276\u0277\t\5\2\2\u0277\u0279"+
		"\5\u0086D\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u0280\3\2\2"+
		"\2\u027a\u027b\7k\2\2\u027b\u027e\5T+\2\u027c\u027d\7=\2\2\u027d\u027f"+
		"\5T+\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280"+
		"\u027a\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0338\3\2\2\2\u0282\u0283\7\u00b1"+
		"\2\2\u0283\u0286\7\u00a9\2\2\u0284\u0285\t\5\2\2\u0285\u0287\5\u008eH"+
		"\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u028e\3\2\2\2\u0288\u0289"+
		"\7k\2\2\u0289\u028c\5T+\2\u028a\u028b\7=\2\2\u028b\u028d\5T+\2\u028c\u028a"+
		"\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\3\2\2\2\u028e\u0288\3\2\2\2\u028e"+
		"\u028f\3\2\2\2\u028f\u0338\3\2\2\2\u0290\u0291\7\u00b1\2\2\u0291\u0298"+
		"\7\36\2\2\u0292\u0293\7k\2\2\u0293\u0296\5T+\2\u0294\u0295\7=\2\2\u0295"+
		"\u0297\5T+\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\3\2\2"+
		"\2\u0298\u0292\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u0338\3\2\2\2\u029a\u029b"+
		"\7\u00b1\2\2\u029b\u029c\7 \2\2\u029c\u029e\t\5\2\2\u029d\u029f\5\u0086"+
		"D\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a6\3\2\2\2\u02a0"+
		"\u02a1\7k\2\2\u02a1\u02a4\5T+\2\u02a2\u02a3\7=\2\2\u02a3\u02a5\5T+\2\u02a4"+
		"\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a7\3\2\2\2\u02a6\u02a0\3\2"+
		"\2\2\u02a6\u02a7\3\2\2\2\u02a7\u0338\3\2\2\2\u02a8\u02a9\7\u00b1\2\2\u02a9"+
		"\u02aa\7\u00b4\2\2\u02aa\u02ab\7I\2\2\u02ab\u0338\5\u0086D\2\u02ac\u02ad"+
		"\7\u00b1\2\2\u02ad\u02ae\7\u00b4\2\2\u02ae\u02af\7I\2\2\u02af\u02b0\7"+
		"\4\2\2\u02b0\u02b1\5&\24\2\u02b1\u02b2\7\5\2\2\u02b2\u0338\3\2\2\2\u02b3"+
		"\u02b5\7\u00b1\2\2\u02b4\u02b6\7(\2\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6"+
		"\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02ba\7\u00a3\2\2\u02b8\u02b9\t\5\2"+
		"\2\u02b9\u02bb\5\u008eH\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb"+
		"\u0338\3\2\2\2\u02bc\u02bd\7\u00b1\2\2\u02bd\u02be\7\u00a2\2\2\u02be\u02c1"+
		"\7P\2\2\u02bf\u02c0\t\5\2\2\u02c0\u02c2\5\u008eH\2\u02c1\u02bf\3\2\2\2"+
		"\u02c1\u02c2\3\2\2\2\u02c2\u0338\3\2\2\2\u02c3\u02c4\7\66\2\2\u02c4\u0338"+
		"\5\u0086D\2\u02c5\u02c6\7\65\2\2\u02c6\u0338\5\u0086D\2\u02c7\u02c8\7"+
		"\u00b1\2\2\u02c8\u02cf\7M\2\2\u02c9\u02ca\7k\2\2\u02ca\u02cd\5T+\2\u02cb"+
		"\u02cc\7=\2\2\u02cc\u02ce\5T+\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2"+
		"\2\u02ce\u02d0\3\2\2\2\u02cf\u02c9\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u0338"+
		"\3\2\2\2\u02d1\u02d2\7\u00b1\2\2\u02d2\u02d9\7\u00ae\2\2\u02d3\u02d4\7"+
		"k\2\2\u02d4\u02d7\5T+\2\u02d5\u02d6\7=\2\2\u02d6\u02d8\5T+\2\u02d7\u02d5"+
		"\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2\2\2\u02d9\u02d3\3\2\2\2\u02d9"+
		"\u02da\3\2\2\2\u02da\u0338\3\2\2\2\u02db\u02dc\7\u00af\2\2\u02dc\u02dd"+
		"\7\u00ae\2\2\u02dd\u02de\5\u0086D\2\u02de\u02df\7\u00da\2\2\u02df\u02e0"+
		"\5H%\2\u02e0\u0338\3\2\2\2\u02e1\u02e2\7\u009d\2\2\u02e2\u02e3\7\u00ae"+
		"\2\2\u02e3\u0338\5\u0086D\2\u02e4\u02e5\7\u00b3\2\2\u02e5\u02ee\7\u00c0"+
		"\2\2\u02e6\u02eb\5z>\2\u02e7\u02e8\7\6\2\2\u02e8\u02ea\5z>\2\u02e9\u02e7"+
		"\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec"+
		"\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee\u02e6\3\2\2\2\u02ee\u02ef\3\2"+
		"\2\2\u02ef\u0338\3\2\2\2\u02f0\u02f2\7\"\2\2\u02f1\u02f3\7\u00d6\2\2\u02f2"+
		"\u02f1\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u0338\3\2\2\2\u02f4\u02f6\7\u00a4"+
		"\2\2\u02f5\u02f7\7\u00d6\2\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7"+
		"\u0338\3\2\2\2\u02f8\u02f9\7\u0093\2\2\u02f9\u02fa\5\u008eH\2\u02fa\u02fb"+
		"\7K\2\2\u02fb\u02fc\5\n\6\2\u02fc\u0338\3\2\2\2\u02fd\u02fe\7\62\2\2\u02fe"+
		"\u02ff\7\u0093\2\2\u02ff\u0338\5\u008eH\2\u0300\u0301\7@\2\2\u0301\u030b"+
		"\5\u008eH\2\u0302\u0303\7\u00cc\2\2\u0303\u0308\5H%\2\u0304\u0305\7\6"+
		"\2\2\u0305\u0307\5H%\2\u0306\u0304\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306"+
		"\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030c\3\2\2\2\u030a\u0308\3\2\2\2\u030b"+
		"\u0302\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u0338\3\2\2\2\u030d\u030e\7\66"+
		"\2\2\u030e\u030f\7\\\2\2\u030f\u0338\5\u008eH\2\u0310\u0311\7\66\2\2\u0311"+
		"\u0312\7\u008b\2\2\u0312\u0338\5\u008eH\2\u0313\u0314\7\u00af\2\2\u0314"+
		"\u0315\7\u008f\2\2\u0315\u0338\5\u0082B\2\u0316\u0317\7\u00c9\2\2\u0317"+
		"\u0318\5\u0086D\2\u0318\u0319\7\u00af\2\2\u0319\u031e\5v<\2\u031a\u031b"+
		"\7\6\2\2\u031b\u031d\5v<\2\u031c\u031a\3\2\2\2\u031d\u0320\3\2\2\2\u031e"+
		"\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0323\3\2\2\2\u0320\u031e\3\2"+
		"\2\2\u0321\u0322\7\u00d2\2\2\u0322\u0324\5J&\2\u0323\u0321\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324\u0338\3\2\2\2\u0325\u0326\7s\2\2\u0326\u0327\7`\2"+
		"\2\u0327\u032c\5\u0086D\2\u0328\u032a\7\23\2\2\u0329\u0328\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032d\5\u008eH\2\u032c\u0329"+
		"\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\7\u00cc\2"+
		"\2\u032f\u0330\58\35\2\u0330\u0331\7\u0084\2\2\u0331\u0333\5H%\2\u0332"+
		"\u0334\5n8\2\u0333\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0333\3\2\2"+
		"\2\u0335\u0336\3\2\2\2\u0336\u0338\3\2\2\2\u0337\u00a0\3\2\2\2\u0337\u00a1"+
		"\3\2\2\2\u0337\u00a3\3\2\2\2\u0337\u00a8\3\2\2\2\u0337\u00b8\3\2\2\2\u0337"+
		"\u00c2\3\2\2\2\u0337\u00c9\3\2\2\2\u0337\u00d0\3\2\2\2\u0337\u00f2\3\2"+
		"\2\2\u0337\u010c\3\2\2\2\u0337\u0113\3\2\2\2\u0337\u011b\3\2\2\2\u0337"+
		"\u0122\3\2\2\2\u0337\u012d\3\2\2\2\u0337\u0136\3\2\2\2\u0337\u013f\3\2"+
		"\2\2\u0337\u0150\3\2\2\2\u0337\u015f\3\2\2\2\u0337\u016f\3\2\2\2\u0337"+
		"\u0176\3\2\2\2\u0337\u017c\3\2\2\2\u0337\u0194\3\2\2\2\u0337\u01a6\3\2"+
		"\2\2\u0337\u01aa\3\2\2\2\u0337\u01b2\3\2\2\2\u0337\u01b9\3\2\2\2\u0337"+
		"\u01c0\3\2\2\2\u0337\u01c7\3\2\2\2\u0337\u01d6\3\2\2\2\u0337\u01de\3\2"+
		"\2\2\u0337\u01e1\3\2\2\2\u0337\u01f6\3\2\2\2\u0337\u020b\3\2\2\2\u0337"+
		"\u0212\3\2\2\2\u0337\u022b\3\2\2\2\u0337\u0245\3\2\2\2\u0337\u024e\3\2"+
		"\2\2\u0337\u0263\3\2\2\2\u0337\u0267\3\2\2\2\u0337\u026b\3\2\2\2\u0337"+
		"\u026f\3\2\2\2\u0337\u0274\3\2\2\2\u0337\u0282\3\2\2\2\u0337\u0290\3\2"+
		"\2\2\u0337\u029a\3\2\2\2\u0337\u02a8\3\2\2\2\u0337\u02ac\3\2\2\2\u0337"+
		"\u02b3\3\2\2\2\u0337\u02bc\3\2\2\2\u0337\u02c3\3\2\2\2\u0337\u02c5\3\2"+
		"\2\2\u0337\u02c7\3\2\2\2\u0337\u02d1\3\2\2\2\u0337\u02db\3\2\2\2\u0337"+
		"\u02e1\3\2\2\2\u0337\u02e4\3\2\2\2\u0337\u02f0\3\2\2\2\u0337\u02f4\3\2"+
		"\2\2\u0337\u02f8\3\2\2\2\u0337\u02fd\3\2\2\2\u0337\u0300\3\2\2\2\u0337"+
		"\u030d\3\2\2\2\u0337\u0310\3\2\2\2\u0337\u0313\3\2\2\2\u0337\u0316\3\2"+
		"\2\2\u0337\u0325\3\2\2\2\u0338\13\3\2\2\2\u0339\u033b\5\16\b\2\u033a\u0339"+
		"\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\5\32\16\2"+
		"\u033d\r\3\2\2\2\u033e\u0340\7\u00d4\2\2\u033f\u0341\7\u0098\2\2\u0340"+
		"\u033f\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0347\5\62"+
		"\32\2\u0343\u0344\7\6\2\2\u0344\u0346\5\62\32\2\u0345\u0343\3\2\2\2\u0346"+
		"\u0349\3\2\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\17\3\2\2"+
		"\2\u0349\u0347\3\2\2\2\u034a\u034d\5\22\n\2\u034b\u034d\5\24\13\2\u034c"+
		"\u034a\3\2\2\2\u034c\u034b\3\2\2\2\u034d\21\3\2\2\2\u034e\u034f\5\u008e"+
		"H\2\u034f\u0352\5d\63\2\u0350\u0351\7\177\2\2\u0351\u0353\7\u0080\2\2"+
		"\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0356\3\2\2\2\u0354\u0355"+
		"\7!\2\2\u0355\u0357\5T+\2\u0356\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357"+
		"\u035a\3\2\2\2\u0358\u0359\7\u00d4\2\2\u0359\u035b\5\26\f\2\u035a\u0358"+
		"\3\2\2\2\u035a\u035b\3\2\2\2\u035b\23\3\2\2\2\u035c\u035d\7k\2\2\u035d"+
		"\u0360\5\u0086D\2\u035e\u035f\t\6\2\2\u035f\u0361\7\u0095\2\2\u0360\u035e"+
		"\3\2\2\2\u0360\u0361\3\2\2\2\u0361\25\3\2\2\2\u0362\u0363\7\4\2\2\u0363"+
		"\u0368\5\30\r\2\u0364\u0365\7\6\2\2\u0365\u0367\5\30\r\2\u0366\u0364\3"+
		"\2\2\2\u0367\u036a\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369"+
		"\u036b\3\2\2\2\u036a\u0368\3\2\2\2\u036b\u036c\7\5\2\2\u036c\27\3\2\2"+
		"\2\u036d\u036e\5\u008eH\2\u036e\u036f\7\u00da\2\2\u036f\u0370\5H%\2\u0370"+
		"\31\3\2\2\2\u0371\u037c\5 \21\2\u0372\u0373\7\u0088\2\2\u0373\u0374\7"+
		"\31\2\2\u0374\u0379\5$\23\2\u0375\u0376\7\6\2\2\u0376\u0378\5$\23\2\u0377"+
		"\u0375\3\2\2\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2"+
		"\2\2\u037a\u037d\3\2\2\2\u037b\u0379\3\2\2\2\u037c\u0372\3\2\2\2\u037c"+
		"\u037d\3\2\2\2\u037d\u0383\3\2\2\2\u037e\u037f\7\u0083\2\2\u037f\u0381"+
		"\5\36\20\2\u0380\u0382\t\7\2\2\u0381\u0380\3\2\2\2\u0381\u0382\3\2\2\2"+
		"\u0382\u0384\3\2\2\2\u0383\u037e\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0392"+
		"\3\2\2\2\u0385\u0386\7l\2\2\u0386\u0393\5\34\17\2\u0387\u0388\7E\2\2\u0388"+
		"\u038a\t\b\2\2\u0389\u038b\5\36\20\2\u038a\u0389\3\2\2\2\u038a\u038b\3"+
		"\2\2\2\u038b\u038c\3\2\2\2\u038c\u0390\t\7\2\2\u038d\u0391\7\u0085\2\2"+
		"\u038e\u038f\7\u00d4\2\2\u038f\u0391\7\u00bc\2\2\u0390\u038d\3\2\2\2\u0390"+
		"\u038e\3\2\2\2\u0391\u0393\3\2\2\2\u0392\u0385\3\2\2\2\u0392\u0387\3\2"+
		"\2\2\u0392\u0393\3\2\2\2\u0393\33\3\2\2\2\u0394\u0397\7\r\2\2\u0395\u0397"+
		"\5\36\20\2\u0396\u0394\3\2\2\2\u0396\u0395\3\2\2\2\u0397\35\3\2\2\2\u0398"+
		"\u0399\t\t\2\2\u0399\37\3\2\2\2\u039a\u039b\b\21\1\2\u039b\u039c\5\"\22"+
		"\2\u039c\u03ab\3\2\2\2\u039d\u039e\f\4\2\2\u039e\u03a0\7^\2\2\u039f\u03a1"+
		"\5\64\33\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a2\3\2\2\2"+
		"\u03a2\u03aa\5 \21\5\u03a3\u03a4\f\3\2\2\u03a4\u03a6\t\n\2\2\u03a5\u03a7"+
		"\5\64\33\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\3\2\2\2"+
		"\u03a8\u03aa\5 \21\4\u03a9\u039d\3\2\2\2\u03a9\u03a3\3\2\2\2\u03aa\u03ad"+
		"\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac!\3\2\2\2\u03ad"+
		"\u03ab\3\2\2\2\u03ae\u03bf\5&\24\2\u03af\u03b0\7\u00b7\2\2\u03b0\u03bf"+
		"\5\u0086D\2\u03b1\u03b2\7\u00ce\2\2\u03b2\u03b7\5H%\2\u03b3\u03b4\7\6"+
		"\2\2\u03b4\u03b6\5H%\2\u03b5\u03b3\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5"+
		"\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03bf\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba"+
		"\u03bb\7\4\2\2\u03bb\u03bc\5\32\16\2\u03bc\u03bd\7\5\2\2\u03bd\u03bf\3"+
		"\2\2\2\u03be\u03ae\3\2\2\2\u03be\u03af\3\2\2\2\u03be\u03b1\3\2\2\2\u03be"+
		"\u03ba\3\2\2\2\u03bf#\3\2\2\2\u03c0\u03c2\5H%\2\u03c1\u03c3\t\13\2\2\u03c2"+
		"\u03c1\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4\u03c5\7\u0082"+
		"\2\2\u03c5\u03c7\t\f\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7"+
		"%\3\2\2\2\u03c8\u03ca\7\u00ac\2\2\u03c9\u03cb\5\64\33\2\u03ca\u03c9\3"+
		"\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03d1\5\66\34\2\u03cd"+
		"\u03ce\7\6\2\2\u03ce\u03d0\5\66\34\2\u03cf\u03cd\3\2\2\2\u03d0\u03d3\3"+
		"\2\2\2\u03d1\u03cf\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03dd\3\2\2\2\u03d3"+
		"\u03d1\3\2\2\2\u03d4\u03d5\7K\2\2\u03d5\u03da\58\35\2\u03d6\u03d7\7\6"+
		"\2\2\u03d7\u03d9\58\35\2\u03d8\u03d6\3\2\2\2\u03d9\u03dc\3\2\2\2\u03da"+
		"\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03de\3\2\2\2\u03dc\u03da\3\2"+
		"\2\2\u03dd\u03d4\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e1\3\2\2\2\u03df"+
		"\u03e0\7\u00d2\2\2\u03e0\u03e2\5J&\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3"+
		"\2\2\2\u03e2\u03e6\3\2\2\2\u03e3\u03e4\7R\2\2\u03e4\u03e5\7\31\2\2\u03e5"+
		"\u03e7\5(\25\2\u03e6\u03e3\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03ea\3\2"+
		"\2\2\u03e8\u03e9\7U\2\2\u03e9\u03eb\5J&\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb"+
		"\3\2\2\2\u03eb\u03f5\3\2\2\2\u03ec\u03ed\7\u00d3\2\2\u03ed\u03f2\5.\30"+
		"\2\u03ee\u03ef\7\6\2\2\u03ef\u03f1\5.\30\2\u03f0\u03ee\3\2\2\2\u03f1\u03f4"+
		"\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4"+
		"\u03f2\3\2\2\2\u03f5\u03ec\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\'\3\2\2\2"+
		"\u03f7\u03f9\5\64\33\2\u03f8\u03f7\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fa"+
		"\3\2\2\2\u03fa\u03ff\5*\26\2\u03fb\u03fc\7\6\2\2\u03fc\u03fe\5*\26\2\u03fd"+
		"\u03fb\3\2\2\2\u03fe\u0401\3\2\2\2\u03ff\u03fd\3\2\2\2\u03ff\u0400\3\2"+
		"\2\2\u0400)\3\2\2\2\u0401\u03ff\3\2\2\2\u0402\u042b\5,\27\2\u0403\u0404"+
		"\7\u00a5\2\2\u0404\u040d\7\4\2\2\u0405\u040a\5H%\2\u0406\u0407\7\6\2\2"+
		"\u0407\u0409\5H%\2\u0408\u0406\3\2\2\2\u0409\u040c\3\2\2\2\u040a\u0408"+
		"\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040e\3\2\2\2\u040c\u040a\3\2\2\2\u040d"+
		"\u0405\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u042b\7\5"+
		"\2\2\u0410\u0411\7\'\2\2\u0411\u041a\7\4\2\2\u0412\u0417\5H%\2\u0413\u0414"+
		"\7\6\2\2\u0414\u0416\5H%\2\u0415\u0413\3\2\2\2\u0416\u0419\3\2\2\2\u0417"+
		"\u0415\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2"+
		"\2\2\u041a\u0412\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041c\3\2\2\2\u041c"+
		"\u042b\7\5\2\2\u041d\u041e\7S\2\2\u041e\u041f\7\u00b0\2\2\u041f\u0420"+
		"\7\4\2\2\u0420\u0425\5,\27\2\u0421\u0422\7\6\2\2\u0422\u0424\5,\27\2\u0423"+
		"\u0421\3\2\2\2\u0424\u0427\3\2\2\2\u0425\u0423\3\2\2\2\u0425\u0426\3\2"+
		"\2\2\u0426\u0428\3\2\2\2\u0427\u0425\3\2\2\2\u0428\u0429\7\5\2\2\u0429"+
		"\u042b\3\2\2\2\u042a\u0402\3\2\2\2\u042a\u0403\3\2\2\2\u042a\u0410\3\2"+
		"\2\2\u042a\u041d\3\2\2\2\u042b+\3\2\2\2\u042c\u0435\7\4\2\2\u042d\u0432"+
		"\5H%\2\u042e\u042f\7\6\2\2\u042f\u0431\5H%\2\u0430\u042e\3\2\2\2\u0431"+
		"\u0434\3\2\2\2\u0432\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0436\3\2"+
		"\2\2\u0434\u0432\3\2\2\2\u0435\u042d\3\2\2\2\u0435\u0436\3\2\2\2\u0436"+
		"\u0437\3\2\2\2\u0437\u043a\7\5\2\2\u0438\u043a\5H%\2\u0439\u042c\3\2\2"+
		"\2\u0439\u0438\3\2\2\2\u043a-\3\2\2\2\u043b\u043c\5\u008eH\2\u043c\u043d"+
		"\7\23\2\2\u043d\u043e\7\4\2\2\u043e\u043f\5\60\31\2\u043f\u0440\7\5\2"+
		"\2\u0440/\3\2\2\2\u0441\u0443\5\u008eH\2\u0442\u0441\3\2\2\2\u0442\u0443"+
		"\3\2\2\2\u0443\u044e\3\2\2\2\u0444\u0445\7\u008d\2\2\u0445\u0446\7\31"+
		"\2\2\u0446\u044b\5H%\2\u0447\u0448\7\6\2\2\u0448\u044a\5H%\2\u0449\u0447"+
		"\3\2\2\2\u044a\u044d\3\2\2\2\u044b\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c"+
		"\u044f\3\2\2\2\u044d\u044b\3\2\2\2\u044e\u0444\3\2\2\2\u044e\u044f\3\2"+
		"\2\2\u044f\u045a\3\2\2\2\u0450\u0451\7\u0088\2\2\u0451\u0452\7\31\2\2"+
		"\u0452\u0457\5$\23\2\u0453\u0454\7\6\2\2\u0454\u0456\5$\23\2\u0455\u0453"+
		"\3\2\2\2\u0456\u0459\3\2\2\2\u0457\u0455\3\2\2\2\u0457\u0458\3\2\2\2\u0458"+
		"\u045b\3\2\2\2\u0459\u0457\3\2\2\2\u045a\u0450\3\2\2\2\u045a\u045b\3\2"+
		"\2\2\u045b\u045d\3\2\2\2\u045c\u045e\5r:\2\u045d\u045c\3\2\2\2\u045d\u045e"+
		"\3\2\2\2\u045e\61\3\2\2\2\u045f\u0461\5\u008eH\2\u0460\u0462\5D#\2\u0461"+
		"\u0460\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0464\7\23"+
		"\2\2\u0464\u0465\7\4\2\2\u0465\u0466\5\f\7\2\u0466\u0467\7\5\2\2\u0467"+
		"\63\3\2\2\2\u0468\u0469\t\r\2\2\u0469\65\3\2\2\2\u046a\u046f\5H%\2\u046b"+
		"\u046d\7\23\2\2\u046c\u046b\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\3"+
		"\2\2\2\u046e\u0470\5\u008eH\2\u046f\u046c\3\2\2\2\u046f\u0470\3\2\2\2"+
		"\u0470\u047a\3\2\2\2\u0471\u0472\5P)\2\u0472\u0473\7\3\2\2\u0473\u0476"+
		"\7\u00e2\2\2\u0474\u0475\7\23\2\2\u0475\u0477\5D#\2\u0476\u0474\3\2\2"+
		"\2\u0476\u0477\3\2\2\2\u0477\u047a\3\2\2\2\u0478\u047a\7\u00e2\2\2\u0479"+
		"\u046a\3\2\2\2\u0479\u0471\3\2\2\2\u0479\u0478\3\2\2\2\u047a\67\3\2\2"+
		"\2\u047b\u047c\b\35\1\2\u047c\u047d\5> \2\u047d\u0490\3\2\2\2\u047e\u048c"+
		"\f\4\2\2\u047f\u0480\7&\2\2\u0480\u0481\7e\2\2\u0481\u048d\5> \2\u0482"+
		"\u0483\5:\36\2\u0483\u0484\7e\2\2\u0484\u0485\58\35\2\u0485\u0486\5<\37"+
		"\2\u0486\u048d\3\2\2\2\u0487\u0488\7v\2\2\u0488\u0489\5:\36\2\u0489\u048a"+
		"\7e\2\2\u048a\u048b\5> \2\u048b\u048d\3\2\2\2\u048c\u047f\3\2\2\2\u048c"+
		"\u0482\3\2\2\2\u048c\u0487\3\2\2\2\u048d\u048f\3\2\2\2\u048e\u047e\3\2"+
		"\2\2\u048f\u0492\3\2\2\2\u0490\u048e\3\2\2\2\u0490\u0491\3\2\2\2\u0491"+
		"9\3\2\2\2\u0492\u0490\3\2\2\2\u0493\u0495\7[\2\2\u0494\u0493\3\2\2\2\u0494"+
		"\u0495\3\2\2\2\u0495\u04a3\3\2\2\2\u0496\u0498\7i\2\2\u0497\u0499\7\u008a"+
		"\2\2\u0498\u0497\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u04a3\3\2\2\2\u049a"+
		"\u049c\7\u00a1\2\2\u049b\u049d\7\u008a\2\2\u049c\u049b\3\2\2\2\u049c\u049d"+
		"\3\2\2\2\u049d\u04a3\3\2\2\2\u049e\u04a0\7L\2\2\u049f\u04a1\7\u008a\2"+
		"\2\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a3\3\2\2\2\u04a2\u0494"+
		"\3\2\2\2\u04a2\u0496\3\2\2\2\u04a2\u049a\3\2\2\2\u04a2\u049e\3\2\2\2\u04a3"+
		";\3\2\2\2\u04a4\u04a5\7\u0084\2\2\u04a5\u04b3\5J&\2\u04a6\u04a7\7\u00cc"+
		"\2\2\u04a7\u04a8\7\4\2\2\u04a8\u04ad\5\u008eH\2\u04a9\u04aa\7\6\2\2\u04aa"+
		"\u04ac\5\u008eH\2\u04ab\u04a9\3\2\2\2\u04ac\u04af\3\2\2\2\u04ad\u04ab"+
		"\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04b0\3\2\2\2\u04af\u04ad\3\2\2\2\u04b0"+
		"\u04b1\7\5\2\2\u04b1\u04b3\3\2\2\2\u04b2\u04a4\3\2\2\2\u04b2\u04a6\3\2"+
		"\2\2\u04b3=\3\2\2\2\u04b4\u04bb\5B\"\2\u04b5\u04b6\7\u00b9\2\2\u04b6\u04b7"+
		"\5@!\2\u04b7\u04b8\7\4\2\2\u04b8\u04b9\5H%\2\u04b9\u04ba\7\5\2\2\u04ba"+
		"\u04bc\3\2\2\2\u04bb\u04b5\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc?\3\2\2\2"+
		"\u04bd\u04be\t\16\2\2\u04beA\3\2\2\2\u04bf\u04c7\5F$\2\u04c0\u04c2\7\23"+
		"\2\2\u04c1\u04c0\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3"+
		"\u04c5\5\u008eH\2\u04c4\u04c6\5D#\2\u04c5\u04c4\3\2\2\2\u04c5\u04c6\3"+
		"\2\2\2\u04c6\u04c8\3\2\2\2\u04c7\u04c1\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8"+
		"C\3\2\2\2\u04c9\u04ca\7\4\2\2\u04ca\u04cf\5\u008eH\2\u04cb\u04cc\7\6\2"+
		"\2\u04cc\u04ce\5\u008eH\2\u04cd\u04cb\3\2\2\2\u04ce\u04d1\3\2\2\2\u04cf"+
		"\u04cd\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d2\3\2\2\2\u04d1\u04cf\3\2"+
		"\2\2\u04d2\u04d3\7\5\2\2\u04d3E\3\2\2\2\u04d4\u04f2\5\u0086D\2\u04d5\u04d6"+
		"\7\4\2\2\u04d6\u04d7\5\f\7\2\u04d7\u04d8\7\5\2\2\u04d8\u04f2\3\2\2\2\u04d9"+
		"\u04da\7\u00c8\2\2\u04da\u04db\7\4\2\2\u04db\u04e0\5H%\2\u04dc\u04dd\7"+
		"\6\2\2\u04dd\u04df\5H%\2\u04de\u04dc\3\2\2\2\u04df\u04e2\3\2\2\2\u04e0"+
		"\u04de\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e3\3\2\2\2\u04e2\u04e0\3\2"+
		"\2\2\u04e3\u04e6\7\5\2\2\u04e4\u04e5\7\u00d4\2\2\u04e5\u04e7\7\u0089\2"+
		"\2\u04e6\u04e4\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04f2\3\2\2\2\u04e8\u04e9"+
		"\7h\2\2\u04e9\u04ea\7\4\2\2\u04ea\u04eb\5\f\7\2\u04eb\u04ec\7\5\2\2\u04ec"+
		"\u04f2\3\2\2\2\u04ed\u04ee\7\4\2\2\u04ee\u04ef\58\35\2\u04ef\u04f0\7\5"+
		"\2\2\u04f0\u04f2\3\2\2\2\u04f1\u04d4\3\2\2\2\u04f1\u04d5\3\2\2\2\u04f1"+
		"\u04d9\3\2\2\2\u04f1\u04e8\3\2\2\2\u04f1\u04ed\3\2\2\2\u04f2G\3\2\2\2"+
		"\u04f3\u04f4\5J&\2\u04f4I\3\2\2\2\u04f5\u04f6\b&\1\2\u04f6\u04f8\5N(\2"+
		"\u04f7\u04f9\5L\'\2\u04f8\u04f7\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fd"+
		"\3\2\2\2\u04fa\u04fb\7\177\2\2\u04fb\u04fd\5J&\5\u04fc\u04f5\3\2\2\2\u04fc"+
		"\u04fa\3\2\2\2\u04fd\u0506\3\2\2\2\u04fe\u04ff\f\4\2\2\u04ff\u0500\7\20"+
		"\2\2\u0500\u0505\5J&\5\u0501\u0502\f\3\2\2\u0502\u0503\7\u0087\2\2\u0503"+
		"\u0505\5J&\4\u0504\u04fe\3\2\2\2\u0504\u0501\3\2\2\2\u0505\u0508\3\2\2"+
		"\2\u0506\u0504\3\2\2\2\u0506\u0507\3\2\2\2\u0507K\3\2\2\2\u0508\u0506"+
		"\3\2\2\2\u0509\u050a\5X-\2\u050a\u050b\5N(\2\u050b\u0547\3\2\2\2\u050c"+
		"\u050d\5X-\2\u050d\u050e\5Z.\2\u050e\u050f\7\4\2\2\u050f\u0510\5\f\7\2"+
		"\u0510\u0511\7\5\2\2\u0511\u0547\3\2\2\2\u0512\u0514\7\177\2\2\u0513\u0512"+
		"\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0516\7\30\2\2"+
		"\u0516\u0517\5N(\2\u0517\u0518\7\20\2\2\u0518\u0519\5N(\2\u0519\u0547"+
		"\3\2\2\2\u051a\u051c\7\177\2\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2\2"+
		"\u051c\u051d\3\2\2\2\u051d\u051e\7Y\2\2\u051e\u051f\7\4\2\2\u051f\u0524"+
		"\5H%\2\u0520\u0521\7\6\2\2\u0521\u0523\5H%\2\u0522\u0520\3\2\2\2\u0523"+
		"\u0526\3\2\2\2\u0524\u0522\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0527\3\2"+
		"\2\2\u0526\u0524\3\2\2\2\u0527\u0528\7\5\2\2\u0528\u0547\3\2\2\2\u0529"+
		"\u052b\7\177\2\2\u052a\u0529\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052c\3"+
		"\2\2\2\u052c\u052d\7Y\2\2\u052d\u052e\7\4\2\2\u052e\u052f\5\f\7\2\u052f"+
		"\u0530\7\5\2\2\u0530\u0547\3\2\2\2\u0531\u0533\7\177\2\2\u0532\u0531\3"+
		"\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0535\7k\2\2\u0535"+
		"\u0538\5N(\2\u0536\u0537\7=\2\2\u0537\u0539\5N(\2\u0538\u0536\3\2\2\2"+
		"\u0538\u0539\3\2\2\2\u0539\u0547\3\2\2\2\u053a\u053c\7c\2\2\u053b\u053d"+
		"\7\177\2\2\u053c\u053b\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053e\3\2\2\2"+
		"\u053e\u0547\7\u0080\2\2\u053f\u0541\7c\2\2\u0540\u0542\7\177\2\2\u0541"+
		"\u0540\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0544\7\67"+
		"\2\2\u0544\u0545\7K\2\2\u0545\u0547\5N(\2\u0546\u0509\3\2\2\2\u0546\u050c"+
		"\3\2\2\2\u0546\u0513\3\2\2\2\u0546\u051b\3\2\2\2\u0546\u052a\3\2\2\2\u0546"+
		"\u0532\3\2\2\2\u0546\u053a\3\2\2\2\u0546\u053f\3\2\2\2\u0547M\3\2\2\2"+
		"\u0548\u0549\b(\1\2\u0549\u054d\5P)\2\u054a\u054b\t\17\2\2\u054b\u054d"+
		"\5N(\6\u054c\u0548\3\2\2\2\u054c\u054a\3\2\2\2\u054d\u055c\3\2\2\2\u054e"+
		"\u054f\f\5\2\2\u054f\u0550\t\20\2\2\u0550\u055b\5N(\6\u0551\u0552\f\4"+
		"\2\2\u0552\u0553\t\17\2\2\u0553\u055b\5N(\5\u0554\u0555\f\3\2\2\u0555"+
		"\u0556\7\u00e5\2\2\u0556\u055b\5N(\4\u0557\u0558\f\7\2\2\u0558\u0559\7"+
		"\25\2\2\u0559\u055b\5V,\2\u055a\u054e\3\2\2\2\u055a\u0551\3\2\2\2\u055a"+
		"\u0554\3\2\2\2\u055a\u0557\3\2\2\2\u055b\u055e\3\2\2\2\u055c\u055a\3\2"+
		"\2\2\u055c\u055d\3\2\2\2\u055dO\3\2\2\2\u055e\u055c\3\2\2\2\u055f\u0560"+
		"\b)\1\2\u0560\u0651\7\u0080\2\2\u0561\u0651\5^\60\2\u0562\u0563\5\u008e"+
		"H\2\u0563\u0564\5T+\2\u0564\u0651\3\2\2\2\u0565\u0566\79\2\2\u0566\u0567"+
		"\7\u0092\2\2\u0567\u0651\5T+\2\u0568\u0651\5\u0090I\2\u0569\u0651\5\\"+
		"/\2\u056a\u0651\5T+\2\u056b\u0651\7\u00e8\2\2\u056c\u0651\7\u00f3\2\2"+
		"\u056d\u056e\7\u0090\2\2\u056e\u056f\7\4\2\2\u056f\u0570\5N(\2\u0570\u0571"+
		"\7Y\2\2\u0571\u0572\5N(\2\u0572\u0573\7\5\2\2\u0573\u0651\3\2\2\2\u0574"+
		"\u0575\7\4\2\2\u0575\u0578\5H%\2\u0576\u0577\7\6\2\2\u0577\u0579\5H%\2"+
		"\u0578\u0576\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u0578\3\2\2\2\u057a\u057b"+
		"\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u057d\7\5\2\2\u057d\u0651\3\2\2\2\u057e"+
		"\u057f\7\u00a6\2\2\u057f\u0580\7\4\2\2\u0580\u0585\5H%\2\u0581\u0582\7"+
		"\6\2\2\u0582\u0584\5H%\2\u0583\u0581\3\2\2\2\u0584\u0587\3\2\2\2\u0585"+
		"\u0583\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0588\3\2\2\2\u0587\u0585\3\2"+
		"\2\2\u0588\u0589\7\5\2\2\u0589\u0651\3\2\2\2\u058a\u058b\5\u0086D\2\u058b"+
		"\u058c\7\4\2\2\u058c\u058d\7\u00e2\2\2\u058d\u058f\7\5\2\2\u058e\u0590"+
		"\5l\67\2\u058f\u058e\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0592\3\2\2\2\u0591"+
		"\u0593\5p9\2\u0592\u0591\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0651\3\2\2"+
		"\2\u0594\u0595\5\u0086D\2\u0595\u05a1\7\4\2\2\u0596\u0598\5\64\33\2\u0597"+
		"\u0596\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059e\5H"+
		"%\2\u059a\u059b\7\6\2\2\u059b\u059d\5H%\2\u059c\u059a\3\2\2\2\u059d\u05a0"+
		"\3\2\2\2\u059e\u059c\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a2\3\2\2\2\u05a0"+
		"\u059e\3\2\2\2\u05a1\u0597\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05ad\3\2"+
		"\2\2\u05a3\u05a4\7\u0088\2\2\u05a4\u05a5\7\31\2\2\u05a5\u05aa\5$\23\2"+
		"\u05a6\u05a7\7\6\2\2\u05a7\u05a9\5$\23\2\u05a8\u05a6\3\2\2\2\u05a9\u05ac"+
		"\3\2\2\2\u05aa\u05a8\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ae\3\2\2\2\u05ac"+
		"\u05aa\3\2\2\2\u05ad\u05a3\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05af\3\2"+
		"\2\2\u05af\u05b1\7\5\2\2\u05b0\u05b2\5l\67\2\u05b1\u05b0\3\2\2\2\u05b1"+
		"\u05b2\3\2\2\2\u05b2\u05b7\3\2\2\2\u05b3\u05b5\5R*\2\u05b4\u05b3\3\2\2"+
		"\2\u05b4\u05b5\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b8\5p9\2\u05b7\u05b4"+
		"\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u0651\3\2\2\2\u05b9\u05ba\5\u008eH"+
		"\2\u05ba\u05bb\7\7\2\2\u05bb\u05bc\5H%\2\u05bc\u0651\3\2\2\2\u05bd\u05c6"+
		"\7\4\2\2\u05be\u05c3\5\u008eH\2\u05bf\u05c0\7\6\2\2\u05c0\u05c2\5\u008e"+
		"H\2\u05c1\u05bf\3\2\2\2\u05c2\u05c5\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c3"+
		"\u05c4\3\2\2\2\u05c4\u05c7\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c6\u05be\3\2"+
		"\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9\7\5\2\2\u05c9"+
		"\u05ca\7\7\2\2\u05ca\u0651\5H%\2\u05cb\u05cc\7\4\2\2\u05cc\u05cd\5\f\7"+
		"\2\u05cd\u05ce\7\5\2\2\u05ce\u0651\3\2\2\2\u05cf\u05d0\7A\2\2\u05d0\u05d1"+
		"\7\4\2\2\u05d1\u05d2\5\f\7\2\u05d2\u05d3\7\5\2\2\u05d3\u0651\3\2\2\2\u05d4"+
		"\u05d5\7\34\2\2\u05d5\u05d7\5H%\2\u05d6\u05d8\5j\66\2\u05d7\u05d6\3\2"+
		"\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05d7\3\2\2\2\u05d9\u05da\3\2\2\2\u05da"+
		"\u05dd\3\2\2\2\u05db\u05dc\7;\2\2\u05dc\u05de\5H%\2\u05dd\u05db\3\2\2"+
		"\2\u05dd\u05de\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e0\7<\2\2\u05e0\u0651"+
		"\3\2\2\2\u05e1\u05e3\7\34\2\2\u05e2\u05e4\5j\66\2\u05e3\u05e2\3\2\2\2"+
		"\u05e4\u05e5\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e9"+
		"\3\2\2\2\u05e7\u05e8\7;\2\2\u05e8\u05ea\5H%\2\u05e9\u05e7\3\2\2\2\u05e9"+
		"\u05ea\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ec\7<\2\2\u05ec\u0651\3\2"+
		"\2\2\u05ed\u05ee\7\35\2\2\u05ee\u05ef\7\4\2\2\u05ef\u05f0\5H%\2\u05f0"+
		"\u05f1\7\23\2\2\u05f1\u05f2\5d\63\2\u05f2\u05f3\7\5\2\2\u05f3\u0651\3"+
		"\2\2\2\u05f4\u05f5\7\u00c2\2\2\u05f5\u05f6\7\4\2\2\u05f6\u05f7\5H%\2\u05f7"+
		"\u05f8\7\23\2\2\u05f8\u05f9\5d\63\2\u05f9\u05fa\7\5\2\2\u05fa\u0651\3"+
		"\2\2\2\u05fb\u05fc\7\22\2\2\u05fc\u0605\7\b\2\2\u05fd\u0602\5H%\2\u05fe"+
		"\u05ff\7\6\2\2\u05ff\u0601\5H%\2\u0600\u05fe\3\2\2\2\u0601\u0604\3\2\2"+
		"\2\u0602\u0600\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0606\3\2\2\2\u0604\u0602"+
		"\3\2\2\2\u0605\u05fd\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0607\3\2\2\2\u0607"+
		"\u0651\7\t\2\2\u0608\u0651\5\u008eH\2\u0609\u0651\7)\2\2\u060a\u060e\7"+
		",\2\2\u060b\u060c\7\4\2\2\u060c\u060d\7\u00e9\2\2\u060d\u060f\7\5\2\2"+
		"\u060e\u060b\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0651\3\2\2\2\u0610\u0614"+
		"\7-\2\2\u0611\u0612\7\4\2\2\u0612\u0613\7\u00e9\2\2\u0613\u0615\7\5\2"+
		"\2\u0614\u0611\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0651\3\2\2\2\u0616\u061a"+
		"\7m\2\2\u0617\u0618\7\4\2\2\u0618\u0619\7\u00e9\2\2\u0619\u061b\7\5\2"+
		"\2\u061a\u0617\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u0651\3\2\2\2\u061c\u0620"+
		"\7n\2\2\u061d\u061e\7\4\2\2\u061e\u061f\7\u00e9\2\2\u061f\u0621\7\5\2"+
		"\2\u0620\u061d\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0651\3\2\2\2\u0622\u0651"+
		"\7.\2\2\u0623\u0651\7*\2\2\u0624\u0625\7\u00b5\2\2\u0625\u0626\7\4\2\2"+
		"\u0626\u0627\5N(\2\u0627\u0628\7K\2\2\u0628\u062b\5N(\2\u0629\u062a\7"+
		"I\2\2\u062a\u062c\5N(\2\u062b\u0629\3\2\2\2\u062b\u062c\3\2\2\2\u062c"+
		"\u062d\3\2\2\2\u062d\u062e\7\5\2\2\u062e\u0651\3\2\2\2\u062f\u0630\7~"+
		"\2\2\u0630\u0631\7\4\2\2\u0631\u0634\5N(\2\u0632\u0633\7\6\2\2\u0633\u0635"+
		"\5b\62\2\u0634\u0632\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u0636\3\2\2\2\u0636"+
		"\u0637\7\5\2\2\u0637\u0651\3\2\2\2\u0638\u0639\7C\2\2\u0639\u063a\7\4"+
		"\2\2\u063a\u063b\5\u008eH\2\u063b\u063c\7K\2\2\u063c\u063d\5N(\2\u063d"+
		"\u063e\7\5\2\2\u063e\u0651\3\2\2\2\u063f\u0640\7\4\2\2\u0640\u0641\5H"+
		"%\2\u0641\u0642\7\5\2\2\u0642\u0651\3\2\2\2\u0643\u0644\7S\2\2\u0644\u064d"+
		"\7\4\2\2\u0645\u064a\5\u0086D\2\u0646\u0647\7\6\2\2\u0647\u0649\5\u0086"+
		"D\2\u0648\u0646\3\2\2\2\u0649\u064c\3\2\2\2\u064a\u0648\3\2\2\2\u064a"+
		"\u064b\3\2\2\2\u064b\u064e\3\2\2\2\u064c\u064a\3\2\2\2\u064d\u0645\3\2"+
		"\2\2\u064d\u064e\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0651\7\5\2\2\u0650"+
		"\u055f\3\2\2\2\u0650\u0561\3\2\2\2\u0650\u0562\3\2\2\2\u0650\u0565\3\2"+
		"\2\2\u0650\u0568\3\2\2\2\u0650\u0569\3\2\2\2\u0650\u056a\3\2\2\2\u0650"+
		"\u056b\3\2\2\2\u0650\u056c\3\2\2\2\u0650\u056d\3\2\2\2\u0650\u0574\3\2"+
		"\2\2\u0650\u057e\3\2\2\2\u0650\u058a\3\2\2\2\u0650\u0594\3\2\2\2\u0650"+
		"\u05b9\3\2\2\2\u0650\u05bd\3\2\2\2\u0650\u05cb\3\2\2\2\u0650\u05cf\3\2"+
		"\2\2\u0650\u05d4\3\2\2\2\u0650\u05e1\3\2\2\2\u0650\u05ed\3\2\2\2\u0650"+
		"\u05f4\3\2\2\2\u0650\u05fb\3\2\2\2\u0650\u0608\3\2\2\2\u0650\u0609\3\2"+
		"\2\2\u0650\u060a\3\2\2\2\u0650\u0610\3\2\2\2\u0650\u0616\3\2\2\2\u0650"+
		"\u061c\3\2\2\2\u0650\u0622\3\2\2\2\u0650\u0623\3\2\2\2\u0650\u0624\3\2"+
		"\2\2\u0650\u062f\3\2\2\2\u0650\u0638\3\2\2\2\u0650\u063f\3\2\2\2\u0650"+
		"\u0643\3\2\2\2\u0651\u065c\3\2\2\2\u0652\u0653\f\21\2\2\u0653\u0654\7"+
		"\b\2\2\u0654\u0655\5N(\2\u0655\u0656\7\t\2\2\u0656\u065b\3\2\2\2\u0657"+
		"\u0658\f\17\2\2\u0658\u0659\7\3\2\2\u0659\u065b\5\u008eH\2\u065a\u0652"+
		"\3\2\2\2\u065a\u0657\3\2\2\2\u065b\u065e\3\2\2\2\u065c\u065a\3\2\2\2\u065c"+
		"\u065d\3\2\2\2\u065dQ\3\2\2\2\u065e\u065c\3\2\2\2\u065f\u0660\7X\2\2\u0660"+
		"\u0664\7\u0082\2\2\u0661\u0662\7\u009e\2\2\u0662\u0664\7\u0082\2\2\u0663"+
		"\u065f\3\2\2\2\u0663\u0661\3\2\2\2\u0664S\3\2\2\2\u0665\u066c\7\u00e6"+
		"\2\2\u0666\u0669\7\u00e7\2\2\u0667\u0668\7\u00c4\2\2\u0668\u066a\7\u00e6"+
		"\2\2\u0669\u0667\3\2\2\2\u0669\u066a\3\2\2\2\u066a\u066c\3\2\2\2\u066b"+
		"\u0665\3\2\2\2\u066b\u0666\3\2\2\2\u066cU\3\2\2\2\u066d\u066e\7\u00bd"+
		"\2\2\u066e\u066f\7\u00d9\2\2\u066f\u0674\5^\60\2\u0670\u0671\7\u00bd\2"+
		"\2\u0671\u0672\7\u00d9\2\2\u0672\u0674\5T+\2\u0673\u066d\3\2\2\2\u0673"+
		"\u0670\3\2\2\2\u0674W\3\2\2\2\u0675\u0676\t\21\2\2\u0676Y\3\2\2\2\u0677"+
		"\u0678\t\22\2\2\u0678[\3\2\2\2\u0679\u067a\t\23\2\2\u067a]\3\2\2\2\u067b"+
		"\u067d\7_\2\2\u067c\u067e\t\17\2\2\u067d\u067c\3\2\2\2\u067d\u067e\3\2"+
		"\2\2\u067e\u067f\3\2\2\2\u067f\u0680\5T+\2\u0680\u0683\5`\61\2\u0681\u0682"+
		"\7\u00bf\2\2\u0682\u0684\5`\61\2\u0683\u0681\3\2\2\2\u0683\u0684\3\2\2"+
		"\2\u0684_\3\2\2\2\u0685\u0686\t\24\2\2\u0686a\3\2\2\2\u0687\u0688\t\25"+
		"\2\2\u0688c\3\2\2\2\u0689\u068a\b\63\1\2\u068a\u068b\7\u00a6\2\2\u068b"+
		"\u068c\7\4\2\2\u068c\u0691\5f\64\2\u068d\u068e\7\6\2\2\u068e\u0690\5f"+
		"\64\2\u068f\u068d\3\2\2\2\u0690\u0693\3\2\2\2\u0691\u068f\3\2\2\2\u0691"+
		"\u0692\3\2\2\2\u0692\u0694\3\2\2\2\u0693\u0691\3\2\2\2\u0694\u0695\7\5"+
		"\2\2\u0695\u06e5\3\2\2\2\u0696\u0697\7_\2\2\u0697\u069a\5`\61\2\u0698"+
		"\u0699\7\u00bf\2\2\u0699\u069b\5`\61\2\u069a\u0698\3\2\2\2\u069a\u069b"+
		"\3\2\2\2\u069b\u06e5\3\2\2\2\u069c\u06a1\7\u00be\2\2\u069d\u069e\7\4\2"+
		"\2\u069e\u069f\5h\65\2\u069f\u06a0\7\5\2\2\u06a0\u06a2\3\2\2\2\u06a1\u069d"+
		"\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a6\3\2\2\2\u06a3\u06a4\7\u00d5\2"+
		"\2\u06a4\u06a5\7\u00bd\2\2\u06a5\u06a7\7\u00d9\2\2\u06a6\u06a3\3\2\2\2"+
		"\u06a6\u06a7\3\2\2\2\u06a7\u06e5\3\2\2\2\u06a8\u06ad\7\u00be\2\2\u06a9"+
		"\u06aa\7\4\2\2\u06aa\u06ab\5h\65\2\u06ab\u06ac\7\5\2\2\u06ac\u06ae\3\2"+
		"\2\2\u06ad\u06a9\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06af\3\2\2\2\u06af"+
		"\u06b0\7\u00d4\2\2\u06b0\u06b1\7\u00bd\2\2\u06b1\u06e5\7\u00d9\2\2\u06b2"+
		"\u06b7\7\u00bd\2\2\u06b3\u06b4\7\4\2\2\u06b4\u06b5\5h\65\2\u06b5\u06b6"+
		"\7\5\2\2\u06b6\u06b8\3\2\2\2\u06b7\u06b3\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8"+
		"\u06bc\3\2\2\2\u06b9\u06ba\7\u00d5\2\2\u06ba\u06bb\7\u00bd\2\2\u06bb\u06bd"+
		"\7\u00d9\2\2\u06bc\u06b9\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06e5\3\2\2"+
		"\2\u06be\u06c3\7\u00bd\2\2\u06bf\u06c0\7\4\2\2\u06c0\u06c1\5h\65\2\u06c1"+
		"\u06c2\7\5\2\2\u06c2\u06c4\3\2\2\2\u06c3\u06bf\3\2\2\2\u06c3\u06c4\3\2"+
		"\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c6\7\u00d4\2\2\u06c6\u06c7\7\u00bd\2"+
		"\2\u06c7\u06e5\7\u00d9\2\2\u06c8\u06c9\79\2\2\u06c9\u06e5\7\u0092\2\2"+
		"\u06ca\u06cb\7\22\2\2\u06cb\u06cc\7\u00dc\2\2\u06cc\u06cd\5d\63\2\u06cd"+
		"\u06ce\7\u00de\2\2\u06ce\u06e5\3\2\2\2\u06cf\u06d0\7p\2\2\u06d0\u06d1"+
		"\7\u00dc\2\2\u06d1\u06d2\5d\63\2\u06d2\u06d3\7\6\2\2\u06d3\u06d4\5d\63"+
		"\2\u06d4\u06d5\7\u00de\2\2\u06d5\u06e5\3\2\2\2\u06d6\u06e2\5\u008eH\2"+
		"\u06d7\u06d8\7\4\2\2\u06d8\u06dd\5h\65\2\u06d9\u06da\7\6\2\2\u06da\u06dc"+
		"\5h\65\2\u06db\u06d9\3\2\2\2\u06dc\u06df\3\2\2\2\u06dd\u06db\3\2\2\2\u06dd"+
		"\u06de\3\2\2\2\u06de\u06e0\3\2\2\2\u06df\u06dd\3\2\2\2\u06e0\u06e1\7\5"+
		"\2\2\u06e1\u06e3\3\2\2\2\u06e2\u06d7\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3"+
		"\u06e5\3\2\2\2\u06e4\u0689\3\2\2\2\u06e4\u0696\3\2\2\2\u06e4\u069c\3\2"+
		"\2\2\u06e4\u06a8\3\2\2\2\u06e4\u06b2\3\2\2\2\u06e4\u06be\3\2\2\2\u06e4"+
		"\u06c8\3\2\2\2\u06e4\u06ca\3\2\2\2\u06e4\u06cf\3\2\2\2\u06e4\u06d6\3\2"+
		"\2\2\u06e5\u06ef\3\2\2\2\u06e6\u06e7\f\4\2\2\u06e7\u06eb\7\22\2\2\u06e8"+
		"\u06e9\7\b\2\2\u06e9\u06ea\7\u00e9\2\2\u06ea\u06ec\7\t\2\2\u06eb\u06e8"+
		"\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ee\3\2\2\2\u06ed\u06e6\3\2\2\2\u06ee"+
		"\u06f1\3\2\2\2\u06ef\u06ed\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0e\3\2\2\2"+
		"\u06f1\u06ef\3\2\2\2\u06f2\u06f7\5d\63\2\u06f3\u06f4\5\u008eH\2\u06f4"+
		"\u06f5\5d\63\2\u06f5\u06f7\3\2\2\2\u06f6\u06f2\3\2\2\2\u06f6\u06f3\3\2"+
		"\2\2\u06f7g\3\2\2\2\u06f8\u06fb\7\u00e9\2\2\u06f9\u06fb\5d\63\2\u06fa"+
		"\u06f8\3\2\2\2\u06fa\u06f9\3\2\2\2\u06fbi\3\2\2\2\u06fc\u06fd\7\u00d1"+
		"\2\2\u06fd\u06fe\5H%\2\u06fe\u06ff\7\u00bb\2\2\u06ff\u0700\5H%\2\u0700"+
		"k\3\2\2\2\u0701\u0702\7F\2\2\u0702\u0703\7\4\2\2\u0703\u0704\7\u00d2\2"+
		"\2\u0704\u0705\5J&\2\u0705\u0706\7\5\2\2\u0706m\3\2\2\2\u0707\u0708\7"+
		"\u00d1\2\2\u0708\u070b\7q\2\2\u0709\u070a\7\20\2\2\u070a\u070c\5H%\2\u070b"+
		"\u0709\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u070e\7\u00bb"+
		"\2\2\u070e\u070f\7\u00c9\2\2\u070f\u0710\7\u00af\2\2\u0710\u0711\5\u008e"+
		"H\2\u0711\u0712\7\u00da\2\2\u0712\u071a\5H%\2\u0713\u0714\7\6\2\2\u0714"+
		"\u0715\5\u008eH\2\u0715\u0716\7\u00da\2\2\u0716\u0717\5H%\2\u0717\u0719"+
		"\3\2\2\2\u0718\u0713\3\2\2\2\u0719\u071c\3\2\2\2\u071a\u0718\3\2\2\2\u071a"+
		"\u071b\3\2\2\2\u071b\u0748\3\2\2\2\u071c\u071a\3\2\2\2\u071d\u071e\7\u00d1"+
		"\2\2\u071e\u0721\7q\2\2\u071f\u0720\7\20\2\2\u0720\u0722\5H%\2\u0721\u071f"+
		"\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u0724\7\u00bb\2"+
		"\2\u0724\u0748\7\64\2\2\u0725\u0726\7\u00d1\2\2\u0726\u0727\7\177\2\2"+
		"\u0727\u072a\7q\2\2\u0728\u0729\7\20\2\2\u0729\u072b\5H%\2\u072a\u0728"+
		"\3\2\2\2\u072a\u072b\3\2\2\2\u072b\u072c\3\2\2\2\u072c\u072d\7\u00bb\2"+
		"\2\u072d\u0739\7]\2\2\u072e\u072f\7\4\2\2\u072f\u0734\5\u008eH\2\u0730"+
		"\u0731\7\6\2\2\u0731\u0733\5\u008eH\2\u0732\u0730\3\2\2\2\u0733\u0736"+
		"\3\2\2\2\u0734\u0732\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u0737\3\2\2\2\u0736"+
		"\u0734\3\2\2\2\u0737\u0738\7\5\2\2\u0738\u073a\3\2\2\2\u0739\u072e\3\2"+
		"\2\2\u0739\u073a\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u073c\7\u00ce\2\2\u073c"+
		"\u073d\7\4\2\2\u073d\u0742\5H%\2\u073e\u073f\7\6\2\2\u073f\u0741\5H%\2"+
		"\u0740\u073e\3\2\2\2\u0741\u0744\3\2\2\2\u0742\u0740\3\2\2\2\u0742\u0743"+
		"\3\2\2\2\u0743\u0745\3\2\2\2\u0744\u0742\3\2\2\2\u0745\u0746\7\5\2\2\u0746"+
		"\u0748\3\2\2\2\u0747\u0707\3\2\2\2\u0747\u071d\3\2\2\2\u0747\u0725\3\2"+
		"\2\2\u0748o\3\2\2\2\u0749\u074f\7\u008c\2\2\u074a\u0750\5\u008eH\2\u074b"+
		"\u074c\7\4\2\2\u074c\u074d\5\60\31\2\u074d\u074e\7\5\2\2\u074e\u0750\3"+
		"\2\2\2\u074f\u074a\3\2\2\2\u074f\u074b\3\2\2\2\u0750q\3\2\2\2\u0751\u0752"+
		"\7\u0096\2\2\u0752\u076a\5t;\2\u0753\u0754\7\u00a7\2\2\u0754\u076a\5t"+
		";\2\u0755\u0756\7T\2\2\u0756\u076a\5t;\2\u0757\u0758\7\u0096\2\2\u0758"+
		"\u0759\7\30\2\2\u0759\u075a\5t;\2\u075a\u075b\7\20\2\2\u075b\u075c\5t"+
		";\2\u075c\u076a\3\2\2\2\u075d\u075e\7\u00a7\2\2\u075e\u075f\7\30\2\2\u075f"+
		"\u0760\5t;\2\u0760\u0761\7\20\2\2\u0761\u0762\5t;\2\u0762\u076a\3\2\2"+
		"\2\u0763\u0764\7T\2\2\u0764\u0765\7\30\2\2\u0765\u0766\5t;\2\u0766\u0767"+
		"\7\20\2\2\u0767\u0768\5t;\2\u0768\u076a\3\2\2\2\u0769\u0751\3\2\2\2\u0769"+
		"\u0753\3\2\2\2\u0769\u0755\3\2\2\2\u0769\u0757\3\2\2\2\u0769\u075d\3\2"+
		"\2\2\u0769\u0763\3\2\2\2\u076as\3\2\2\2\u076b\u076c\7\u00c5\2\2\u076c"+
		"\u0775\7\u0091\2\2\u076d\u076e\7\u00c5\2\2\u076e\u0775\7H\2\2\u076f\u0770"+
		"\7(\2\2\u0770\u0775\7\u00a6\2\2\u0771\u0772\5H%\2\u0772\u0773\t\26\2\2"+
		"\u0773\u0775\3\2\2\2\u0774\u076b\3\2\2\2\u0774\u076d\3\2\2\2\u0774\u076f"+
		"\3\2\2\2\u0774\u0771\3\2\2\2\u0775u\3\2\2\2\u0776\u0777\5\u008eH\2\u0777"+
		"\u0778\7\u00da\2\2\u0778\u0779\5H%\2\u0779w\3\2\2\2\u077a\u077b\7J\2\2"+
		"\u077b\u077f\t\27\2\2\u077c\u077d\7\u00c3\2\2\u077d\u077f\t\30\2\2\u077e"+
		"\u077a\3\2\2\2\u077e\u077c\3\2\2\2\u077fy\3\2\2\2\u0780\u0781\7d\2\2\u0781"+
		"\u0782\7j\2\2\u0782\u0786\5|?\2\u0783\u0784\7\u0097\2\2\u0784\u0786\t"+
		"\31\2\2\u0785\u0780\3\2\2\2\u0785\u0783\3\2\2\2\u0786{\3\2\2\2\u0787\u0788"+
		"\7\u0097\2\2\u0788\u078f\7\u00c6\2\2\u0789\u078a\7\u0097\2\2\u078a\u078f"+
		"\7#\2\2\u078b\u078c\7\u009b\2\2\u078c\u078f\7\u0097\2\2\u078d\u078f\7"+
		"\u00ad\2\2\u078e\u0787\3\2\2\2\u078e\u0789\3\2\2\2\u078e\u078b\3\2\2\2"+
		"\u078e\u078d\3\2\2\2\u078f}\3\2\2\2\u0790\u0796\5H%\2\u0791\u0792\5\u008e"+
		"H\2\u0792\u0793\7\n\2\2\u0793\u0794\5H%\2\u0794\u0796\3\2\2\2\u0795\u0790"+
		"\3\2\2\2\u0795\u0791\3\2\2\2\u0796\177\3\2\2\2\u0797\u0798\5\u008eH\2"+
		"\u0798\u0799\7\3\2\2\u0799\u079a\5\u008eH\2\u079a\u079d\3\2\2\2\u079b"+
		"\u079d\5\u008eH\2\u079c\u0797\3\2\2\2\u079c\u079b\3\2\2\2\u079d\u0081"+
		"\3\2\2\2\u079e\u07a3\5\u0080A\2\u079f\u07a0\7\6\2\2\u07a0\u07a2\5\u0080"+
		"A\2\u07a1\u079f\3\2\2\2\u07a2\u07a5\3\2\2\2\u07a3\u07a1\3\2\2\2\u07a3"+
		"\u07a4\3\2\2\2\u07a4\u0083\3\2\2\2\u07a5\u07a3\3\2\2\2\u07a6\u07a7\t\32"+
		"\2\2\u07a7\u0085\3\2\2\2\u07a8\u07ad\5\u008eH\2\u07a9\u07aa\7\3\2\2\u07aa"+
		"\u07ac\5\u008eH\2\u07ab\u07a9\3\2\2\2\u07ac\u07af\3\2\2\2\u07ad\u07ab"+
		"\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u0087\3\2\2\2\u07af\u07ad\3\2\2\2\u07b0"+
		"\u07b4\5\u008aF\2\u07b1\u07b4\7.\2\2\u07b2\u07b4\7+\2\2\u07b3\u07b0\3"+
		"\2\2\2\u07b3\u07b1\3\2\2\2\u07b3\u07b2\3\2\2\2\u07b4\u0089\3\2\2\2\u07b5"+
		"\u07bb\5\u008eH\2\u07b6\u07b7\7\u00cb\2\2\u07b7\u07bb\5\u008eH\2\u07b8"+
		"\u07b9\7\u00a2\2\2\u07b9\u07bb\5\u008eH\2\u07ba\u07b5\3\2\2\2\u07ba\u07b6"+
		"\3\2\2\2\u07ba\u07b8\3\2\2\2\u07bb\u008b\3\2\2\2\u07bc\u07c1\5\u008eH"+
		"\2\u07bd\u07be\7\6\2\2\u07be\u07c0\5\u008eH\2\u07bf\u07bd\3\2\2\2\u07c0"+
		"\u07c3\3\2\2\2\u07c1\u07bf\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u008d\3\2"+
		"\2\2\u07c3\u07c1\3\2\2\2\u07c4\u07ca\7\u00ec\2\2\u07c5\u07ca\7\u00ee\2"+
		"\2\u07c6\u07ca\5\u0092J\2\u07c7\u07ca\7\u00ef\2\2\u07c8\u07ca\7\u00ed"+
		"\2\2\u07c9\u07c4\3\2\2\2\u07c9\u07c5\3\2\2\2\u07c9\u07c6\3\2\2\2\u07c9"+
		"\u07c7\3\2\2\2\u07c9\u07c8\3\2\2\2\u07ca\u008f\3\2\2\2\u07cb\u07cd\7\u00e1"+
		"\2\2\u07cc\u07cb\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u07ce\3\2\2\2\u07ce"+
		"\u07d8\7\u00ea\2\2\u07cf\u07d1\7\u00e1\2\2\u07d0\u07cf\3\2\2\2\u07d0\u07d1"+
		"\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d8\7\u00eb\2\2\u07d3\u07d5\7\u00e1"+
		"\2\2\u07d4\u07d3\3\2\2\2\u07d4\u07d5\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6"+
		"\u07d8\7\u00e9\2\2\u07d7\u07cc\3\2\2\2\u07d7\u07d0\3\2\2\2\u07d7\u07d4"+
		"\3\2\2\2\u07d8\u0091\3\2\2\2\u07d9\u07da\t\33\2\2\u07da\u0093\3\2\2\2"+
		"\u0105\u00ad\u00b2\u00b6\u00bc\u00c0\u00d5\u00d9\u00dd\u00e1\u00e9\u00ed"+
		"\u00f0\u00f7\u0100\u0106\u010a\u0110\u0117\u0120\u0126\u0134\u013d\u0143"+
		"\u014a\u0154\u015b\u0163\u016b\u017a\u017f\u0186\u018b\u018f\u0197\u019d"+
		"\u01a1\u01af\u01b6\u01cf\u01d2\u01dc\u01e9\u01ef\u01f4\u01fa\u0203\u0209"+
		"\u0210\u0218\u021d\u0221\u0229\u022f\u0236\u023b\u023f\u0249\u024c\u0250"+
		"\u0253\u025b\u0260\u0278\u027e\u0280\u0286\u028c\u028e\u0296\u0298\u029e"+
		"\u02a4\u02a6\u02b5\u02ba\u02c1\u02cd\u02cf\u02d7\u02d9\u02eb\u02ee\u02f2"+
		"\u02f6\u0308\u030b\u031e\u0323\u0329\u032c\u0335\u0337\u033a\u0340\u0347"+
		"\u034c\u0352\u0356\u035a\u0360\u0368\u0379\u037c\u0381\u0383\u038a\u0390"+
		"\u0392\u0396\u03a0\u03a6\u03a9\u03ab\u03b7\u03be\u03c2\u03c6\u03ca\u03d1"+
		"\u03da\u03dd\u03e1\u03e6\u03ea\u03f2\u03f5\u03f8\u03ff\u040a\u040d\u0417"+
		"\u041a\u0425\u042a\u0432\u0435\u0439\u0442\u044b\u044e\u0457\u045a\u045d"+
		"\u0461\u046c\u046f\u0476\u0479\u048c\u0490\u0494\u0498\u049c\u04a0\u04a2"+
		"\u04ad\u04b2\u04bb\u04c1\u04c5\u04c7\u04cf\u04e0\u04e6\u04f1\u04f8\u04fc"+
		"\u0504\u0506\u0513\u051b\u0524\u052a\u0532\u0538\u053c\u0541\u0546\u054c"+
		"\u055a\u055c\u057a\u0585\u058f\u0592\u0597\u059e\u05a1\u05aa\u05ad\u05b1"+
		"\u05b4\u05b7\u05c3\u05c6\u05d9\u05dd\u05e5\u05e9\u0602\u0605\u060e\u0614"+
		"\u061a\u0620\u062b\u0634\u064a\u064d\u0650\u065a\u065c\u0663\u0669\u066b"+
		"\u0673\u067d\u0683\u0691\u069a\u06a1\u06a6\u06ad\u06b7\u06bc\u06c3\u06dd"+
		"\u06e2\u06e4\u06eb\u06ef\u06f6\u06fa\u070b\u071a\u0721\u072a\u0734\u0739"+
		"\u0742\u0747\u074f\u0769\u0774\u077e\u0785\u078e\u0795\u079c\u07a3\u07ad"+
		"\u07b3\u07ba\u07c1\u07c9\u07cc\u07d0\u07d4\u07d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}