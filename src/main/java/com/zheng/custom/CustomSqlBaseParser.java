// Generated from /Users/zheng/project/sql-analyse/src/main/java/com/zheng/custom/CustomSqlBase.g4 by ANTLR 4.9.1
package com.zheng.custom;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CustomSqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, COPY=11, ADD=12, AFTER=13, ALL=14, ALTER=15, ANALYZE=16, AND=17, 
		ANTI=18, ANY=19, ARCHIVE=20, ARRAY=21, AS=22, ASC=23, AT=24, AUTHORIZATION=25, 
		BETWEEN=26, BOTH=27, BUCKET=28, BUCKETS=29, BY=30, CACHE=31, CASCADE=32, 
		CASE=33, CAST=34, CHANGE=35, CHECK=36, CLEAR=37, CLUSTER=38, CLUSTERED=39, 
		CODEGEN=40, COLLATE=41, COLLECTION=42, COLUMN=43, COLUMNS=44, COMMENT=45, 
		COMMIT=46, COMPACT=47, COMPACTIONS=48, COMPUTE=49, CONCATENATE=50, CONSTRAINT=51, 
		COST=52, CREATE=53, CROSS=54, CUBE=55, CURRENT=56, CURRENT_DATE=57, CURRENT_TIME=58, 
		CURRENT_TIMESTAMP=59, CURRENT_USER=60, DAY=61, DATA=62, DATABASE=63, DATABASES=64, 
		DBPROPERTIES=65, DEFINED=66, DELETE=67, DELIMITED=68, DESC=69, DESCRIBE=70, 
		DFS=71, DIRECTORIES=72, DIRECTORY=73, DISTINCT=74, DISTRIBUTE=75, DIV=76, 
		DROP=77, ELSE=78, END=79, ESCAPE=80, ESCAPED=81, EXCEPT=82, EXCHANGE=83, 
		EXISTS=84, EXPLAIN=85, EXPORT=86, EXTENDED=87, EXTERNAL=88, EXTRACT=89, 
		FALSE=90, FETCH=91, FIELDS=92, FILTER=93, FILEFORMAT=94, FIRST=95, FOLLOWING=96, 
		FOR=97, FOREIGN=98, FORMAT=99, FORMATTED=100, FROM=101, FULL=102, FUNCTION=103, 
		FUNCTIONS=104, GLOBAL=105, GRANT=106, GROUP=107, GROUPING=108, HAVING=109, 
		IF=110, IGNORE=111, IMPORT=112, IN=113, INDEX=114, INDEXES=115, INNER=116, 
		INPATH=117, INPUTFORMAT=118, INSERT=119, INTERSECT=120, INTERVAL=121, 
		INTO=122, IS=123, ITEMS=124, JOIN=125, KEYS=126, LAST=127, LATERAL=128, 
		LAZY=129, LEADING=130, LEFT=131, LIKE=132, LIMIT=133, LINES=134, LIST=135, 
		LOAD=136, LOCAL=137, LOCATION=138, LOCK=139, LOCKS=140, LOGICAL=141, MACRO=142, 
		MAP=143, MATCHED=144, MERGE=145, MONTH=146, MSCK=147, NAMESPACE=148, NAMESPACES=149, 
		NATURAL=150, NO=151, NOT=152, NULL=153, NULLS=154, OF=155, ON=156, ONLY=157, 
		OPTION=158, OPTIONS=159, OR=160, ORDER=161, OUT=162, OUTER=163, OUTPUTFORMAT=164, 
		OVER=165, OVERLAPS=166, OVERLAY=167, OVERWRITE=168, PARTITION=169, PARTITIONED=170, 
		PARTITIONS=171, PERCENTLIT=172, PIVOT=173, PLACING=174, POSITION=175, 
		PRECEDING=176, PRIMARY=177, PRINCIPALS=178, PROPERTIES=179, PURGE=180, 
		QUERY=181, RANGE=182, RECORDREADER=183, RECORDWRITER=184, RECOVER=185, 
		REDUCE=186, REFERENCES=187, REFRESH=188, RENAME=189, REPAIR=190, REPLACE=191, 
		RESET=192, RESPECT=193, RESTRICT=194, REVOKE=195, RIGHT=196, RLIKE=197, 
		ROLE=198, ROLES=199, ROLLBACK=200, ROLLUP=201, ROW=202, ROWS=203, SECOND=204, 
		SCHEMA=205, SELECT=206, SEMI=207, SEPARATED=208, SERDE=209, SERDEPROPERTIES=210, 
		SESSION_USER=211, SET=212, SETMINUS=213, SETS=214, SHOW=215, SKEWED=216, 
		SOME=217, SORT=218, SORTED=219, START=220, STATISTICS=221, STORED=222, 
		STRATIFY=223, STRUCT=224, SUBSTR=225, SUBSTRING=226, SYNC=227, TABLE=228, 
		TABLES=229, TABLESAMPLE=230, TBLPROPERTIES=231, TEMPORARY=232, TERMINATED=233, 
		THEN=234, TIME=235, TO=236, TOUCH=237, TRAILING=238, TRANSACTION=239, 
		TRANSACTIONS=240, TRANSFORM=241, TRIM=242, TRUE=243, TRUNCATE=244, TRY_CAST=245, 
		TYPE=246, UNARCHIVE=247, UNBOUNDED=248, UNCACHE=249, UNION=250, UNIQUE=251, 
		UNKNOWN=252, UNLOCK=253, UNSET=254, UPDATE=255, USE=256, USER=257, USING=258, 
		VALUES=259, VIEW=260, VIEWS=261, WHEN=262, WHERE=263, WINDOW=264, WITH=265, 
		YEAR=266, ZONE=267, EQ=268, NSEQ=269, NEQ=270, NEQJ=271, LT=272, LTE=273, 
		GT=274, GTE=275, PLUS=276, MINUS=277, ASTERISK=278, SLASH=279, PERCENT=280, 
		TILDE=281, AMPERSAND=282, PIPE=283, CONCAT_PIPE=284, HAT=285, STRING=286, 
		BIGINT_LITERAL=287, SMALLINT_LITERAL=288, TINYINT_LITERAL=289, INTEGER_VALUE=290, 
		EXPONENT_VALUE=291, DECIMAL_VALUE=292, FLOAT_LITERAL=293, DOUBLE_LITERAL=294, 
		BIGDECIMAL_LITERAL=295, IDENTIFIER=296, BACKQUOTED_IDENTIFIER=297, SIMPLE_COMMENT=298, 
		BRACKETED_COMMENT=299, WS=300, UNRECOGNIZED=301;
	public static final int
		RULE_singleStatement = 0, RULE_statement = 1, RULE_configKey = 2, RULE_configValue = 3, 
		RULE_unsupportedHiveNativeCommands = 4, RULE_replaceTableHeader = 5, RULE_bucketSpec = 6, 
		RULE_skewSpec = 7, RULE_locationSpec = 8, RULE_commentSpec = 9, RULE_query = 10, 
		RULE_insertInto = 11, RULE_partitionSpecLocation = 12, RULE_partitionSpec = 13, 
		RULE_partitionVal = 14, RULE_namespace = 15, RULE_describeFuncName = 16, 
		RULE_describeColName = 17, RULE_ctes = 18, RULE_namedQuery = 19, RULE_tableProvider = 20, 
		RULE_createTableClauses = 21, RULE_tablePropertyList = 22, RULE_tableProperty = 23, 
		RULE_tablePropertyKey = 24, RULE_tablePropertyValue = 25, RULE_constantList = 26, 
		RULE_nestedConstantList = 27, RULE_createFileFormat = 28, RULE_fileFormat = 29, 
		RULE_storageHandler = 30, RULE_resource = 31, RULE_dmlStatementNoWith = 32, 
		RULE_queryOrganization = 33, RULE_multiInsertQueryBody = 34, RULE_queryTerm = 35, 
		RULE_queryPrimary = 36, RULE_sortItem = 37, RULE_fromStatement = 38, RULE_fromStatementBody = 39, 
		RULE_querySpecification = 40, RULE_transformClause = 41, RULE_selectClause = 42, 
		RULE_setClause = 43, RULE_matchedClause = 44, RULE_notMatchedClause = 45, 
		RULE_matchedAction = 46, RULE_notMatchedAction = 47, RULE_assignmentList = 48, 
		RULE_assignment = 49, RULE_whereClause = 50, RULE_havingClause = 51, RULE_hint = 52, 
		RULE_hintStatement = 53, RULE_fromClause = 54, RULE_aggregationClause = 55, 
		RULE_groupByClause = 56, RULE_groupingAnalytics = 57, RULE_groupingElement = 58, 
		RULE_groupingSet = 59, RULE_pivotClause = 60, RULE_pivotColumn = 61, RULE_pivotValue = 62, 
		RULE_lateralView = 63, RULE_setQuantifier = 64, RULE_relation = 65, RULE_joinRelation = 66, 
		RULE_joinType = 67, RULE_joinCriteria = 68, RULE_sample = 69, RULE_sampleMethod = 70, 
		RULE_identifierList = 71, RULE_identifierSeq = 72, RULE_orderedIdentifierList = 73, 
		RULE_orderedIdentifier = 74, RULE_identifierCommentList = 75, RULE_identifierComment = 76, 
		RULE_relationPrimary = 77, RULE_inlineTable = 78, RULE_functionTable = 79, 
		RULE_tableAlias = 80, RULE_rowFormat = 81, RULE_multipartIdentifierList = 82, 
		RULE_multipartIdentifier = 83, RULE_tableIdentifier = 84, RULE_functionIdentifier = 85, 
		RULE_namedExpression = 86, RULE_namedExpressionSeq = 87, RULE_partitionFieldList = 88, 
		RULE_partitionField = 89, RULE_transform = 90, RULE_transformArgument = 91, 
		RULE_expression = 92, RULE_expressionSeq = 93, RULE_booleanExpression = 94, 
		RULE_predicate = 95, RULE_valueExpression = 96, RULE_primaryExpression = 97, 
		RULE_constant = 98, RULE_comparisonOperator = 99, RULE_arithmeticOperator = 100, 
		RULE_predicateOperator = 101, RULE_booleanValue = 102, RULE_interval = 103, 
		RULE_errorCapturingMultiUnitsInterval = 104, RULE_multiUnitsInterval = 105, 
		RULE_errorCapturingUnitToUnitInterval = 106, RULE_unitToUnitInterval = 107, 
		RULE_intervalValue = 108, RULE_colPosition = 109, RULE_dataType = 110, 
		RULE_qualifiedColTypeWithPositionList = 111, RULE_qualifiedColTypeWithPosition = 112, 
		RULE_colTypeList = 113, RULE_colType = 114, RULE_complexColTypeList = 115, 
		RULE_complexColType = 116, RULE_whenClause = 117, RULE_windowClause = 118, 
		RULE_namedWindow = 119, RULE_windowSpec = 120, RULE_windowFrame = 121, 
		RULE_frameBound = 122, RULE_qualifiedNameList = 123, RULE_functionName = 124, 
		RULE_qualifiedName = 125, RULE_errorCapturingIdentifier = 126, RULE_errorCapturingIdentifierExtra = 127, 
		RULE_identifier = 128, RULE_strictIdentifier = 129, RULE_quotedIdentifier = 130, 
		RULE_number = 131, RULE_alterColumnAction = 132, RULE_ansiNonReserved = 133, 
		RULE_strictNonReserved = 134, RULE_nonReserved = 135;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "statement", "configKey", "configValue", "unsupportedHiveNativeCommands", 
			"replaceTableHeader", "bucketSpec", "skewSpec", "locationSpec", "commentSpec", 
			"query", "insertInto", "partitionSpecLocation", "partitionSpec", "partitionVal", 
			"namespace", "describeFuncName", "describeColName", "ctes", "namedQuery", 
			"tableProvider", "createTableClauses", "tablePropertyList", "tableProperty", 
			"tablePropertyKey", "tablePropertyValue", "constantList", "nestedConstantList", 
			"createFileFormat", "fileFormat", "storageHandler", "resource", "dmlStatementNoWith", 
			"queryOrganization", "multiInsertQueryBody", "queryTerm", "queryPrimary", 
			"sortItem", "fromStatement", "fromStatementBody", "querySpecification", 
			"transformClause", "selectClause", "setClause", "matchedClause", "notMatchedClause", 
			"matchedAction", "notMatchedAction", "assignmentList", "assignment", 
			"whereClause", "havingClause", "hint", "hintStatement", "fromClause", 
			"aggregationClause", "groupByClause", "groupingAnalytics", "groupingElement", 
			"groupingSet", "pivotClause", "pivotColumn", "pivotValue", "lateralView", 
			"setQuantifier", "relation", "joinRelation", "joinType", "joinCriteria", 
			"sample", "sampleMethod", "identifierList", "identifierSeq", "orderedIdentifierList", 
			"orderedIdentifier", "identifierCommentList", "identifierComment", "relationPrimary", 
			"inlineTable", "functionTable", "tableAlias", "rowFormat", "multipartIdentifierList", 
			"multipartIdentifier", "tableIdentifier", "functionIdentifier", "namedExpression", 
			"namedExpressionSeq", "partitionFieldList", "partitionField", "transform", 
			"transformArgument", "expression", "expressionSeq", "booleanExpression", 
			"predicate", "valueExpression", "primaryExpression", "constant", "comparisonOperator", 
			"arithmeticOperator", "predicateOperator", "booleanValue", "interval", 
			"errorCapturingMultiUnitsInterval", "multiUnitsInterval", "errorCapturingUnitToUnitInterval", 
			"unitToUnitInterval", "intervalValue", "colPosition", "dataType", "qualifiedColTypeWithPositionList", 
			"qualifiedColTypeWithPosition", "colTypeList", "colType", "complexColTypeList", 
			"complexColType", "whenClause", "windowClause", "namedWindow", "windowSpec", 
			"windowFrame", "frameBound", "qualifiedNameList", "functionName", "qualifiedName", 
			"errorCapturingIdentifier", "errorCapturingIdentifierExtra", "identifier", 
			"strictIdentifier", "quotedIdentifier", "number", "alterColumnAction", 
			"ansiNonReserved", "strictNonReserved", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'.'", "'/*+'", "'*/'", "'->'", "'['", "']'", 
			"':'", "'COPY'", "'ADD'", "'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", 
			"'AND'", "'ANTI'", "'ANY'", "'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", 
			"'AT'", "'AUTHORIZATION'", "'BETWEEN'", "'BOTH'", "'BUCKET'", "'BUCKETS'", 
			"'BY'", "'CACHE'", "'CASCADE'", "'CASE'", "'CAST'", "'CHANGE'", "'CHECK'", 
			"'CLEAR'", "'CLUSTER'", "'CLUSTERED'", "'CODEGEN'", "'COLLATE'", "'COLLECTION'", 
			"'COLUMN'", "'COLUMNS'", "'COMMENT'", "'COMMIT'", "'COMPACT'", "'COMPACTIONS'", 
			"'COMPUTE'", "'CONCATENATE'", "'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", 
			"'CUBE'", "'CURRENT'", "'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", 
			"'CURRENT_USER'", "'DAY'", "'DATA'", "'DATABASE'", null, "'DBPROPERTIES'", 
			"'DEFINED'", "'DELETE'", "'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", 
			"'DIRECTORIES'", "'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", "'DIV'", 
			"'DROP'", "'ELSE'", "'END'", "'ESCAPE'", "'ESCAPED'", "'EXCEPT'", "'EXCHANGE'", 
			"'EXISTS'", "'EXPLAIN'", "'EXPORT'", "'EXTENDED'", "'EXTERNAL'", "'EXTRACT'", 
			"'FALSE'", "'FETCH'", "'FIELDS'", "'FILTER'", "'FILEFORMAT'", "'FIRST'", 
			"'FOLLOWING'", "'FOR'", "'FOREIGN'", "'FORMAT'", "'FORMATTED'", "'FROM'", 
			"'FULL'", "'FUNCTION'", "'FUNCTIONS'", "'GLOBAL'", "'GRANT'", "'GROUP'", 
			"'GROUPING'", "'HAVING'", "'IF'", "'IGNORE'", "'IMPORT'", "'IN'", "'INDEX'", 
			"'INDEXES'", "'INNER'", "'INPATH'", "'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", 
			"'INTERVAL'", "'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", 
			"'LATERAL'", "'LAZY'", "'LEADING'", "'LEFT'", "'LIKE'", "'LIMIT'", "'LINES'", 
			"'LIST'", "'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", "'LOCKS'", "'LOGICAL'", 
			"'MACRO'", "'MAP'", "'MATCHED'", "'MERGE'", "'MONTH'", "'MSCK'", "'NAMESPACE'", 
			"'NAMESPACES'", "'NATURAL'", "'NO'", null, "'NULL'", "'NULLS'", "'OF'", 
			"'ON'", "'ONLY'", "'OPTION'", "'OPTIONS'", "'OR'", "'ORDER'", "'OUT'", 
			"'OUTER'", "'OUTPUTFORMAT'", "'OVER'", "'OVERLAPS'", "'OVERLAY'", "'OVERWRITE'", 
			"'PARTITION'", "'PARTITIONED'", "'PARTITIONS'", "'PERCENT'", "'PIVOT'", 
			"'PLACING'", "'POSITION'", "'PRECEDING'", "'PRIMARY'", "'PRINCIPALS'", 
			"'PROPERTIES'", "'PURGE'", "'QUERY'", "'RANGE'", "'RECORDREADER'", "'RECORDWRITER'", 
			"'RECOVER'", "'REDUCE'", "'REFERENCES'", "'REFRESH'", "'RENAME'", "'REPAIR'", 
			"'REPLACE'", "'RESET'", "'RESPECT'", "'RESTRICT'", "'REVOKE'", "'RIGHT'", 
			null, "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", 
			"'SECOND'", "'SCHEMA'", "'SELECT'", "'SEMI'", "'SEPARATED'", "'SERDE'", 
			"'SERDEPROPERTIES'", "'SESSION_USER'", "'SET'", "'MINUS'", "'SETS'", 
			"'SHOW'", "'SKEWED'", "'SOME'", "'SORT'", "'SORTED'", "'START'", "'STATISTICS'", 
			"'STORED'", "'STRATIFY'", "'STRUCT'", "'SUBSTR'", "'SUBSTRING'", "'SYNC'", 
			"'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TBLPROPERTIES'", null, "'TERMINATED'", 
			"'THEN'", "'TIME'", "'TO'", "'TOUCH'", "'TRAILING'", "'TRANSACTION'", 
			"'TRANSACTIONS'", "'TRANSFORM'", "'TRIM'", "'TRUE'", "'TRUNCATE'", "'TRY_CAST'", 
			"'TYPE'", "'UNARCHIVE'", "'UNBOUNDED'", "'UNCACHE'", "'UNION'", "'UNIQUE'", 
			"'UNKNOWN'", "'UNLOCK'", "'UNSET'", "'UPDATE'", "'USE'", "'USER'", "'USING'", 
			"'VALUES'", "'VIEW'", "'VIEWS'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", 
			"'YEAR'", "'ZONE'", null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", 
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'&'", "'|'", "'||'", 
			"'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "COPY", 
			"ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", "ARCHIVE", 
			"ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", 
			"BUCKETS", "BY", "CACHE", "CASCADE", "CASE", "CAST", "CHANGE", "CHECK", 
			"CLEAR", "CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", 
			"COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", 
			"CONCATENATE", "CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", 
			"CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", 
			"DAY", "DATA", "DATABASE", "DATABASES", "DBPROPERTIES", "DEFINED", "DELETE", 
			"DELIMITED", "DESC", "DESCRIBE", "DFS", "DIRECTORIES", "DIRECTORY", "DISTINCT", 
			"DISTRIBUTE", "DIV", "DROP", "ELSE", "END", "ESCAPE", "ESCAPED", "EXCEPT", 
			"EXCHANGE", "EXISTS", "EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", 
			"FALSE", "FETCH", "FIELDS", "FILTER", "FILEFORMAT", "FIRST", "FOLLOWING", 
			"FOR", "FOREIGN", "FORMAT", "FORMATTED", "FROM", "FULL", "FUNCTION", 
			"FUNCTIONS", "GLOBAL", "GRANT", "GROUP", "GROUPING", "HAVING", "IF", 
			"IGNORE", "IMPORT", "IN", "INDEX", "INDEXES", "INNER", "INPATH", "INPUTFORMAT", 
			"INSERT", "INTERSECT", "INTERVAL", "INTO", "IS", "ITEMS", "JOIN", "KEYS", 
			"LAST", "LATERAL", "LAZY", "LEADING", "LEFT", "LIKE", "LIMIT", "LINES", 
			"LIST", "LOAD", "LOCAL", "LOCATION", "LOCK", "LOCKS", "LOGICAL", "MACRO", 
			"MAP", "MATCHED", "MERGE", "MONTH", "MSCK", "NAMESPACE", "NAMESPACES", 
			"NATURAL", "NO", "NOT", "NULL", "NULLS", "OF", "ON", "ONLY", "OPTION", 
			"OPTIONS", "OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", "OVERLAPS", 
			"OVERLAY", "OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", "PERCENTLIT", 
			"PIVOT", "PLACING", "POSITION", "PRECEDING", "PRIMARY", "PRINCIPALS", 
			"PROPERTIES", "PURGE", "QUERY", "RANGE", "RECORDREADER", "RECORDWRITER", 
			"RECOVER", "REDUCE", "REFERENCES", "REFRESH", "RENAME", "REPAIR", "REPLACE", 
			"RESET", "RESPECT", "RESTRICT", "REVOKE", "RIGHT", "RLIKE", "ROLE", "ROLES", 
			"ROLLBACK", "ROLLUP", "ROW", "ROWS", "SECOND", "SCHEMA", "SELECT", "SEMI", 
			"SEPARATED", "SERDE", "SERDEPROPERTIES", "SESSION_USER", "SET", "SETMINUS", 
			"SETS", "SHOW", "SKEWED", "SOME", "SORT", "SORTED", "START", "STATISTICS", 
			"STORED", "STRATIFY", "STRUCT", "SUBSTR", "SUBSTRING", "SYNC", "TABLE", 
			"TABLES", "TABLESAMPLE", "TBLPROPERTIES", "TEMPORARY", "TERMINATED", 
			"THEN", "TIME", "TO", "TOUCH", "TRAILING", "TRANSACTION", "TRANSACTIONS", 
			"TRANSFORM", "TRIM", "TRUE", "TRUNCATE", "TRY_CAST", "TYPE", "UNARCHIVE", 
			"UNBOUNDED", "UNCACHE", "UNION", "UNIQUE", "UNKNOWN", "UNLOCK", "UNSET", 
			"UPDATE", "USE", "USER", "USING", "VALUES", "VIEW", "VIEWS", "WHEN", 
			"WHERE", "WINDOW", "WITH", "YEAR", "ZONE", "EQ", "NSEQ", "NEQ", "NEQJ", 
			"LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", 
			"TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", "STRING", "BIGINT_LITERAL", 
			"SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", "EXPONENT_VALUE", 
			"DECIMAL_VALUE", "FLOAT_LITERAL", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", 
			"IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", 
			"WS", "UNRECOGNIZED"
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
	public String getGrammarFileName() { return "CustomSqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enabled = false;

	  /**
	   * When false, a literal with an exponent would be converted into
	   * double type rather than decimal type.
	   */
	  public boolean legacy_exponent_literal_as_decimal_enabled = false;

	  /**
	   * When true, the behavior of keywords follows ANSI SQL standard.
	   */
	  public boolean SQL_standard_keyword_behavior = false;

	public CustomSqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CustomSqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			statement();
			setState(273);
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
		public ConstantContext path;
		public TerminalNode COPY() { return getToken(CustomSqlBaseParser.COPY, 0); }
		public TerminalNode TO() { return getToken(CustomSqlBaseParser.TO, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(COPY);
			setState(276);
			((StatementContext)_localctx).path = constant();
			setState(277);
			match(TO);
			setState(278);
			((StatementContext)_localctx).path = constant();
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

	public static class ConfigKeyContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterConfigKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitConfigKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitConfigKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigKeyContext configKey() throws RecognitionException {
		ConfigKeyContext _localctx = new ConfigKeyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_configKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			quotedIdentifier();
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

	public static class ConfigValueContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterConfigValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitConfigValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitConfigValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigValueContext configValue() throws RecognitionException {
		ConfigValueContext _localctx = new ConfigValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_configValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			quotedIdentifier();
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

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(CustomSqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(CustomSqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(CustomSqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(CustomSqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(CustomSqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(CustomSqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(CustomSqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(CustomSqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(CustomSqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(CustomSqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(CustomSqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(CustomSqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(CustomSqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(CustomSqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(CustomSqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(CustomSqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(CustomSqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(CustomSqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(CustomSqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(CustomSqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(CustomSqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(CustomSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(CustomSqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CustomSqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(CustomSqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(CustomSqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(CustomSqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(CustomSqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(CustomSqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(CustomSqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(CustomSqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(CustomSqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(CustomSqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(CustomSqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(CustomSqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(CustomSqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(CustomSqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(CustomSqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(CustomSqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(CustomSqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(CustomSqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(CustomSqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(CustomSqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(CustomSqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(CustomSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(CustomSqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(CustomSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(CustomSqlBaseParser.DFS, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(285);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(287);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROLE) {
					{
					setState(289);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROLE) {
					{
					setState(293);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(297);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(298);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(299);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANT) {
					{
					setState(300);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(303);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(304);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(305);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(306);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(307);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(308);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(309);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(310);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(311);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(312);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(313);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(314);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(315);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(316);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(317);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(318);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(319);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(320);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(321);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(322);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(323);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(324);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(325);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(326);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(327);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(328);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(329);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(330);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(331);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(332);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(333);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(334);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(335);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(336);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(337);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(338);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(339);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(340);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(341);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(342);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(343);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(344);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(345);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(346);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(347);
				tableIdentifier();
				setState(348);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(349);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(351);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(352);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(353);
				tableIdentifier();
				setState(354);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(355);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(357);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(358);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(359);
				tableIdentifier();
				setState(360);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(361);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(363);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(364);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(365);
				tableIdentifier();
				setState(366);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(367);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(369);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(370);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(371);
				tableIdentifier();
				setState(372);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(373);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(375);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(376);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(377);
				tableIdentifier();
				setState(378);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(379);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(380);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(381);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(383);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(384);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(385);
				tableIdentifier();
				setState(386);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(387);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(388);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(390);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(391);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(392);
				tableIdentifier();
				setState(393);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(394);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(396);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(397);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(398);
				tableIdentifier();
				setState(399);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(400);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(402);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(403);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(404);
				tableIdentifier();
				setState(405);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(406);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(408);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(409);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(410);
				tableIdentifier();
				setState(411);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(413);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(414);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(415);
				tableIdentifier();
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(416);
					partitionSpec();
					}
				}

				setState(419);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(421);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(422);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(423);
				tableIdentifier();
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(424);
					partitionSpec();
					}
				}

				setState(427);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(429);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(430);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(431);
				tableIdentifier();
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(432);
					partitionSpec();
					}
				}

				setState(435);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(436);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(438);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(439);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(440);
				tableIdentifier();
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(441);
					partitionSpec();
					}
				}

				setState(444);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(445);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(447);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(448);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(449);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(450);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(451);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
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

	public static class ReplaceTableHeaderContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(CustomSqlBaseParser.REPLACE, 0); }
		public TerminalNode TABLE() { return getToken(CustomSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(CustomSqlBaseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(CustomSqlBaseParser.OR, 0); }
		public ReplaceTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterReplaceTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitReplaceTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitReplaceTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceTableHeaderContext replaceTableHeader() throws RecognitionException {
		ReplaceTableHeaderContext _localctx = new ReplaceTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_replaceTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(454);
				match(CREATE);
				setState(455);
				match(OR);
				}
			}

			setState(458);
			match(REPLACE);
			setState(459);
			match(TABLE);
			setState(460);
			multipartIdentifier();
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

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(CustomSqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(CustomSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(CustomSqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(CustomSqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(CustomSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(CustomSqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(CustomSqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(CLUSTERED);
			setState(463);
			match(BY);
			setState(464);
			identifierList();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(465);
				match(SORTED);
				setState(466);
				match(BY);
				setState(467);
				orderedIdentifierList();
				}
			}

			setState(470);
			match(INTO);
			setState(471);
			match(INTEGER_VALUE);
			setState(472);
			match(BUCKETS);
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

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(CustomSqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(CustomSqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(CustomSqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(CustomSqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(CustomSqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(CustomSqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(SKEWED);
			setState(475);
			match(BY);
			setState(476);
			identifierList();
			setState(477);
			match(ON);
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(478);
				constantList();
				}
				break;
			case 2:
				{
				setState(479);
				nestedConstantList();
				}
				break;
			}
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(482);
				match(STORED);
				setState(483);
				match(AS);
				setState(484);
				match(DIRECTORIES);
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

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(CustomSqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(CustomSqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(LOCATION);
			setState(488);
			match(STRING);
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

	public static class CommentSpecContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(CustomSqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(CustomSqlBaseParser.STRING, 0); }
		public CommentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterCommentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitCommentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitCommentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentSpecContext commentSpec() throws RecognitionException {
		CommentSpecContext _localctx = new CommentSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(COMMENT);
			setState(491);
			match(STRING);
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
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(493);
				ctes();
				}
			}

			setState(496);
			queryTerm(0);
			setState(497);
			queryOrganization();
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

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(CustomSqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(CustomSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(CustomSqlBaseParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(CustomSqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(CustomSqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(CustomSqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(CustomSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(CustomSqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(CustomSqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(CustomSqlBaseParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(CustomSqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(CustomSqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(CustomSqlBaseParser.OVERWRITE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(CustomSqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode IF() { return getToken(CustomSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(CustomSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(CustomSqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(CustomSqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(CustomSqlBaseParser.INTO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(CustomSqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(CustomSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(CustomSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(CustomSqlBaseParser.EXISTS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_insertInto);
		int _la;
		try {
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				match(INSERT);
				setState(500);
				match(OVERWRITE);
				setState(502);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(501);
					match(TABLE);
					}
					break;
				}
				setState(504);
				multipartIdentifier();
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(505);
					partitionSpec();
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(506);
						match(IF);
						setState(507);
						match(NOT);
						setState(508);
						match(EXISTS);
						}
					}

					}
				}

				setState(514);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(513);
					identifierList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				match(INSERT);
				setState(517);
				match(INTO);
				setState(519);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(518);
					match(TABLE);
					}
					break;
				}
				setState(521);
				multipartIdentifier();
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(522);
					partitionSpec();
					}
				}

				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(525);
					match(IF);
					setState(526);
					match(NOT);
					setState(527);
					match(EXISTS);
					}
				}

				setState(531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(530);
					identifierList();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				match(INSERT);
				setState(534);
				match(OVERWRITE);
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(535);
					match(LOCAL);
					}
				}

				setState(538);
				match(DIRECTORY);
				setState(539);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(540);
					rowFormat();
					}
				}

				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(543);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(546);
				match(INSERT);
				setState(547);
				match(OVERWRITE);
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(548);
					match(LOCAL);
					}
				}

				setState(551);
				match(DIRECTORY);
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(552);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(555);
				tableProvider();
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(556);
					match(OPTIONS);
					setState(557);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
					}
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

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			partitionSpec();
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(563);
				locationSpec();
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

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(CustomSqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(PARTITION);
			setState(567);
			match(T__0);
			setState(568);
			partitionVal();
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(569);
				match(T__1);
				setState(570);
				partitionVal();
				}
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(576);
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

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CustomSqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			identifier();
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(579);
				match(EQ);
				setState(580);
				constant();
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

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(CustomSqlBaseParser.NAMESPACE, 0); }
		public TerminalNode DATABASE() { return getToken(CustomSqlBaseParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(CustomSqlBaseParser.SCHEMA, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==NAMESPACE || _la==SCHEMA) ) {
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

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(CustomSqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_describeFuncName);
		try {
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(587);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(588);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(589);
				predicateOperator();
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

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(593);
				match(T__3);
				setState(594);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(599);
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

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(CustomSqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(WITH);
			setState(601);
			namedQuery();
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(602);
				match(T__1);
				setState(603);
				namedQuery();
				}
				}
				setState(608);
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

	public static class NamedQueryContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public IdentifierListContext columnAliases;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(CustomSqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			((NamedQueryContext)_localctx).name = errorCapturingIdentifier();
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(610);
				((NamedQueryContext)_localctx).columnAliases = identifierList();
				}
				break;
			}
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(613);
				match(AS);
				}
			}

			setState(616);
			match(T__0);
			setState(617);
			query();
			setState(618);
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

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(CustomSqlBaseParser.USING, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(USING);
			setState(621);
			multipartIdentifier();
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

	public static class CreateTableClausesContext extends ParserRuleContext {
		public TablePropertyListContext options;
		public PartitionFieldListContext partitioning;
		public TablePropertyListContext tableProps;
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(CustomSqlBaseParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(CustomSqlBaseParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(CustomSqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(CustomSqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(CustomSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(CustomSqlBaseParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(CustomSqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(CustomSqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<PartitionFieldListContext> partitionFieldList() {
			return getRuleContexts(PartitionFieldListContext.class);
		}
		public PartitionFieldListContext partitionFieldList(int i) {
			return getRuleContext(PartitionFieldListContext.class,i);
		}
		public CreateTableClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterCreateTableClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitCreateTableClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitCreateTableClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableClausesContext createTableClauses() throws RecognitionException {
		CreateTableClausesContext _localctx = new CreateTableClausesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_createTableClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLUSTERED || _la==COMMENT || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (LOCATION - 138)) | (1L << (OPTIONS - 138)) | (1L << (PARTITIONED - 138)))) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (ROW - 202)) | (1L << (SKEWED - 202)) | (1L << (STORED - 202)) | (1L << (TBLPROPERTIES - 202)))) != 0)) {
				{
				setState(636);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONS:
					{
					{
					setState(623);
					match(OPTIONS);
					setState(624);
					((CreateTableClausesContext)_localctx).options = tablePropertyList();
					}
					}
					break;
				case PARTITIONED:
					{
					{
					setState(625);
					match(PARTITIONED);
					setState(626);
					match(BY);
					setState(627);
					((CreateTableClausesContext)_localctx).partitioning = partitionFieldList();
					}
					}
					break;
				case SKEWED:
					{
					setState(628);
					skewSpec();
					}
					break;
				case CLUSTERED:
					{
					setState(629);
					bucketSpec();
					}
					break;
				case ROW:
					{
					setState(630);
					rowFormat();
					}
					break;
				case STORED:
					{
					setState(631);
					createFileFormat();
					}
					break;
				case LOCATION:
					{
					setState(632);
					locationSpec();
					}
					break;
				case COMMENT:
					{
					setState(633);
					commentSpec();
					}
					break;
				case TBLPROPERTIES:
					{
					{
					setState(634);
					match(TBLPROPERTIES);
					setState(635);
					((CreateTableClausesContext)_localctx).tableProps = tablePropertyList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(640);
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

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(T__0);
			setState(642);
			tableProperty();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(643);
				match(T__1);
				setState(644);
				tableProperty();
				}
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(650);
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

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CustomSqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FALSE || ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (TRUE - 243)) | (1L << (EQ - 243)) | (1L << (STRING - 243)) | (1L << (INTEGER_VALUE - 243)) | (1L << (DECIMAL_VALUE - 243)))) != 0)) {
				{
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(653);
					match(EQ);
					}
				}

				setState(656);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
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

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(CustomSqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tablePropertyKey);
		int _la;
		try {
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				identifier();
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(660);
					match(T__3);
					setState(661);
					identifier();
					}
					}
					setState(666);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				match(STRING);
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

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(CustomSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(CustomSqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(CustomSqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tablePropertyValue);
		try {
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
				match(DECIMAL_VALUE);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(672);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(673);
				match(STRING);
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

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(T__0);
			setState(677);
			constant();
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(678);
				match(T__1);
				setState(679);
				constant();
				}
				}
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(685);
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

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(T__0);
			setState(688);
			constantList();
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(689);
				match(T__1);
				setState(690);
				constantList();
				}
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(696);
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

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(CustomSqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(CustomSqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(CustomSqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_createFileFormat);
		try {
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				match(STORED);
				setState(699);
				match(AS);
				setState(700);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				match(STORED);
				setState(702);
				match(BY);
				setState(703);
				storageHandler();
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

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(CustomSqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(CustomSqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(CustomSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CustomSqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fileFormat);
		try {
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				match(INPUTFORMAT);
				setState(707);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(708);
				match(OUTPUTFORMAT);
				setState(709);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
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

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CustomSqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(CustomSqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(CustomSqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_storageHandler);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(STRING);
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(714);
				match(WITH);
				setState(715);
				match(SERDEPROPERTIES);
				setState(716);
				tablePropertyList();
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

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(CustomSqlBaseParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			identifier();
			setState(720);
			match(STRING);
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

	public static class DmlStatementNoWithContext extends ParserRuleContext {
		public DmlStatementNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatementNoWith; }
	 
		public DmlStatementNoWithContext() { }
		public void copyFrom(DmlStatementNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteFromTableContext extends DmlStatementNoWithContext {
		public TerminalNode DELETE() { return getToken(CustomSqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(CustomSqlBaseParser.FROM, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteFromTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterDeleteFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitDeleteFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitDeleteFromTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleInsertQueryContext extends DmlStatementNoWithContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public SingleInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends DmlStatementNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateTableContext extends DmlStatementNoWithContext {
		public TerminalNode UPDATE() { return getToken(CustomSqlBaseParser.UPDATE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterUpdateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitUpdateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitUpdateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeIntoTableContext extends DmlStatementNoWithContext {
		public MultipartIdentifierContext target;
		public TableAliasContext targetAlias;
		public MultipartIdentifierContext source;
		public QueryContext sourceQuery;
		public TableAliasContext sourceAlias;
		public BooleanExpressionContext mergeCondition;
		public TerminalNode MERGE() { return getToken(CustomSqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(CustomSqlBaseParser.INTO, 0); }
		public TerminalNode USING() { return getToken(CustomSqlBaseParser.USING, 0); }
		public TerminalNode ON() { return getToken(CustomSqlBaseParser.ON, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public List<TableAliasContext> tableAlias() {
			return getRuleContexts(TableAliasContext.class);
		}
		public TableAliasContext tableAlias(int i) {
			return getRuleContext(TableAliasContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<MatchedClauseContext> matchedClause() {
			return getRuleContexts(MatchedClauseContext.class);
		}
		public MatchedClauseContext matchedClause(int i) {
			return getRuleContext(MatchedClauseContext.class,i);
		}
		public List<NotMatchedClauseContext> notMatchedClause() {
			return getRuleContexts(NotMatchedClauseContext.class);
		}
		public NotMatchedClauseContext notMatchedClause(int i) {
			return getRuleContext(NotMatchedClauseContext.class,i);
		}
		public MergeIntoTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterMergeIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitMergeIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitMergeIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementNoWithContext dmlStatementNoWith() throws RecognitionException {
		DmlStatementNoWithContext _localctx = new DmlStatementNoWithContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dmlStatementNoWith);
		int _la;
		try {
			int _alt;
			setState(773);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				insertInto();
				setState(723);
				queryTerm(0);
				setState(724);
				queryOrganization();
				}
				break;
			case FROM:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				fromClause();
				setState(728); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(727);
					multiInsertQueryBody();
					}
					}
					setState(730); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			case DELETE:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(732);
				match(DELETE);
				setState(733);
				match(FROM);
				setState(734);
				multipartIdentifier();
				setState(735);
				tableAlias();
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(736);
					whereClause();
					}
				}

				}
				break;
			case UPDATE:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(739);
				match(UPDATE);
				setState(740);
				multipartIdentifier();
				setState(741);
				tableAlias();
				setState(742);
				setClause();
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(743);
					whereClause();
					}
				}

				}
				break;
			case MERGE:
				_localctx = new MergeIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(746);
				match(MERGE);
				setState(747);
				match(INTO);
				setState(748);
				((MergeIntoTableContext)_localctx).target = multipartIdentifier();
				setState(749);
				((MergeIntoTableContext)_localctx).targetAlias = tableAlias();
				setState(750);
				match(USING);
				setState(756);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(751);
					((MergeIntoTableContext)_localctx).source = multipartIdentifier();
					}
					break;
				case 2:
					{
					setState(752);
					match(T__0);
					setState(753);
					((MergeIntoTableContext)_localctx).sourceQuery = query();
					setState(754);
					match(T__2);
					}
					break;
				}
				setState(758);
				((MergeIntoTableContext)_localctx).sourceAlias = tableAlias();
				setState(759);
				match(ON);
				setState(760);
				((MergeIntoTableContext)_localctx).mergeCondition = booleanExpression(0);
				setState(764);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(761);
						matchedClause();
						}
						} 
					}
					setState(766);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(767);
					notMatchedClause();
					}
					}
					setState(772);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(CustomSqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(CustomSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(CustomSqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(CustomSqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(CustomSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(CustomSqlBaseParser.SORT, 0); }
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(CustomSqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(CustomSqlBaseParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_queryOrganization);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(775);
				match(ORDER);
				setState(776);
				match(BY);
				setState(777);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(782);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(778);
						match(T__1);
						setState(779);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(784);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				}
				break;
			}
			setState(797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(787);
				match(CLUSTER);
				setState(788);
				match(BY);
				setState(789);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(790);
						match(T__1);
						setState(791);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(796);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			}
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(799);
				match(DISTRIBUTE);
				setState(800);
				match(BY);
				setState(801);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(802);
						match(T__1);
						setState(803);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(808);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				}
				break;
			}
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(811);
				match(SORT);
				setState(812);
				match(BY);
				setState(813);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(814);
						match(T__1);
						setState(815);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(820);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				}
				break;
			}
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(823);
				windowClause();
				}
				break;
			}
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(826);
				match(LIMIT);
				setState(829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(827);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(828);
					((QueryOrganizationContext)_localctx).limit = expression();
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

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public FromStatementBodyContext fromStatementBody() {
			return getRuleContext(FromStatementBodyContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multiInsertQueryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			insertInto();
			setState(834);
			fromStatementBody();
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
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
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
		public TerminalNode INTERSECT() { return getToken(CustomSqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(CustomSqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(CustomSqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(CustomSqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(837);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(862);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(860);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(839);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(840);
						if (!(legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enabled");
						setState(841);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==INTERSECT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(843);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(842);
							setQuantifier();
							}
						}

						setState(845);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(846);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(847);
						if (!(!legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enabled");
						setState(848);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(850);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(849);
							setQuantifier();
							}
						}

						setState(852);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(853);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(854);
						if (!(!legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enabled");
						setState(855);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(857);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(856);
							setQuantifier();
							}
						}

						setState(859);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(864);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
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
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FromStmtContext extends QueryPrimaryContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public FromStmtContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterFromStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitFromStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitFromStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(CustomSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_queryPrimary);
		try {
			setState(874);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(866);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(867);
				match(TABLE);
				setState(868);
				multipartIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(869);
				inlineTable();
				}
				break;
			case T__0:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(870);
				match(T__0);
				setState(871);
				query();
				setState(872);
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
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(CustomSqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(CustomSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(CustomSqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(CustomSqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(CustomSqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			expression();
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(877);
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
				break;
			}
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(880);
				match(NULLS);
				setState(881);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
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

	public static class FromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<FromStatementBodyContext> fromStatementBody() {
			return getRuleContexts(FromStatementBodyContext.class);
		}
		public FromStatementBodyContext fromStatementBody(int i) {
			return getRuleContext(FromStatementBodyContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_fromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			fromClause();
			setState(886); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(885);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(888); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FromStatementBodyContext extends ParserRuleContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public FromStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterFromStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitFromStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitFromStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementBodyContext fromStatementBody() throws RecognitionException {
		FromStatementBodyContext _localctx = new FromStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_fromStatementBody);
		try {
			int _alt;
			setState(917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				transformClause();
				setState(892);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(891);
					whereClause();
					}
					break;
				}
				setState(894);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(896);
				selectClause();
				setState(900);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(897);
						lateralView();
						}
						} 
					}
					setState(902);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(904);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(903);
					whereClause();
					}
					break;
				}
				setState(907);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(906);
					aggregationClause();
					}
					break;
				}
				setState(910);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(909);
					havingClause();
					}
					break;
				}
				setState(913);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(912);
					windowClause();
					}
					break;
				}
				setState(915);
				queryOrganization();
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterRegularQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitRegularQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitRegularQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransformQuerySpecificationContext extends QuerySpecificationContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TransformQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterTransformQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitTransformQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitTransformQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_querySpecification);
		try {
			int _alt;
			setState(963);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(919);
				transformClause();
				setState(921);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(920);
					fromClause();
					}
					break;
				}
				setState(926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(923);
						lateralView();
						}
						} 
					}
					setState(928);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				setState(930);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(929);
					whereClause();
					}
					break;
				}
				setState(933);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(932);
					aggregationClause();
					}
					break;
				}
				setState(936);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(935);
					havingClause();
					}
					break;
				}
				setState(939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(938);
					windowClause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RegularQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
				selectClause();
				setState(943);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(942);
					fromClause();
					}
					break;
				}
				setState(948);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(945);
						lateralView();
						}
						} 
					}
					setState(950);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				setState(952);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(951);
					whereClause();
					}
					break;
				}
				setState(955);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(954);
					aggregationClause();
					}
					break;
				}
				setState(958);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(957);
					havingClause();
					}
					break;
				}
				setState(961);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(960);
					windowClause();
					}
					break;
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

	public static class TransformClauseContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public TerminalNode USING() { return getToken(CustomSqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(CustomSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CustomSqlBaseParser.STRING, i);
		}
		public TerminalNode SELECT() { return getToken(CustomSqlBaseParser.SELECT, 0); }
		public ExpressionSeqContext expressionSeq() {
			return getRuleContext(ExpressionSeqContext.class,0);
		}
		public TerminalNode TRANSFORM() { return getToken(CustomSqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(CustomSqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(CustomSqlBaseParser.REDUCE, 0); }
		public TerminalNode RECORDWRITER() { return getToken(CustomSqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(CustomSqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(CustomSqlBaseParser.RECORDREADER, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TransformClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterTransformClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitTransformClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitTransformClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformClauseContext transformClause() throws RecognitionException {
		TransformClauseContext _localctx = new TransformClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_transformClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(965);
				match(SELECT);
				setState(966);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(967);
				match(T__0);
				setState(969);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(968);
					setQuantifier();
					}
					break;
				}
				setState(971);
				expressionSeq();
				setState(972);
				match(T__2);
				}
				break;
			case MAP:
				{
				setState(974);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(976);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(975);
					setQuantifier();
					}
					break;
				}
				setState(978);
				expressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(979);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(981);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(980);
					setQuantifier();
					}
					break;
				}
				setState(983);
				expressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(986);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(989);
				match(RECORDWRITER);
				setState(990);
				((TransformClauseContext)_localctx).recordWriter = match(STRING);
				}
			}

			setState(993);
			match(USING);
			setState(994);
			((TransformClauseContext)_localctx).script = match(STRING);
			setState(1007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(995);
				match(AS);
				setState(1005);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(996);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(997);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(998);
					match(T__0);
					setState(1001);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
					case 1:
						{
						setState(999);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1000);
						colTypeList();
						}
						break;
					}
					setState(1003);
					match(T__2);
					}
					}
					break;
				}
				}
				break;
			}
			setState(1010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1009);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(1014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1012);
				match(RECORDREADER);
				setState(1013);
				((TransformClauseContext)_localctx).recordReader = match(STRING);
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

	public static class SelectClauseContext extends ParserRuleContext {
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public TerminalNode SELECT() { return getToken(CustomSqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			match(SELECT);
			setState(1020);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1017);
					((SelectClauseContext)_localctx).hint = hint();
					((SelectClauseContext)_localctx).hints.add(((SelectClauseContext)_localctx).hint);
					}
					} 
				}
				setState(1022);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			setState(1024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1023);
				setQuantifier();
				}
				break;
			}
			setState(1026);
			namedExpressionSeq();
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

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CustomSqlBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(SET);
			setState(1029);
			assignmentList();
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

	public static class MatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext matchedCond;
		public TerminalNode WHEN() { return getToken(CustomSqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(CustomSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(CustomSqlBaseParser.THEN, 0); }
		public MatchedActionContext matchedAction() {
			return getRuleContext(MatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(CustomSqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public MatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedClauseContext matchedClause() throws RecognitionException {
		MatchedClauseContext _localctx = new MatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_matchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			match(WHEN);
			setState(1032);
			match(MATCHED);
			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1033);
				match(AND);
				setState(1034);
				((MatchedClauseContext)_localctx).matchedCond = booleanExpression(0);
				}
			}

			setState(1037);
			match(THEN);
			setState(1038);
			matchedAction();
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

	public static class NotMatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext notMatchedCond;
		public TerminalNode WHEN() { return getToken(CustomSqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(CustomSqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(CustomSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(CustomSqlBaseParser.THEN, 0); }
		public NotMatchedActionContext notMatchedAction() {
			return getRuleContext(NotMatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(CustomSqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotMatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterNotMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitNotMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitNotMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedClauseContext notMatchedClause() throws RecognitionException {
		NotMatchedClauseContext _localctx = new NotMatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_notMatchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(WHEN);
			setState(1041);
			match(NOT);
			setState(1042);
			match(MATCHED);
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1043);
				match(AND);
				setState(1044);
				((NotMatchedClauseContext)_localctx).notMatchedCond = booleanExpression(0);
				}
			}

			setState(1047);
			match(THEN);
			setState(1048);
			notMatchedAction();
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

	public static class MatchedActionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(CustomSqlBaseParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(CustomSqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(CustomSqlBaseParser.SET, 0); }
		public TerminalNode ASTERISK() { return getToken(CustomSqlBaseParser.ASTERISK, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public MatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedActionContext matchedAction() throws RecognitionException {
		MatchedActionContext _localctx = new MatchedActionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_matchedAction);
		try {
			setState(1057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1050);
				match(DELETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1051);
				match(UPDATE);
				setState(1052);
				match(SET);
				setState(1053);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1054);
				match(UPDATE);
				setState(1055);
				match(SET);
				setState(1056);
				assignmentList();
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

	public static class NotMatchedActionContext extends ParserRuleContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode INSERT() { return getToken(CustomSqlBaseParser.INSERT, 0); }
		public TerminalNode ASTERISK() { return getToken(CustomSqlBaseParser.ASTERISK, 0); }
		public TerminalNode VALUES() { return getToken(CustomSqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public NotMatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterNotMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitNotMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitNotMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedActionContext notMatchedAction() throws RecognitionException {
		NotMatchedActionContext _localctx = new NotMatchedActionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_notMatchedAction);
		int _la;
		try {
			setState(1077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1059);
				match(INSERT);
				setState(1060);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1061);
				match(INSERT);
				setState(1062);
				match(T__0);
				setState(1063);
				((NotMatchedActionContext)_localctx).columns = multipartIdentifierList();
				setState(1064);
				match(T__2);
				setState(1065);
				match(VALUES);
				setState(1066);
				match(T__0);
				setState(1067);
				expression();
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1068);
					match(T__1);
					setState(1069);
					expression();
					}
					}
					setState(1074);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1075);
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

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			assignment();
			setState(1084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1080);
				match(T__1);
				setState(1081);
				assignment();
				}
				}
				setState(1086);
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

	public static class AssignmentContext extends ParserRuleContext {
		public MultipartIdentifierContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(CustomSqlBaseParser.EQ, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			((AssignmentContext)_localctx).key = multipartIdentifier();
			setState(1088);
			match(EQ);
			setState(1089);
			((AssignmentContext)_localctx).value = expression();
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(CustomSqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			match(WHERE);
			setState(1092);
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

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(CustomSqlBaseParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			match(HAVING);
			setState(1095);
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

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_hint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			match(T__4);
			setState(1098);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
					case 1:
						{
						setState(1099);
						match(T__1);
						}
						break;
					}
					setState(1102);
					((HintContext)_localctx).hintStatement = hintStatement();
					((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
					}
					} 
				}
				setState(1107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			setState(1108);
			match(T__5);
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

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_hintStatement);
		int _la;
		try {
			setState(1123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1110);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1111);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1112);
				match(T__0);
				setState(1113);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1114);
					match(T__1);
					setState(1115);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1121);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(CustomSqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			match(FROM);
			setState(1126);
			relation();
			setState(1131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1127);
					match(T__1);
					setState(1128);
					relation();
					}
					} 
				}
				setState(1133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			setState(1137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1134);
					lateralView();
					}
					} 
				}
				setState(1139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			setState(1141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1140);
				pivotClause();
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

	public static class AggregationClauseContext extends ParserRuleContext {
		public GroupByClauseContext groupByClause;
		public List<GroupByClauseContext> groupingExpressionsWithGroupingAnalytics = new ArrayList<GroupByClauseContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(CustomSqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(CustomSqlBaseParser.BY, 0); }
		public List<GroupByClauseContext> groupByClause() {
			return getRuleContexts(GroupByClauseContext.class);
		}
		public GroupByClauseContext groupByClause(int i) {
			return getRuleContext(GroupByClauseContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(CustomSqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(CustomSqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(CustomSqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(CustomSqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(CustomSqlBaseParser.GROUPING, 0); }
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitAggregationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_aggregationClause);
		int _la;
		try {
			int _alt;
			setState(1182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1143);
				match(GROUP);
				setState(1144);
				match(BY);
				setState(1145);
				((AggregationClauseContext)_localctx).groupByClause = groupByClause();
				((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
				setState(1150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1146);
						match(T__1);
						setState(1147);
						((AggregationClauseContext)_localctx).groupByClause = groupByClause();
						((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
						}
						} 
					}
					setState(1152);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1153);
				match(GROUP);
				setState(1154);
				match(BY);
				setState(1155);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(1160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1156);
						match(T__1);
						setState(1157);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(1162);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				}
				setState(1180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1163);
					match(WITH);
					setState(1164);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1165);
					match(WITH);
					setState(1166);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1167);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(1168);
					match(SETS);
					setState(1169);
					match(T__0);
					setState(1170);
					groupingSet();
					setState(1175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(1171);
						match(T__1);
						setState(1172);
						groupingSet();
						}
						}
						setState(1177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1178);
					match(T__2);
					}
					break;
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_groupByClause);
		try {
			setState(1186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1184);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1185);
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

	public static class GroupingAnalyticsContext extends ParserRuleContext {
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(CustomSqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(CustomSqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(CustomSqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(CustomSqlBaseParser.SETS, 0); }
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public GroupingAnalyticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingAnalytics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterGroupingAnalytics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitGroupingAnalytics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitGroupingAnalytics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingAnalyticsContext groupingAnalytics() throws RecognitionException {
		GroupingAnalyticsContext _localctx = new GroupingAnalyticsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_groupingAnalytics);
		int _la;
		try {
			setState(1213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CUBE:
			case ROLLUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1188);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1189);
				match(T__0);
				setState(1190);
				groupingSet();
				setState(1195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1191);
					match(T__1);
					setState(1192);
					groupingSet();
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
			case GROUPING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1200);
				match(GROUPING);
				setState(1201);
				match(SETS);
				setState(1202);
				match(T__0);
				setState(1203);
				groupingElement();
				setState(1208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1204);
					match(T__1);
					setState(1205);
					groupingElement();
					}
					}
					setState(1210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1211);
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

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public GroupingSetContext groupingSet() {
			return getRuleContext(GroupingSetContext.class,0);
		}
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterGroupingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitGroupingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitGroupingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_groupingElement);
		try {
			setState(1217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1215);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1216);
				groupingSet();
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
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_groupingSet);
		int _la;
		try {
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1219);
				match(T__0);
				setState(1228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1220);
					expression();
					setState(1225);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(1221);
						match(T__1);
						setState(1222);
						expression();
						}
						}
						setState(1227);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1230);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1231);
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

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(CustomSqlBaseParser.PIVOT, 0); }
		public TerminalNode FOR() { return getToken(CustomSqlBaseParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(CustomSqlBaseParser.IN, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitPivotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitPivotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			match(PIVOT);
			setState(1235);
			match(T__0);
			setState(1236);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(1237);
			match(FOR);
			setState(1238);
			pivotColumn();
			setState(1239);
			match(IN);
			setState(1240);
			match(T__0);
			setState(1241);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1242);
				match(T__1);
				setState(1243);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(1248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1249);
			match(T__2);
			setState(1250);
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

	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterPivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitPivotColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitPivotColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_pivotColumn);
		int _la;
		try {
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1252);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1253);
				match(T__0);
				setState(1254);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1255);
					match(T__1);
					setState(1256);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(1261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1262);
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

	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(CustomSqlBaseParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterPivotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitPivotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitPivotValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_pivotValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			expression();
			setState(1271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1267);
					match(AS);
					}
					break;
				}
				setState(1270);
				identifier();
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

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(CustomSqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(CustomSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(CustomSqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(CustomSqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			match(LATERAL);
			setState(1274);
			match(VIEW);
			setState(1276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1275);
				match(OUTER);
				}
				break;
			}
			setState(1278);
			qualifiedName();
			setState(1279);
			match(T__0);
			setState(1288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1280);
				expression();
				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1281);
					match(T__1);
					setState(1282);
					expression();
					}
					}
					setState(1287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1290);
			match(T__2);
			setState(1291);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(1303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1292);
					match(AS);
					}
					break;
				}
				setState(1295);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(1300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1296);
						match(T__1);
						setState(1297);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(1302);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(CustomSqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(CustomSqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
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

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			relationPrimary();
			setState(1311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1308);
					joinRelation();
					}
					} 
				}
				setState(1313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
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

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(CustomSqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(CustomSqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_joinRelation);
		try {
			setState(1325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1314);
				joinType();
				}
				setState(1315);
				match(JOIN);
				setState(1316);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(1318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1317);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1320);
				match(NATURAL);
				setState(1321);
				joinType();
				setState(1322);
				match(JOIN);
				setState(1323);
				((JoinRelationContext)_localctx).right = relationPrimary();
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

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(CustomSqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(CustomSqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(CustomSqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(CustomSqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(CustomSqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(CustomSqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(CustomSqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(CustomSqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_joinType);
		int _la;
		try {
			setState(1351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1327);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1330);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1331);
				match(LEFT);
				setState(1333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1332);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1335);
					match(LEFT);
					}
				}

				setState(1338);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1339);
				match(RIGHT);
				setState(1341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1340);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1343);
				match(FULL);
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1344);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1347);
					match(LEFT);
					}
				}

				setState(1350);
				match(ANTI);
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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(CustomSqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(CustomSqlBaseParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_joinCriteria);
		try {
			setState(1357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1353);
				match(ON);
				setState(1354);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1355);
				match(USING);
				setState(1356);
				identifierList();
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

	public static class SampleContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(CustomSqlBaseParser.TABLESAMPLE, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_sample);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			match(TABLESAMPLE);
			setState(1360);
			match(T__0);
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1361);
				sampleMethod();
				}
				break;
			}
			setState(1364);
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

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(CustomSqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(CustomSqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(CustomSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(CustomSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(CustomSqlBaseParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(CustomSqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(CustomSqlBaseParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(CustomSqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(CustomSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(CustomSqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(CustomSqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSampleByBucket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSampleByBucket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSampleByBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSampleByBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_sampleMethod);
		int _la;
		try {
			setState(1390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1366);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(1369);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1370);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1371);
				expression();
				setState(1372);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1374);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(1375);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(1376);
				match(OUT);
				setState(1377);
				match(OF);
				setState(1378);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1379);
					match(ON);
					setState(1385);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
					case 1:
						{
						setState(1380);
						identifier();
						}
						break;
					case 2:
						{
						setState(1381);
						qualifiedName();
						setState(1382);
						match(T__0);
						setState(1383);
						match(T__2);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1389);
				((SampleByBytesContext)_localctx).bytes = expression();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			match(T__0);
			setState(1393);
			identifierSeq();
			setState(1394);
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

	public static class IdentifierSeqContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(1401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1397);
					match(T__1);
					setState(1398);
					((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(1403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
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

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			match(T__0);
			setState(1405);
			orderedIdentifier();
			setState(1410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1406);
				match(T__1);
				setState(1407);
				orderedIdentifier();
				}
				}
				setState(1412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1413);
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

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext ident;
		public Token ordering;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(CustomSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(CustomSqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			((OrderedIdentifierContext)_localctx).ident = errorCapturingIdentifier();
			setState(1417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1416);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
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

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			match(T__0);
			setState(1420);
			identifierComment();
			setState(1425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1421);
				match(T__1);
				setState(1422);
				identifierComment();
				}
				}
				setState(1427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1428);
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

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			identifier();
			setState(1432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1431);
				commentSpec();
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
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_relationPrimary);
		try {
			setState(1458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1434);
				multipartIdentifier();
				setState(1436);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1435);
					sample();
					}
					break;
				}
				setState(1438);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1440);
				match(T__0);
				setState(1441);
				query();
				setState(1442);
				match(T__2);
				setState(1444);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1443);
					sample();
					}
					break;
				}
				setState(1446);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1448);
				match(T__0);
				setState(1449);
				relation();
				setState(1450);
				match(T__2);
				setState(1452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1451);
					sample();
					}
					break;
				}
				setState(1454);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1456);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1457);
				functionTable();
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

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(CustomSqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			match(VALUES);
			setState(1461);
			expression();
			setState(1466);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1462);
					match(T__1);
					setState(1463);
					expression();
					}
					} 
				}
				setState(1468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			}
			setState(1469);
			tableAlias();
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

	public static class FunctionTableContext extends ParserRuleContext {
		public FunctionNameContext funcName;
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			((FunctionTableContext)_localctx).funcName = functionName();
			setState(1472);
			match(T__0);
			setState(1481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1473);
				expression();
				setState(1478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1474);
					match(T__1);
					setState(1475);
					expression();
					}
					}
					setState(1480);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1483);
			match(T__2);
			setState(1484);
			tableAlias();
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

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(CustomSqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1486);
					match(AS);
					}
					break;
				}
				setState(1489);
				strictIdentifier();
				setState(1491);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1490);
					identifierList();
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

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(CustomSqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(CustomSqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(CustomSqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(CustomSqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(CustomSqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(CustomSqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(CustomSqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(CustomSqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(CustomSqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(CustomSqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(CustomSqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(CustomSqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(CustomSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(CustomSqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(CustomSqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(CustomSqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(CustomSqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(CustomSqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(CustomSqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(CustomSqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(CustomSqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(CustomSqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(CustomSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CustomSqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(CustomSqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_rowFormat);
		try {
			setState(1544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1495);
				match(ROW);
				setState(1496);
				match(FORMAT);
				setState(1497);
				match(SERDE);
				setState(1498);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(1502);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1499);
					match(WITH);
					setState(1500);
					match(SERDEPROPERTIES);
					setState(1501);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1504);
				match(ROW);
				setState(1505);
				match(FORMAT);
				setState(1506);
				match(DELIMITED);
				setState(1516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1507);
					match(FIELDS);
					setState(1508);
					match(TERMINATED);
					setState(1509);
					match(BY);
					setState(1510);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(1514);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
					case 1:
						{
						setState(1511);
						match(ESCAPED);
						setState(1512);
						match(BY);
						setState(1513);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(1523);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1518);
					match(COLLECTION);
					setState(1519);
					match(ITEMS);
					setState(1520);
					match(TERMINATED);
					setState(1521);
					match(BY);
					setState(1522);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1530);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1525);
					match(MAP);
					setState(1526);
					match(KEYS);
					setState(1527);
					match(TERMINATED);
					setState(1528);
					match(BY);
					setState(1529);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1532);
					match(LINES);
					setState(1533);
					match(TERMINATED);
					setState(1534);
					match(BY);
					setState(1535);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(1542);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1538);
					match(NULL);
					setState(1539);
					match(DEFINED);
					setState(1540);
					match(AS);
					setState(1541);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
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

	public static class MultipartIdentifierListContext extends ParserRuleContext {
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public MultipartIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterMultipartIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitMultipartIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierListContext multipartIdentifierList() throws RecognitionException {
		MultipartIdentifierListContext _localctx = new MultipartIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_multipartIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			multipartIdentifier();
			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1547);
				match(T__1);
				setState(1548);
				multipartIdentifier();
				}
				}
				setState(1553);
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

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(1559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1555);
					match(T__3);
					setState(1556);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(1561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
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

	public static class TableIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext table;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1562);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(1563);
				match(T__3);
				}
				break;
			}
			setState(1567);
			((TableIdentifierContext)_localctx).table = errorCapturingIdentifier();
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

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext function;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1569);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(1570);
				match(T__3);
				}
				break;
			}
			setState(1574);
			((FunctionIdentifierContext)_localctx).function = errorCapturingIdentifier();
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

	public static class NamedExpressionContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(CustomSqlBaseParser.AS, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			expression();
			setState(1584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1577);
					match(AS);
					}
					break;
				}
				setState(1582);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1580);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case 2:
					{
					setState(1581);
					identifierList();
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

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			namedExpression();
			setState(1591);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1587);
					match(T__1);
					setState(1588);
					namedExpression();
					}
					} 
				}
				setState(1593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
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

	public static class PartitionFieldListContext extends ParserRuleContext {
		public PartitionFieldContext partitionField;
		public List<PartitionFieldContext> fields = new ArrayList<PartitionFieldContext>();
		public List<PartitionFieldContext> partitionField() {
			return getRuleContexts(PartitionFieldContext.class);
		}
		public PartitionFieldContext partitionField(int i) {
			return getRuleContext(PartitionFieldContext.class,i);
		}
		public PartitionFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionFieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterPartitionFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitPartitionFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitPartitionFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionFieldListContext partitionFieldList() throws RecognitionException {
		PartitionFieldListContext _localctx = new PartitionFieldListContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_partitionFieldList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			match(T__0);
			setState(1595);
			((PartitionFieldListContext)_localctx).partitionField = partitionField();
			((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
			setState(1600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1596);
				match(T__1);
				setState(1597);
				((PartitionFieldListContext)_localctx).partitionField = partitionField();
				((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
				}
				}
				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1603);
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

	public static class PartitionFieldContext extends ParserRuleContext {
		public PartitionFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionField; }
	 
		public PartitionFieldContext() { }
		public void copyFrom(PartitionFieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PartitionColumnContext extends PartitionFieldContext {
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionColumnContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterPartitionColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitPartitionColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitPartitionColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PartitionTransformContext extends PartitionFieldContext {
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public PartitionTransformContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterPartitionTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitPartitionTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitPartitionTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionFieldContext partitionField() throws RecognitionException {
		PartitionFieldContext _localctx = new PartitionFieldContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_partitionField);
		try {
			setState(1607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				_localctx = new PartitionTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1605);
				transform();
				}
				break;
			case 2:
				_localctx = new PartitionColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1606);
				colType();
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

	public static class TransformContext extends ParserRuleContext {
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
	 
		public TransformContext() { }
		public void copyFrom(TransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentityTransformContext extends TransformContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentityTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterIdentityTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitIdentityTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitIdentityTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplyTransformContext extends TransformContext {
		public IdentifierContext transformName;
		public TransformArgumentContext transformArgument;
		public List<TransformArgumentContext> argument = new ArrayList<TransformArgumentContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TransformArgumentContext> transformArgument() {
			return getRuleContexts(TransformArgumentContext.class);
		}
		public TransformArgumentContext transformArgument(int i) {
			return getRuleContext(TransformArgumentContext.class,i);
		}
		public ApplyTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterApplyTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitApplyTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitApplyTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_transform);
		int _la;
		try {
			setState(1622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1609);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1610);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(1611);
				match(T__0);
				setState(1612);
				((ApplyTransformContext)_localctx).transformArgument = transformArgument();
				((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
				setState(1617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1613);
					match(T__1);
					setState(1614);
					((ApplyTransformContext)_localctx).transformArgument = transformArgument();
					((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
					}
					}
					setState(1619);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1620);
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

	public static class TransformArgumentContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TransformArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterTransformArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitTransformArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitTransformArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformArgumentContext transformArgument() throws RecognitionException {
		TransformArgumentContext _localctx = new TransformArgumentContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_transformArgument);
		try {
			setState(1626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1624);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1625);
				constant();
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
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
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

	public static class ExpressionSeqContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSeqContext expressionSeq() throws RecognitionException {
		ExpressionSeqContext _localctx = new ExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_expressionSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			expression();
			setState(1635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1631);
				match(T__1);
				setState(1632);
				expression();
				}
				}
				setState(1637);
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
		public TerminalNode NOT() { return getToken(CustomSqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(CustomSqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitExists(this);
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
		public TerminalNode AND() { return getToken(CustomSqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(CustomSqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
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
		int _startState = 188;
		enterRecursionRule(_localctx, 188, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1639);
				match(NOT);
				setState(1640);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1641);
				match(EXISTS);
				setState(1642);
				match(T__0);
				setState(1643);
				query();
				setState(1644);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1646);
				valueExpression(0);
				setState(1648);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1647);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1658);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1652);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1653);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1654);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1655);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1656);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1657);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
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
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public Token quantifier;
		public Token escapeChar;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(CustomSqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(CustomSqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(CustomSqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(CustomSqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(CustomSqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(CustomSqlBaseParser.LIKE, 0); }
		public TerminalNode ANY() { return getToken(CustomSqlBaseParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(CustomSqlBaseParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(CustomSqlBaseParser.ALL, 0); }
		public TerminalNode ESCAPE() { return getToken(CustomSqlBaseParser.ESCAPE, 0); }
		public TerminalNode STRING() { return getToken(CustomSqlBaseParser.STRING, 0); }
		public TerminalNode IS() { return getToken(CustomSqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(CustomSqlBaseParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(CustomSqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CustomSqlBaseParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(CustomSqlBaseParser.UNKNOWN, 0); }
		public TerminalNode FROM() { return getToken(CustomSqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(CustomSqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_predicate);
		int _la;
		try {
			setState(1745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1663);
					match(NOT);
					}
				}

				setState(1666);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(1667);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(1668);
				match(AND);
				setState(1669);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1671);
					match(NOT);
					}
				}

				setState(1674);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1675);
				match(T__0);
				setState(1676);
				expression();
				setState(1681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1677);
					match(T__1);
					setState(1678);
					expression();
					}
					}
					setState(1683);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1684);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1686);
					match(NOT);
					}
				}

				setState(1689);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1690);
				match(T__0);
				setState(1691);
				query();
				setState(1692);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1694);
					match(NOT);
					}
				}

				setState(1697);
				((PredicateContext)_localctx).kind = match(RLIKE);
				setState(1698);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1699);
					match(NOT);
					}
				}

				setState(1702);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(1703);
				((PredicateContext)_localctx).quantifier = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
					((PredicateContext)_localctx).quantifier = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1717);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1704);
					match(T__0);
					setState(1705);
					match(T__2);
					}
					break;
				case 2:
					{
					setState(1706);
					match(T__0);
					setState(1707);
					expression();
					setState(1712);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(1708);
						match(T__1);
						setState(1709);
						expression();
						}
						}
						setState(1714);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1715);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1719);
					match(NOT);
					}
				}

				setState(1722);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(1723);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				setState(1726);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1724);
					match(ESCAPE);
					setState(1725);
					((PredicateContext)_localctx).escapeChar = match(STRING);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1728);
				match(IS);
				setState(1730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1729);
					match(NOT);
					}
				}

				setState(1732);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1733);
				match(IS);
				setState(1735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1734);
					match(NOT);
					}
				}

				setState(1737);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1738);
				match(IS);
				setState(1740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1739);
					match(NOT);
					}
				}

				setState(1742);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(1743);
				match(FROM);
				setState(1744);
				((PredicateContext)_localctx).right = valueExpression(0);
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
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitComparison(this);
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
		public TerminalNode ASTERISK() { return getToken(CustomSqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(CustomSqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(CustomSqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(CustomSqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(CustomSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CustomSqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(CustomSqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(CustomSqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(CustomSqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(CustomSqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CustomSqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(CustomSqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(CustomSqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
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
		int _startState = 192;
		enterRecursionRule(_localctx, 192, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1748);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1749);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 276)) & ~0x3f) == 0 && ((1L << (_la - 276)) & ((1L << (PLUS - 276)) | (1L << (MINUS - 276)) | (1L << (TILDE - 276)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1750);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1774);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1772);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1753);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1754);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || ((((_la - 278)) & ~0x3f) == 0 && ((1L << (_la - 278)) & ((1L << (ASTERISK - 278)) | (1L << (SLASH - 278)) | (1L << (PERCENT - 278)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1755);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1756);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1757);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 276)) & ~0x3f) == 0 && ((1L << (_la - 276)) & ((1L << (PLUS - 276)) | (1L << (MINUS - 276)) | (1L << (CONCAT_PIPE - 276)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1758);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1759);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1760);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(1761);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1762);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1763);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(1764);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1765);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1766);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(1767);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1768);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1769);
						comparisonOperator();
						setState(1770);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(1776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
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
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(CustomSqlBaseParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(CustomSqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(CustomSqlBaseParser.END, 0); }
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
		public TerminalNode ELSE() { return getToken(CustomSqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
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
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(CustomSqlBaseParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(CustomSqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(CustomSqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(CustomSqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OverlayContext extends PrimaryExpressionContext {
		public ValueExpressionContext input;
		public ValueExpressionContext replace;
		public ValueExpressionContext position;
		public ValueExpressionContext length;
		public TerminalNode OVERLAY() { return getToken(CustomSqlBaseParser.OVERLAY, 0); }
		public TerminalNode PLACING() { return getToken(CustomSqlBaseParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(CustomSqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(CustomSqlBaseParser.FOR, 0); }
		public OverlayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterOverlay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitOverlay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitOverlay(this);
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
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
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
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public ValueExpressionContext str;
		public ValueExpressionContext pos;
		public ValueExpressionContext len;
		public TerminalNode SUBSTR() { return getToken(CustomSqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(CustomSqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(CustomSqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(CustomSqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentDatetimeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(CustomSqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(CustomSqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public CurrentDatetimeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterCurrentDatetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitCurrentDatetime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitCurrentDatetime(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public Token name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(CustomSqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode CAST() { return getToken(CustomSqlBaseParser.CAST, 0); }
		public TerminalNode TRY_CAST() { return getToken(CustomSqlBaseParser.TRY_CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitConstantDefault(this);
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
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitLambda(this);
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
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(CustomSqlBaseParser.EXTRACT, 0); }
		public TerminalNode FROM() { return getToken(CustomSqlBaseParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrimContext extends PrimaryExpressionContext {
		public Token trimOption;
		public ValueExpressionContext trimStr;
		public ValueExpressionContext srcStr;
		public TerminalNode TRIM() { return getToken(CustomSqlBaseParser.TRIM, 0); }
		public TerminalNode FROM() { return getToken(CustomSqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BOTH() { return getToken(CustomSqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(CustomSqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(CustomSqlBaseParser.TRAILING, 0); }
		public TrimContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitTrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public BooleanExpressionContext where;
		public Token nullsOption;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(CustomSqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(CustomSqlBaseParser.WHERE, 0); }
		public TerminalNode NULLS() { return getToken(CustomSqlBaseParser.NULLS, 0); }
		public TerminalNode OVER() { return getToken(CustomSqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(CustomSqlBaseParser.IGNORE, 0); }
		public TerminalNode RESPECT() { return getToken(CustomSqlBaseParser.RESPECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(CustomSqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(CustomSqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CustomSqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(CustomSqlBaseParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(CustomSqlBaseParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(CustomSqlBaseParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(CustomSqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(CustomSqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitFirst(this);
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
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentDatetimeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1778);
				((CurrentDatetimeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CURRENT_DATE || _la==CURRENT_TIMESTAMP) ) {
					((CurrentDatetimeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1779);
				match(CASE);
				setState(1781); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1780);
					whenClause();
					}
					}
					setState(1783); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1785);
					match(ELSE);
					setState(1786);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1789);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1791);
				match(CASE);
				setState(1792);
				((SimpleCaseContext)_localctx).value = expression();
				setState(1794); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1793);
					whenClause();
					}
					}
					setState(1796); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1798);
					match(ELSE);
					setState(1799);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1802);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1804);
				((CastContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CAST || _la==TRY_CAST) ) {
					((CastContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1805);
				match(T__0);
				setState(1806);
				expression();
				setState(1807);
				match(AS);
				setState(1808);
				dataType();
				setState(1809);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1811);
				match(STRUCT);
				setState(1812);
				match(T__0);
				setState(1821);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1813);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(1818);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(1814);
						match(T__1);
						setState(1815);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(1820);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1823);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1824);
				match(FIRST);
				setState(1825);
				match(T__0);
				setState(1826);
				expression();
				setState(1829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(1827);
					match(IGNORE);
					setState(1828);
					match(NULLS);
					}
				}

				setState(1831);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1833);
				match(LAST);
				setState(1834);
				match(T__0);
				setState(1835);
				expression();
				setState(1838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(1836);
					match(IGNORE);
					setState(1837);
					match(NULLS);
					}
				}

				setState(1840);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1842);
				match(POSITION);
				setState(1843);
				match(T__0);
				setState(1844);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(1845);
				match(IN);
				setState(1846);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(1847);
				match(T__2);
				}
				break;
			case 9:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1849);
				constant();
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1850);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1851);
				qualifiedName();
				setState(1852);
				match(T__3);
				setState(1853);
				match(ASTERISK);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1855);
				match(T__0);
				setState(1856);
				namedExpression();
				setState(1859); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1857);
					match(T__1);
					setState(1858);
					namedExpression();
					}
					}
					setState(1861); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(1863);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1865);
				match(T__0);
				setState(1866);
				query();
				setState(1867);
				match(T__2);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1869);
				functionName();
				setState(1870);
				match(T__0);
				setState(1882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1872);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
					case 1:
						{
						setState(1871);
						setQuantifier();
						}
						break;
					}
					setState(1874);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(1879);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(1875);
						match(T__1);
						setState(1876);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(1881);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1884);
				match(T__2);
				setState(1891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1885);
					match(FILTER);
					setState(1886);
					match(T__0);
					setState(1887);
					match(WHERE);
					setState(1888);
					((FunctionCallContext)_localctx).where = booleanExpression(0);
					setState(1889);
					match(T__2);
					}
					break;
				}
				setState(1895);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1893);
					((FunctionCallContext)_localctx).nullsOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==IGNORE || _la==RESPECT) ) {
						((FunctionCallContext)_localctx).nullsOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1894);
					match(NULLS);
					}
					break;
				}
				setState(1899);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1897);
					match(OVER);
					setState(1898);
					windowSpec();
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
				setState(1901);
				identifier();
				setState(1902);
				match(T__6);
				setState(1903);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1905);
				match(T__0);
				setState(1906);
				identifier();
				setState(1909); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1907);
					match(T__1);
					setState(1908);
					identifier();
					}
					}
					setState(1911); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(1913);
				match(T__2);
				setState(1914);
				match(T__6);
				setState(1915);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1917);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1918);
				match(T__0);
				setState(1919);
				expression();
				setState(1920);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1922);
				match(EXTRACT);
				setState(1923);
				match(T__0);
				setState(1924);
				((ExtractContext)_localctx).field = identifier();
				setState(1925);
				match(FROM);
				setState(1926);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(1927);
				match(T__2);
				}
				break;
			case 20:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1929);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1930);
				match(T__0);
				setState(1931);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(1932);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1933);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(1936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==FOR) {
					{
					setState(1934);
					_la = _input.LA(1);
					if ( !(_la==T__1 || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1935);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(1938);
				match(T__2);
				}
				break;
			case 21:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1940);
				match(TRIM);
				setState(1941);
				match(T__0);
				setState(1943);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1942);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
						((TrimContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1946);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(1945);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(1948);
				match(FROM);
				setState(1949);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(1950);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1952);
				match(OVERLAY);
				setState(1953);
				match(T__0);
				setState(1954);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(1955);
				match(PLACING);
				setState(1956);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(1957);
				match(FROM);
				setState(1958);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(1961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1959);
					match(FOR);
					setState(1960);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(1963);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1977);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1975);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1967);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1968);
						match(T__7);
						setState(1969);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(1970);
						match(T__8);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1972);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1973);
						match(T__3);
						setState(1974);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(1979);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
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

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(CustomSqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(CustomSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CustomSqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(CustomSqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_constant);
		try {
			int _alt;
			setState(1992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1980);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1981);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1982);
				identifier();
				setState(1983);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1985);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1986);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1988); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1987);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1990); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public TerminalNode EQ() { return getToken(CustomSqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(CustomSqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(CustomSqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(CustomSqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(CustomSqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(CustomSqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(CustomSqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(CustomSqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1994);
			_la = _input.LA(1);
			if ( !(((((_la - 268)) & ~0x3f) == 0 && ((1L << (_la - 268)) & ((1L << (EQ - 268)) | (1L << (NSEQ - 268)) | (1L << (NEQ - 268)) | (1L << (NEQJ - 268)) | (1L << (LT - 268)) | (1L << (LTE - 268)) | (1L << (GT - 268)) | (1L << (GTE - 268)))) != 0)) ) {
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

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CustomSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CustomSqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(CustomSqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(CustomSqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(CustomSqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(CustomSqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(CustomSqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(CustomSqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(CustomSqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(CustomSqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(CustomSqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1996);
			_la = _input.LA(1);
			if ( !(_la==DIV || ((((_la - 276)) & ~0x3f) == 0 && ((1L << (_la - 276)) & ((1L << (PLUS - 276)) | (1L << (MINUS - 276)) | (1L << (ASTERISK - 276)) | (1L << (SLASH - 276)) | (1L << (PERCENT - 276)) | (1L << (TILDE - 276)) | (1L << (AMPERSAND - 276)) | (1L << (PIPE - 276)) | (1L << (CONCAT_PIPE - 276)) | (1L << (HAT - 276)))) != 0)) ) {
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

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(CustomSqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(CustomSqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(CustomSqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(CustomSqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1998);
			_la = _input.LA(1);
			if ( !(_la==AND || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (IN - 113)) | (1L << (NOT - 113)) | (1L << (OR - 113)))) != 0)) ) {
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
		public TerminalNode TRUE() { return getToken(CustomSqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CustomSqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
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
		public TerminalNode INTERVAL() { return getToken(CustomSqlBaseParser.INTERVAL, 0); }
		public ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() {
			return getRuleContext(ErrorCapturingMultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() {
			return getRuleContext(ErrorCapturingUnitToUnitIntervalContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2002);
			match(INTERVAL);
			setState(2005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2003);
				errorCapturingMultiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2004);
				errorCapturingUnitToUnitInterval();
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

	public static class ErrorCapturingMultiUnitsIntervalContext extends ParserRuleContext {
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public UnitToUnitIntervalContext unitToUnitInterval() {
			return getRuleContext(UnitToUnitIntervalContext.class,0);
		}
		public ErrorCapturingMultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingMultiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitErrorCapturingMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() throws RecognitionException {
		ErrorCapturingMultiUnitsIntervalContext _localctx = new ErrorCapturingMultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_errorCapturingMultiUnitsInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2007);
			multiUnitsInterval();
			setState(2009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(2008);
				unitToUnitInterval();
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

	public static class MultiUnitsIntervalContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> unit = new ArrayList<IdentifierContext>();
		public List<IntervalValueContext> intervalValue() {
			return getRuleContexts(IntervalValueContext.class);
		}
		public IntervalValueContext intervalValue(int i) {
			return getRuleContext(IntervalValueContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiUnitsIntervalContext multiUnitsInterval() throws RecognitionException {
		MultiUnitsIntervalContext _localctx = new MultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_multiUnitsInterval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2014); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2011);
					intervalValue();
					setState(2012);
					((MultiUnitsIntervalContext)_localctx).identifier = identifier();
					((MultiUnitsIntervalContext)_localctx).unit.add(((MultiUnitsIntervalContext)_localctx).identifier);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2016); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ErrorCapturingUnitToUnitIntervalContext extends ParserRuleContext {
		public UnitToUnitIntervalContext body;
		public MultiUnitsIntervalContext error1;
		public UnitToUnitIntervalContext error2;
		public List<UnitToUnitIntervalContext> unitToUnitInterval() {
			return getRuleContexts(UnitToUnitIntervalContext.class);
		}
		public UnitToUnitIntervalContext unitToUnitInterval(int i) {
			return getRuleContext(UnitToUnitIntervalContext.class,i);
		}
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingUnitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitErrorCapturingUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() throws RecognitionException {
		ErrorCapturingUnitToUnitIntervalContext _localctx = new ErrorCapturingUnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_errorCapturingUnitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			((ErrorCapturingUnitToUnitIntervalContext)_localctx).body = unitToUnitInterval();
			setState(2021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2019);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error1 = multiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2020);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error2 = unitToUnitInterval();
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

	public static class UnitToUnitIntervalContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode TO() { return getToken(CustomSqlBaseParser.TO, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitToUnitIntervalContext unitToUnitInterval() throws RecognitionException {
		UnitToUnitIntervalContext _localctx = new UnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_unitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2023);
			((UnitToUnitIntervalContext)_localctx).value = intervalValue();
			setState(2024);
			((UnitToUnitIntervalContext)_localctx).from = identifier();
			setState(2025);
			match(TO);
			setState(2026);
			((UnitToUnitIntervalContext)_localctx).to = identifier();
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

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(CustomSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(CustomSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode STRING() { return getToken(CustomSqlBaseParser.STRING, 0); }
		public TerminalNode PLUS() { return getToken(CustomSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CustomSqlBaseParser.MINUS, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_intervalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(2028);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2031);
			_la = _input.LA(1);
			if ( !(((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (STRING - 286)) | (1L << (INTEGER_VALUE - 286)) | (1L << (DECIMAL_VALUE - 286)))) != 0)) ) {
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

	public static class ColPositionContext extends ParserRuleContext {
		public Token position;
		public ErrorCapturingIdentifierContext afterCol;
		public TerminalNode FIRST() { return getToken(CustomSqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(CustomSqlBaseParser.AFTER, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_colPosition);
		try {
			setState(2036);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2033);
				((ColPositionContext)_localctx).position = match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2034);
				((ColPositionContext)_localctx).position = match(AFTER);
				setState(2035);
				((ColPositionContext)_localctx).afterCol = errorCapturingIdentifier();
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(CustomSqlBaseParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(CustomSqlBaseParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(CustomSqlBaseParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(CustomSqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(CustomSqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(CustomSqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class YearMonthIntervalDataTypeContext extends DataTypeContext {
		public TerminalNode INTERVAL() { return getToken(CustomSqlBaseParser.INTERVAL, 0); }
		public TerminalNode YEAR() { return getToken(CustomSqlBaseParser.YEAR, 0); }
		public TerminalNode TO() { return getToken(CustomSqlBaseParser.TO, 0); }
		public TerminalNode MONTH() { return getToken(CustomSqlBaseParser.MONTH, 0); }
		public YearMonthIntervalDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterYearMonthIntervalDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitYearMonthIntervalDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitYearMonthIntervalDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DayTimeIntervalDataTypeContext extends DataTypeContext {
		public TerminalNode INTERVAL() { return getToken(CustomSqlBaseParser.INTERVAL, 0); }
		public TerminalNode DAY() { return getToken(CustomSqlBaseParser.DAY, 0); }
		public TerminalNode TO() { return getToken(CustomSqlBaseParser.TO, 0); }
		public TerminalNode SECOND() { return getToken(CustomSqlBaseParser.SECOND, 0); }
		public DayTimeIntervalDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterDayTimeIntervalDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitDayTimeIntervalDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitDayTimeIntervalDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(CustomSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(CustomSqlBaseParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_dataType);
		int _la;
		try {
			setState(2080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2038);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2039);
				match(LT);
				setState(2040);
				dataType();
				setState(2041);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2043);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2044);
				match(LT);
				setState(2045);
				dataType();
				setState(2046);
				match(T__1);
				setState(2047);
				dataType();
				setState(2048);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2050);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2057);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2051);
					match(LT);
					setState(2053);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
					case 1:
						{
						setState(2052);
						complexColTypeList();
						}
						break;
					}
					setState(2055);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2056);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new YearMonthIntervalDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2059);
				match(INTERVAL);
				setState(2060);
				match(YEAR);
				setState(2061);
				match(TO);
				setState(2062);
				match(MONTH);
				}
				break;
			case 5:
				_localctx = new DayTimeIntervalDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2063);
				match(INTERVAL);
				setState(2064);
				match(DAY);
				setState(2065);
				match(TO);
				setState(2066);
				match(SECOND);
				}
				break;
			case 6:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2067);
				identifier();
				setState(2078);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(2068);
					match(T__0);
					setState(2069);
					match(INTEGER_VALUE);
					setState(2074);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(2070);
						match(T__1);
						setState(2071);
						match(INTEGER_VALUE);
						}
						}
						setState(2076);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2077);
					match(T__2);
					}
					break;
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

	public static class QualifiedColTypeWithPositionListContext extends ParserRuleContext {
		public List<QualifiedColTypeWithPositionContext> qualifiedColTypeWithPosition() {
			return getRuleContexts(QualifiedColTypeWithPositionContext.class);
		}
		public QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition(int i) {
			return getRuleContext(QualifiedColTypeWithPositionContext.class,i);
		}
		public QualifiedColTypeWithPositionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPositionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterQualifiedColTypeWithPositionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitQualifiedColTypeWithPositionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPositionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() throws RecognitionException {
		QualifiedColTypeWithPositionListContext _localctx = new QualifiedColTypeWithPositionListContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_qualifiedColTypeWithPositionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2082);
			qualifiedColTypeWithPosition();
			setState(2087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(2083);
				match(T__1);
				setState(2084);
				qualifiedColTypeWithPosition();
				}
				}
				setState(2089);
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

	public static class QualifiedColTypeWithPositionContext extends ParserRuleContext {
		public MultipartIdentifierContext name;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CustomSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(CustomSqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public QualifiedColTypeWithPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterQualifiedColTypeWithPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitQualifiedColTypeWithPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition() throws RecognitionException {
		QualifiedColTypeWithPositionContext _localctx = new QualifiedColTypeWithPositionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_qualifiedColTypeWithPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2090);
			((QualifiedColTypeWithPositionContext)_localctx).name = multipartIdentifier();
			setState(2091);
			dataType();
			setState(2094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2092);
				match(NOT);
				setState(2093);
				match(NULL);
				}
			}

			setState(2097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2096);
				commentSpec();
				}
			}

			setState(2100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2099);
				colPosition();
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

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2102);
			colType();
			setState(2107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2103);
					match(T__1);
					setState(2104);
					colType();
					}
					} 
				}
				setState(2109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
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

	public static class ColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CustomSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(CustomSqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2110);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(2111);
			dataType();
			setState(2114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(2112);
				match(NOT);
				setState(2113);
				match(NULL);
				}
				break;
			}
			setState(2117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2116);
				commentSpec();
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

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2119);
			complexColType();
			setState(2124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(2120);
				match(T__1);
				setState(2121);
				complexColType();
				}
				}
				setState(2126);
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

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CustomSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(CustomSqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2127);
			identifier();
			setState(2128);
			match(T__9);
			setState(2129);
			dataType();
			setState(2132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2130);
				match(NOT);
				setState(2131);
				match(NULL);
				}
			}

			setState(2135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2134);
				commentSpec();
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

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(CustomSqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(CustomSqlBaseParser.THEN, 0); }
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
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2137);
			match(WHEN);
			setState(2138);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2139);
			match(THEN);
			setState(2140);
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

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(CustomSqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2142);
			match(WINDOW);
			setState(2143);
			namedWindow();
			setState(2148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2144);
					match(T__1);
					setState(2145);
					namedWindow();
					}
					} 
				}
				setState(2150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
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

	public static class NamedWindowContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public TerminalNode AS() { return getToken(CustomSqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2151);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(2152);
			match(AS);
			setState(2153);
			windowSpec();
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

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public ErrorCapturingIdentifierContext name;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(CustomSqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(CustomSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(CustomSqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(CustomSqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(CustomSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(CustomSqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(CustomSqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_windowSpec);
		int _la;
		try {
			setState(2201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2155);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2156);
				match(T__0);
				setState(2157);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(2158);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2160);
				match(T__0);
				setState(2195);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2161);
					match(CLUSTER);
					setState(2162);
					match(BY);
					setState(2163);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2168);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(2164);
						match(T__1);
						setState(2165);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2170);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__2:
				case DISTRIBUTE:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
					{
					setState(2181);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(2171);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2172);
						match(BY);
						setState(2173);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2178);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__1) {
							{
							{
							setState(2174);
							match(T__1);
							setState(2175);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2180);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2193);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2183);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2184);
						match(BY);
						setState(2185);
						sortItem();
						setState(2190);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__1) {
							{
							{
							setState(2186);
							match(T__1);
							setState(2187);
							sortItem();
							}
							}
							setState(2192);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2197);
					windowFrame();
					}
				}

				setState(2200);
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

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(CustomSqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(CustomSqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(CustomSqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(CustomSqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_windowFrame);
		try {
			setState(2219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2203);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2204);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2205);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2206);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2207);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2208);
				match(BETWEEN);
				setState(2209);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2210);
				match(AND);
				setState(2211);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2213);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2214);
				match(BETWEEN);
				setState(2215);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2216);
				match(AND);
				setState(2217);
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
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(CustomSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(CustomSqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(CustomSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(CustomSqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(CustomSqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_frameBound);
		int _la;
		try {
			setState(2228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2221);
				match(UNBOUNDED);
				setState(2222);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2223);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2224);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2225);
				expression();
				setState(2226);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2230);
			qualifiedName();
			setState(2235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(2231);
				match(T__1);
				setState(2232);
				qualifiedName();
				}
				}
				setState(2237);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(CustomSqlBaseParser.FILTER, 0); }
		public TerminalNode LEFT() { return getToken(CustomSqlBaseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(CustomSqlBaseParser.RIGHT, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_functionName);
		try {
			setState(2242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2238);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2239);
				match(FILTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2240);
				match(LEFT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2241);
				match(RIGHT);
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
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2244);
			identifier();
			setState(2249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2245);
					match(T__3);
					setState(2246);
					identifier();
					}
					} 
				}
				setState(2251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
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

	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitErrorCapturingIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitErrorCapturingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2252);
			identifier();
			setState(2253);
			errorCapturingIdentifierExtra();
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

	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> MINUS() { return getTokens(CustomSqlBaseParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CustomSqlBaseParser.MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterErrorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitErrorIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitErrorIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterRealIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitRealIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitRealIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(2262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2257); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2255);
						match(MINUS);
						setState(2256);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2259); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public StrictNonReservedContext strictNonReserved() {
			return getRuleContext(StrictNonReservedContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_identifier);
		try {
			setState(2267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2264);
				strictIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2265);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(2266);
				strictNonReserved();
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

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(CustomSqlBaseParser.IDENTIFIER, 0); }
		public AnsiNonReservedContext ansiNonReserved() {
			return getRuleContext(AnsiNonReservedContext.class,0);
		}
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_strictIdentifier);
		try {
			setState(2275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2269);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2270);
				quotedIdentifier();
				}
				break;
			case 3:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2271);
				if (!(SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "SQL_standard_keyword_behavior");
				setState(2272);
				ansiNonReserved();
				}
				break;
			case 4:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2273);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(2274);
				nonReserved();
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

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(CustomSqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2277);
			match(BACKQUOTED_IDENTIFIER);
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
		public TerminalNode DECIMAL_VALUE() { return getToken(CustomSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(CustomSqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(CustomSqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(CustomSqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(CustomSqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(CustomSqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LegacyDecimalLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(CustomSqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(CustomSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(CustomSqlBaseParser.MINUS, 0); }
		public LegacyDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterLegacyDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitLegacyDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitLegacyDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(CustomSqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(CustomSqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(CustomSqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(CustomSqlBaseParser.MINUS, 0); }
		public ExponentLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterExponentLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitExponentLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitExponentLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(CustomSqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(CustomSqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(CustomSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(CustomSqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends NumberContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(CustomSqlBaseParser.FLOAT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(CustomSqlBaseParser.MINUS, 0); }
		public FloatLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(CustomSqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(CustomSqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_number);
		int _la;
		try {
			setState(2322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				_localctx = new ExponentLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2279);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(2281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2280);
					match(MINUS);
					}
				}

				setState(2283);
				match(EXPONENT_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2284);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(2286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2285);
					match(MINUS);
					}
				}

				setState(2288);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new LegacyDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2289);
				if (!(legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "legacy_exponent_literal_as_decimal_enabled");
				setState(2291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2290);
					match(MINUS);
					}
				}

				setState(2293);
				_la = _input.LA(1);
				if ( !(_la==EXPONENT_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2294);
					match(MINUS);
					}
				}

				setState(2297);
				match(INTEGER_VALUE);
				}
				break;
			case 5:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2298);
					match(MINUS);
					}
				}

				setState(2301);
				match(BIGINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2302);
					match(MINUS);
					}
				}

				setState(2305);
				match(SMALLINT_LITERAL);
				}
				break;
			case 7:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2306);
					match(MINUS);
					}
				}

				setState(2309);
				match(TINYINT_LITERAL);
				}
				break;
			case 8:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(2311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2310);
					match(MINUS);
					}
				}

				setState(2313);
				match(DOUBLE_LITERAL);
				}
				break;
			case 9:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(2315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2314);
					match(MINUS);
					}
				}

				setState(2317);
				match(FLOAT_LITERAL);
				}
				break;
			case 10:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(2319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2318);
					match(MINUS);
					}
				}

				setState(2321);
				match(BIGDECIMAL_LITERAL);
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

	public static class AlterColumnActionContext extends ParserRuleContext {
		public Token setOrDrop;
		public TerminalNode TYPE() { return getToken(CustomSqlBaseParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CustomSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(CustomSqlBaseParser.NULL, 0); }
		public TerminalNode SET() { return getToken(CustomSqlBaseParser.SET, 0); }
		public TerminalNode DROP() { return getToken(CustomSqlBaseParser.DROP, 0); }
		public AlterColumnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterAlterColumnAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitAlterColumnAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitAlterColumnAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterColumnActionContext alterColumnAction() throws RecognitionException {
		AlterColumnActionContext _localctx = new AlterColumnActionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_alterColumnAction);
		int _la;
		try {
			setState(2331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2324);
				match(TYPE);
				setState(2325);
				dataType();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2326);
				commentSpec();
				}
				break;
			case AFTER:
			case FIRST:
				enterOuterAlt(_localctx, 3);
				{
				setState(2327);
				colPosition();
				}
				break;
			case DROP:
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(2328);
				((AlterColumnActionContext)_localctx).setOrDrop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DROP || _la==SET) ) {
					((AlterColumnActionContext)_localctx).setOrDrop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2329);
				match(NOT);
				setState(2330);
				match(NULL);
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

	public static class AnsiNonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CustomSqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(CustomSqlBaseParser.AFTER, 0); }
		public TerminalNode ALTER() { return getToken(CustomSqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(CustomSqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANTI() { return getToken(CustomSqlBaseParser.ANTI, 0); }
		public TerminalNode ARCHIVE() { return getToken(CustomSqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(CustomSqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(CustomSqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(CustomSqlBaseParser.AT, 0); }
		public TerminalNode BETWEEN() { return getToken(CustomSqlBaseParser.BETWEEN, 0); }
		public TerminalNode BUCKET() { return getToken(CustomSqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(CustomSqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(CustomSqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(CustomSqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(CustomSqlBaseParser.CASCADE, 0); }
		public TerminalNode CHANGE() { return getToken(CustomSqlBaseParser.CHANGE, 0); }
		public TerminalNode CLEAR() { return getToken(CustomSqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(CustomSqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(CustomSqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(CustomSqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLECTION() { return getToken(CustomSqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMNS() { return getToken(CustomSqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(CustomSqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(CustomSqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(CustomSqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(CustomSqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(CustomSqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(CustomSqlBaseParser.CONCATENATE, 0); }
		public TerminalNode COST() { return getToken(CustomSqlBaseParser.COST, 0); }
		public TerminalNode CUBE() { return getToken(CustomSqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(CustomSqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(CustomSqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(CustomSqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(CustomSqlBaseParser.DATABASES, 0); }
		public TerminalNode DAY() { return getToken(CustomSqlBaseParser.DAY, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(CustomSqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(CustomSqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(CustomSqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(CustomSqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(CustomSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(CustomSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(CustomSqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(CustomSqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(CustomSqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(CustomSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(CustomSqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(CustomSqlBaseParser.DROP, 0); }
		public TerminalNode ESCAPED() { return getToken(CustomSqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(CustomSqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(CustomSqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(CustomSqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(CustomSqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(CustomSqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(CustomSqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(CustomSqlBaseParser.EXTRACT, 0); }
		public TerminalNode FIELDS() { return getToken(CustomSqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(CustomSqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(CustomSqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(CustomSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(CustomSqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(CustomSqlBaseParser.FORMATTED, 0); }
		public TerminalNode FUNCTION() { return getToken(CustomSqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(CustomSqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(CustomSqlBaseParser.GLOBAL, 0); }
		public TerminalNode GROUPING() { return getToken(CustomSqlBaseParser.GROUPING, 0); }
		public TerminalNode IF() { return getToken(CustomSqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(CustomSqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(CustomSqlBaseParser.IMPORT, 0); }
		public TerminalNode INDEX() { return getToken(CustomSqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(CustomSqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(CustomSqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(CustomSqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(CustomSqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(CustomSqlBaseParser.INTERVAL, 0); }
		public TerminalNode ITEMS() { return getToken(CustomSqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(CustomSqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(CustomSqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(CustomSqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(CustomSqlBaseParser.LAZY, 0); }
		public TerminalNode LIKE() { return getToken(CustomSqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(CustomSqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(CustomSqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(CustomSqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(CustomSqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(CustomSqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(CustomSqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(CustomSqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(CustomSqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(CustomSqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(CustomSqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(CustomSqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(CustomSqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(CustomSqlBaseParser.MERGE, 0); }
		public TerminalNode MONTH() { return getToken(CustomSqlBaseParser.MONTH, 0); }
		public TerminalNode MSCK() { return getToken(CustomSqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(CustomSqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(CustomSqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(CustomSqlBaseParser.NO, 0); }
		public TerminalNode NULLS() { return getToken(CustomSqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(CustomSqlBaseParser.OF, 0); }
		public TerminalNode OPTION() { return getToken(CustomSqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(CustomSqlBaseParser.OPTIONS, 0); }
		public TerminalNode OUT() { return getToken(CustomSqlBaseParser.OUT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(CustomSqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(CustomSqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAY() { return getToken(CustomSqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(CustomSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(CustomSqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(CustomSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(CustomSqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(CustomSqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(CustomSqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(CustomSqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(CustomSqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(CustomSqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRINCIPALS() { return getToken(CustomSqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(CustomSqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(CustomSqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(CustomSqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(CustomSqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(CustomSqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(CustomSqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(CustomSqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(CustomSqlBaseParser.REDUCE, 0); }
		public TerminalNode REFRESH() { return getToken(CustomSqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(CustomSqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(CustomSqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(CustomSqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(CustomSqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(CustomSqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(CustomSqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(CustomSqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(CustomSqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(CustomSqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(CustomSqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(CustomSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(CustomSqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(CustomSqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(CustomSqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(CustomSqlBaseParser.SCHEMA, 0); }
		public TerminalNode SECOND() { return getToken(CustomSqlBaseParser.SECOND, 0); }
		public TerminalNode SEMI() { return getToken(CustomSqlBaseParser.SEMI, 0); }
		public TerminalNode SEPARATED() { return getToken(CustomSqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(CustomSqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(CustomSqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SET() { return getToken(CustomSqlBaseParser.SET, 0); }
		public TerminalNode SETMINUS() { return getToken(CustomSqlBaseParser.SETMINUS, 0); }
		public TerminalNode SETS() { return getToken(CustomSqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(CustomSqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(CustomSqlBaseParser.SKEWED, 0); }
		public TerminalNode SORT() { return getToken(CustomSqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(CustomSqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(CustomSqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(CustomSqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(CustomSqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(CustomSqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(CustomSqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(CustomSqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(CustomSqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(CustomSqlBaseParser.SYNC, 0); }
		public TerminalNode TABLES() { return getToken(CustomSqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(CustomSqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(CustomSqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(CustomSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(CustomSqlBaseParser.TERMINATED, 0); }
		public TerminalNode TOUCH() { return getToken(CustomSqlBaseParser.TOUCH, 0); }
		public TerminalNode TRANSACTION() { return getToken(CustomSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(CustomSqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(CustomSqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(CustomSqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(CustomSqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(CustomSqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TRY_CAST() { return getToken(CustomSqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(CustomSqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(CustomSqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(CustomSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(CustomSqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNLOCK() { return getToken(CustomSqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(CustomSqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(CustomSqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(CustomSqlBaseParser.USE, 0); }
		public TerminalNode VALUES() { return getToken(CustomSqlBaseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(CustomSqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(CustomSqlBaseParser.VIEWS, 0); }
		public TerminalNode WINDOW() { return getToken(CustomSqlBaseParser.WINDOW, 0); }
		public TerminalNode YEAR() { return getToken(CustomSqlBaseParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(CustomSqlBaseParser.ZONE, 0); }
		public AnsiNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ansiNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterAnsiNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitAnsiNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitAnsiNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnsiNonReservedContext ansiNonReserved() throws RecognitionException {
		AnsiNonReservedContext _localctx = new AnsiNonReservedContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_ansiNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2333);
			_la = _input.LA(1);
			if ( !(((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (ADD - 12)) | (1L << (AFTER - 12)) | (1L << (ALTER - 12)) | (1L << (ANALYZE - 12)) | (1L << (ANTI - 12)) | (1L << (ARCHIVE - 12)) | (1L << (ARRAY - 12)) | (1L << (ASC - 12)) | (1L << (AT - 12)) | (1L << (BETWEEN - 12)) | (1L << (BUCKET - 12)) | (1L << (BUCKETS - 12)) | (1L << (BY - 12)) | (1L << (CACHE - 12)) | (1L << (CASCADE - 12)) | (1L << (CHANGE - 12)) | (1L << (CLEAR - 12)) | (1L << (CLUSTER - 12)) | (1L << (CLUSTERED - 12)) | (1L << (CODEGEN - 12)) | (1L << (COLLECTION - 12)) | (1L << (COLUMNS - 12)) | (1L << (COMMENT - 12)) | (1L << (COMMIT - 12)) | (1L << (COMPACT - 12)) | (1L << (COMPACTIONS - 12)) | (1L << (COMPUTE - 12)) | (1L << (CONCATENATE - 12)) | (1L << (COST - 12)) | (1L << (CUBE - 12)) | (1L << (CURRENT - 12)) | (1L << (DAY - 12)) | (1L << (DATA - 12)) | (1L << (DATABASE - 12)) | (1L << (DATABASES - 12)) | (1L << (DBPROPERTIES - 12)) | (1L << (DEFINED - 12)) | (1L << (DELETE - 12)) | (1L << (DELIMITED - 12)) | (1L << (DESC - 12)) | (1L << (DESCRIBE - 12)) | (1L << (DFS - 12)) | (1L << (DIRECTORIES - 12)) | (1L << (DIRECTORY - 12)) | (1L << (DISTRIBUTE - 12)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (DIV - 76)) | (1L << (DROP - 76)) | (1L << (ESCAPED - 76)) | (1L << (EXCHANGE - 76)) | (1L << (EXISTS - 76)) | (1L << (EXPLAIN - 76)) | (1L << (EXPORT - 76)) | (1L << (EXTENDED - 76)) | (1L << (EXTERNAL - 76)) | (1L << (EXTRACT - 76)) | (1L << (FIELDS - 76)) | (1L << (FILEFORMAT - 76)) | (1L << (FIRST - 76)) | (1L << (FOLLOWING - 76)) | (1L << (FORMAT - 76)) | (1L << (FORMATTED - 76)) | (1L << (FUNCTION - 76)) | (1L << (FUNCTIONS - 76)) | (1L << (GLOBAL - 76)) | (1L << (GROUPING - 76)) | (1L << (IF - 76)) | (1L << (IGNORE - 76)) | (1L << (IMPORT - 76)) | (1L << (INDEX - 76)) | (1L << (INDEXES - 76)) | (1L << (INPATH - 76)) | (1L << (INPUTFORMAT - 76)) | (1L << (INSERT - 76)) | (1L << (INTERVAL - 76)) | (1L << (ITEMS - 76)) | (1L << (KEYS - 76)) | (1L << (LAST - 76)) | (1L << (LATERAL - 76)) | (1L << (LAZY - 76)) | (1L << (LIKE - 76)) | (1L << (LIMIT - 76)) | (1L << (LINES - 76)) | (1L << (LIST - 76)) | (1L << (LOAD - 76)) | (1L << (LOCAL - 76)) | (1L << (LOCATION - 76)) | (1L << (LOCK - 76)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (LOCKS - 140)) | (1L << (LOGICAL - 140)) | (1L << (MACRO - 140)) | (1L << (MAP - 140)) | (1L << (MATCHED - 140)) | (1L << (MERGE - 140)) | (1L << (MONTH - 140)) | (1L << (MSCK - 140)) | (1L << (NAMESPACE - 140)) | (1L << (NAMESPACES - 140)) | (1L << (NO - 140)) | (1L << (NULLS - 140)) | (1L << (OF - 140)) | (1L << (OPTION - 140)) | (1L << (OPTIONS - 140)) | (1L << (OUT - 140)) | (1L << (OUTPUTFORMAT - 140)) | (1L << (OVER - 140)) | (1L << (OVERLAY - 140)) | (1L << (OVERWRITE - 140)) | (1L << (PARTITION - 140)) | (1L << (PARTITIONED - 140)) | (1L << (PARTITIONS - 140)) | (1L << (PERCENTLIT - 140)) | (1L << (PIVOT - 140)) | (1L << (PLACING - 140)) | (1L << (POSITION - 140)) | (1L << (PRECEDING - 140)) | (1L << (PRINCIPALS - 140)) | (1L << (PROPERTIES - 140)) | (1L << (PURGE - 140)) | (1L << (QUERY - 140)) | (1L << (RANGE - 140)) | (1L << (RECORDREADER - 140)) | (1L << (RECORDWRITER - 140)) | (1L << (RECOVER - 140)) | (1L << (REDUCE - 140)) | (1L << (REFRESH - 140)) | (1L << (RENAME - 140)) | (1L << (REPAIR - 140)) | (1L << (REPLACE - 140)) | (1L << (RESET - 140)) | (1L << (RESPECT - 140)) | (1L << (RESTRICT - 140)) | (1L << (REVOKE - 140)) | (1L << (RLIKE - 140)) | (1L << (ROLE - 140)) | (1L << (ROLES - 140)) | (1L << (ROLLBACK - 140)) | (1L << (ROLLUP - 140)) | (1L << (ROW - 140)) | (1L << (ROWS - 140)))) != 0) || ((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (SECOND - 204)) | (1L << (SCHEMA - 204)) | (1L << (SEMI - 204)) | (1L << (SEPARATED - 204)) | (1L << (SERDE - 204)) | (1L << (SERDEPROPERTIES - 204)) | (1L << (SET - 204)) | (1L << (SETMINUS - 204)) | (1L << (SETS - 204)) | (1L << (SHOW - 204)) | (1L << (SKEWED - 204)) | (1L << (SORT - 204)) | (1L << (SORTED - 204)) | (1L << (START - 204)) | (1L << (STATISTICS - 204)) | (1L << (STORED - 204)) | (1L << (STRATIFY - 204)) | (1L << (STRUCT - 204)) | (1L << (SUBSTR - 204)) | (1L << (SUBSTRING - 204)) | (1L << (SYNC - 204)) | (1L << (TABLES - 204)) | (1L << (TABLESAMPLE - 204)) | (1L << (TBLPROPERTIES - 204)) | (1L << (TEMPORARY - 204)) | (1L << (TERMINATED - 204)) | (1L << (TOUCH - 204)) | (1L << (TRANSACTION - 204)) | (1L << (TRANSACTIONS - 204)) | (1L << (TRANSFORM - 204)) | (1L << (TRIM - 204)) | (1L << (TRUE - 204)) | (1L << (TRUNCATE - 204)) | (1L << (TRY_CAST - 204)) | (1L << (TYPE - 204)) | (1L << (UNARCHIVE - 204)) | (1L << (UNBOUNDED - 204)) | (1L << (UNCACHE - 204)) | (1L << (UNLOCK - 204)) | (1L << (UNSET - 204)) | (1L << (UPDATE - 204)) | (1L << (USE - 204)) | (1L << (VALUES - 204)) | (1L << (VIEW - 204)) | (1L << (VIEWS - 204)) | (1L << (WINDOW - 204)) | (1L << (YEAR - 204)) | (1L << (ZONE - 204)))) != 0)) ) {
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

	public static class StrictNonReservedContext extends ParserRuleContext {
		public TerminalNode ANTI() { return getToken(CustomSqlBaseParser.ANTI, 0); }
		public TerminalNode CROSS() { return getToken(CustomSqlBaseParser.CROSS, 0); }
		public TerminalNode EXCEPT() { return getToken(CustomSqlBaseParser.EXCEPT, 0); }
		public TerminalNode FULL() { return getToken(CustomSqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(CustomSqlBaseParser.INNER, 0); }
		public TerminalNode INTERSECT() { return getToken(CustomSqlBaseParser.INTERSECT, 0); }
		public TerminalNode JOIN() { return getToken(CustomSqlBaseParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(CustomSqlBaseParser.LEFT, 0); }
		public TerminalNode NATURAL() { return getToken(CustomSqlBaseParser.NATURAL, 0); }
		public TerminalNode ON() { return getToken(CustomSqlBaseParser.ON, 0); }
		public TerminalNode RIGHT() { return getToken(CustomSqlBaseParser.RIGHT, 0); }
		public TerminalNode SEMI() { return getToken(CustomSqlBaseParser.SEMI, 0); }
		public TerminalNode SETMINUS() { return getToken(CustomSqlBaseParser.SETMINUS, 0); }
		public TerminalNode UNION() { return getToken(CustomSqlBaseParser.UNION, 0); }
		public TerminalNode USING() { return getToken(CustomSqlBaseParser.USING, 0); }
		public StrictNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterStrictNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitStrictNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitStrictNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictNonReservedContext strictNonReserved() throws RecognitionException {
		StrictNonReservedContext _localctx = new StrictNonReservedContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_strictNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2335);
			_la = _input.LA(1);
			if ( !(_la==ANTI || _la==CROSS || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (EXCEPT - 82)) | (1L << (FULL - 82)) | (1L << (INNER - 82)) | (1L << (INTERSECT - 82)) | (1L << (JOIN - 82)) | (1L << (LEFT - 82)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (NATURAL - 150)) | (1L << (ON - 150)) | (1L << (RIGHT - 150)) | (1L << (SEMI - 150)) | (1L << (SETMINUS - 150)))) != 0) || _la==UNION || _la==USING) ) {
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CustomSqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(CustomSqlBaseParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(CustomSqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(CustomSqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(CustomSqlBaseParser.ANALYZE, 0); }
		public TerminalNode AND() { return getToken(CustomSqlBaseParser.AND, 0); }
		public TerminalNode ANY() { return getToken(CustomSqlBaseParser.ANY, 0); }
		public TerminalNode ARCHIVE() { return getToken(CustomSqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(CustomSqlBaseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(CustomSqlBaseParser.AS, 0); }
		public TerminalNode ASC() { return getToken(CustomSqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(CustomSqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(CustomSqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BETWEEN() { return getToken(CustomSqlBaseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(CustomSqlBaseParser.BOTH, 0); }
		public TerminalNode BUCKET() { return getToken(CustomSqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(CustomSqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(CustomSqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(CustomSqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(CustomSqlBaseParser.CASCADE, 0); }
		public TerminalNode CASE() { return getToken(CustomSqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(CustomSqlBaseParser.CAST, 0); }
		public TerminalNode CHANGE() { return getToken(CustomSqlBaseParser.CHANGE, 0); }
		public TerminalNode CHECK() { return getToken(CustomSqlBaseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(CustomSqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(CustomSqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(CustomSqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(CustomSqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLATE() { return getToken(CustomSqlBaseParser.COLLATE, 0); }
		public TerminalNode COLLECTION() { return getToken(CustomSqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMN() { return getToken(CustomSqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(CustomSqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(CustomSqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(CustomSqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(CustomSqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(CustomSqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(CustomSqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(CustomSqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(CustomSqlBaseParser.CONSTRAINT, 0); }
		public TerminalNode COST() { return getToken(CustomSqlBaseParser.COST, 0); }
		public TerminalNode CREATE() { return getToken(CustomSqlBaseParser.CREATE, 0); }
		public TerminalNode CUBE() { return getToken(CustomSqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(CustomSqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(CustomSqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(CustomSqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(CustomSqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(CustomSqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(CustomSqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(CustomSqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(CustomSqlBaseParser.DATABASES, 0); }
		public TerminalNode DAY() { return getToken(CustomSqlBaseParser.DAY, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(CustomSqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(CustomSqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(CustomSqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(CustomSqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(CustomSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(CustomSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(CustomSqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(CustomSqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(CustomSqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTINCT() { return getToken(CustomSqlBaseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(CustomSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(CustomSqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(CustomSqlBaseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(CustomSqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(CustomSqlBaseParser.END, 0); }
		public TerminalNode ESCAPE() { return getToken(CustomSqlBaseParser.ESCAPE, 0); }
		public TerminalNode ESCAPED() { return getToken(CustomSqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(CustomSqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(CustomSqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(CustomSqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(CustomSqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(CustomSqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(CustomSqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(CustomSqlBaseParser.EXTRACT, 0); }
		public TerminalNode FALSE() { return getToken(CustomSqlBaseParser.FALSE, 0); }
		public TerminalNode FETCH() { return getToken(CustomSqlBaseParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(CustomSqlBaseParser.FILTER, 0); }
		public TerminalNode FIELDS() { return getToken(CustomSqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(CustomSqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(CustomSqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(CustomSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FOR() { return getToken(CustomSqlBaseParser.FOR, 0); }
		public TerminalNode FOREIGN() { return getToken(CustomSqlBaseParser.FOREIGN, 0); }
		public TerminalNode FORMAT() { return getToken(CustomSqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(CustomSqlBaseParser.FORMATTED, 0); }
		public TerminalNode FROM() { return getToken(CustomSqlBaseParser.FROM, 0); }
		public TerminalNode FUNCTION() { return getToken(CustomSqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(CustomSqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(CustomSqlBaseParser.GLOBAL, 0); }
		public TerminalNode GRANT() { return getToken(CustomSqlBaseParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(CustomSqlBaseParser.GROUP, 0); }
		public TerminalNode GROUPING() { return getToken(CustomSqlBaseParser.GROUPING, 0); }
		public TerminalNode HAVING() { return getToken(CustomSqlBaseParser.HAVING, 0); }
		public TerminalNode IF() { return getToken(CustomSqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(CustomSqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(CustomSqlBaseParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(CustomSqlBaseParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(CustomSqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(CustomSqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(CustomSqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(CustomSqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(CustomSqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(CustomSqlBaseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(CustomSqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(CustomSqlBaseParser.IS, 0); }
		public TerminalNode ITEMS() { return getToken(CustomSqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(CustomSqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(CustomSqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(CustomSqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(CustomSqlBaseParser.LAZY, 0); }
		public TerminalNode LEADING() { return getToken(CustomSqlBaseParser.LEADING, 0); }
		public TerminalNode LIKE() { return getToken(CustomSqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(CustomSqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(CustomSqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(CustomSqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(CustomSqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(CustomSqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(CustomSqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(CustomSqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(CustomSqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(CustomSqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(CustomSqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(CustomSqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(CustomSqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(CustomSqlBaseParser.MERGE, 0); }
		public TerminalNode MONTH() { return getToken(CustomSqlBaseParser.MONTH, 0); }
		public TerminalNode MSCK() { return getToken(CustomSqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(CustomSqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(CustomSqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(CustomSqlBaseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(CustomSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(CustomSqlBaseParser.NULL, 0); }
		public TerminalNode NULLS() { return getToken(CustomSqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(CustomSqlBaseParser.OF, 0); }
		public TerminalNode ONLY() { return getToken(CustomSqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(CustomSqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(CustomSqlBaseParser.OPTIONS, 0); }
		public TerminalNode OR() { return getToken(CustomSqlBaseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(CustomSqlBaseParser.ORDER, 0); }
		public TerminalNode OUT() { return getToken(CustomSqlBaseParser.OUT, 0); }
		public TerminalNode OUTER() { return getToken(CustomSqlBaseParser.OUTER, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(CustomSqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(CustomSqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAPS() { return getToken(CustomSqlBaseParser.OVERLAPS, 0); }
		public TerminalNode OVERLAY() { return getToken(CustomSqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(CustomSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(CustomSqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(CustomSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(CustomSqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(CustomSqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(CustomSqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(CustomSqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(CustomSqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(CustomSqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIMARY() { return getToken(CustomSqlBaseParser.PRIMARY, 0); }
		public TerminalNode PRINCIPALS() { return getToken(CustomSqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(CustomSqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(CustomSqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(CustomSqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(CustomSqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(CustomSqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(CustomSqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(CustomSqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(CustomSqlBaseParser.REDUCE, 0); }
		public TerminalNode REFERENCES() { return getToken(CustomSqlBaseParser.REFERENCES, 0); }
		public TerminalNode REFRESH() { return getToken(CustomSqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(CustomSqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(CustomSqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(CustomSqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(CustomSqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(CustomSqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(CustomSqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(CustomSqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(CustomSqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(CustomSqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(CustomSqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(CustomSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(CustomSqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(CustomSqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(CustomSqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(CustomSqlBaseParser.SCHEMA, 0); }
		public TerminalNode SECOND() { return getToken(CustomSqlBaseParser.SECOND, 0); }
		public TerminalNode SELECT() { return getToken(CustomSqlBaseParser.SELECT, 0); }
		public TerminalNode SEPARATED() { return getToken(CustomSqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(CustomSqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(CustomSqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SESSION_USER() { return getToken(CustomSqlBaseParser.SESSION_USER, 0); }
		public TerminalNode SET() { return getToken(CustomSqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(CustomSqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(CustomSqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(CustomSqlBaseParser.SKEWED, 0); }
		public TerminalNode SOME() { return getToken(CustomSqlBaseParser.SOME, 0); }
		public TerminalNode SORT() { return getToken(CustomSqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(CustomSqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(CustomSqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(CustomSqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(CustomSqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(CustomSqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(CustomSqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(CustomSqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(CustomSqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(CustomSqlBaseParser.SYNC, 0); }
		public TerminalNode TABLE() { return getToken(CustomSqlBaseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(CustomSqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(CustomSqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(CustomSqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(CustomSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(CustomSqlBaseParser.TERMINATED, 0); }
		public TerminalNode THEN() { return getToken(CustomSqlBaseParser.THEN, 0); }
		public TerminalNode TIME() { return getToken(CustomSqlBaseParser.TIME, 0); }
		public TerminalNode TO() { return getToken(CustomSqlBaseParser.TO, 0); }
		public TerminalNode TOUCH() { return getToken(CustomSqlBaseParser.TOUCH, 0); }
		public TerminalNode TRAILING() { return getToken(CustomSqlBaseParser.TRAILING, 0); }
		public TerminalNode TRANSACTION() { return getToken(CustomSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(CustomSqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(CustomSqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(CustomSqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(CustomSqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(CustomSqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TRY_CAST() { return getToken(CustomSqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(CustomSqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(CustomSqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(CustomSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(CustomSqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNIQUE() { return getToken(CustomSqlBaseParser.UNIQUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(CustomSqlBaseParser.UNKNOWN, 0); }
		public TerminalNode UNLOCK() { return getToken(CustomSqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(CustomSqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(CustomSqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(CustomSqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(CustomSqlBaseParser.USER, 0); }
		public TerminalNode VALUES() { return getToken(CustomSqlBaseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(CustomSqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(CustomSqlBaseParser.VIEWS, 0); }
		public TerminalNode WHEN() { return getToken(CustomSqlBaseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(CustomSqlBaseParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(CustomSqlBaseParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(CustomSqlBaseParser.WITH, 0); }
		public TerminalNode YEAR() { return getToken(CustomSqlBaseParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(CustomSqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomSqlBaseListener ) ((CustomSqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomSqlBaseVisitor ) return ((CustomSqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2337);
			_la = _input.LA(1);
			if ( !(((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (ADD - 12)) | (1L << (AFTER - 12)) | (1L << (ALL - 12)) | (1L << (ALTER - 12)) | (1L << (ANALYZE - 12)) | (1L << (AND - 12)) | (1L << (ANY - 12)) | (1L << (ARCHIVE - 12)) | (1L << (ARRAY - 12)) | (1L << (AS - 12)) | (1L << (ASC - 12)) | (1L << (AT - 12)) | (1L << (AUTHORIZATION - 12)) | (1L << (BETWEEN - 12)) | (1L << (BOTH - 12)) | (1L << (BUCKET - 12)) | (1L << (BUCKETS - 12)) | (1L << (BY - 12)) | (1L << (CACHE - 12)) | (1L << (CASCADE - 12)) | (1L << (CASE - 12)) | (1L << (CAST - 12)) | (1L << (CHANGE - 12)) | (1L << (CHECK - 12)) | (1L << (CLEAR - 12)) | (1L << (CLUSTER - 12)) | (1L << (CLUSTERED - 12)) | (1L << (CODEGEN - 12)) | (1L << (COLLATE - 12)) | (1L << (COLLECTION - 12)) | (1L << (COLUMN - 12)) | (1L << (COLUMNS - 12)) | (1L << (COMMENT - 12)) | (1L << (COMMIT - 12)) | (1L << (COMPACT - 12)) | (1L << (COMPACTIONS - 12)) | (1L << (COMPUTE - 12)) | (1L << (CONCATENATE - 12)) | (1L << (CONSTRAINT - 12)) | (1L << (COST - 12)) | (1L << (CREATE - 12)) | (1L << (CUBE - 12)) | (1L << (CURRENT - 12)) | (1L << (CURRENT_DATE - 12)) | (1L << (CURRENT_TIME - 12)) | (1L << (CURRENT_TIMESTAMP - 12)) | (1L << (CURRENT_USER - 12)) | (1L << (DAY - 12)) | (1L << (DATA - 12)) | (1L << (DATABASE - 12)) | (1L << (DATABASES - 12)) | (1L << (DBPROPERTIES - 12)) | (1L << (DEFINED - 12)) | (1L << (DELETE - 12)) | (1L << (DELIMITED - 12)) | (1L << (DESC - 12)) | (1L << (DESCRIBE - 12)) | (1L << (DFS - 12)) | (1L << (DIRECTORIES - 12)) | (1L << (DIRECTORY - 12)) | (1L << (DISTINCT - 12)) | (1L << (DISTRIBUTE - 12)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (DIV - 76)) | (1L << (DROP - 76)) | (1L << (ELSE - 76)) | (1L << (END - 76)) | (1L << (ESCAPE - 76)) | (1L << (ESCAPED - 76)) | (1L << (EXCHANGE - 76)) | (1L << (EXISTS - 76)) | (1L << (EXPLAIN - 76)) | (1L << (EXPORT - 76)) | (1L << (EXTENDED - 76)) | (1L << (EXTERNAL - 76)) | (1L << (EXTRACT - 76)) | (1L << (FALSE - 76)) | (1L << (FETCH - 76)) | (1L << (FIELDS - 76)) | (1L << (FILTER - 76)) | (1L << (FILEFORMAT - 76)) | (1L << (FIRST - 76)) | (1L << (FOLLOWING - 76)) | (1L << (FOR - 76)) | (1L << (FOREIGN - 76)) | (1L << (FORMAT - 76)) | (1L << (FORMATTED - 76)) | (1L << (FROM - 76)) | (1L << (FUNCTION - 76)) | (1L << (FUNCTIONS - 76)) | (1L << (GLOBAL - 76)) | (1L << (GRANT - 76)) | (1L << (GROUP - 76)) | (1L << (GROUPING - 76)) | (1L << (HAVING - 76)) | (1L << (IF - 76)) | (1L << (IGNORE - 76)) | (1L << (IMPORT - 76)) | (1L << (IN - 76)) | (1L << (INDEX - 76)) | (1L << (INDEXES - 76)) | (1L << (INPATH - 76)) | (1L << (INPUTFORMAT - 76)) | (1L << (INSERT - 76)) | (1L << (INTERVAL - 76)) | (1L << (INTO - 76)) | (1L << (IS - 76)) | (1L << (ITEMS - 76)) | (1L << (KEYS - 76)) | (1L << (LAST - 76)) | (1L << (LATERAL - 76)) | (1L << (LAZY - 76)) | (1L << (LEADING - 76)) | (1L << (LIKE - 76)) | (1L << (LIMIT - 76)) | (1L << (LINES - 76)) | (1L << (LIST - 76)) | (1L << (LOAD - 76)) | (1L << (LOCAL - 76)) | (1L << (LOCATION - 76)) | (1L << (LOCK - 76)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (LOCKS - 140)) | (1L << (LOGICAL - 140)) | (1L << (MACRO - 140)) | (1L << (MAP - 140)) | (1L << (MATCHED - 140)) | (1L << (MERGE - 140)) | (1L << (MONTH - 140)) | (1L << (MSCK - 140)) | (1L << (NAMESPACE - 140)) | (1L << (NAMESPACES - 140)) | (1L << (NO - 140)) | (1L << (NOT - 140)) | (1L << (NULL - 140)) | (1L << (NULLS - 140)) | (1L << (OF - 140)) | (1L << (ONLY - 140)) | (1L << (OPTION - 140)) | (1L << (OPTIONS - 140)) | (1L << (OR - 140)) | (1L << (ORDER - 140)) | (1L << (OUT - 140)) | (1L << (OUTER - 140)) | (1L << (OUTPUTFORMAT - 140)) | (1L << (OVER - 140)) | (1L << (OVERLAPS - 140)) | (1L << (OVERLAY - 140)) | (1L << (OVERWRITE - 140)) | (1L << (PARTITION - 140)) | (1L << (PARTITIONED - 140)) | (1L << (PARTITIONS - 140)) | (1L << (PERCENTLIT - 140)) | (1L << (PIVOT - 140)) | (1L << (PLACING - 140)) | (1L << (POSITION - 140)) | (1L << (PRECEDING - 140)) | (1L << (PRIMARY - 140)) | (1L << (PRINCIPALS - 140)) | (1L << (PROPERTIES - 140)) | (1L << (PURGE - 140)) | (1L << (QUERY - 140)) | (1L << (RANGE - 140)) | (1L << (RECORDREADER - 140)) | (1L << (RECORDWRITER - 140)) | (1L << (RECOVER - 140)) | (1L << (REDUCE - 140)) | (1L << (REFERENCES - 140)) | (1L << (REFRESH - 140)) | (1L << (RENAME - 140)) | (1L << (REPAIR - 140)) | (1L << (REPLACE - 140)) | (1L << (RESET - 140)) | (1L << (RESPECT - 140)) | (1L << (RESTRICT - 140)) | (1L << (REVOKE - 140)) | (1L << (RLIKE - 140)) | (1L << (ROLE - 140)) | (1L << (ROLES - 140)) | (1L << (ROLLBACK - 140)) | (1L << (ROLLUP - 140)) | (1L << (ROW - 140)) | (1L << (ROWS - 140)))) != 0) || ((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (SECOND - 204)) | (1L << (SCHEMA - 204)) | (1L << (SELECT - 204)) | (1L << (SEPARATED - 204)) | (1L << (SERDE - 204)) | (1L << (SERDEPROPERTIES - 204)) | (1L << (SESSION_USER - 204)) | (1L << (SET - 204)) | (1L << (SETS - 204)) | (1L << (SHOW - 204)) | (1L << (SKEWED - 204)) | (1L << (SOME - 204)) | (1L << (SORT - 204)) | (1L << (SORTED - 204)) | (1L << (START - 204)) | (1L << (STATISTICS - 204)) | (1L << (STORED - 204)) | (1L << (STRATIFY - 204)) | (1L << (STRUCT - 204)) | (1L << (SUBSTR - 204)) | (1L << (SUBSTRING - 204)) | (1L << (SYNC - 204)) | (1L << (TABLE - 204)) | (1L << (TABLES - 204)) | (1L << (TABLESAMPLE - 204)) | (1L << (TBLPROPERTIES - 204)) | (1L << (TEMPORARY - 204)) | (1L << (TERMINATED - 204)) | (1L << (THEN - 204)) | (1L << (TIME - 204)) | (1L << (TO - 204)) | (1L << (TOUCH - 204)) | (1L << (TRAILING - 204)) | (1L << (TRANSACTION - 204)) | (1L << (TRANSACTIONS - 204)) | (1L << (TRANSFORM - 204)) | (1L << (TRIM - 204)) | (1L << (TRUE - 204)) | (1L << (TRUNCATE - 204)) | (1L << (TRY_CAST - 204)) | (1L << (TYPE - 204)) | (1L << (UNARCHIVE - 204)) | (1L << (UNBOUNDED - 204)) | (1L << (UNCACHE - 204)) | (1L << (UNIQUE - 204)) | (1L << (UNKNOWN - 204)) | (1L << (UNLOCK - 204)) | (1L << (UNSET - 204)) | (1L << (UPDATE - 204)) | (1L << (USE - 204)) | (1L << (USER - 204)) | (1L << (VALUES - 204)) | (1L << (VIEW - 204)) | (1L << (VIEWS - 204)) | (1L << (WHEN - 204)) | (1L << (WHERE - 204)) | (1L << (WINDOW - 204)) | (1L << (WITH - 204)) | (1L << (YEAR - 204)) | (1L << (ZONE - 204)))) != 0)) ) {
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
		case 35:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 94:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 96:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 97:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 128:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 129:
			return strictIdentifier_sempred((StrictIdentifierContext)_localctx, predIndex);
		case 131:
			return number_sempred((NumberContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return legacy_setops_precedence_enabled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !legacy_setops_precedence_enabled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !legacy_setops_precedence_enabled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 8);
		case 15:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean strictIdentifier_sempred(StrictIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return SQL_standard_keyword_behavior;
		case 18:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean number_sempred(NumberContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 20:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 21:
			return legacy_exponent_literal_as_decimal_enabled;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u012f\u0926\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u0125\n\6\3\6\3\6\5\6\u0129\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u0130\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01a4\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u01ac\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01b4\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u01bd\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01c7"+
		"\n\6\3\7\3\7\5\7\u01cb\n\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u01d7\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u01e3\n\t\3\t\3"+
		"\t\3\t\5\t\u01e8\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\5\f\u01f1\n\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\5\r\u01f9\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u0200\n\r\5"+
		"\r\u0202\n\r\3\r\5\r\u0205\n\r\3\r\3\r\3\r\5\r\u020a\n\r\3\r\3\r\5\r\u020e"+
		"\n\r\3\r\3\r\3\r\5\r\u0213\n\r\3\r\5\r\u0216\n\r\3\r\3\r\3\r\5\r\u021b"+
		"\n\r\3\r\3\r\3\r\5\r\u0220\n\r\3\r\5\r\u0223\n\r\3\r\3\r\3\r\5\r\u0228"+
		"\n\r\3\r\3\r\5\r\u022c\n\r\3\r\3\r\3\r\5\r\u0231\n\r\5\r\u0233\n\r\3\16"+
		"\3\16\5\16\u0237\n\16\3\17\3\17\3\17\3\17\3\17\7\17\u023e\n\17\f\17\16"+
		"\17\u0241\13\17\3\17\3\17\3\20\3\20\3\20\5\20\u0248\n\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0251\n\22\3\23\3\23\3\23\7\23\u0256\n\23\f"+
		"\23\16\23\u0259\13\23\3\24\3\24\3\24\3\24\7\24\u025f\n\24\f\24\16\24\u0262"+
		"\13\24\3\25\3\25\5\25\u0266\n\25\3\25\5\25\u0269\n\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\7\27\u027f\n\27\f\27\16\27\u0282\13\27\3\30\3\30\3\30\3"+
		"\30\7\30\u0288\n\30\f\30\16\30\u028b\13\30\3\30\3\30\3\31\3\31\5\31\u0291"+
		"\n\31\3\31\5\31\u0294\n\31\3\32\3\32\3\32\7\32\u0299\n\32\f\32\16\32\u029c"+
		"\13\32\3\32\5\32\u029f\n\32\3\33\3\33\3\33\3\33\5\33\u02a5\n\33\3\34\3"+
		"\34\3\34\3\34\7\34\u02ab\n\34\f\34\16\34\u02ae\13\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\7\35\u02b6\n\35\f\35\16\35\u02b9\13\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u02c3\n\36\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u02ca\n\37\3 \3 \3 \3 \5 \u02d0\n \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\6"+
		"\"\u02db\n\"\r\"\16\"\u02dc\3\"\3\"\3\"\3\"\3\"\5\"\u02e4\n\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u02eb\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u02f7\n\"\3\"\3\"\3\"\3\"\7\"\u02fd\n\"\f\"\16\"\u0300\13\"\3\"\7\"\u0303"+
		"\n\"\f\"\16\"\u0306\13\"\5\"\u0308\n\"\3#\3#\3#\3#\3#\7#\u030f\n#\f#\16"+
		"#\u0312\13#\5#\u0314\n#\3#\3#\3#\3#\3#\7#\u031b\n#\f#\16#\u031e\13#\5"+
		"#\u0320\n#\3#\3#\3#\3#\3#\7#\u0327\n#\f#\16#\u032a\13#\5#\u032c\n#\3#"+
		"\3#\3#\3#\3#\7#\u0333\n#\f#\16#\u0336\13#\5#\u0338\n#\3#\5#\u033b\n#\3"+
		"#\3#\3#\5#\u0340\n#\5#\u0342\n#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\5%\u034e"+
		"\n%\3%\3%\3%\3%\3%\5%\u0355\n%\3%\3%\3%\3%\3%\5%\u035c\n%\3%\7%\u035f"+
		"\n%\f%\16%\u0362\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u036d\n&\3\'\3\'\5"+
		"\'\u0371\n\'\3\'\3\'\5\'\u0375\n\'\3(\3(\6(\u0379\n(\r(\16(\u037a\3)\3"+
		")\5)\u037f\n)\3)\3)\3)\3)\7)\u0385\n)\f)\16)\u0388\13)\3)\5)\u038b\n)"+
		"\3)\5)\u038e\n)\3)\5)\u0391\n)\3)\5)\u0394\n)\3)\3)\5)\u0398\n)\3*\3*"+
		"\5*\u039c\n*\3*\7*\u039f\n*\f*\16*\u03a2\13*\3*\5*\u03a5\n*\3*\5*\u03a8"+
		"\n*\3*\5*\u03ab\n*\3*\5*\u03ae\n*\3*\3*\5*\u03b2\n*\3*\7*\u03b5\n*\f*"+
		"\16*\u03b8\13*\3*\5*\u03bb\n*\3*\5*\u03be\n*\3*\5*\u03c1\n*\3*\5*\u03c4"+
		"\n*\5*\u03c6\n*\3+\3+\3+\3+\5+\u03cc\n+\3+\3+\3+\3+\3+\5+\u03d3\n+\3+"+
		"\3+\3+\5+\u03d8\n+\3+\5+\u03db\n+\3+\5+\u03de\n+\3+\3+\5+\u03e2\n+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\5+\u03ec\n+\3+\3+\5+\u03f0\n+\5+\u03f2\n+\3+\5+"+
		"\u03f5\n+\3+\3+\5+\u03f9\n+\3,\3,\7,\u03fd\n,\f,\16,\u0400\13,\3,\5,\u0403"+
		"\n,\3,\3,\3-\3-\3-\3.\3.\3.\3.\5.\u040e\n.\3.\3.\3.\3/\3/\3/\3/\3/\5/"+
		"\u0418\n/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0424\n\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0431\n\61"+
		"\f\61\16\61\u0434\13\61\3\61\3\61\5\61\u0438\n\61\3\62\3\62\3\62\7\62"+
		"\u043d\n\62\f\62\16\62\u0440\13\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\5\66\u044f\n\66\3\66\7\66\u0452\n\66\f"+
		"\66\16\66\u0455\13\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u045f"+
		"\n\67\f\67\16\67\u0462\13\67\3\67\3\67\5\67\u0466\n\67\38\38\38\38\78"+
		"\u046c\n8\f8\168\u046f\138\38\78\u0472\n8\f8\168\u0475\138\38\58\u0478"+
		"\n8\39\39\39\39\39\79\u047f\n9\f9\169\u0482\139\39\39\39\39\39\79\u0489"+
		"\n9\f9\169\u048c\139\39\39\39\39\39\39\39\39\39\39\79\u0498\n9\f9\169"+
		"\u049b\139\39\39\59\u049f\n9\59\u04a1\n9\3:\3:\5:\u04a5\n:\3;\3;\3;\3"+
		";\3;\7;\u04ac\n;\f;\16;\u04af\13;\3;\3;\3;\3;\3;\3;\3;\3;\7;\u04b9\n;"+
		"\f;\16;\u04bc\13;\3;\3;\5;\u04c0\n;\3<\3<\5<\u04c4\n<\3=\3=\3=\3=\7=\u04ca"+
		"\n=\f=\16=\u04cd\13=\5=\u04cf\n=\3=\3=\5=\u04d3\n=\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3>\7>\u04df\n>\f>\16>\u04e2\13>\3>\3>\3>\3?\3?\3?\3?\3?\7?\u04ec"+
		"\n?\f?\16?\u04ef\13?\3?\3?\5?\u04f3\n?\3@\3@\5@\u04f7\n@\3@\5@\u04fa\n"+
		"@\3A\3A\3A\5A\u04ff\nA\3A\3A\3A\3A\3A\7A\u0506\nA\fA\16A\u0509\13A\5A"+
		"\u050b\nA\3A\3A\3A\5A\u0510\nA\3A\3A\3A\7A\u0515\nA\fA\16A\u0518\13A\5"+
		"A\u051a\nA\3B\3B\3C\3C\7C\u0520\nC\fC\16C\u0523\13C\3D\3D\3D\3D\5D\u0529"+
		"\nD\3D\3D\3D\3D\3D\5D\u0530\nD\3E\5E\u0533\nE\3E\3E\3E\5E\u0538\nE\3E"+
		"\5E\u053b\nE\3E\3E\3E\5E\u0540\nE\3E\3E\5E\u0544\nE\3E\5E\u0547\nE\3E"+
		"\5E\u054a\nE\3F\3F\3F\3F\5F\u0550\nF\3G\3G\3G\5G\u0555\nG\3G\3G\3H\5H"+
		"\u055a\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u056c\nH"+
		"\5H\u056e\nH\3H\5H\u0571\nH\3I\3I\3I\3I\3J\3J\3J\7J\u057a\nJ\fJ\16J\u057d"+
		"\13J\3K\3K\3K\3K\7K\u0583\nK\fK\16K\u0586\13K\3K\3K\3L\3L\5L\u058c\nL"+
		"\3M\3M\3M\3M\7M\u0592\nM\fM\16M\u0595\13M\3M\3M\3N\3N\5N\u059b\nN\3O\3"+
		"O\5O\u059f\nO\3O\3O\3O\3O\3O\3O\5O\u05a7\nO\3O\3O\3O\3O\3O\3O\5O\u05af"+
		"\nO\3O\3O\3O\3O\5O\u05b5\nO\3P\3P\3P\3P\7P\u05bb\nP\fP\16P\u05be\13P\3"+
		"P\3P\3Q\3Q\3Q\3Q\3Q\7Q\u05c7\nQ\fQ\16Q\u05ca\13Q\5Q\u05cc\nQ\3Q\3Q\3Q"+
		"\3R\5R\u05d2\nR\3R\3R\5R\u05d6\nR\5R\u05d8\nR\3S\3S\3S\3S\3S\3S\3S\5S"+
		"\u05e1\nS\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u05ed\nS\5S\u05ef\nS\3S\3S"+
		"\3S\3S\3S\5S\u05f6\nS\3S\3S\3S\3S\3S\5S\u05fd\nS\3S\3S\3S\3S\5S\u0603"+
		"\nS\3S\3S\3S\3S\5S\u0609\nS\5S\u060b\nS\3T\3T\3T\7T\u0610\nT\fT\16T\u0613"+
		"\13T\3U\3U\3U\7U\u0618\nU\fU\16U\u061b\13U\3V\3V\3V\5V\u0620\nV\3V\3V"+
		"\3W\3W\3W\5W\u0627\nW\3W\3W\3X\3X\5X\u062d\nX\3X\3X\5X\u0631\nX\5X\u0633"+
		"\nX\3Y\3Y\3Y\7Y\u0638\nY\fY\16Y\u063b\13Y\3Z\3Z\3Z\3Z\7Z\u0641\nZ\fZ\16"+
		"Z\u0644\13Z\3Z\3Z\3[\3[\5[\u064a\n[\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u0652"+
		"\n\\\f\\\16\\\u0655\13\\\3\\\3\\\5\\\u0659\n\\\3]\3]\5]\u065d\n]\3^\3"+
		"^\3_\3_\3_\7_\u0664\n_\f_\16_\u0667\13_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\5`\u0673\n`\5`\u0675\n`\3`\3`\3`\3`\3`\3`\7`\u067d\n`\f`\16`\u0680\13"+
		"`\3a\5a\u0683\na\3a\3a\3a\3a\3a\3a\5a\u068b\na\3a\3a\3a\3a\3a\7a\u0692"+
		"\na\fa\16a\u0695\13a\3a\3a\3a\5a\u069a\na\3a\3a\3a\3a\3a\3a\5a\u06a2\n"+
		"a\3a\3a\3a\5a\u06a7\na\3a\3a\3a\3a\3a\3a\3a\3a\7a\u06b1\na\fa\16a\u06b4"+
		"\13a\3a\3a\5a\u06b8\na\3a\5a\u06bb\na\3a\3a\3a\3a\5a\u06c1\na\3a\3a\5"+
		"a\u06c5\na\3a\3a\3a\5a\u06ca\na\3a\3a\3a\5a\u06cf\na\3a\3a\3a\5a\u06d4"+
		"\na\3b\3b\3b\3b\5b\u06da\nb\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b"+
		"\3b\3b\3b\3b\3b\7b\u06ef\nb\fb\16b\u06f2\13b\3c\3c\3c\3c\6c\u06f8\nc\r"+
		"c\16c\u06f9\3c\3c\5c\u06fe\nc\3c\3c\3c\3c\3c\6c\u0705\nc\rc\16c\u0706"+
		"\3c\3c\5c\u070b\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\7c\u071b"+
		"\nc\fc\16c\u071e\13c\5c\u0720\nc\3c\3c\3c\3c\3c\3c\5c\u0728\nc\3c\3c\3"+
		"c\3c\3c\3c\3c\5c\u0731\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\6c\u0746\nc\rc\16c\u0747\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0753"+
		"\nc\3c\3c\3c\7c\u0758\nc\fc\16c\u075b\13c\5c\u075d\nc\3c\3c\3c\3c\3c\3"+
		"c\3c\5c\u0766\nc\3c\3c\5c\u076a\nc\3c\3c\5c\u076e\nc\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\6c\u0778\nc\rc\16c\u0779\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0793\nc\3c\3c\3c\3c\3c\5c\u079a\n"+
		"c\3c\5c\u079d\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u07ac\nc\3"+
		"c\3c\5c\u07b0\nc\3c\3c\3c\3c\3c\3c\3c\3c\7c\u07ba\nc\fc\16c\u07bd\13c"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\6d\u07c7\nd\rd\16d\u07c8\5d\u07cb\nd\3e\3e\3"+
		"f\3f\3g\3g\3h\3h\3i\3i\3i\5i\u07d8\ni\3j\3j\5j\u07dc\nj\3k\3k\3k\6k\u07e1"+
		"\nk\rk\16k\u07e2\3l\3l\3l\5l\u07e8\nl\3m\3m\3m\3m\3m\3n\5n\u07f0\nn\3"+
		"n\3n\3o\3o\3o\5o\u07f7\no\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3"+
		"p\5p\u0808\np\3p\3p\5p\u080c\np\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3"+
		"p\7p\u081b\np\fp\16p\u081e\13p\3p\5p\u0821\np\5p\u0823\np\3q\3q\3q\7q"+
		"\u0828\nq\fq\16q\u082b\13q\3r\3r\3r\3r\5r\u0831\nr\3r\5r\u0834\nr\3r\5"+
		"r\u0837\nr\3s\3s\3s\7s\u083c\ns\fs\16s\u083f\13s\3t\3t\3t\3t\5t\u0845"+
		"\nt\3t\5t\u0848\nt\3u\3u\3u\7u\u084d\nu\fu\16u\u0850\13u\3v\3v\3v\3v\3"+
		"v\5v\u0857\nv\3v\5v\u085a\nv\3w\3w\3w\3w\3w\3x\3x\3x\3x\7x\u0865\nx\f"+
		"x\16x\u0868\13x\3y\3y\3y\3y\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\7z\u0879"+
		"\nz\fz\16z\u087c\13z\3z\3z\3z\3z\3z\7z\u0883\nz\fz\16z\u0886\13z\5z\u0888"+
		"\nz\3z\3z\3z\3z\3z\7z\u088f\nz\fz\16z\u0892\13z\5z\u0894\nz\5z\u0896\n"+
		"z\3z\5z\u0899\nz\3z\5z\u089c\nz\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3"+
		"{\3{\3{\3{\5{\u08ae\n{\3|\3|\3|\3|\3|\3|\3|\5|\u08b7\n|\3}\3}\3}\7}\u08bc"+
		"\n}\f}\16}\u08bf\13}\3~\3~\3~\3~\5~\u08c5\n~\3\177\3\177\3\177\7\177\u08ca"+
		"\n\177\f\177\16\177\u08cd\13\177\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\6\u0081\u08d4\n\u0081\r\u0081\16\u0081\u08d5\3\u0081\5\u0081\u08d9\n"+
		"\u0081\3\u0082\3\u0082\3\u0082\5\u0082\u08de\n\u0082\3\u0083\3\u0083\3"+
		"\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u08e6\n\u0083\3\u0084\3\u0084\3"+
		"\u0085\3\u0085\5\u0085\u08ec\n\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u08f1"+
		"\n\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u08f6\n\u0085\3\u0085\3\u0085"+
		"\5\u0085\u08fa\n\u0085\3\u0085\3\u0085\5\u0085\u08fe\n\u0085\3\u0085\3"+
		"\u0085\5\u0085\u0902\n\u0085\3\u0085\3\u0085\5\u0085\u0906\n\u0085\3\u0085"+
		"\3\u0085\5\u0085\u090a\n\u0085\3\u0085\3\u0085\5\u0085\u090e\n\u0085\3"+
		"\u0085\3\u0085\5\u0085\u0912\n\u0085\3\u0085\5\u0085\u0915\n\u0085\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u091e\n\u0086"+
		"\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\2\6H\u00be\u00c2"+
		"\u00c4\u008a\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\2$\5\2AA\u0096\u0096"+
		"\u00cf\u00cf\6\2TTzz\u00d7\u00d7\u00fc\u00fc\5\2TT\u00d7\u00d7\u00fc\u00fc"+
		"\4\2\31\31GG\4\2aa\u0081\u0081\4\299\u00cb\u00cb\4\2\20\20LL\4\2\u0124"+
		"\u0124\u0126\u0126\5\2\20\20\25\25\u00db\u00db\5\2\\\\\u00f5\u00f5\u00fe"+
		"\u00fe\4\2\u0116\u0117\u011b\u011b\4\2NN\u0118\u011a\4\2\u0116\u0117\u011e"+
		"\u011e\4\2;;==\4\2$$\u00f7\u00f7\4\2qq\u00c3\u00c3\3\2\u00e3\u00e4\4\2"+
		"\4\4gg\4\2\4\4cc\5\2\35\35\u0084\u0084\u00f0\u00f0\3\2\u010e\u0115\4\2"+
		"NN\u0116\u011f\6\2\23\23ss\u009a\u009a\u00a2\u00a2\4\2\\\\\u00f5\u00f5"+
		"\3\2\u0116\u0117\5\2\u0120\u0120\u0124\u0124\u0126\u0126\4\2MM\u00ab\u00ab"+
		"\4\2\u00a3\u00a3\u00dc\u00dc\4\2bb\u00b2\u00b2\3\2\u0125\u0126\4\2OO\u00d6"+
		"\u00d6\62\2\16\17\21\22\24\24\26\27\31\32\34\34\36\"%%\'*,,.\64\66\66"+
		"9:?KMOSSU[^^`befiknnprtuwy{{~~\u0080\u0083\u0086\u0097\u0099\u0099\u009c"+
		"\u009d\u00a0\u00a1\u00a4\u00a4\u00a6\u00a7\u00a9\u00b2\u00b4\u00bc\u00be"+
		"\u00c5\u00c7\u00cf\u00d1\u00d4\u00d6\u00da\u00dc\u00e5\u00e7\u00eb\u00ef"+
		"\u00ef\u00f1\u00fb\u00ff\u0102\u0105\u0107\u010a\u010a\u010c\u010d\21"+
		"\2\24\2488TThhvvzz\177\177\u0085\u0085\u0098\u0098\u009e\u009e\u00c6\u00c6"+
		"\u00d1\u00d1\u00d7\u00d7\u00fc\u00fc\u0104\u0104\22\2\16\23\25\679SUg"+
		"iuwy{~\u0080\u0084\u0086\u0097\u0099\u009d\u009f\u00c5\u00c7\u00d0\u00d2"+
		"\u00d6\u00d8\u00fb\u00fd\u0103\u0105\u010d\2\u0a4f\2\u0112\3\2\2\2\4\u0115"+
		"\3\2\2\2\6\u011a\3\2\2\2\b\u011c\3\2\2\2\n\u01c6\3\2\2\2\f\u01ca\3\2\2"+
		"\2\16\u01d0\3\2\2\2\20\u01dc\3\2\2\2\22\u01e9\3\2\2\2\24\u01ec\3\2\2\2"+
		"\26\u01f0\3\2\2\2\30\u0232\3\2\2\2\32\u0234\3\2\2\2\34\u0238\3\2\2\2\36"+
		"\u0244\3\2\2\2 \u0249\3\2\2\2\"\u0250\3\2\2\2$\u0252\3\2\2\2&\u025a\3"+
		"\2\2\2(\u0263\3\2\2\2*\u026e\3\2\2\2,\u0280\3\2\2\2.\u0283\3\2\2\2\60"+
		"\u028e\3\2\2\2\62\u029e\3\2\2\2\64\u02a4\3\2\2\2\66\u02a6\3\2\2\28\u02b1"+
		"\3\2\2\2:\u02c2\3\2\2\2<\u02c9\3\2\2\2>\u02cb\3\2\2\2@\u02d1\3\2\2\2B"+
		"\u0307\3\2\2\2D\u0313\3\2\2\2F\u0343\3\2\2\2H\u0346\3\2\2\2J\u036c\3\2"+
		"\2\2L\u036e\3\2\2\2N\u0376\3\2\2\2P\u0397\3\2\2\2R\u03c5\3\2\2\2T\u03da"+
		"\3\2\2\2V\u03fa\3\2\2\2X\u0406\3\2\2\2Z\u0409\3\2\2\2\\\u0412\3\2\2\2"+
		"^\u0423\3\2\2\2`\u0437\3\2\2\2b\u0439\3\2\2\2d\u0441\3\2\2\2f\u0445\3"+
		"\2\2\2h\u0448\3\2\2\2j\u044b\3\2\2\2l\u0465\3\2\2\2n\u0467\3\2\2\2p\u04a0"+
		"\3\2\2\2r\u04a4\3\2\2\2t\u04bf\3\2\2\2v\u04c3\3\2\2\2x\u04d2\3\2\2\2z"+
		"\u04d4\3\2\2\2|\u04f2\3\2\2\2~\u04f4\3\2\2\2\u0080\u04fb\3\2\2\2\u0082"+
		"\u051b\3\2\2\2\u0084\u051d\3\2\2\2\u0086\u052f\3\2\2\2\u0088\u0549\3\2"+
		"\2\2\u008a\u054f\3\2\2\2\u008c\u0551\3\2\2\2\u008e\u0570\3\2\2\2\u0090"+
		"\u0572\3\2\2\2\u0092\u0576\3\2\2\2\u0094\u057e\3\2\2\2\u0096\u0589\3\2"+
		"\2\2\u0098\u058d\3\2\2\2\u009a\u0598\3\2\2\2\u009c\u05b4\3\2\2\2\u009e"+
		"\u05b6\3\2\2\2\u00a0\u05c1\3\2\2\2\u00a2\u05d7\3\2\2\2\u00a4\u060a\3\2"+
		"\2\2\u00a6\u060c\3\2\2\2\u00a8\u0614\3\2\2\2\u00aa\u061f\3\2\2\2\u00ac"+
		"\u0626\3\2\2\2\u00ae\u062a\3\2\2\2\u00b0\u0634\3\2\2\2\u00b2\u063c\3\2"+
		"\2\2\u00b4\u0649\3\2\2\2\u00b6\u0658\3\2\2\2\u00b8\u065c\3\2\2\2\u00ba"+
		"\u065e\3\2\2\2\u00bc\u0660\3\2\2\2\u00be\u0674\3\2\2\2\u00c0\u06d3\3\2"+
		"\2\2\u00c2\u06d9\3\2\2\2\u00c4\u07af\3\2\2\2\u00c6\u07ca\3\2\2\2\u00c8"+
		"\u07cc\3\2\2\2\u00ca\u07ce\3\2\2\2\u00cc\u07d0\3\2\2\2\u00ce\u07d2\3\2"+
		"\2\2\u00d0\u07d4\3\2\2\2\u00d2\u07d9\3\2\2\2\u00d4\u07e0\3\2\2\2\u00d6"+
		"\u07e4\3\2\2\2\u00d8\u07e9\3\2\2\2\u00da\u07ef\3\2\2\2\u00dc\u07f6\3\2"+
		"\2\2\u00de\u0822\3\2\2\2\u00e0\u0824\3\2\2\2\u00e2\u082c\3\2\2\2\u00e4"+
		"\u0838\3\2\2\2\u00e6\u0840\3\2\2\2\u00e8\u0849\3\2\2\2\u00ea\u0851\3\2"+
		"\2\2\u00ec\u085b\3\2\2\2\u00ee\u0860\3\2\2\2\u00f0\u0869\3\2\2\2\u00f2"+
		"\u089b\3\2\2\2\u00f4\u08ad\3\2\2\2\u00f6\u08b6\3\2\2\2\u00f8\u08b8\3\2"+
		"\2\2\u00fa\u08c4\3\2\2\2\u00fc\u08c6\3\2\2\2\u00fe\u08ce\3\2\2\2\u0100"+
		"\u08d8\3\2\2\2\u0102\u08dd\3\2\2\2\u0104\u08e5\3\2\2\2\u0106\u08e7\3\2"+
		"\2\2\u0108\u0914\3\2\2\2\u010a\u091d\3\2\2\2\u010c\u091f\3\2\2\2\u010e"+
		"\u0921\3\2\2\2\u0110\u0923\3\2\2\2\u0112\u0113\5\4\3\2\u0113\u0114\7\2"+
		"\2\3\u0114\3\3\2\2\2\u0115\u0116\7\r\2\2\u0116\u0117\5\u00c6d\2\u0117"+
		"\u0118\7\u00ee\2\2\u0118\u0119\5\u00c6d\2\u0119\5\3\2\2\2\u011a\u011b"+
		"\5\u0106\u0084\2\u011b\7\3\2\2\2\u011c\u011d\5\u0106\u0084\2\u011d\t\3"+
		"\2\2\2\u011e\u011f\7\67\2\2\u011f\u01c7\7\u00c8\2\2\u0120\u0121\7O\2\2"+
		"\u0121\u01c7\7\u00c8\2\2\u0122\u0124\7l\2\2\u0123\u0125\7\u00c8\2\2\u0124"+
		"\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u01c7\3\2\2\2\u0126\u0128\7\u00c5"+
		"\2\2\u0127\u0129\7\u00c8\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u01c7\3\2\2\2\u012a\u012b\7\u00d9\2\2\u012b\u01c7\7l\2\2\u012c\u012d"+
		"\7\u00d9\2\2\u012d\u012f\7\u00c8\2\2\u012e\u0130\7l\2\2\u012f\u012e\3"+
		"\2\2\2\u012f\u0130\3\2\2\2\u0130\u01c7\3\2\2\2\u0131\u0132\7\u00d9\2\2"+
		"\u0132\u01c7\7\u00b4\2\2\u0133\u0134\7\u00d9\2\2\u0134\u01c7\7\u00c9\2"+
		"\2\u0135\u0136\7\u00d9\2\2\u0136\u0137\7:\2\2\u0137\u01c7\7\u00c9\2\2"+
		"\u0138\u0139\7X\2\2\u0139\u01c7\7\u00e6\2\2\u013a\u013b\7r\2\2\u013b\u01c7"+
		"\7\u00e6\2\2\u013c\u013d\7\u00d9\2\2\u013d\u01c7\7\62\2\2\u013e\u013f"+
		"\7\u00d9\2\2\u013f\u0140\7\67\2\2\u0140\u01c7\7\u00e6\2\2\u0141\u0142"+
		"\7\u00d9\2\2\u0142\u01c7\7\u00f2\2\2\u0143\u0144\7\u00d9\2\2\u0144\u01c7"+
		"\7u\2\2\u0145\u0146\7\u00d9\2\2\u0146\u01c7\7\u008e\2\2\u0147\u0148\7"+
		"\67\2\2\u0148\u01c7\7t\2\2\u0149\u014a\7O\2\2\u014a\u01c7\7t\2\2\u014b"+
		"\u014c\7\21\2\2\u014c\u01c7\7t\2\2\u014d\u014e\7\u008d\2\2\u014e\u01c7"+
		"\7\u00e6\2\2\u014f\u0150\7\u008d\2\2\u0150\u01c7\7A\2\2\u0151\u0152\7"+
		"\u00ff\2\2\u0152\u01c7\7\u00e6\2\2\u0153\u0154\7\u00ff\2\2\u0154\u01c7"+
		"\7A\2\2\u0155\u0156\7\67\2\2\u0156\u0157\7\u00ea\2\2\u0157\u01c7\7\u0090"+
		"\2\2\u0158\u0159\7O\2\2\u0159\u015a\7\u00ea\2\2\u015a\u01c7\7\u0090\2"+
		"\2\u015b\u015c\7\21\2\2\u015c\u015d\7\u00e6\2\2\u015d\u015e\5\u00aaV\2"+
		"\u015e\u015f\7\u009a\2\2\u015f\u0160\7)\2\2\u0160\u01c7\3\2\2\2\u0161"+
		"\u0162\7\21\2\2\u0162\u0163\7\u00e6\2\2\u0163\u0164\5\u00aaV\2\u0164\u0165"+
		"\7)\2\2\u0165\u0166\7 \2\2\u0166\u01c7\3\2\2\2\u0167\u0168\7\21\2\2\u0168"+
		"\u0169\7\u00e6\2\2\u0169\u016a\5\u00aaV\2\u016a\u016b\7\u009a\2\2\u016b"+
		"\u016c\7\u00dd\2\2\u016c\u01c7\3\2\2\2\u016d\u016e\7\21\2\2\u016e\u016f"+
		"\7\u00e6\2\2\u016f\u0170\5\u00aaV\2\u0170\u0171\7\u00da\2\2\u0171\u0172"+
		"\7 \2\2\u0172\u01c7\3\2\2\2\u0173\u0174\7\21\2\2\u0174\u0175\7\u00e6\2"+
		"\2\u0175\u0176\5\u00aaV\2\u0176\u0177\7\u009a\2\2\u0177\u0178\7\u00da"+
		"\2\2\u0178\u01c7\3\2\2\2\u0179\u017a\7\21\2\2\u017a\u017b\7\u00e6\2\2"+
		"\u017b\u017c\5\u00aaV\2\u017c\u017d\7\u009a\2\2\u017d\u017e\7\u00e0\2"+
		"\2\u017e\u017f\7\30\2\2\u017f\u0180\7J\2\2\u0180\u01c7\3\2\2\2\u0181\u0182"+
		"\7\21\2\2\u0182\u0183\7\u00e6\2\2\u0183\u0184\5\u00aaV\2\u0184\u0185\7"+
		"\u00d6\2\2\u0185\u0186\7\u00da\2\2\u0186\u0187\7\u008c\2\2\u0187\u01c7"+
		"\3\2\2\2\u0188\u0189\7\21\2\2\u0189\u018a\7\u00e6\2\2\u018a\u018b\5\u00aa"+
		"V\2\u018b\u018c\7U\2\2\u018c\u018d\7\u00ab\2\2\u018d\u01c7\3\2\2\2\u018e"+
		"\u018f\7\21\2\2\u018f\u0190\7\u00e6\2\2\u0190\u0191\5\u00aaV\2\u0191\u0192"+
		"\7\26\2\2\u0192\u0193\7\u00ab\2\2\u0193\u01c7\3\2\2\2\u0194\u0195\7\21"+
		"\2\2\u0195\u0196\7\u00e6\2\2\u0196\u0197\5\u00aaV\2\u0197\u0198\7\u00f9"+
		"\2\2\u0198\u0199\7\u00ab\2\2\u0199\u01c7\3\2\2\2\u019a\u019b\7\21\2\2"+
		"\u019b\u019c\7\u00e6\2\2\u019c\u019d\5\u00aaV\2\u019d\u019e\7\u00ef\2"+
		"\2\u019e\u01c7\3\2\2\2\u019f\u01a0\7\21\2\2\u01a0\u01a1\7\u00e6\2\2\u01a1"+
		"\u01a3\5\u00aaV\2\u01a2\u01a4\5\34\17\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\7\61\2\2\u01a6\u01c7\3\2\2\2"+
		"\u01a7\u01a8\7\21\2\2\u01a8\u01a9\7\u00e6\2\2\u01a9\u01ab\5\u00aaV\2\u01aa"+
		"\u01ac\5\34\17\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3"+
		"\2\2\2\u01ad\u01ae\7\64\2\2\u01ae\u01c7\3\2\2\2\u01af\u01b0\7\21\2\2\u01b0"+
		"\u01b1\7\u00e6\2\2\u01b1\u01b3\5\u00aaV\2\u01b2\u01b4\5\34\17\2\u01b3"+
		"\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\7\u00d6"+
		"\2\2\u01b6\u01b7\7`\2\2\u01b7\u01c7\3\2\2\2\u01b8\u01b9\7\21\2\2\u01b9"+
		"\u01ba\7\u00e6\2\2\u01ba\u01bc\5\u00aaV\2\u01bb\u01bd\5\34\17\2\u01bc"+
		"\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\7\u00c1"+
		"\2\2\u01bf\u01c0\7.\2\2\u01c0\u01c7\3\2\2\2\u01c1\u01c2\7\u00de\2\2\u01c2"+
		"\u01c7\7\u00f1\2\2\u01c3\u01c7\7\60\2\2\u01c4\u01c7\7\u00ca\2\2\u01c5"+
		"\u01c7\7I\2\2\u01c6\u011e\3\2\2\2\u01c6\u0120\3\2\2\2\u01c6\u0122\3\2"+
		"\2\2\u01c6\u0126\3\2\2\2\u01c6\u012a\3\2\2\2\u01c6\u012c\3\2\2\2\u01c6"+
		"\u0131\3\2\2\2\u01c6\u0133\3\2\2\2\u01c6\u0135\3\2\2\2\u01c6\u0138\3\2"+
		"\2\2\u01c6\u013a\3\2\2\2\u01c6\u013c\3\2\2\2\u01c6\u013e\3\2\2\2\u01c6"+
		"\u0141\3\2\2\2\u01c6\u0143\3\2\2\2\u01c6\u0145\3\2\2\2\u01c6\u0147\3\2"+
		"\2\2\u01c6\u0149\3\2\2\2\u01c6\u014b\3\2\2\2\u01c6\u014d\3\2\2\2\u01c6"+
		"\u014f\3\2\2\2\u01c6\u0151\3\2\2\2\u01c6\u0153\3\2\2\2\u01c6\u0155\3\2"+
		"\2\2\u01c6\u0158\3\2\2\2\u01c6\u015b\3\2\2\2\u01c6\u0161\3\2\2\2\u01c6"+
		"\u0167\3\2\2\2\u01c6\u016d\3\2\2\2\u01c6\u0173\3\2\2\2\u01c6\u0179\3\2"+
		"\2\2\u01c6\u0181\3\2\2\2\u01c6\u0188\3\2\2\2\u01c6\u018e\3\2\2\2\u01c6"+
		"\u0194\3\2\2\2\u01c6\u019a\3\2\2\2\u01c6\u019f\3\2\2\2\u01c6\u01a7\3\2"+
		"\2\2\u01c6\u01af\3\2\2\2\u01c6\u01b8\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6"+
		"\u01c3\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7\13\3\2\2"+
		"\2\u01c8\u01c9\7\67\2\2\u01c9\u01cb\7\u00a2\2\2\u01ca\u01c8\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\7\u00c1\2\2\u01cd\u01ce"+
		"\7\u00e6\2\2\u01ce\u01cf\5\u00a8U\2\u01cf\r\3\2\2\2\u01d0\u01d1\7)\2\2"+
		"\u01d1\u01d2\7 \2\2\u01d2\u01d6\5\u0090I\2\u01d3\u01d4\7\u00dd\2\2\u01d4"+
		"\u01d5\7 \2\2\u01d5\u01d7\5\u0094K\2\u01d6\u01d3\3\2\2\2\u01d6\u01d7\3"+
		"\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\7|\2\2\u01d9\u01da\7\u0124\2\2"+
		"\u01da\u01db\7\37\2\2\u01db\17\3\2\2\2\u01dc\u01dd\7\u00da\2\2\u01dd\u01de"+
		"\7 \2\2\u01de\u01df\5\u0090I\2\u01df\u01e2\7\u009e\2\2\u01e0\u01e3\5\66"+
		"\34\2\u01e1\u01e3\58\35\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3"+
		"\u01e7\3\2\2\2\u01e4\u01e5\7\u00e0\2\2\u01e5\u01e6\7\30\2\2\u01e6\u01e8"+
		"\7J\2\2\u01e7\u01e4\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\21\3\2\2\2\u01e9"+
		"\u01ea\7\u008c\2\2\u01ea\u01eb\7\u0120\2\2\u01eb\23\3\2\2\2\u01ec\u01ed"+
		"\7/\2\2\u01ed\u01ee\7\u0120\2\2\u01ee\25\3\2\2\2\u01ef\u01f1\5&\24\2\u01f0"+
		"\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\5H"+
		"%\2\u01f3\u01f4\5D#\2\u01f4\27\3\2\2\2\u01f5\u01f6\7y\2\2\u01f6\u01f8"+
		"\7\u00aa\2\2\u01f7\u01f9\7\u00e6\2\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3"+
		"\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u0201\5\u00a8U\2\u01fb\u01ff\5\34\17"+
		"\2\u01fc\u01fd\7p\2\2\u01fd\u01fe\7\u009a\2\2\u01fe\u0200\7V\2\2\u01ff"+
		"\u01fc\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u01fb\3\2"+
		"\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u0205\5\u0090I\2\u0204"+
		"\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0233\3\2\2\2\u0206\u0207\7y"+
		"\2\2\u0207\u0209\7|\2\2\u0208\u020a\7\u00e6\2\2\u0209\u0208\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\5\u00a8U\2\u020c\u020e"+
		"\5\34\17\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0212\3\2\2\2"+
		"\u020f\u0210\7p\2\2\u0210\u0211\7\u009a\2\2\u0211\u0213\7V\2\2\u0212\u020f"+
		"\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0216\5\u0090I"+
		"\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0233\3\2\2\2\u0217\u0218"+
		"\7y\2\2\u0218\u021a\7\u00aa\2\2\u0219\u021b\7\u008b\2\2\u021a\u0219\3"+
		"\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\7K\2\2\u021d"+
		"\u021f\7\u0120\2\2\u021e\u0220\5\u00a4S\2\u021f\u021e\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220\u0222\3\2\2\2\u0221\u0223\5:\36\2\u0222\u0221\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0233\3\2\2\2\u0224\u0225\7y\2\2\u0225\u0227\7\u00aa"+
		"\2\2\u0226\u0228\7\u008b\2\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\u022b\7K\2\2\u022a\u022c\7\u0120\2\2\u022b\u022a"+
		"\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0230\5*\26\2\u022e"+
		"\u022f\7\u00a1\2\2\u022f\u0231\5.\30\2\u0230\u022e\3\2\2\2\u0230\u0231"+
		"\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u01f5\3\2\2\2\u0232\u0206\3\2\2\2\u0232"+
		"\u0217\3\2\2\2\u0232\u0224\3\2\2\2\u0233\31\3\2\2\2\u0234\u0236\5\34\17"+
		"\2\u0235\u0237\5\22\n\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237"+
		"\33\3\2\2\2\u0238\u0239\7\u00ab\2\2\u0239\u023a\7\3\2\2\u023a\u023f\5"+
		"\36\20\2\u023b\u023c\7\4\2\2\u023c\u023e\5\36\20\2\u023d\u023b\3\2\2\2"+
		"\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242"+
		"\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0243\7\5\2\2\u0243\35\3\2\2\2\u0244"+
		"\u0247\5\u0102\u0082\2\u0245\u0246\7\u010e\2\2\u0246\u0248\5\u00c6d\2"+
		"\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\37\3\2\2\2\u0249\u024a"+
		"\t\2\2\2\u024a!\3\2\2\2\u024b\u0251\5\u00fc\177\2\u024c\u0251\7\u0120"+
		"\2\2\u024d\u0251\5\u00c8e\2\u024e\u0251\5\u00caf\2\u024f\u0251\5\u00cc"+
		"g\2\u0250\u024b\3\2\2\2\u0250\u024c\3\2\2\2\u0250\u024d\3\2\2\2\u0250"+
		"\u024e\3\2\2\2\u0250\u024f\3\2\2\2\u0251#\3\2\2\2\u0252\u0257\5\u0102"+
		"\u0082\2\u0253\u0254\7\6\2\2\u0254\u0256\5\u0102\u0082\2\u0255\u0253\3"+
		"\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
		"%\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025b\7\u010b\2\2\u025b\u0260\5(\25"+
		"\2\u025c\u025d\7\4\2\2\u025d\u025f\5(\25\2\u025e\u025c\3\2\2\2\u025f\u0262"+
		"\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\'\3\2\2\2\u0262"+
		"\u0260\3\2\2\2\u0263\u0265\5\u00fe\u0080\2\u0264\u0266\5\u0090I\2\u0265"+
		"\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0269\7\30"+
		"\2\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"\u026b\7\3\2\2\u026b\u026c\5\26\f\2\u026c\u026d\7\5\2\2\u026d)\3\2\2\2"+
		"\u026e\u026f\7\u0104\2\2\u026f\u0270\5\u00a8U\2\u0270+\3\2\2\2\u0271\u0272"+
		"\7\u00a1\2\2\u0272\u027f\5.\30\2\u0273\u0274\7\u00ac\2\2\u0274\u0275\7"+
		" \2\2\u0275\u027f\5\u00b2Z\2\u0276\u027f\5\20\t\2\u0277\u027f\5\16\b\2"+
		"\u0278\u027f\5\u00a4S\2\u0279\u027f\5:\36\2\u027a\u027f\5\22\n\2\u027b"+
		"\u027f\5\24\13\2\u027c\u027d\7\u00e9\2\2\u027d\u027f\5.\30\2\u027e\u0271"+
		"\3\2\2\2\u027e\u0273\3\2\2\2\u027e\u0276\3\2\2\2\u027e\u0277\3\2\2\2\u027e"+
		"\u0278\3\2\2\2\u027e\u0279\3\2\2\2\u027e\u027a\3\2\2\2\u027e\u027b\3\2"+
		"\2\2\u027e\u027c\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280"+
		"\u0281\3\2\2\2\u0281-\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0284\7\3\2\2"+
		"\u0284\u0289\5\60\31\2\u0285\u0286\7\4\2\2\u0286\u0288\5\60\31\2\u0287"+
		"\u0285\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2"+
		"\2\2\u028a\u028c\3\2\2\2\u028b\u0289\3\2\2\2\u028c\u028d\7\5\2\2\u028d"+
		"/\3\2\2\2\u028e\u0293\5\62\32\2\u028f\u0291\7\u010e\2\2\u0290\u028f\3"+
		"\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\5\64\33\2\u0293"+
		"\u0290\3\2\2\2\u0293\u0294\3\2\2\2\u0294\61\3\2\2\2\u0295\u029a\5\u0102"+
		"\u0082\2\u0296\u0297\7\6\2\2\u0297\u0299\5\u0102\u0082\2\u0298\u0296\3"+
		"\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b"+
		"\u029f\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029f\7\u0120\2\2\u029e\u0295"+
		"\3\2\2\2\u029e\u029d\3\2\2\2\u029f\63\3\2\2\2\u02a0\u02a5\7\u0124\2\2"+
		"\u02a1\u02a5\7\u0126\2\2\u02a2\u02a5\5\u00ceh\2\u02a3\u02a5\7\u0120\2"+
		"\2\u02a4\u02a0\3\2\2\2\u02a4\u02a1\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a3"+
		"\3\2\2\2\u02a5\65\3\2\2\2\u02a6\u02a7\7\3\2\2\u02a7\u02ac\5\u00c6d\2\u02a8"+
		"\u02a9\7\4\2\2\u02a9\u02ab\5\u00c6d\2\u02aa\u02a8\3\2\2\2\u02ab\u02ae"+
		"\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02af\3\2\2\2\u02ae"+
		"\u02ac\3\2\2\2\u02af\u02b0\7\5\2\2\u02b0\67\3\2\2\2\u02b1\u02b2\7\3\2"+
		"\2\u02b2\u02b7\5\66\34\2\u02b3\u02b4\7\4\2\2\u02b4\u02b6\5\66\34\2\u02b5"+
		"\u02b3\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2"+
		"\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bb\7\5\2\2\u02bb"+
		"9\3\2\2\2\u02bc\u02bd\7\u00e0\2\2\u02bd\u02be\7\30\2\2\u02be\u02c3\5<"+
		"\37\2\u02bf\u02c0\7\u00e0\2\2\u02c0\u02c1\7 \2\2\u02c1\u02c3\5> \2\u02c2"+
		"\u02bc\3\2\2\2\u02c2\u02bf\3\2\2\2\u02c3;\3\2\2\2\u02c4\u02c5\7x\2\2\u02c5"+
		"\u02c6\7\u0120\2\2\u02c6\u02c7\7\u00a6\2\2\u02c7\u02ca\7\u0120\2\2\u02c8"+
		"\u02ca\5\u0102\u0082\2\u02c9\u02c4\3\2\2\2\u02c9\u02c8\3\2\2\2\u02ca="+
		"\3\2\2\2\u02cb\u02cf\7\u0120\2\2\u02cc\u02cd\7\u010b\2\2\u02cd\u02ce\7"+
		"\u00d4\2\2\u02ce\u02d0\5.\30\2\u02cf\u02cc\3\2\2\2\u02cf\u02d0\3\2\2\2"+
		"\u02d0?\3\2\2\2\u02d1\u02d2\5\u0102\u0082\2\u02d2\u02d3\7\u0120\2\2\u02d3"+
		"A\3\2\2\2\u02d4\u02d5\5\30\r\2\u02d5\u02d6\5H%\2\u02d6\u02d7\5D#\2\u02d7"+
		"\u0308\3\2\2\2\u02d8\u02da\5n8\2\u02d9\u02db\5F$\2\u02da\u02d9\3\2\2\2"+
		"\u02db\u02dc\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u0308"+
		"\3\2\2\2\u02de\u02df\7E\2\2\u02df\u02e0\7g\2\2\u02e0\u02e1\5\u00a8U\2"+
		"\u02e1\u02e3\5\u00a2R\2\u02e2\u02e4\5f\64\2\u02e3\u02e2\3\2\2\2\u02e3"+
		"\u02e4\3\2\2\2\u02e4\u0308\3\2\2\2\u02e5\u02e6\7\u0101\2\2\u02e6\u02e7"+
		"\5\u00a8U\2\u02e7\u02e8\5\u00a2R\2\u02e8\u02ea\5X-\2\u02e9\u02eb\5f\64"+
		"\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u0308\3\2\2\2\u02ec\u02ed"+
		"\7\u0093\2\2\u02ed\u02ee\7|\2\2\u02ee\u02ef\5\u00a8U\2\u02ef\u02f0\5\u00a2"+
		"R\2\u02f0\u02f6\7\u0104\2\2\u02f1\u02f7\5\u00a8U\2\u02f2\u02f3\7\3\2\2"+
		"\u02f3\u02f4\5\26\f\2\u02f4\u02f5\7\5\2\2\u02f5\u02f7\3\2\2\2\u02f6\u02f1"+
		"\3\2\2\2\u02f6\u02f2\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\5\u00a2R"+
		"\2\u02f9\u02fa\7\u009e\2\2\u02fa\u02fe\5\u00be`\2\u02fb\u02fd\5Z.\2\u02fc"+
		"\u02fb\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2"+
		"\2\2\u02ff\u0304\3\2\2\2\u0300\u02fe\3\2\2\2\u0301\u0303\5\\/\2\u0302"+
		"\u0301\3\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2"+
		"\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0307\u02d4\3\2\2\2\u0307"+
		"\u02d8\3\2\2\2\u0307\u02de\3\2\2\2\u0307\u02e5\3\2\2\2\u0307\u02ec\3\2"+
		"\2\2\u0308C\3\2\2\2\u0309\u030a\7\u00a3\2\2\u030a\u030b\7 \2\2\u030b\u0310"+
		"\5L\'\2\u030c\u030d\7\4\2\2\u030d\u030f\5L\'\2\u030e\u030c\3\2\2\2\u030f"+
		"\u0312\3\2\2\2\u0310\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0314\3\2"+
		"\2\2\u0312\u0310\3\2\2\2\u0313\u0309\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u031f\3\2\2\2\u0315\u0316\7(\2\2\u0316\u0317\7 \2\2\u0317\u031c\5\u00ba"+
		"^\2\u0318\u0319\7\4\2\2\u0319\u031b\5\u00ba^\2\u031a\u0318\3\2\2\2\u031b"+
		"\u031e\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u0320\3\2"+
		"\2\2\u031e\u031c\3\2\2\2\u031f\u0315\3\2\2\2\u031f\u0320\3\2\2\2\u0320"+
		"\u032b\3\2\2\2\u0321\u0322\7M\2\2\u0322\u0323\7 \2\2\u0323\u0328\5\u00ba"+
		"^\2\u0324\u0325\7\4\2\2\u0325\u0327\5\u00ba^\2\u0326\u0324\3\2\2\2\u0327"+
		"\u032a\3\2\2\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032c\3\2"+
		"\2\2\u032a\u0328\3\2\2\2\u032b\u0321\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u0337\3\2\2\2\u032d\u032e\7\u00dc\2\2\u032e\u032f\7 \2\2\u032f\u0334"+
		"\5L\'\2\u0330\u0331\7\4\2\2\u0331\u0333\5L\'\2\u0332\u0330\3\2\2\2\u0333"+
		"\u0336\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0338\3\2"+
		"\2\2\u0336\u0334\3\2\2\2\u0337\u032d\3\2\2\2\u0337\u0338\3\2\2\2\u0338"+
		"\u033a\3\2\2\2\u0339\u033b\5\u00eex\2\u033a\u0339\3\2\2\2\u033a\u033b"+
		"\3\2\2\2\u033b\u0341\3\2\2\2\u033c\u033f\7\u0087\2\2\u033d\u0340\7\20"+
		"\2\2\u033e\u0340\5\u00ba^\2\u033f\u033d\3\2\2\2\u033f\u033e\3\2\2\2\u0340"+
		"\u0342\3\2\2\2\u0341\u033c\3\2\2\2\u0341\u0342\3\2\2\2\u0342E\3\2\2\2"+
		"\u0343\u0344\5\30\r\2\u0344\u0345\5P)\2\u0345G\3\2\2\2\u0346\u0347\b%"+
		"\1\2\u0347\u0348\5J&\2\u0348\u0360\3\2\2\2\u0349\u034a\f\5\2\2\u034a\u034b"+
		"\6%\3\2\u034b\u034d\t\3\2\2\u034c\u034e\5\u0082B\2\u034d\u034c\3\2\2\2"+
		"\u034d\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u035f\5H%\6\u0350\u0351"+
		"\f\4\2\2\u0351\u0352\6%\5\2\u0352\u0354\7z\2\2\u0353\u0355\5\u0082B\2"+
		"\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u035f"+
		"\5H%\5\u0357\u0358\f\3\2\2\u0358\u0359\6%\7\2\u0359\u035b\t\4\2\2\u035a"+
		"\u035c\5\u0082B\2\u035b\u035a\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d"+
		"\3\2\2\2\u035d\u035f\5H%\4\u035e\u0349\3\2\2\2\u035e\u0350\3\2\2\2\u035e"+
		"\u0357\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2"+
		"\2\2\u0361I\3\2\2\2\u0362\u0360\3\2\2\2\u0363\u036d\5R*\2\u0364\u036d"+
		"\5N(\2\u0365\u0366\7\u00e6\2\2\u0366\u036d\5\u00a8U\2\u0367\u036d\5\u009e"+
		"P\2\u0368\u0369\7\3\2\2\u0369\u036a\5\26\f\2\u036a\u036b\7\5\2\2\u036b"+
		"\u036d\3\2\2\2\u036c\u0363\3\2\2\2\u036c\u0364\3\2\2\2\u036c\u0365\3\2"+
		"\2\2\u036c\u0367\3\2\2\2\u036c\u0368\3\2\2\2\u036dK\3\2\2\2\u036e\u0370"+
		"\5\u00ba^\2\u036f\u0371\t\5\2\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2\2"+
		"\2\u0371\u0374\3\2\2\2\u0372\u0373\7\u009c\2\2\u0373\u0375\t\6\2\2\u0374"+
		"\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375M\3\2\2\2\u0376\u0378\5n8\2\u0377"+
		"\u0379\5P)\2\u0378\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u0378\3\2\2"+
		"\2\u037a\u037b\3\2\2\2\u037bO\3\2\2\2\u037c\u037e\5T+\2\u037d\u037f\5"+
		"f\64\2\u037e\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\3\2\2\2\u0380"+
		"\u0381\5D#\2\u0381\u0398\3\2\2\2\u0382\u0386\5V,\2\u0383\u0385\5\u0080"+
		"A\2\u0384\u0383\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0386"+
		"\u0387\3\2\2\2\u0387\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0389\u038b\5f"+
		"\64\2\u038a\u0389\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038d\3\2\2\2\u038c"+
		"\u038e\5p9\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0390\3\2\2"+
		"\2\u038f\u0391\5h\65\2\u0390\u038f\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0393"+
		"\3\2\2\2\u0392\u0394\5\u00eex\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2\2"+
		"\2\u0394\u0395\3\2\2\2\u0395\u0396\5D#\2\u0396\u0398\3\2\2\2\u0397\u037c"+
		"\3\2\2\2\u0397\u0382\3\2\2\2\u0398Q\3\2\2\2\u0399\u039b\5T+\2\u039a\u039c"+
		"\5n8\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u03a0\3\2\2\2\u039d"+
		"\u039f\5\u0080A\2\u039e\u039d\3\2\2\2\u039f\u03a2\3\2\2\2\u03a0\u039e"+
		"\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a3"+
		"\u03a5\5f\64\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a7\3\2"+
		"\2\2\u03a6\u03a8\5p9\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03aa"+
		"\3\2\2\2\u03a9\u03ab\5h\65\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab"+
		"\u03ad\3\2\2\2\u03ac\u03ae\5\u00eex\2\u03ad\u03ac\3\2\2\2\u03ad\u03ae"+
		"\3\2\2\2\u03ae\u03c6\3\2\2\2\u03af\u03b1\5V,\2\u03b0\u03b2\5n8\2\u03b1"+
		"\u03b0\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b6\3\2\2\2\u03b3\u03b5\5\u0080"+
		"A\2\u03b4\u03b3\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b6"+
		"\u03b7\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9\u03bb\5f"+
		"\64\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc"+
		"\u03be\5p9\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c0\3\2\2"+
		"\2\u03bf\u03c1\5h\65\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c3"+
		"\3\2\2\2\u03c2\u03c4\5\u00eex\2\u03c3\u03c2\3\2\2\2\u03c3\u03c4\3\2\2"+
		"\2\u03c4\u03c6\3\2\2\2\u03c5\u0399\3\2\2\2\u03c5\u03af\3\2\2\2\u03c6S"+
		"\3\2\2\2\u03c7\u03c8\7\u00d0\2\2\u03c8\u03c9\7\u00f3\2\2\u03c9\u03cb\7"+
		"\3\2\2\u03ca\u03cc\5\u0082B\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc\3\2\2\2"+
		"\u03cc\u03cd\3\2\2\2\u03cd\u03ce\5\u00bc_\2\u03ce\u03cf\7\5\2\2\u03cf"+
		"\u03db\3\2\2\2\u03d0\u03d2\7\u0091\2\2\u03d1\u03d3\5\u0082B\2\u03d2\u03d1"+
		"\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03db\5\u00bc_"+
		"\2\u03d5\u03d7\7\u00bc\2\2\u03d6\u03d8\5\u0082B\2\u03d7\u03d6\3\2\2\2"+
		"\u03d7\u03d8\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03db\5\u00bc_\2\u03da"+
		"\u03c7\3\2\2\2\u03da\u03d0\3\2\2\2\u03da\u03d5\3\2\2\2\u03db\u03dd\3\2"+
		"\2\2\u03dc\u03de\5\u00a4S\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de"+
		"\u03e1\3\2\2\2\u03df\u03e0\7\u00ba\2\2\u03e0\u03e2\7\u0120\2\2\u03e1\u03df"+
		"\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\7\u0104\2"+
		"\2\u03e4\u03f1\7\u0120\2\2\u03e5\u03ef\7\30\2\2\u03e6\u03f0\5\u0092J\2"+
		"\u03e7\u03f0\5\u00e4s\2\u03e8\u03eb\7\3\2\2\u03e9\u03ec\5\u0092J\2\u03ea"+
		"\u03ec\5\u00e4s\2\u03eb\u03e9\3\2\2\2\u03eb\u03ea\3\2\2\2\u03ec\u03ed"+
		"\3\2\2\2\u03ed\u03ee\7\5\2\2\u03ee\u03f0\3\2\2\2\u03ef\u03e6\3\2\2\2\u03ef"+
		"\u03e7\3\2\2\2\u03ef\u03e8\3\2\2\2\u03f0\u03f2\3\2\2\2\u03f1\u03e5\3\2"+
		"\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f4\3\2\2\2\u03f3\u03f5\5\u00a4S\2\u03f4"+
		"\u03f3\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6\u03f7\7\u00b9"+
		"\2\2\u03f7\u03f9\7\u0120\2\2\u03f8\u03f6\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9"+
		"U\3\2\2\2\u03fa\u03fe\7\u00d0\2\2\u03fb\u03fd\5j\66\2\u03fc\u03fb\3\2"+
		"\2\2\u03fd\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff"+
		"\u0402\3\2\2\2\u0400\u03fe\3\2\2\2\u0401\u0403\5\u0082B\2\u0402\u0401"+
		"\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0405\5\u00b0Y"+
		"\2\u0405W\3\2\2\2\u0406\u0407\7\u00d6\2\2\u0407\u0408\5b\62\2\u0408Y\3"+
		"\2\2\2\u0409\u040a\7\u0108\2\2\u040a\u040d\7\u0092\2\2\u040b\u040c\7\23"+
		"\2\2\u040c\u040e\5\u00be`\2\u040d\u040b\3\2\2\2\u040d\u040e\3\2\2\2\u040e"+
		"\u040f\3\2\2\2\u040f\u0410\7\u00ec\2\2\u0410\u0411\5^\60\2\u0411[\3\2"+
		"\2\2\u0412\u0413\7\u0108\2\2\u0413\u0414\7\u009a\2\2\u0414\u0417\7\u0092"+
		"\2\2\u0415\u0416\7\23\2\2\u0416\u0418\5\u00be`\2\u0417\u0415\3\2\2\2\u0417"+
		"\u0418\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a\7\u00ec\2\2\u041a\u041b"+
		"\5`\61\2\u041b]\3\2\2\2\u041c\u0424\7E\2\2\u041d\u041e\7\u0101\2\2\u041e"+
		"\u041f\7\u00d6\2\2\u041f\u0424\7\u0118\2\2\u0420\u0421\7\u0101\2\2\u0421"+
		"\u0422\7\u00d6\2\2\u0422\u0424\5b\62\2\u0423\u041c\3\2\2\2\u0423\u041d"+
		"\3\2\2\2\u0423\u0420\3\2\2\2\u0424_\3\2\2\2\u0425\u0426\7y\2\2\u0426\u0438"+
		"\7\u0118\2\2\u0427\u0428\7y\2\2\u0428\u0429\7\3\2\2\u0429\u042a\5\u00a6"+
		"T\2\u042a\u042b\7\5\2\2\u042b\u042c\7\u0105\2\2\u042c\u042d\7\3\2\2\u042d"+
		"\u0432\5\u00ba^\2\u042e\u042f\7\4\2\2\u042f\u0431\5\u00ba^\2\u0430\u042e"+
		"\3\2\2\2\u0431\u0434\3\2\2\2\u0432\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433"+
		"\u0435\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u0436\7\5\2\2\u0436\u0438\3\2"+
		"\2\2\u0437\u0425\3\2\2\2\u0437\u0427\3\2\2\2\u0438a\3\2\2\2\u0439\u043e"+
		"\5d\63\2\u043a\u043b\7\4\2\2\u043b\u043d\5d\63\2\u043c\u043a\3\2\2\2\u043d"+
		"\u0440\3\2\2\2\u043e\u043c\3\2\2\2\u043e\u043f\3\2\2\2\u043fc\3\2\2\2"+
		"\u0440\u043e\3\2\2\2\u0441\u0442\5\u00a8U\2\u0442\u0443\7\u010e\2\2\u0443"+
		"\u0444\5\u00ba^\2\u0444e\3\2\2\2\u0445\u0446\7\u0109\2\2\u0446\u0447\5"+
		"\u00be`\2\u0447g\3\2\2\2\u0448\u0449\7o\2\2\u0449\u044a\5\u00be`\2\u044a"+
		"i\3\2\2\2\u044b\u044c\7\7\2\2\u044c\u0453\5l\67\2\u044d\u044f\7\4\2\2"+
		"\u044e\u044d\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0452"+
		"\5l\67\2\u0451\u044e\3\2\2\2\u0452\u0455\3\2\2\2\u0453\u0451\3\2\2\2\u0453"+
		"\u0454\3\2\2\2\u0454\u0456\3\2\2\2\u0455\u0453\3\2\2\2\u0456\u0457\7\b"+
		"\2\2\u0457k\3\2\2\2\u0458\u0466\5\u0102\u0082\2\u0459\u045a\5\u0102\u0082"+
		"\2\u045a\u045b\7\3\2\2\u045b\u0460\5\u00c4c\2\u045c\u045d\7\4\2\2\u045d"+
		"\u045f\5\u00c4c\2\u045e\u045c\3\2\2\2\u045f\u0462\3\2\2\2\u0460\u045e"+
		"\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0463\3\2\2\2\u0462\u0460\3\2\2\2\u0463"+
		"\u0464\7\5\2\2\u0464\u0466\3\2\2\2\u0465\u0458\3\2\2\2\u0465\u0459\3\2"+
		"\2\2\u0466m\3\2\2\2\u0467\u0468\7g\2\2\u0468\u046d\5\u0084C\2\u0469\u046a"+
		"\7\4\2\2\u046a\u046c\5\u0084C\2\u046b\u0469\3\2\2\2\u046c\u046f\3\2\2"+
		"\2\u046d\u046b\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u0473\3\2\2\2\u046f\u046d"+
		"\3\2\2\2\u0470\u0472\5\u0080A\2\u0471\u0470\3\2\2\2\u0472\u0475\3\2\2"+
		"\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0477\3\2\2\2\u0475\u0473"+
		"\3\2\2\2\u0476\u0478\5z>\2\u0477\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478"+
		"o\3\2\2\2\u0479\u047a\7m\2\2\u047a\u047b\7 \2\2\u047b\u0480\5r:\2\u047c"+
		"\u047d\7\4\2\2\u047d\u047f\5r:\2\u047e\u047c\3\2\2\2\u047f\u0482\3\2\2"+
		"\2\u0480\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u04a1\3\2\2\2\u0482\u0480"+
		"\3\2\2\2\u0483\u0484\7m\2\2\u0484\u0485\7 \2\2\u0485\u048a\5\u00ba^\2"+
		"\u0486\u0487\7\4\2\2\u0487\u0489\5\u00ba^\2\u0488\u0486\3\2\2\2\u0489"+
		"\u048c\3\2\2\2\u048a\u0488\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u049e\3\2"+
		"\2\2\u048c\u048a\3\2\2\2\u048d\u048e\7\u010b\2\2\u048e\u049f\7\u00cb\2"+
		"\2\u048f\u0490\7\u010b\2\2\u0490\u049f\79\2\2\u0491\u0492\7n\2\2\u0492"+
		"\u0493\7\u00d8\2\2\u0493\u0494\7\3\2\2\u0494\u0499\5x=\2\u0495\u0496\7"+
		"\4\2\2\u0496\u0498\5x=\2\u0497\u0495\3\2\2\2\u0498\u049b\3\2\2\2\u0499"+
		"\u0497\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049c\3\2\2\2\u049b\u0499\3\2"+
		"\2\2\u049c\u049d\7\5\2\2\u049d\u049f\3\2\2\2\u049e\u048d\3\2\2\2\u049e"+
		"\u048f\3\2\2\2\u049e\u0491\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a1\3\2"+
		"\2\2\u04a0\u0479\3\2\2\2\u04a0\u0483\3\2\2\2\u04a1q\3\2\2\2\u04a2\u04a5"+
		"\5t;\2\u04a3\u04a5\5\u00ba^\2\u04a4\u04a2\3\2\2\2\u04a4\u04a3\3\2\2\2"+
		"\u04a5s\3\2\2\2\u04a6\u04a7\t\7\2\2\u04a7\u04a8\7\3\2\2\u04a8\u04ad\5"+
		"x=\2\u04a9\u04aa\7\4\2\2\u04aa\u04ac\5x=\2\u04ab\u04a9\3\2\2\2\u04ac\u04af"+
		"\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04b0\3\2\2\2\u04af"+
		"\u04ad\3\2\2\2\u04b0\u04b1\7\5\2\2\u04b1\u04c0\3\2\2\2\u04b2\u04b3\7n"+
		"\2\2\u04b3\u04b4\7\u00d8\2\2\u04b4\u04b5\7\3\2\2\u04b5\u04ba\5v<\2\u04b6"+
		"\u04b7\7\4\2\2\u04b7\u04b9\5v<\2\u04b8\u04b6\3\2\2\2\u04b9\u04bc\3\2\2"+
		"\2\u04ba\u04b8\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bd\3\2\2\2\u04bc\u04ba"+
		"\3\2\2\2\u04bd\u04be\7\5\2\2\u04be\u04c0\3\2\2\2\u04bf\u04a6\3\2\2\2\u04bf"+
		"\u04b2\3\2\2\2\u04c0u\3\2\2\2\u04c1\u04c4\5t;\2\u04c2\u04c4\5x=\2\u04c3"+
		"\u04c1\3\2\2\2\u04c3\u04c2\3\2\2\2\u04c4w\3\2\2\2\u04c5\u04ce\7\3\2\2"+
		"\u04c6\u04cb\5\u00ba^\2\u04c7\u04c8\7\4\2\2\u04c8\u04ca\5\u00ba^\2\u04c9"+
		"\u04c7\3\2\2\2\u04ca\u04cd\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cb\u04cc\3\2"+
		"\2\2\u04cc\u04cf\3\2\2\2\u04cd\u04cb\3\2\2\2\u04ce\u04c6\3\2\2\2\u04ce"+
		"\u04cf\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d3\7\5\2\2\u04d1\u04d3\5\u00ba"+
		"^\2\u04d2\u04c5\3\2\2\2\u04d2\u04d1\3\2\2\2\u04d3y\3\2\2\2\u04d4\u04d5"+
		"\7\u00af\2\2\u04d5\u04d6\7\3\2\2\u04d6\u04d7\5\u00b0Y\2\u04d7\u04d8\7"+
		"c\2\2\u04d8\u04d9\5|?\2\u04d9\u04da\7s\2\2\u04da\u04db\7\3\2\2\u04db\u04e0"+
		"\5~@\2\u04dc\u04dd\7\4\2\2\u04dd\u04df\5~@\2\u04de\u04dc\3\2\2\2\u04df"+
		"\u04e2\3\2\2\2\u04e0\u04de\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e3\3\2"+
		"\2\2\u04e2\u04e0\3\2\2\2\u04e3\u04e4\7\5\2\2\u04e4\u04e5\7\5\2\2\u04e5"+
		"{\3\2\2\2\u04e6\u04f3\5\u0102\u0082\2\u04e7\u04e8\7\3\2\2\u04e8\u04ed"+
		"\5\u0102\u0082\2\u04e9\u04ea\7\4\2\2\u04ea\u04ec\5\u0102\u0082\2\u04eb"+
		"\u04e9\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ed\u04ee\3\2"+
		"\2\2\u04ee\u04f0\3\2\2\2\u04ef\u04ed\3\2\2\2\u04f0\u04f1\7\5\2\2\u04f1"+
		"\u04f3\3\2\2\2\u04f2\u04e6\3\2\2\2\u04f2\u04e7\3\2\2\2\u04f3}\3\2\2\2"+
		"\u04f4\u04f9\5\u00ba^\2\u04f5\u04f7\7\30\2\2\u04f6\u04f5\3\2\2\2\u04f6"+
		"\u04f7\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fa\5\u0102\u0082\2\u04f9\u04f6"+
		"\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\177\3\2\2\2\u04fb\u04fc\7\u0082\2\2"+
		"\u04fc\u04fe\7\u0106\2\2\u04fd\u04ff\7\u00a5\2\2\u04fe\u04fd\3\2\2\2\u04fe"+
		"\u04ff\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0501\5\u00fc\177\2\u0501\u050a"+
		"\7\3\2\2\u0502\u0507\5\u00ba^\2\u0503\u0504\7\4\2\2\u0504\u0506\5\u00ba"+
		"^\2\u0505\u0503\3\2\2\2\u0506\u0509\3\2\2\2\u0507\u0505\3\2\2\2\u0507"+
		"\u0508\3\2\2\2\u0508\u050b\3\2\2\2\u0509\u0507\3\2\2\2\u050a\u0502\3\2"+
		"\2\2\u050a\u050b\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050d\7\5\2\2\u050d"+
		"\u0519\5\u0102\u0082\2\u050e\u0510\7\30\2\2\u050f\u050e\3\2\2\2\u050f"+
		"\u0510\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0516\5\u0102\u0082\2\u0512\u0513"+
		"\7\4\2\2\u0513\u0515\5\u0102\u0082\2\u0514\u0512\3\2\2\2\u0515\u0518\3"+
		"\2\2\2\u0516\u0514\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u051a\3\2\2\2\u0518"+
		"\u0516\3\2\2\2\u0519\u050f\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u0081\3\2"+
		"\2\2\u051b\u051c\t\b\2\2\u051c\u0083\3\2\2\2\u051d\u0521\5\u009cO\2\u051e"+
		"\u0520\5\u0086D\2\u051f\u051e\3\2\2\2\u0520\u0523\3\2\2\2\u0521\u051f"+
		"\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0085\3\2\2\2\u0523\u0521\3\2\2\2\u0524"+
		"\u0525\5\u0088E\2\u0525\u0526\7\177\2\2\u0526\u0528\5\u009cO\2\u0527\u0529"+
		"\5\u008aF\2\u0528\u0527\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u0530\3\2\2"+
		"\2\u052a\u052b\7\u0098\2\2\u052b\u052c\5\u0088E\2\u052c\u052d\7\177\2"+
		"\2\u052d\u052e\5\u009cO\2\u052e\u0530\3\2\2\2\u052f\u0524\3\2\2\2\u052f"+
		"\u052a\3\2\2\2\u0530\u0087\3\2\2\2\u0531\u0533\7v\2\2\u0532\u0531\3\2"+
		"\2\2\u0532\u0533\3\2\2\2\u0533\u054a\3\2\2\2\u0534\u054a\78\2\2\u0535"+
		"\u0537\7\u0085\2\2\u0536\u0538\7\u00a5\2\2\u0537\u0536\3\2\2\2\u0537\u0538"+
		"\3\2\2\2\u0538\u054a\3\2\2\2\u0539\u053b\7\u0085\2\2\u053a\u0539\3\2\2"+
		"\2\u053a\u053b\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u054a\7\u00d1\2\2\u053d"+
		"\u053f\7\u00c6\2\2\u053e\u0540\7\u00a5\2\2\u053f\u053e\3\2\2\2\u053f\u0540"+
		"\3\2\2\2\u0540\u054a\3\2\2\2\u0541\u0543\7h\2\2\u0542\u0544\7\u00a5\2"+
		"\2\u0543\u0542\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u054a\3\2\2\2\u0545\u0547"+
		"\7\u0085\2\2\u0546\u0545\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0548\3\2\2"+
		"\2\u0548\u054a\7\24\2\2\u0549\u0532\3\2\2\2\u0549\u0534\3\2\2\2\u0549"+
		"\u0535\3\2\2\2\u0549\u053a\3\2\2\2\u0549\u053d\3\2\2\2\u0549\u0541\3\2"+
		"\2\2\u0549\u0546\3\2\2\2\u054a\u0089\3\2\2\2\u054b\u054c\7\u009e\2\2\u054c"+
		"\u0550\5\u00be`\2\u054d\u054e\7\u0104\2\2\u054e\u0550\5\u0090I\2\u054f"+
		"\u054b\3\2\2\2\u054f\u054d\3\2\2\2\u0550\u008b\3\2\2\2\u0551\u0552\7\u00e8"+
		"\2\2\u0552\u0554\7\3\2\2\u0553\u0555\5\u008eH\2\u0554\u0553\3\2\2\2\u0554"+
		"\u0555\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0557\7\5\2\2\u0557\u008d\3\2"+
		"\2\2\u0558\u055a\7\u0117\2\2\u0559\u0558\3\2\2\2\u0559\u055a\3\2\2\2\u055a"+
		"\u055b\3\2\2\2\u055b\u055c\t\t\2\2\u055c\u0571\7\u00ae\2\2\u055d\u055e"+
		"\5\u00ba^\2\u055e\u055f\7\u00cd\2\2\u055f\u0571\3\2\2\2\u0560\u0561\7"+
		"\36\2\2\u0561\u0562\7\u0124\2\2\u0562\u0563\7\u00a4\2\2\u0563\u0564\7"+
		"\u009d\2\2\u0564\u056d\7\u0124\2\2\u0565\u056b\7\u009e\2\2\u0566\u056c"+
		"\5\u0102\u0082\2\u0567\u0568\5\u00fc\177\2\u0568\u0569\7\3\2\2\u0569\u056a"+
		"\7\5\2\2\u056a\u056c\3\2\2\2\u056b\u0566\3\2\2\2\u056b\u0567\3\2\2\2\u056c"+
		"\u056e\3\2\2\2\u056d\u0565\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0571\3\2"+
		"\2\2\u056f\u0571\5\u00ba^\2\u0570\u0559\3\2\2\2\u0570\u055d\3\2\2\2\u0570"+
		"\u0560\3\2\2\2\u0570\u056f\3\2\2\2\u0571\u008f\3\2\2\2\u0572\u0573\7\3"+
		"\2\2\u0573\u0574\5\u0092J\2\u0574\u0575\7\5\2\2\u0575\u0091\3\2\2\2\u0576"+
		"\u057b\5\u00fe\u0080\2\u0577\u0578\7\4\2\2\u0578\u057a\5\u00fe\u0080\2"+
		"\u0579\u0577\3\2\2\2\u057a\u057d\3\2\2\2\u057b\u0579\3\2\2\2\u057b\u057c"+
		"\3\2\2\2\u057c\u0093\3\2\2\2\u057d\u057b\3\2\2\2\u057e\u057f\7\3\2\2\u057f"+
		"\u0584\5\u0096L\2\u0580\u0581\7\4\2\2\u0581\u0583\5\u0096L\2\u0582\u0580"+
		"\3\2\2\2\u0583\u0586\3\2\2\2\u0584\u0582\3\2\2\2\u0584\u0585\3\2\2\2\u0585"+
		"\u0587\3\2\2\2\u0586\u0584\3\2\2\2\u0587\u0588\7\5\2\2\u0588\u0095\3\2"+
		"\2\2\u0589\u058b\5\u00fe\u0080\2\u058a\u058c\t\5\2\2\u058b\u058a\3\2\2"+
		"\2\u058b\u058c\3\2\2\2\u058c\u0097\3\2\2\2\u058d\u058e\7\3\2\2\u058e\u0593"+
		"\5\u009aN\2\u058f\u0590\7\4\2\2\u0590\u0592\5\u009aN\2\u0591\u058f\3\2"+
		"\2\2\u0592\u0595\3\2\2\2\u0593\u0591\3\2\2\2\u0593\u0594\3\2\2\2\u0594"+
		"\u0596\3\2\2\2\u0595\u0593\3\2\2\2\u0596\u0597\7\5\2\2\u0597\u0099\3\2"+
		"\2\2\u0598\u059a\5\u0102\u0082\2\u0599\u059b\5\24\13\2\u059a\u0599\3\2"+
		"\2\2\u059a\u059b\3\2\2\2\u059b\u009b\3\2\2\2\u059c\u059e\5\u00a8U\2\u059d"+
		"\u059f\5\u008cG\2\u059e\u059d\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a0"+
		"\3\2\2\2\u05a0\u05a1\5\u00a2R\2\u05a1\u05b5\3\2\2\2\u05a2\u05a3\7\3\2"+
		"\2\u05a3\u05a4\5\26\f\2\u05a4\u05a6\7\5\2\2\u05a5\u05a7\5\u008cG\2\u05a6"+
		"\u05a5\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05a9\5\u00a2"+
		"R\2\u05a9\u05b5\3\2\2\2\u05aa\u05ab\7\3\2\2\u05ab\u05ac\5\u0084C\2\u05ac"+
		"\u05ae\7\5\2\2\u05ad\u05af\5\u008cG\2\u05ae\u05ad\3\2\2\2\u05ae\u05af"+
		"\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b1\5\u00a2R\2\u05b1\u05b5\3\2\2"+
		"\2\u05b2\u05b5\5\u009eP\2\u05b3\u05b5\5\u00a0Q\2\u05b4\u059c\3\2\2\2\u05b4"+
		"\u05a2\3\2\2\2\u05b4\u05aa\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b3\3\2"+
		"\2\2\u05b5\u009d\3\2\2\2\u05b6\u05b7\7\u0105\2\2\u05b7\u05bc\5\u00ba^"+
		"\2\u05b8\u05b9\7\4\2\2\u05b9\u05bb\5\u00ba^\2\u05ba\u05b8\3\2\2\2\u05bb"+
		"\u05be\3\2\2\2\u05bc\u05ba\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\3\2"+
		"\2\2\u05be\u05bc\3\2\2\2\u05bf\u05c0\5\u00a2R\2\u05c0\u009f\3\2\2\2\u05c1"+
		"\u05c2\5\u00fa~\2\u05c2\u05cb\7\3\2\2\u05c3\u05c8\5\u00ba^\2\u05c4\u05c5"+
		"\7\4\2\2\u05c5\u05c7\5\u00ba^\2\u05c6\u05c4\3\2\2\2\u05c7\u05ca\3\2\2"+
		"\2\u05c8\u05c6\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05cc\3\2\2\2\u05ca\u05c8"+
		"\3\2\2\2\u05cb\u05c3\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd"+
		"\u05ce\7\5\2\2\u05ce\u05cf\5\u00a2R\2\u05cf\u00a1\3\2\2\2\u05d0\u05d2"+
		"\7\30\2\2\u05d1\u05d0\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d3\3\2\2\2"+
		"\u05d3\u05d5\5\u0104\u0083\2\u05d4\u05d6\5\u0090I\2\u05d5\u05d4\3\2\2"+
		"\2\u05d5\u05d6\3\2\2\2\u05d6\u05d8\3\2\2\2\u05d7\u05d1\3\2\2\2\u05d7\u05d8"+
		"\3\2\2\2\u05d8\u00a3\3\2\2\2\u05d9\u05da\7\u00cc\2\2\u05da\u05db\7e\2"+
		"\2\u05db\u05dc\7\u00d3\2\2\u05dc\u05e0\7\u0120\2\2\u05dd\u05de\7\u010b"+
		"\2\2\u05de\u05df\7\u00d4\2\2\u05df\u05e1\5.\30\2\u05e0\u05dd\3\2\2\2\u05e0"+
		"\u05e1\3\2\2\2\u05e1\u060b\3\2\2\2\u05e2\u05e3\7\u00cc\2\2\u05e3\u05e4"+
		"\7e\2\2\u05e4\u05ee\7F\2\2\u05e5\u05e6\7^\2\2\u05e6\u05e7\7\u00eb\2\2"+
		"\u05e7\u05e8\7 \2\2\u05e8\u05ec\7\u0120\2\2\u05e9\u05ea\7S\2\2\u05ea\u05eb"+
		"\7 \2\2\u05eb\u05ed\7\u0120\2\2\u05ec\u05e9\3\2\2\2\u05ec\u05ed\3\2\2"+
		"\2\u05ed\u05ef\3\2\2\2\u05ee\u05e5\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f5"+
		"\3\2\2\2\u05f0\u05f1\7,\2\2\u05f1\u05f2\7~\2\2\u05f2\u05f3\7\u00eb\2\2"+
		"\u05f3\u05f4\7 \2\2\u05f4\u05f6\7\u0120\2\2\u05f5\u05f0\3\2\2\2\u05f5"+
		"\u05f6\3\2\2\2\u05f6\u05fc\3\2\2\2\u05f7\u05f8\7\u0091\2\2\u05f8\u05f9"+
		"\7\u0080\2\2\u05f9\u05fa\7\u00eb\2\2\u05fa\u05fb\7 \2\2\u05fb\u05fd\7"+
		"\u0120\2\2\u05fc\u05f7\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u0602\3\2\2\2"+
		"\u05fe\u05ff\7\u0088\2\2\u05ff\u0600\7\u00eb\2\2\u0600\u0601\7 \2\2\u0601"+
		"\u0603\7\u0120\2\2\u0602\u05fe\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0608"+
		"\3\2\2\2\u0604\u0605\7\u009b\2\2\u0605\u0606\7D\2\2\u0606\u0607\7\30\2"+
		"\2\u0607\u0609\7\u0120\2\2\u0608\u0604\3\2\2\2\u0608\u0609\3\2\2\2\u0609"+
		"\u060b\3\2\2\2\u060a\u05d9\3\2\2\2\u060a\u05e2\3\2\2\2\u060b\u00a5\3\2"+
		"\2\2\u060c\u0611\5\u00a8U\2\u060d\u060e\7\4\2\2\u060e\u0610\5\u00a8U\2"+
		"\u060f\u060d\3\2\2\2\u0610\u0613\3\2\2\2\u0611\u060f\3\2\2\2\u0611\u0612"+
		"\3\2\2\2\u0612\u00a7\3\2\2\2\u0613\u0611\3\2\2\2\u0614\u0619\5\u00fe\u0080"+
		"\2\u0615\u0616\7\6\2\2\u0616\u0618\5\u00fe\u0080\2\u0617\u0615\3\2\2\2"+
		"\u0618\u061b\3\2\2\2\u0619\u0617\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u00a9"+
		"\3\2\2\2\u061b\u0619\3\2\2\2\u061c\u061d\5\u00fe\u0080\2\u061d\u061e\7"+
		"\6\2\2\u061e\u0620\3\2\2\2\u061f\u061c\3\2\2\2\u061f\u0620\3\2\2\2\u0620"+
		"\u0621\3\2\2\2\u0621\u0622\5\u00fe\u0080\2\u0622\u00ab\3\2\2\2\u0623\u0624"+
		"\5\u00fe\u0080\2\u0624\u0625\7\6\2\2\u0625\u0627\3\2\2\2\u0626\u0623\3"+
		"\2\2\2\u0626\u0627\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u0629\5\u00fe\u0080"+
		"\2\u0629\u00ad\3\2\2\2\u062a\u0632\5\u00ba^\2\u062b\u062d\7\30\2\2\u062c"+
		"\u062b\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u0630\3\2\2\2\u062e\u0631\5\u00fe"+
		"\u0080\2\u062f\u0631\5\u0090I\2\u0630\u062e\3\2\2\2\u0630\u062f\3\2\2"+
		"\2\u0631\u0633\3\2\2\2\u0632\u062c\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u00af"+
		"\3\2\2\2\u0634\u0639\5\u00aeX\2\u0635\u0636\7\4\2\2\u0636\u0638\5\u00ae"+
		"X\2\u0637\u0635\3\2\2\2\u0638\u063b\3\2\2\2\u0639\u0637\3\2\2\2\u0639"+
		"\u063a\3\2\2\2\u063a\u00b1\3\2\2\2\u063b\u0639\3\2\2\2\u063c\u063d\7\3"+
		"\2\2\u063d\u0642\5\u00b4[\2\u063e\u063f\7\4\2\2\u063f\u0641\5\u00b4[\2"+
		"\u0640\u063e\3\2\2\2\u0641\u0644\3\2\2\2\u0642\u0640\3\2\2\2\u0642\u0643"+
		"\3\2\2\2\u0643\u0645\3\2\2\2\u0644\u0642\3\2\2\2\u0645\u0646\7\5\2\2\u0646"+
		"\u00b3\3\2\2\2\u0647\u064a\5\u00b6\\\2\u0648\u064a\5\u00e6t\2\u0649\u0647"+
		"\3\2\2\2\u0649\u0648\3\2\2\2\u064a\u00b5\3\2\2\2\u064b\u0659\5\u00fc\177"+
		"\2\u064c\u064d\5\u0102\u0082\2\u064d\u064e\7\3\2\2\u064e\u0653\5\u00b8"+
		"]\2\u064f\u0650\7\4\2\2\u0650\u0652\5\u00b8]\2\u0651\u064f\3\2\2\2\u0652"+
		"\u0655\3\2\2\2\u0653\u0651\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0656\3\2"+
		"\2\2\u0655\u0653\3\2\2\2\u0656\u0657\7\5\2\2\u0657\u0659\3\2\2\2\u0658"+
		"\u064b\3\2\2\2\u0658\u064c\3\2\2\2\u0659\u00b7\3\2\2\2\u065a\u065d\5\u00fc"+
		"\177\2\u065b\u065d\5\u00c6d\2\u065c\u065a\3\2\2\2\u065c\u065b\3\2\2\2"+
		"\u065d\u00b9\3\2\2\2\u065e\u065f\5\u00be`\2\u065f\u00bb\3\2\2\2\u0660"+
		"\u0665\5\u00ba^\2\u0661\u0662\7\4\2\2\u0662\u0664\5\u00ba^\2\u0663\u0661"+
		"\3\2\2\2\u0664\u0667\3\2\2\2\u0665\u0663\3\2\2\2\u0665\u0666\3\2\2\2\u0666"+
		"\u00bd\3\2\2\2\u0667\u0665\3\2\2\2\u0668\u0669\b`\1\2\u0669\u066a\7\u009a"+
		"\2\2\u066a\u0675\5\u00be`\7\u066b\u066c\7V\2\2\u066c\u066d\7\3\2\2\u066d"+
		"\u066e\5\26\f\2\u066e\u066f\7\5\2\2\u066f\u0675\3\2\2\2\u0670\u0672\5"+
		"\u00c2b\2\u0671\u0673\5\u00c0a\2\u0672\u0671\3\2\2\2\u0672\u0673\3\2\2"+
		"\2\u0673\u0675\3\2\2\2\u0674\u0668\3\2\2\2\u0674\u066b\3\2\2\2\u0674\u0670"+
		"\3\2\2\2\u0675\u067e\3\2\2\2\u0676\u0677\f\4\2\2\u0677\u0678\7\23\2\2"+
		"\u0678\u067d\5\u00be`\5\u0679\u067a\f\3\2\2\u067a\u067b\7\u00a2\2\2\u067b"+
		"\u067d\5\u00be`\4\u067c\u0676\3\2\2\2\u067c\u0679\3\2\2\2\u067d\u0680"+
		"\3\2\2\2\u067e\u067c\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u00bf\3\2\2\2\u0680"+
		"\u067e\3\2\2\2\u0681\u0683\7\u009a\2\2\u0682\u0681\3\2\2\2\u0682\u0683"+
		"\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0685\7\34\2\2\u0685\u0686\5\u00c2"+
		"b\2\u0686\u0687\7\23\2\2\u0687\u0688\5\u00c2b\2\u0688\u06d4\3\2\2\2\u0689"+
		"\u068b\7\u009a\2\2\u068a\u0689\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068c"+
		"\3\2\2\2\u068c\u068d\7s\2\2\u068d\u068e\7\3\2\2\u068e\u0693\5\u00ba^\2"+
		"\u068f\u0690\7\4\2\2\u0690\u0692\5\u00ba^\2\u0691\u068f\3\2\2\2\u0692"+
		"\u0695\3\2\2\2\u0693\u0691\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0696\3\2"+
		"\2\2\u0695\u0693\3\2\2\2\u0696\u0697\7\5\2\2\u0697\u06d4\3\2\2\2\u0698"+
		"\u069a\7\u009a\2\2\u0699\u0698\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u069b"+
		"\3\2\2\2\u069b\u069c\7s\2\2\u069c\u069d\7\3\2\2\u069d\u069e\5\26\f\2\u069e"+
		"\u069f\7\5\2\2\u069f\u06d4\3\2\2\2\u06a0\u06a2\7\u009a\2\2\u06a1\u06a0"+
		"\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a4\7\u00c7\2"+
		"\2\u06a4\u06d4\5\u00c2b\2\u06a5\u06a7\7\u009a\2\2\u06a6\u06a5\3\2\2\2"+
		"\u06a6\u06a7\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06a9\7\u0086\2\2\u06a9"+
		"\u06b7\t\n\2\2\u06aa\u06ab\7\3\2\2\u06ab\u06b8\7\5\2\2\u06ac\u06ad\7\3"+
		"\2\2\u06ad\u06b2\5\u00ba^\2\u06ae\u06af\7\4\2\2\u06af\u06b1\5\u00ba^\2"+
		"\u06b0\u06ae\3\2\2\2\u06b1\u06b4\3\2\2\2\u06b2\u06b0\3\2\2\2\u06b2\u06b3"+
		"\3\2\2\2\u06b3\u06b5\3\2\2\2\u06b4\u06b2\3\2\2\2\u06b5\u06b6\7\5\2\2\u06b6"+
		"\u06b8\3\2\2\2\u06b7\u06aa\3\2\2\2\u06b7\u06ac\3\2\2\2\u06b8\u06d4\3\2"+
		"\2\2\u06b9\u06bb\7\u009a\2\2\u06ba\u06b9\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb"+
		"\u06bc\3\2\2\2\u06bc\u06bd\7\u0086\2\2\u06bd\u06c0\5\u00c2b\2\u06be\u06bf"+
		"\7R\2\2\u06bf\u06c1\7\u0120\2\2\u06c0\u06be\3\2\2\2\u06c0\u06c1\3\2\2"+
		"\2\u06c1\u06d4\3\2\2\2\u06c2\u06c4\7}\2\2\u06c3\u06c5\7\u009a\2\2\u06c4"+
		"\u06c3\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06d4\7\u009b"+
		"\2\2\u06c7\u06c9\7}\2\2\u06c8\u06ca\7\u009a\2\2\u06c9\u06c8\3\2\2\2\u06c9"+
		"\u06ca\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06d4\t\13\2\2\u06cc\u06ce\7"+
		"}\2\2\u06cd\u06cf\7\u009a\2\2\u06ce\u06cd\3\2\2\2\u06ce\u06cf\3\2\2\2"+
		"\u06cf\u06d0\3\2\2\2\u06d0\u06d1\7L\2\2\u06d1\u06d2\7g\2\2\u06d2\u06d4"+
		"\5\u00c2b\2\u06d3\u0682\3\2\2\2\u06d3\u068a\3\2\2\2\u06d3\u0699\3\2\2"+
		"\2\u06d3\u06a1\3\2\2\2\u06d3\u06a6\3\2\2\2\u06d3\u06ba\3\2\2\2\u06d3\u06c2"+
		"\3\2\2\2\u06d3\u06c7\3\2\2\2\u06d3\u06cc\3\2\2\2\u06d4\u00c1\3\2\2\2\u06d5"+
		"\u06d6\bb\1\2\u06d6\u06da\5\u00c4c\2\u06d7\u06d8\t\f\2\2\u06d8\u06da\5"+
		"\u00c2b\t\u06d9\u06d5\3\2\2\2\u06d9\u06d7\3\2\2\2\u06da\u06f0\3\2\2\2"+
		"\u06db\u06dc\f\b\2\2\u06dc\u06dd\t\r\2\2\u06dd\u06ef\5\u00c2b\t\u06de"+
		"\u06df\f\7\2\2\u06df\u06e0\t\16\2\2\u06e0\u06ef\5\u00c2b\b\u06e1\u06e2"+
		"\f\6\2\2\u06e2\u06e3\7\u011c\2\2\u06e3\u06ef\5\u00c2b\7\u06e4\u06e5\f"+
		"\5\2\2\u06e5\u06e6\7\u011f\2\2\u06e6\u06ef\5\u00c2b\6\u06e7\u06e8\f\4"+
		"\2\2\u06e8\u06e9\7\u011d\2\2\u06e9\u06ef\5\u00c2b\5\u06ea\u06eb\f\3\2"+
		"\2\u06eb\u06ec\5\u00c8e\2\u06ec\u06ed\5\u00c2b\4\u06ed\u06ef\3\2\2\2\u06ee"+
		"\u06db\3\2\2\2\u06ee\u06de\3\2\2\2\u06ee\u06e1\3\2\2\2\u06ee\u06e4\3\2"+
		"\2\2\u06ee\u06e7\3\2\2\2\u06ee\u06ea\3\2\2\2\u06ef\u06f2\3\2\2\2\u06f0"+
		"\u06ee\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1\u00c3\3\2\2\2\u06f2\u06f0\3\2"+
		"\2\2\u06f3\u06f4\bc\1\2\u06f4\u07b0\t\17\2\2\u06f5\u06f7\7#\2\2\u06f6"+
		"\u06f8\5\u00ecw\2\u06f7\u06f6\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u06f7"+
		"\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u06fd\3\2\2\2\u06fb\u06fc\7P\2\2\u06fc"+
		"\u06fe\5\u00ba^\2\u06fd\u06fb\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u06ff"+
		"\3\2\2\2\u06ff\u0700\7Q\2\2\u0700\u07b0\3\2\2\2\u0701\u0702\7#\2\2\u0702"+
		"\u0704\5\u00ba^\2\u0703\u0705\5\u00ecw\2\u0704\u0703\3\2\2\2\u0705\u0706"+
		"\3\2\2\2\u0706\u0704\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u070a\3\2\2\2\u0708"+
		"\u0709\7P\2\2\u0709\u070b\5\u00ba^\2\u070a\u0708\3\2\2\2\u070a\u070b\3"+
		"\2\2\2\u070b\u070c\3\2\2\2\u070c\u070d\7Q\2\2\u070d\u07b0\3\2\2\2\u070e"+
		"\u070f\t\20\2\2\u070f\u0710\7\3\2\2\u0710\u0711\5\u00ba^\2\u0711\u0712"+
		"\7\30\2\2\u0712\u0713\5\u00dep\2\u0713\u0714\7\5\2\2\u0714\u07b0\3\2\2"+
		"\2\u0715\u0716\7\u00e2\2\2\u0716\u071f\7\3\2\2\u0717\u071c\5\u00aeX\2"+
		"\u0718\u0719\7\4\2\2\u0719\u071b\5\u00aeX\2\u071a\u0718\3\2\2\2\u071b"+
		"\u071e\3\2\2\2\u071c\u071a\3\2\2\2\u071c\u071d\3\2\2\2\u071d\u0720\3\2"+
		"\2\2\u071e\u071c\3\2\2\2\u071f\u0717\3\2\2\2\u071f\u0720\3\2\2\2\u0720"+
		"\u0721\3\2\2\2\u0721\u07b0\7\5\2\2\u0722\u0723\7a\2\2\u0723\u0724\7\3"+
		"\2\2\u0724\u0727\5\u00ba^\2\u0725\u0726\7q\2\2\u0726\u0728\7\u009c\2\2"+
		"\u0727\u0725\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u072a"+
		"\7\5\2\2\u072a\u07b0\3\2\2\2\u072b\u072c\7\u0081\2\2\u072c\u072d\7\3\2"+
		"\2\u072d\u0730\5\u00ba^\2\u072e\u072f\7q\2\2\u072f\u0731\7\u009c\2\2\u0730"+
		"\u072e\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0733\7\5"+
		"\2\2\u0733\u07b0\3\2\2\2\u0734\u0735\7\u00b1\2\2\u0735\u0736\7\3\2\2\u0736"+
		"\u0737\5\u00c2b\2\u0737\u0738\7s\2\2\u0738\u0739\5\u00c2b\2\u0739\u073a"+
		"\7\5\2\2\u073a\u07b0\3\2\2\2\u073b\u07b0\5\u00c6d\2\u073c\u07b0\7\u0118"+
		"\2\2\u073d\u073e\5\u00fc\177\2\u073e\u073f\7\6\2\2\u073f\u0740\7\u0118"+
		"\2\2\u0740\u07b0\3\2\2\2\u0741\u0742\7\3\2\2\u0742\u0745\5\u00aeX\2\u0743"+
		"\u0744\7\4\2\2\u0744\u0746\5\u00aeX\2\u0745\u0743\3\2\2\2\u0746\u0747"+
		"\3\2\2\2\u0747\u0745\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u0749\3\2\2\2\u0749"+
		"\u074a\7\5\2\2\u074a\u07b0\3\2\2\2\u074b\u074c\7\3\2\2\u074c\u074d\5\26"+
		"\f\2\u074d\u074e\7\5\2\2\u074e\u07b0\3\2\2\2\u074f\u0750\5\u00fa~\2\u0750"+
		"\u075c\7\3\2\2\u0751\u0753\5\u0082B\2\u0752\u0751\3\2\2\2\u0752\u0753"+
		"\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0759\5\u00ba^\2\u0755\u0756\7\4\2"+
		"\2\u0756\u0758\5\u00ba^\2\u0757\u0755\3\2\2\2\u0758\u075b\3\2\2\2\u0759"+
		"\u0757\3\2\2\2\u0759\u075a\3\2\2\2\u075a\u075d\3\2\2\2\u075b\u0759\3\2"+
		"\2\2\u075c\u0752\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u075e\3\2\2\2\u075e"+
		"\u0765\7\5\2\2\u075f\u0760\7_\2\2\u0760\u0761\7\3\2\2\u0761\u0762\7\u0109"+
		"\2\2\u0762\u0763\5\u00be`\2\u0763\u0764\7\5\2\2\u0764\u0766\3\2\2\2\u0765"+
		"\u075f\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0769\3\2\2\2\u0767\u0768\t\21"+
		"\2\2\u0768\u076a\7\u009c\2\2\u0769\u0767\3\2\2\2\u0769\u076a\3\2\2\2\u076a"+
		"\u076d\3\2\2\2\u076b\u076c\7\u00a7\2\2\u076c\u076e\5\u00f2z\2\u076d\u076b"+
		"\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u07b0\3\2\2\2\u076f\u0770\5\u0102\u0082"+
		"\2\u0770\u0771\7\t\2\2\u0771\u0772\5\u00ba^\2\u0772\u07b0\3\2\2\2\u0773"+
		"\u0774\7\3\2\2\u0774\u0777\5\u0102\u0082\2\u0775\u0776\7\4\2\2\u0776\u0778"+
		"\5\u0102\u0082\2\u0777\u0775\3\2\2\2\u0778\u0779\3\2\2\2\u0779\u0777\3"+
		"\2\2\2\u0779\u077a\3\2\2\2\u077a\u077b\3\2\2\2\u077b\u077c\7\5\2\2\u077c"+
		"\u077d\7\t\2\2\u077d\u077e\5\u00ba^\2\u077e\u07b0\3\2\2\2\u077f\u07b0"+
		"\5\u0102\u0082\2\u0780\u0781\7\3\2\2\u0781\u0782\5\u00ba^\2\u0782\u0783"+
		"\7\5\2\2\u0783\u07b0\3\2\2\2\u0784\u0785\7[\2\2\u0785\u0786\7\3\2\2\u0786"+
		"\u0787\5\u0102\u0082\2\u0787\u0788\7g\2\2\u0788\u0789\5\u00c2b\2\u0789"+
		"\u078a\7\5\2\2\u078a\u07b0\3\2\2\2\u078b\u078c\t\22\2\2\u078c\u078d\7"+
		"\3\2\2\u078d\u078e\5\u00c2b\2\u078e\u078f\t\23\2\2\u078f\u0792\5\u00c2"+
		"b\2\u0790\u0791\t\24\2\2\u0791\u0793\5\u00c2b\2\u0792\u0790\3\2\2\2\u0792"+
		"\u0793\3\2\2\2\u0793\u0794\3\2\2\2\u0794\u0795\7\5\2\2\u0795\u07b0\3\2"+
		"\2\2\u0796\u0797\7\u00f4\2\2\u0797\u0799\7\3\2\2\u0798\u079a\t\25\2\2"+
		"\u0799\u0798\3\2\2\2\u0799\u079a\3\2\2\2\u079a\u079c\3\2\2\2\u079b\u079d"+
		"\5\u00c2b\2\u079c\u079b\3\2\2\2\u079c\u079d\3\2\2\2\u079d\u079e\3\2\2"+
		"\2\u079e\u079f\7g\2\2\u079f\u07a0\5\u00c2b\2\u07a0\u07a1\7\5\2\2\u07a1"+
		"\u07b0\3\2\2\2\u07a2\u07a3\7\u00a9\2\2\u07a3\u07a4\7\3\2\2\u07a4\u07a5"+
		"\5\u00c2b\2\u07a5\u07a6\7\u00b0\2\2\u07a6\u07a7\5\u00c2b\2\u07a7\u07a8"+
		"\7g\2\2\u07a8\u07ab\5\u00c2b\2\u07a9\u07aa\7c\2\2\u07aa\u07ac\5\u00c2"+
		"b\2\u07ab\u07a9\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac\u07ad\3\2\2\2\u07ad"+
		"\u07ae\7\5\2\2\u07ae\u07b0\3\2\2\2\u07af\u06f3\3\2\2\2\u07af\u06f5\3\2"+
		"\2\2\u07af\u0701\3\2\2\2\u07af\u070e\3\2\2\2\u07af\u0715\3\2\2\2\u07af"+
		"\u0722\3\2\2\2\u07af\u072b\3\2\2\2\u07af\u0734\3\2\2\2\u07af\u073b\3\2"+
		"\2\2\u07af\u073c\3\2\2\2\u07af\u073d\3\2\2\2\u07af\u0741\3\2\2\2\u07af"+
		"\u074b\3\2\2\2\u07af\u074f\3\2\2\2\u07af\u076f\3\2\2\2\u07af\u0773\3\2"+
		"\2\2\u07af\u077f\3\2\2\2\u07af\u0780\3\2\2\2\u07af\u0784\3\2\2\2\u07af"+
		"\u078b\3\2\2\2\u07af\u0796\3\2\2\2\u07af\u07a2\3\2\2\2\u07b0\u07bb\3\2"+
		"\2\2\u07b1\u07b2\f\n\2\2\u07b2\u07b3\7\n\2\2\u07b3\u07b4\5\u00c2b\2\u07b4"+
		"\u07b5\7\13\2\2\u07b5\u07ba\3\2\2\2\u07b6\u07b7\f\b\2\2\u07b7\u07b8\7"+
		"\6\2\2\u07b8\u07ba\5\u0102\u0082\2\u07b9\u07b1\3\2\2\2\u07b9\u07b6\3\2"+
		"\2\2\u07ba\u07bd\3\2\2\2\u07bb\u07b9\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc"+
		"\u00c5\3\2\2\2\u07bd\u07bb\3\2\2\2\u07be\u07cb\7\u009b\2\2\u07bf\u07cb"+
		"\5\u00d0i\2\u07c0\u07c1\5\u0102\u0082\2\u07c1\u07c2\7\u0120\2\2\u07c2"+
		"\u07cb\3\2\2\2\u07c3\u07cb\5\u0108\u0085\2\u07c4\u07cb\5\u00ceh\2\u07c5"+
		"\u07c7\7\u0120\2\2\u07c6\u07c5\3\2\2\2\u07c7\u07c8\3\2\2\2\u07c8\u07c6"+
		"\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07cb\3\2\2\2\u07ca\u07be\3\2\2\2\u07ca"+
		"\u07bf\3\2\2\2\u07ca\u07c0\3\2\2\2\u07ca\u07c3\3\2\2\2\u07ca\u07c4\3\2"+
		"\2\2\u07ca\u07c6\3\2\2\2\u07cb\u00c7\3\2\2\2\u07cc\u07cd\t\26\2\2\u07cd"+
		"\u00c9\3\2\2\2\u07ce\u07cf\t\27\2\2\u07cf\u00cb\3\2\2\2\u07d0\u07d1\t"+
		"\30\2\2\u07d1\u00cd\3\2\2\2\u07d2\u07d3\t\31\2\2\u07d3\u00cf\3\2\2\2\u07d4"+
		"\u07d7\7{\2\2\u07d5\u07d8\5\u00d2j\2\u07d6\u07d8\5\u00d6l\2\u07d7\u07d5"+
		"\3\2\2\2\u07d7\u07d6\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u00d1\3\2\2\2\u07d9"+
		"\u07db\5\u00d4k\2\u07da\u07dc\5\u00d8m\2\u07db\u07da\3\2\2\2\u07db\u07dc"+
		"\3\2\2\2\u07dc\u00d3\3\2\2\2\u07dd\u07de\5\u00dan\2\u07de\u07df\5\u0102"+
		"\u0082\2\u07df\u07e1\3\2\2\2\u07e0\u07dd\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2"+
		"\u07e0\3\2\2\2\u07e2\u07e3\3\2\2\2\u07e3\u00d5\3\2\2\2\u07e4\u07e7\5\u00d8"+
		"m\2\u07e5\u07e8\5\u00d4k\2\u07e6\u07e8\5\u00d8m\2\u07e7\u07e5\3\2\2\2"+
		"\u07e7\u07e6\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u00d7\3\2\2\2\u07e9\u07ea"+
		"\5\u00dan\2\u07ea\u07eb\5\u0102\u0082\2\u07eb\u07ec\7\u00ee\2\2\u07ec"+
		"\u07ed\5\u0102\u0082\2\u07ed\u00d9\3\2\2\2\u07ee\u07f0\t\32\2\2\u07ef"+
		"\u07ee\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f2\t\33"+
		"\2\2\u07f2\u00db\3\2\2\2\u07f3\u07f7\7a\2\2\u07f4\u07f5\7\17\2\2\u07f5"+
		"\u07f7\5\u00fe\u0080\2\u07f6\u07f3\3\2\2\2\u07f6\u07f4\3\2\2\2\u07f7\u00dd"+
		"\3\2\2\2\u07f8\u07f9\7\27\2\2\u07f9\u07fa\7\u0112\2\2\u07fa\u07fb\5\u00de"+
		"p\2\u07fb\u07fc\7\u0114\2\2\u07fc\u0823\3\2\2\2\u07fd\u07fe\7\u0091\2"+
		"\2\u07fe\u07ff\7\u0112\2\2\u07ff\u0800\5\u00dep\2\u0800\u0801\7\4\2\2"+
		"\u0801\u0802\5\u00dep\2\u0802\u0803\7\u0114\2\2\u0803\u0823\3\2\2\2\u0804"+
		"\u080b\7\u00e2\2\2\u0805\u0807\7\u0112\2\2\u0806\u0808\5\u00e8u\2\u0807"+
		"\u0806\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u0809\3\2\2\2\u0809\u080c\7\u0114"+
		"\2\2\u080a\u080c\7\u0110\2\2\u080b\u0805\3\2\2\2\u080b\u080a\3\2\2\2\u080c"+
		"\u0823\3\2\2\2\u080d\u080e\7{\2\2\u080e\u080f\7\u010c\2\2\u080f\u0810"+
		"\7\u00ee\2\2\u0810\u0823\7\u0094\2\2\u0811\u0812\7{\2\2\u0812\u0813\7"+
		"?\2\2\u0813\u0814\7\u00ee\2\2\u0814\u0823\7\u00ce\2\2\u0815\u0820\5\u0102"+
		"\u0082\2\u0816\u0817\7\3\2\2\u0817\u081c\7\u0124\2\2\u0818\u0819\7\4\2"+
		"\2\u0819\u081b\7\u0124\2\2\u081a\u0818\3\2\2\2\u081b\u081e\3\2\2\2\u081c"+
		"\u081a\3\2\2\2\u081c\u081d\3\2\2\2\u081d\u081f\3\2\2\2\u081e\u081c\3\2"+
		"\2\2\u081f\u0821\7\5\2\2\u0820\u0816\3\2\2\2\u0820\u0821\3\2\2\2\u0821"+
		"\u0823\3\2\2\2\u0822\u07f8\3\2\2\2\u0822\u07fd\3\2\2\2\u0822\u0804\3\2"+
		"\2\2\u0822\u080d\3\2\2\2\u0822\u0811\3\2\2\2\u0822\u0815\3\2\2\2\u0823"+
		"\u00df\3\2\2\2\u0824\u0829\5\u00e2r\2\u0825\u0826\7\4\2\2\u0826\u0828"+
		"\5\u00e2r\2\u0827\u0825\3\2\2\2\u0828\u082b\3\2\2\2\u0829\u0827\3\2\2"+
		"\2\u0829\u082a\3\2\2\2\u082a\u00e1\3\2\2\2\u082b\u0829\3\2\2\2\u082c\u082d"+
		"\5\u00a8U\2\u082d\u0830\5\u00dep\2\u082e\u082f\7\u009a\2\2\u082f\u0831"+
		"\7\u009b\2\2\u0830\u082e\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u0833\3\2\2"+
		"\2\u0832\u0834\5\24\13\2\u0833\u0832\3\2\2\2\u0833\u0834\3\2\2\2\u0834"+
		"\u0836\3\2\2\2\u0835\u0837\5\u00dco\2\u0836\u0835\3\2\2\2\u0836\u0837"+
		"\3\2\2\2\u0837\u00e3\3\2\2\2\u0838\u083d\5\u00e6t\2\u0839\u083a\7\4\2"+
		"\2\u083a\u083c\5\u00e6t\2\u083b\u0839\3\2\2\2\u083c\u083f\3\2\2\2\u083d"+
		"\u083b\3\2\2\2\u083d\u083e\3\2\2\2\u083e\u00e5\3\2\2\2\u083f\u083d\3\2"+
		"\2\2\u0840\u0841\5\u00fe\u0080\2\u0841\u0844\5\u00dep\2\u0842\u0843\7"+
		"\u009a\2\2\u0843\u0845\7\u009b\2\2\u0844\u0842\3\2\2\2\u0844\u0845\3\2"+
		"\2\2\u0845\u0847\3\2\2\2\u0846\u0848\5\24\13\2\u0847\u0846\3\2\2\2\u0847"+
		"\u0848\3\2\2\2\u0848\u00e7\3\2\2\2\u0849\u084e\5\u00eav\2\u084a\u084b"+
		"\7\4\2\2\u084b\u084d\5\u00eav\2\u084c\u084a\3\2\2\2\u084d\u0850\3\2\2"+
		"\2\u084e\u084c\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u00e9\3\2\2\2\u0850\u084e"+
		"\3\2\2\2\u0851\u0852\5\u0102\u0082\2\u0852\u0853\7\f\2\2\u0853\u0856\5"+
		"\u00dep\2\u0854\u0855\7\u009a\2\2\u0855\u0857\7\u009b\2\2\u0856\u0854"+
		"\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u0859\3\2\2\2\u0858\u085a\5\24\13\2"+
		"\u0859\u0858\3\2\2\2\u0859\u085a\3\2\2\2\u085a\u00eb\3\2\2\2\u085b\u085c"+
		"\7\u0108\2\2\u085c\u085d\5\u00ba^\2\u085d\u085e\7\u00ec\2\2\u085e\u085f"+
		"\5\u00ba^\2\u085f\u00ed\3\2\2\2\u0860\u0861\7\u010a\2\2\u0861\u0866\5"+
		"\u00f0y\2\u0862\u0863\7\4\2\2\u0863\u0865\5\u00f0y\2\u0864\u0862\3\2\2"+
		"\2\u0865\u0868\3\2\2\2\u0866\u0864\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u00ef"+
		"\3\2\2\2\u0868\u0866\3\2\2\2\u0869\u086a\5\u00fe\u0080\2\u086a\u086b\7"+
		"\30\2\2\u086b\u086c\5\u00f2z\2\u086c\u00f1\3\2\2\2\u086d\u089c\5\u00fe"+
		"\u0080\2\u086e\u086f\7\3\2\2\u086f\u0870\5\u00fe\u0080\2\u0870\u0871\7"+
		"\5\2\2\u0871\u089c\3\2\2\2\u0872\u0895\7\3\2\2\u0873\u0874\7(\2\2\u0874"+
		"\u0875\7 \2\2\u0875\u087a\5\u00ba^\2\u0876\u0877\7\4\2\2\u0877\u0879\5"+
		"\u00ba^\2\u0878\u0876\3\2\2\2\u0879\u087c\3\2\2\2\u087a\u0878\3\2\2\2"+
		"\u087a\u087b\3\2\2\2\u087b\u0896\3\2\2\2\u087c\u087a\3\2\2\2\u087d\u087e"+
		"\t\34\2\2\u087e\u087f\7 \2\2\u087f\u0884\5\u00ba^\2\u0880\u0881\7\4\2"+
		"\2\u0881\u0883\5\u00ba^\2\u0882\u0880\3\2\2\2\u0883\u0886\3\2\2\2\u0884"+
		"\u0882\3\2\2\2\u0884\u0885\3\2\2\2\u0885\u0888\3\2\2\2\u0886\u0884\3\2"+
		"\2\2\u0887\u087d\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u0893\3\2\2\2\u0889"+
		"\u088a\t\35\2\2\u088a\u088b\7 \2\2\u088b\u0890\5L\'\2\u088c\u088d\7\4"+
		"\2\2\u088d\u088f\5L\'\2\u088e\u088c\3\2\2\2\u088f\u0892\3\2\2\2\u0890"+
		"\u088e\3\2\2\2\u0890\u0891\3\2\2\2\u0891\u0894\3\2\2\2\u0892\u0890\3\2"+
		"\2\2\u0893\u0889\3\2\2\2\u0893\u0894\3\2\2\2\u0894\u0896\3\2\2\2\u0895"+
		"\u0873\3\2\2\2\u0895\u0887\3\2\2\2\u0896\u0898\3\2\2\2\u0897\u0899\5\u00f4"+
		"{\2\u0898\u0897\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u089a\3\2\2\2\u089a"+
		"\u089c\7\5\2\2\u089b\u086d\3\2\2\2\u089b\u086e\3\2\2\2\u089b\u0872\3\2"+
		"\2\2\u089c\u00f3\3\2\2\2\u089d\u089e\7\u00b8\2\2\u089e\u08ae\5\u00f6|"+
		"\2\u089f\u08a0\7\u00cd\2\2\u08a0\u08ae\5\u00f6|\2\u08a1\u08a2\7\u00b8"+
		"\2\2\u08a2\u08a3\7\34\2\2\u08a3\u08a4\5\u00f6|\2\u08a4\u08a5\7\23\2\2"+
		"\u08a5\u08a6\5\u00f6|\2\u08a6\u08ae\3\2\2\2\u08a7\u08a8\7\u00cd\2\2\u08a8"+
		"\u08a9\7\34\2\2\u08a9\u08aa\5\u00f6|\2\u08aa\u08ab\7\23\2\2\u08ab\u08ac"+
		"\5\u00f6|\2\u08ac\u08ae\3\2\2\2\u08ad\u089d\3\2\2\2\u08ad\u089f\3\2\2"+
		"\2\u08ad\u08a1\3\2\2\2\u08ad\u08a7\3\2\2\2\u08ae\u00f5\3\2\2\2\u08af\u08b0"+
		"\7\u00fa\2\2\u08b0\u08b7\t\36\2\2\u08b1\u08b2\7:\2\2\u08b2\u08b7\7\u00cc"+
		"\2\2\u08b3\u08b4\5\u00ba^\2\u08b4\u08b5\t\36\2\2\u08b5\u08b7\3\2\2\2\u08b6"+
		"\u08af\3\2\2\2\u08b6\u08b1\3\2\2\2\u08b6\u08b3\3\2\2\2\u08b7\u00f7\3\2"+
		"\2\2\u08b8\u08bd\5\u00fc\177\2\u08b9\u08ba\7\4\2\2\u08ba\u08bc\5\u00fc"+
		"\177\2\u08bb\u08b9\3\2\2\2\u08bc\u08bf\3\2\2\2\u08bd\u08bb\3\2\2\2\u08bd"+
		"\u08be\3\2\2\2\u08be\u00f9\3\2\2\2\u08bf\u08bd\3\2\2\2\u08c0\u08c5\5\u00fc"+
		"\177\2\u08c1\u08c5\7_\2\2\u08c2\u08c5\7\u0085\2\2\u08c3\u08c5\7\u00c6"+
		"\2\2\u08c4\u08c0\3\2\2\2\u08c4\u08c1\3\2\2\2\u08c4\u08c2\3\2\2\2\u08c4"+
		"\u08c3\3\2\2\2\u08c5\u00fb\3\2\2\2\u08c6\u08cb\5\u0102\u0082\2\u08c7\u08c8"+
		"\7\6\2\2\u08c8\u08ca\5\u0102\u0082\2\u08c9\u08c7\3\2\2\2\u08ca\u08cd\3"+
		"\2\2\2\u08cb\u08c9\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc\u00fd\3\2\2\2\u08cd"+
		"\u08cb\3\2\2\2\u08ce\u08cf\5\u0102\u0082\2\u08cf\u08d0\5\u0100\u0081\2"+
		"\u08d0\u00ff\3\2\2\2\u08d1\u08d2\7\u0117\2\2\u08d2\u08d4\5\u0102\u0082"+
		"\2\u08d3\u08d1\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5\u08d3\3\2\2\2\u08d5\u08d6"+
		"\3\2\2\2\u08d6\u08d9\3\2\2\2\u08d7\u08d9\3\2\2\2\u08d8\u08d3\3\2\2\2\u08d8"+
		"\u08d7\3\2\2\2\u08d9\u0101\3\2\2\2\u08da\u08de\5\u0104\u0083\2\u08db\u08dc"+
		"\6\u0082\22\2\u08dc\u08de\5\u010e\u0088\2\u08dd\u08da\3\2\2\2\u08dd\u08db"+
		"\3\2\2\2\u08de\u0103\3\2\2\2\u08df\u08e6\7\u012a\2\2\u08e0\u08e6\5\u0106"+
		"\u0084\2\u08e1\u08e2\6\u0083\23\2\u08e2\u08e6\5\u010c\u0087\2\u08e3\u08e4"+
		"\6\u0083\24\2\u08e4\u08e6\5\u0110\u0089\2\u08e5\u08df\3\2\2\2\u08e5\u08e0"+
		"\3\2\2\2\u08e5\u08e1\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e6\u0105\3\2\2\2\u08e7"+
		"\u08e8\7\u012b\2\2\u08e8\u0107\3\2\2\2\u08e9\u08eb\6\u0085\25\2\u08ea"+
		"\u08ec\7\u0117\2\2\u08eb\u08ea\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u08ed"+
		"\3\2\2\2\u08ed\u0915\7\u0125\2\2\u08ee\u08f0\6\u0085\26\2\u08ef\u08f1"+
		"\7\u0117\2\2\u08f0\u08ef\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u08f2\3\2\2"+
		"\2\u08f2\u0915\7\u0126\2\2\u08f3\u08f5\6\u0085\27\2\u08f4\u08f6\7\u0117"+
		"\2\2\u08f5\u08f4\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6\u08f7\3\2\2\2\u08f7"+
		"\u0915\t\37\2\2\u08f8\u08fa\7\u0117\2\2\u08f9\u08f8\3\2\2\2\u08f9\u08fa"+
		"\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u0915\7\u0124\2\2\u08fc\u08fe\7\u0117"+
		"\2\2\u08fd\u08fc\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff"+
		"\u0915\7\u0121\2\2\u0900\u0902\7\u0117\2\2\u0901\u0900\3\2\2\2\u0901\u0902"+
		"\3\2\2\2\u0902\u0903\3\2\2\2\u0903\u0915\7\u0122\2\2\u0904\u0906\7\u0117"+
		"\2\2\u0905\u0904\3\2\2\2\u0905\u0906\3\2\2\2\u0906\u0907\3\2\2\2\u0907"+
		"\u0915\7\u0123\2\2\u0908\u090a\7\u0117\2\2\u0909\u0908\3\2\2\2\u0909\u090a"+
		"\3\2\2\2\u090a\u090b\3\2\2\2\u090b\u0915\7\u0128\2\2\u090c\u090e\7\u0117"+
		"\2\2\u090d\u090c\3\2\2\2\u090d\u090e\3\2\2\2\u090e\u090f\3\2\2\2\u090f"+
		"\u0915\7\u0127\2\2\u0910\u0912\7\u0117\2\2\u0911\u0910\3\2\2\2\u0911\u0912"+
		"\3\2\2\2\u0912\u0913\3\2\2\2\u0913\u0915\7\u0129\2\2\u0914\u08e9\3\2\2"+
		"\2\u0914\u08ee\3\2\2\2\u0914\u08f3\3\2\2\2\u0914\u08f9\3\2\2\2\u0914\u08fd"+
		"\3\2\2\2\u0914\u0901\3\2\2\2\u0914\u0905\3\2\2\2\u0914\u0909\3\2\2\2\u0914"+
		"\u090d\3\2\2\2\u0914\u0911\3\2\2\2\u0915\u0109\3\2\2\2\u0916\u0917\7\u00f8"+
		"\2\2\u0917\u091e\5\u00dep\2\u0918\u091e\5\24\13\2\u0919\u091e\5\u00dc"+
		"o\2\u091a\u091b\t \2\2\u091b\u091c\7\u009a\2\2\u091c\u091e\7\u009b\2\2"+
		"\u091d\u0916\3\2\2\2\u091d\u0918\3\2\2\2\u091d\u0919\3\2\2\2\u091d\u091a"+
		"\3\2\2\2\u091e\u010b\3\2\2\2\u091f\u0920\t!\2\2\u0920\u010d\3\2\2\2\u0921"+
		"\u0922\t\"\2\2\u0922\u010f\3\2\2\2\u0923\u0924\t#\2\2\u0924\u0111\3\2"+
		"\2\2\u012a\u0124\u0128\u012f\u01a3\u01ab\u01b3\u01bc\u01c6\u01ca\u01d6"+
		"\u01e2\u01e7\u01f0\u01f8\u01ff\u0201\u0204\u0209\u020d\u0212\u0215\u021a"+
		"\u021f\u0222\u0227\u022b\u0230\u0232\u0236\u023f\u0247\u0250\u0257\u0260"+
		"\u0265\u0268\u027e\u0280\u0289\u0290\u0293\u029a\u029e\u02a4\u02ac\u02b7"+
		"\u02c2\u02c9\u02cf\u02dc\u02e3\u02ea\u02f6\u02fe\u0304\u0307\u0310\u0313"+
		"\u031c\u031f\u0328\u032b\u0334\u0337\u033a\u033f\u0341\u034d\u0354\u035b"+
		"\u035e\u0360\u036c\u0370\u0374\u037a\u037e\u0386\u038a\u038d\u0390\u0393"+
		"\u0397\u039b\u03a0\u03a4\u03a7\u03aa\u03ad\u03b1\u03b6\u03ba\u03bd\u03c0"+
		"\u03c3\u03c5\u03cb\u03d2\u03d7\u03da\u03dd\u03e1\u03eb\u03ef\u03f1\u03f4"+
		"\u03f8\u03fe\u0402\u040d\u0417\u0423\u0432\u0437\u043e\u044e\u0453\u0460"+
		"\u0465\u046d\u0473\u0477\u0480\u048a\u0499\u049e\u04a0\u04a4\u04ad\u04ba"+
		"\u04bf\u04c3\u04cb\u04ce\u04d2\u04e0\u04ed\u04f2\u04f6\u04f9\u04fe\u0507"+
		"\u050a\u050f\u0516\u0519\u0521\u0528\u052f\u0532\u0537\u053a\u053f\u0543"+
		"\u0546\u0549\u054f\u0554\u0559\u056b\u056d\u0570\u057b\u0584\u058b\u0593"+
		"\u059a\u059e\u05a6\u05ae\u05b4\u05bc\u05c8\u05cb\u05d1\u05d5\u05d7\u05e0"+
		"\u05ec\u05ee\u05f5\u05fc\u0602\u0608\u060a\u0611\u0619\u061f\u0626\u062c"+
		"\u0630\u0632\u0639\u0642\u0649\u0653\u0658\u065c\u0665\u0672\u0674\u067c"+
		"\u067e\u0682\u068a\u0693\u0699\u06a1\u06a6\u06b2\u06b7\u06ba\u06c0\u06c4"+
		"\u06c9\u06ce\u06d3\u06d9\u06ee\u06f0\u06f9\u06fd\u0706\u070a\u071c\u071f"+
		"\u0727\u0730\u0747\u0752\u0759\u075c\u0765\u0769\u076d\u0779\u0792\u0799"+
		"\u079c\u07ab\u07af\u07b9\u07bb\u07c8\u07ca\u07d7\u07db\u07e2\u07e7\u07ef"+
		"\u07f6\u0807\u080b\u081c\u0820\u0822\u0829\u0830\u0833\u0836\u083d\u0844"+
		"\u0847\u084e\u0856\u0859\u0866\u087a\u0884\u0887\u0890\u0893\u0895\u0898"+
		"\u089b\u08ad\u08b6\u08bd\u08c4\u08cb\u08d5\u08d8\u08dd\u08e5\u08eb\u08f0"+
		"\u08f5\u08f9\u08fd\u0901\u0905\u0909\u090d\u0911\u0914\u091d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}