// Generated from D:/My Essay Solidity tool/SolidityToMCRL2/src/Main/Grammar/Solidity.g4 by ANTLR 4.13.1
package Main.Grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, Int=98, Uint=99, Byte=100, Fixed=101, Ufixed=102, 
		BooleanLiteral=103, DecimalNumber=104, HexNumber=105, NumberUnit=106, 
		HexLiteralFragment=107, ReservedKeyword=108, AnonymousKeyword=109, BreakKeyword=110, 
		ConstantKeyword=111, ImmutableKeyword=112, ContinueKeyword=113, LeaveKeyword=114, 
		ExternalKeyword=115, IndexedKeyword=116, InternalKeyword=117, PayableKeyword=118, 
		PrivateKeyword=119, PublicKeyword=120, VirtualKeyword=121, PureKeyword=122, 
		TypeKeyword=123, ViewKeyword=124, GlobalKeyword=125, ConstructorKeyword=126, 
		FallbackKeyword=127, ReceiveKeyword=128, Identifier=129, StringLiteralFragment=130, 
		VersionLiteral=131, WS=132, COMMENT=133, LINE_COMMENT=134;
	public static final int
		RULE_sourceUnit = 0, RULE_pragmaDirective = 1, RULE_pragmaName = 2, RULE_pragmaValue = 3, 
		RULE_version = 4, RULE_versionOperator = 5, RULE_versionConstraint = 6, 
		RULE_importDeclaration = 7, RULE_importDirective = 8, RULE_importPath = 9, 
		RULE_contractDefinition = 10, RULE_inheritanceSpecifier = 11, RULE_contractPart = 12, 
		RULE_stateVariableDeclaration = 13, RULE_fileLevelConstant = 14, RULE_customErrorDefinition = 15, 
		RULE_typeDefinition = 16, RULE_usingForDeclaration = 17, RULE_usingForObject = 18, 
		RULE_usingForObjectDirective = 19, RULE_userDefinableOperators = 20, RULE_structDefinition = 21, 
		RULE_modifierDefinition = 22, RULE_modifierInvocation = 23, RULE_functionDefinition = 24, 
		RULE_functionDescriptor = 25, RULE_returnParameters = 26, RULE_modifierList = 27, 
		RULE_eventDefinition = 28, RULE_enumValue = 29, RULE_enumDefinition = 30, 
		RULE_parameterList = 31, RULE_parameter = 32, RULE_eventParameterList = 33, 
		RULE_eventParameter = 34, RULE_functionTypeParameterList = 35, RULE_functionTypeParameter = 36, 
		RULE_variableDeclaration = 37, RULE_typeName = 38, RULE_userDefinedTypeName = 39, 
		RULE_mappingKey = 40, RULE_mapping = 41, RULE_mappingKeyName = 42, RULE_mappingValueName = 43, 
		RULE_functionTypeName = 44, RULE_storageLocation = 45, RULE_stateMutability = 46, 
		RULE_block = 47, RULE_statement = 48, RULE_expressionStatement = 49, RULE_ifStatement = 50, 
		RULE_tryStatement = 51, RULE_catchClause = 52, RULE_whileStatement = 53, 
		RULE_simpleStatement = 54, RULE_uncheckedStatement = 55, RULE_forStatement = 56, 
		RULE_inlineAssemblyStatement = 57, RULE_inlineAssemblyStatementFlag = 58, 
		RULE_doWhileStatement = 59, RULE_continueStatement = 60, RULE_breakStatement = 61, 
		RULE_returnStatement = 62, RULE_throwStatement = 63, RULE_emitStatement = 64, 
		RULE_revertStatement = 65, RULE_variableDeclarationStatement = 66, RULE_variableDeclarationList = 67, 
		RULE_identifierList = 68, RULE_elementaryTypeName = 69, RULE_expression = 70, 
		RULE_primaryExpression = 71, RULE_expressionList = 72, RULE_nameValueList = 73, 
		RULE_nameValue = 74, RULE_functionCallArguments = 75, RULE_functionCall = 76, 
		RULE_assemblyBlock = 77, RULE_assemblyItem = 78, RULE_assemblyExpression = 79, 
		RULE_assemblyMember = 80, RULE_assemblyCall = 81, RULE_assemblyLocalDefinition = 82, 
		RULE_assemblyAssignment = 83, RULE_assemblyIdentifierOrList = 84, RULE_assemblyIdentifierList = 85, 
		RULE_assemblyStackAssignment = 86, RULE_labelDefinition = 87, RULE_assemblySwitch = 88, 
		RULE_assemblyCase = 89, RULE_assemblyFunctionDefinition = 90, RULE_assemblyFunctionReturns = 91, 
		RULE_assemblyFor = 92, RULE_assemblyIf = 93, RULE_assemblyLiteral = 94, 
		RULE_tupleExpression = 95, RULE_numberLiteral = 96, RULE_identifier = 97, 
		RULE_hexLiteral = 98, RULE_overrideSpecifier = 99, RULE_stringLiteral = 100;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "pragmaDirective", "pragmaName", "pragmaValue", "version", 
			"versionOperator", "versionConstraint", "importDeclaration", "importDirective", 
			"importPath", "contractDefinition", "inheritanceSpecifier", "contractPart", 
			"stateVariableDeclaration", "fileLevelConstant", "customErrorDefinition", 
			"typeDefinition", "usingForDeclaration", "usingForObject", "usingForObjectDirective", 
			"userDefinableOperators", "structDefinition", "modifierDefinition", "modifierInvocation", 
			"functionDefinition", "functionDescriptor", "returnParameters", "modifierList", 
			"eventDefinition", "enumValue", "enumDefinition", "parameterList", "parameter", 
			"eventParameterList", "eventParameter", "functionTypeParameterList", 
			"functionTypeParameter", "variableDeclaration", "typeName", "userDefinedTypeName", 
			"mappingKey", "mapping", "mappingKeyName", "mappingValueName", "functionTypeName", 
			"storageLocation", "stateMutability", "block", "statement", "expressionStatement", 
			"ifStatement", "tryStatement", "catchClause", "whileStatement", "simpleStatement", 
			"uncheckedStatement", "forStatement", "inlineAssemblyStatement", "inlineAssemblyStatementFlag", 
			"doWhileStatement", "continueStatement", "breakStatement", "returnStatement", 
			"throwStatement", "emitStatement", "revertStatement", "variableDeclarationStatement", 
			"variableDeclarationList", "identifierList", "elementaryTypeName", "expression", 
			"primaryExpression", "expressionList", "nameValueList", "nameValue", 
			"functionCallArguments", "functionCall", "assemblyBlock", "assemblyItem", 
			"assemblyExpression", "assemblyMember", "assemblyCall", "assemblyLocalDefinition", 
			"assemblyAssignment", "assemblyIdentifierOrList", "assemblyIdentifierList", 
			"assemblyStackAssignment", "labelDefinition", "assemblySwitch", "assemblyCase", 
			"assemblyFunctionDefinition", "assemblyFunctionReturns", "assemblyFor", 
			"assemblyIf", "assemblyLiteral", "tupleExpression", "numberLiteral", 
			"identifier", "hexLiteral", "overrideSpecifier", "stringLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pragma'", "';'", "'*'", "'||'", "'^'", "'~'", "'>='", "'>'", 
			"'<'", "'<='", "'='", "'as'", "'import'", "'from'", "'{'", "','", "'}'", 
			"'abstract'", "'contract'", "'interface'", "'library'", "'is'", "'('", 
			"')'", "'error'", "'using'", "'for'", "'|'", "'&'", "'+'", "'-'", "'/'", 
			"'%'", "'=='", "'!='", "'struct'", "'modifier'", "'function'", "'returns'", 
			"'event'", "'enum'", "'['", "']'", "'address'", "'.'", "'mapping'", "'=>'", 
			"'memory'", "'storage'", "'calldata'", "'if'", "'else'", "'try'", "'catch'", 
			"'while'", "'unchecked'", "'assembly'", "'do'", "'return'", "'throw'", 
			"'emit'", "'revert'", "'var'", "'bool'", "'string'", "'byte'", "'++'", 
			"'--'", "'new'", "':'", "'require'", "'delete'", "'!'", "'**'", "'<<'", 
			"'>>'", "'&&'", "'?'", "'|='", "'^='", "'&='", "'<<='", "'>>='", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'let'", "':='", "'=:'", "'switch'", 
			"'case'", "'default'", "'->'", "'callback'", "'override'", null, null, 
			null, null, null, null, null, null, null, null, null, "'anonymous'", 
			"'break'", "'constant'", "'immutable'", "'continue'", "'leave'", "'external'", 
			"'indexed'", "'internal'", "'payable'", "'private'", "'public'", "'virtual'", 
			"'pure'", "'type'", "'view'", "'global'", "'constructor'", "'fallback'", 
			"'receive'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Int", "Uint", "Byte", "Fixed", "Ufixed", "BooleanLiteral", 
			"DecimalNumber", "HexNumber", "NumberUnit", "HexLiteralFragment", "ReservedKeyword", 
			"AnonymousKeyword", "BreakKeyword", "ConstantKeyword", "ImmutableKeyword", 
			"ContinueKeyword", "LeaveKeyword", "ExternalKeyword", "IndexedKeyword", 
			"InternalKeyword", "PayableKeyword", "PrivateKeyword", "PublicKeyword", 
			"VirtualKeyword", "PureKeyword", "TypeKeyword", "ViewKeyword", "GlobalKeyword", 
			"ConstructorKeyword", "FallbackKeyword", "ReceiveKeyword", "Identifier", 
			"StringLiteralFragment", "VersionLiteral", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Solidity.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public List<PragmaDirectiveContext> pragmaDirective() {
			return getRuleContexts(PragmaDirectiveContext.class);
		}
		public PragmaDirectiveContext pragmaDirective(int i) {
			return getRuleContext(PragmaDirectiveContext.class,i);
		}
		public List<ImportDirectiveContext> importDirective() {
			return getRuleContexts(ImportDirectiveContext.class);
		}
		public ImportDirectiveContext importDirective(int i) {
			return getRuleContext(ImportDirectiveContext.class,i);
		}
		public List<ContractDefinitionContext> contractDefinition() {
			return getRuleContexts(ContractDefinitionContext.class);
		}
		public ContractDefinitionContext contractDefinition(int i) {
			return getRuleContext(ContractDefinitionContext.class,i);
		}
		public List<EnumDefinitionContext> enumDefinition() {
			return getRuleContexts(EnumDefinitionContext.class);
		}
		public EnumDefinitionContext enumDefinition(int i) {
			return getRuleContext(EnumDefinitionContext.class,i);
		}
		public List<EventDefinitionContext> eventDefinition() {
			return getRuleContexts(EventDefinitionContext.class);
		}
		public EventDefinitionContext eventDefinition(int i) {
			return getRuleContext(EventDefinitionContext.class,i);
		}
		public List<StructDefinitionContext> structDefinition() {
			return getRuleContexts(StructDefinitionContext.class);
		}
		public StructDefinitionContext structDefinition(int i) {
			return getRuleContext(StructDefinitionContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<FileLevelConstantContext> fileLevelConstant() {
			return getRuleContexts(FileLevelConstantContext.class);
		}
		public FileLevelConstantContext fileLevelConstant(int i) {
			return getRuleContext(FileLevelConstantContext.class,i);
		}
		public List<CustomErrorDefinitionContext> customErrorDefinition() {
			return getRuleContexts(CustomErrorDefinitionContext.class);
		}
		public CustomErrorDefinitionContext customErrorDefinition(int i) {
			return getRuleContext(CustomErrorDefinitionContext.class,i);
		}
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public List<UsingForDeclarationContext> usingForDeclaration() {
			return getRuleContexts(UsingForDeclarationContext.class);
		}
		public UsingForDeclarationContext usingForDeclaration(int i) {
			return getRuleContext(UsingForDeclarationContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSourceUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSourceUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSourceUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4610468515353436158L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1710241421623033849L) != 0) || _la==ReceiveKeyword || _la==Identifier) {
				{
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(202);
					pragmaDirective();
					}
					break;
				case 2:
					{
					setState(203);
					importDirective();
					}
					break;
				case 3:
					{
					setState(204);
					contractDefinition();
					}
					break;
				case 4:
					{
					setState(205);
					enumDefinition();
					}
					break;
				case 5:
					{
					setState(206);
					eventDefinition();
					}
					break;
				case 6:
					{
					setState(207);
					structDefinition();
					}
					break;
				case 7:
					{
					setState(208);
					functionDefinition();
					}
					break;
				case 8:
					{
					setState(209);
					fileLevelConstant();
					}
					break;
				case 9:
					{
					setState(210);
					customErrorDefinition();
					}
					break;
				case 10:
					{
					setState(211);
					typeDefinition();
					}
					break;
				case 11:
					{
					setState(212);
					usingForDeclaration();
					}
					break;
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PragmaDirectiveContext extends ParserRuleContext {
		public PragmaNameContext pragmaName() {
			return getRuleContext(PragmaNameContext.class,0);
		}
		public PragmaValueContext pragmaValue() {
			return getRuleContext(PragmaValueContext.class,0);
		}
		public PragmaDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPragmaDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaDirectiveContext pragmaDirective() throws RecognitionException {
		PragmaDirectiveContext _localctx = new PragmaDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragmaDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__0);
			setState(221);
			pragmaName();
			setState(222);
			pragmaValue();
			setState(223);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PragmaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PragmaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPragmaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaNameContext pragmaName() throws RecognitionException {
		PragmaNameContext _localctx = new PragmaNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pragmaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PragmaValueContext extends ParserRuleContext {
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PragmaValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPragmaValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaValueContext pragmaValue() throws RecognitionException {
		PragmaValueContext _localctx = new PragmaValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pragmaValue);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				version();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VersionContext extends ParserRuleContext {
		public List<VersionConstraintContext> versionConstraint() {
			return getRuleContexts(VersionConstraintContext.class);
		}
		public VersionConstraintContext versionConstraint(int i) {
			return getRuleContext(VersionConstraintContext.class,i);
		}
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			versionConstraint();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4080L) != 0) || _la==DecimalNumber || _la==VersionLiteral) {
				{
				{
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(233);
					match(T__3);
					}
				}

				setState(236);
				versionConstraint();
				}
				}
				setState(241);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VersionOperatorContext extends ParserRuleContext {
		public VersionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersionOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVersionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionOperatorContext versionOperator() throws RecognitionException {
		VersionOperatorContext _localctx = new VersionOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_versionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4064L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class VersionConstraintContext extends ParserRuleContext {
		public TerminalNode VersionLiteral() { return getToken(SolidityParser.VersionLiteral, 0); }
		public VersionOperatorContext versionOperator() {
			return getRuleContext(VersionOperatorContext.class,0);
		}
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public VersionConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersionConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersionConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVersionConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionConstraintContext versionConstraint() throws RecognitionException {
		VersionConstraintContext _localctx = new VersionConstraintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_versionConstraint);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4064L) != 0)) {
					{
					setState(244);
					versionOperator();
					}
				}

				setState(247);
				match(VersionLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4064L) != 0)) {
					{
					setState(248);
					versionOperator();
					}
				}

				setState(251);
				match(DecimalNumber);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			identifier();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(255);
				match(T__11);
				setState(256);
				identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDirectiveContext extends ParserRuleContext {
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ImportDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitImportDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDirectiveContext importDirective() throws RecognitionException {
		ImportDirectiveContext _localctx = new ImportDirectiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importDirective);
		int _la;
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(T__12);
				setState(260);
				importPath();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(261);
					match(T__11);
					setState(262);
					identifier();
					}
				}

				setState(265);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(T__12);
				setState(270);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(268);
					match(T__2);
					}
					break;
				case T__13:
				case T__24:
				case T__43:
				case T__49:
				case T__61:
				case T__95:
				case LeaveKeyword:
				case PayableKeyword:
				case GlobalKeyword:
				case ConstructorKeyword:
				case ReceiveKeyword:
				case Identifier:
					{
					setState(269);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(272);
					match(T__11);
					setState(273);
					identifier();
					}
				}

				setState(276);
				match(T__13);
				setState(277);
				importPath();
				setState(278);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(T__12);
				setState(281);
				match(T__14);
				setState(282);
				importDeclaration();
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(283);
					match(T__15);
					setState(284);
					importDeclaration();
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(290);
				match(T__16);
				setState(291);
				match(T__13);
				setState(292);
				importPath();
				setState(293);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportPathContext extends ParserRuleContext {
		public TerminalNode StringLiteralFragment() { return getToken(SolidityParser.StringLiteralFragment, 0); }
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitImportPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(StringLiteralFragment);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContractDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<ContractPartContext> contractPart() {
			return getRuleContexts(ContractPartContext.class);
		}
		public ContractPartContext contractPart(int i) {
			return getRuleContext(ContractPartContext.class,i);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContractDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(299);
				match(T__17);
				}
			}

			setState(302);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(303);
			identifier();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(304);
				match(T__21);
				setState(305);
				inheritanceSpecifier();
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(306);
					match(T__15);
					setState(307);
					inheritanceSpecifier();
					}
					}
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(315);
			match(T__14);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 8725798596909057L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 16781672573L) != 0)) {
				{
				{
				setState(316);
				contractPart();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
			match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInheritanceSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInheritanceSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitInheritanceSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			userDefinedTypeName();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(325);
				match(T__22);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
					{
					setState(326);
					expressionList();
					}
				}

				setState(329);
				match(T__23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContractPartContext extends ParserRuleContext {
		public StateVariableDeclarationContext stateVariableDeclaration() {
			return getRuleContext(StateVariableDeclarationContext.class,0);
		}
		public UsingForDeclarationContext usingForDeclaration() {
			return getRuleContext(UsingForDeclarationContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public ModifierDefinitionContext modifierDefinition() {
			return getRuleContext(ModifierDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public EventDefinitionContext eventDefinition() {
			return getRuleContext(EventDefinitionContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public CustomErrorDefinitionContext customErrorDefinition() {
			return getRuleContext(CustomErrorDefinitionContext.class,0);
		}
		public TypeDefinitionContext typeDefinition() {
			return getRuleContext(TypeDefinitionContext.class,0);
		}
		public ContractPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContractPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractPartContext contractPart() throws RecognitionException {
		ContractPartContext _localctx = new ContractPartContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_contractPart);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				modifierDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				functionDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(337);
				eventDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(338);
				enumDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(339);
				customErrorDefinition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(340);
				typeDefinition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StateVariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(SolidityParser.ConstantKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(SolidityParser.ConstantKeyword, i);
		}
		public List<TerminalNode> ImmutableKeyword() { return getTokens(SolidityParser.ImmutableKeyword); }
		public TerminalNode ImmutableKeyword(int i) {
			return getToken(SolidityParser.ImmutableKeyword, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStateVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStateVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStateVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			typeName(0);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 13680641L) != 0)) {
				{
				setState(350);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PublicKeyword:
					{
					setState(344);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(345);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(346);
					match(PrivateKeyword);
					}
					break;
				case ConstantKeyword:
					{
					setState(347);
					match(ConstantKeyword);
					}
					break;
				case ImmutableKeyword:
					{
					setState(348);
					match(ImmutableKeyword);
					}
					break;
				case T__96:
					{
					setState(349);
					overrideSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			identifier();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(356);
				match(T__10);
				setState(357);
				expression(0);
				}
			}

			setState(360);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FileLevelConstantContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FileLevelConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileLevelConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFileLevelConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFileLevelConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFileLevelConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileLevelConstantContext fileLevelConstant() throws RecognitionException {
		FileLevelConstantContext _localctx = new FileLevelConstantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fileLevelConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			typeName(0);
			setState(363);
			match(ConstantKeyword);
			setState(364);
			identifier();
			setState(365);
			match(T__10);
			setState(366);
			expression(0);
			setState(367);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CustomErrorDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public CustomErrorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customErrorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterCustomErrorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitCustomErrorDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitCustomErrorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomErrorDefinitionContext customErrorDefinition() throws RecognitionException {
		CustomErrorDefinitionContext _localctx = new CustomErrorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_customErrorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(T__24);
			setState(370);
			identifier();
			setState(371);
			parameterList();
			setState(372);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefinitionContext extends ParserRuleContext {
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(TypeKeyword);
			setState(375);
			identifier();
			setState(376);
			match(T__21);
			setState(377);
			elementaryTypeName();
			setState(378);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UsingForDeclarationContext extends ParserRuleContext {
		public UsingForObjectContext usingForObject() {
			return getRuleContext(UsingForObjectContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode GlobalKeyword() { return getToken(SolidityParser.GlobalKeyword, 0); }
		public UsingForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUsingForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUsingForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUsingForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingForDeclarationContext usingForDeclaration() throws RecognitionException {
		UsingForDeclarationContext _localctx = new UsingForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_usingForDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(T__25);
			setState(381);
			usingForObject();
			setState(382);
			match(T__26);
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(383);
				match(T__2);
				}
				break;
			case T__13:
			case T__24:
			case T__37:
			case T__43:
			case T__45:
			case T__49:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__95:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case LeaveKeyword:
			case PayableKeyword:
			case GlobalKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
				{
				setState(384);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GlobalKeyword) {
				{
				setState(387);
				match(GlobalKeyword);
				}
			}

			setState(390);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UsingForObjectContext extends ParserRuleContext {
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public List<UsingForObjectDirectiveContext> usingForObjectDirective() {
			return getRuleContexts(UsingForObjectDirectiveContext.class);
		}
		public UsingForObjectDirectiveContext usingForObjectDirective(int i) {
			return getRuleContext(UsingForObjectDirectiveContext.class,i);
		}
		public UsingForObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUsingForObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUsingForObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUsingForObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingForObjectContext usingForObject() throws RecognitionException {
		UsingForObjectContext _localctx = new UsingForObjectContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_usingForObject);
		int _la;
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__24:
			case T__43:
			case T__49:
			case T__61:
			case T__95:
			case LeaveKeyword:
			case PayableKeyword:
			case GlobalKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				userDefinedTypeName();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(T__14);
				setState(394);
				usingForObjectDirective();
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(395);
					match(T__15);
					setState(396);
					usingForObjectDirective();
					}
					}
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(402);
				match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UsingForObjectDirectiveContext extends ParserRuleContext {
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public UserDefinableOperatorsContext userDefinableOperators() {
			return getRuleContext(UserDefinableOperatorsContext.class,0);
		}
		public UsingForObjectDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForObjectDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUsingForObjectDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUsingForObjectDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUsingForObjectDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingForObjectDirectiveContext usingForObjectDirective() throws RecognitionException {
		UsingForObjectDirectiveContext _localctx = new UsingForObjectDirectiveContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_usingForObjectDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			userDefinedTypeName();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(407);
				match(T__11);
				setState(408);
				userDefinableOperators();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UserDefinableOperatorsContext extends ParserRuleContext {
		public UserDefinableOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinableOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUserDefinableOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUserDefinableOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUserDefinableOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserDefinableOperatorsContext userDefinableOperators() throws RecognitionException {
		UserDefinableOperatorsContext _localctx = new UserDefinableOperatorsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_userDefinableOperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 68451043304L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStructDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStructDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(T__35);
			setState(414);
			identifier();
			setState(415);
			match(T__14);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 8725798382995457L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971197L) != 0)) {
				{
				setState(416);
				variableDeclaration();
				setState(417);
				match(T__1);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 8725798382995457L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971197L) != 0)) {
					{
					{
					setState(418);
					variableDeclaration();
					setState(419);
					match(T__1);
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(428);
			match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<TerminalNode> VirtualKeyword() { return getTokens(SolidityParser.VirtualKeyword); }
		public TerminalNode VirtualKeyword(int i) {
			return getToken(SolidityParser.VirtualKeyword, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public ModifierDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitModifierDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierDefinitionContext modifierDefinition() throws RecognitionException {
		ModifierDefinitionContext _localctx = new ModifierDefinitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_modifierDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(T__36);
			setState(431);
			identifier();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(432);
				parameterList();
				}
			}

			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__96 || _la==VirtualKeyword) {
				{
				setState(437);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VirtualKeyword:
					{
					setState(435);
					match(VirtualKeyword);
					}
					break;
				case T__96:
					{
					setState(436);
					overrideSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(442);
				match(T__1);
				}
				break;
			case T__14:
				{
				setState(443);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierInvocationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ModifierInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitModifierInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierInvocationContext modifierInvocation() throws RecognitionException {
		ModifierInvocationContext _localctx = new ModifierInvocationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_modifierInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			identifier();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(447);
				match(T__22);
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
					{
					setState(448);
					expressionList();
					}
				}

				setState(451);
				match(T__23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionDescriptorContext functionDescriptor() {
			return getRuleContext(FunctionDescriptorContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReturnParametersContext returnParameters() {
			return getRuleContext(ReturnParametersContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			functionDescriptor();
			setState(455);
			parameterList();
			setState(456);
			modifierList();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(457);
				returnParameters();
				}
			}

			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(460);
				match(T__1);
				}
				break;
			case T__14:
				{
				setState(461);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDescriptorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ConstructorKeyword() { return getToken(SolidityParser.ConstructorKeyword, 0); }
		public TerminalNode FallbackKeyword() { return getToken(SolidityParser.FallbackKeyword, 0); }
		public TerminalNode ReceiveKeyword() { return getToken(SolidityParser.ReceiveKeyword, 0); }
		public FunctionDescriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDescriptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionDescriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionDescriptor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionDescriptor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDescriptorContext functionDescriptor() throws RecognitionException {
		FunctionDescriptorContext _localctx = new FunctionDescriptorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionDescriptor);
		int _la;
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(T__37);
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
					{
					setState(465);
					identifier();
					}
				}

				}
				break;
			case ConstructorKeyword:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(ConstructorKeyword);
				}
				break;
			case FallbackKeyword:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				match(FallbackKeyword);
				}
				break;
			case ReceiveKeyword:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				match(ReceiveKeyword);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ReturnParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitReturnParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnParametersContext returnParameters() throws RecognitionException {
		ReturnParametersContext _localctx = new ReturnParametersContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_returnParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(T__38);
			setState(474);
			parameterList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierListContext extends ParserRuleContext {
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> VirtualKeyword() { return getTokens(SolidityParser.VirtualKeyword); }
		public TerminalNode VirtualKeyword(int i) {
			return getToken(SolidityParser.VirtualKeyword, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitModifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14896889859L) != 0)) {
				{
				setState(484);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(476);
					match(ExternalKeyword);
					}
					break;
				case 2:
					{
					setState(477);
					match(PublicKeyword);
					}
					break;
				case 3:
					{
					setState(478);
					match(InternalKeyword);
					}
					break;
				case 4:
					{
					setState(479);
					match(PrivateKeyword);
					}
					break;
				case 5:
					{
					setState(480);
					match(VirtualKeyword);
					}
					break;
				case 6:
					{
					setState(481);
					stateMutability();
					}
					break;
				case 7:
					{
					setState(482);
					modifierInvocation();
					}
					break;
				case 8:
					{
					setState(483);
					overrideSpecifier();
					}
					break;
				}
				}
				setState(488);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EventDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterListContext eventParameterList() {
			return getRuleContext(EventParameterListContext.class,0);
		}
		public TerminalNode AnonymousKeyword() { return getToken(SolidityParser.AnonymousKeyword, 0); }
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEventDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(T__39);
			setState(490);
			identifier();
			setState(491);
			eventParameterList();
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(492);
				match(AnonymousKeyword);
				}
			}

			setState(495);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEnumValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEnumDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEnumDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEnumDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(T__40);
			setState(500);
			identifier();
			setState(501);
			match(T__14);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
				{
				setState(502);
				enumValue();
				}
			}

			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(505);
				match(T__15);
				setState(506);
				enumValue();
				}
				}
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(512);
			match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(T__22);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 8725798382995457L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971197L) != 0)) {
				{
				setState(515);
				parameter();
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(516);
					match(T__15);
					setState(517);
					parameter();
					}
					}
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(525);
			match(T__23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			typeName(0);
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(528);
				storageLocation();
				}
				break;
			}
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
				{
				setState(531);
				identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EventParameterListContext extends ParserRuleContext {
		public List<EventParameterContext> eventParameter() {
			return getRuleContexts(EventParameterContext.class);
		}
		public EventParameterContext eventParameter(int i) {
			return getRuleContext(EventParameterContext.class,i);
		}
		public EventParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEventParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventParameterListContext eventParameterList() throws RecognitionException {
		EventParameterListContext _localctx = new EventParameterListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(T__22);
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 8725798382995457L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971197L) != 0)) {
				{
				setState(535);
				eventParameter();
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(536);
					match(T__15);
					setState(537);
					eventParameter();
					}
					}
					setState(542);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(545);
			match(T__23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EventParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode IndexedKeyword() { return getToken(SolidityParser.IndexedKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEventParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			typeName(0);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(548);
				match(IndexedKeyword);
				}
			}

			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
				{
				setState(551);
				identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypeParameterListContext extends ParserRuleContext {
		public List<FunctionTypeParameterContext> functionTypeParameter() {
			return getRuleContexts(FunctionTypeParameterContext.class);
		}
		public FunctionTypeParameterContext functionTypeParameter(int i) {
			return getRuleContext(FunctionTypeParameterContext.class,i);
		}
		public FunctionTypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeParameterListContext functionTypeParameterList() throws RecognitionException {
		FunctionTypeParameterListContext _localctx = new FunctionTypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionTypeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(T__22);
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 8725798382995457L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971197L) != 0)) {
				{
				setState(555);
				functionTypeParameter();
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(556);
					match(T__15);
					setState(557);
					functionTypeParameter();
					}
					}
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(565);
			match(T__23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypeParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public FunctionTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeParameterContext functionTypeParameter() throws RecognitionException {
		FunctionTypeParameterContext _localctx = new FunctionTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_functionTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			typeName(0);
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) {
				{
				setState(568);
				storageLocation();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			typeName(0);
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(572);
				storageLocation();
				}
				break;
			}
			setState(575);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_typeName, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(578);
				elementaryTypeName();
				}
				break;
			case 2:
				{
				setState(579);
				userDefinedTypeName();
				}
				break;
			case 3:
				{
				setState(580);
				mapping();
				}
				break;
			case 4:
				{
				setState(581);
				functionTypeName();
				}
				break;
			case 5:
				{
				setState(582);
				match(T__43);
				setState(583);
				match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(586);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(587);
					match(T__41);
					setState(589);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
						{
						setState(588);
						expression(0);
						}
					}

					setState(591);
					match(T__42);
					}
					} 
				}
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UserDefinedTypeNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UserDefinedTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUserDefinedTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUserDefinedTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUserDefinedTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserDefinedTypeNameContext userDefinedTypeName() throws RecognitionException {
		UserDefinedTypeNameContext _localctx = new UserDefinedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_userDefinedTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			identifier();
			setState(602);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(598);
					match(T__44);
					setState(599);
					identifier();
					}
					} 
				}
				setState(604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MappingKeyContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public MappingKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMappingKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMappingKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitMappingKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingKeyContext mappingKey() throws RecognitionException {
		MappingKeyContext _localctx = new MappingKeyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_mappingKey);
		try {
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				elementaryTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				userDefinedTypeName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MappingContext extends ParserRuleContext {
		public MappingKeyContext mappingKey() {
			return getRuleContext(MappingKeyContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MappingKeyNameContext mappingKeyName() {
			return getRuleContext(MappingKeyNameContext.class,0);
		}
		public MappingValueNameContext mappingValueName() {
			return getRuleContext(MappingValueNameContext.class,0);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMapping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitMapping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_mapping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(T__45);
			setState(610);
			match(T__22);
			setState(611);
			mappingKey();
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
				{
				setState(612);
				mappingKeyName();
				}
			}

			setState(615);
			match(T__46);
			setState(616);
			typeName(0);
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
				{
				setState(617);
				mappingValueName();
				}
			}

			setState(620);
			match(T__23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MappingKeyNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MappingKeyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingKeyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMappingKeyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMappingKeyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitMappingKeyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingKeyNameContext mappingKeyName() throws RecognitionException {
		MappingKeyNameContext _localctx = new MappingKeyNameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_mappingKeyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MappingValueNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MappingValueNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingValueName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMappingValueName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMappingValueName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitMappingValueName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingValueNameContext mappingValueName() throws RecognitionException {
		MappingValueNameContext _localctx = new MappingValueNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_mappingValueName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypeNameContext extends ParserRuleContext {
		public List<FunctionTypeParameterListContext> functionTypeParameterList() {
			return getRuleContexts(FunctionTypeParameterListContext.class);
		}
		public FunctionTypeParameterListContext functionTypeParameterList(int i) {
			return getRuleContext(FunctionTypeParameterListContext.class,i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(T__37);
			setState(627);
			functionTypeParameterList();
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(631);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(628);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(629);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(630);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(636);
				match(T__38);
				setState(637);
				functionTypeParameterList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StorageLocationContext extends ParserRuleContext {
		public StorageLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStorageLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStorageLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStorageLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageLocationContext storageLocation() throws RecognitionException {
		StorageLocationContext _localctx = new StorageLocationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_storageLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode PureKeyword() { return getToken(SolidityParser.PureKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(SolidityParser.ViewKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStateMutability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStateMutability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStateMutability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			_la = _input.LA(1);
			if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & 10369L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(T__14);
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -367988449869055L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067507696049061895L) != 0)) {
				{
				{
				setState(645);
				statement();
				}
				}
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(651);
			match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InlineAssemblyStatementContext inlineAssemblyStatement() {
			return getRuleContext(InlineAssemblyStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public UncheckedStatementContext uncheckedStatement() {
			return getRuleContext(UncheckedStatementContext.class,0);
		}
		public RevertStatementContext revertStatement() {
			return getRuleContext(RevertStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_statement);
		try {
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				tryStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(655);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(656);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(657);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(658);
				inlineAssemblyStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(659);
				doWhileStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(660);
				continueStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(661);
				breakStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(662);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(663);
				throwStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(664);
				emitStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(665);
				simpleStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(666);
				uncheckedStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(667);
				revertStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			expression(0);
			setState(671);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(T__50);
			setState(674);
			match(T__22);
			setState(675);
			expression(0);
			setState(676);
			match(T__23);
			setState(677);
			statement();
			setState(680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(678);
				match(T__51);
				setState(679);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TryStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReturnParametersContext returnParameters() {
			return getRuleContext(ReturnParametersContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(T__52);
			setState(683);
			expression(0);
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(684);
				returnParameters();
				}
			}

			setState(687);
			block();
			setState(689); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(688);
				catchClause();
				}
				}
				setState(691); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__53 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class CatchClauseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(T__53);
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510562234368L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
				{
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
					{
					setState(694);
					identifier();
					}
				}

				setState(697);
				parameterList();
				}
			}

			setState(700);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(T__54);
			setState(703);
			match(T__22);
			setState(704);
			expression(0);
			setState(705);
			match(T__23);
			setState(706);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStatementContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(708);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(709);
				expressionStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UncheckedStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UncheckedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uncheckedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUncheckedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUncheckedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUncheckedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UncheckedStatementContext uncheckedStatement() throws RecognitionException {
		UncheckedStatementContext _localctx = new UncheckedStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_uncheckedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(T__55);
			setState(713);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			match(T__26);
			setState(716);
			match(T__22);
			setState(719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__13:
			case T__22:
			case T__24:
			case T__29:
			case T__30:
			case T__37:
			case T__41:
			case T__43:
			case T__45:
			case T__49:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__70:
			case T__71:
			case T__72:
			case T__95:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case LeaveKeyword:
			case PayableKeyword:
			case TypeKeyword:
			case GlobalKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
			case StringLiteralFragment:
				{
				setState(717);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(718);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(723);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__13:
			case T__22:
			case T__24:
			case T__29:
			case T__30:
			case T__37:
			case T__41:
			case T__43:
			case T__45:
			case T__49:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__70:
			case T__71:
			case T__72:
			case T__95:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case LeaveKeyword:
			case PayableKeyword:
			case TypeKeyword:
			case GlobalKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
			case StringLiteralFragment:
				{
				setState(721);
				expressionStatement();
				}
				break;
			case T__1:
				{
				setState(722);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
				{
				setState(725);
				expression(0);
				}
			}

			setState(728);
			match(T__23);
			setState(729);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InlineAssemblyStatementContext extends ParserRuleContext {
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public TerminalNode StringLiteralFragment() { return getToken(SolidityParser.StringLiteralFragment, 0); }
		public InlineAssemblyStatementFlagContext inlineAssemblyStatementFlag() {
			return getRuleContext(InlineAssemblyStatementFlagContext.class,0);
		}
		public InlineAssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAssemblyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInlineAssemblyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInlineAssemblyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitInlineAssemblyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineAssemblyStatementContext inlineAssemblyStatement() throws RecognitionException {
		InlineAssemblyStatementContext _localctx = new InlineAssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(T__56);
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteralFragment) {
				{
				setState(732);
				match(StringLiteralFragment);
				}
			}

			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(735);
				match(T__22);
				setState(736);
				inlineAssemblyStatementFlag();
				setState(737);
				match(T__23);
				}
			}

			setState(741);
			assemblyBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InlineAssemblyStatementFlagContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public InlineAssemblyStatementFlagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAssemblyStatementFlag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInlineAssemblyStatementFlag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInlineAssemblyStatementFlag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitInlineAssemblyStatementFlag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineAssemblyStatementFlagContext inlineAssemblyStatementFlag() throws RecognitionException {
		InlineAssemblyStatementFlagContext _localctx = new InlineAssemblyStatementFlagContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_inlineAssemblyStatementFlag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			stringLiteral();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(T__57);
			setState(746);
			statement();
			setState(747);
			match(T__54);
			setState(748);
			match(T__22);
			setState(749);
			expression(0);
			setState(750);
			match(T__23);
			setState(751);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(ContinueKeyword);
			setState(754);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(BreakKeyword);
			setState(757);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(T__58);
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
				{
				setState(760);
				expression(0);
				}
			}

			setState(763);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(T__59);
			setState(766);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EmitStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEmitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEmitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEmitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(T__60);
			setState(769);
			functionCall();
			setState(770);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RevertStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public RevertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterRevertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitRevertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitRevertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RevertStatementContext revertStatement() throws RecognitionException {
		RevertStatementContext _localctx = new RevertStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_revertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(T__61);
			setState(773);
			functionCall();
			setState(774);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(776);
				match(T__62);
				setState(777);
				identifierList();
				}
				break;
			case 2:
				{
				setState(778);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(779);
				match(T__22);
				setState(780);
				variableDeclarationList();
				setState(781);
				match(T__23);
				}
				break;
			}
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(785);
				match(T__10);
				setState(786);
				expression(0);
				}
			}

			setState(789);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 8725798382995457L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971197L) != 0)) {
				{
				setState(791);
				variableDeclaration();
				}
			}

			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(794);
				match(T__15);
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 8725798382995457L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971197L) != 0)) {
					{
					setState(795);
					variableDeclaration();
					}
				}

				}
				}
				setState(802);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(T__22);
			setState(810);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(805);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
						{
						setState(804);
						identifier();
						}
					}

					setState(807);
					match(T__15);
					}
					} 
				}
				setState(812);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
				{
				setState(813);
				identifier();
				}
			}

			setState(816);
			match(T__23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementaryTypeNameContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SolidityParser.Int, 0); }
		public TerminalNode Uint() { return getToken(SolidityParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(SolidityParser.Byte, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterElementaryTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitElementaryTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitElementaryTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementaryTypeNameContext elementaryTypeName() throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			_la = _input.LA(1);
			if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 558446353801805825L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NameValueListContext nameValueList() {
			return getRuleContext(NameValueListContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(821);
				match(T__68);
				setState(822);
				typeName(0);
				}
				break;
			case 2:
				{
				setState(823);
				match(T__70);
				setState(824);
				match(T__22);
				setState(825);
				expression(0);
				setState(826);
				match(T__15);
				setState(827);
				stringLiteral();
				setState(828);
				match(T__23);
				}
				break;
			case 3:
				{
				setState(830);
				match(T__22);
				setState(831);
				expression(0);
				setState(832);
				match(T__23);
				}
				break;
			case 4:
				{
				setState(834);
				_la = _input.LA(1);
				if ( !(_la==T__66 || _la==T__67) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(835);
				expression(19);
				}
				break;
			case 5:
				{
				setState(836);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(837);
				expression(18);
				}
				break;
			case 6:
				{
				setState(838);
				match(T__71);
				setState(839);
				expression(17);
				}
				break;
			case 7:
				{
				setState(840);
				match(T__72);
				setState(841);
				expression(16);
				}
				break;
			case 8:
				{
				setState(842);
				match(T__5);
				setState(843);
				expression(15);
				}
				break;
			case 9:
				{
				setState(844);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(921);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(919);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(847);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(848);
						match(T__73);
						setState(849);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(850);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(851);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 12884901896L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(852);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(853);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(854);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(855);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(856);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(857);
						_la = _input.LA(1);
						if ( !(_la==T__74 || _la==T__75) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(858);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(859);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(860);
						match(T__28);
						setState(861);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(862);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(863);
						match(T__4);
						setState(864);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(865);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(866);
						match(T__27);
						setState(867);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(868);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(869);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(870);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(871);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(872);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(873);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(874);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(875);
						match(T__76);
						setState(876);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(877);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(878);
						match(T__3);
						setState(879);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(880);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(881);
						match(T__77);
						setState(882);
						expression(0);
						setState(883);
						match(T__69);
						setState(884);
						expression(3);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(886);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(887);
						_la = _input.LA(1);
						if ( !(_la==T__10 || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 1023L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(888);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(889);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(890);
						_la = _input.LA(1);
						if ( !(_la==T__66 || _la==T__67) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(891);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(892);
						match(T__41);
						setState(893);
						expression(0);
						setState(894);
						match(T__42);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(896);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(897);
						match(T__41);
						setState(899);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
							{
							setState(898);
							expression(0);
							}
						}

						setState(901);
						match(T__69);
						setState(903);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
							{
							setState(902);
							expression(0);
							}
						}

						setState(905);
						match(T__42);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(906);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(907);
						match(T__44);
						setState(908);
						identifier();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(909);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(910);
						match(T__14);
						setState(911);
						nameValueList();
						setState(912);
						match(T__16);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(914);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(915);
						match(T__22);
						setState(916);
						functionCallArguments();
						setState(917);
						match(T__23);
						}
						break;
					}
					} 
				}
				setState(923);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(SolidityParser.BooleanLiteral, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public HexLiteralContext hexLiteral() {
			return getRuleContext(HexLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_primaryExpression);
		try {
			setState(933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(924);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(925);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(926);
				hexLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(927);
				stringLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(928);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(929);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(930);
				match(PayableKeyword);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(931);
				tupleExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(932);
				typeName(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			expression(0);
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(936);
				match(T__15);
				setState(937);
				expression(0);
				}
				}
				setState(942);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameValueListContext extends ParserRuleContext {
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
		}
		public NameValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNameValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNameValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNameValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValueListContext nameValueList() throws RecognitionException {
		NameValueListContext _localctx = new NameValueListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			nameValue();
			setState(948);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(944);
					match(T__15);
					setState(945);
					nameValue();
					}
					} 
				}
				setState(950);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(951);
				match(T__15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNameValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNameValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			identifier();
			setState(955);
			match(T__69);
			setState(956);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallArgumentsContext extends ParserRuleContext {
		public NameValueListContext nameValueList() {
			return getRuleContext(NameValueListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_functionCallArguments);
		int _la;
		try {
			setState(966);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(958);
				match(T__14);
				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
					{
					setState(959);
					nameValueList();
					}
				}

				setState(962);
				match(T__16);
				}
				break;
			case T__5:
			case T__13:
			case T__22:
			case T__23:
			case T__24:
			case T__29:
			case T__30:
			case T__37:
			case T__41:
			case T__43:
			case T__45:
			case T__49:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__70:
			case T__71:
			case T__72:
			case T__95:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case LeaveKeyword:
			case PayableKeyword:
			case TypeKeyword:
			case GlobalKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
			case StringLiteralFragment:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
					{
					setState(963);
					expressionList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			expression(0);
			setState(969);
			match(T__22);
			setState(970);
			functionCallArguments();
			setState(971);
			match(T__23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyBlockContext extends ParserRuleContext {
		public List<AssemblyItemContext> assemblyItem() {
			return getRuleContexts(AssemblyItemContext.class);
		}
		public AssemblyItemContext assemblyItem(int i) {
			return getRuleContext(AssemblyItemContext.class,i);
		}
		public AssemblyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyBlockContext assemblyBlock() throws RecognitionException {
		AssemblyBlockContext _localctx = new AssemblyBlockContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(T__14);
			setState(977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 4820466225129987L) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 4055038804105L) != 0)) {
				{
				{
				setState(974);
				assemblyItem();
				}
				}
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(980);
			match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext assemblyLocalDefinition() {
			return getRuleContext(AssemblyLocalDefinitionContext.class,0);
		}
		public AssemblyAssignmentContext assemblyAssignment() {
			return getRuleContext(AssemblyAssignmentContext.class,0);
		}
		public AssemblyStackAssignmentContext assemblyStackAssignment() {
			return getRuleContext(AssemblyStackAssignmentContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public AssemblySwitchContext assemblySwitch() {
			return getRuleContext(AssemblySwitchContext.class,0);
		}
		public AssemblyFunctionDefinitionContext assemblyFunctionDefinition() {
			return getRuleContext(AssemblyFunctionDefinitionContext.class,0);
		}
		public AssemblyForContext assemblyFor() {
			return getRuleContext(AssemblyForContext.class,0);
		}
		public AssemblyIfContext assemblyIf() {
			return getRuleContext(AssemblyIfContext.class,0);
		}
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public TerminalNode LeaveKeyword() { return getToken(SolidityParser.LeaveKeyword, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public HexLiteralContext hexLiteral() {
			return getRuleContext(HexLiteralContext.class,0);
		}
		public AssemblyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyItemContext assemblyItem() throws RecognitionException {
		AssemblyItemContext _localctx = new AssemblyItemContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_assemblyItem);
		try {
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(983);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(984);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(985);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(986);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(987);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(988);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(989);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(990);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(991);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(992);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(993);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(994);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(995);
				match(LeaveKeyword);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(996);
				numberLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(997);
				stringLiteral();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(998);
				hexLiteral();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyExpressionContext extends ParserRuleContext {
		public AssemblyCallContext assemblyCall() {
			return getRuleContext(AssemblyCallContext.class,0);
		}
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyMemberContext assemblyMember() {
			return getRuleContext(AssemblyMemberContext.class,0);
		}
		public AssemblyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyExpressionContext assemblyExpression() throws RecognitionException {
		AssemblyExpressionContext _localctx = new AssemblyExpressionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_assemblyExpression);
		try {
			setState(1004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				assemblyCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				assemblyLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1003);
				assemblyMember();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyMemberContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AssemblyMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyMemberContext assemblyMember() throws RecognitionException {
		AssemblyMemberContext _localctx = new AssemblyMemberContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_assemblyMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			identifier();
			setState(1007);
			match(T__44);
			setState(1008);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public AssemblyCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyCallContext assemblyCall() throws RecognitionException {
		AssemblyCallContext _localctx = new AssemblyCallContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1010);
				match(T__58);
				}
				break;
			case 2:
				{
				setState(1011);
				match(T__43);
				}
				break;
			case 3:
				{
				setState(1012);
				match(T__65);
				}
				break;
			case 4:
				{
				setState(1013);
				identifier();
				}
				break;
			}
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1016);
				match(T__22);
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 4820328769390593L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 31679843201L) != 0)) {
					{
					setState(1017);
					assemblyExpression();
					}
				}

				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(1020);
					match(T__15);
					setState(1021);
					assemblyExpression();
					}
					}
					setState(1026);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1027);
				match(T__23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyLocalDefinitionContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLocalDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyLocalDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyLocalDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyLocalDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyLocalDefinitionContext assemblyLocalDefinition() throws RecognitionException {
		AssemblyLocalDefinitionContext _localctx = new AssemblyLocalDefinitionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			match(T__88);
			setState(1031);
			assemblyIdentifierOrList();
			setState(1034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__89) {
				{
				setState(1032);
				match(T__89);
				setState(1033);
				assemblyExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyAssignmentContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyAssignmentContext assemblyAssignment() throws RecognitionException {
		AssemblyAssignmentContext _localctx = new AssemblyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			assemblyIdentifierOrList();
			setState(1037);
			match(T__89);
			setState(1038);
			assemblyExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyIdentifierOrListContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyMemberContext assemblyMember() {
			return getRuleContext(AssemblyMemberContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyIdentifierOrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierOrList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIdentifierOrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIdentifierOrList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyIdentifierOrList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyIdentifierOrListContext assemblyIdentifierOrList() throws RecognitionException {
		AssemblyIdentifierOrListContext _localctx = new AssemblyIdentifierOrListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_assemblyIdentifierOrList);
		try {
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1040);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1041);
				assemblyMember();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1042);
				assemblyIdentifierList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1043);
				match(T__22);
				setState(1044);
				assemblyIdentifierList();
				setState(1045);
				match(T__23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyIdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AssemblyIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyIdentifierListContext assemblyIdentifierList() throws RecognitionException {
		AssemblyIdentifierListContext _localctx = new AssemblyIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			identifier();
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(1050);
				match(T__15);
				setState(1051);
				identifier();
				}
				}
				setState(1056);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyStackAssignmentContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyStackAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyStackAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyStackAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyStackAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyStackAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyStackAssignmentContext assemblyStackAssignment() throws RecognitionException {
		AssemblyStackAssignmentContext _localctx = new AssemblyStackAssignmentContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			assemblyExpression();
			setState(1058);
			match(T__90);
			setState(1059);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LabelDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLabelDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitLabelDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			identifier();
			setState(1062);
			match(T__69);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblySwitchContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public List<AssemblyCaseContext> assemblyCase() {
			return getRuleContexts(AssemblyCaseContext.class);
		}
		public AssemblyCaseContext assemblyCase(int i) {
			return getRuleContext(AssemblyCaseContext.class,i);
		}
		public AssemblySwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblySwitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblySwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblySwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblySwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblySwitchContext assemblySwitch() throws RecognitionException {
		AssemblySwitchContext _localctx = new AssemblySwitchContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(T__91);
			setState(1065);
			assemblyExpression();
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__92 || _la==T__93) {
				{
				{
				setState(1066);
				assemblyCase();
				}
				}
				setState(1071);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyCaseContext extends ParserRuleContext {
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyCaseContext assemblyCase() throws RecognitionException {
		AssemblyCaseContext _localctx = new AssemblyCaseContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_assemblyCase);
		try {
			setState(1078);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__92:
				enterOuterAlt(_localctx, 1);
				{
				setState(1072);
				match(T__92);
				setState(1073);
				assemblyLiteral();
				setState(1074);
				assemblyBlock();
				}
				break;
			case T__93:
				enterOuterAlt(_localctx, 2);
				{
				setState(1076);
				match(T__93);
				setState(1077);
				assemblyBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyFunctionDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext assemblyFunctionReturns() {
			return getRuleContext(AssemblyFunctionReturnsContext.class,0);
		}
		public AssemblyFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyFunctionDefinitionContext assemblyFunctionDefinition() throws RecognitionException {
		AssemblyFunctionDefinitionContext _localctx = new AssemblyFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			match(T__37);
			setState(1081);
			identifier();
			setState(1082);
			match(T__22);
			setState(1084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
				{
				setState(1083);
				assemblyIdentifierList();
				}
			}

			setState(1086);
			match(T__23);
			setState(1088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__94) {
				{
				setState(1087);
				assemblyFunctionReturns();
				}
			}

			setState(1090);
			assemblyBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyFunctionReturnsContext extends ParserRuleContext {
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionReturns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFunctionReturns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFunctionReturns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyFunctionReturns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyFunctionReturnsContext assemblyFunctionReturns() throws RecognitionException {
		AssemblyFunctionReturnsContext _localctx = new AssemblyFunctionReturnsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1092);
			match(T__94);
			setState(1093);
			assemblyIdentifierList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyForContext extends ParserRuleContext {
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public List<AssemblyBlockContext> assemblyBlock() {
			return getRuleContexts(AssemblyBlockContext.class);
		}
		public AssemblyBlockContext assemblyBlock(int i) {
			return getRuleContext(AssemblyBlockContext.class,i);
		}
		public AssemblyForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyForContext assemblyFor() throws RecognitionException {
		AssemblyForContext _localctx = new AssemblyForContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			match(T__26);
			setState(1098);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(1096);
				assemblyBlock();
				}
				break;
			case T__13:
			case T__24:
			case T__43:
			case T__49:
			case T__58:
			case T__61:
			case T__65:
			case T__95:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case LeaveKeyword:
			case PayableKeyword:
			case GlobalKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
			case StringLiteralFragment:
				{
				setState(1097);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1100);
			assemblyExpression();
			setState(1103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(1101);
				assemblyBlock();
				}
				break;
			case T__13:
			case T__24:
			case T__43:
			case T__49:
			case T__58:
			case T__61:
			case T__65:
			case T__95:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case LeaveKeyword:
			case PayableKeyword:
			case GlobalKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
			case StringLiteralFragment:
				{
				setState(1102);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1105);
			assemblyBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyIfContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyIfContext assemblyIf() throws RecognitionException {
		AssemblyIfContext _localctx = new AssemblyIfContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(T__50);
			setState(1108);
			assemblyExpression();
			setState(1109);
			assemblyBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyLiteralContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public HexLiteralContext hexLiteral() {
			return getRuleContext(HexLiteralContext.class,0);
		}
		public TerminalNode BooleanLiteral() { return getToken(SolidityParser.BooleanLiteral, 0); }
		public AssemblyLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyLiteralContext assemblyLiteral() throws RecognitionException {
		AssemblyLiteralContext _localctx = new AssemblyLiteralContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_assemblyLiteral);
		try {
			setState(1116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteralFragment:
				enterOuterAlt(_localctx, 1);
				{
				setState(1111);
				stringLiteral();
				}
				break;
			case DecimalNumber:
				enterOuterAlt(_localctx, 2);
				{
				setState(1112);
				match(DecimalNumber);
				}
				break;
			case HexNumber:
				enterOuterAlt(_localctx, 3);
				{
				setState(1113);
				match(HexNumber);
				}
				break;
			case HexLiteralFragment:
				enterOuterAlt(_localctx, 4);
				{
				setState(1114);
				hexLiteral();
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(1115);
				match(BooleanLiteral);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TupleExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTupleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTupleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_tupleExpression);
		int _la;
		try {
			setState(1144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(1118);
				match(T__22);
				{
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
					{
					setState(1119);
					expression(0);
					}
				}

				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(1122);
					match(T__15);
					setState(1124);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
						{
						setState(1123);
						expression(0);
						}
					}

					}
					}
					setState(1130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1131);
				match(T__23);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(1132);
				match(T__41);
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
					{
					setState(1133);
					expression(0);
					setState(1138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(1134);
						match(T__15);
						setState(1135);
						expression(0);
						}
						}
						setState(1140);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1143);
				match(T__42);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(SolidityParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1147);
				match(NumberUnit);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ReceiveKeyword() { return getToken(SolidityParser.ReceiveKeyword, 0); }
		public TerminalNode GlobalKeyword() { return getToken(SolidityParser.GlobalKeyword, 0); }
		public TerminalNode ConstructorKeyword() { return getToken(SolidityParser.ConstructorKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public TerminalNode LeaveKeyword() { return getToken(SolidityParser.LeaveKeyword, 0); }
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class HexLiteralContext extends ParserRuleContext {
		public List<TerminalNode> HexLiteralFragment() { return getTokens(SolidityParser.HexLiteralFragment); }
		public TerminalNode HexLiteralFragment(int i) {
			return getToken(SolidityParser.HexLiteralFragment, i);
		}
		public HexLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterHexLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitHexLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitHexLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexLiteralContext hexLiteral() throws RecognitionException {
		HexLiteralContext _localctx = new HexLiteralContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_hexLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1153); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1152);
					match(HexLiteralFragment);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1155); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OverrideSpecifierContext extends ParserRuleContext {
		public List<UserDefinedTypeNameContext> userDefinedTypeName() {
			return getRuleContexts(UserDefinedTypeNameContext.class);
		}
		public UserDefinedTypeNameContext userDefinedTypeName(int i) {
			return getRuleContext(UserDefinedTypeNameContext.class,i);
		}
		public OverrideSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overrideSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterOverrideSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitOverrideSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitOverrideSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverrideSpecifierContext overrideSpecifier() throws RecognitionException {
		OverrideSpecifierContext _localctx = new OverrideSpecifierContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_overrideSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			match(T__96);
			setState(1169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(1158);
				match(T__22);
				setState(1159);
				userDefinedTypeName();
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(1160);
					match(T__15);
					setState(1161);
					userDefinedTypeName();
					}
					}
					setState(1166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1167);
				match(T__23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteralFragment() { return getTokens(SolidityParser.StringLiteralFragment); }
		public TerminalNode StringLiteralFragment(int i) {
			return getToken(SolidityParser.StringLiteralFragment, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_stringLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1172); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1171);
					match(StringLiteralFragment);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1174); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 38:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 70:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 28);
		case 15:
			return precpred(_ctx, 26);
		case 16:
			return precpred(_ctx, 25);
		case 17:
			return precpred(_ctx, 24);
		case 18:
			return precpred(_ctx, 23);
		case 19:
			return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0086\u0499\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u00d6\b\u0000\n\u0000\f\u0000\u00d9\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00e7\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00eb\b\u0004\u0001"+
		"\u0004\u0005\u0004\u00ee\b\u0004\n\u0004\f\u0004\u00f1\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0003\u0006\u00f6\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00fa\b\u0006\u0001\u0006\u0003\u0006\u00fd\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0102\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0108\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u010f\b\b\u0001\b\u0001\b\u0003\b\u0113\b\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u011e"+
		"\b\b\n\b\f\b\u0121\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u0128\b\b\u0001\t\u0001\t\u0001\n\u0003\n\u012d\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u0135\b\n\n\n\f\n\u0138\t\n\u0003\n"+
		"\u013a\b\n\u0001\n\u0001\n\u0005\n\u013e\b\n\n\n\f\n\u0141\t\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0148\b\u000b"+
		"\u0001\u000b\u0003\u000b\u014b\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0156\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u015f\b\r\n\r\f\r\u0162"+
		"\t\r\u0001\r\u0001\r\u0001\r\u0003\r\u0167\b\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0182\b\u0011"+
		"\u0001\u0011\u0003\u0011\u0185\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u018e\b\u0012"+
		"\n\u0012\f\u0012\u0191\t\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0195"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u019a\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01a6\b\u0015"+
		"\n\u0015\f\u0015\u01a9\t\u0015\u0003\u0015\u01ab\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01b2\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u01b6\b\u0016\n\u0016\f\u0016\u01b9\t\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u01bd\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u01c2\b\u0017\u0001\u0017\u0003\u0017\u01c5\b"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01cb"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01cf\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u01d3\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u01d8\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u01e5\b\u001b\n\u001b\f\u001b\u01e8\t\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01ee\b\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u01f8\b\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u01fc\b\u001e\n\u001e\f\u001e\u01ff\t\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0207\b\u001f"+
		"\n\u001f\f\u001f\u020a\t\u001f\u0003\u001f\u020c\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0003 \u0212\b \u0001 \u0003 \u0215\b \u0001!\u0001"+
		"!\u0001!\u0001!\u0005!\u021b\b!\n!\f!\u021e\t!\u0003!\u0220\b!\u0001!"+
		"\u0001!\u0001\"\u0001\"\u0003\"\u0226\b\"\u0001\"\u0003\"\u0229\b\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0005#\u022f\b#\n#\f#\u0232\t#\u0003#\u0234\b#"+
		"\u0001#\u0001#\u0001$\u0001$\u0003$\u023a\b$\u0001%\u0001%\u0003%\u023e"+
		"\b%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u0249\b&\u0001&\u0001&\u0001&\u0003&\u024e\b&\u0001&\u0005&\u0251\b"+
		"&\n&\f&\u0254\t&\u0001\'\u0001\'\u0001\'\u0005\'\u0259\b\'\n\'\f\'\u025c"+
		"\t\'\u0001(\u0001(\u0003(\u0260\b(\u0001)\u0001)\u0001)\u0001)\u0003)"+
		"\u0266\b)\u0001)\u0001)\u0001)\u0003)\u026b\b)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u0278\b,\n,"+
		"\f,\u027b\t,\u0001,\u0001,\u0003,\u027f\b,\u0001-\u0001-\u0001.\u0001"+
		".\u0001/\u0001/\u0005/\u0287\b/\n/\f/\u028a\t/\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00030\u029d\b0\u00011\u00011\u00011\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00032\u02a9\b2\u00013\u00013\u0001"+
		"3\u00033\u02ae\b3\u00013\u00013\u00043\u02b2\b3\u000b3\f3\u02b3\u0001"+
		"4\u00014\u00034\u02b8\b4\u00014\u00034\u02bb\b4\u00014\u00014\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00016\u00016\u00036\u02c7\b6\u00017\u0001"+
		"7\u00017\u00018\u00018\u00018\u00018\u00038\u02d0\b8\u00018\u00018\u0003"+
		"8\u02d4\b8\u00018\u00038\u02d7\b8\u00018\u00018\u00018\u00019\u00019\u0003"+
		"9\u02de\b9\u00019\u00019\u00019\u00019\u00039\u02e4\b9\u00019\u00019\u0001"+
		":\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		"<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001>\u0001>\u0003>\u02fa\b>\u0001"+
		">\u0001>\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001A\u0001"+
		"A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0003"+
		"B\u0310\bB\u0001B\u0001B\u0003B\u0314\bB\u0001B\u0001B\u0001C\u0003C\u0319"+
		"\bC\u0001C\u0001C\u0003C\u031d\bC\u0005C\u031f\bC\nC\fC\u0322\tC\u0001"+
		"D\u0001D\u0003D\u0326\bD\u0001D\u0005D\u0329\bD\nD\fD\u032c\tD\u0001D"+
		"\u0003D\u032f\bD\u0001D\u0001D\u0001E\u0001E\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0003F\u034e\bF\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u0384\bF\u0001F\u0001F\u0003"+
		"F\u0388\bF\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0005F\u0398\bF\nF\fF\u039b\tF\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u03a6"+
		"\bG\u0001H\u0001H\u0001H\u0005H\u03ab\bH\nH\fH\u03ae\tH\u0001I\u0001I"+
		"\u0001I\u0005I\u03b3\bI\nI\fI\u03b6\tI\u0001I\u0003I\u03b9\bI\u0001J\u0001"+
		"J\u0001J\u0001J\u0001K\u0001K\u0003K\u03c1\bK\u0001K\u0001K\u0003K\u03c5"+
		"\bK\u0003K\u03c7\bK\u0001L\u0001L\u0001L\u0001L\u0001L\u0001M\u0001M\u0005"+
		"M\u03d0\bM\nM\fM\u03d3\tM\u0001M\u0001M\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0003N\u03e8\bN\u0001O\u0001O\u0001O\u0003O\u03ed\bO\u0001"+
		"P\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u03f7\bQ\u0001"+
		"Q\u0001Q\u0003Q\u03fb\bQ\u0001Q\u0001Q\u0005Q\u03ff\bQ\nQ\fQ\u0402\tQ"+
		"\u0001Q\u0003Q\u0405\bQ\u0001R\u0001R\u0001R\u0001R\u0003R\u040b\bR\u0001"+
		"S\u0001S\u0001S\u0001S\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001"+
		"T\u0003T\u0418\bT\u0001U\u0001U\u0001U\u0005U\u041d\bU\nU\fU\u0420\tU"+
		"\u0001V\u0001V\u0001V\u0001V\u0001W\u0001W\u0001W\u0001X\u0001X\u0001"+
		"X\u0005X\u042c\bX\nX\fX\u042f\tX\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0003Y\u0437\bY\u0001Z\u0001Z\u0001Z\u0001Z\u0003Z\u043d\bZ\u0001Z\u0001"+
		"Z\u0003Z\u0441\bZ\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0001\\\u0001\\\u0001"+
		"\\\u0003\\\u044b\b\\\u0001\\\u0001\\\u0001\\\u0003\\\u0450\b\\\u0001\\"+
		"\u0001\\\u0001]\u0001]\u0001]\u0001]\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0003^\u045d\b^\u0001_\u0001_\u0003_\u0461\b_\u0001_\u0001_\u0003_\u0465"+
		"\b_\u0005_\u0467\b_\n_\f_\u046a\t_\u0001_\u0001_\u0001_\u0001_\u0001_"+
		"\u0005_\u0471\b_\n_\f_\u0474\t_\u0003_\u0476\b_\u0001_\u0003_\u0479\b"+
		"_\u0001`\u0001`\u0003`\u047d\b`\u0001a\u0001a\u0001b\u0004b\u0482\bb\u000b"+
		"b\fb\u0483\u0001c\u0001c\u0001c\u0001c\u0001c\u0005c\u048b\bc\nc\fc\u048e"+
		"\tc\u0001c\u0001c\u0003c\u0492\bc\u0001d\u0004d\u0495\bd\u000bd\fd\u0496"+
		"\u0001d\u0000\u0002L\u008ce\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u0000\u000f\u0001\u0000\u0005\u000b\u0001"+
		"\u0000\u0013\u0015\u0003\u0000\u0003\u0003\u0005\n\u001c#\u0001\u0000"+
		"02\u0004\u0000oovvzz||\u0003\u0000,,?Bbf\u0001\u0000CD\u0001\u0000\u001e"+
		"\u001f\u0002\u0000\u0003\u0003 !\u0001\u0000KL\u0001\u0000\u0007\n\u0001"+
		"\u0000\"#\u0002\u0000\u000b\u000bOX\u0001\u0000hi\n\u0000\u000e\u000e"+
		"\u0019\u0019,,22>>``rrvv}~\u0080\u0081\u051b\u0000\u00d7\u0001\u0000\u0000"+
		"\u0000\u0002\u00dc\u0001\u0000\u0000\u0000\u0004\u00e1\u0001\u0000\u0000"+
		"\u0000\u0006\u00e6\u0001\u0000\u0000\u0000\b\u00e8\u0001\u0000\u0000\u0000"+
		"\n\u00f2\u0001\u0000\u0000\u0000\f\u00fc\u0001\u0000\u0000\u0000\u000e"+
		"\u00fe\u0001\u0000\u0000\u0000\u0010\u0127\u0001\u0000\u0000\u0000\u0012"+
		"\u0129\u0001\u0000\u0000\u0000\u0014\u012c\u0001\u0000\u0000\u0000\u0016"+
		"\u0144\u0001\u0000\u0000\u0000\u0018\u0155\u0001\u0000\u0000\u0000\u001a"+
		"\u0157\u0001\u0000\u0000\u0000\u001c\u016a\u0001\u0000\u0000\u0000\u001e"+
		"\u0171\u0001\u0000\u0000\u0000 \u0176\u0001\u0000\u0000\u0000\"\u017c"+
		"\u0001\u0000\u0000\u0000$\u0194\u0001\u0000\u0000\u0000&\u0196\u0001\u0000"+
		"\u0000\u0000(\u019b\u0001\u0000\u0000\u0000*\u019d\u0001\u0000\u0000\u0000"+
		",\u01ae\u0001\u0000\u0000\u0000.\u01be\u0001\u0000\u0000\u00000\u01c6"+
		"\u0001\u0000\u0000\u00002\u01d7\u0001\u0000\u0000\u00004\u01d9\u0001\u0000"+
		"\u0000\u00006\u01e6\u0001\u0000\u0000\u00008\u01e9\u0001\u0000\u0000\u0000"+
		":\u01f1\u0001\u0000\u0000\u0000<\u01f3\u0001\u0000\u0000\u0000>\u0202"+
		"\u0001\u0000\u0000\u0000@\u020f\u0001\u0000\u0000\u0000B\u0216\u0001\u0000"+
		"\u0000\u0000D\u0223\u0001\u0000\u0000\u0000F\u022a\u0001\u0000\u0000\u0000"+
		"H\u0237\u0001\u0000\u0000\u0000J\u023b\u0001\u0000\u0000\u0000L\u0248"+
		"\u0001\u0000\u0000\u0000N\u0255\u0001\u0000\u0000\u0000P\u025f\u0001\u0000"+
		"\u0000\u0000R\u0261\u0001\u0000\u0000\u0000T\u026e\u0001\u0000\u0000\u0000"+
		"V\u0270\u0001\u0000\u0000\u0000X\u0272\u0001\u0000\u0000\u0000Z\u0280"+
		"\u0001\u0000\u0000\u0000\\\u0282\u0001\u0000\u0000\u0000^\u0284\u0001"+
		"\u0000\u0000\u0000`\u029c\u0001\u0000\u0000\u0000b\u029e\u0001\u0000\u0000"+
		"\u0000d\u02a1\u0001\u0000\u0000\u0000f\u02aa\u0001\u0000\u0000\u0000h"+
		"\u02b5\u0001\u0000\u0000\u0000j\u02be\u0001\u0000\u0000\u0000l\u02c6\u0001"+
		"\u0000\u0000\u0000n\u02c8\u0001\u0000\u0000\u0000p\u02cb\u0001\u0000\u0000"+
		"\u0000r\u02db\u0001\u0000\u0000\u0000t\u02e7\u0001\u0000\u0000\u0000v"+
		"\u02e9\u0001\u0000\u0000\u0000x\u02f1\u0001\u0000\u0000\u0000z\u02f4\u0001"+
		"\u0000\u0000\u0000|\u02f7\u0001\u0000\u0000\u0000~\u02fd\u0001\u0000\u0000"+
		"\u0000\u0080\u0300\u0001\u0000\u0000\u0000\u0082\u0304\u0001\u0000\u0000"+
		"\u0000\u0084\u030f\u0001\u0000\u0000\u0000\u0086\u0318\u0001\u0000\u0000"+
		"\u0000\u0088\u0323\u0001\u0000\u0000\u0000\u008a\u0332\u0001\u0000\u0000"+
		"\u0000\u008c\u034d\u0001\u0000\u0000\u0000\u008e\u03a5\u0001\u0000\u0000"+
		"\u0000\u0090\u03a7\u0001\u0000\u0000\u0000\u0092\u03af\u0001\u0000\u0000"+
		"\u0000\u0094\u03ba\u0001\u0000\u0000\u0000\u0096\u03c6\u0001\u0000\u0000"+
		"\u0000\u0098\u03c8\u0001\u0000\u0000\u0000\u009a\u03cd\u0001\u0000\u0000"+
		"\u0000\u009c\u03e7\u0001\u0000\u0000\u0000\u009e\u03ec\u0001\u0000\u0000"+
		"\u0000\u00a0\u03ee\u0001\u0000\u0000\u0000\u00a2\u03f6\u0001\u0000\u0000"+
		"\u0000\u00a4\u0406\u0001\u0000\u0000\u0000\u00a6\u040c\u0001\u0000\u0000"+
		"\u0000\u00a8\u0417\u0001\u0000\u0000\u0000\u00aa\u0419\u0001\u0000\u0000"+
		"\u0000\u00ac\u0421\u0001\u0000\u0000\u0000\u00ae\u0425\u0001\u0000\u0000"+
		"\u0000\u00b0\u0428\u0001\u0000\u0000\u0000\u00b2\u0436\u0001\u0000\u0000"+
		"\u0000\u00b4\u0438\u0001\u0000\u0000\u0000\u00b6\u0444\u0001\u0000\u0000"+
		"\u0000\u00b8\u0447\u0001\u0000\u0000\u0000\u00ba\u0453\u0001\u0000\u0000"+
		"\u0000\u00bc\u045c\u0001\u0000\u0000\u0000\u00be\u0478\u0001\u0000\u0000"+
		"\u0000\u00c0\u047a\u0001\u0000\u0000\u0000\u00c2\u047e\u0001\u0000\u0000"+
		"\u0000\u00c4\u0481\u0001\u0000\u0000\u0000\u00c6\u0485\u0001\u0000\u0000"+
		"\u0000\u00c8\u0494\u0001\u0000\u0000\u0000\u00ca\u00d6\u0003\u0002\u0001"+
		"\u0000\u00cb\u00d6\u0003\u0010\b\u0000\u00cc\u00d6\u0003\u0014\n\u0000"+
		"\u00cd\u00d6\u0003<\u001e\u0000\u00ce\u00d6\u00038\u001c\u0000\u00cf\u00d6"+
		"\u0003*\u0015\u0000\u00d0\u00d6\u00030\u0018\u0000\u00d1\u00d6\u0003\u001c"+
		"\u000e\u0000\u00d2\u00d6\u0003\u001e\u000f\u0000\u00d3\u00d6\u0003 \u0010"+
		"\u0000\u00d4\u00d6\u0003\"\u0011\u0000\u00d5\u00ca\u0001\u0000\u0000\u0000"+
		"\u00d5\u00cb\u0001\u0000\u0000\u0000\u00d5\u00cc\u0001\u0000\u0000\u0000"+
		"\u00d5\u00cd\u0001\u0000\u0000\u0000\u00d5\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d5\u00cf\u0001\u0000\u0000\u0000\u00d5\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0001\u0000\u0000\u0000"+
		"\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0000\u0000\u0001"+
		"\u00db\u0001\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0001\u0000\u0000"+
		"\u00dd\u00de\u0003\u0004\u0002\u0000\u00de\u00df\u0003\u0006\u0003\u0000"+
		"\u00df\u00e0\u0005\u0002\u0000\u0000\u00e0\u0003\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0003\u00c2a\u0000\u00e2\u0005\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e7\u0005\u0003\u0000\u0000\u00e4\u00e7\u0003\b\u0004\u0000\u00e5\u00e7"+
		"\u0003\u008cF\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u0007\u0001"+
		"\u0000\u0000\u0000\u00e8\u00ef\u0003\f\u0006\u0000\u00e9\u00eb\u0005\u0004"+
		"\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0003\f\u0006"+
		"\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f0\t\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0007\u0000\u0000\u0000\u00f3\u000b\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f6\u0003\n\u0005\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7"+
		"\u00fd\u0005\u0083\u0000\u0000\u00f8\u00fa\u0003\n\u0005\u0000\u00f9\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fd\u0005h\u0000\u0000\u00fc\u00f5\u0001"+
		"\u0000\u0000\u0000\u00fc\u00f9\u0001\u0000\u0000\u0000\u00fd\r\u0001\u0000"+
		"\u0000\u0000\u00fe\u0101\u0003\u00c2a\u0000\u00ff\u0100\u0005\f\u0000"+
		"\u0000\u0100\u0102\u0003\u00c2a\u0000\u0101\u00ff\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u000f\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0005\r\u0000\u0000\u0104\u0107\u0003\u0012\t\u0000\u0105"+
		"\u0106\u0005\f\u0000\u0000\u0106\u0108\u0003\u00c2a\u0000\u0107\u0105"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u0002\u0000\u0000\u010a\u0128"+
		"\u0001\u0000\u0000\u0000\u010b\u010e\u0005\r\u0000\u0000\u010c\u010f\u0005"+
		"\u0003\u0000\u0000\u010d\u010f\u0003\u00c2a\u0000\u010e\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0005\f\u0000\u0000\u0111\u0113\u0003\u00c2a"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u000e\u0000"+
		"\u0000\u0115\u0116\u0003\u0012\t\u0000\u0116\u0117\u0005\u0002\u0000\u0000"+
		"\u0117\u0128\u0001\u0000\u0000\u0000\u0118\u0119\u0005\r\u0000\u0000\u0119"+
		"\u011a\u0005\u000f\u0000\u0000\u011a\u011f\u0003\u000e\u0007\u0000\u011b"+
		"\u011c\u0005\u0010\u0000\u0000\u011c\u011e\u0003\u000e\u0007\u0000\u011d"+
		"\u011b\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f"+
		"\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120"+
		"\u0122\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0005\u0011\u0000\u0000\u0123\u0124\u0005\u000e\u0000\u0000\u0124"+
		"\u0125\u0003\u0012\t\u0000\u0125\u0126\u0005\u0002\u0000\u0000\u0126\u0128"+
		"\u0001\u0000\u0000\u0000\u0127\u0103\u0001\u0000\u0000\u0000\u0127\u010b"+
		"\u0001\u0000\u0000\u0000\u0127\u0118\u0001\u0000\u0000\u0000\u0128\u0011"+
		"\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u0082\u0000\u0000\u012a\u0013"+
		"\u0001\u0000\u0000\u0000\u012b\u012d\u0005\u0012\u0000\u0000\u012c\u012b"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0007\u0001\u0000\u0000\u012f\u0139"+
		"\u0003\u00c2a\u0000\u0130\u0131\u0005\u0016\u0000\u0000\u0131\u0136\u0003"+
		"\u0016\u000b\u0000\u0132\u0133\u0005\u0010\u0000\u0000\u0133\u0135\u0003"+
		"\u0016\u000b\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0138\u0001"+
		"\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001"+
		"\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001"+
		"\u0000\u0000\u0000\u0139\u0130\u0001\u0000\u0000\u0000\u0139\u013a\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013f\u0005"+
		"\u000f\u0000\u0000\u013c\u013e\u0003\u0018\f\u0000\u013d\u013c\u0001\u0000"+
		"\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0142\u0001\u0000"+
		"\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u0143\u0005\u0011"+
		"\u0000\u0000\u0143\u0015\u0001\u0000\u0000\u0000\u0144\u014a\u0003N\'"+
		"\u0000\u0145\u0147\u0005\u0017\u0000\u0000\u0146\u0148\u0003\u0090H\u0000"+
		"\u0147\u0146\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014b\u0005\u0018\u0000\u0000"+
		"\u014a\u0145\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000"+
		"\u014b\u0017\u0001\u0000\u0000\u0000\u014c\u0156\u0003\u001a\r\u0000\u014d"+
		"\u0156\u0003\"\u0011\u0000\u014e\u0156\u0003*\u0015\u0000\u014f\u0156"+
		"\u0003,\u0016\u0000\u0150\u0156\u00030\u0018\u0000\u0151\u0156\u00038"+
		"\u001c\u0000\u0152\u0156\u0003<\u001e\u0000\u0153\u0156\u0003\u001e\u000f"+
		"\u0000\u0154\u0156\u0003 \u0010\u0000\u0155\u014c\u0001\u0000\u0000\u0000"+
		"\u0155\u014d\u0001\u0000\u0000\u0000\u0155\u014e\u0001\u0000\u0000\u0000"+
		"\u0155\u014f\u0001\u0000\u0000\u0000\u0155\u0150\u0001\u0000\u0000\u0000"+
		"\u0155\u0151\u0001\u0000\u0000\u0000\u0155\u0152\u0001\u0000\u0000\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000"+
		"\u0156\u0019\u0001\u0000\u0000\u0000\u0157\u0160\u0003L&\u0000\u0158\u015f"+
		"\u0005x\u0000\u0000\u0159\u015f\u0005u\u0000\u0000\u015a\u015f\u0005w"+
		"\u0000\u0000\u015b\u015f\u0005o\u0000\u0000\u015c\u015f\u0005p\u0000\u0000"+
		"\u015d\u015f\u0003\u00c6c\u0000\u015e\u0158\u0001\u0000\u0000\u0000\u015e"+
		"\u0159\u0001\u0000\u0000\u0000\u015e\u015a\u0001\u0000\u0000\u0000\u015e"+
		"\u015b\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e"+
		"\u015d\u0001\u0000\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000\u0160"+
		"\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161"+
		"\u0163\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163"+
		"\u0166\u0003\u00c2a\u0000\u0164\u0165\u0005\u000b\u0000\u0000\u0165\u0167"+
		"\u0003\u008cF\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0167\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0005"+
		"\u0002\u0000\u0000\u0169\u001b\u0001\u0000\u0000\u0000\u016a\u016b\u0003"+
		"L&\u0000\u016b\u016c\u0005o\u0000\u0000\u016c\u016d\u0003\u00c2a\u0000"+
		"\u016d\u016e\u0005\u000b\u0000\u0000\u016e\u016f\u0003\u008cF\u0000\u016f"+
		"\u0170\u0005\u0002\u0000\u0000\u0170\u001d\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0005\u0019\u0000\u0000\u0172\u0173\u0003\u00c2a\u0000\u0173\u0174"+
		"\u0003>\u001f\u0000\u0174\u0175\u0005\u0002\u0000\u0000\u0175\u001f\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0005{\u0000\u0000\u0177\u0178\u0003\u00c2"+
		"a\u0000\u0178\u0179\u0005\u0016\u0000\u0000\u0179\u017a\u0003\u008aE\u0000"+
		"\u017a\u017b\u0005\u0002\u0000\u0000\u017b!\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0005\u001a\u0000\u0000\u017d\u017e\u0003$\u0012\u0000\u017e\u0181"+
		"\u0005\u001b\u0000\u0000\u017f\u0182\u0005\u0003\u0000\u0000\u0180\u0182"+
		"\u0003L&\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0180\u0001\u0000"+
		"\u0000\u0000\u0182\u0184\u0001\u0000\u0000\u0000\u0183\u0185\u0005}\u0000"+
		"\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000"+
		"\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0005\u0002\u0000"+
		"\u0000\u0187#\u0001\u0000\u0000\u0000\u0188\u0195\u0003N\'\u0000\u0189"+
		"\u018a\u0005\u000f\u0000\u0000\u018a\u018f\u0003&\u0013\u0000\u018b\u018c"+
		"\u0005\u0010\u0000\u0000\u018c\u018e\u0003&\u0013\u0000\u018d\u018b\u0001"+
		"\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d\u0001"+
		"\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0192\u0001"+
		"\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0193\u0005"+
		"\u0011\u0000\u0000\u0193\u0195\u0001\u0000\u0000\u0000\u0194\u0188\u0001"+
		"\u0000\u0000\u0000\u0194\u0189\u0001\u0000\u0000\u0000\u0195%\u0001\u0000"+
		"\u0000\u0000\u0196\u0199\u0003N\'\u0000\u0197\u0198\u0005\f\u0000\u0000"+
		"\u0198\u019a\u0003(\u0014\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199"+
		"\u019a\u0001\u0000\u0000\u0000\u019a\'\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u0007\u0002\u0000\u0000\u019c)\u0001\u0000\u0000\u0000\u019d\u019e\u0005"+
		"$\u0000\u0000\u019e\u019f\u0003\u00c2a\u0000\u019f\u01aa\u0005\u000f\u0000"+
		"\u0000\u01a0\u01a1\u0003J%\u0000\u01a1\u01a7\u0005\u0002\u0000\u0000\u01a2"+
		"\u01a3\u0003J%\u0000\u01a3\u01a4\u0005\u0002\u0000\u0000\u01a4\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a2\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001"+
		"\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001"+
		"\u0000\u0000\u0000\u01aa\u01a0\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005"+
		"\u0011\u0000\u0000\u01ad+\u0001\u0000\u0000\u0000\u01ae\u01af\u0005%\u0000"+
		"\u0000\u01af\u01b1\u0003\u00c2a\u0000\u01b0\u01b2\u0003>\u001f\u0000\u01b1"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b3\u01b6\u0005y\u0000\u0000\u01b4\u01b6"+
		"\u0003\u00c6c\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01bc\u0001"+
		"\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bd\u0005"+
		"\u0002\u0000\u0000\u01bb\u01bd\u0003^/\u0000\u01bc\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bd-\u0001\u0000\u0000\u0000"+
		"\u01be\u01c4\u0003\u00c2a\u0000\u01bf\u01c1\u0005\u0017\u0000\u0000\u01c0"+
		"\u01c2\u0003\u0090H\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c1\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c5"+
		"\u0005\u0018\u0000\u0000\u01c4\u01bf\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c5/\u0001\u0000\u0000\u0000\u01c6\u01c7\u0003"+
		"2\u0019\u0000\u01c7\u01c8\u0003>\u001f\u0000\u01c8\u01ca\u00036\u001b"+
		"\u0000\u01c9\u01cb\u00034\u001a\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01ce\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cf\u0005\u0002\u0000\u0000\u01cd\u01cf\u0003^/\u0000\u01ce\u01cc"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000\u01cf1\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d2\u0005&\u0000\u0000\u01d1\u01d3\u0003\u00c2"+
		"a\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d8\u0001\u0000\u0000\u0000\u01d4\u01d8\u0005~\u0000\u0000"+
		"\u01d5\u01d8\u0005\u007f\u0000\u0000\u01d6\u01d8\u0005\u0080\u0000\u0000"+
		"\u01d7\u01d0\u0001\u0000\u0000\u0000\u01d7\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d83\u0001\u0000\u0000\u0000\u01d9\u01da\u0005\'\u0000\u0000\u01da"+
		"\u01db\u0003>\u001f\u0000\u01db5\u0001\u0000\u0000\u0000\u01dc\u01e5\u0005"+
		"s\u0000\u0000\u01dd\u01e5\u0005x\u0000\u0000\u01de\u01e5\u0005u\u0000"+
		"\u0000\u01df\u01e5\u0005w\u0000\u0000\u01e0\u01e5\u0005y\u0000\u0000\u01e1"+
		"\u01e5\u0003\\.\u0000\u01e2\u01e5\u0003.\u0017\u0000\u01e3\u01e5\u0003"+
		"\u00c6c\u0000\u01e4\u01dc\u0001\u0000\u0000\u0000\u01e4\u01dd\u0001\u0000"+
		"\u0000\u0000\u01e4\u01de\u0001\u0000\u0000\u0000\u01e4\u01df\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e0\u0001\u0000\u0000\u0000\u01e4\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e8\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e77\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005(\u0000\u0000"+
		"\u01ea\u01eb\u0003\u00c2a\u0000\u01eb\u01ed\u0003B!\u0000\u01ec\u01ee"+
		"\u0005m\u0000\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001"+
		"\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005"+
		"\u0002\u0000\u0000\u01f09\u0001\u0000\u0000\u0000\u01f1\u01f2\u0003\u00c2"+
		"a\u0000\u01f2;\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005)\u0000\u0000"+
		"\u01f4\u01f5\u0003\u00c2a\u0000\u01f5\u01f7\u0005\u000f\u0000\u0000\u01f6"+
		"\u01f8\u0003:\u001d\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f7\u01f8"+
		"\u0001\u0000\u0000\u0000\u01f8\u01fd\u0001\u0000\u0000\u0000\u01f9\u01fa"+
		"\u0005\u0010\u0000\u0000\u01fa\u01fc\u0003:\u001d\u0000\u01fb\u01f9\u0001"+
		"\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u0200\u0001"+
		"\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200\u0201\u0005"+
		"\u0011\u0000\u0000\u0201=\u0001\u0000\u0000\u0000\u0202\u020b\u0005\u0017"+
		"\u0000\u0000\u0203\u0208\u0003@ \u0000\u0204\u0205\u0005\u0010\u0000\u0000"+
		"\u0205\u0207\u0003@ \u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0207\u020a"+
		"\u0001\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0001\u0000\u0000\u0000\u0209\u020c\u0001\u0000\u0000\u0000\u020a\u0208"+
		"\u0001\u0000\u0000\u0000\u020b\u0203\u0001\u0000\u0000\u0000\u020b\u020c"+
		"\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020e"+
		"\u0005\u0018\u0000\u0000\u020e?\u0001\u0000\u0000\u0000\u020f\u0211\u0003"+
		"L&\u0000\u0210\u0212\u0003Z-\u0000\u0211\u0210\u0001\u0000\u0000\u0000"+
		"\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0214\u0001\u0000\u0000\u0000"+
		"\u0213\u0215\u0003\u00c2a\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0214"+
		"\u0215\u0001\u0000\u0000\u0000\u0215A\u0001\u0000\u0000\u0000\u0216\u021f"+
		"\u0005\u0017\u0000\u0000\u0217\u021c\u0003D\"\u0000\u0218\u0219\u0005"+
		"\u0010\u0000\u0000\u0219\u021b\u0003D\"\u0000\u021a\u0218\u0001\u0000"+
		"\u0000\u0000\u021b\u021e\u0001\u0000\u0000\u0000\u021c\u021a\u0001\u0000"+
		"\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u0220\u0001\u0000"+
		"\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021f\u0217\u0001\u0000"+
		"\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000"+
		"\u0000\u0000\u0221\u0222\u0005\u0018\u0000\u0000\u0222C\u0001\u0000\u0000"+
		"\u0000\u0223\u0225\u0003L&\u0000\u0224\u0226\u0005t\u0000\u0000\u0225"+
		"\u0224\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226"+
		"\u0228\u0001\u0000\u0000\u0000\u0227\u0229\u0003\u00c2a\u0000\u0228\u0227"+
		"\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229E\u0001"+
		"\u0000\u0000\u0000\u022a\u0233\u0005\u0017\u0000\u0000\u022b\u0230\u0003"+
		"H$\u0000\u022c\u022d\u0005\u0010\u0000\u0000\u022d\u022f\u0003H$\u0000"+
		"\u022e\u022c\u0001\u0000\u0000\u0000\u022f\u0232\u0001\u0000\u0000\u0000"+
		"\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000"+
		"\u0231\u0234\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000"+
		"\u0233\u022b\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000"+
		"\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0236\u0005\u0018\u0000\u0000"+
		"\u0236G\u0001\u0000\u0000\u0000\u0237\u0239\u0003L&\u0000\u0238\u023a"+
		"\u0003Z-\u0000\u0239\u0238\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000"+
		"\u0000\u0000\u023aI\u0001\u0000\u0000\u0000\u023b\u023d\u0003L&\u0000"+
		"\u023c\u023e\u0003Z-\u0000\u023d\u023c\u0001\u0000\u0000\u0000\u023d\u023e"+
		"\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0240"+
		"\u0003\u00c2a\u0000\u0240K\u0001\u0000\u0000\u0000\u0241\u0242\u0006&"+
		"\uffff\uffff\u0000\u0242\u0249\u0003\u008aE\u0000\u0243\u0249\u0003N\'"+
		"\u0000\u0244\u0249\u0003R)\u0000\u0245\u0249\u0003X,\u0000\u0246\u0247"+
		"\u0005,\u0000\u0000\u0247\u0249\u0005v\u0000\u0000\u0248\u0241\u0001\u0000"+
		"\u0000\u0000\u0248\u0243\u0001\u0000\u0000\u0000\u0248\u0244\u0001\u0000"+
		"\u0000\u0000\u0248\u0245\u0001\u0000\u0000\u0000\u0248\u0246\u0001\u0000"+
		"\u0000\u0000\u0249\u0252\u0001\u0000\u0000\u0000\u024a\u024b\n\u0003\u0000"+
		"\u0000\u024b\u024d\u0005*\u0000\u0000\u024c\u024e\u0003\u008cF\u0000\u024d"+
		"\u024c\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e"+
		"\u024f\u0001\u0000\u0000\u0000\u024f\u0251\u0005+\u0000\u0000\u0250\u024a"+
		"\u0001\u0000\u0000\u0000\u0251\u0254\u0001\u0000\u0000\u0000\u0252\u0250"+
		"\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253M\u0001"+
		"\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0255\u025a\u0003"+
		"\u00c2a\u0000\u0256\u0257\u0005-\u0000\u0000\u0257\u0259\u0003\u00c2a"+
		"\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0259\u025c\u0001\u0000\u0000"+
		"\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000"+
		"\u0000\u025bO\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000\u0000"+
		"\u025d\u0260\u0003\u008aE\u0000\u025e\u0260\u0003N\'\u0000\u025f\u025d"+
		"\u0001\u0000\u0000\u0000\u025f\u025e\u0001\u0000\u0000\u0000\u0260Q\u0001"+
		"\u0000\u0000\u0000\u0261\u0262\u0005.\u0000\u0000\u0262\u0263\u0005\u0017"+
		"\u0000\u0000\u0263\u0265\u0003P(\u0000\u0264\u0266\u0003T*\u0000\u0265"+
		"\u0264\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266"+
		"\u0267\u0001\u0000\u0000\u0000\u0267\u0268\u0005/\u0000\u0000\u0268\u026a"+
		"\u0003L&\u0000\u0269\u026b\u0003V+\u0000\u026a\u0269\u0001\u0000\u0000"+
		"\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000"+
		"\u0000\u026c\u026d\u0005\u0018\u0000\u0000\u026dS\u0001\u0000\u0000\u0000"+
		"\u026e\u026f\u0003\u00c2a\u0000\u026fU\u0001\u0000\u0000\u0000\u0270\u0271"+
		"\u0003\u00c2a\u0000\u0271W\u0001\u0000\u0000\u0000\u0272\u0273\u0005&"+
		"\u0000\u0000\u0273\u0279\u0003F#\u0000\u0274\u0278\u0005u\u0000\u0000"+
		"\u0275\u0278\u0005s\u0000\u0000\u0276\u0278\u0003\\.\u0000\u0277\u0274"+
		"\u0001\u0000\u0000\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0277\u0276"+
		"\u0001\u0000\u0000\u0000\u0278\u027b\u0001\u0000\u0000\u0000\u0279\u0277"+
		"\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a\u027e"+
		"\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027c\u027d"+
		"\u0005\'\u0000\u0000\u027d\u027f\u0003F#\u0000\u027e\u027c\u0001\u0000"+
		"\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027fY\u0001\u0000\u0000"+
		"\u0000\u0280\u0281\u0007\u0003\u0000\u0000\u0281[\u0001\u0000\u0000\u0000"+
		"\u0282\u0283\u0007\u0004\u0000\u0000\u0283]\u0001\u0000\u0000\u0000\u0284"+
		"\u0288\u0005\u000f\u0000\u0000\u0285\u0287\u0003`0\u0000\u0286\u0285\u0001"+
		"\u0000\u0000\u0000\u0287\u028a\u0001\u0000\u0000\u0000\u0288\u0286\u0001"+
		"\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028b\u0001"+
		"\u0000\u0000\u0000\u028a\u0288\u0001\u0000\u0000\u0000\u028b\u028c\u0005"+
		"\u0011\u0000\u0000\u028c_\u0001\u0000\u0000\u0000\u028d\u029d\u0003d2"+
		"\u0000\u028e\u029d\u0003f3\u0000\u028f\u029d\u0003j5\u0000\u0290\u029d"+
		"\u0003p8\u0000\u0291\u029d\u0003^/\u0000\u0292\u029d\u0003r9\u0000\u0293"+
		"\u029d\u0003v;\u0000\u0294\u029d\u0003x<\u0000\u0295\u029d\u0003z=\u0000"+
		"\u0296\u029d\u0003|>\u0000\u0297\u029d\u0003~?\u0000\u0298\u029d\u0003"+
		"\u0080@\u0000\u0299\u029d\u0003l6\u0000\u029a\u029d\u0003n7\u0000\u029b"+
		"\u029d\u0003\u0082A\u0000\u029c\u028d\u0001\u0000\u0000\u0000\u029c\u028e"+
		"\u0001\u0000\u0000\u0000\u029c\u028f\u0001\u0000\u0000\u0000\u029c\u0290"+
		"\u0001\u0000\u0000\u0000\u029c\u0291\u0001\u0000\u0000\u0000\u029c\u0292"+
		"\u0001\u0000\u0000\u0000\u029c\u0293\u0001\u0000\u0000\u0000\u029c\u0294"+
		"\u0001\u0000\u0000\u0000\u029c\u0295\u0001\u0000\u0000\u0000\u029c\u0296"+
		"\u0001\u0000\u0000\u0000\u029c\u0297\u0001\u0000\u0000\u0000\u029c\u0298"+
		"\u0001\u0000\u0000\u0000\u029c\u0299\u0001\u0000\u0000\u0000\u029c\u029a"+
		"\u0001\u0000\u0000\u0000\u029c\u029b\u0001\u0000\u0000\u0000\u029da\u0001"+
		"\u0000\u0000\u0000\u029e\u029f\u0003\u008cF\u0000\u029f\u02a0\u0005\u0002"+
		"\u0000\u0000\u02a0c\u0001\u0000\u0000\u0000\u02a1\u02a2\u00053\u0000\u0000"+
		"\u02a2\u02a3\u0005\u0017\u0000\u0000\u02a3\u02a4\u0003\u008cF\u0000\u02a4"+
		"\u02a5\u0005\u0018\u0000\u0000\u02a5\u02a8\u0003`0\u0000\u02a6\u02a7\u0005"+
		"4\u0000\u0000\u02a7\u02a9\u0003`0\u0000\u02a8\u02a6\u0001\u0000\u0000"+
		"\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9e\u0001\u0000\u0000\u0000"+
		"\u02aa\u02ab\u00055\u0000\u0000\u02ab\u02ad\u0003\u008cF\u0000\u02ac\u02ae"+
		"\u00034\u001a\u0000\u02ad\u02ac\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001"+
		"\u0000\u0000\u0000\u02ae\u02af\u0001\u0000\u0000\u0000\u02af\u02b1\u0003"+
		"^/\u0000\u02b0\u02b2\u0003h4\u0000\u02b1\u02b0\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4g\u0001\u0000\u0000\u0000\u02b5"+
		"\u02ba\u00056\u0000\u0000\u02b6\u02b8\u0003\u00c2a\u0000\u02b7\u02b6\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001"+
		"\u0000\u0000\u0000\u02b9\u02bb\u0003>\u001f\u0000\u02ba\u02b7\u0001\u0000"+
		"\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000"+
		"\u0000\u0000\u02bc\u02bd\u0003^/\u0000\u02bdi\u0001\u0000\u0000\u0000"+
		"\u02be\u02bf\u00057\u0000\u0000\u02bf\u02c0\u0005\u0017\u0000\u0000\u02c0"+
		"\u02c1\u0003\u008cF\u0000\u02c1\u02c2\u0005\u0018\u0000\u0000\u02c2\u02c3"+
		"\u0003`0\u0000\u02c3k\u0001\u0000\u0000\u0000\u02c4\u02c7\u0003\u0084"+
		"B\u0000\u02c5\u02c7\u0003b1\u0000\u02c6\u02c4\u0001\u0000\u0000\u0000"+
		"\u02c6\u02c5\u0001\u0000\u0000\u0000\u02c7m\u0001\u0000\u0000\u0000\u02c8"+
		"\u02c9\u00058\u0000\u0000\u02c9\u02ca\u0003^/\u0000\u02cao\u0001\u0000"+
		"\u0000\u0000\u02cb\u02cc\u0005\u001b\u0000\u0000\u02cc\u02cf\u0005\u0017"+
		"\u0000\u0000\u02cd\u02d0\u0003l6\u0000\u02ce\u02d0\u0005\u0002\u0000\u0000"+
		"\u02cf\u02cd\u0001\u0000\u0000\u0000\u02cf\u02ce\u0001\u0000\u0000\u0000"+
		"\u02d0\u02d3\u0001\u0000\u0000\u0000\u02d1\u02d4\u0003b1\u0000\u02d2\u02d4"+
		"\u0005\u0002\u0000\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d3\u02d2"+
		"\u0001\u0000\u0000\u0000\u02d4\u02d6\u0001\u0000\u0000\u0000\u02d5\u02d7"+
		"\u0003\u008cF\u0000\u02d6\u02d5\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001"+
		"\u0000\u0000\u0000\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8\u02d9\u0005"+
		"\u0018\u0000\u0000\u02d9\u02da\u0003`0\u0000\u02daq\u0001\u0000\u0000"+
		"\u0000\u02db\u02dd\u00059\u0000\u0000\u02dc\u02de\u0005\u0082\u0000\u0000"+
		"\u02dd\u02dc\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000"+
		"\u02de\u02e3\u0001\u0000\u0000\u0000\u02df\u02e0\u0005\u0017\u0000\u0000"+
		"\u02e0\u02e1\u0003t:\u0000\u02e1\u02e2\u0005\u0018\u0000\u0000\u02e2\u02e4"+
		"\u0001\u0000\u0000\u0000\u02e3\u02df\u0001\u0000\u0000\u0000\u02e3\u02e4"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5\u02e6"+
		"\u0003\u009aM\u0000\u02e6s\u0001\u0000\u0000\u0000\u02e7\u02e8\u0003\u00c8"+
		"d\u0000\u02e8u\u0001\u0000\u0000\u0000\u02e9\u02ea\u0005:\u0000\u0000"+
		"\u02ea\u02eb\u0003`0\u0000\u02eb\u02ec\u00057\u0000\u0000\u02ec\u02ed"+
		"\u0005\u0017\u0000\u0000\u02ed\u02ee\u0003\u008cF\u0000\u02ee\u02ef\u0005"+
		"\u0018\u0000\u0000\u02ef\u02f0\u0005\u0002\u0000\u0000\u02f0w\u0001\u0000"+
		"\u0000\u0000\u02f1\u02f2\u0005q\u0000\u0000\u02f2\u02f3\u0005\u0002\u0000"+
		"\u0000\u02f3y\u0001\u0000\u0000\u0000\u02f4\u02f5\u0005n\u0000\u0000\u02f5"+
		"\u02f6\u0005\u0002\u0000\u0000\u02f6{\u0001\u0000\u0000\u0000\u02f7\u02f9"+
		"\u0005;\u0000\u0000\u02f8\u02fa\u0003\u008cF\u0000\u02f9\u02f8\u0001\u0000"+
		"\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000"+
		"\u0000\u0000\u02fb\u02fc\u0005\u0002\u0000\u0000\u02fc}\u0001\u0000\u0000"+
		"\u0000\u02fd\u02fe\u0005<\u0000\u0000\u02fe\u02ff\u0005\u0002\u0000\u0000"+
		"\u02ff\u007f\u0001\u0000\u0000\u0000\u0300\u0301\u0005=\u0000\u0000\u0301"+
		"\u0302\u0003\u0098L\u0000\u0302\u0303\u0005\u0002\u0000\u0000\u0303\u0081"+
		"\u0001\u0000\u0000\u0000\u0304\u0305\u0005>\u0000\u0000\u0305\u0306\u0003"+
		"\u0098L\u0000\u0306\u0307\u0005\u0002\u0000\u0000\u0307\u0083\u0001\u0000"+
		"\u0000\u0000\u0308\u0309\u0005?\u0000\u0000\u0309\u0310\u0003\u0088D\u0000"+
		"\u030a\u0310\u0003J%\u0000\u030b\u030c\u0005\u0017\u0000\u0000\u030c\u030d"+
		"\u0003\u0086C\u0000\u030d\u030e\u0005\u0018\u0000\u0000\u030e\u0310\u0001"+
		"\u0000\u0000\u0000\u030f\u0308\u0001\u0000\u0000\u0000\u030f\u030a\u0001"+
		"\u0000\u0000\u0000\u030f\u030b\u0001\u0000\u0000\u0000\u0310\u0313\u0001"+
		"\u0000\u0000\u0000\u0311\u0312\u0005\u000b\u0000\u0000\u0312\u0314\u0003"+
		"\u008cF\u0000\u0313\u0311\u0001\u0000\u0000\u0000\u0313\u0314\u0001\u0000"+
		"\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0316\u0005\u0002"+
		"\u0000\u0000\u0316\u0085\u0001\u0000\u0000\u0000\u0317\u0319\u0003J%\u0000"+
		"\u0318\u0317\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000\u0000"+
		"\u0319\u0320\u0001\u0000\u0000\u0000\u031a\u031c\u0005\u0010\u0000\u0000"+
		"\u031b\u031d\u0003J%\u0000\u031c\u031b\u0001\u0000\u0000\u0000\u031c\u031d"+
		"\u0001\u0000\u0000\u0000\u031d\u031f\u0001\u0000\u0000\u0000\u031e\u031a"+
		"\u0001\u0000\u0000\u0000\u031f\u0322\u0001\u0000\u0000\u0000\u0320\u031e"+
		"\u0001\u0000\u0000\u0000\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0087"+
		"\u0001\u0000\u0000\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0323\u032a"+
		"\u0005\u0017\u0000\u0000\u0324\u0326\u0003\u00c2a\u0000\u0325\u0324\u0001"+
		"\u0000\u0000\u0000\u0325\u0326\u0001\u0000\u0000\u0000\u0326\u0327\u0001"+
		"\u0000\u0000\u0000\u0327\u0329\u0005\u0010\u0000\u0000\u0328\u0325\u0001"+
		"\u0000\u0000\u0000\u0329\u032c\u0001\u0000\u0000\u0000\u032a\u0328\u0001"+
		"\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u032e\u0001"+
		"\u0000\u0000\u0000\u032c\u032a\u0001\u0000\u0000\u0000\u032d\u032f\u0003"+
		"\u00c2a\u0000\u032e\u032d\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000"+
		"\u0000\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330\u0331\u0005\u0018"+
		"\u0000\u0000\u0331\u0089\u0001\u0000\u0000\u0000\u0332\u0333\u0007\u0005"+
		"\u0000\u0000\u0333\u008b\u0001\u0000\u0000\u0000\u0334\u0335\u0006F\uffff"+
		"\uffff\u0000\u0335\u0336\u0005E\u0000\u0000\u0336\u034e\u0003L&\u0000"+
		"\u0337\u0338\u0005G\u0000\u0000\u0338\u0339\u0005\u0017\u0000\u0000\u0339"+
		"\u033a\u0003\u008cF\u0000\u033a\u033b\u0005\u0010\u0000\u0000\u033b\u033c"+
		"\u0003\u00c8d\u0000\u033c\u033d\u0005\u0018\u0000\u0000\u033d\u034e\u0001"+
		"\u0000\u0000\u0000\u033e\u033f\u0005\u0017\u0000\u0000\u033f\u0340\u0003"+
		"\u008cF\u0000\u0340\u0341\u0005\u0018\u0000\u0000\u0341\u034e\u0001\u0000"+
		"\u0000\u0000\u0342\u0343\u0007\u0006\u0000\u0000\u0343\u034e\u0003\u008c"+
		"F\u0013\u0344\u0345\u0007\u0007\u0000\u0000\u0345\u034e\u0003\u008cF\u0012"+
		"\u0346\u0347\u0005H\u0000\u0000\u0347\u034e\u0003\u008cF\u0011\u0348\u0349"+
		"\u0005I\u0000\u0000\u0349\u034e\u0003\u008cF\u0010\u034a\u034b\u0005\u0006"+
		"\u0000\u0000\u034b\u034e\u0003\u008cF\u000f\u034c\u034e\u0003\u008eG\u0000"+
		"\u034d\u0334\u0001\u0000\u0000\u0000\u034d\u0337\u0001\u0000\u0000\u0000"+
		"\u034d\u033e\u0001\u0000\u0000\u0000\u034d\u0342\u0001\u0000\u0000\u0000"+
		"\u034d\u0344\u0001\u0000\u0000\u0000\u034d\u0346\u0001\u0000\u0000\u0000"+
		"\u034d\u0348\u0001\u0000\u0000\u0000\u034d\u034a\u0001\u0000\u0000\u0000"+
		"\u034d\u034c\u0001\u0000\u0000\u0000\u034e\u0399\u0001\u0000\u0000\u0000"+
		"\u034f\u0350\n\u000e\u0000\u0000\u0350\u0351\u0005J\u0000\u0000\u0351"+
		"\u0398\u0003\u008cF\u000e\u0352\u0353\n\r\u0000\u0000\u0353\u0354\u0007"+
		"\b\u0000\u0000\u0354\u0398\u0003\u008cF\u000e\u0355\u0356\n\f\u0000\u0000"+
		"\u0356\u0357\u0007\u0007\u0000\u0000\u0357\u0398\u0003\u008cF\r\u0358"+
		"\u0359\n\u000b\u0000\u0000\u0359\u035a\u0007\t\u0000\u0000\u035a\u0398"+
		"\u0003\u008cF\f\u035b\u035c\n\n\u0000\u0000\u035c\u035d\u0005\u001d\u0000"+
		"\u0000\u035d\u0398\u0003\u008cF\u000b\u035e\u035f\n\t\u0000\u0000\u035f"+
		"\u0360\u0005\u0005\u0000\u0000\u0360\u0398\u0003\u008cF\n\u0361\u0362"+
		"\n\b\u0000\u0000\u0362\u0363\u0005\u001c\u0000\u0000\u0363\u0398\u0003"+
		"\u008cF\t\u0364\u0365\n\u0007\u0000\u0000\u0365\u0366\u0007\n\u0000\u0000"+
		"\u0366\u0398\u0003\u008cF\b\u0367\u0368\n\u0006\u0000\u0000\u0368\u0369"+
		"\u0007\u000b\u0000\u0000\u0369\u0398\u0003\u008cF\u0007\u036a\u036b\n"+
		"\u0005\u0000\u0000\u036b\u036c\u0005M\u0000\u0000\u036c\u0398\u0003\u008c"+
		"F\u0006\u036d\u036e\n\u0004\u0000\u0000\u036e\u036f\u0005\u0004\u0000"+
		"\u0000\u036f\u0398\u0003\u008cF\u0005\u0370\u0371\n\u0003\u0000\u0000"+
		"\u0371\u0372\u0005N\u0000\u0000\u0372\u0373\u0003\u008cF\u0000\u0373\u0374"+
		"\u0005F\u0000\u0000\u0374\u0375\u0003\u008cF\u0003\u0375\u0398\u0001\u0000"+
		"\u0000\u0000\u0376\u0377\n\u0002\u0000\u0000\u0377\u0378\u0007\f\u0000"+
		"\u0000\u0378\u0398\u0003\u008cF\u0003\u0379\u037a\n\u001c\u0000\u0000"+
		"\u037a\u0398\u0007\u0006\u0000\u0000\u037b\u037c\n\u001a\u0000\u0000\u037c"+
		"\u037d\u0005*\u0000\u0000\u037d\u037e\u0003\u008cF\u0000\u037e\u037f\u0005"+
		"+\u0000\u0000\u037f\u0398\u0001\u0000\u0000\u0000\u0380\u0381\n\u0019"+
		"\u0000\u0000\u0381\u0383\u0005*\u0000\u0000\u0382\u0384\u0003\u008cF\u0000"+
		"\u0383\u0382\u0001\u0000\u0000\u0000\u0383\u0384\u0001\u0000\u0000\u0000"+
		"\u0384\u0385\u0001\u0000\u0000\u0000\u0385\u0387\u0005F\u0000\u0000\u0386"+
		"\u0388\u0003\u008cF\u0000\u0387\u0386\u0001\u0000\u0000\u0000\u0387\u0388"+
		"\u0001\u0000\u0000\u0000\u0388\u0389\u0001\u0000\u0000\u0000\u0389\u0398"+
		"\u0005+\u0000\u0000\u038a\u038b\n\u0018\u0000\u0000\u038b\u038c\u0005"+
		"-\u0000\u0000\u038c\u0398\u0003\u00c2a\u0000\u038d\u038e\n\u0017\u0000"+
		"\u0000\u038e\u038f\u0005\u000f\u0000\u0000\u038f\u0390\u0003\u0092I\u0000"+
		"\u0390\u0391\u0005\u0011\u0000\u0000\u0391\u0398\u0001\u0000\u0000\u0000"+
		"\u0392\u0393\n\u0015\u0000\u0000\u0393\u0394\u0005\u0017\u0000\u0000\u0394"+
		"\u0395\u0003\u0096K\u0000\u0395\u0396\u0005\u0018\u0000\u0000\u0396\u0398"+
		"\u0001\u0000\u0000\u0000\u0397\u034f\u0001\u0000\u0000\u0000\u0397\u0352"+
		"\u0001\u0000\u0000\u0000\u0397\u0355\u0001\u0000\u0000\u0000\u0397\u0358"+
		"\u0001\u0000\u0000\u0000\u0397\u035b\u0001\u0000\u0000\u0000\u0397\u035e"+
		"\u0001\u0000\u0000\u0000\u0397\u0361\u0001\u0000\u0000\u0000\u0397\u0364"+
		"\u0001\u0000\u0000\u0000\u0397\u0367\u0001\u0000\u0000\u0000\u0397\u036a"+
		"\u0001\u0000\u0000\u0000\u0397\u036d\u0001\u0000\u0000\u0000\u0397\u0370"+
		"\u0001\u0000\u0000\u0000\u0397\u0376\u0001\u0000\u0000\u0000\u0397\u0379"+
		"\u0001\u0000\u0000\u0000\u0397\u037b\u0001\u0000\u0000\u0000\u0397\u0380"+
		"\u0001\u0000\u0000\u0000\u0397\u038a\u0001\u0000\u0000\u0000\u0397\u038d"+
		"\u0001\u0000\u0000\u0000\u0397\u0392\u0001\u0000\u0000\u0000\u0398\u039b"+
		"\u0001\u0000\u0000\u0000\u0399\u0397\u0001\u0000\u0000\u0000\u0399\u039a"+
		"\u0001\u0000\u0000\u0000\u039a\u008d\u0001\u0000\u0000\u0000\u039b\u0399"+
		"\u0001\u0000\u0000\u0000\u039c\u03a6\u0005g\u0000\u0000\u039d\u03a6\u0003"+
		"\u00c0`\u0000\u039e\u03a6\u0003\u00c4b\u0000\u039f\u03a6\u0003\u00c8d"+
		"\u0000\u03a0\u03a6\u0003\u00c2a\u0000\u03a1\u03a6\u0005{\u0000\u0000\u03a2"+
		"\u03a6\u0005v\u0000\u0000\u03a3\u03a6\u0003\u00be_\u0000\u03a4\u03a6\u0003"+
		"L&\u0000\u03a5\u039c\u0001\u0000\u0000\u0000\u03a5\u039d\u0001\u0000\u0000"+
		"\u0000\u03a5\u039e\u0001\u0000\u0000\u0000\u03a5\u039f\u0001\u0000\u0000"+
		"\u0000\u03a5\u03a0\u0001\u0000\u0000\u0000\u03a5\u03a1\u0001\u0000\u0000"+
		"\u0000\u03a5\u03a2\u0001\u0000\u0000\u0000\u03a5\u03a3\u0001\u0000\u0000"+
		"\u0000\u03a5\u03a4\u0001\u0000\u0000\u0000\u03a6\u008f\u0001\u0000\u0000"+
		"\u0000\u03a7\u03ac\u0003\u008cF\u0000\u03a8\u03a9\u0005\u0010\u0000\u0000"+
		"\u03a9\u03ab\u0003\u008cF\u0000\u03aa\u03a8\u0001\u0000\u0000\u0000\u03ab"+
		"\u03ae\u0001\u0000\u0000\u0000\u03ac\u03aa\u0001\u0000\u0000\u0000\u03ac"+
		"\u03ad\u0001\u0000\u0000\u0000\u03ad\u0091\u0001\u0000\u0000\u0000\u03ae"+
		"\u03ac\u0001\u0000\u0000\u0000\u03af\u03b4\u0003\u0094J\u0000\u03b0\u03b1"+
		"\u0005\u0010\u0000\u0000\u03b1\u03b3\u0003\u0094J\u0000\u03b2\u03b0\u0001"+
		"\u0000\u0000\u0000\u03b3\u03b6\u0001\u0000\u0000\u0000\u03b4\u03b2\u0001"+
		"\u0000\u0000\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5\u03b8\u0001"+
		"\u0000\u0000\u0000\u03b6\u03b4\u0001\u0000\u0000\u0000\u03b7\u03b9\u0005"+
		"\u0010\u0000\u0000\u03b8\u03b7\u0001\u0000\u0000\u0000\u03b8\u03b9\u0001"+
		"\u0000\u0000\u0000\u03b9\u0093\u0001\u0000\u0000\u0000\u03ba\u03bb\u0003"+
		"\u00c2a\u0000\u03bb\u03bc\u0005F\u0000\u0000\u03bc\u03bd\u0003\u008cF"+
		"\u0000\u03bd\u0095\u0001\u0000\u0000\u0000\u03be\u03c0\u0005\u000f\u0000"+
		"\u0000\u03bf\u03c1\u0003\u0092I\u0000\u03c0\u03bf\u0001\u0000\u0000\u0000"+
		"\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c2\u0001\u0000\u0000\u0000"+
		"\u03c2\u03c7\u0005\u0011\u0000\u0000\u03c3\u03c5\u0003\u0090H\u0000\u03c4"+
		"\u03c3\u0001\u0000\u0000\u0000\u03c4\u03c5\u0001\u0000\u0000\u0000\u03c5"+
		"\u03c7\u0001\u0000\u0000\u0000\u03c6\u03be\u0001\u0000\u0000\u0000\u03c6"+
		"\u03c4\u0001\u0000\u0000\u0000\u03c7\u0097\u0001\u0000\u0000\u0000\u03c8"+
		"\u03c9\u0003\u008cF\u0000\u03c9\u03ca\u0005\u0017\u0000\u0000\u03ca\u03cb"+
		"\u0003\u0096K\u0000\u03cb\u03cc\u0005\u0018\u0000\u0000\u03cc\u0099\u0001"+
		"\u0000\u0000\u0000\u03cd\u03d1\u0005\u000f\u0000\u0000\u03ce\u03d0\u0003"+
		"\u009cN\u0000\u03cf\u03ce\u0001\u0000\u0000\u0000\u03d0\u03d3\u0001\u0000"+
		"\u0000\u0000\u03d1\u03cf\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001\u0000"+
		"\u0000\u0000\u03d2\u03d4\u0001\u0000\u0000\u0000\u03d3\u03d1\u0001\u0000"+
		"\u0000\u0000\u03d4\u03d5\u0005\u0011\u0000\u0000\u03d5\u009b\u0001\u0000"+
		"\u0000\u0000\u03d6\u03e8\u0003\u00c2a\u0000\u03d7\u03e8\u0003\u009aM\u0000"+
		"\u03d8\u03e8\u0003\u009eO\u0000\u03d9\u03e8\u0003\u00a4R\u0000\u03da\u03e8"+
		"\u0003\u00a6S\u0000\u03db\u03e8\u0003\u00acV\u0000\u03dc\u03e8\u0003\u00ae"+
		"W\u0000\u03dd\u03e8\u0003\u00b0X\u0000\u03de\u03e8\u0003\u00b4Z\u0000"+
		"\u03df\u03e8\u0003\u00b8\\\u0000\u03e0\u03e8\u0003\u00ba]\u0000\u03e1"+
		"\u03e8\u0005n\u0000\u0000\u03e2\u03e8\u0005q\u0000\u0000\u03e3\u03e8\u0005"+
		"r\u0000\u0000\u03e4\u03e8\u0003\u00c0`\u0000\u03e5\u03e8\u0003\u00c8d"+
		"\u0000\u03e6\u03e8\u0003\u00c4b\u0000\u03e7\u03d6\u0001\u0000\u0000\u0000"+
		"\u03e7\u03d7\u0001\u0000\u0000\u0000\u03e7\u03d8\u0001\u0000\u0000\u0000"+
		"\u03e7\u03d9\u0001\u0000\u0000\u0000\u03e7\u03da\u0001\u0000\u0000\u0000"+
		"\u03e7\u03db\u0001\u0000\u0000\u0000\u03e7\u03dc\u0001\u0000\u0000\u0000"+
		"\u03e7\u03dd\u0001\u0000\u0000\u0000\u03e7\u03de\u0001\u0000\u0000\u0000"+
		"\u03e7\u03df\u0001\u0000\u0000\u0000\u03e7\u03e0\u0001\u0000\u0000\u0000"+
		"\u03e7\u03e1\u0001\u0000\u0000\u0000\u03e7\u03e2\u0001\u0000\u0000\u0000"+
		"\u03e7\u03e3\u0001\u0000\u0000\u0000\u03e7\u03e4\u0001\u0000\u0000\u0000"+
		"\u03e7\u03e5\u0001\u0000\u0000\u0000\u03e7\u03e6\u0001\u0000\u0000\u0000"+
		"\u03e8\u009d\u0001\u0000\u0000\u0000\u03e9\u03ed\u0003\u00a2Q\u0000\u03ea"+
		"\u03ed\u0003\u00bc^\u0000\u03eb\u03ed\u0003\u00a0P\u0000\u03ec\u03e9\u0001"+
		"\u0000\u0000\u0000\u03ec\u03ea\u0001\u0000\u0000\u0000\u03ec\u03eb\u0001"+
		"\u0000\u0000\u0000\u03ed\u009f\u0001\u0000\u0000\u0000\u03ee\u03ef\u0003"+
		"\u00c2a\u0000\u03ef\u03f0\u0005-\u0000\u0000\u03f0\u03f1\u0003\u00c2a"+
		"\u0000\u03f1\u00a1\u0001\u0000\u0000\u0000\u03f2\u03f7\u0005;\u0000\u0000"+
		"\u03f3\u03f7\u0005,\u0000\u0000\u03f4\u03f7\u0005B\u0000\u0000\u03f5\u03f7"+
		"\u0003\u00c2a\u0000\u03f6\u03f2\u0001\u0000\u0000\u0000\u03f6\u03f3\u0001"+
		"\u0000\u0000\u0000\u03f6\u03f4\u0001\u0000\u0000\u0000\u03f6\u03f5\u0001"+
		"\u0000\u0000\u0000\u03f7\u0404\u0001\u0000\u0000\u0000\u03f8\u03fa\u0005"+
		"\u0017\u0000\u0000\u03f9\u03fb\u0003\u009eO\u0000\u03fa\u03f9\u0001\u0000"+
		"\u0000\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000\u03fb\u0400\u0001\u0000"+
		"\u0000\u0000\u03fc\u03fd\u0005\u0010\u0000\u0000\u03fd\u03ff\u0003\u009e"+
		"O\u0000\u03fe\u03fc\u0001\u0000\u0000\u0000\u03ff\u0402\u0001\u0000\u0000"+
		"\u0000\u0400\u03fe\u0001\u0000\u0000\u0000\u0400\u0401\u0001\u0000\u0000"+
		"\u0000\u0401\u0403\u0001\u0000\u0000\u0000\u0402\u0400\u0001\u0000\u0000"+
		"\u0000\u0403\u0405\u0005\u0018\u0000\u0000\u0404\u03f8\u0001\u0000\u0000"+
		"\u0000\u0404\u0405\u0001\u0000\u0000\u0000\u0405\u00a3\u0001\u0000\u0000"+
		"\u0000\u0406\u0407\u0005Y\u0000\u0000\u0407\u040a\u0003\u00a8T\u0000\u0408"+
		"\u0409\u0005Z\u0000\u0000\u0409\u040b\u0003\u009eO\u0000\u040a\u0408\u0001"+
		"\u0000\u0000\u0000\u040a\u040b\u0001\u0000\u0000\u0000\u040b\u00a5\u0001"+
		"\u0000\u0000\u0000\u040c\u040d\u0003\u00a8T\u0000\u040d\u040e\u0005Z\u0000"+
		"\u0000\u040e\u040f\u0003\u009eO\u0000\u040f\u00a7\u0001\u0000\u0000\u0000"+
		"\u0410\u0418\u0003\u00c2a\u0000\u0411\u0418\u0003\u00a0P\u0000\u0412\u0418"+
		"\u0003\u00aaU\u0000\u0413\u0414\u0005\u0017\u0000\u0000\u0414\u0415\u0003"+
		"\u00aaU\u0000\u0415\u0416\u0005\u0018\u0000\u0000\u0416\u0418\u0001\u0000"+
		"\u0000\u0000\u0417\u0410\u0001\u0000\u0000\u0000\u0417\u0411\u0001\u0000"+
		"\u0000\u0000\u0417\u0412\u0001\u0000\u0000\u0000\u0417\u0413\u0001\u0000"+
		"\u0000\u0000\u0418\u00a9\u0001\u0000\u0000\u0000\u0419\u041e\u0003\u00c2"+
		"a\u0000\u041a\u041b\u0005\u0010\u0000\u0000\u041b\u041d\u0003\u00c2a\u0000"+
		"\u041c\u041a\u0001\u0000\u0000\u0000\u041d\u0420\u0001\u0000\u0000\u0000"+
		"\u041e\u041c\u0001\u0000\u0000\u0000\u041e\u041f\u0001\u0000\u0000\u0000"+
		"\u041f\u00ab\u0001\u0000\u0000\u0000\u0420\u041e\u0001\u0000\u0000\u0000"+
		"\u0421\u0422\u0003\u009eO\u0000\u0422\u0423\u0005[\u0000\u0000\u0423\u0424"+
		"\u0003\u00c2a\u0000\u0424\u00ad\u0001\u0000\u0000\u0000\u0425\u0426\u0003"+
		"\u00c2a\u0000\u0426\u0427\u0005F\u0000\u0000\u0427\u00af\u0001\u0000\u0000"+
		"\u0000\u0428\u0429\u0005\\\u0000\u0000\u0429\u042d\u0003\u009eO\u0000"+
		"\u042a\u042c\u0003\u00b2Y\u0000\u042b\u042a\u0001\u0000\u0000\u0000\u042c"+
		"\u042f\u0001\u0000\u0000\u0000\u042d\u042b\u0001\u0000\u0000\u0000\u042d"+
		"\u042e\u0001\u0000\u0000\u0000\u042e\u00b1\u0001\u0000\u0000\u0000\u042f"+
		"\u042d\u0001\u0000\u0000\u0000\u0430\u0431\u0005]\u0000\u0000\u0431\u0432"+
		"\u0003\u00bc^\u0000\u0432\u0433\u0003\u009aM\u0000\u0433\u0437\u0001\u0000"+
		"\u0000\u0000\u0434\u0435\u0005^\u0000\u0000\u0435\u0437\u0003\u009aM\u0000"+
		"\u0436\u0430\u0001\u0000\u0000\u0000\u0436\u0434\u0001\u0000\u0000\u0000"+
		"\u0437\u00b3\u0001\u0000\u0000\u0000\u0438\u0439\u0005&\u0000\u0000\u0439"+
		"\u043a\u0003\u00c2a\u0000\u043a\u043c\u0005\u0017\u0000\u0000\u043b\u043d"+
		"\u0003\u00aaU\u0000\u043c\u043b\u0001\u0000\u0000\u0000\u043c\u043d\u0001"+
		"\u0000\u0000\u0000\u043d\u043e\u0001\u0000\u0000\u0000\u043e\u0440\u0005"+
		"\u0018\u0000\u0000\u043f\u0441\u0003\u00b6[\u0000\u0440\u043f\u0001\u0000"+
		"\u0000\u0000\u0440\u0441\u0001\u0000\u0000\u0000\u0441\u0442\u0001\u0000"+
		"\u0000\u0000\u0442\u0443\u0003\u009aM\u0000\u0443\u00b5\u0001\u0000\u0000"+
		"\u0000\u0444\u0445\u0005_\u0000\u0000\u0445\u0446\u0003\u00aaU\u0000\u0446"+
		"\u00b7\u0001\u0000\u0000\u0000\u0447\u044a\u0005\u001b\u0000\u0000\u0448"+
		"\u044b\u0003\u009aM\u0000\u0449\u044b\u0003\u009eO\u0000\u044a\u0448\u0001"+
		"\u0000\u0000\u0000\u044a\u0449\u0001\u0000\u0000\u0000\u044b\u044c\u0001"+
		"\u0000\u0000\u0000\u044c\u044f\u0003\u009eO\u0000\u044d\u0450\u0003\u009a"+
		"M\u0000\u044e\u0450\u0003\u009eO\u0000\u044f\u044d\u0001\u0000\u0000\u0000"+
		"\u044f\u044e\u0001\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000\u0000"+
		"\u0451\u0452\u0003\u009aM\u0000\u0452\u00b9\u0001\u0000\u0000\u0000\u0453"+
		"\u0454\u00053\u0000\u0000\u0454\u0455\u0003\u009eO\u0000\u0455\u0456\u0003"+
		"\u009aM\u0000\u0456\u00bb\u0001\u0000\u0000\u0000\u0457\u045d\u0003\u00c8"+
		"d\u0000\u0458\u045d\u0005h\u0000\u0000\u0459\u045d\u0005i\u0000\u0000"+
		"\u045a\u045d\u0003\u00c4b\u0000\u045b\u045d\u0005g\u0000\u0000\u045c\u0457"+
		"\u0001\u0000\u0000\u0000\u045c\u0458\u0001\u0000\u0000\u0000\u045c\u0459"+
		"\u0001\u0000\u0000\u0000\u045c\u045a\u0001\u0000\u0000\u0000\u045c\u045b"+
		"\u0001\u0000\u0000\u0000\u045d\u00bd\u0001\u0000\u0000\u0000\u045e\u0460"+
		"\u0005\u0017\u0000\u0000\u045f\u0461\u0003\u008cF\u0000\u0460\u045f\u0001"+
		"\u0000\u0000\u0000\u0460\u0461\u0001\u0000\u0000\u0000\u0461\u0468\u0001"+
		"\u0000\u0000\u0000\u0462\u0464\u0005\u0010\u0000\u0000\u0463\u0465\u0003"+
		"\u008cF\u0000\u0464\u0463\u0001\u0000\u0000\u0000\u0464\u0465\u0001\u0000"+
		"\u0000\u0000\u0465\u0467\u0001\u0000\u0000\u0000\u0466\u0462\u0001\u0000"+
		"\u0000\u0000\u0467\u046a\u0001\u0000\u0000\u0000\u0468\u0466\u0001\u0000"+
		"\u0000\u0000\u0468\u0469\u0001\u0000\u0000\u0000\u0469\u046b\u0001\u0000"+
		"\u0000\u0000\u046a\u0468\u0001\u0000\u0000\u0000\u046b\u0479\u0005\u0018"+
		"\u0000\u0000\u046c\u0475\u0005*\u0000\u0000\u046d\u0472\u0003\u008cF\u0000"+
		"\u046e\u046f\u0005\u0010\u0000\u0000\u046f\u0471\u0003\u008cF\u0000\u0470"+
		"\u046e\u0001\u0000\u0000\u0000\u0471\u0474\u0001\u0000\u0000\u0000\u0472"+
		"\u0470\u0001\u0000\u0000\u0000\u0472\u0473\u0001\u0000\u0000\u0000\u0473"+
		"\u0476\u0001\u0000\u0000\u0000\u0474\u0472\u0001\u0000\u0000\u0000\u0475"+
		"\u046d\u0001\u0000\u0000\u0000\u0475\u0476\u0001\u0000\u0000\u0000\u0476"+
		"\u0477\u0001\u0000\u0000\u0000\u0477\u0479\u0005+\u0000\u0000\u0478\u045e"+
		"\u0001\u0000\u0000\u0000\u0478\u046c\u0001\u0000\u0000\u0000\u0479\u00bf"+
		"\u0001\u0000\u0000\u0000\u047a\u047c\u0007\r\u0000\u0000\u047b\u047d\u0005"+
		"j\u0000\u0000\u047c\u047b\u0001\u0000\u0000\u0000\u047c\u047d\u0001\u0000"+
		"\u0000\u0000\u047d\u00c1\u0001\u0000\u0000\u0000\u047e\u047f\u0007\u000e"+
		"\u0000\u0000\u047f\u00c3\u0001\u0000\u0000\u0000\u0480\u0482\u0005k\u0000"+
		"\u0000\u0481\u0480\u0001\u0000\u0000\u0000\u0482\u0483\u0001\u0000\u0000"+
		"\u0000\u0483\u0481\u0001\u0000\u0000\u0000\u0483\u0484\u0001\u0000\u0000"+
		"\u0000\u0484\u00c5\u0001\u0000\u0000\u0000\u0485\u0491\u0005a\u0000\u0000"+
		"\u0486\u0487\u0005\u0017\u0000\u0000\u0487\u048c\u0003N\'\u0000\u0488"+
		"\u0489\u0005\u0010\u0000\u0000\u0489\u048b\u0003N\'\u0000\u048a\u0488"+
		"\u0001\u0000\u0000\u0000\u048b\u048e\u0001\u0000\u0000\u0000\u048c\u048a"+
		"\u0001\u0000\u0000\u0000\u048c\u048d\u0001\u0000\u0000\u0000\u048d\u048f"+
		"\u0001\u0000\u0000\u0000\u048e\u048c\u0001\u0000\u0000\u0000\u048f\u0490"+
		"\u0005\u0018\u0000\u0000\u0490\u0492\u0001\u0000\u0000\u0000\u0491\u0486"+
		"\u0001\u0000\u0000\u0000\u0491\u0492\u0001\u0000\u0000\u0000\u0492\u00c7"+
		"\u0001\u0000\u0000\u0000\u0493\u0495\u0005\u0082\u0000\u0000\u0494\u0493"+
		"\u0001\u0000\u0000\u0000\u0495\u0496\u0001\u0000\u0000\u0000\u0496\u0494"+
		"\u0001\u0000\u0000\u0000\u0496\u0497\u0001\u0000\u0000\u0000\u0497\u00c9"+
		"\u0001\u0000\u0000\u0000\u0082\u00d5\u00d7\u00e6\u00ea\u00ef\u00f5\u00f9"+
		"\u00fc\u0101\u0107\u010e\u0112\u011f\u0127\u012c\u0136\u0139\u013f\u0147"+
		"\u014a\u0155\u015e\u0160\u0166\u0181\u0184\u018f\u0194\u0199\u01a7\u01aa"+
		"\u01b1\u01b5\u01b7\u01bc\u01c1\u01c4\u01ca\u01ce\u01d2\u01d7\u01e4\u01e6"+
		"\u01ed\u01f7\u01fd\u0208\u020b\u0211\u0214\u021c\u021f\u0225\u0228\u0230"+
		"\u0233\u0239\u023d\u0248\u024d\u0252\u025a\u025f\u0265\u026a\u0277\u0279"+
		"\u027e\u0288\u029c\u02a8\u02ad\u02b3\u02b7\u02ba\u02c6\u02cf\u02d3\u02d6"+
		"\u02dd\u02e3\u02f9\u030f\u0313\u0318\u031c\u0320\u0325\u032a\u032e\u034d"+
		"\u0383\u0387\u0397\u0399\u03a5\u03ac\u03b4\u03b8\u03c0\u03c4\u03c6\u03d1"+
		"\u03e7\u03ec\u03f6\u03fa\u0400\u0404\u040a\u0417\u041e\u042d\u0436\u043c"+
		"\u0440\u044a\u044f\u045c\u0460\u0464\u0468\u0472\u0475\u0478\u047c\u0483"+
		"\u048c\u0491\u0496";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}