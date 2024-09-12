// Generated from D:/9/Research/Ghasemi/SolidityAST/src/main/grammar/Solidity.g4 by ANTLR 4.13.1
package parsers;

    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.declaration.utility.*;
    import main.ast.nodes.statement.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.modifier.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.primary.*;
    import main.ast.nodes.expression.value.*;
//    import main.ast.nodes.expression.value.primitive.*;
    import main.ast.nodes.expression.type.*;
    import main.ast.nodes.expression.type.primitive.*;

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
		RULE_importDeclaration = 7, RULE_importDirective = 8, RULE_importElement = 9, 
		RULE_importPath = 10, RULE_contractDefinition = 11, RULE_inheritanceSpecifier = 12, 
		RULE_contractPart = 13, RULE_stateVariableDeclaration = 14, RULE_fileLevelConstant = 15, 
		RULE_customErrorDefinition = 16, RULE_typeDefinition = 17, RULE_usingForDeclaration = 18, 
		RULE_usingForObject = 19, RULE_usingForObjectDirective = 20, RULE_userDefinableOperators = 21, 
		RULE_structDefinition = 22, RULE_modifierDefinition = 23, RULE_modifierInvocation = 24, 
		RULE_functionDefinition = 25, RULE_functionDescriptor = 26, RULE_returnParameters = 27, 
		RULE_modifierList = 28, RULE_eventDefinition = 29, RULE_enumValue = 30, 
		RULE_enumDefinition = 31, RULE_parameterList = 32, RULE_parameter = 33, 
		RULE_eventParameterList = 34, RULE_eventParameter = 35, RULE_functionTypeParameterList = 36, 
		RULE_functionTypeParameter = 37, RULE_variableDeclaration = 38, RULE_typeName = 39, 
		RULE_userDefinedTypeName = 40, RULE_mappingKey = 41, RULE_mapping = 42, 
		RULE_mappingKeyName = 43, RULE_mappingValueName = 44, RULE_functionTypeName = 45, 
		RULE_storageLocation = 46, RULE_stateMutability = 47, RULE_block = 48, 
		RULE_statement = 49, RULE_expressionStatement = 50, RULE_ifStatement = 51, 
		RULE_tryStatement = 52, RULE_catchClause = 53, RULE_whileStatement = 54, 
		RULE_simpleStatement = 55, RULE_uncheckedStatement = 56, RULE_forStatement = 57, 
		RULE_inlineAssemblyStatement = 58, RULE_inlineAssemblyStatementFlag = 59, 
		RULE_doWhileStatement = 60, RULE_continueStatement = 61, RULE_breakStatement = 62, 
		RULE_returnStatement = 63, RULE_throwStatement = 64, RULE_emitStatement = 65, 
		RULE_revertStatement = 66, RULE_variableDeclarationStatement = 67, RULE_variableDeclarationList = 68, 
		RULE_identifierList = 69, RULE_elementaryTypeName = 70, RULE_expression = 71, 
		RULE_primaryExpression = 72, RULE_expressionList = 73, RULE_nameValueList = 74, 
		RULE_nameValue = 75, RULE_functionCallArguments = 76, RULE_functionCall = 77, 
		RULE_assemblyBlock = 78, RULE_assemblyItem = 79, RULE_assemblyExpression = 80, 
		RULE_assemblyMember = 81, RULE_assemblyCall = 82, RULE_assemblyLocalDefinition = 83, 
		RULE_assemblyAssignment = 84, RULE_assemblyIdentifierOrList = 85, RULE_assemblyIdentifierList = 86, 
		RULE_assemblyStackAssignment = 87, RULE_labelDefinition = 88, RULE_assemblySwitch = 89, 
		RULE_assemblyCase = 90, RULE_assemblyFunctionDefinition = 91, RULE_assemblyFunctionReturns = 92, 
		RULE_assemblyFor = 93, RULE_assemblyIf = 94, RULE_assemblyLiteral = 95, 
		RULE_tupleExpression = 96, RULE_numberLiteral = 97, RULE_identifier = 98, 
		RULE_hexLiteral = 99, RULE_stringLiteral = 100, RULE_overrideSpecifier = 101;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "pragmaDirective", "pragmaName", "pragmaValue", "version", 
			"versionOperator", "versionConstraint", "importDeclaration", "importDirective", 
			"importElement", "importPath", "contractDefinition", "inheritanceSpecifier", 
			"contractPart", "stateVariableDeclaration", "fileLevelConstant", "customErrorDefinition", 
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
			"identifier", "hexLiteral", "stringLiteral", "overrideSpecifier"
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
		public SourceUnit sourceUnitRet;
		public ImportDirectiveContext i;
		public ContractDefinitionContext co;
		public EnumDefinitionContext en;
		public StructDefinitionContext s;
		public FunctionDefinitionContext fu;
		public FileLevelConstantContext fi;
		public CustomErrorDefinitionContext cu;
		public UsingForDeclarationContext u;
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public List<PragmaDirectiveContext> pragmaDirective() {
			return getRuleContexts(PragmaDirectiveContext.class);
		}
		public PragmaDirectiveContext pragmaDirective(int i) {
			return getRuleContext(PragmaDirectiveContext.class,i);
		}
		public List<EventDefinitionContext> eventDefinition() {
			return getRuleContexts(EventDefinitionContext.class);
		}
		public EventDefinitionContext eventDefinition(int i) {
			return getRuleContext(EventDefinitionContext.class,i);
		}
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
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

			        ((SourceUnitContext)_localctx).sourceUnitRet =  new SourceUnit();
			        _localctx.sourceUnitRet.setLine(1);
			    
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4610468515353436158L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1710241421623033849L) != 0) || _la==ReceiveKeyword || _la==Identifier) {
				{
				setState(232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(205);
					pragmaDirective();
					}
					break;
				case 2:
					{
					setState(206);
					((SourceUnitContext)_localctx).i = importDirective();
					 _localctx.sourceUnitRet.addImportDirective(((SourceUnitContext)_localctx).i.importDirectiveRet); 
					}
					break;
				case 3:
					{
					setState(209);
					((SourceUnitContext)_localctx).co = contractDefinition();
					 _localctx.sourceUnitRet.addContractDefinition(((SourceUnitContext)_localctx).co.contractDefinitionRet); 
					}
					break;
				case 4:
					{
					setState(212);
					((SourceUnitContext)_localctx).en = enumDefinition();
					 _localctx.sourceUnitRet.addEnumDefinition(((SourceUnitContext)_localctx).en.enumDefinitionRet); 
					}
					break;
				case 5:
					{
					setState(215);
					eventDefinition();
					}
					break;
				case 6:
					{
					setState(216);
					((SourceUnitContext)_localctx).s = structDefinition();
					 _localctx.sourceUnitRet.addStructDefinition(((SourceUnitContext)_localctx).s.structDefinitionRet); 
					}
					break;
				case 7:
					{
					setState(219);
					((SourceUnitContext)_localctx).fu = functionDefinition();
					 _localctx.sourceUnitRet.addFunctionDefinition(((SourceUnitContext)_localctx).fu.functionDefinitionRet); 
					}
					break;
				case 8:
					{
					setState(222);
					((SourceUnitContext)_localctx).fi = fileLevelConstant();
					 _localctx.sourceUnitRet.addFileLevelConstant(((SourceUnitContext)_localctx).fi.fileLevelConstantRet); 
					}
					break;
				case 9:
					{
					setState(225);
					((SourceUnitContext)_localctx).cu = customErrorDefinition();
					 _localctx.sourceUnitRet.addCustomErrorDefinition(((SourceUnitContext)_localctx).cu.customErrorDefinitionRet); 
					}
					break;
				case 10:
					{
					setState(228);
					typeDefinition();
					}
					break;
				case 11:
					{
					setState(229);
					((SourceUnitContext)_localctx).u = usingForDeclaration();
					 _localctx.sourceUnitRet.addUsingForDeclaration(((SourceUnitContext)_localctx).u.usingForDeclarationRet); 
					}
					break;
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
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
			setState(239);
			match(T__0);
			setState(240);
			pragmaName();
			setState(241);
			pragmaValue();
			setState(242);
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
			setState(244);
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
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				version();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
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
			setState(251);
			versionConstraint();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4080L) != 0) || _la==DecimalNumber || _la==VersionLiteral) {
				{
				{
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(252);
					match(T__3);
					}
				}

				setState(255);
				versionConstraint();
				}
				}
				setState(260);
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
			setState(261);
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
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4064L) != 0)) {
					{
					setState(263);
					versionOperator();
					}
				}

				setState(266);
				match(VersionLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4064L) != 0)) {
					{
					setState(267);
					versionOperator();
					}
				}

				setState(270);
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
		public ImportElement importElementRet;
		public IdentifierContext id;
		public IdentifierContext as;
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
			setState(273);
			((ImportDeclarationContext)_localctx).id = identifier();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(274);
				match(T__11);
				setState(275);
				((ImportDeclarationContext)_localctx).as = identifier();
				}
			}

			 ((ImportDeclarationContext)_localctx).importElementRet =  new ImportElement((((ImportDeclarationContext)_localctx).id!=null?_input.getText(((ImportDeclarationContext)_localctx).id.start,((ImportDeclarationContext)_localctx).id.stop):null), (((ImportDeclarationContext)_localctx).as!=null?_input.getText(((ImportDeclarationContext)_localctx).as.start,((ImportDeclarationContext)_localctx).as.stop):null)); 
			}
		}
		catch (RecognitionException re) {
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
		public ImportDirective importDirectiveRet;
		public Token im;
		public ImportPathContext ip;
		public IdentifierContext as;
		public ImportElementContext el;
		public ImportDeclarationContext id;
		public ImportDeclarationContext newId;
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public ImportElementContext importElement() {
			return getRuleContext(ImportElementContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			((ImportDirectiveContext)_localctx).im = match(T__12);
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteralFragment:
				{
				setState(281);
				((ImportDirectiveContext)_localctx).ip = importPath();
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(282);
					match(T__11);
					setState(283);
					((ImportDirectiveContext)_localctx).as = identifier();
					}
				}

				setState(286);
				match(T__1);

				            ((ImportDirectiveContext)_localctx).importDirectiveRet =  new ImportDirective((((ImportDirectiveContext)_localctx).ip!=null?_input.getText(((ImportDirectiveContext)_localctx).ip.start,((ImportDirectiveContext)_localctx).ip.stop):null));
				            _localctx.importDirectiveRet.setAlias((((ImportDirectiveContext)_localctx).as!=null?_input.getText(((ImportDirectiveContext)_localctx).as.start,((ImportDirectiveContext)_localctx).as.stop):null));
				        
				}
				break;
			case T__2:
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
				setState(289);
				((ImportDirectiveContext)_localctx).el = importElement();
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(290);
					match(T__11);
					setState(291);
					((ImportDirectiveContext)_localctx).as = identifier();
					}
				}

				setState(294);
				match(T__13);
				setState(295);
				((ImportDirectiveContext)_localctx).ip = importPath();
				setState(296);
				match(T__1);

				            ((ImportDirectiveContext)_localctx).importDirectiveRet =  new ImportDirective((((ImportDirectiveContext)_localctx).ip!=null?_input.getText(((ImportDirectiveContext)_localctx).ip.start,((ImportDirectiveContext)_localctx).ip.stop):null));
				            _localctx.importDirectiveRet.addImportElement((((ImportDirectiveContext)_localctx).el!=null?_input.getText(((ImportDirectiveContext)_localctx).el.start,((ImportDirectiveContext)_localctx).el.stop):null), (((ImportDirectiveContext)_localctx).as!=null?_input.getText(((ImportDirectiveContext)_localctx).as.start,((ImportDirectiveContext)_localctx).as.stop):null));
				        
				}
				break;
			case T__14:
				{
				 ((ImportDirectiveContext)_localctx).importDirectiveRet =  new ImportDirective(); 
				setState(300);
				match(T__14);
				setState(301);
				((ImportDirectiveContext)_localctx).id = importDeclaration();
				 _localctx.importDirectiveRet.addImportElement(((ImportDirectiveContext)_localctx).id.importElementRet); 
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(303);
					match(T__15);
					setState(304);
					((ImportDirectiveContext)_localctx).newId = importDeclaration();
					 _localctx.importDirectiveRet.addImportElement(((ImportDirectiveContext)_localctx).newId.importElementRet); 
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(312);
				match(T__16);
				setState(313);
				match(T__13);
				setState(314);
				((ImportDirectiveContext)_localctx).ip = importPath();
				setState(315);
				match(T__1);
				 _localctx.importDirectiveRet.setImportPath((((ImportDirectiveContext)_localctx).ip!=null?_input.getText(((ImportDirectiveContext)_localctx).ip.start,((ImportDirectiveContext)_localctx).ip.stop):null)); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 _localctx.importDirectiveRet.setLine((((ImportDirectiveContext)_localctx).im!=null?((ImportDirectiveContext)_localctx).im.getLine():0)); 
			}
		}
		catch (RecognitionException re) {
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
	public static class ImportElementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImportElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitImportElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportElementContext importElement() throws RecognitionException {
		ImportElementContext _localctx = new ImportElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(322);
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
				setState(323);
				identifier();
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
		enterRule(_localctx, 20, RULE_importPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
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
		public ContractDefinition contractDefinitionRet;
		public Token ab1;
		public Token ab2;
		public IdentifierContext i;
		public InheritanceSpecifierContext i1;
		public InheritanceSpecifierContext i2;
		public ContractPartContext c;
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
		enterRule(_localctx, 22, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(328);
				((ContractDefinitionContext)_localctx).ab1 = match(T__17);
				}
			}

			setState(331);
			((ContractDefinitionContext)_localctx).ab2 = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
				((ContractDefinitionContext)_localctx).ab2 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(332);
			((ContractDefinitionContext)_localctx).i = identifier();

			        ((ContractDefinitionContext)_localctx).contractDefinitionRet =  new ContractDefinition(((ContractDefinitionContext)_localctx).i.identifierRet, (((ContractDefinitionContext)_localctx).ab2!=null?((ContractDefinitionContext)_localctx).ab2.getText():null));
			        if((((ContractDefinitionContext)_localctx).ab1!=null?((ContractDefinitionContext)_localctx).ab1.getText():null) != null)
			        {
			            _localctx.contractDefinitionRet.setLine((((ContractDefinitionContext)_localctx).ab1!=null?((ContractDefinitionContext)_localctx).ab1.getLine():0));
			            _localctx.contractDefinitionRet.setIsAbstract(true);
			        }
			        else _localctx.contractDefinitionRet.setLine((((ContractDefinitionContext)_localctx).ab2!=null?((ContractDefinitionContext)_localctx).ab2.getLine():0));
			    
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(334);
				match(T__21);
				setState(335);
				((ContractDefinitionContext)_localctx).i1 = inheritanceSpecifier();
				 _localctx.contractDefinitionRet.addInheritanceSpecifier(((ContractDefinitionContext)_localctx).i1.inheritanceSpecifierRet); 
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(337);
					match(T__15);
					setState(338);
					((ContractDefinitionContext)_localctx).i2 = inheritanceSpecifier();
					 _localctx.contractDefinitionRet.addInheritanceSpecifier(((ContractDefinitionContext)_localctx).i2.inheritanceSpecifierRet); 
					}
					}
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(348);
			match(T__14);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 8725798596909057L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 16781672573L) != 0)) {
				{
				{
				setState(349);
				((ContractDefinitionContext)_localctx).c = contractPart();
				 _localctx.contractDefinitionRet.addContractPart(((ContractDefinitionContext)_localctx).c.contractPartRet); 
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
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
		public InheritanceSpecifier inheritanceSpecifierRet;
		public UserDefinedTypeNameContext u;
		public ExpressionListContext e;
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
		enterRule(_localctx, 24, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			((InheritanceSpecifierContext)_localctx).u = userDefinedTypeName();
			 ((InheritanceSpecifierContext)_localctx).inheritanceSpecifierRet =  new InheritanceSpecifier(((InheritanceSpecifierContext)_localctx).u.userDefinedTypeNameRet); 
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(361);
				match(T__22);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
					{
					setState(362);
					((InheritanceSpecifierContext)_localctx).e = expressionList();
					 _localctx.inheritanceSpecifierRet.setExpressionList(((InheritanceSpecifierContext)_localctx).e.expressionListRet); 
					}
				}

				setState(367);
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
		public ContractPart contractPartRet;
		public StateVariableDeclarationContext st;
		public UsingForDeclarationContext us;
		public StructDefinitionContext str;
		public ModifierDefinitionContext mo;
		public FunctionDefinitionContext fu;
		public EventDefinitionContext ev;
		public EnumDefinitionContext en;
		public CustomErrorDefinitionContext cu;
		public TypeDefinitionContext ty;
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
		enterRule(_localctx, 26, RULE_contractPart);
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				((ContractPartContext)_localctx).st = stateVariableDeclaration();
				 ((ContractPartContext)_localctx).contractPartRet =  ((ContractPartContext)_localctx).st.stateVariableDeclarationRet; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				((ContractPartContext)_localctx).us = usingForDeclaration();
				 ((ContractPartContext)_localctx).contractPartRet =  ((ContractPartContext)_localctx).us.usingForDeclarationRet; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				((ContractPartContext)_localctx).str = structDefinition();
				 ((ContractPartContext)_localctx).contractPartRet =  ((ContractPartContext)_localctx).str.structDefinitionRet; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(379);
				((ContractPartContext)_localctx).mo = modifierDefinition();
				 ((ContractPartContext)_localctx).contractPartRet =  ((ContractPartContext)_localctx).mo.modifierDefinitionRet; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(382);
				((ContractPartContext)_localctx).fu = functionDefinition();
				 ((ContractPartContext)_localctx).contractPartRet =  ((ContractPartContext)_localctx).fu.functionDefinitionRet; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(385);
				((ContractPartContext)_localctx).ev = eventDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(386);
				((ContractPartContext)_localctx).en = enumDefinition();
				 ((ContractPartContext)_localctx).contractPartRet =  ((ContractPartContext)_localctx).en.enumDefinitionRet; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(389);
				((ContractPartContext)_localctx).cu = customErrorDefinition();
				 ((ContractPartContext)_localctx).contractPartRet =  ((ContractPartContext)_localctx).cu.customErrorDefinitionRet; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(392);
				((ContractPartContext)_localctx).ty = typeDefinition();
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
		public StateVariableDeclaration stateVariableDeclarationRet;
		public TypeNameContext t;
		public Token m1;
		public OverrideSpecifierContext m2;
		public IdentifierContext i;
		public ExpressionContext e;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 28, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			((StateVariableDeclarationContext)_localctx).t = typeName(0);

			        ((StateVariableDeclarationContext)_localctx).stateVariableDeclarationRet =  new StateVariableDeclaration(((StateVariableDeclarationContext)_localctx).t.typeNameRet);
			        _localctx.stateVariableDeclarationRet.setLine(((StateVariableDeclarationContext)_localctx).t.typeNameRet.getLine());
			    
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 13680641L) != 0)) {
				{
				setState(402);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ConstantKeyword:
				case ImmutableKeyword:
				case InternalKeyword:
				case PrivateKeyword:
				case PublicKeyword:
					{
					setState(397);
					((StateVariableDeclarationContext)_localctx).m1 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & 835L) != 0)) ) {
						((StateVariableDeclarationContext)_localctx).m1 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					 _localctx.stateVariableDeclarationRet.addModifier(new OtherModifers((((StateVariableDeclarationContext)_localctx).m1!=null?((StateVariableDeclarationContext)_localctx).m1.getText():null))); 
					}
					break;
				case T__96:
					{
					setState(399);
					((StateVariableDeclarationContext)_localctx).m2 = overrideSpecifier();
					 _localctx.stateVariableDeclarationRet.addModifier(((StateVariableDeclarationContext)_localctx).m2.overrideSpecifierRet); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407);
			((StateVariableDeclarationContext)_localctx).i = identifier();
			 _localctx.stateVariableDeclarationRet.setName(((StateVariableDeclarationContext)_localctx).i.identifierRet); 
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(409);
				match(T__10);
				setState(410);
				((StateVariableDeclarationContext)_localctx).e = expression(0);
				 _localctx.stateVariableDeclarationRet.setValue(((StateVariableDeclarationContext)_localctx).e.expressionRet); 
				}
			}

			setState(415);
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
		public FileLevelConstant fileLevelConstantRet;
		public TypeNameContext t;
		public IdentifierContext i;
		public ExpressionContext e;
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_fileLevelConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			((FileLevelConstantContext)_localctx).t = typeName(0);
			setState(418);
			match(ConstantKeyword);
			setState(419);
			((FileLevelConstantContext)_localctx).i = identifier();
			setState(420);
			match(T__10);
			setState(421);
			((FileLevelConstantContext)_localctx).e = expression(0);
			setState(422);
			match(T__1);

			        ((FileLevelConstantContext)_localctx).fileLevelConstantRet =  new FileLevelConstant(((FileLevelConstantContext)_localctx).t.typeNameRet, ((FileLevelConstantContext)_localctx).i.identifierRet, ((FileLevelConstantContext)_localctx).e.expressionRet);
			        _localctx.fileLevelConstantRet.setLine(((FileLevelConstantContext)_localctx).t.typeNameRet.getLine());
			    
			}
		}
		catch (RecognitionException re) {
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
		public CustomErrorDefinition customErrorDefinitionRet;
		public Token e;
		public IdentifierContext i;
		public ParameterListContext p;
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
		enterRule(_localctx, 32, RULE_customErrorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			((CustomErrorDefinitionContext)_localctx).e = match(T__24);
			setState(426);
			((CustomErrorDefinitionContext)_localctx).i = identifier();
			setState(427);
			((CustomErrorDefinitionContext)_localctx).p = parameterList();
			setState(428);
			match(T__1);

			        ((CustomErrorDefinitionContext)_localctx).customErrorDefinitionRet =  new CustomErrorDefinition(((CustomErrorDefinitionContext)_localctx).i.identifierRet, ((CustomErrorDefinitionContext)_localctx).p.parameterListRet);
			        _localctx.customErrorDefinitionRet.setLine((((CustomErrorDefinitionContext)_localctx).e!=null?((CustomErrorDefinitionContext)_localctx).e.getLine():0));
			    
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 34, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(TypeKeyword);
			setState(432);
			identifier();
			setState(433);
			match(T__21);
			setState(434);
			elementaryTypeName();
			setState(435);
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
		public UsingForDeclaration usingForDeclarationRet;
		public Token u;
		public UsingForObjectContext ufo;
		public TypeNameContext t;
		public Token gk;
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
		enterRule(_localctx, 36, RULE_usingForDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			((UsingForDeclarationContext)_localctx).u = match(T__25);
			setState(438);
			((UsingForDeclarationContext)_localctx).ufo = usingForObject();
			setState(439);
			match(T__26);

			        ((UsingForDeclarationContext)_localctx).usingForDeclarationRet =  new UsingForDeclaration(((UsingForDeclarationContext)_localctx).ufo.usingForObjectRet);
			        _localctx.usingForDeclarationRet.setLine((((UsingForDeclarationContext)_localctx).u!=null?((UsingForDeclarationContext)_localctx).u.getLine():0));
			    
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(441);
				match(T__2);
				 _localctx.usingForDeclarationRet.setAllType(true); 
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
				setState(443);
				((UsingForDeclarationContext)_localctx).t = typeName(0);
				 _localctx.usingForDeclarationRet.setType(((UsingForDeclarationContext)_localctx).t.typeNameRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GlobalKeyword) {
				{
				setState(448);
				((UsingForDeclarationContext)_localctx).gk = match(GlobalKeyword);
				}
			}

			 if((((UsingForDeclarationContext)_localctx).gk!=null?((UsingForDeclarationContext)_localctx).gk.getText():null) != null) _localctx.usingForDeclarationRet.setGlobal(true); 
			setState(452);
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
		public UsingForObject usingForObjectRet;
		public UserDefinedTypeNameContext u;
		public Token br;
		public UsingForObjectDirectiveContext o1;
		public UsingForObjectDirectiveContext o2;
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
		enterRule(_localctx, 38, RULE_usingForObject);
		int _la;
		try {
			setState(472);
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
				setState(454);
				((UsingForObjectContext)_localctx).u = userDefinedTypeName();

				        ((UsingForObjectContext)_localctx).usingForObjectRet =  new UsingForObject(((UsingForObjectContext)_localctx).u.userDefinedTypeNameRet);
				        _localctx.usingForObjectRet.setLine(((UsingForObjectContext)_localctx).u.userDefinedTypeNameRet.getLine());
				    
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				((UsingForObjectContext)_localctx).br = match(T__14);

				      ((UsingForObjectContext)_localctx).usingForObjectRet =  new UsingForObject();
				      _localctx.usingForObjectRet.setLine((((UsingForObjectContext)_localctx).br!=null?((UsingForObjectContext)_localctx).br.getLine():0));
				    
				setState(459);
				((UsingForObjectContext)_localctx).o1 = usingForObjectDirective();
				 _localctx.usingForObjectRet.addObjectDirective(((UsingForObjectContext)_localctx).o1.usingForObjectDirectiveRet); 
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(461);
					match(T__15);
					setState(462);
					((UsingForObjectContext)_localctx).o2 = usingForObjectDirective();
					 _localctx.usingForObjectRet.addObjectDirective(((UsingForObjectContext)_localctx).o2.usingForObjectDirectiveRet); 
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(470);
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
		public UsingForObjectDirective usingForObjectDirectiveRet;
		public UserDefinedTypeNameContext udt;
		public UserDefinableOperatorsContext udo;
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
		enterRule(_localctx, 40, RULE_usingForObjectDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			((UsingForObjectDirectiveContext)_localctx).udt = userDefinedTypeName();

			        ((UsingForObjectDirectiveContext)_localctx).usingForObjectDirectiveRet =  new UsingForObjectDirective(((UsingForObjectDirectiveContext)_localctx).udt.userDefinedTypeNameRet);
			        _localctx.usingForObjectDirectiveRet.setLine(((UsingForObjectDirectiveContext)_localctx).udt.userDefinedTypeNameRet.getLine());
			    
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(476);
				match(T__11);
				setState(477);
				((UsingForObjectDirectiveContext)_localctx).udo = userDefinableOperators();
				 _localctx.usingForObjectDirectiveRet.setAliasOperator(((UsingForObjectDirectiveContext)_localctx).udo.userDefinableOperatorRet); 
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
		public UserDefinableOperator userDefinableOperatorRet;
		public Token op;
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
		enterRule(_localctx, 42, RULE_userDefinableOperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			((UserDefinableOperatorsContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 68451043304L) != 0)) ) {
				((UserDefinableOperatorsContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 ((UserDefinableOperatorsContext)_localctx).userDefinableOperatorRet =  UserDefinableOperator.fromString((((UserDefinableOperatorsContext)_localctx).op!=null?((UserDefinableOperatorsContext)_localctx).op.getText():null)); 
			}
		}
		catch (RecognitionException re) {
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
		public StructDefinition structDefinitionRet;
		public Token s;
		public IdentifierContext id;
		public VariableDeclarationContext vd;
		public VariableDeclarationContext newVd;
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
		enterRule(_localctx, 44, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			((StructDefinitionContext)_localctx).s = match(T__35);
			setState(486);
			((StructDefinitionContext)_localctx).id = identifier();

			        ((StructDefinitionContext)_localctx).structDefinitionRet =  new StructDefinition((((StructDefinitionContext)_localctx).id!=null?_input.getText(((StructDefinitionContext)_localctx).id.start,((StructDefinitionContext)_localctx).id.stop):null));
			        _localctx.structDefinitionRet.setLine((((StructDefinitionContext)_localctx).s!=null?((StructDefinitionContext)_localctx).s.getLine():0));
			    
			setState(488);
			match(T__14);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 8725798382995457L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971197L) != 0)) {
				{
				setState(489);
				((StructDefinitionContext)_localctx).vd = variableDeclaration();
				setState(490);
				match(T__1);
				 _localctx.structDefinitionRet.addVariableDeclaration(((StructDefinitionContext)_localctx).vd.variableDeclarationRet); 
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 8725798382995457L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971197L) != 0)) {
					{
					{
					setState(492);
					((StructDefinitionContext)_localctx).newVd = variableDeclaration();
					setState(493);
					match(T__1);
					 _localctx.structDefinitionRet.addVariableDeclaration(((StructDefinitionContext)_localctx).newVd.variableDeclarationRet); 
					}
					}
					setState(500);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(503);
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
		public ModifierDefinition modifierDefinitionRet;
		public Token m;
		public IdentifierContext i;
		public ParameterListContext p;
		public Token m1;
		public OverrideSpecifierContext m2;
		public BlockContext b;
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
		enterRule(_localctx, 46, RULE_modifierDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			((ModifierDefinitionContext)_localctx).m = match(T__36);
			setState(506);
			((ModifierDefinitionContext)_localctx).i = identifier();

			        ((ModifierDefinitionContext)_localctx).modifierDefinitionRet =  new ModifierDefinition(((ModifierDefinitionContext)_localctx).i.identifierRet);
			        _localctx.modifierDefinitionRet.setLine((((ModifierDefinitionContext)_localctx).m!=null?((ModifierDefinitionContext)_localctx).m.getLine():0));
			    
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(508);
				((ModifierDefinitionContext)_localctx).p = parameterList();
				 _localctx.modifierDefinitionRet.setParameterList(((ModifierDefinitionContext)_localctx).p.parameterListRet); 
				}
			}

			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__96 || _la==VirtualKeyword) {
				{
				setState(518);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VirtualKeyword:
					{
					setState(513);
					((ModifierDefinitionContext)_localctx).m1 = match(VirtualKeyword);
					 _localctx.modifierDefinitionRet.setModifier(new OtherModifers((((ModifierDefinitionContext)_localctx).m1!=null?((ModifierDefinitionContext)_localctx).m1.getText():null))); 
					}
					break;
				case T__96:
					{
					setState(515);
					((ModifierDefinitionContext)_localctx).m2 = overrideSpecifier();
					 _localctx.modifierDefinitionRet.setModifier(((ModifierDefinitionContext)_localctx).m2.overrideSpecifierRet); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(523);
				match(T__1);
				}
				break;
			case T__14:
				{
				setState(524);
				((ModifierDefinitionContext)_localctx).b = block();
				 _localctx.modifierDefinitionRet.setScope(((ModifierDefinitionContext)_localctx).b.blockRet); 
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
		public ModifierInvocation modifierInvocationRet;
		public IdentifierContext i;
		public ExpressionListContext e;
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
		enterRule(_localctx, 48, RULE_modifierInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			((ModifierInvocationContext)_localctx).i = identifier();
			 ((ModifierInvocationContext)_localctx).modifierInvocationRet =  new ModifierInvocation(((ModifierInvocationContext)_localctx).i.identifierRet); 
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				 _localctx.modifierInvocationRet.setParanthesized(true); 
				setState(532);
				match(T__22);
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
					{
					setState(533);
					((ModifierInvocationContext)_localctx).e = expressionList();
					 _localctx.modifierInvocationRet.setExpressionList(((ModifierInvocationContext)_localctx).e.expressionListRet); 
					}
				}

				setState(538);
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
		public FunctionDefinition functionDefinitionRet;
		public FunctionDescriptorContext fd;
		public ParameterListContext pl;
		public ModifierListContext ml;
		public ReturnParametersContext r;
		public BlockContext b;
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
		enterRule(_localctx, 50, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			((FunctionDefinitionContext)_localctx).fd = functionDescriptor();
			setState(542);
			((FunctionDefinitionContext)_localctx).pl = parameterList();
			setState(543);
			((FunctionDefinitionContext)_localctx).ml = modifierList();

			        ((FunctionDefinitionContext)_localctx).functionDefinitionRet =  new FunctionDefinition(((FunctionDefinitionContext)_localctx).fd.functionDescriptorRet, ((FunctionDefinitionContext)_localctx).pl.parameterListRet, ((FunctionDefinitionContext)_localctx).ml.modifierListRet);
			        _localctx.functionDefinitionRet.setLine(((FunctionDefinitionContext)_localctx).fd.functionDescriptorRet.getLine());
			    
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(545);
				((FunctionDefinitionContext)_localctx).r = returnParameters();
				 _localctx.functionDefinitionRet.setReturnParameterList(((FunctionDefinitionContext)_localctx).r.returnParametersRet); 
				}
			}

			setState(554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(550);
				match(T__1);
				}
				break;
			case T__14:
				{
				setState(551);
				((FunctionDefinitionContext)_localctx).b = block();
				 _localctx.functionDefinitionRet.setScope(((FunctionDefinitionContext)_localctx).b.blockRet); 
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
		public PrimaryExpression functionDescriptorRet;
		public Token fd;
		public IdentifierContext i;
		public Token f1;
		public Token f2;
		public Token f3;
		public TerminalNode ConstructorKeyword() { return getToken(SolidityParser.ConstructorKeyword, 0); }
		public TerminalNode FallbackKeyword() { return getToken(SolidityParser.FallbackKeyword, 0); }
		public TerminalNode ReceiveKeyword() { return getToken(SolidityParser.ReceiveKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_functionDescriptor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				{
				setState(556);
				((FunctionDescriptorContext)_localctx).fd = match(T__37);

				            ((FunctionDescriptorContext)_localctx).functionDescriptorRet =  new FunctionDescriptor();
				            _localctx.functionDescriptorRet.setLine((((FunctionDescriptorContext)_localctx).fd!=null?((FunctionDescriptorContext)_localctx).fd.getLine():0));
				        
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
					{
					setState(558);
					((FunctionDescriptorContext)_localctx).i = identifier();

					            ((FunctionDescriptorContext)_localctx).functionDescriptorRet =  new FunctionDescriptor(((FunctionDescriptorContext)_localctx).i.identifierRet);
					            _localctx.functionDescriptorRet.setLine((((FunctionDescriptorContext)_localctx).fd!=null?((FunctionDescriptorContext)_localctx).fd.getLine():0));
					        
					}
				}

				}
				break;
			case ConstructorKeyword:
				{
				setState(563);
				((FunctionDescriptorContext)_localctx).f1 = match(ConstructorKeyword);

				            ((FunctionDescriptorContext)_localctx).functionDescriptorRet =  new OtherFunctionDescriptors((((FunctionDescriptorContext)_localctx).f1!=null?((FunctionDescriptorContext)_localctx).f1.getText():null));
				            _localctx.functionDescriptorRet.setLine((((FunctionDescriptorContext)_localctx).f1!=null?((FunctionDescriptorContext)_localctx).f1.getLine():0));
				        
				}
				break;
			case FallbackKeyword:
				{
				setState(565);
				((FunctionDescriptorContext)_localctx).f2 = match(FallbackKeyword);

				            ((FunctionDescriptorContext)_localctx).functionDescriptorRet =  new OtherFunctionDescriptors((((FunctionDescriptorContext)_localctx).f2!=null?((FunctionDescriptorContext)_localctx).f2.getText():null));
				            _localctx.functionDescriptorRet.setLine((((FunctionDescriptorContext)_localctx).f2!=null?((FunctionDescriptorContext)_localctx).f2.getLine():0));
				        
				}
				break;
			case ReceiveKeyword:
				{
				setState(567);
				((FunctionDescriptorContext)_localctx).f3 = match(ReceiveKeyword);

				            ((FunctionDescriptorContext)_localctx).functionDescriptorRet =  new OtherFunctionDescriptors((((FunctionDescriptorContext)_localctx).f3!=null?((FunctionDescriptorContext)_localctx).f3.getText():null));
				            _localctx.functionDescriptorRet.setLine((((FunctionDescriptorContext)_localctx).f3!=null?((FunctionDescriptorContext)_localctx).f3.getLine():0));
				        
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
	public static class ReturnParametersContext extends ParserRuleContext {
		public ParameterList returnParametersRet;
		public ParameterListContext p;
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
		enterRule(_localctx, 54, RULE_returnParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(T__38);
			setState(574);
			((ReturnParametersContext)_localctx).p = parameterList();
			 ((ReturnParametersContext)_localctx).returnParametersRet =  ((ReturnParametersContext)_localctx).p.parameterListRet; 
			}
		}
		catch (RecognitionException re) {
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
		public ModifierList modifierListRet;
		public Token op;
		public StateMutabilityContext s;
		public ModifierInvocationContext m;
		public OverrideSpecifierContext ov;
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
		enterRule(_localctx, 56, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ModifierListContext)_localctx).modifierListRet =  new ModifierList(); 
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14896889859L) != 0)) {
				{
				setState(591);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ExternalKeyword:
				case InternalKeyword:
				case PrivateKeyword:
				case PublicKeyword:
				case VirtualKeyword:
					{
					setState(578);
					((ModifierListContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 117L) != 0)) ) {
						((ModifierListContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}

					            _localctx.modifierListRet.addModifier((((ModifierListContext)_localctx).op!=null?((ModifierListContext)_localctx).op.getText():null));
					        
					}
					break;
				case T__13:
				case T__24:
				case T__43:
				case T__49:
				case T__61:
				case T__95:
				case T__96:
				case ConstantKeyword:
				case LeaveKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
				case GlobalKeyword:
				case ConstructorKeyword:
				case ReceiveKeyword:
				case Identifier:
					{
					setState(589);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(580);
						((ModifierListContext)_localctx).s = stateMutability();
						 _localctx.modifierListRet.addModifier((((ModifierListContext)_localctx).s!=null?_input.getText(((ModifierListContext)_localctx).s.start,((ModifierListContext)_localctx).s.stop):null));  
						}
						break;
					case 2:
						{
						setState(583);
						((ModifierListContext)_localctx).m = modifierInvocation();
						 _localctx.modifierListRet.addModifier(((ModifierListContext)_localctx).m.modifierInvocationRet); 
						}
						break;
					case 3:
						{
						setState(586);
						((ModifierListContext)_localctx).ov = overrideSpecifier();
						 _localctx.modifierListRet.addModifier(((ModifierListContext)_localctx).ov.overrideSpecifierRet); 
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(595);
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
		enterRule(_localctx, 58, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(T__39);
			setState(597);
			identifier();
			setState(598);
			eventParameterList();
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(599);
				match(AnonymousKeyword);
				}
			}

			setState(602);
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
		public EnumValue enumValueRet;
		public IdentifierContext i;
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
		enterRule(_localctx, 60, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			((EnumValueContext)_localctx).i = identifier();
			 ((EnumValueContext)_localctx).enumValueRet =  new EnumValue(((EnumValueContext)_localctx).i.identifierRet); _localctx.enumValueRet.setLine(((EnumValueContext)_localctx).i.identifierRet.getLine()); 
			}
		}
		catch (RecognitionException re) {
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
		public EnumDefinition enumDefinitionRet;
		public Token e;
		public IdentifierContext i;
		public EnumValueContext e1;
		public EnumValueContext e2;
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
		enterRule(_localctx, 62, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			((EnumDefinitionContext)_localctx).e = match(T__40);
			setState(608);
			((EnumDefinitionContext)_localctx).i = identifier();
			 ((EnumDefinitionContext)_localctx).enumDefinitionRet =  new EnumDefinition(((EnumDefinitionContext)_localctx).i.identifierRet); _localctx.enumDefinitionRet.setLine((((EnumDefinitionContext)_localctx).e!=null?((EnumDefinitionContext)_localctx).e.getLine():0)); 
			setState(610);
			match(T__14);
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
				{
				setState(611);
				((EnumDefinitionContext)_localctx).e1 = enumValue();
				}
			}

			 if((((EnumDefinitionContext)_localctx).e1!=null?_input.getText(((EnumDefinitionContext)_localctx).e1.start,((EnumDefinitionContext)_localctx).e1.stop):null) != null) _localctx.enumDefinitionRet.addEnumValue(((EnumDefinitionContext)_localctx).e1.enumValueRet); 
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(615);
				match(T__15);
				setState(616);
				((EnumDefinitionContext)_localctx).e2 = enumValue();
				_localctx.enumDefinitionRet.addEnumValue(((EnumDefinitionContext)_localctx).e2.enumValueRet);
				}
				}
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(624);
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
		public ParameterList parameterListRet;
		public ParameterContext p1;
		public ParameterContext p2;
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
		enterRule(_localctx, 64, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(T__22);
			 ((ParameterListContext)_localctx).parameterListRet =  new ParameterList(); 
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 8725798382995457L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971197L) != 0)) {
				{
				setState(628);
				((ParameterListContext)_localctx).p1 = parameter();
				 _localctx.parameterListRet.addParameter(((ParameterListContext)_localctx).p1.parameterRet); 
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(630);
					match(T__15);
					setState(631);
					((ParameterListContext)_localctx).p2 = parameter();
					 _localctx.parameterListRet.addParameter(((ParameterListContext)_localctx).p2.parameterRet); 
					}
					}
					setState(638);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(641);
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
		public Parameter parameterRet;
		public TypeNameContext t;
		public StorageLocationContext s;
		public IdentifierContext i;
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
		enterRule(_localctx, 66, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			((ParameterContext)_localctx).t = typeName(0);
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(644);
				((ParameterContext)_localctx).s = storageLocation();
				}
				break;
			}
			 ((ParameterContext)_localctx).parameterRet =  new Parameter(((ParameterContext)_localctx).t.typeNameRet, (((ParameterContext)_localctx).s!=null?_input.getText(((ParameterContext)_localctx).s.start,((ParameterContext)_localctx).s.stop):null)); 
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
				{
				setState(648);
				((ParameterContext)_localctx).i = identifier();
				}
			}

			 if((((ParameterContext)_localctx).i!=null?_input.getText(((ParameterContext)_localctx).i.start,((ParameterContext)_localctx).i.stop):null) != null) _localctx.parameterRet.setIdentifier(((ParameterContext)_localctx).i.identifierRet); 
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 68, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(T__22);
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 8725798382995457L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971197L) != 0)) {
				{
				setState(654);
				eventParameter();
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(655);
					match(T__15);
					setState(656);
					eventParameter();
					}
					}
					setState(661);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(664);
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
		enterRule(_localctx, 70, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			typeName(0);
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(667);
				match(IndexedKeyword);
				}
			}

			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
				{
				setState(670);
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
		public FunctionTypeParameterList functionTypeParameterListRet;
		public FunctionTypeParameterContext ftp;
		public FunctionTypeParameterContext newFtp;
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
		enterRule(_localctx, 72, RULE_functionTypeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionTypeParameterListContext)_localctx).functionTypeParameterListRet =  new FunctionTypeParameterList(); 
			setState(674);
			match(T__22);
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 8725798382995457L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971197L) != 0)) {
				{
				setState(675);
				((FunctionTypeParameterListContext)_localctx).ftp = functionTypeParameter();
				 _localctx.functionTypeParameterListRet.addFunctionTypeParameter(((FunctionTypeParameterListContext)_localctx).ftp.functionTypeParameterRet); 
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(677);
					match(T__15);
					setState(678);
					((FunctionTypeParameterListContext)_localctx).newFtp = functionTypeParameter();
					 _localctx.functionTypeParameterListRet.addFunctionTypeParameter(((FunctionTypeParameterListContext)_localctx).newFtp.functionTypeParameterRet); 
					}
					}
					setState(685);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(688);
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
		public FunctionTypeParameter functionTypeParameterRet;
		public TypeNameContext t;
		public StorageLocationContext s;
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
		enterRule(_localctx, 74, RULE_functionTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			((FunctionTypeParameterContext)_localctx).t = typeName(0);
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) {
				{
				setState(691);
				((FunctionTypeParameterContext)_localctx).s = storageLocation();
				}
			}

			 ((FunctionTypeParameterContext)_localctx).functionTypeParameterRet =  new FunctionTypeParameter(((FunctionTypeParameterContext)_localctx).t.typeNameRet, (((FunctionTypeParameterContext)_localctx).s!=null?_input.getText(((FunctionTypeParameterContext)_localctx).s.start,((FunctionTypeParameterContext)_localctx).s.stop):null)); 
			}
		}
		catch (RecognitionException re) {
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
		public VariableDeclaration variableDeclarationRet;
		public TypeNameContext tn;
		public StorageLocationContext s;
		public IdentifierContext id;
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
		enterRule(_localctx, 76, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			((VariableDeclarationContext)_localctx).tn = typeName(0);
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(697);
				((VariableDeclarationContext)_localctx).s = storageLocation();
				}
				break;
			}
			setState(700);
			((VariableDeclarationContext)_localctx).id = identifier();

			        ((VariableDeclarationContext)_localctx).variableDeclarationRet =  new VariableDeclaration(((VariableDeclarationContext)_localctx).id.identifierRet, ((VariableDeclarationContext)_localctx).tn.typeNameRet, (((VariableDeclarationContext)_localctx).s!=null?_input.getText(((VariableDeclarationContext)_localctx).s.start,((VariableDeclarationContext)_localctx).s.stop):null));
			        _localctx.variableDeclarationRet.setLine(((VariableDeclarationContext)_localctx).tn.typeNameRet.getLine());
			    
			}
		}
		catch (RecognitionException re) {
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
		public Type typeNameRet;
		public TypeNameContext t;
		public ElementaryTypeNameContext e;
		public UserDefinedTypeNameContext u;
		public MappingContext m;
		public FunctionTypeNameContext f;
		public Token a;
		public ExpressionContext ex;
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_typeName, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(704);
				((TypeNameContext)_localctx).e = elementaryTypeName();
				 ((TypeNameContext)_localctx).typeNameRet =  ((TypeNameContext)_localctx).e.elementaryTypeNameRet; 
				}
				break;
			case 2:
				{
				setState(707);
				((TypeNameContext)_localctx).u = userDefinedTypeName();
				 ((TypeNameContext)_localctx).typeNameRet =  ((TypeNameContext)_localctx).u.userDefinedTypeNameRet; 
				}
				break;
			case 3:
				{
				setState(710);
				((TypeNameContext)_localctx).m = mapping();
				 ((TypeNameContext)_localctx).typeNameRet =  ((TypeNameContext)_localctx).m.mappingRet; 
				}
				break;
			case 4:
				{
				setState(713);
				((TypeNameContext)_localctx).f = functionTypeName();
				 ((TypeNameContext)_localctx).typeNameRet =  ((TypeNameContext)_localctx).f.functionTypeNameRet; 
				}
				break;
			case 5:
				{
				setState(716);
				((TypeNameContext)_localctx).a = match(T__43);
				setState(717);
				match(PayableKeyword);
				 ((TypeNameContext)_localctx).typeNameRet =  new AddressPayable(); _localctx.typeNameRet.setLine((((TypeNameContext)_localctx).a!=null?((TypeNameContext)_localctx).a.getLine():0)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					_localctx.t = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(721);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(722);
					match(T__41);
					setState(724);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
						{
						setState(723);
						((TypeNameContext)_localctx).ex = expression(0);
						}
					}

					setState(726);
					match(T__42);

					                   if ((((TypeNameContext)_localctx).ex!=null?_input.getText(((TypeNameContext)_localctx).ex.start,((TypeNameContext)_localctx).ex.stop):null) == null) ((TypeNameContext)_localctx).typeNameRet =  new ListType(((TypeNameContext)_localctx).t.typeNameRet);
					                   else ((TypeNameContext)_localctx).typeNameRet =  new ListType(((TypeNameContext)_localctx).t.typeNameRet, ((TypeNameContext)_localctx).ex.expressionRet);
					                   _localctx.typeNameRet.setLine(((TypeNameContext)_localctx).t.typeNameRet.getLine());
					               
					}
					} 
				}
				setState(732);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UserDefinedTypeNameContext extends ParserRuleContext {
		public UserDefinedTypeName userDefinedTypeNameRet;
		public IdentifierContext id;
		public IdentifierContext newId;
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
		enterRule(_localctx, 80, RULE_userDefinedTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 ((UserDefinedTypeNameContext)_localctx).userDefinedTypeNameRet =  new UserDefinedTypeName(); 
			setState(734);
			((UserDefinedTypeNameContext)_localctx).id = identifier();
			 _localctx.userDefinedTypeNameRet.addChainRing((((UserDefinedTypeNameContext)_localctx).id!=null?_input.getText(((UserDefinedTypeNameContext)_localctx).id.start,((UserDefinedTypeNameContext)_localctx).id.stop):null)); 
			setState(742);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(736);
					match(T__44);
					setState(737);
					((UserDefinedTypeNameContext)_localctx).newId = identifier();
					 _localctx.userDefinedTypeNameRet.addChainRing((((UserDefinedTypeNameContext)_localctx).newId!=null?_input.getText(((UserDefinedTypeNameContext)_localctx).newId.start,((UserDefinedTypeNameContext)_localctx).newId.stop):null)); 
					}
					} 
				}
				setState(744);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			 _localctx.userDefinedTypeNameRet.setLine(((UserDefinedTypeNameContext)_localctx).id.identifierRet.getLine()); 
			}
		}
		catch (RecognitionException re) {
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
		public Type mappingKeyRet;
		public ElementaryTypeNameContext e;
		public UserDefinedTypeNameContext u;
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
		enterRule(_localctx, 82, RULE_mappingKey);
		try {
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				((MappingKeyContext)_localctx).e = elementaryTypeName();
				 ((MappingKeyContext)_localctx).mappingKeyRet =  ((MappingKeyContext)_localctx).e.elementaryTypeNameRet; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				((MappingKeyContext)_localctx).u = userDefinedTypeName();
				 ((MappingKeyContext)_localctx).mappingKeyRet =  ((MappingKeyContext)_localctx).u.userDefinedTypeNameRet; 
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
		public Mapping mappingRet;
		public Token m;
		public MappingKeyContext mk;
		public MappingKeyNameContext mkn;
		public TypeNameContext tn;
		public MappingValueNameContext mvn;
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
		enterRule(_localctx, 84, RULE_mapping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			((MappingContext)_localctx).m = match(T__45);
			setState(756);
			match(T__22);
			setState(757);
			((MappingContext)_localctx).mk = mappingKey();
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
				{
				setState(758);
				((MappingContext)_localctx).mkn = mappingKeyName();
				}
			}

			setState(761);
			match(T__46);
			setState(762);
			((MappingContext)_localctx).tn = typeName(0);
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
				{
				setState(763);
				((MappingContext)_localctx).mvn = mappingValueName();
				}
			}

			setState(766);
			match(T__23);

			        ((MappingContext)_localctx).mappingRet =  new Mapping(((MappingContext)_localctx).mk.mappingKeyRet, (((MappingContext)_localctx).mkn!=null?_input.getText(((MappingContext)_localctx).mkn.start,((MappingContext)_localctx).mkn.stop):null), ((MappingContext)_localctx).tn.typeNameRet, (((MappingContext)_localctx).mvn!=null?_input.getText(((MappingContext)_localctx).mvn.start,((MappingContext)_localctx).mvn.stop):null));
			        _localctx.mappingRet.setLine((((MappingContext)_localctx).m!=null?((MappingContext)_localctx).m.getLine():0));
			    
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 86, RULE_mappingKeyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
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
		enterRule(_localctx, 88, RULE_mappingValueName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
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
		public FunctionTypeName functionTypeNameRet;
		public Token f;
		public FunctionTypeParameterListContext ftplf;
		public Token i;
		public Token e;
		public StateMutabilityContext s;
		public FunctionTypeParameterListContext ftplr;
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
		enterRule(_localctx, 90, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			((FunctionTypeNameContext)_localctx).f = match(T__37);
			 ((FunctionTypeNameContext)_localctx).functionTypeNameRet =  new FunctionTypeName(); 
			setState(775);
			((FunctionTypeNameContext)_localctx).ftplf = functionTypeParameterList();
			 _localctx.functionTypeNameRet.setFunctionTypeParameterList(((FunctionTypeNameContext)_localctx).ftplf.functionTypeParameterListRet); 
			setState(786);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(784);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(777);
						((FunctionTypeNameContext)_localctx).i = match(InternalKeyword);
						 _localctx.functionTypeNameRet.addFunctionModifier((((FunctionTypeNameContext)_localctx).i!=null?((FunctionTypeNameContext)_localctx).i.getText():null)); 
						}
						break;
					case ExternalKeyword:
						{
						setState(779);
						((FunctionTypeNameContext)_localctx).e = match(ExternalKeyword);
						 _localctx.functionTypeNameRet.addFunctionModifier((((FunctionTypeNameContext)_localctx).e!=null?((FunctionTypeNameContext)_localctx).e.getText():null)); 
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(781);
						((FunctionTypeNameContext)_localctx).s = stateMutability();
						 _localctx.functionTypeNameRet.addFunctionModifier((((FunctionTypeNameContext)_localctx).s!=null?_input.getText(((FunctionTypeNameContext)_localctx).s.start,((FunctionTypeNameContext)_localctx).s.stop):null)); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(788);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(789);
				match(T__38);
				setState(790);
				((FunctionTypeNameContext)_localctx).ftplr = functionTypeParameterList();
				 _localctx.functionTypeNameRet.setFunctionReturnTypeParameterList(((FunctionTypeNameContext)_localctx).ftplr.functionTypeParameterListRet); 
				}
				break;
			}
			 _localctx.functionTypeNameRet.setLine((((FunctionTypeNameContext)_localctx).f!=null?((FunctionTypeNameContext)_localctx).f.getLine():0)); 
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 92, RULE_storageLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
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
		enterRule(_localctx, 94, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
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
		public Block blockRet;
		public Token br;
		public StatementContext s;
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
		enterRule(_localctx, 96, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			((BlockContext)_localctx).br = match(T__14);
			 ((BlockContext)_localctx).blockRet =  new Block(); _localctx.blockRet.setLine((((BlockContext)_localctx).br!=null?((BlockContext)_localctx).br.getLine():0)); 
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -367988449869055L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067507696049061895L) != 0)) {
				{
				{
				setState(803);
				((BlockContext)_localctx).s = statement();
				 _localctx.blockRet.addStatement(((BlockContext)_localctx).s.statementRet); 
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(811);
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
		public Statement statementRet;
		public IfStatementContext ifs;
		public TryStatementContext tr;
		public WhileStatementContext w;
		public ForStatementContext f;
		public BlockContext bl;
		public InlineAssemblyStatementContext i;
		public DoWhileStatementContext d;
		public ContinueStatementContext c;
		public BreakStatementContext br;
		public ReturnStatementContext re;
		public ThrowStatementContext th;
		public EmitStatementContext em;
		public SimpleStatementContext si;
		public UncheckedStatementContext un;
		public RevertStatementContext rev;
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
		enterRule(_localctx, 98, RULE_statement);
		try {
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				((StatementContext)_localctx).ifs = ifStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).ifs.ifStatementRet; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(816);
				((StatementContext)_localctx).tr = tryStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(817);
				((StatementContext)_localctx).w = whileStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).w.whileStatementRet; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(820);
				((StatementContext)_localctx).f = forStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).f.forStatementRet; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(823);
				((StatementContext)_localctx).bl = block();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).bl.blockRet; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(826);
				((StatementContext)_localctx).i = inlineAssemblyStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(827);
				((StatementContext)_localctx).d = doWhileStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).d.doWhileStatementRet; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(830);
				((StatementContext)_localctx).c = continueStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).c.continueStatementRet; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(833);
				((StatementContext)_localctx).br = breakStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).br.breakStatementRet; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(836);
				((StatementContext)_localctx).re = returnStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).re.returnStatementRet; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(839);
				((StatementContext)_localctx).th = throwStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).th.throwStatementRet; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(842);
				((StatementContext)_localctx).em = emitStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(843);
				((StatementContext)_localctx).si = simpleStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).si.simpleStatementRet; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(846);
				((StatementContext)_localctx).un = uncheckedStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(847);
				((StatementContext)_localctx).rev = revertStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).rev.revertStatementRet; 
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
		public ExpressionStatement expressionStatementRet;
		public ExpressionContext e;
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
		enterRule(_localctx, 100, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			((ExpressionStatementContext)_localctx).e = expression(0);

			        ((ExpressionStatementContext)_localctx).expressionStatementRet =  new ExpressionStatement(((ExpressionStatementContext)_localctx).e.expressionRet);
			        _localctx.expressionStatementRet.setLine(((ExpressionStatementContext)_localctx).e.expressionRet.getLine());
			    
			setState(854);
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
		public IfStatement ifStatementRet;
		public Token i;
		public ExpressionContext e;
		public StatementContext s1;
		public StatementContext s2;
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
		enterRule(_localctx, 102, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			((IfStatementContext)_localctx).i = match(T__50);
			setState(857);
			match(T__22);
			setState(858);
			((IfStatementContext)_localctx).e = expression(0);
			setState(859);
			match(T__23);
			setState(860);
			((IfStatementContext)_localctx).s1 = statement();

			        ((IfStatementContext)_localctx).ifStatementRet =  new IfStatement(((IfStatementContext)_localctx).e.expressionRet, ((IfStatementContext)_localctx).s1.statementRet);
			        _localctx.ifStatementRet.setLine((((IfStatementContext)_localctx).i!=null?((IfStatementContext)_localctx).i.getLine():0));
			    
			setState(866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(862);
				match(T__51);
				setState(863);
				((IfStatementContext)_localctx).s2 = statement();
				 _localctx.ifStatementRet.setFalseResult(((IfStatementContext)_localctx).s2.statementRet); 
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
		enterRule(_localctx, 104, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			match(T__52);
			setState(869);
			expression(0);
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(870);
				returnParameters();
				}
			}

			setState(873);
			block();
			setState(875); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(874);
				catchClause();
				}
				}
				setState(877); 
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
		enterRule(_localctx, 106, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(T__53);
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510562234368L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
				{
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
					{
					setState(880);
					identifier();
					}
				}

				setState(883);
				parameterList();
				}
			}

			setState(886);
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
		public WhileStatement whileStatementRet;
		public Token w;
		public ExpressionContext e;
		public StatementContext s;
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
		enterRule(_localctx, 108, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			((WhileStatementContext)_localctx).w = match(T__54);
			setState(889);
			match(T__22);
			setState(890);
			((WhileStatementContext)_localctx).e = expression(0);
			setState(891);
			match(T__23);
			setState(892);
			((WhileStatementContext)_localctx).s = statement();

			        ((WhileStatementContext)_localctx).whileStatementRet =  new WhileStatement(((WhileStatementContext)_localctx).e.expressionRet, ((WhileStatementContext)_localctx).s.statementRet);
			        _localctx.whileStatementRet.setLine((((WhileStatementContext)_localctx).w!=null?((WhileStatementContext)_localctx).w.getLine():0));
			    
			}
		}
		catch (RecognitionException re) {
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
		public SimpleStatement simpleStatementRet;
		public VariableDeclarationStatementContext v;
		public ExpressionStatementContext e;
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
		enterRule(_localctx, 110, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(895);
				((SimpleStatementContext)_localctx).v = variableDeclarationStatement();
				 ((SimpleStatementContext)_localctx).simpleStatementRet =  ((SimpleStatementContext)_localctx).v.variableDeclarationStatementRet; 
				}
				break;
			case 2:
				{
				setState(898);
				((SimpleStatementContext)_localctx).e = expressionStatement();
				 ((SimpleStatementContext)_localctx).simpleStatementRet =  ((SimpleStatementContext)_localctx).e.expressionStatementRet; 
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
		enterRule(_localctx, 112, RULE_uncheckedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			match(T__55);
			setState(904);
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
		public ForStatement forStatementRet;
		public Token f;
		public SimpleStatementContext si;
		public ExpressionStatementContext es;
		public ExpressionContext e;
		public StatementContext st;
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
		enterRule(_localctx, 114, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			((ForStatementContext)_localctx).f = match(T__26);
			setState(907);
			match(T__22);
			 ((ForStatementContext)_localctx).forStatementRet =  new ForStatement(); _localctx.forStatementRet.setLine((((ForStatementContext)_localctx).f!=null?((ForStatementContext)_localctx).f.getLine():0)); 
			setState(913);
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
				setState(909);
				((ForStatementContext)_localctx).si = simpleStatement();
				 _localctx.forStatementRet.setInitial(((ForStatementContext)_localctx).si.simpleStatementRet); 
				}
				break;
			case T__1:
				{
				setState(912);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(919);
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
				setState(915);
				((ForStatementContext)_localctx).es = expressionStatement();
				 _localctx.forStatementRet.setCondition(((ForStatementContext)_localctx).es.expressionStatementRet); 
				}
				break;
			case T__1:
				{
				setState(918);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
				{
				setState(921);
				((ForStatementContext)_localctx).e = expression(0);
				 _localctx.forStatementRet.setIteration(((ForStatementContext)_localctx).e.expressionRet); 
				}
			}

			setState(926);
			match(T__23);
			setState(927);
			((ForStatementContext)_localctx).st = statement();
			 _localctx.forStatementRet.setScope(((ForStatementContext)_localctx).st.statementRet); 
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 116, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(T__56);
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteralFragment) {
				{
				setState(931);
				match(StringLiteralFragment);
				}
			}

			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(934);
				match(T__22);
				setState(935);
				inlineAssemblyStatementFlag();
				setState(936);
				match(T__23);
				}
			}

			setState(940);
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
		enterRule(_localctx, 118, RULE_inlineAssemblyStatementFlag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
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
		public DoWhileStatement doWhileStatementRet;
		public Token d;
		public StatementContext s;
		public ExpressionContext c;
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
		enterRule(_localctx, 120, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			((DoWhileStatementContext)_localctx).d = match(T__57);
			setState(945);
			((DoWhileStatementContext)_localctx).s = statement();
			setState(946);
			match(T__54);
			setState(947);
			match(T__22);
			setState(948);
			((DoWhileStatementContext)_localctx).c = expression(0);
			setState(949);
			match(T__23);
			setState(950);
			match(T__1);

			        ((DoWhileStatementContext)_localctx).doWhileStatementRet =  new DoWhileStatement(((DoWhileStatementContext)_localctx).s.statementRet, ((DoWhileStatementContext)_localctx).c.expressionRet);
			        _localctx.doWhileStatementRet.setLine((((DoWhileStatementContext)_localctx).d!=null?((DoWhileStatementContext)_localctx).d.getLine():0));
			    
			}
		}
		catch (RecognitionException re) {
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
		public ContinueStatement continueStatementRet;
		public Token c;
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
		enterRule(_localctx, 122, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			((ContinueStatementContext)_localctx).c = match(ContinueKeyword);
			setState(954);
			match(T__1);

			        ((ContinueStatementContext)_localctx).continueStatementRet =  new ContinueStatement();
			        _localctx.continueStatementRet.setLine((((ContinueStatementContext)_localctx).c!=null?((ContinueStatementContext)_localctx).c.getLine():0));
			    
			}
		}
		catch (RecognitionException re) {
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
		public BreakStatement breakStatementRet;
		public Token b;
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
		enterRule(_localctx, 124, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			((BreakStatementContext)_localctx).b = match(BreakKeyword);
			setState(958);
			match(T__1);

			        ((BreakStatementContext)_localctx).breakStatementRet =  new BreakStatement();
			        _localctx.breakStatementRet.setLine((((BreakStatementContext)_localctx).b!=null?((BreakStatementContext)_localctx).b.getLine():0));
			    
			}
		}
		catch (RecognitionException re) {
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
		public ReturnStatement returnStatementRet;
		public Token r;
		public ExpressionContext e;
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
		enterRule(_localctx, 126, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			((ReturnStatementContext)_localctx).r = match(T__58);
			 ((ReturnStatementContext)_localctx).returnStatementRet =  new ReturnStatement(); _localctx.returnStatementRet.setLine((((ReturnStatementContext)_localctx).r!=null?((ReturnStatementContext)_localctx).r.getLine():0)); 
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
				{
				setState(963);
				((ReturnStatementContext)_localctx).e = expression(0);
				 _localctx.returnStatementRet.setValue(((ReturnStatementContext)_localctx).e.expressionRet); 
				}
			}

			setState(968);
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
		public ThrowStatement throwStatementRet;
		public Token t;
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
		enterRule(_localctx, 128, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			((ThrowStatementContext)_localctx).t = match(T__59);
			setState(971);
			match(T__1);

			        ((ThrowStatementContext)_localctx).throwStatementRet =  new ThrowStatement();
			        _localctx.throwStatementRet.setLine((((ThrowStatementContext)_localctx).t!=null?((ThrowStatementContext)_localctx).t.getLine():0));
			    
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 130, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(T__60);
			setState(975);
			functionCall();
			setState(976);
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
		public RevertStatement revertStatementRet;
		public Token r;
		public FunctionCallContext fc;
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
		enterRule(_localctx, 132, RULE_revertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			((RevertStatementContext)_localctx).r = match(T__61);
			setState(979);
			((RevertStatementContext)_localctx).fc = functionCall();
			setState(980);
			match(T__1);
			 ((RevertStatementContext)_localctx).revertStatementRet =  new RevertStatement(((RevertStatementContext)_localctx).fc.functionCallExpressionRet); 
			}
		}
		catch (RecognitionException re) {
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
		public VariableDeclarationStatement variableDeclarationStatementRet;
		public Token v;
		public IdentifierListContext i;
		public VariableDeclarationContext vd;
		public Token para;
		public VariableDeclarationListContext vdl;
		public ExpressionContext e;
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
		enterRule(_localctx, 134, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((VariableDeclarationStatementContext)_localctx).variableDeclarationStatementRet =  new VariableDeclarationStatement(); 
			setState(997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(984);
				((VariableDeclarationStatementContext)_localctx).v = match(T__62);
				 _localctx.variableDeclarationStatementRet.setLine((((VariableDeclarationStatementContext)_localctx).v!=null?((VariableDeclarationStatementContext)_localctx).v.getLine():0)); 
				setState(986);
				((VariableDeclarationStatementContext)_localctx).i = identifierList();

				            _localctx.variableDeclarationStatementRet.setVariableList(((VariableDeclarationStatementContext)_localctx).i.identifierListRet);
				        
				}
				break;
			case 2:
				{
				setState(989);
				((VariableDeclarationStatementContext)_localctx).vd = variableDeclaration();

				            _localctx.variableDeclarationStatementRet.setVariableList(((VariableDeclarationStatementContext)_localctx).vd.variableDeclarationRet);
				            _localctx.variableDeclarationStatementRet.setLine(((VariableDeclarationStatementContext)_localctx).vd.variableDeclarationRet.getLine());
				        
				}
				break;
			case 3:
				{
				setState(992);
				((VariableDeclarationStatementContext)_localctx).para = match(T__22);
				setState(993);
				((VariableDeclarationStatementContext)_localctx).vdl = variableDeclarationList();

				            _localctx.variableDeclarationStatementRet.setVariableList(((VariableDeclarationStatementContext)_localctx).vdl.variableDeclarationListRet);
				            _localctx.variableDeclarationStatementRet.setLine((((VariableDeclarationStatementContext)_localctx).para!=null?((VariableDeclarationStatementContext)_localctx).para.getLine():0));
				        
				setState(995);
				match(T__23);
				}
				break;
			}
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(999);
				match(T__10);
				setState(1000);
				((VariableDeclarationStatementContext)_localctx).e = expression(0);
				 _localctx.variableDeclarationStatementRet.setInitiateValue(((VariableDeclarationStatementContext)_localctx).e.expressionRet); 
				}
			}

			setState(1005);
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
		public VariableDeclarationList variableDeclarationListRet;
		public VariableDeclarationContext vd1;
		public VariableDeclarationContext vd2;
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
		enterRule(_localctx, 136, RULE_variableDeclarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 ((VariableDeclarationListContext)_localctx).variableDeclarationListRet =  new VariableDeclarationList(); 
			setState(1016);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1011);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 8725798382995457L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971197L) != 0)) {
						{
						setState(1008);
						((VariableDeclarationListContext)_localctx).vd1 = variableDeclaration();

						        _localctx.variableDeclarationListRet.addVariableDeclaration(((VariableDeclarationListContext)_localctx).vd1.variableDeclarationRet);
						        _localctx.variableDeclarationListRet.setIsThereFirst(true);
						    
						}
					}

					setState(1013);
					match(T__15);
					}
					} 
				}
				setState(1018);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 8725798382995457L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971197L) != 0)) {
				{
				setState(1019);
				((VariableDeclarationListContext)_localctx).vd2 = variableDeclaration();

				        _localctx.variableDeclarationListRet.addVariableDeclaration(((VariableDeclarationListContext)_localctx).vd2.variableDeclarationRet);
				    
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
	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierList identifierListRet;
		public IdentifierContext i1;
		public IdentifierContext i2;
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
		enterRule(_localctx, 138, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			match(T__22);
			 ((IdentifierListContext)_localctx).identifierListRet =  new IdentifierList(); 
			setState(1034);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1029);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
						{
						setState(1026);
						((IdentifierListContext)_localctx).i1 = identifier();
						 _localctx.identifierListRet.addIdentifier(((IdentifierListContext)_localctx).i1.identifierRet); 
						}
					}

					setState(1031);
					match(T__15);
					}
					} 
				}
				setState(1036);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			setState(1040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
				{
				setState(1037);
				((IdentifierListContext)_localctx).i2 = identifier();
				 _localctx.identifierListRet.addIdentifier(((IdentifierListContext)_localctx).i2.identifierRet); 
				}
			}

			setState(1042);
			match(T__23);
			 if((((IdentifierListContext)_localctx).i1!=null?_input.getText(((IdentifierListContext)_localctx).i1.start,((IdentifierListContext)_localctx).i1.stop):null) == null) _localctx.identifierListRet.setFirstNull(true); 
			}
		}
		catch (RecognitionException re) {
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
		public ElementaryTypeName elementaryTypeNameRet;
		public Token a;
		public Token bo;
		public Token s;
		public Token v;
		public Token i;
		public Token ui;
		public Token by;
		public Token by_;
		public Token f;
		public Token uf;
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
		enterRule(_localctx, 140, RULE_elementaryTypeName);
		try {
			setState(1065);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(1045);
				((ElementaryTypeNameContext)_localctx).a = match(T__43);
				 ((ElementaryTypeNameContext)_localctx).elementaryTypeNameRet =  new AddressType(); _localctx.elementaryTypeNameRet.setLine((((ElementaryTypeNameContext)_localctx).a!=null?((ElementaryTypeNameContext)_localctx).a.getLine():0)); 
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 2);
				{
				setState(1047);
				((ElementaryTypeNameContext)_localctx).bo = match(T__63);
				 ((ElementaryTypeNameContext)_localctx).elementaryTypeNameRet =  new BoolType(); _localctx.elementaryTypeNameRet.setLine((((ElementaryTypeNameContext)_localctx).bo!=null?((ElementaryTypeNameContext)_localctx).bo.getLine():0)); 
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 3);
				{
				setState(1049);
				((ElementaryTypeNameContext)_localctx).s = match(T__64);
				 ((ElementaryTypeNameContext)_localctx).elementaryTypeNameRet =  new StringType(); _localctx.elementaryTypeNameRet.setLine((((ElementaryTypeNameContext)_localctx).s!=null?((ElementaryTypeNameContext)_localctx).s.getLine():0)); 
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 4);
				{
				setState(1051);
				((ElementaryTypeNameContext)_localctx).v = match(T__62);
				 ((ElementaryTypeNameContext)_localctx).elementaryTypeNameRet =  new VarType(); _localctx.elementaryTypeNameRet.setLine((((ElementaryTypeNameContext)_localctx).v!=null?((ElementaryTypeNameContext)_localctx).v.getLine():0)); 
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 5);
				{
				setState(1053);
				((ElementaryTypeNameContext)_localctx).i = match(Int);
				 ((ElementaryTypeNameContext)_localctx).elementaryTypeNameRet =  new IntType((((ElementaryTypeNameContext)_localctx).i!=null?((ElementaryTypeNameContext)_localctx).i.getText():null)); _localctx.elementaryTypeNameRet.setLine((((ElementaryTypeNameContext)_localctx).i!=null?((ElementaryTypeNameContext)_localctx).i.getLine():0)); 
				}
				break;
			case Uint:
				enterOuterAlt(_localctx, 6);
				{
				setState(1055);
				((ElementaryTypeNameContext)_localctx).ui = match(Uint);
				 ((ElementaryTypeNameContext)_localctx).elementaryTypeNameRet =  new UintType((((ElementaryTypeNameContext)_localctx).ui!=null?((ElementaryTypeNameContext)_localctx).ui.getText():null)); _localctx.elementaryTypeNameRet.setLine((((ElementaryTypeNameContext)_localctx).ui!=null?((ElementaryTypeNameContext)_localctx).ui.getLine():0)); 
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 7);
				{
				setState(1057);
				((ElementaryTypeNameContext)_localctx).by = match(T__65);
				 ((ElementaryTypeNameContext)_localctx).elementaryTypeNameRet =  new ByteLowerCaseType(); _localctx.elementaryTypeNameRet.setLine((((ElementaryTypeNameContext)_localctx).by!=null?((ElementaryTypeNameContext)_localctx).by.getLine():0)); 
				}
				break;
			case Byte:
				enterOuterAlt(_localctx, 8);
				{
				setState(1059);
				((ElementaryTypeNameContext)_localctx).by_ = match(Byte);
				 ((ElementaryTypeNameContext)_localctx).elementaryTypeNameRet =  new ByteUpperCaseType((((ElementaryTypeNameContext)_localctx).by_!=null?((ElementaryTypeNameContext)_localctx).by_.getText():null)); _localctx.elementaryTypeNameRet.setLine((((ElementaryTypeNameContext)_localctx).by_!=null?((ElementaryTypeNameContext)_localctx).by_.getLine():0)); 
				}
				break;
			case Fixed:
				enterOuterAlt(_localctx, 9);
				{
				setState(1061);
				((ElementaryTypeNameContext)_localctx).f = match(Fixed);
				 ((ElementaryTypeNameContext)_localctx).elementaryTypeNameRet =  new FixedType((((ElementaryTypeNameContext)_localctx).f!=null?((ElementaryTypeNameContext)_localctx).f.getText():null)); _localctx.elementaryTypeNameRet.setLine((((ElementaryTypeNameContext)_localctx).f!=null?((ElementaryTypeNameContext)_localctx).f.getLine():0)); 
				}
				break;
			case Ufixed:
				enterOuterAlt(_localctx, 10);
				{
				setState(1063);
				((ElementaryTypeNameContext)_localctx).uf = match(Ufixed);
				 ((ElementaryTypeNameContext)_localctx).elementaryTypeNameRet =  new UfixedType((((ElementaryTypeNameContext)_localctx).uf!=null?((ElementaryTypeNameContext)_localctx).uf.getText():null)); _localctx.elementaryTypeNameRet.setLine((((ElementaryTypeNameContext)_localctx).uf!=null?((ElementaryTypeNameContext)_localctx).uf.getLine():0)); 
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
	public static class ExpressionContext extends ParserRuleContext {
		public Expression expressionRet;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public ExpressionContext e4;
		public ExpressionContext e7;
		public ExpressionContext e8;
		public ExpressionContext e10;
		public ExpressionContext e17;
		public ExpressionContext e19;
		public ExpressionContext e21;
		public ExpressionContext e23;
		public ExpressionContext e25;
		public ExpressionContext e27;
		public ExpressionContext e29;
		public ExpressionContext e31;
		public ExpressionContext e33;
		public ExpressionContext e35;
		public ExpressionContext e37;
		public ExpressionContext e39;
		public ExpressionContext e42;
		public Token n;
		public TypeNameContext tn;
		public Token r;
		public ExpressionContext e9;
		public StringLiteralContext s;
		public Token para;
		public ExpressionContext e11;
		public Token un;
		public ExpressionContext e12;
		public Token un_;
		public ExpressionContext e13;
		public Token d;
		public ExpressionContext e14;
		public Token excla;
		public ExpressionContext e15;
		public Token til;
		public ExpressionContext e16;
		public PrimaryExpressionContext primary;
		public Token op;
		public ExpressionContext e18;
		public ExpressionContext e20;
		public ExpressionContext e22;
		public ExpressionContext e24;
		public ExpressionContext e26;
		public ExpressionContext e28;
		public ExpressionContext e30;
		public ExpressionContext e32;
		public ExpressionContext e34;
		public ExpressionContext e36;
		public ExpressionContext e38;
		public ExpressionContext e40;
		public ExpressionContext e41;
		public ExpressionContext e43;
		public ExpressionContext e3;
		public ExpressionContext e5;
		public ExpressionContext e6;
		public IdentifierContext id1;
		public NameValueListContext nvl;
		public FunctionCallArgumentsContext fa;
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
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(1068);
				((ExpressionContext)_localctx).n = match(T__68);
				setState(1069);
				((ExpressionContext)_localctx).tn = typeName(0);

				        ((ExpressionContext)_localctx).expressionRet =  new ObjectCreation(((ExpressionContext)_localctx).tn.typeNameRet);
				        _localctx.expressionRet.setLine((((ExpressionContext)_localctx).n!=null?((ExpressionContext)_localctx).n.getLine():0));
				    
				}
				break;
			case 2:
				{
				setState(1072);
				((ExpressionContext)_localctx).r = match(T__70);
				setState(1073);
				match(T__22);
				setState(1074);
				((ExpressionContext)_localctx).e9 = expression(0);
				setState(1075);
				match(T__15);
				setState(1076);
				((ExpressionContext)_localctx).s = stringLiteral();
				setState(1077);
				match(T__23);
				 
				        ((ExpressionContext)_localctx).expressionRet =  new RequireExpression(((ExpressionContext)_localctx).e9.expressionRet, ((ExpressionContext)_localctx).s.stringLiteralRet);
				        _localctx.expressionRet.setLine((((ExpressionContext)_localctx).r!=null?((ExpressionContext)_localctx).r.getLine():0));
				    
				}
				break;
			case 3:
				{
				setState(1080);
				((ExpressionContext)_localctx).para = match(T__22);
				setState(1081);
				((ExpressionContext)_localctx).e11 = expression(0);
				setState(1082);
				match(T__23);
				 
				        ((ExpressionContext)_localctx).expressionRet =  new ParenthesizedExpression(((ExpressionContext)_localctx).e11.expressionRet);
				        _localctx.expressionRet.setLine((((ExpressionContext)_localctx).para!=null?((ExpressionContext)_localctx).para.getLine():0));
				    
				}
				break;
			case 4:
				{
				setState(1085);
				((ExpressionContext)_localctx).un = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__66 || _la==T__67) ) {
					((ExpressionContext)_localctx).un = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1086);
				((ExpressionContext)_localctx).e12 = expression(19);

				        String opText = (((ExpressionContext)_localctx).un!=null?((ExpressionContext)_localctx).un.getText():null);
				        UnaryOperator op = (opText.equals("++")) ? UnaryOperator.PRE_INCREMENT : UnaryOperator.PRE_DECREMENT;
				        ((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(((ExpressionContext)_localctx).e12.expressionRet, op);
				        _localctx.expressionRet.setLine((((ExpressionContext)_localctx).un!=null?((ExpressionContext)_localctx).un.getLine():0));
				    
				}
				break;
			case 5:
				{
				setState(1089);
				((ExpressionContext)_localctx).un_ = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
					((ExpressionContext)_localctx).un_ = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1090);
				((ExpressionContext)_localctx).e13 = expression(18);

				        ((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(((ExpressionContext)_localctx).e13.expressionRet, UnaryOperator.fromString((((ExpressionContext)_localctx).un_!=null?((ExpressionContext)_localctx).un_.getText():null)));
				        _localctx.expressionRet.setLine((((ExpressionContext)_localctx).un_!=null?((ExpressionContext)_localctx).un_.getLine():0));
				    
				}
				break;
			case 6:
				{
				setState(1093);
				((ExpressionContext)_localctx).d = match(T__71);
				setState(1094);
				((ExpressionContext)_localctx).e14 = expression(17);

				        ((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(((ExpressionContext)_localctx).e14.expressionRet, UnaryOperator.fromString((((ExpressionContext)_localctx).d!=null?((ExpressionContext)_localctx).d.getText():null)));
				        _localctx.expressionRet.setLine((((ExpressionContext)_localctx).d!=null?((ExpressionContext)_localctx).d.getLine():0));
				    
				}
				break;
			case 7:
				{
				setState(1097);
				((ExpressionContext)_localctx).excla = match(T__72);
				setState(1098);
				((ExpressionContext)_localctx).e15 = expression(16);
				 
				        ((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(((ExpressionContext)_localctx).e15.expressionRet, UnaryOperator.fromString((((ExpressionContext)_localctx).excla!=null?((ExpressionContext)_localctx).excla.getText():null)));
				        _localctx.expressionRet.setLine((((ExpressionContext)_localctx).excla!=null?((ExpressionContext)_localctx).excla.getLine():0));
				    
				}
				break;
			case 8:
				{
				setState(1101);
				((ExpressionContext)_localctx).til = match(T__5);
				setState(1102);
				((ExpressionContext)_localctx).e16 = expression(15);
				 
				        ((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(((ExpressionContext)_localctx).e16.expressionRet, UnaryOperator.fromString((((ExpressionContext)_localctx).til!=null?((ExpressionContext)_localctx).til.getText():null)));
				        _localctx.expressionRet.setLine((((ExpressionContext)_localctx).til!=null?((ExpressionContext)_localctx).til.getLine():0));
				    
				}
				break;
			case 9:
				{
				setState(1105);
				((ExpressionContext)_localctx).primary = primaryExpression();
				 
				        ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).primary.primaryExpressionRet;
				        _localctx.expressionRet.setLine(((ExpressionContext)_localctx).primary.primaryExpressionRet.getLine());
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1219);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e17 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1110);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1111);
						((ExpressionContext)_localctx).op = match(T__73);
						setState(1112);
						((ExpressionContext)_localctx).e18 = expression(14);
						 
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e17.expressionRet, ((ExpressionContext)_localctx).e18.expressionRet, BinaryOperator.fromString((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)));
						                  _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e17.expressionRet.getLine());
						              
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e19 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1115);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1116);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 12884901896L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1117);
						((ExpressionContext)_localctx).e20 = expression(14);

						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e19.expressionRet, ((ExpressionContext)_localctx).e20.expressionRet, BinaryOperator.fromString((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)));
						                  _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e19.expressionRet.getLine());
						              
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e21 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1120);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1121);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1122);
						((ExpressionContext)_localctx).e22 = expression(13);
						 
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e21.expressionRet, ((ExpressionContext)_localctx).e22.expressionRet, BinaryOperator.fromString((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)));
						                  _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e21.expressionRet.getLine());
						              
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e23 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1125);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1126);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__74 || _la==T__75) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1127);
						((ExpressionContext)_localctx).e24 = expression(12);
						 
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e23.expressionRet, ((ExpressionContext)_localctx).e24.expressionRet, BinaryOperator.fromString((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)));
						                  _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e23.expressionRet.getLine());
						              
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e25 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1130);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1131);
						((ExpressionContext)_localctx).op = match(T__28);
						setState(1132);
						((ExpressionContext)_localctx).e26 = expression(11);
						 
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e25.expressionRet, ((ExpressionContext)_localctx).e26.expressionRet, BinaryOperator.fromString((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)));
						                  _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e25.expressionRet.getLine());
						              
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e27 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1135);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1136);
						((ExpressionContext)_localctx).op = match(T__4);
						setState(1137);
						((ExpressionContext)_localctx).e28 = expression(10);
						 
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e27.expressionRet, ((ExpressionContext)_localctx).e28.expressionRet, BinaryOperator.fromString((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)));
						                  _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e27.expressionRet.getLine());
						              
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e29 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1140);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1141);
						((ExpressionContext)_localctx).op = match(T__27);
						setState(1142);
						((ExpressionContext)_localctx).e30 = expression(9);
						 
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e29.expressionRet, ((ExpressionContext)_localctx).e30.expressionRet, BinaryOperator.fromString((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)));
						                  _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e29.expressionRet.getLine());
						              
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e31 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1145);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1146);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1147);
						((ExpressionContext)_localctx).e32 = expression(8);
						 
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e31.expressionRet, ((ExpressionContext)_localctx).e32.expressionRet, BinaryOperator.fromString((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)));
						                  _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e31.expressionRet.getLine());
						              
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e33 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1150);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1151);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1152);
						((ExpressionContext)_localctx).e34 = expression(7);
						 
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e33.expressionRet, ((ExpressionContext)_localctx).e34.expressionRet, BinaryOperator.fromString((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)));
						                  _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e33.expressionRet.getLine());
						              
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e35 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1155);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1156);
						((ExpressionContext)_localctx).op = match(T__76);
						setState(1157);
						((ExpressionContext)_localctx).e36 = expression(6);
						 
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e35.expressionRet, ((ExpressionContext)_localctx).e36.expressionRet, BinaryOperator.fromString((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)));
						                  _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e35.expressionRet.getLine());
						              
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e37 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1160);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1161);
						((ExpressionContext)_localctx).op = match(T__3);
						setState(1162);
						((ExpressionContext)_localctx).e38 = expression(5);
						 
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e37.expressionRet, ((ExpressionContext)_localctx).e38.expressionRet, BinaryOperator.fromString((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)));
						                  _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e37.expressionRet.getLine());
						              
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e39 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1165);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1166);
						match(T__77);
						setState(1167);
						((ExpressionContext)_localctx).e40 = expression(0);
						setState(1168);
						match(T__69);
						setState(1169);
						((ExpressionContext)_localctx).e41 = expression(3);

						                  ((ExpressionContext)_localctx).expressionRet =  new TernaryOperatorExpression(((ExpressionContext)_localctx).e39.expressionRet, ((ExpressionContext)_localctx).e40.expressionRet, ((ExpressionContext)_localctx).e41.expressionRet);
						                  _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e39.expressionRet.getLine());
						              
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e42 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1172);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1173);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__10 || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 1023L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1174);
						((ExpressionContext)_localctx).e43 = expression(3);
						 
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e42.expressionRet, ((ExpressionContext)_localctx).e43.expressionRet, BinaryOperator.fromString((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)));
						                  _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e42.expressionRet.getLine());
						              
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1177);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1182);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__66:
							{
							setState(1178);
							match(T__66);
							 ((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(((ExpressionContext)_localctx).e1.expressionRet, UnaryOperator.POST_INCREMENT); 
							}
							break;
						case T__67:
							{
							setState(1180);
							match(T__67);
							 ((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(((ExpressionContext)_localctx).e1.expressionRet, UnaryOperator.POST_DECREMENT); 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						 _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e1.expressionRet.getLine()); 
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1185);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1186);
						match(T__41);
						setState(1187);
						((ExpressionContext)_localctx).e3 = expression(0);
						setState(1188);
						match(T__42);

						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e2.expressionRet, ((ExpressionContext)_localctx).e3.expressionRet, BinaryOperator.INDEXING);
						                  _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e2.expressionRet.getLine());
						              
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1191);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1192);
						match(T__41);
						setState(1194);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
							{
							setState(1193);
							((ExpressionContext)_localctx).e5 = expression(0);
							}
						}

						setState(1196);
						match(T__69);
						setState(1198);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
							{
							setState(1197);
							((ExpressionContext)_localctx).e6 = expression(0);
							}
						}

						setState(1200);
						match(T__42);

						                  Expression start, end;
						                  start = ((((ExpressionContext)_localctx).e5!=null?_input.getText(((ExpressionContext)_localctx).e5.start,((ExpressionContext)_localctx).e5.stop):null) == null) ? new NullExpression() : ((ExpressionContext)_localctx).e5.expressionRet;
						                  end = ((((ExpressionContext)_localctx).e6!=null?_input.getText(((ExpressionContext)_localctx).e6.start,((ExpressionContext)_localctx).e6.stop):null) == null) ? new NullExpression() : ((ExpressionContext)_localctx).e6.expressionRet;
						                  BinaryExpression sliceExpression = new BinaryExpression(start, end, BinaryOperator.SLICING_RANGE);
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e4.expressionRet, sliceExpression, BinaryOperator.SLICING);
						                  _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e4.expressionRet.getLine());
						              
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e7 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1202);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1203);
						match(T__44);
						setState(1204);
						((ExpressionContext)_localctx).id1 = identifier();

						                  ((ExpressionContext)_localctx).expressionRet =  new AccessExpression(((ExpressionContext)_localctx).e7.expressionRet, ((ExpressionContext)_localctx).id1.identifierRet);
						                  _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e7.expressionRet.getLine());
						              
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e8 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1207);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1208);
						match(T__14);
						setState(1209);
						((ExpressionContext)_localctx).nvl = nameValueList();
						setState(1210);
						match(T__16);
						 
						                  ((ExpressionContext)_localctx).expressionRet =  new StructInitializationExpression(((ExpressionContext)_localctx).e8.expressionRet, ((ExpressionContext)_localctx).nvl.nameValueListRet);
						                  _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e8.expressionRet.getLine());
						              
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e10 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1213);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1214);
						match(T__22);
						setState(1215);
						((ExpressionContext)_localctx).fa = functionCallArguments();
						setState(1216);
						match(T__23);

						                  ((ExpressionContext)_localctx).expressionRet =  new FunctionCallExpression(((ExpressionContext)_localctx).e10.expressionRet, ((ExpressionContext)_localctx).fa.functionCallArgumentsRet);
						                  _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e10.expressionRet.getLine());
						              
						}
						break;
					}
					} 
				}
				setState(1223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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
		public PrimaryExpression primaryExpressionRet;
		public Token b;
		public NumberLiteralContext n;
		public HexLiteralContext h;
		public StringLiteralContext s;
		public IdentifierContext i;
		public Token t;
		public Token p;
		public TupleExpressionContext tu;
		public TypeNameContext ty;
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
		enterRule(_localctx, 144, RULE_primaryExpression);
		try {
			setState(1248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1224);
				((PrimaryExpressionContext)_localctx).b = match(BooleanLiteral);
				 ((PrimaryExpressionContext)_localctx).primaryExpressionRet =  new OtherPrimaryExpression((((PrimaryExpressionContext)_localctx).b!=null?((PrimaryExpressionContext)_localctx).b.getText():null)); _localctx.primaryExpressionRet.setLine((((PrimaryExpressionContext)_localctx).b!=null?((PrimaryExpressionContext)_localctx).b.getLine():0)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1226);
				((PrimaryExpressionContext)_localctx).n = numberLiteral();
				 ((PrimaryExpressionContext)_localctx).primaryExpressionRet =  ((PrimaryExpressionContext)_localctx).n.numberLiteralRet; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1229);
				((PrimaryExpressionContext)_localctx).h = hexLiteral();
				 ((PrimaryExpressionContext)_localctx).primaryExpressionRet =  ((PrimaryExpressionContext)_localctx).h.hexLiteralRet; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1232);
				((PrimaryExpressionContext)_localctx).s = stringLiteral();
				 ((PrimaryExpressionContext)_localctx).primaryExpressionRet =  ((PrimaryExpressionContext)_localctx).s.stringLiteralRet; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1235);
				((PrimaryExpressionContext)_localctx).i = identifier();
				 ((PrimaryExpressionContext)_localctx).primaryExpressionRet =  ((PrimaryExpressionContext)_localctx).i.identifierRet; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1238);
				((PrimaryExpressionContext)_localctx).t = match(TypeKeyword);
				 ((PrimaryExpressionContext)_localctx).primaryExpressionRet =  new OtherPrimaryExpression((((PrimaryExpressionContext)_localctx).t!=null?((PrimaryExpressionContext)_localctx).t.getText():null)); _localctx.primaryExpressionRet.setLine((((PrimaryExpressionContext)_localctx).t!=null?((PrimaryExpressionContext)_localctx).t.getLine():0)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1240);
				((PrimaryExpressionContext)_localctx).p = match(PayableKeyword);
				 ((PrimaryExpressionContext)_localctx).primaryExpressionRet =  new OtherPrimaryExpression((((PrimaryExpressionContext)_localctx).p!=null?((PrimaryExpressionContext)_localctx).p.getText():null)); _localctx.primaryExpressionRet.setLine((((PrimaryExpressionContext)_localctx).p!=null?((PrimaryExpressionContext)_localctx).p.getLine():0)); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1242);
				((PrimaryExpressionContext)_localctx).tu = tupleExpression();
				 ((PrimaryExpressionContext)_localctx).primaryExpressionRet =  ((PrimaryExpressionContext)_localctx).tu.tupleExpressionRet; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1245);
				((PrimaryExpressionContext)_localctx).ty = typeName(0);
				 ((PrimaryExpressionContext)_localctx).primaryExpressionRet =  ((PrimaryExpressionContext)_localctx).ty.typeNameRet; 
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
		public ExpressionList expressionListRet;
		public ExpressionContext e1;
		public ExpressionContext e2;
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
		enterRule(_localctx, 146, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ExpressionListContext)_localctx).expressionListRet =  new ExpressionList(); 
			setState(1251);
			((ExpressionListContext)_localctx).e1 = expression(0);
			 _localctx.expressionListRet.addExpression(((ExpressionListContext)_localctx).e1.expressionRet); 
			setState(1259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(1253);
				match(T__15);
				setState(1254);
				((ExpressionListContext)_localctx).e2 = expression(0);
				 _localctx.expressionListRet.addExpression(((ExpressionListContext)_localctx).e2.expressionRet); 
				}
				}
				setState(1261);
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
		public NameValueList nameValueListRet;
		public NameValueContext n;
		public NameValueContext nv;
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
		enterRule(_localctx, 148, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 ((NameValueListContext)_localctx).nameValueListRet =  new NameValueList(); 
			setState(1263);
			((NameValueListContext)_localctx).n = nameValue();
			 _localctx.nameValueListRet.addNameValue(((NameValueListContext)_localctx).n.nameValueRet); 
			setState(1271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1265);
					match(T__15);
					setState(1266);
					((NameValueListContext)_localctx).nv = nameValue();
					 _localctx.nameValueListRet.addNameValue(((NameValueListContext)_localctx).nv.nameValueRet); 
					}
					} 
				}
				setState(1273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			setState(1275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(1274);
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
		public NameValue nameValueRet;
		public IdentifierContext i;
		public ExpressionContext e;
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
		enterRule(_localctx, 150, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			((NameValueContext)_localctx).i = identifier();
			setState(1278);
			match(T__69);
			setState(1279);
			((NameValueContext)_localctx).e = expression(0);
			 ((NameValueContext)_localctx).nameValueRet =  new NameValue(((NameValueContext)_localctx).i.identifierRet, ((NameValueContext)_localctx).e.expressionRet); 
			}
		}
		catch (RecognitionException re) {
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
		public FunctionCallArguments functionCallArgumentsRet;
		public NameValueListContext n;
		public ExpressionListContext e;
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
		enterRule(_localctx, 152, RULE_functionCallArguments);
		int _la;
		try {
			setState(1294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(1282);
				match(T__14);
				setState(1286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
					{
					setState(1283);
					((FunctionCallArgumentsContext)_localctx).n = nameValueList();
					 ((FunctionCallArgumentsContext)_localctx).functionCallArgumentsRet =  ((FunctionCallArgumentsContext)_localctx).n.nameValueListRet; 
					}
				}

				setState(1288);
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
				setState(1292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
					{
					setState(1289);
					((FunctionCallArgumentsContext)_localctx).e = expressionList();
					 ((FunctionCallArgumentsContext)_localctx).functionCallArgumentsRet =  ((FunctionCallArgumentsContext)_localctx).e.expressionListRet; 
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
		public FunctionCallExpression functionCallExpressionRet;
		public ExpressionContext e;
		public FunctionCallArgumentsContext f;
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
		enterRule(_localctx, 154, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			((FunctionCallContext)_localctx).e = expression(0);
			setState(1297);
			match(T__22);
			setState(1298);
			((FunctionCallContext)_localctx).f = functionCallArguments();
			setState(1299);
			match(T__23);
			 ((FunctionCallContext)_localctx).functionCallExpressionRet =  new FunctionCallExpression(((FunctionCallContext)_localctx).e.expressionRet, ((FunctionCallContext)_localctx).f.functionCallArgumentsRet); 
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 156, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			match(T__14);
			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 4820466225129987L) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 4055038804105L) != 0)) {
				{
				{
				setState(1303);
				assemblyItem();
				}
				}
				setState(1308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1309);
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
		enterRule(_localctx, 158, RULE_assemblyItem);
		try {
			setState(1328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1311);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1312);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1313);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1314);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1315);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1316);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1317);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1318);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1319);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1320);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1321);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1322);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1323);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1324);
				match(LeaveKeyword);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1325);
				numberLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1326);
				stringLiteral();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1327);
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
		enterRule(_localctx, 160, RULE_assemblyExpression);
		try {
			setState(1333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1330);
				assemblyCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1331);
				assemblyLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1332);
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
		enterRule(_localctx, 162, RULE_assemblyMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			identifier();
			setState(1336);
			match(T__44);
			setState(1337);
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
		enterRule(_localctx, 164, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1339);
				match(T__58);
				}
				break;
			case 2:
				{
				setState(1340);
				match(T__43);
				}
				break;
			case 3:
				{
				setState(1341);
				match(T__65);
				}
				break;
			case 4:
				{
				setState(1342);
				identifier();
				}
				break;
			}
			setState(1357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1345);
				match(T__22);
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 4820328769390593L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 31679843201L) != 0)) {
					{
					setState(1346);
					assemblyExpression();
					}
				}

				setState(1353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(1349);
					match(T__15);
					setState(1350);
					assemblyExpression();
					}
					}
					setState(1355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1356);
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
		enterRule(_localctx, 166, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			match(T__88);
			setState(1360);
			assemblyIdentifierOrList();
			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__89) {
				{
				setState(1361);
				match(T__89);
				setState(1362);
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
		enterRule(_localctx, 168, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			assemblyIdentifierOrList();
			setState(1366);
			match(T__89);
			setState(1367);
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
		enterRule(_localctx, 170, RULE_assemblyIdentifierOrList);
		try {
			setState(1376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1369);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1370);
				assemblyMember();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1371);
				assemblyIdentifierList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1372);
				match(T__22);
				setState(1373);
				assemblyIdentifierList();
				setState(1374);
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
		enterRule(_localctx, 172, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			identifier();
			setState(1383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(1379);
				match(T__15);
				setState(1380);
				identifier();
				}
				}
				setState(1385);
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
		enterRule(_localctx, 174, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			assemblyExpression();
			setState(1387);
			match(T__90);
			setState(1388);
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
		enterRule(_localctx, 176, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			identifier();
			setState(1391);
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
		enterRule(_localctx, 178, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			match(T__91);
			setState(1394);
			assemblyExpression();
			setState(1398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__92 || _la==T__93) {
				{
				{
				setState(1395);
				assemblyCase();
				}
				}
				setState(1400);
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
		enterRule(_localctx, 180, RULE_assemblyCase);
		try {
			setState(1407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__92:
				enterOuterAlt(_localctx, 1);
				{
				setState(1401);
				match(T__92);
				setState(1402);
				assemblyLiteral();
				setState(1403);
				assemblyBlock();
				}
				break;
			case T__93:
				enterOuterAlt(_localctx, 2);
				{
				setState(1405);
				match(T__93);
				setState(1406);
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
		enterRule(_localctx, 182, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			match(T__37);
			setState(1410);
			identifier();
			setState(1411);
			match(T__22);
			setState(1413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) {
				{
				setState(1412);
				assemblyIdentifierList();
				}
			}

			setState(1415);
			match(T__23);
			setState(1417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__94) {
				{
				setState(1416);
				assemblyFunctionReturns();
				}
			}

			setState(1419);
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
		enterRule(_localctx, 184, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1421);
			match(T__94);
			setState(1422);
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
		enterRule(_localctx, 186, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			match(T__26);
			setState(1427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(1425);
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
				setState(1426);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1429);
			assemblyExpression();
			setState(1432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(1430);
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
				setState(1431);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1434);
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
		enterRule(_localctx, 188, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			match(T__50);
			setState(1437);
			assemblyExpression();
			setState(1438);
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
		enterRule(_localctx, 190, RULE_assemblyLiteral);
		try {
			setState(1445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteralFragment:
				enterOuterAlt(_localctx, 1);
				{
				setState(1440);
				stringLiteral();
				}
				break;
			case DecimalNumber:
				enterOuterAlt(_localctx, 2);
				{
				setState(1441);
				match(DecimalNumber);
				}
				break;
			case HexNumber:
				enterOuterAlt(_localctx, 3);
				{
				setState(1442);
				match(HexNumber);
				}
				break;
			case HexLiteralFragment:
				enterOuterAlt(_localctx, 4);
				{
				setState(1443);
				hexLiteral();
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(1444);
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
		public TupleExpression tupleExpressionRet;
		public Token lineHolder;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public ExpressionContext e3;
		public ExpressionContext e4;
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
		enterRule(_localctx, 192, RULE_tupleExpression);
		int _la;
		try {
			setState(1480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(1447);
				((TupleExpressionContext)_localctx).lineHolder = match(T__22);
				 ((TupleExpressionContext)_localctx).tupleExpressionRet =  new TupleExpression(); _localctx.tupleExpressionRet.setLine((((TupleExpressionContext)_localctx).lineHolder!=null?((TupleExpressionContext)_localctx).lineHolder.getLine():0)); 
				{
				setState(1450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
					{
					setState(1449);
					((TupleExpressionContext)_localctx).e1 = expression(0);
					}
				}


				        if ((((TupleExpressionContext)_localctx).e1!=null?_input.getText(((TupleExpressionContext)_localctx).e1.start,((TupleExpressionContext)_localctx).e1.stop):null) == null)
				            {
				                Expression e = new NullExpression();
				                e.setLine((((TupleExpressionContext)_localctx).lineHolder!=null?((TupleExpressionContext)_localctx).lineHolder.getLine():0));
				                _localctx.tupleExpressionRet.addExpression(e);
				            }
				        else _localctx.tupleExpressionRet.addExpression(((TupleExpressionContext)_localctx).e1.expressionRet);
				    
				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(1453);
					match(T__15);
					setState(1455);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
						{
						setState(1454);
						((TupleExpressionContext)_localctx).e2 = expression(0);
						}
					}


					        if ((((TupleExpressionContext)_localctx).e2!=null?_input.getText(((TupleExpressionContext)_localctx).e2.start,((TupleExpressionContext)_localctx).e2.stop):null) == null)
					            {
					                Expression e = new NullExpression();
					                e.setLine((((TupleExpressionContext)_localctx).lineHolder!=null?((TupleExpressionContext)_localctx).lineHolder.getLine():0));
					                _localctx.tupleExpressionRet.addExpression(e);
					            }
					        else _localctx.tupleExpressionRet.addExpression(((TupleExpressionContext)_localctx).e2.expressionRet);
					    
					}
					}
					setState(1462);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1463);
				match(T__23);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(1464);
				((TupleExpressionContext)_localctx).lineHolder = match(T__41);
				 ((TupleExpressionContext)_localctx).tupleExpressionRet =  new TupleExpression(); _localctx.tupleExpressionRet.setLine((((TupleExpressionContext)_localctx).lineHolder!=null?((TupleExpressionContext)_localctx).lineHolder.getLine():0)); 
				setState(1477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -72038554396917503L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1067502748246736903L) != 0)) {
					{
					setState(1466);
					((TupleExpressionContext)_localctx).e3 = expression(0);

					        if ((((TupleExpressionContext)_localctx).e3!=null?_input.getText(((TupleExpressionContext)_localctx).e3.start,((TupleExpressionContext)_localctx).e3.stop):null) == null)
					            {
					                Expression e = new NullExpression();
					                e.setLine((((TupleExpressionContext)_localctx).lineHolder!=null?((TupleExpressionContext)_localctx).lineHolder.getLine():0));
					                _localctx.tupleExpressionRet.addExpression(e);
					            }
					        else _localctx.tupleExpressionRet.addExpression(((TupleExpressionContext)_localctx).e3.expressionRet);
					    
					setState(1474);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(1468);
						match(T__15);
						setState(1469);
						((TupleExpressionContext)_localctx).e4 = expression(0);

						        if ((((TupleExpressionContext)_localctx).e4!=null?_input.getText(((TupleExpressionContext)_localctx).e4.start,((TupleExpressionContext)_localctx).e4.stop):null) == null)
						            {
						                Expression e = new NullExpression();
						                e.setLine((((TupleExpressionContext)_localctx).lineHolder!=null?((TupleExpressionContext)_localctx).lineHolder.getLine():0));
						                _localctx.tupleExpressionRet.addExpression(e);
						            }
						        else _localctx.tupleExpressionRet.addExpression(((TupleExpressionContext)_localctx).e4.expressionRet);
						    
						}
						}
						setState(1476);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1479);
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
		public NumberLiteral numberLiteralRet;
		public Token num;
		public Token unit;
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
		enterRule(_localctx, 194, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1482);
			((NumberLiteralContext)_localctx).num = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
				((NumberLiteralContext)_localctx).num = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1483);
				((NumberLiteralContext)_localctx).unit = match(NumberUnit);
				}
				break;
			}

			        ((NumberLiteralContext)_localctx).numberLiteralRet =  new NumberLiteral((((NumberLiteralContext)_localctx).num!=null?((NumberLiteralContext)_localctx).num.getText():null), (((NumberLiteralContext)_localctx).unit!=null?((NumberLiteralContext)_localctx).unit.getText():null));
			        _localctx.numberLiteralRet.setLine((((NumberLiteralContext)_localctx).num!=null?((NumberLiteralContext)_localctx).num.getLine():0));
			    
			}
		}
		catch (RecognitionException re) {
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
		public Identifier identifierRet;
		public Token x;
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
		enterRule(_localctx, 196, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			((IdentifierContext)_localctx).x = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4612829510553845760L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 14499971073L) != 0)) ) {
				((IdentifierContext)_localctx).x = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 ((IdentifierContext)_localctx).identifierRet =  new Identifier((((IdentifierContext)_localctx).x!=null?((IdentifierContext)_localctx).x.getText():null)); _localctx.identifierRet.setLine((((IdentifierContext)_localctx).x!=null?((IdentifierContext)_localctx).x.getLine():0)); 
			}
		}
		catch (RecognitionException re) {
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
		public HexLiteral hexLiteralRet;
		public Token h;
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
		enterRule(_localctx, 198, RULE_hexLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1492); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1491);
					((HexLiteralContext)_localctx).h = match(HexLiteralFragment);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1494); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

			        ((HexLiteralContext)_localctx).hexLiteralRet =  new HexLiteral((((HexLiteralContext)_localctx).h!=null?((HexLiteralContext)_localctx).h.getText():null));
			        _localctx.hexLiteralRet.setLine((((HexLiteralContext)_localctx).h!=null?((HexLiteralContext)_localctx).h.getLine():0));
			    
			}
		}
		catch (RecognitionException re) {
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
		public StringLiteral stringLiteralRet;
		public Token s;
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
			setState(1499); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1498);
					((StringLiteralContext)_localctx).s = match(StringLiteralFragment);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1501); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

			        ((StringLiteralContext)_localctx).stringLiteralRet =  new StringLiteral((((StringLiteralContext)_localctx).s!=null?((StringLiteralContext)_localctx).s.getText():null));
			        _localctx.stringLiteralRet.setLine((((StringLiteralContext)_localctx).s!=null?((StringLiteralContext)_localctx).s.getLine():0));
			    
			}
		}
		catch (RecognitionException re) {
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
		public OverrideSpecifier overrideSpecifierRet;
		public UserDefinedTypeNameContext u1;
		public UserDefinedTypeNameContext u2;
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
		enterRule(_localctx, 202, RULE_overrideSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((OverrideSpecifierContext)_localctx).overrideSpecifierRet =  new OverrideSpecifier(); 
			setState(1506);
			match(T__96);
			setState(1521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(1507);
				match(T__22);
				setState(1508);
				((OverrideSpecifierContext)_localctx).u1 = userDefinedTypeName();
				 _localctx.overrideSpecifierRet.addType(((OverrideSpecifierContext)_localctx).u1.userDefinedTypeNameRet); 
				setState(1516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(1510);
					match(T__15);
					setState(1511);
					((OverrideSpecifierContext)_localctx).u2 = userDefinedTypeName();
					 _localctx.overrideSpecifierRet.addType(((OverrideSpecifierContext)_localctx).u2.userDefinedTypeNameRet); 
					}
					}
					setState(1518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1519);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 39:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 71:
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
		"\u0004\u0001\u0086\u05f4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"c\u0002d\u0007d\u0002e\u0007e\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u00e9\b\u0000\n\u0000\f\u0000\u00ec\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00fa\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00fe\b\u0004\u0001"+
		"\u0004\u0005\u0004\u0101\b\u0004\n\u0004\f\u0004\u0104\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0003\u0006\u0109\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u010d\b\u0006\u0001\u0006\u0003\u0006\u0110\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0115\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u011d\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0125\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u0134\b\b\n\b\f\b\u0137\t\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u013f\b\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0003\t\u0145\b\t\u0001\n\u0001\n\u0001\u000b\u0003\u000b\u014a\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0156\b\u000b"+
		"\n\u000b\f\u000b\u0159\t\u000b\u0003\u000b\u015b\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0161\b\u000b\n\u000b\f\u000b"+
		"\u0164\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u016e\b\f\u0001\f\u0003\f\u0171\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u018a\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0193"+
		"\b\u000e\n\u000e\f\u000e\u0196\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u019e\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u01bf\b\u0012\u0001\u0012\u0003\u0012\u01c2\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u01d2\b\u0013\n\u0013\f\u0013\u01d5\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u01d9\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01e1\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u01f1\b\u0016\n\u0016\f\u0016\u01f4"+
		"\t\u0016\u0003\u0016\u01f6\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0200\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u0207\b\u0017\n\u0017\f\u0017\u020a\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0210\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0219\b\u0018\u0001\u0018\u0003\u0018\u021c\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0225\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u022b\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0232\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u023a\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u024e\b\u001c\u0005\u001c\u0250\b\u001c\n\u001c\f\u001c\u0253\t\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0259\b\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0265\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u026c\b\u001f\n\u001f\f\u001f\u026f\t\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u027b\b \n "+
		"\f \u027e\t \u0003 \u0280\b \u0001 \u0001 \u0001!\u0001!\u0003!\u0286"+
		"\b!\u0001!\u0001!\u0003!\u028a\b!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0005\"\u0292\b\"\n\"\f\"\u0295\t\"\u0003\"\u0297\b\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0003#\u029d\b#\u0001#\u0003#\u02a0\b#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u02aa\b$\n$"+
		"\f$\u02ad\t$\u0003$\u02af\b$\u0001$\u0001$\u0001%\u0001%\u0003%\u02b5"+
		"\b%\u0001%\u0001%\u0001&\u0001&\u0003&\u02bb\b&\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u02d0\b\'\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u02d5\b\'\u0001\'\u0001\'\u0005\'\u02d9\b\'"+
		"\n\'\f\'\u02dc\t\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005"+
		"(\u02e5\b(\n(\f(\u02e8\t(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u02f2\b)\u0001*\u0001*\u0001*\u0001*\u0003*\u02f8\b*\u0001"+
		"*\u0001*\u0001*\u0003*\u02fd\b*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0005-\u0311\b-\n-\f-\u0314\t-\u0001-\u0001-\u0001-\u0001"+
		"-\u0003-\u031a\b-\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00010\u00010\u00050\u0327\b0\n0\f0\u032a\t0\u00010\u00010\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00031\u0353\b1\u00012\u0001"+
		"2\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00033\u0363\b3\u00014\u00014\u00014\u00034\u0368\b4\u0001"+
		"4\u00014\u00044\u036c\b4\u000b4\f4\u036d\u00015\u00015\u00035\u0372\b"+
		"5\u00015\u00035\u0375\b5\u00015\u00015\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u0386"+
		"\b7\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00039\u0392\b9\u00019\u00019\u00019\u00019\u00039\u0398\b9\u00019\u0001"+
		"9\u00019\u00039\u039d\b9\u00019\u00019\u00019\u00019\u0001:\u0001:\u0003"+
		":\u03a5\b:\u0001:\u0001:\u0001:\u0001:\u0003:\u03ab\b:\u0001:\u0001:\u0001"+
		";\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0003?\u03c7\b?\u0001?\u0001?\u0001@\u0001@\u0001"+
		"@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0003C\u03e6\bC\u0001C\u0001C\u0001C\u0001"+
		"C\u0003C\u03ec\bC\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0003D\u03f4"+
		"\bD\u0001D\u0005D\u03f7\bD\nD\fD\u03fa\tD\u0001D\u0001D\u0001D\u0003D"+
		"\u03ff\bD\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E\u0406\bE\u0001E\u0005"+
		"E\u0409\bE\nE\fE\u040c\tE\u0001E\u0001E\u0001E\u0003E\u0411\bE\u0001E"+
		"\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0003F\u042a\bF\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u0455\bG\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003"+
		"G\u049f\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0003G\u04ab\bG\u0001G\u0001G\u0003G\u04af\bG\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0005G\u04c4\bG\nG\fG\u04c7"+
		"\tG\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0003H\u04e1\bH\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0005I\u04ea\bI\nI\fI\u04ed\tI\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0001J\u0005J\u04f6\bJ\nJ\fJ\u04f9\tJ\u0001J\u0003"+
		"J\u04fc\bJ\u0001K\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0001"+
		"L\u0003L\u0507\bL\u0001L\u0001L\u0001L\u0001L\u0003L\u050d\bL\u0003L\u050f"+
		"\bL\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001N\u0001N\u0005N\u0519"+
		"\bN\nN\fN\u051c\tN\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0003O\u0531\bO\u0001P\u0001P\u0001P\u0003P\u0536\bP\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0003R\u0540\bR\u0001R\u0001"+
		"R\u0003R\u0544\bR\u0001R\u0001R\u0005R\u0548\bR\nR\fR\u054b\tR\u0001R"+
		"\u0003R\u054e\bR\u0001S\u0001S\u0001S\u0001S\u0003S\u0554\bS\u0001T\u0001"+
		"T\u0001T\u0001T\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0003"+
		"U\u0561\bU\u0001V\u0001V\u0001V\u0005V\u0566\bV\nV\fV\u0569\tV\u0001W"+
		"\u0001W\u0001W\u0001W\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0005"+
		"Y\u0575\bY\nY\fY\u0578\tY\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0003"+
		"Z\u0580\bZ\u0001[\u0001[\u0001[\u0001[\u0003[\u0586\b[\u0001[\u0001[\u0003"+
		"[\u058a\b[\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0001]\u0001]\u0001]"+
		"\u0003]\u0594\b]\u0001]\u0001]\u0001]\u0003]\u0599\b]\u0001]\u0001]\u0001"+
		"^\u0001^\u0001^\u0001^\u0001_\u0001_\u0001_\u0001_\u0001_\u0003_\u05a6"+
		"\b_\u0001`\u0001`\u0001`\u0003`\u05ab\b`\u0001`\u0001`\u0001`\u0003`\u05b0"+
		"\b`\u0001`\u0005`\u05b3\b`\n`\f`\u05b6\t`\u0001`\u0001`\u0001`\u0001`"+
		"\u0001`\u0001`\u0001`\u0001`\u0001`\u0005`\u05c1\b`\n`\f`\u05c4\t`\u0003"+
		"`\u05c6\b`\u0001`\u0003`\u05c9\b`\u0001a\u0001a\u0003a\u05cd\ba\u0001"+
		"a\u0001a\u0001b\u0001b\u0001b\u0001c\u0004c\u05d5\bc\u000bc\fc\u05d6\u0001"+
		"c\u0001c\u0001d\u0004d\u05dc\bd\u000bd\fd\u05dd\u0001d\u0001d\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0005e\u05eb\be\ne"+
		"\fe\u05ee\te\u0001e\u0001e\u0003e\u05f2\be\u0001e\u0000\u0002N\u008ef"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u0000\u0010\u0001\u0000\u0005\u000b\u0001\u0000\u0013\u0015\u0003\u0000"+
		"opuuwx\u0003\u0000\u0003\u0003\u0005\n\u001c#\u0003\u0000ssuuwy\u0001"+
		"\u000002\u0004\u0000oovvzz||\u0001\u0000CD\u0001\u0000\u001e\u001f\u0002"+
		"\u0000\u0003\u0003 !\u0001\u0000KL\u0001\u0000\u0007\n\u0001\u0000\"#"+
		"\u0002\u0000\u000b\u000bOX\u0001\u0000hi\n\u0000\u000e\u000e\u0019\u0019"+
		",,22>>``rrvv}~\u0080\u0081\u0677\u0000\u00cc\u0001\u0000\u0000\u0000\u0002"+
		"\u00ef\u0001\u0000\u0000\u0000\u0004\u00f4\u0001\u0000\u0000\u0000\u0006"+
		"\u00f9\u0001\u0000\u0000\u0000\b\u00fb\u0001\u0000\u0000\u0000\n\u0105"+
		"\u0001\u0000\u0000\u0000\f\u010f\u0001\u0000\u0000\u0000\u000e\u0111\u0001"+
		"\u0000\u0000\u0000\u0010\u0118\u0001\u0000\u0000\u0000\u0012\u0144\u0001"+
		"\u0000\u0000\u0000\u0014\u0146\u0001\u0000\u0000\u0000\u0016\u0149\u0001"+
		"\u0000\u0000\u0000\u0018\u0167\u0001\u0000\u0000\u0000\u001a\u0189\u0001"+
		"\u0000\u0000\u0000\u001c\u018b\u0001\u0000\u0000\u0000\u001e\u01a1\u0001"+
		"\u0000\u0000\u0000 \u01a9\u0001\u0000\u0000\u0000\"\u01af\u0001\u0000"+
		"\u0000\u0000$\u01b5\u0001\u0000\u0000\u0000&\u01d8\u0001\u0000\u0000\u0000"+
		"(\u01da\u0001\u0000\u0000\u0000*\u01e2\u0001\u0000\u0000\u0000,\u01e5"+
		"\u0001\u0000\u0000\u0000.\u01f9\u0001\u0000\u0000\u00000\u0211\u0001\u0000"+
		"\u0000\u00002\u021d\u0001\u0000\u0000\u00004\u0239\u0001\u0000\u0000\u0000"+
		"6\u023d\u0001\u0000\u0000\u00008\u0241\u0001\u0000\u0000\u0000:\u0254"+
		"\u0001\u0000\u0000\u0000<\u025c\u0001\u0000\u0000\u0000>\u025f\u0001\u0000"+
		"\u0000\u0000@\u0272\u0001\u0000\u0000\u0000B\u0283\u0001\u0000\u0000\u0000"+
		"D\u028d\u0001\u0000\u0000\u0000F\u029a\u0001\u0000\u0000\u0000H\u02a1"+
		"\u0001\u0000\u0000\u0000J\u02b2\u0001\u0000\u0000\u0000L\u02b8\u0001\u0000"+
		"\u0000\u0000N\u02cf\u0001\u0000\u0000\u0000P\u02dd\u0001\u0000\u0000\u0000"+
		"R\u02f1\u0001\u0000\u0000\u0000T\u02f3\u0001\u0000\u0000\u0000V\u0301"+
		"\u0001\u0000\u0000\u0000X\u0303\u0001\u0000\u0000\u0000Z\u0305\u0001\u0000"+
		"\u0000\u0000\\\u031d\u0001\u0000\u0000\u0000^\u031f\u0001\u0000\u0000"+
		"\u0000`\u0321\u0001\u0000\u0000\u0000b\u0352\u0001\u0000\u0000\u0000d"+
		"\u0354\u0001\u0000\u0000\u0000f\u0358\u0001\u0000\u0000\u0000h\u0364\u0001"+
		"\u0000\u0000\u0000j\u036f\u0001\u0000\u0000\u0000l\u0378\u0001\u0000\u0000"+
		"\u0000n\u0385\u0001\u0000\u0000\u0000p\u0387\u0001\u0000\u0000\u0000r"+
		"\u038a\u0001\u0000\u0000\u0000t\u03a2\u0001\u0000\u0000\u0000v\u03ae\u0001"+
		"\u0000\u0000\u0000x\u03b0\u0001\u0000\u0000\u0000z\u03b9\u0001\u0000\u0000"+
		"\u0000|\u03bd\u0001\u0000\u0000\u0000~\u03c1\u0001\u0000\u0000\u0000\u0080"+
		"\u03ca\u0001\u0000\u0000\u0000\u0082\u03ce\u0001\u0000\u0000\u0000\u0084"+
		"\u03d2\u0001\u0000\u0000\u0000\u0086\u03d7\u0001\u0000\u0000\u0000\u0088"+
		"\u03ef\u0001\u0000\u0000\u0000\u008a\u0400\u0001\u0000\u0000\u0000\u008c"+
		"\u0429\u0001\u0000\u0000\u0000\u008e\u0454\u0001\u0000\u0000\u0000\u0090"+
		"\u04e0\u0001\u0000\u0000\u0000\u0092\u04e2\u0001\u0000\u0000\u0000\u0094"+
		"\u04ee\u0001\u0000\u0000\u0000\u0096\u04fd\u0001\u0000\u0000\u0000\u0098"+
		"\u050e\u0001\u0000\u0000\u0000\u009a\u0510\u0001\u0000\u0000\u0000\u009c"+
		"\u0516\u0001\u0000\u0000\u0000\u009e\u0530\u0001\u0000\u0000\u0000\u00a0"+
		"\u0535\u0001\u0000\u0000\u0000\u00a2\u0537\u0001\u0000\u0000\u0000\u00a4"+
		"\u053f\u0001\u0000\u0000\u0000\u00a6\u054f\u0001\u0000\u0000\u0000\u00a8"+
		"\u0555\u0001\u0000\u0000\u0000\u00aa\u0560\u0001\u0000\u0000\u0000\u00ac"+
		"\u0562\u0001\u0000\u0000\u0000\u00ae\u056a\u0001\u0000\u0000\u0000\u00b0"+
		"\u056e\u0001\u0000\u0000\u0000\u00b2\u0571\u0001\u0000\u0000\u0000\u00b4"+
		"\u057f\u0001\u0000\u0000\u0000\u00b6\u0581\u0001\u0000\u0000\u0000\u00b8"+
		"\u058d\u0001\u0000\u0000\u0000\u00ba\u0590\u0001\u0000\u0000\u0000\u00bc"+
		"\u059c\u0001\u0000\u0000\u0000\u00be\u05a5\u0001\u0000\u0000\u0000\u00c0"+
		"\u05c8\u0001\u0000\u0000\u0000\u00c2\u05ca\u0001\u0000\u0000\u0000\u00c4"+
		"\u05d0\u0001\u0000\u0000\u0000\u00c6\u05d4\u0001\u0000\u0000\u0000\u00c8"+
		"\u05db\u0001\u0000\u0000\u0000\u00ca\u05e1\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ea\u0006\u0000\uffff\uffff\u0000\u00cd\u00e9\u0003\u0002\u0001\u0000"+
		"\u00ce\u00cf\u0003\u0010\b\u0000\u00cf\u00d0\u0006\u0000\uffff\uffff\u0000"+
		"\u00d0\u00e9\u0001\u0000\u0000\u0000\u00d1\u00d2\u0003\u0016\u000b\u0000"+
		"\u00d2\u00d3\u0006\u0000\uffff\uffff\u0000\u00d3\u00e9\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0003>\u001f\u0000\u00d5\u00d6\u0006\u0000\uffff\uffff"+
		"\u0000\u00d6\u00e9\u0001\u0000\u0000\u0000\u00d7\u00e9\u0003:\u001d\u0000"+
		"\u00d8\u00d9\u0003,\u0016\u0000\u00d9\u00da\u0006\u0000\uffff\uffff\u0000"+
		"\u00da\u00e9\u0001\u0000\u0000\u0000\u00db\u00dc\u00032\u0019\u0000\u00dc"+
		"\u00dd\u0006\u0000\uffff\uffff\u0000\u00dd\u00e9\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0003\u001e\u000f\u0000\u00df\u00e0\u0006\u0000\uffff\uffff"+
		"\u0000\u00e0\u00e9\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003 \u0010\u0000"+
		"\u00e2\u00e3\u0006\u0000\uffff\uffff\u0000\u00e3\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e9\u0003\"\u0011\u0000\u00e5\u00e6\u0003$\u0012\u0000"+
		"\u00e6\u00e7\u0006\u0000\uffff\uffff\u0000\u00e7\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e8\u00cd\u0001\u0000\u0000\u0000\u00e8\u00ce\u0001\u0000\u0000"+
		"\u0000\u00e8\u00d1\u0001\u0000\u0000\u0000\u00e8\u00d4\u0001\u0000\u0000"+
		"\u0000\u00e8\u00d7\u0001\u0000\u0000\u0000\u00e8\u00d8\u0001\u0000\u0000"+
		"\u0000\u00e8\u00db\u0001\u0000\u0000\u0000\u00e8\u00de\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e1\u0001\u0000\u0000\u0000\u00e8\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e5\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0005\u0000\u0000\u0001\u00ee\u0001\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0005\u0001\u0000\u0000\u00f0\u00f1\u0003\u0004\u0002"+
		"\u0000\u00f1\u00f2\u0003\u0006\u0003\u0000\u00f2\u00f3\u0005\u0002\u0000"+
		"\u0000\u00f3\u0003\u0001\u0000\u0000\u0000\u00f4\u00f5\u0003\u00c4b\u0000"+
		"\u00f5\u0005\u0001\u0000\u0000\u0000\u00f6\u00fa\u0005\u0003\u0000\u0000"+
		"\u00f7\u00fa\u0003\b\u0004\u0000\u00f8\u00fa\u0003\u008eG\u0000\u00f9"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fa\u0007\u0001\u0000\u0000\u0000\u00fb"+
		"\u0102\u0003\f\u0006\u0000\u00fc\u00fe\u0005\u0004\u0000\u0000\u00fd\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0001\u0000\u0000\u0000\u00ff\u0101\u0003\f\u0006\u0000\u0100\u00fd\u0001"+
		"\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\t\u0001\u0000"+
		"\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u0106\u0007\u0000"+
		"\u0000\u0000\u0106\u000b\u0001\u0000\u0000\u0000\u0107\u0109\u0003\n\u0005"+
		"\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u0110\u0005\u0083\u0000"+
		"\u0000\u010b\u010d\u0003\n\u0005\u0000\u010c\u010b\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000"+
		"\u010e\u0110\u0005h\u0000\u0000\u010f\u0108\u0001\u0000\u0000\u0000\u010f"+
		"\u010c\u0001\u0000\u0000\u0000\u0110\r\u0001\u0000\u0000\u0000\u0111\u0114"+
		"\u0003\u00c4b\u0000\u0112\u0113\u0005\f\u0000\u0000\u0113\u0115\u0003"+
		"\u00c4b\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0006\u0007"+
		"\uffff\uffff\u0000\u0117\u000f\u0001\u0000\u0000\u0000\u0118\u013e\u0005"+
		"\r\u0000\u0000\u0119\u011c\u0003\u0014\n\u0000\u011a\u011b\u0005\f\u0000"+
		"\u0000\u011b\u011d\u0003\u00c4b\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0005\u0002\u0000\u0000\u011f\u0120\u0006\b\uffff\uffff\u0000"+
		"\u0120\u013f\u0001\u0000\u0000\u0000\u0121\u0124\u0003\u0012\t\u0000\u0122"+
		"\u0123\u0005\f\u0000\u0000\u0123\u0125\u0003\u00c4b\u0000\u0124\u0122"+
		"\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0005\u000e\u0000\u0000\u0127\u0128"+
		"\u0003\u0014\n\u0000\u0128\u0129\u0005\u0002\u0000\u0000\u0129\u012a\u0006"+
		"\b\uffff\uffff\u0000\u012a\u013f\u0001\u0000\u0000\u0000\u012b\u012c\u0006"+
		"\b\uffff\uffff\u0000\u012c\u012d\u0005\u000f\u0000\u0000\u012d\u012e\u0003"+
		"\u000e\u0007\u0000\u012e\u0135\u0006\b\uffff\uffff\u0000\u012f\u0130\u0005"+
		"\u0010\u0000\u0000\u0130\u0131\u0003\u000e\u0007\u0000\u0131\u0132\u0006"+
		"\b\uffff\uffff\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u012f\u0001"+
		"\u0000\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0138\u0001"+
		"\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u0139\u0005"+
		"\u0011\u0000\u0000\u0139\u013a\u0005\u000e\u0000\u0000\u013a\u013b\u0003"+
		"\u0014\n\u0000\u013b\u013c\u0005\u0002\u0000\u0000\u013c\u013d\u0006\b"+
		"\uffff\uffff\u0000\u013d\u013f\u0001\u0000\u0000\u0000\u013e\u0119\u0001"+
		"\u0000\u0000\u0000\u013e\u0121\u0001\u0000\u0000\u0000\u013e\u012b\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0141\u0006"+
		"\b\uffff\uffff\u0000\u0141\u0011\u0001\u0000\u0000\u0000\u0142\u0145\u0005"+
		"\u0003\u0000\u0000\u0143\u0145\u0003\u00c4b\u0000\u0144\u0142\u0001\u0000"+
		"\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u0013\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0005\u0082\u0000\u0000\u0147\u0015\u0001\u0000"+
		"\u0000\u0000\u0148\u014a\u0005\u0012\u0000\u0000\u0149\u0148\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0007\u0001\u0000\u0000\u014c\u014d\u0003\u00c4"+
		"b\u0000\u014d\u015a\u0006\u000b\uffff\uffff\u0000\u014e\u014f\u0005\u0016"+
		"\u0000\u0000\u014f\u0150\u0003\u0018\f\u0000\u0150\u0157\u0006\u000b\uffff"+
		"\uffff\u0000\u0151\u0152\u0005\u0010\u0000\u0000\u0152\u0153\u0003\u0018"+
		"\f\u0000\u0153\u0154\u0006\u000b\uffff\uffff\u0000\u0154\u0156\u0001\u0000"+
		"\u0000\u0000\u0155\u0151\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000"+
		"\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000"+
		"\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000"+
		"\u0000\u0000\u015a\u014e\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u0162\u0005\u000f"+
		"\u0000\u0000\u015d\u015e\u0003\u001a\r\u0000\u015e\u015f\u0006\u000b\uffff"+
		"\uffff\u0000\u015f\u0161\u0001\u0000\u0000\u0000\u0160\u015d\u0001\u0000"+
		"\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u0001\u0000"+
		"\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u0011"+
		"\u0000\u0000\u0166\u0017\u0001\u0000\u0000\u0000\u0167\u0168\u0003P(\u0000"+
		"\u0168\u0170\u0006\f\uffff\uffff\u0000\u0169\u016d\u0005\u0017\u0000\u0000"+
		"\u016a\u016b\u0003\u0092I\u0000\u016b\u016c\u0006\f\uffff\uffff\u0000"+
		"\u016c\u016e\u0001\u0000\u0000\u0000\u016d\u016a\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000"+
		"\u016f\u0171\u0005\u0018\u0000\u0000\u0170\u0169\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0019\u0001\u0000\u0000\u0000"+
		"\u0172\u0173\u0003\u001c\u000e\u0000\u0173\u0174\u0006\r\uffff\uffff\u0000"+
		"\u0174\u018a\u0001\u0000\u0000\u0000\u0175\u0176\u0003$\u0012\u0000\u0176"+
		"\u0177\u0006\r\uffff\uffff\u0000\u0177\u018a\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u0003,\u0016\u0000\u0179\u017a\u0006\r\uffff\uffff\u0000\u017a"+
		"\u018a\u0001\u0000\u0000\u0000\u017b\u017c\u0003.\u0017\u0000\u017c\u017d"+
		"\u0006\r\uffff\uffff\u0000\u017d\u018a\u0001\u0000\u0000\u0000\u017e\u017f"+
		"\u00032\u0019\u0000\u017f\u0180\u0006\r\uffff\uffff\u0000\u0180\u018a"+
		"\u0001\u0000\u0000\u0000\u0181\u018a\u0003:\u001d\u0000\u0182\u0183\u0003"+
		">\u001f\u0000\u0183\u0184\u0006\r\uffff\uffff\u0000\u0184\u018a\u0001"+
		"\u0000\u0000\u0000\u0185\u0186\u0003 \u0010\u0000\u0186\u0187\u0006\r"+
		"\uffff\uffff\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u018a\u0003"+
		"\"\u0011\u0000\u0189\u0172\u0001\u0000\u0000\u0000\u0189\u0175\u0001\u0000"+
		"\u0000\u0000\u0189\u0178\u0001\u0000\u0000\u0000\u0189\u017b\u0001\u0000"+
		"\u0000\u0000\u0189\u017e\u0001\u0000\u0000\u0000\u0189\u0181\u0001\u0000"+
		"\u0000\u0000\u0189\u0182\u0001\u0000\u0000\u0000\u0189\u0185\u0001\u0000"+
		"\u0000\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u018a\u001b\u0001\u0000"+
		"\u0000\u0000\u018b\u018c\u0003N\'\u0000\u018c\u0194\u0006\u000e\uffff"+
		"\uffff\u0000\u018d\u018e\u0007\u0002\u0000\u0000\u018e\u0193\u0006\u000e"+
		"\uffff\uffff\u0000\u018f\u0190\u0003\u00cae\u0000\u0190\u0191\u0006\u000e"+
		"\uffff\uffff\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u018d\u0001"+
		"\u0000\u0000\u0000\u0192\u018f\u0001\u0000\u0000\u0000\u0193\u0196\u0001"+
		"\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001"+
		"\u0000\u0000\u0000\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u0194\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0003\u00c4b\u0000\u0198\u019d\u0006\u000e"+
		"\uffff\uffff\u0000\u0199\u019a\u0005\u000b\u0000\u0000\u019a\u019b\u0003"+
		"\u008eG\u0000\u019b\u019c\u0006\u000e\uffff\uffff\u0000\u019c\u019e\u0001"+
		"\u0000\u0000\u0000\u019d\u0199\u0001\u0000\u0000\u0000\u019d\u019e\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0005"+
		"\u0002\u0000\u0000\u01a0\u001d\u0001\u0000\u0000\u0000\u01a1\u01a2\u0003"+
		"N\'\u0000\u01a2\u01a3\u0005o\u0000\u0000\u01a3\u01a4\u0003\u00c4b\u0000"+
		"\u01a4\u01a5\u0005\u000b\u0000\u0000\u01a5\u01a6\u0003\u008eG\u0000\u01a6"+
		"\u01a7\u0005\u0002\u0000\u0000\u01a7\u01a8\u0006\u000f\uffff\uffff\u0000"+
		"\u01a8\u001f\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005\u0019\u0000\u0000"+
		"\u01aa\u01ab\u0003\u00c4b\u0000\u01ab\u01ac\u0003@ \u0000\u01ac\u01ad"+
		"\u0005\u0002\u0000\u0000\u01ad\u01ae\u0006\u0010\uffff\uffff\u0000\u01ae"+
		"!\u0001\u0000\u0000\u0000\u01af\u01b0\u0005{\u0000\u0000\u01b0\u01b1\u0003"+
		"\u00c4b\u0000\u01b1\u01b2\u0005\u0016\u0000\u0000\u01b2\u01b3\u0003\u008c"+
		"F\u0000\u01b3\u01b4\u0005\u0002\u0000\u0000\u01b4#\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b6\u0005\u001a\u0000\u0000\u01b6\u01b7\u0003&\u0013\u0000\u01b7"+
		"\u01b8\u0005\u001b\u0000\u0000\u01b8\u01be\u0006\u0012\uffff\uffff\u0000"+
		"\u01b9\u01ba\u0005\u0003\u0000\u0000\u01ba\u01bf\u0006\u0012\uffff\uffff"+
		"\u0000\u01bb\u01bc\u0003N\'\u0000\u01bc\u01bd\u0006\u0012\uffff\uffff"+
		"\u0000\u01bd\u01bf\u0001\u0000\u0000\u0000\u01be\u01b9\u0001\u0000\u0000"+
		"\u0000\u01be\u01bb\u0001\u0000\u0000\u0000\u01bf\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c2\u0005}\u0000\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c4\u0006\u0012\uffff\uffff\u0000\u01c4\u01c5\u0005\u0002\u0000"+
		"\u0000\u01c5%\u0001\u0000\u0000\u0000\u01c6\u01c7\u0003P(\u0000\u01c7"+
		"\u01c8\u0006\u0013\uffff\uffff\u0000\u01c8\u01d9\u0001\u0000\u0000\u0000"+
		"\u01c9\u01ca\u0005\u000f\u0000\u0000\u01ca\u01cb\u0006\u0013\uffff\uffff"+
		"\u0000\u01cb\u01cc\u0003(\u0014\u0000\u01cc\u01d3\u0006\u0013\uffff\uffff"+
		"\u0000\u01cd\u01ce\u0005\u0010\u0000\u0000\u01ce\u01cf\u0003(\u0014\u0000"+
		"\u01cf\u01d0\u0006\u0013\uffff\uffff\u0000\u01d0\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d1\u01cd\u0001\u0000\u0000\u0000\u01d2\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d7\u0005\u0011\u0000\u0000\u01d7\u01d9\u0001\u0000\u0000"+
		"\u0000\u01d8\u01c6\u0001\u0000\u0000\u0000\u01d8\u01c9\u0001\u0000\u0000"+
		"\u0000\u01d9\'\u0001\u0000\u0000\u0000\u01da\u01db\u0003P(\u0000\u01db"+
		"\u01e0\u0006\u0014\uffff\uffff\u0000\u01dc\u01dd\u0005\f\u0000\u0000\u01dd"+
		"\u01de\u0003*\u0015\u0000\u01de\u01df\u0006\u0014\uffff\uffff\u0000\u01df"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e0\u01dc\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e1)\u0001\u0000\u0000\u0000\u01e2\u01e3"+
		"\u0007\u0003\u0000\u0000\u01e3\u01e4\u0006\u0015\uffff\uffff\u0000\u01e4"+
		"+\u0001\u0000\u0000\u0000\u01e5\u01e6\u0005$\u0000\u0000\u01e6\u01e7\u0003"+
		"\u00c4b\u0000\u01e7\u01e8\u0006\u0016\uffff\uffff\u0000\u01e8\u01f5\u0005"+
		"\u000f\u0000\u0000\u01e9\u01ea\u0003L&\u0000\u01ea\u01eb\u0005\u0002\u0000"+
		"\u0000\u01eb\u01f2\u0006\u0016\uffff\uffff\u0000\u01ec\u01ed\u0003L&\u0000"+
		"\u01ed\u01ee\u0005\u0002\u0000\u0000\u01ee\u01ef\u0006\u0016\uffff\uffff"+
		"\u0000\u01ef\u01f1\u0001\u0000\u0000\u0000\u01f0\u01ec\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f4\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f5\u01e9\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f8\u0005\u0011\u0000\u0000\u01f8-\u0001\u0000\u0000\u0000"+
		"\u01f9\u01fa\u0005%\u0000\u0000\u01fa\u01fb\u0003\u00c4b\u0000\u01fb\u01ff"+
		"\u0006\u0017\uffff\uffff\u0000\u01fc\u01fd\u0003@ \u0000\u01fd\u01fe\u0006"+
		"\u0017\uffff\uffff\u0000\u01fe\u0200\u0001\u0000\u0000\u0000\u01ff\u01fc"+
		"\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0208"+
		"\u0001\u0000\u0000\u0000\u0201\u0202\u0005y\u0000\u0000\u0202\u0207\u0006"+
		"\u0017\uffff\uffff\u0000\u0203\u0204\u0003\u00cae\u0000\u0204\u0205\u0006"+
		"\u0017\uffff\uffff\u0000\u0205\u0207\u0001\u0000\u0000\u0000\u0206\u0201"+
		"\u0001\u0000\u0000\u0000\u0206\u0203\u0001\u0000\u0000\u0000\u0207\u020a"+
		"\u0001\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0001\u0000\u0000\u0000\u0209\u020f\u0001\u0000\u0000\u0000\u020a\u0208"+
		"\u0001\u0000\u0000\u0000\u020b\u0210\u0005\u0002\u0000\u0000\u020c\u020d"+
		"\u0003`0\u0000\u020d\u020e\u0006\u0017\uffff\uffff\u0000\u020e\u0210\u0001"+
		"\u0000\u0000\u0000\u020f\u020b\u0001\u0000\u0000\u0000\u020f\u020c\u0001"+
		"\u0000\u0000\u0000\u0210/\u0001\u0000\u0000\u0000\u0211\u0212\u0003\u00c4"+
		"b\u0000\u0212\u021b\u0006\u0018\uffff\uffff\u0000\u0213\u0214\u0006\u0018"+
		"\uffff\uffff\u0000\u0214\u0218\u0005\u0017\u0000\u0000\u0215\u0216\u0003"+
		"\u0092I\u0000\u0216\u0217\u0006\u0018\uffff\uffff\u0000\u0217\u0219\u0001"+
		"\u0000\u0000\u0000\u0218\u0215\u0001\u0000\u0000\u0000\u0218\u0219\u0001"+
		"\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021c\u0005"+
		"\u0018\u0000\u0000\u021b\u0213\u0001\u0000\u0000\u0000\u021b\u021c\u0001"+
		"\u0000\u0000\u0000\u021c1\u0001\u0000\u0000\u0000\u021d\u021e\u00034\u001a"+
		"\u0000\u021e\u021f\u0003@ \u0000\u021f\u0220\u00038\u001c\u0000\u0220"+
		"\u0224\u0006\u0019\uffff\uffff\u0000\u0221\u0222\u00036\u001b\u0000\u0222"+
		"\u0223\u0006\u0019\uffff\uffff\u0000\u0223\u0225\u0001\u0000\u0000\u0000"+
		"\u0224\u0221\u0001\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000"+
		"\u0225\u022a\u0001\u0000\u0000\u0000\u0226\u022b\u0005\u0002\u0000\u0000"+
		"\u0227\u0228\u0003`0\u0000\u0228\u0229\u0006\u0019\uffff\uffff\u0000\u0229"+
		"\u022b\u0001\u0000\u0000\u0000\u022a\u0226\u0001\u0000\u0000\u0000\u022a"+
		"\u0227\u0001\u0000\u0000\u0000\u022b3\u0001\u0000\u0000\u0000\u022c\u022d"+
		"\u0005&\u0000\u0000\u022d\u0231\u0006\u001a\uffff\uffff\u0000\u022e\u022f"+
		"\u0003\u00c4b\u0000\u022f\u0230\u0006\u001a\uffff\uffff\u0000\u0230\u0232"+
		"\u0001\u0000\u0000\u0000\u0231\u022e\u0001\u0000\u0000\u0000\u0231\u0232"+
		"\u0001\u0000\u0000\u0000\u0232\u023a\u0001\u0000\u0000\u0000\u0233\u0234"+
		"\u0005~\u0000\u0000\u0234\u023a\u0006\u001a\uffff\uffff\u0000\u0235\u0236"+
		"\u0005\u007f\u0000\u0000\u0236\u023a\u0006\u001a\uffff\uffff\u0000\u0237"+
		"\u0238\u0005\u0080\u0000\u0000\u0238\u023a\u0006\u001a\uffff\uffff\u0000"+
		"\u0239\u022c\u0001\u0000\u0000\u0000\u0239\u0233\u0001\u0000\u0000\u0000"+
		"\u0239\u0235\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000"+
		"\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023c\u0006\u001a\uffff\uffff"+
		"\u0000\u023c5\u0001\u0000\u0000\u0000\u023d\u023e\u0005\'\u0000\u0000"+
		"\u023e\u023f\u0003@ \u0000\u023f\u0240\u0006\u001b\uffff\uffff\u0000\u0240"+
		"7\u0001\u0000\u0000\u0000\u0241\u0251\u0006\u001c\uffff\uffff\u0000\u0242"+
		"\u0243\u0007\u0004\u0000\u0000\u0243\u0250\u0006\u001c\uffff\uffff\u0000"+
		"\u0244\u0245\u0003^/\u0000\u0245\u0246\u0006\u001c\uffff\uffff\u0000\u0246"+
		"\u024e\u0001\u0000\u0000\u0000\u0247\u0248\u00030\u0018\u0000\u0248\u0249"+
		"\u0006\u001c\uffff\uffff\u0000\u0249\u024e\u0001\u0000\u0000\u0000\u024a"+
		"\u024b\u0003\u00cae\u0000\u024b\u024c\u0006\u001c\uffff\uffff\u0000\u024c"+
		"\u024e\u0001\u0000\u0000\u0000\u024d\u0244\u0001\u0000\u0000\u0000\u024d"+
		"\u0247\u0001\u0000\u0000\u0000\u024d\u024a\u0001\u0000\u0000\u0000\u024e"+
		"\u0250\u0001\u0000\u0000\u0000\u024f\u0242\u0001\u0000\u0000\u0000\u024f"+
		"\u024d\u0001\u0000\u0000\u0000\u0250\u0253\u0001\u0000\u0000\u0000\u0251"+
		"\u024f\u0001\u0000\u0000\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252"+
		"9\u0001\u0000\u0000\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0254\u0255"+
		"\u0005(\u0000\u0000\u0255\u0256\u0003\u00c4b\u0000\u0256\u0258\u0003D"+
		"\"\u0000\u0257\u0259\u0005m\u0000\u0000\u0258\u0257\u0001\u0000\u0000"+
		"\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000"+
		"\u0000\u025a\u025b\u0005\u0002\u0000\u0000\u025b;\u0001\u0000\u0000\u0000"+
		"\u025c\u025d\u0003\u00c4b\u0000\u025d\u025e\u0006\u001e\uffff\uffff\u0000"+
		"\u025e=\u0001\u0000\u0000\u0000\u025f\u0260\u0005)\u0000\u0000\u0260\u0261"+
		"\u0003\u00c4b\u0000\u0261\u0262\u0006\u001f\uffff\uffff\u0000\u0262\u0264"+
		"\u0005\u000f\u0000\u0000\u0263\u0265\u0003<\u001e\u0000\u0264\u0263\u0001"+
		"\u0000\u0000\u0000\u0264\u0265\u0001\u0000\u0000\u0000\u0265\u0266\u0001"+
		"\u0000\u0000\u0000\u0266\u026d\u0006\u001f\uffff\uffff\u0000\u0267\u0268"+
		"\u0005\u0010\u0000\u0000\u0268\u0269\u0003<\u001e\u0000\u0269\u026a\u0006"+
		"\u001f\uffff\uffff\u0000\u026a\u026c\u0001\u0000\u0000\u0000\u026b\u0267"+
		"\u0001\u0000\u0000\u0000\u026c\u026f\u0001\u0000\u0000\u0000\u026d\u026b"+
		"\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u0270"+
		"\u0001\u0000\u0000\u0000\u026f\u026d\u0001\u0000\u0000\u0000\u0270\u0271"+
		"\u0005\u0011\u0000\u0000\u0271?\u0001\u0000\u0000\u0000\u0272\u0273\u0005"+
		"\u0017\u0000\u0000\u0273\u027f\u0006 \uffff\uffff\u0000\u0274\u0275\u0003"+
		"B!\u0000\u0275\u027c\u0006 \uffff\uffff\u0000\u0276\u0277\u0005\u0010"+
		"\u0000\u0000\u0277\u0278\u0003B!\u0000\u0278\u0279\u0006 \uffff\uffff"+
		"\u0000\u0279\u027b\u0001\u0000\u0000\u0000\u027a\u0276\u0001\u0000\u0000"+
		"\u0000\u027b\u027e\u0001\u0000\u0000\u0000\u027c\u027a\u0001\u0000\u0000"+
		"\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u0280\u0001\u0000\u0000"+
		"\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027f\u0274\u0001\u0000\u0000"+
		"\u0000\u027f\u0280\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000"+
		"\u0000\u0281\u0282\u0005\u0018\u0000\u0000\u0282A\u0001\u0000\u0000\u0000"+
		"\u0283\u0285\u0003N\'\u0000\u0284\u0286\u0003\\.\u0000\u0285\u0284\u0001"+
		"\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0287\u0001"+
		"\u0000\u0000\u0000\u0287\u0289\u0006!\uffff\uffff\u0000\u0288\u028a\u0003"+
		"\u00c4b\u0000\u0289\u0288\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000"+
		"\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028c\u0006!\uffff"+
		"\uffff\u0000\u028cC\u0001\u0000\u0000\u0000\u028d\u0296\u0005\u0017\u0000"+
		"\u0000\u028e\u0293\u0003F#\u0000\u028f\u0290\u0005\u0010\u0000\u0000\u0290"+
		"\u0292\u0003F#\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292\u0295\u0001"+
		"\u0000\u0000\u0000\u0293\u0291\u0001\u0000\u0000\u0000\u0293\u0294\u0001"+
		"\u0000\u0000\u0000\u0294\u0297\u0001\u0000\u0000\u0000\u0295\u0293\u0001"+
		"\u0000\u0000\u0000\u0296\u028e\u0001\u0000\u0000\u0000\u0296\u0297\u0001"+
		"\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298\u0299\u0005"+
		"\u0018\u0000\u0000\u0299E\u0001\u0000\u0000\u0000\u029a\u029c\u0003N\'"+
		"\u0000\u029b\u029d\u0005t\u0000\u0000\u029c\u029b\u0001\u0000\u0000\u0000"+
		"\u029c\u029d\u0001\u0000\u0000\u0000\u029d\u029f\u0001\u0000\u0000\u0000"+
		"\u029e\u02a0\u0003\u00c4b\u0000\u029f\u029e\u0001\u0000\u0000\u0000\u029f"+
		"\u02a0\u0001\u0000\u0000\u0000\u02a0G\u0001\u0000\u0000\u0000\u02a1\u02a2"+
		"\u0006$\uffff\uffff\u0000\u02a2\u02ae\u0005\u0017\u0000\u0000\u02a3\u02a4"+
		"\u0003J%\u0000\u02a4\u02ab\u0006$\uffff\uffff\u0000\u02a5\u02a6\u0005"+
		"\u0010\u0000\u0000\u02a6\u02a7\u0003J%\u0000\u02a7\u02a8\u0006$\uffff"+
		"\uffff\u0000\u02a8\u02aa\u0001\u0000\u0000\u0000\u02a9\u02a5\u0001\u0000"+
		"\u0000\u0000\u02aa\u02ad\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000"+
		"\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02af\u0001\u0000"+
		"\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ae\u02a3\u0001\u0000"+
		"\u0000\u0000\u02ae\u02af\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000"+
		"\u0000\u0000\u02b0\u02b1\u0005\u0018\u0000\u0000\u02b1I\u0001\u0000\u0000"+
		"\u0000\u02b2\u02b4\u0003N\'\u0000\u02b3\u02b5\u0003\\.\u0000\u02b4\u02b3"+
		"\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b6"+
		"\u0001\u0000\u0000\u0000\u02b6\u02b7\u0006%\uffff\uffff\u0000\u02b7K\u0001"+
		"\u0000\u0000\u0000\u02b8\u02ba\u0003N\'\u0000\u02b9\u02bb\u0003\\.\u0000"+
		"\u02ba\u02b9\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000"+
		"\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u02bd\u0003\u00c4b\u0000\u02bd"+
		"\u02be\u0006&\uffff\uffff\u0000\u02beM\u0001\u0000\u0000\u0000\u02bf\u02c0"+
		"\u0006\'\uffff\uffff\u0000\u02c0\u02c1\u0003\u008cF\u0000\u02c1\u02c2"+
		"\u0006\'\uffff\uffff\u0000\u02c2\u02d0\u0001\u0000\u0000\u0000\u02c3\u02c4"+
		"\u0003P(\u0000\u02c4\u02c5\u0006\'\uffff\uffff\u0000\u02c5\u02d0\u0001"+
		"\u0000\u0000\u0000\u02c6\u02c7\u0003T*\u0000\u02c7\u02c8\u0006\'\uffff"+
		"\uffff\u0000\u02c8\u02d0\u0001\u0000\u0000\u0000\u02c9\u02ca\u0003Z-\u0000"+
		"\u02ca\u02cb\u0006\'\uffff\uffff\u0000\u02cb\u02d0\u0001\u0000\u0000\u0000"+
		"\u02cc\u02cd\u0005,\u0000\u0000\u02cd\u02ce\u0005v\u0000\u0000\u02ce\u02d0"+
		"\u0006\'\uffff\uffff\u0000\u02cf\u02bf\u0001\u0000\u0000\u0000\u02cf\u02c3"+
		"\u0001\u0000\u0000\u0000\u02cf\u02c6\u0001\u0000\u0000\u0000\u02cf\u02c9"+
		"\u0001\u0000\u0000\u0000\u02cf\u02cc\u0001\u0000\u0000\u0000\u02d0\u02da"+
		"\u0001\u0000\u0000\u0000\u02d1\u02d2\n\u0003\u0000\u0000\u02d2\u02d4\u0005"+
		"*\u0000\u0000\u02d3\u02d5\u0003\u008eG\u0000\u02d4\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d7\u0005+\u0000\u0000\u02d7\u02d9\u0006\'\uffff\uffff"+
		"\u0000\u02d8\u02d1\u0001\u0000\u0000\u0000\u02d9\u02dc\u0001\u0000\u0000"+
		"\u0000\u02da\u02d8\u0001\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000"+
		"\u0000\u02dbO\u0001\u0000\u0000\u0000\u02dc\u02da\u0001\u0000\u0000\u0000"+
		"\u02dd\u02de\u0006(\uffff\uffff\u0000\u02de\u02df\u0003\u00c4b\u0000\u02df"+
		"\u02e6\u0006(\uffff\uffff\u0000\u02e0\u02e1\u0005-\u0000\u0000\u02e1\u02e2"+
		"\u0003\u00c4b\u0000\u02e2\u02e3\u0006(\uffff\uffff\u0000\u02e3\u02e5\u0001"+
		"\u0000\u0000\u0000\u02e4\u02e0\u0001\u0000\u0000\u0000\u02e5\u02e8\u0001"+
		"\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001"+
		"\u0000\u0000\u0000\u02e7\u02e9\u0001\u0000\u0000\u0000\u02e8\u02e6\u0001"+
		"\u0000\u0000\u0000\u02e9\u02ea\u0006(\uffff\uffff\u0000\u02eaQ\u0001\u0000"+
		"\u0000\u0000\u02eb\u02ec\u0003\u008cF\u0000\u02ec\u02ed\u0006)\uffff\uffff"+
		"\u0000\u02ed\u02f2\u0001\u0000\u0000\u0000\u02ee\u02ef\u0003P(\u0000\u02ef"+
		"\u02f0\u0006)\uffff\uffff\u0000\u02f0\u02f2\u0001\u0000\u0000\u0000\u02f1"+
		"\u02eb\u0001\u0000\u0000\u0000\u02f1\u02ee\u0001\u0000\u0000\u0000\u02f2"+
		"S\u0001\u0000\u0000\u0000\u02f3\u02f4\u0005.\u0000\u0000\u02f4\u02f5\u0005"+
		"\u0017\u0000\u0000\u02f5\u02f7\u0003R)\u0000\u02f6\u02f8\u0003V+\u0000"+
		"\u02f7\u02f6\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000"+
		"\u02f8\u02f9\u0001\u0000\u0000\u0000\u02f9\u02fa\u0005/\u0000\u0000\u02fa"+
		"\u02fc\u0003N\'\u0000\u02fb\u02fd\u0003X,\u0000\u02fc\u02fb\u0001\u0000"+
		"\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000"+
		"\u0000\u0000\u02fe\u02ff\u0005\u0018\u0000\u0000\u02ff\u0300\u0006*\uffff"+
		"\uffff\u0000\u0300U\u0001\u0000\u0000\u0000\u0301\u0302\u0003\u00c4b\u0000"+
		"\u0302W\u0001\u0000\u0000\u0000\u0303\u0304\u0003\u00c4b\u0000\u0304Y"+
		"\u0001\u0000\u0000\u0000\u0305\u0306\u0005&\u0000\u0000\u0306\u0307\u0006"+
		"-\uffff\uffff\u0000\u0307\u0308\u0003H$\u0000\u0308\u0312\u0006-\uffff"+
		"\uffff\u0000\u0309\u030a\u0005u\u0000\u0000\u030a\u0311\u0006-\uffff\uffff"+
		"\u0000\u030b\u030c\u0005s\u0000\u0000\u030c\u0311\u0006-\uffff\uffff\u0000"+
		"\u030d\u030e\u0003^/\u0000\u030e\u030f\u0006-\uffff\uffff\u0000\u030f"+
		"\u0311\u0001\u0000\u0000\u0000\u0310\u0309\u0001\u0000\u0000\u0000\u0310"+
		"\u030b\u0001\u0000\u0000\u0000\u0310\u030d\u0001\u0000\u0000\u0000\u0311"+
		"\u0314\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000\u0000\u0000\u0312"+
		"\u0313\u0001\u0000\u0000\u0000\u0313\u0319\u0001\u0000\u0000\u0000\u0314"+
		"\u0312\u0001\u0000\u0000\u0000\u0315\u0316\u0005\'\u0000\u0000\u0316\u0317"+
		"\u0003H$\u0000\u0317\u0318\u0006-\uffff\uffff\u0000\u0318\u031a\u0001"+
		"\u0000\u0000\u0000\u0319\u0315\u0001\u0000\u0000\u0000\u0319\u031a\u0001"+
		"\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000\u0000\u031b\u031c\u0006"+
		"-\uffff\uffff\u0000\u031c[\u0001\u0000\u0000\u0000\u031d\u031e\u0007\u0005"+
		"\u0000\u0000\u031e]\u0001\u0000\u0000\u0000\u031f\u0320\u0007\u0006\u0000"+
		"\u0000\u0320_\u0001\u0000\u0000\u0000\u0321\u0322\u0005\u000f\u0000\u0000"+
		"\u0322\u0328\u00060\uffff\uffff\u0000\u0323\u0324\u0003b1\u0000\u0324"+
		"\u0325\u00060\uffff\uffff\u0000\u0325\u0327\u0001\u0000\u0000\u0000\u0326"+
		"\u0323\u0001\u0000\u0000\u0000\u0327\u032a\u0001\u0000\u0000\u0000\u0328"+
		"\u0326\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000\u0000\u0329"+
		"\u032b\u0001\u0000\u0000\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032b"+
		"\u032c\u0005\u0011\u0000\u0000\u032ca\u0001\u0000\u0000\u0000\u032d\u032e"+
		"\u0003f3\u0000\u032e\u032f\u00061\uffff\uffff\u0000\u032f\u0353\u0001"+
		"\u0000\u0000\u0000\u0330\u0353\u0003h4\u0000\u0331\u0332\u0003l6\u0000"+
		"\u0332\u0333\u00061\uffff\uffff\u0000\u0333\u0353\u0001\u0000\u0000\u0000"+
		"\u0334\u0335\u0003r9\u0000\u0335\u0336\u00061\uffff\uffff\u0000\u0336"+
		"\u0353\u0001\u0000\u0000\u0000\u0337\u0338\u0003`0\u0000\u0338\u0339\u0006"+
		"1\uffff\uffff\u0000\u0339\u0353\u0001\u0000\u0000\u0000\u033a\u0353\u0003"+
		"t:\u0000\u033b\u033c\u0003x<\u0000\u033c\u033d\u00061\uffff\uffff\u0000"+
		"\u033d\u0353\u0001\u0000\u0000\u0000\u033e\u033f\u0003z=\u0000\u033f\u0340"+
		"\u00061\uffff\uffff\u0000\u0340\u0353\u0001\u0000\u0000\u0000\u0341\u0342"+
		"\u0003|>\u0000\u0342\u0343\u00061\uffff\uffff\u0000\u0343\u0353\u0001"+
		"\u0000\u0000\u0000\u0344\u0345\u0003~?\u0000\u0345\u0346\u00061\uffff"+
		"\uffff\u0000\u0346\u0353\u0001\u0000\u0000\u0000\u0347\u0348\u0003\u0080"+
		"@\u0000\u0348\u0349\u00061\uffff\uffff\u0000\u0349\u0353\u0001\u0000\u0000"+
		"\u0000\u034a\u0353\u0003\u0082A\u0000\u034b\u034c\u0003n7\u0000\u034c"+
		"\u034d\u00061\uffff\uffff\u0000\u034d\u0353\u0001\u0000\u0000\u0000\u034e"+
		"\u0353\u0003p8\u0000\u034f\u0350\u0003\u0084B\u0000\u0350\u0351\u0006"+
		"1\uffff\uffff\u0000\u0351\u0353\u0001\u0000\u0000\u0000\u0352\u032d\u0001"+
		"\u0000\u0000\u0000\u0352\u0330\u0001\u0000\u0000\u0000\u0352\u0331\u0001"+
		"\u0000\u0000\u0000\u0352\u0334\u0001\u0000\u0000\u0000\u0352\u0337\u0001"+
		"\u0000\u0000\u0000\u0352\u033a\u0001\u0000\u0000\u0000\u0352\u033b\u0001"+
		"\u0000\u0000\u0000\u0352\u033e\u0001\u0000\u0000\u0000\u0352\u0341\u0001"+
		"\u0000\u0000\u0000\u0352\u0344\u0001\u0000\u0000\u0000\u0352\u0347\u0001"+
		"\u0000\u0000\u0000\u0352\u034a\u0001\u0000\u0000\u0000\u0352\u034b\u0001"+
		"\u0000\u0000\u0000\u0352\u034e\u0001\u0000\u0000\u0000\u0352\u034f\u0001"+
		"\u0000\u0000\u0000\u0353c\u0001\u0000\u0000\u0000\u0354\u0355\u0003\u008e"+
		"G\u0000\u0355\u0356\u00062\uffff\uffff\u0000\u0356\u0357\u0005\u0002\u0000"+
		"\u0000\u0357e\u0001\u0000\u0000\u0000\u0358\u0359\u00053\u0000\u0000\u0359"+
		"\u035a\u0005\u0017\u0000\u0000\u035a\u035b\u0003\u008eG\u0000\u035b\u035c"+
		"\u0005\u0018\u0000\u0000\u035c\u035d\u0003b1\u0000\u035d\u0362\u00063"+
		"\uffff\uffff\u0000\u035e\u035f\u00054\u0000\u0000\u035f\u0360\u0003b1"+
		"\u0000\u0360\u0361\u00063\uffff\uffff\u0000\u0361\u0363\u0001\u0000\u0000"+
		"\u0000\u0362\u035e\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000"+
		"\u0000\u0363g\u0001\u0000\u0000\u0000\u0364\u0365\u00055\u0000\u0000\u0365"+
		"\u0367\u0003\u008eG\u0000\u0366\u0368\u00036\u001b\u0000\u0367\u0366\u0001"+
		"\u0000\u0000\u0000\u0367\u0368\u0001\u0000\u0000\u0000\u0368\u0369\u0001"+
		"\u0000\u0000\u0000\u0369\u036b\u0003`0\u0000\u036a\u036c\u0003j5\u0000"+
		"\u036b\u036a\u0001\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000\u0000"+
		"\u036d\u036b\u0001\u0000\u0000\u0000\u036d\u036e\u0001\u0000\u0000\u0000"+
		"\u036ei\u0001\u0000\u0000\u0000\u036f\u0374\u00056\u0000\u0000\u0370\u0372"+
		"\u0003\u00c4b\u0000\u0371\u0370\u0001\u0000\u0000\u0000\u0371\u0372\u0001"+
		"\u0000\u0000\u0000\u0372\u0373\u0001\u0000\u0000\u0000\u0373\u0375\u0003"+
		"@ \u0000\u0374\u0371\u0001\u0000\u0000\u0000\u0374\u0375\u0001\u0000\u0000"+
		"\u0000\u0375\u0376\u0001\u0000\u0000\u0000\u0376\u0377\u0003`0\u0000\u0377"+
		"k\u0001\u0000\u0000\u0000\u0378\u0379\u00057\u0000\u0000\u0379\u037a\u0005"+
		"\u0017\u0000\u0000\u037a\u037b\u0003\u008eG\u0000\u037b\u037c\u0005\u0018"+
		"\u0000\u0000\u037c\u037d\u0003b1\u0000\u037d\u037e\u00066\uffff\uffff"+
		"\u0000\u037em\u0001\u0000\u0000\u0000\u037f\u0380\u0003\u0086C\u0000\u0380"+
		"\u0381\u00067\uffff\uffff\u0000\u0381\u0386\u0001\u0000\u0000\u0000\u0382"+
		"\u0383\u0003d2\u0000\u0383\u0384\u00067\uffff\uffff\u0000\u0384\u0386"+
		"\u0001\u0000\u0000\u0000\u0385\u037f\u0001\u0000\u0000\u0000\u0385\u0382"+
		"\u0001\u0000\u0000\u0000\u0386o\u0001\u0000\u0000\u0000\u0387\u0388\u0005"+
		"8\u0000\u0000\u0388\u0389\u0003`0\u0000\u0389q\u0001\u0000\u0000\u0000"+
		"\u038a\u038b\u0005\u001b\u0000\u0000\u038b\u038c\u0005\u0017\u0000\u0000"+
		"\u038c\u0391\u00069\uffff\uffff\u0000\u038d\u038e\u0003n7\u0000\u038e"+
		"\u038f\u00069\uffff\uffff\u0000\u038f\u0392\u0001\u0000\u0000\u0000\u0390"+
		"\u0392\u0005\u0002\u0000\u0000\u0391\u038d\u0001\u0000\u0000\u0000\u0391"+
		"\u0390\u0001\u0000\u0000\u0000\u0392\u0397\u0001\u0000\u0000\u0000\u0393"+
		"\u0394\u0003d2\u0000\u0394\u0395\u00069\uffff\uffff\u0000\u0395\u0398"+
		"\u0001\u0000\u0000\u0000\u0396\u0398\u0005\u0002\u0000\u0000\u0397\u0393"+
		"\u0001\u0000\u0000\u0000\u0397\u0396\u0001\u0000\u0000\u0000\u0398\u039c"+
		"\u0001\u0000\u0000\u0000\u0399\u039a\u0003\u008eG\u0000\u039a\u039b\u0006"+
		"9\uffff\uffff\u0000\u039b\u039d\u0001\u0000\u0000\u0000\u039c\u0399\u0001"+
		"\u0000\u0000\u0000\u039c\u039d\u0001\u0000\u0000\u0000\u039d\u039e\u0001"+
		"\u0000\u0000\u0000\u039e\u039f\u0005\u0018\u0000\u0000\u039f\u03a0\u0003"+
		"b1\u0000\u03a0\u03a1\u00069\uffff\uffff\u0000\u03a1s\u0001\u0000\u0000"+
		"\u0000\u03a2\u03a4\u00059\u0000\u0000\u03a3\u03a5\u0005\u0082\u0000\u0000"+
		"\u03a4\u03a3\u0001\u0000\u0000\u0000\u03a4\u03a5\u0001\u0000\u0000\u0000"+
		"\u03a5\u03aa\u0001\u0000\u0000\u0000\u03a6\u03a7\u0005\u0017\u0000\u0000"+
		"\u03a7\u03a8\u0003v;\u0000\u03a8\u03a9\u0005\u0018\u0000\u0000\u03a9\u03ab"+
		"\u0001\u0000\u0000\u0000\u03aa\u03a6\u0001\u0000\u0000\u0000\u03aa\u03ab"+
		"\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac\u03ad"+
		"\u0003\u009cN\u0000\u03adu\u0001\u0000\u0000\u0000\u03ae\u03af\u0003\u00c8"+
		"d\u0000\u03afw\u0001\u0000\u0000\u0000\u03b0\u03b1\u0005:\u0000\u0000"+
		"\u03b1\u03b2\u0003b1\u0000\u03b2\u03b3\u00057\u0000\u0000\u03b3\u03b4"+
		"\u0005\u0017\u0000\u0000\u03b4\u03b5\u0003\u008eG\u0000\u03b5\u03b6\u0005"+
		"\u0018\u0000\u0000\u03b6\u03b7\u0005\u0002\u0000\u0000\u03b7\u03b8\u0006"+
		"<\uffff\uffff\u0000\u03b8y\u0001\u0000\u0000\u0000\u03b9\u03ba\u0005q"+
		"\u0000\u0000\u03ba\u03bb\u0005\u0002\u0000\u0000\u03bb\u03bc\u0006=\uffff"+
		"\uffff\u0000\u03bc{\u0001\u0000\u0000\u0000\u03bd\u03be\u0005n\u0000\u0000"+
		"\u03be\u03bf\u0005\u0002\u0000\u0000\u03bf\u03c0\u0006>\uffff\uffff\u0000"+
		"\u03c0}\u0001\u0000\u0000\u0000\u03c1\u03c2\u0005;\u0000\u0000\u03c2\u03c6"+
		"\u0006?\uffff\uffff\u0000\u03c3\u03c4\u0003\u008eG\u0000\u03c4\u03c5\u0006"+
		"?\uffff\uffff\u0000\u03c5\u03c7\u0001\u0000\u0000\u0000\u03c6\u03c3\u0001"+
		"\u0000\u0000\u0000\u03c6\u03c7\u0001\u0000\u0000\u0000\u03c7\u03c8\u0001"+
		"\u0000\u0000\u0000\u03c8\u03c9\u0005\u0002\u0000\u0000\u03c9\u007f\u0001"+
		"\u0000\u0000\u0000\u03ca\u03cb\u0005<\u0000\u0000\u03cb\u03cc\u0005\u0002"+
		"\u0000\u0000\u03cc\u03cd\u0006@\uffff\uffff\u0000\u03cd\u0081\u0001\u0000"+
		"\u0000\u0000\u03ce\u03cf\u0005=\u0000\u0000\u03cf\u03d0\u0003\u009aM\u0000"+
		"\u03d0\u03d1\u0005\u0002\u0000\u0000\u03d1\u0083\u0001\u0000\u0000\u0000"+
		"\u03d2\u03d3\u0005>\u0000\u0000\u03d3\u03d4\u0003\u009aM\u0000\u03d4\u03d5"+
		"\u0005\u0002\u0000\u0000\u03d5\u03d6\u0006B\uffff\uffff\u0000\u03d6\u0085"+
		"\u0001\u0000\u0000\u0000\u03d7\u03e5\u0006C\uffff\uffff\u0000\u03d8\u03d9"+
		"\u0005?\u0000\u0000\u03d9\u03da\u0006C\uffff\uffff\u0000\u03da\u03db\u0003"+
		"\u008aE\u0000\u03db\u03dc\u0006C\uffff\uffff\u0000\u03dc\u03e6\u0001\u0000"+
		"\u0000\u0000\u03dd\u03de\u0003L&\u0000\u03de\u03df\u0006C\uffff\uffff"+
		"\u0000\u03df\u03e6\u0001\u0000\u0000\u0000\u03e0\u03e1\u0005\u0017\u0000"+
		"\u0000\u03e1\u03e2\u0003\u0088D\u0000\u03e2\u03e3\u0006C\uffff\uffff\u0000"+
		"\u03e3\u03e4\u0005\u0018\u0000\u0000\u03e4\u03e6\u0001\u0000\u0000\u0000"+
		"\u03e5\u03d8\u0001\u0000\u0000\u0000\u03e5\u03dd\u0001\u0000\u0000\u0000"+
		"\u03e5\u03e0\u0001\u0000\u0000\u0000\u03e6\u03eb\u0001\u0000\u0000\u0000"+
		"\u03e7\u03e8\u0005\u000b\u0000\u0000\u03e8\u03e9\u0003\u008eG\u0000\u03e9"+
		"\u03ea\u0006C\uffff\uffff\u0000\u03ea\u03ec\u0001\u0000\u0000\u0000\u03eb"+
		"\u03e7\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000\u03ec"+
		"\u03ed\u0001\u0000\u0000\u0000\u03ed\u03ee\u0005\u0002\u0000\u0000\u03ee"+
		"\u0087\u0001\u0000\u0000\u0000\u03ef\u03f8\u0006D\uffff\uffff\u0000\u03f0"+
		"\u03f1\u0003L&\u0000\u03f1\u03f2\u0006D\uffff\uffff\u0000\u03f2\u03f4"+
		"\u0001\u0000\u0000\u0000\u03f3\u03f0\u0001\u0000\u0000\u0000\u03f3\u03f4"+
		"\u0001\u0000\u0000\u0000\u03f4\u03f5\u0001\u0000\u0000\u0000\u03f5\u03f7"+
		"\u0005\u0010\u0000\u0000\u03f6\u03f3\u0001\u0000\u0000\u0000\u03f7\u03fa"+
		"\u0001\u0000\u0000\u0000\u03f8\u03f6\u0001\u0000\u0000\u0000\u03f8\u03f9"+
		"\u0001\u0000\u0000\u0000\u03f9\u03fe\u0001\u0000\u0000\u0000\u03fa\u03f8"+
		"\u0001\u0000\u0000\u0000\u03fb\u03fc\u0003L&\u0000\u03fc\u03fd\u0006D"+
		"\uffff\uffff\u0000\u03fd\u03ff\u0001\u0000\u0000\u0000\u03fe\u03fb\u0001"+
		"\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u0089\u0001"+
		"\u0000\u0000\u0000\u0400\u0401\u0005\u0017\u0000\u0000\u0401\u040a\u0006"+
		"E\uffff\uffff\u0000\u0402\u0403\u0003\u00c4b\u0000\u0403\u0404\u0006E"+
		"\uffff\uffff\u0000\u0404\u0406\u0001\u0000\u0000\u0000\u0405\u0402\u0001"+
		"\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000\u0000\u0406\u0407\u0001"+
		"\u0000\u0000\u0000\u0407\u0409\u0005\u0010\u0000\u0000\u0408\u0405\u0001"+
		"\u0000\u0000\u0000\u0409\u040c\u0001\u0000\u0000\u0000\u040a\u0408\u0001"+
		"\u0000\u0000\u0000\u040a\u040b\u0001\u0000\u0000\u0000\u040b\u0410\u0001"+
		"\u0000\u0000\u0000\u040c\u040a\u0001\u0000\u0000\u0000\u040d\u040e\u0003"+
		"\u00c4b\u0000\u040e\u040f\u0006E\uffff\uffff\u0000\u040f\u0411\u0001\u0000"+
		"\u0000\u0000\u0410\u040d\u0001\u0000\u0000\u0000\u0410\u0411\u0001\u0000"+
		"\u0000\u0000\u0411\u0412\u0001\u0000\u0000\u0000\u0412\u0413\u0005\u0018"+
		"\u0000\u0000\u0413\u0414\u0006E\uffff\uffff\u0000\u0414\u008b\u0001\u0000"+
		"\u0000\u0000\u0415\u0416\u0005,\u0000\u0000\u0416\u042a\u0006F\uffff\uffff"+
		"\u0000\u0417\u0418\u0005@\u0000\u0000\u0418\u042a\u0006F\uffff\uffff\u0000"+
		"\u0419\u041a\u0005A\u0000\u0000\u041a\u042a\u0006F\uffff\uffff\u0000\u041b"+
		"\u041c\u0005?\u0000\u0000\u041c\u042a\u0006F\uffff\uffff\u0000\u041d\u041e"+
		"\u0005b\u0000\u0000\u041e\u042a\u0006F\uffff\uffff\u0000\u041f\u0420\u0005"+
		"c\u0000\u0000\u0420\u042a\u0006F\uffff\uffff\u0000\u0421\u0422\u0005B"+
		"\u0000\u0000\u0422\u042a\u0006F\uffff\uffff\u0000\u0423\u0424\u0005d\u0000"+
		"\u0000\u0424\u042a\u0006F\uffff\uffff\u0000\u0425\u0426\u0005e\u0000\u0000"+
		"\u0426\u042a\u0006F\uffff\uffff\u0000\u0427\u0428\u0005f\u0000\u0000\u0428"+
		"\u042a\u0006F\uffff\uffff\u0000\u0429\u0415\u0001\u0000\u0000\u0000\u0429"+
		"\u0417\u0001\u0000\u0000\u0000\u0429\u0419\u0001\u0000\u0000\u0000\u0429"+
		"\u041b\u0001\u0000\u0000\u0000\u0429\u041d\u0001\u0000\u0000\u0000\u0429"+
		"\u041f\u0001\u0000\u0000\u0000\u0429\u0421\u0001\u0000\u0000\u0000\u0429"+
		"\u0423\u0001\u0000\u0000\u0000\u0429\u0425\u0001\u0000\u0000\u0000\u0429"+
		"\u0427\u0001\u0000\u0000\u0000\u042a\u008d\u0001\u0000\u0000\u0000\u042b"+
		"\u042c\u0006G\uffff\uffff\u0000\u042c\u042d\u0005E\u0000\u0000\u042d\u042e"+
		"\u0003N\'\u0000\u042e\u042f\u0006G\uffff\uffff\u0000\u042f\u0455\u0001"+
		"\u0000\u0000\u0000\u0430\u0431\u0005G\u0000\u0000\u0431\u0432\u0005\u0017"+
		"\u0000\u0000\u0432\u0433\u0003\u008eG\u0000\u0433\u0434\u0005\u0010\u0000"+
		"\u0000\u0434\u0435\u0003\u00c8d\u0000\u0435\u0436\u0005\u0018\u0000\u0000"+
		"\u0436\u0437\u0006G\uffff\uffff\u0000\u0437\u0455\u0001\u0000\u0000\u0000"+
		"\u0438\u0439\u0005\u0017\u0000\u0000\u0439\u043a\u0003\u008eG\u0000\u043a"+
		"\u043b\u0005\u0018\u0000\u0000\u043b\u043c\u0006G\uffff\uffff\u0000\u043c"+
		"\u0455\u0001\u0000\u0000\u0000\u043d\u043e\u0007\u0007\u0000\u0000\u043e"+
		"\u043f\u0003\u008eG\u0013\u043f\u0440\u0006G\uffff\uffff\u0000\u0440\u0455"+
		"\u0001\u0000\u0000\u0000\u0441\u0442\u0007\b\u0000\u0000\u0442\u0443\u0003"+
		"\u008eG\u0012\u0443\u0444\u0006G\uffff\uffff\u0000\u0444\u0455\u0001\u0000"+
		"\u0000\u0000\u0445\u0446\u0005H\u0000\u0000\u0446\u0447\u0003\u008eG\u0011"+
		"\u0447\u0448\u0006G\uffff\uffff\u0000\u0448\u0455\u0001\u0000\u0000\u0000"+
		"\u0449\u044a\u0005I\u0000\u0000\u044a\u044b\u0003\u008eG\u0010\u044b\u044c"+
		"\u0006G\uffff\uffff\u0000\u044c\u0455\u0001\u0000\u0000\u0000\u044d\u044e"+
		"\u0005\u0006\u0000\u0000\u044e\u044f\u0003\u008eG\u000f\u044f\u0450\u0006"+
		"G\uffff\uffff\u0000\u0450\u0455\u0001\u0000\u0000\u0000\u0451\u0452\u0003"+
		"\u0090H\u0000\u0452\u0453\u0006G\uffff\uffff\u0000\u0453\u0455\u0001\u0000"+
		"\u0000\u0000\u0454\u042b\u0001\u0000\u0000\u0000\u0454\u0430\u0001\u0000"+
		"\u0000\u0000\u0454\u0438\u0001\u0000\u0000\u0000\u0454\u043d\u0001\u0000"+
		"\u0000\u0000\u0454\u0441\u0001\u0000\u0000\u0000\u0454\u0445\u0001\u0000"+
		"\u0000\u0000\u0454\u0449\u0001\u0000\u0000\u0000\u0454\u044d\u0001\u0000"+
		"\u0000\u0000\u0454\u0451\u0001\u0000\u0000\u0000\u0455\u04c5\u0001\u0000"+
		"\u0000\u0000\u0456\u0457\n\u000e\u0000\u0000\u0457\u0458\u0005J\u0000"+
		"\u0000\u0458\u0459\u0003\u008eG\u000e\u0459\u045a\u0006G\uffff\uffff\u0000"+
		"\u045a\u04c4\u0001\u0000\u0000\u0000\u045b\u045c\n\r\u0000\u0000\u045c"+
		"\u045d\u0007\t\u0000\u0000\u045d\u045e\u0003\u008eG\u000e\u045e\u045f"+
		"\u0006G\uffff\uffff\u0000\u045f\u04c4\u0001\u0000\u0000\u0000\u0460\u0461"+
		"\n\f\u0000\u0000\u0461\u0462\u0007\b\u0000\u0000\u0462\u0463\u0003\u008e"+
		"G\r\u0463\u0464\u0006G\uffff\uffff\u0000\u0464\u04c4\u0001\u0000\u0000"+
		"\u0000\u0465\u0466\n\u000b\u0000\u0000\u0466\u0467\u0007\n\u0000\u0000"+
		"\u0467\u0468\u0003\u008eG\f\u0468\u0469\u0006G\uffff\uffff\u0000\u0469"+
		"\u04c4\u0001\u0000\u0000\u0000\u046a\u046b\n\n\u0000\u0000\u046b\u046c"+
		"\u0005\u001d\u0000\u0000\u046c\u046d\u0003\u008eG\u000b\u046d\u046e\u0006"+
		"G\uffff\uffff\u0000\u046e\u04c4\u0001\u0000\u0000\u0000\u046f\u0470\n"+
		"\t\u0000\u0000\u0470\u0471\u0005\u0005\u0000\u0000\u0471\u0472\u0003\u008e"+
		"G\n\u0472\u0473\u0006G\uffff\uffff\u0000\u0473\u04c4\u0001\u0000\u0000"+
		"\u0000\u0474\u0475\n\b\u0000\u0000\u0475\u0476\u0005\u001c\u0000\u0000"+
		"\u0476\u0477\u0003\u008eG\t\u0477\u0478\u0006G\uffff\uffff\u0000\u0478"+
		"\u04c4\u0001\u0000\u0000\u0000\u0479\u047a\n\u0007\u0000\u0000\u047a\u047b"+
		"\u0007\u000b\u0000\u0000\u047b\u047c\u0003\u008eG\b\u047c\u047d\u0006"+
		"G\uffff\uffff\u0000\u047d\u04c4\u0001\u0000\u0000\u0000\u047e\u047f\n"+
		"\u0006\u0000\u0000\u047f\u0480\u0007\f\u0000\u0000\u0480\u0481\u0003\u008e"+
		"G\u0007\u0481\u0482\u0006G\uffff\uffff\u0000\u0482\u04c4\u0001\u0000\u0000"+
		"\u0000\u0483\u0484\n\u0005\u0000\u0000\u0484\u0485\u0005M\u0000\u0000"+
		"\u0485\u0486\u0003\u008eG\u0006\u0486\u0487\u0006G\uffff\uffff\u0000\u0487"+
		"\u04c4\u0001\u0000\u0000\u0000\u0488\u0489\n\u0004\u0000\u0000\u0489\u048a"+
		"\u0005\u0004\u0000\u0000\u048a\u048b\u0003\u008eG\u0005\u048b\u048c\u0006"+
		"G\uffff\uffff\u0000\u048c\u04c4\u0001\u0000\u0000\u0000\u048d\u048e\n"+
		"\u0003\u0000\u0000\u048e\u048f\u0005N\u0000\u0000\u048f\u0490\u0003\u008e"+
		"G\u0000\u0490\u0491\u0005F\u0000\u0000\u0491\u0492\u0003\u008eG\u0003"+
		"\u0492\u0493\u0006G\uffff\uffff\u0000\u0493\u04c4\u0001\u0000\u0000\u0000"+
		"\u0494\u0495\n\u0002\u0000\u0000\u0495\u0496\u0007\r\u0000\u0000\u0496"+
		"\u0497\u0003\u008eG\u0003\u0497\u0498\u0006G\uffff\uffff\u0000\u0498\u04c4"+
		"\u0001\u0000\u0000\u0000\u0499\u049e\n\u001c\u0000\u0000\u049a\u049b\u0005"+
		"C\u0000\u0000\u049b\u049f\u0006G\uffff\uffff\u0000\u049c\u049d\u0005D"+
		"\u0000\u0000\u049d\u049f\u0006G\uffff\uffff\u0000\u049e\u049a\u0001\u0000"+
		"\u0000\u0000\u049e\u049c\u0001\u0000\u0000\u0000\u049f\u04a0\u0001\u0000"+
		"\u0000\u0000\u04a0\u04c4\u0006G\uffff\uffff\u0000\u04a1\u04a2\n\u001a"+
		"\u0000\u0000\u04a2\u04a3\u0005*\u0000\u0000\u04a3\u04a4\u0003\u008eG\u0000"+
		"\u04a4\u04a5\u0005+\u0000\u0000\u04a5\u04a6\u0006G\uffff\uffff\u0000\u04a6"+
		"\u04c4\u0001\u0000\u0000\u0000\u04a7\u04a8\n\u0019\u0000\u0000\u04a8\u04aa"+
		"\u0005*\u0000\u0000\u04a9\u04ab\u0003\u008eG\u0000\u04aa\u04a9\u0001\u0000"+
		"\u0000\u0000\u04aa\u04ab\u0001\u0000\u0000\u0000\u04ab\u04ac\u0001\u0000"+
		"\u0000\u0000\u04ac\u04ae\u0005F\u0000\u0000\u04ad\u04af\u0003\u008eG\u0000"+
		"\u04ae\u04ad\u0001\u0000\u0000\u0000\u04ae\u04af\u0001\u0000\u0000\u0000"+
		"\u04af\u04b0\u0001\u0000\u0000\u0000\u04b0\u04b1\u0005+\u0000\u0000\u04b1"+
		"\u04c4\u0006G\uffff\uffff\u0000\u04b2\u04b3\n\u0018\u0000\u0000\u04b3"+
		"\u04b4\u0005-\u0000\u0000\u04b4\u04b5\u0003\u00c4b\u0000\u04b5\u04b6\u0006"+
		"G\uffff\uffff\u0000\u04b6\u04c4\u0001\u0000\u0000\u0000\u04b7\u04b8\n"+
		"\u0017\u0000\u0000\u04b8\u04b9\u0005\u000f\u0000\u0000\u04b9\u04ba\u0003"+
		"\u0094J\u0000\u04ba\u04bb\u0005\u0011\u0000\u0000\u04bb\u04bc\u0006G\uffff"+
		"\uffff\u0000\u04bc\u04c4\u0001\u0000\u0000\u0000\u04bd\u04be\n\u0015\u0000"+
		"\u0000\u04be\u04bf\u0005\u0017\u0000\u0000\u04bf\u04c0\u0003\u0098L\u0000"+
		"\u04c0\u04c1\u0005\u0018\u0000\u0000\u04c1\u04c2\u0006G\uffff\uffff\u0000"+
		"\u04c2\u04c4\u0001\u0000\u0000\u0000\u04c3\u0456\u0001\u0000\u0000\u0000"+
		"\u04c3\u045b\u0001\u0000\u0000\u0000\u04c3\u0460\u0001\u0000\u0000\u0000"+
		"\u04c3\u0465\u0001\u0000\u0000\u0000\u04c3\u046a\u0001\u0000\u0000\u0000"+
		"\u04c3\u046f\u0001\u0000\u0000\u0000\u04c3\u0474\u0001\u0000\u0000\u0000"+
		"\u04c3\u0479\u0001\u0000\u0000\u0000\u04c3\u047e\u0001\u0000\u0000\u0000"+
		"\u04c3\u0483\u0001\u0000\u0000\u0000\u04c3\u0488\u0001\u0000\u0000\u0000"+
		"\u04c3\u048d\u0001\u0000\u0000\u0000\u04c3\u0494\u0001\u0000\u0000\u0000"+
		"\u04c3\u0499\u0001\u0000\u0000\u0000\u04c3\u04a1\u0001\u0000\u0000\u0000"+
		"\u04c3\u04a7\u0001\u0000\u0000\u0000\u04c3\u04b2\u0001\u0000\u0000\u0000"+
		"\u04c3\u04b7\u0001\u0000\u0000\u0000\u04c3\u04bd\u0001\u0000\u0000\u0000"+
		"\u04c4\u04c7\u0001\u0000\u0000\u0000\u04c5\u04c3\u0001\u0000\u0000\u0000"+
		"\u04c5\u04c6\u0001\u0000\u0000\u0000\u04c6\u008f\u0001\u0000\u0000\u0000"+
		"\u04c7\u04c5\u0001\u0000\u0000\u0000\u04c8\u04c9\u0005g\u0000\u0000\u04c9"+
		"\u04e1\u0006H\uffff\uffff\u0000\u04ca\u04cb\u0003\u00c2a\u0000\u04cb\u04cc"+
		"\u0006H\uffff\uffff\u0000\u04cc\u04e1\u0001\u0000\u0000\u0000\u04cd\u04ce"+
		"\u0003\u00c6c\u0000\u04ce\u04cf\u0006H\uffff\uffff\u0000\u04cf\u04e1\u0001"+
		"\u0000\u0000\u0000\u04d0\u04d1\u0003\u00c8d\u0000\u04d1\u04d2\u0006H\uffff"+
		"\uffff\u0000\u04d2\u04e1\u0001\u0000\u0000\u0000\u04d3\u04d4\u0003\u00c4"+
		"b\u0000\u04d4\u04d5\u0006H\uffff\uffff\u0000\u04d5\u04e1\u0001\u0000\u0000"+
		"\u0000\u04d6\u04d7\u0005{\u0000\u0000\u04d7\u04e1\u0006H\uffff\uffff\u0000"+
		"\u04d8\u04d9\u0005v\u0000\u0000\u04d9\u04e1\u0006H\uffff\uffff\u0000\u04da"+
		"\u04db\u0003\u00c0`\u0000\u04db\u04dc\u0006H\uffff\uffff\u0000\u04dc\u04e1"+
		"\u0001\u0000\u0000\u0000\u04dd\u04de\u0003N\'\u0000\u04de\u04df\u0006"+
		"H\uffff\uffff\u0000\u04df\u04e1\u0001\u0000\u0000\u0000\u04e0\u04c8\u0001"+
		"\u0000\u0000\u0000\u04e0\u04ca\u0001\u0000\u0000\u0000\u04e0\u04cd\u0001"+
		"\u0000\u0000\u0000\u04e0\u04d0\u0001\u0000\u0000\u0000\u04e0\u04d3\u0001"+
		"\u0000\u0000\u0000\u04e0\u04d6\u0001\u0000\u0000\u0000\u04e0\u04d8\u0001"+
		"\u0000\u0000\u0000\u04e0\u04da\u0001\u0000\u0000\u0000\u04e0\u04dd\u0001"+
		"\u0000\u0000\u0000\u04e1\u0091\u0001\u0000\u0000\u0000\u04e2\u04e3\u0006"+
		"I\uffff\uffff\u0000\u04e3\u04e4\u0003\u008eG\u0000\u04e4\u04eb\u0006I"+
		"\uffff\uffff\u0000\u04e5\u04e6\u0005\u0010\u0000\u0000\u04e6\u04e7\u0003"+
		"\u008eG\u0000\u04e7\u04e8\u0006I\uffff\uffff\u0000\u04e8\u04ea\u0001\u0000"+
		"\u0000\u0000\u04e9\u04e5\u0001\u0000\u0000\u0000\u04ea\u04ed\u0001\u0000"+
		"\u0000\u0000\u04eb\u04e9\u0001\u0000\u0000\u0000\u04eb\u04ec\u0001\u0000"+
		"\u0000\u0000\u04ec\u0093\u0001\u0000\u0000\u0000\u04ed\u04eb\u0001\u0000"+
		"\u0000\u0000\u04ee\u04ef\u0006J\uffff\uffff\u0000\u04ef\u04f0\u0003\u0096"+
		"K\u0000\u04f0\u04f7\u0006J\uffff\uffff\u0000\u04f1\u04f2\u0005\u0010\u0000"+
		"\u0000\u04f2\u04f3\u0003\u0096K\u0000\u04f3\u04f4\u0006J\uffff\uffff\u0000"+
		"\u04f4\u04f6\u0001\u0000\u0000\u0000\u04f5\u04f1\u0001\u0000\u0000\u0000"+
		"\u04f6\u04f9\u0001\u0000\u0000\u0000\u04f7\u04f5\u0001\u0000\u0000\u0000"+
		"\u04f7\u04f8\u0001\u0000\u0000\u0000\u04f8\u04fb\u0001\u0000\u0000\u0000"+
		"\u04f9\u04f7\u0001\u0000\u0000\u0000\u04fa\u04fc\u0005\u0010\u0000\u0000"+
		"\u04fb\u04fa\u0001\u0000\u0000\u0000\u04fb\u04fc\u0001\u0000\u0000\u0000"+
		"\u04fc\u0095\u0001\u0000\u0000\u0000\u04fd\u04fe\u0003\u00c4b\u0000\u04fe"+
		"\u04ff\u0005F\u0000\u0000\u04ff\u0500\u0003\u008eG\u0000\u0500\u0501\u0006"+
		"K\uffff\uffff\u0000\u0501\u0097\u0001\u0000\u0000\u0000\u0502\u0506\u0005"+
		"\u000f\u0000\u0000\u0503\u0504\u0003\u0094J\u0000\u0504\u0505\u0006L\uffff"+
		"\uffff\u0000\u0505\u0507\u0001\u0000\u0000\u0000\u0506\u0503\u0001\u0000"+
		"\u0000\u0000\u0506\u0507\u0001\u0000\u0000\u0000\u0507\u0508\u0001\u0000"+
		"\u0000\u0000\u0508\u050f\u0005\u0011\u0000\u0000\u0509\u050a\u0003\u0092"+
		"I\u0000\u050a\u050b\u0006L\uffff\uffff\u0000\u050b\u050d\u0001\u0000\u0000"+
		"\u0000\u050c\u0509\u0001\u0000\u0000\u0000\u050c\u050d\u0001\u0000\u0000"+
		"\u0000\u050d\u050f\u0001\u0000\u0000\u0000\u050e\u0502\u0001\u0000\u0000"+
		"\u0000\u050e\u050c\u0001\u0000\u0000\u0000\u050f\u0099\u0001\u0000\u0000"+
		"\u0000\u0510\u0511\u0003\u008eG\u0000\u0511\u0512\u0005\u0017\u0000\u0000"+
		"\u0512\u0513\u0003\u0098L\u0000\u0513\u0514\u0005\u0018\u0000\u0000\u0514"+
		"\u0515\u0006M\uffff\uffff\u0000\u0515\u009b\u0001\u0000\u0000\u0000\u0516"+
		"\u051a\u0005\u000f\u0000\u0000\u0517\u0519\u0003\u009eO\u0000\u0518\u0517"+
		"\u0001\u0000\u0000\u0000\u0519\u051c\u0001\u0000\u0000\u0000\u051a\u0518"+
		"\u0001\u0000\u0000\u0000\u051a\u051b\u0001\u0000\u0000\u0000\u051b\u051d"+
		"\u0001\u0000\u0000\u0000\u051c\u051a\u0001\u0000\u0000\u0000\u051d\u051e"+
		"\u0005\u0011\u0000\u0000\u051e\u009d\u0001\u0000\u0000\u0000\u051f\u0531"+
		"\u0003\u00c4b\u0000\u0520\u0531\u0003\u009cN\u0000\u0521\u0531\u0003\u00a0"+
		"P\u0000\u0522\u0531\u0003\u00a6S\u0000\u0523\u0531\u0003\u00a8T\u0000"+
		"\u0524\u0531\u0003\u00aeW\u0000\u0525\u0531\u0003\u00b0X\u0000\u0526\u0531"+
		"\u0003\u00b2Y\u0000\u0527\u0531\u0003\u00b6[\u0000\u0528\u0531\u0003\u00ba"+
		"]\u0000\u0529\u0531\u0003\u00bc^\u0000\u052a\u0531\u0005n\u0000\u0000"+
		"\u052b\u0531\u0005q\u0000\u0000\u052c\u0531\u0005r\u0000\u0000\u052d\u0531"+
		"\u0003\u00c2a\u0000\u052e\u0531\u0003\u00c8d\u0000\u052f\u0531\u0003\u00c6"+
		"c\u0000\u0530\u051f\u0001\u0000\u0000\u0000\u0530\u0520\u0001\u0000\u0000"+
		"\u0000\u0530\u0521\u0001\u0000\u0000\u0000\u0530\u0522\u0001\u0000\u0000"+
		"\u0000\u0530\u0523\u0001\u0000\u0000\u0000\u0530\u0524\u0001\u0000\u0000"+
		"\u0000\u0530\u0525\u0001\u0000\u0000\u0000\u0530\u0526\u0001\u0000\u0000"+
		"\u0000\u0530\u0527\u0001\u0000\u0000\u0000\u0530\u0528\u0001\u0000\u0000"+
		"\u0000\u0530\u0529\u0001\u0000\u0000\u0000\u0530\u052a\u0001\u0000\u0000"+
		"\u0000\u0530\u052b\u0001\u0000\u0000\u0000\u0530\u052c\u0001\u0000\u0000"+
		"\u0000\u0530\u052d\u0001\u0000\u0000\u0000\u0530\u052e\u0001\u0000\u0000"+
		"\u0000\u0530\u052f\u0001\u0000\u0000\u0000\u0531\u009f\u0001\u0000\u0000"+
		"\u0000\u0532\u0536\u0003\u00a4R\u0000\u0533\u0536\u0003\u00be_\u0000\u0534"+
		"\u0536\u0003\u00a2Q\u0000\u0535\u0532\u0001\u0000\u0000\u0000\u0535\u0533"+
		"\u0001\u0000\u0000\u0000\u0535\u0534\u0001\u0000\u0000\u0000\u0536\u00a1"+
		"\u0001\u0000\u0000\u0000\u0537\u0538\u0003\u00c4b\u0000\u0538\u0539\u0005"+
		"-\u0000\u0000\u0539\u053a\u0003\u00c4b\u0000\u053a\u00a3\u0001\u0000\u0000"+
		"\u0000\u053b\u0540\u0005;\u0000\u0000\u053c\u0540\u0005,\u0000\u0000\u053d"+
		"\u0540\u0005B\u0000\u0000\u053e\u0540\u0003\u00c4b\u0000\u053f\u053b\u0001"+
		"\u0000\u0000\u0000\u053f\u053c\u0001\u0000\u0000\u0000\u053f\u053d\u0001"+
		"\u0000\u0000\u0000\u053f\u053e\u0001\u0000\u0000\u0000\u0540\u054d\u0001"+
		"\u0000\u0000\u0000\u0541\u0543\u0005\u0017\u0000\u0000\u0542\u0544\u0003"+
		"\u00a0P\u0000\u0543\u0542\u0001\u0000\u0000\u0000\u0543\u0544\u0001\u0000"+
		"\u0000\u0000\u0544\u0549\u0001\u0000\u0000\u0000\u0545\u0546\u0005\u0010"+
		"\u0000\u0000\u0546\u0548\u0003\u00a0P\u0000\u0547\u0545\u0001\u0000\u0000"+
		"\u0000\u0548\u054b\u0001\u0000\u0000\u0000\u0549\u0547\u0001\u0000\u0000"+
		"\u0000\u0549\u054a\u0001\u0000\u0000\u0000\u054a\u054c\u0001\u0000\u0000"+
		"\u0000\u054b\u0549\u0001\u0000\u0000\u0000\u054c\u054e\u0005\u0018\u0000"+
		"\u0000\u054d\u0541\u0001\u0000\u0000\u0000\u054d\u054e\u0001\u0000\u0000"+
		"\u0000\u054e\u00a5\u0001\u0000\u0000\u0000\u054f\u0550\u0005Y\u0000\u0000"+
		"\u0550\u0553\u0003\u00aaU\u0000\u0551\u0552\u0005Z\u0000\u0000\u0552\u0554"+
		"\u0003\u00a0P\u0000\u0553\u0551\u0001\u0000\u0000\u0000\u0553\u0554\u0001"+
		"\u0000\u0000\u0000\u0554\u00a7\u0001\u0000\u0000\u0000\u0555\u0556\u0003"+
		"\u00aaU\u0000\u0556\u0557\u0005Z\u0000\u0000\u0557\u0558\u0003\u00a0P"+
		"\u0000\u0558\u00a9\u0001\u0000\u0000\u0000\u0559\u0561\u0003\u00c4b\u0000"+
		"\u055a\u0561\u0003\u00a2Q\u0000\u055b\u0561\u0003\u00acV\u0000\u055c\u055d"+
		"\u0005\u0017\u0000\u0000\u055d\u055e\u0003\u00acV\u0000\u055e\u055f\u0005"+
		"\u0018\u0000\u0000\u055f\u0561\u0001\u0000\u0000\u0000\u0560\u0559\u0001"+
		"\u0000\u0000\u0000\u0560\u055a\u0001\u0000\u0000\u0000\u0560\u055b\u0001"+
		"\u0000\u0000\u0000\u0560\u055c\u0001\u0000\u0000\u0000\u0561\u00ab\u0001"+
		"\u0000\u0000\u0000\u0562\u0567\u0003\u00c4b\u0000\u0563\u0564\u0005\u0010"+
		"\u0000\u0000\u0564\u0566\u0003\u00c4b\u0000\u0565\u0563\u0001\u0000\u0000"+
		"\u0000\u0566\u0569\u0001\u0000\u0000\u0000\u0567\u0565\u0001\u0000\u0000"+
		"\u0000\u0567\u0568\u0001\u0000\u0000\u0000\u0568\u00ad\u0001\u0000\u0000"+
		"\u0000\u0569\u0567\u0001\u0000\u0000\u0000\u056a\u056b\u0003\u00a0P\u0000"+
		"\u056b\u056c\u0005[\u0000\u0000\u056c\u056d\u0003\u00c4b\u0000\u056d\u00af"+
		"\u0001\u0000\u0000\u0000\u056e\u056f\u0003\u00c4b\u0000\u056f\u0570\u0005"+
		"F\u0000\u0000\u0570\u00b1\u0001\u0000\u0000\u0000\u0571\u0572\u0005\\"+
		"\u0000\u0000\u0572\u0576\u0003\u00a0P\u0000\u0573\u0575\u0003\u00b4Z\u0000"+
		"\u0574\u0573\u0001\u0000\u0000\u0000\u0575\u0578\u0001\u0000\u0000\u0000"+
		"\u0576\u0574\u0001\u0000\u0000\u0000\u0576\u0577\u0001\u0000\u0000\u0000"+
		"\u0577\u00b3\u0001\u0000\u0000\u0000\u0578\u0576\u0001\u0000\u0000\u0000"+
		"\u0579\u057a\u0005]\u0000\u0000\u057a\u057b\u0003\u00be_\u0000\u057b\u057c"+
		"\u0003\u009cN\u0000\u057c\u0580\u0001\u0000\u0000\u0000\u057d\u057e\u0005"+
		"^\u0000\u0000\u057e\u0580\u0003\u009cN\u0000\u057f\u0579\u0001\u0000\u0000"+
		"\u0000\u057f\u057d\u0001\u0000\u0000\u0000\u0580\u00b5\u0001\u0000\u0000"+
		"\u0000\u0581\u0582\u0005&\u0000\u0000\u0582\u0583\u0003\u00c4b\u0000\u0583"+
		"\u0585\u0005\u0017\u0000\u0000\u0584\u0586\u0003\u00acV\u0000\u0585\u0584"+
		"\u0001\u0000\u0000\u0000\u0585\u0586\u0001\u0000\u0000\u0000\u0586\u0587"+
		"\u0001\u0000\u0000\u0000\u0587\u0589\u0005\u0018\u0000\u0000\u0588\u058a"+
		"\u0003\u00b8\\\u0000\u0589\u0588\u0001\u0000\u0000\u0000\u0589\u058a\u0001"+
		"\u0000\u0000\u0000\u058a\u058b\u0001\u0000\u0000\u0000\u058b\u058c\u0003"+
		"\u009cN\u0000\u058c\u00b7\u0001\u0000\u0000\u0000\u058d\u058e\u0005_\u0000"+
		"\u0000\u058e\u058f\u0003\u00acV\u0000\u058f\u00b9\u0001\u0000\u0000\u0000"+
		"\u0590\u0593\u0005\u001b\u0000\u0000\u0591\u0594\u0003\u009cN\u0000\u0592"+
		"\u0594\u0003\u00a0P\u0000\u0593\u0591\u0001\u0000\u0000\u0000\u0593\u0592"+
		"\u0001\u0000\u0000\u0000\u0594\u0595\u0001\u0000\u0000\u0000\u0595\u0598"+
		"\u0003\u00a0P\u0000\u0596\u0599\u0003\u009cN\u0000\u0597\u0599\u0003\u00a0"+
		"P\u0000\u0598\u0596\u0001\u0000\u0000\u0000\u0598\u0597\u0001\u0000\u0000"+
		"\u0000\u0599\u059a\u0001\u0000\u0000\u0000\u059a\u059b\u0003\u009cN\u0000"+
		"\u059b\u00bb\u0001\u0000\u0000\u0000\u059c\u059d\u00053\u0000\u0000\u059d"+
		"\u059e\u0003\u00a0P\u0000\u059e\u059f\u0003\u009cN\u0000\u059f\u00bd\u0001"+
		"\u0000\u0000\u0000\u05a0\u05a6\u0003\u00c8d\u0000\u05a1\u05a6\u0005h\u0000"+
		"\u0000\u05a2\u05a6\u0005i\u0000\u0000\u05a3\u05a6\u0003\u00c6c\u0000\u05a4"+
		"\u05a6\u0005g\u0000\u0000\u05a5\u05a0\u0001\u0000\u0000\u0000\u05a5\u05a1"+
		"\u0001\u0000\u0000\u0000\u05a5\u05a2\u0001\u0000\u0000\u0000\u05a5\u05a3"+
		"\u0001\u0000\u0000\u0000\u05a5\u05a4\u0001\u0000\u0000\u0000\u05a6\u00bf"+
		"\u0001\u0000\u0000\u0000\u05a7\u05a8\u0005\u0017\u0000\u0000\u05a8\u05aa"+
		"\u0006`\uffff\uffff\u0000\u05a9\u05ab\u0003\u008eG\u0000\u05aa\u05a9\u0001"+
		"\u0000\u0000\u0000\u05aa\u05ab\u0001\u0000\u0000\u0000\u05ab\u05ac\u0001"+
		"\u0000\u0000\u0000\u05ac\u05b4\u0006`\uffff\uffff\u0000\u05ad\u05af\u0005"+
		"\u0010\u0000\u0000\u05ae\u05b0\u0003\u008eG\u0000\u05af\u05ae\u0001\u0000"+
		"\u0000\u0000\u05af\u05b0\u0001\u0000\u0000\u0000\u05b0\u05b1\u0001\u0000"+
		"\u0000\u0000\u05b1\u05b3\u0006`\uffff\uffff\u0000\u05b2\u05ad\u0001\u0000"+
		"\u0000\u0000\u05b3\u05b6\u0001\u0000\u0000\u0000\u05b4\u05b2\u0001\u0000"+
		"\u0000\u0000\u05b4\u05b5\u0001\u0000\u0000\u0000\u05b5\u05b7\u0001\u0000"+
		"\u0000\u0000\u05b6\u05b4\u0001\u0000\u0000\u0000\u05b7\u05c9\u0005\u0018"+
		"\u0000\u0000\u05b8\u05b9\u0005*\u0000\u0000\u05b9\u05c5\u0006`\uffff\uffff"+
		"\u0000\u05ba\u05bb\u0003\u008eG\u0000\u05bb\u05c2\u0006`\uffff\uffff\u0000"+
		"\u05bc\u05bd\u0005\u0010\u0000\u0000\u05bd\u05be\u0003\u008eG\u0000\u05be"+
		"\u05bf\u0006`\uffff\uffff\u0000\u05bf\u05c1\u0001\u0000\u0000\u0000\u05c0"+
		"\u05bc\u0001\u0000\u0000\u0000\u05c1\u05c4\u0001\u0000\u0000\u0000\u05c2"+
		"\u05c0\u0001\u0000\u0000\u0000\u05c2\u05c3\u0001\u0000\u0000\u0000\u05c3"+
		"\u05c6\u0001\u0000\u0000\u0000\u05c4\u05c2\u0001\u0000\u0000\u0000\u05c5"+
		"\u05ba\u0001\u0000\u0000\u0000\u05c5\u05c6\u0001\u0000\u0000\u0000\u05c6"+
		"\u05c7\u0001\u0000\u0000\u0000\u05c7\u05c9\u0005+\u0000\u0000\u05c8\u05a7"+
		"\u0001\u0000\u0000\u0000\u05c8\u05b8\u0001\u0000\u0000\u0000\u05c9\u00c1"+
		"\u0001\u0000\u0000\u0000\u05ca\u05cc\u0007\u000e\u0000\u0000\u05cb\u05cd"+
		"\u0005j\u0000\u0000\u05cc\u05cb\u0001\u0000\u0000\u0000\u05cc\u05cd\u0001"+
		"\u0000\u0000\u0000\u05cd\u05ce\u0001\u0000\u0000\u0000\u05ce\u05cf\u0006"+
		"a\uffff\uffff\u0000\u05cf\u00c3\u0001\u0000\u0000\u0000\u05d0\u05d1\u0007"+
		"\u000f\u0000\u0000\u05d1\u05d2\u0006b\uffff\uffff\u0000\u05d2\u00c5\u0001"+
		"\u0000\u0000\u0000\u05d3\u05d5\u0005k\u0000\u0000\u05d4\u05d3\u0001\u0000"+
		"\u0000\u0000\u05d5\u05d6\u0001\u0000\u0000\u0000\u05d6\u05d4\u0001\u0000"+
		"\u0000\u0000\u05d6\u05d7\u0001\u0000\u0000\u0000\u05d7\u05d8\u0001\u0000"+
		"\u0000\u0000\u05d8\u05d9\u0006c\uffff\uffff\u0000\u05d9\u00c7\u0001\u0000"+
		"\u0000\u0000\u05da\u05dc\u0005\u0082\u0000\u0000\u05db\u05da\u0001\u0000"+
		"\u0000\u0000\u05dc\u05dd\u0001\u0000\u0000\u0000\u05dd\u05db\u0001\u0000"+
		"\u0000\u0000\u05dd\u05de\u0001\u0000\u0000\u0000\u05de\u05df\u0001\u0000"+
		"\u0000\u0000\u05df\u05e0\u0006d\uffff\uffff\u0000\u05e0\u00c9\u0001\u0000"+
		"\u0000\u0000\u05e1\u05e2\u0006e\uffff\uffff\u0000\u05e2\u05f1\u0005a\u0000"+
		"\u0000\u05e3\u05e4\u0005\u0017\u0000\u0000\u05e4\u05e5\u0003P(\u0000\u05e5"+
		"\u05ec\u0006e\uffff\uffff\u0000\u05e6\u05e7\u0005\u0010\u0000\u0000\u05e7"+
		"\u05e8\u0003P(\u0000\u05e8\u05e9\u0006e\uffff\uffff\u0000\u05e9\u05eb"+
		"\u0001\u0000\u0000\u0000\u05ea\u05e6\u0001\u0000\u0000\u0000\u05eb\u05ee"+
		"\u0001\u0000\u0000\u0000\u05ec\u05ea\u0001\u0000\u0000\u0000\u05ec\u05ed"+
		"\u0001\u0000\u0000\u0000\u05ed\u05ef\u0001\u0000\u0000\u0000\u05ee\u05ec"+
		"\u0001\u0000\u0000\u0000\u05ef\u05f0\u0005\u0018\u0000\u0000\u05f0\u05f2"+
		"\u0001\u0000\u0000\u0000\u05f1\u05e3\u0001\u0000\u0000\u0000\u05f1\u05f2"+
		"\u0001\u0000\u0000\u0000\u05f2\u00cb\u0001\u0000\u0000\u0000\u0085\u00e8"+
		"\u00ea\u00f9\u00fd\u0102\u0108\u010c\u010f\u0114\u011c\u0124\u0135\u013e"+
		"\u0144\u0149\u0157\u015a\u0162\u016d\u0170\u0189\u0192\u0194\u019d\u01be"+
		"\u01c1\u01d3\u01d8\u01e0\u01f2\u01f5\u01ff\u0206\u0208\u020f\u0218\u021b"+
		"\u0224\u022a\u0231\u0239\u024d\u024f\u0251\u0258\u0264\u026d\u027c\u027f"+
		"\u0285\u0289\u0293\u0296\u029c\u029f\u02ab\u02ae\u02b4\u02ba\u02cf\u02d4"+
		"\u02da\u02e6\u02f1\u02f7\u02fc\u0310\u0312\u0319\u0328\u0352\u0362\u0367"+
		"\u036d\u0371\u0374\u0385\u0391\u0397\u039c\u03a4\u03aa\u03c6\u03e5\u03eb"+
		"\u03f3\u03f8\u03fe\u0405\u040a\u0410\u0429\u0454\u049e\u04aa\u04ae\u04c3"+
		"\u04c5\u04e0\u04eb\u04f7\u04fb\u0506\u050c\u050e\u051a\u0530\u0535\u053f"+
		"\u0543\u0549\u054d\u0553\u0560\u0567\u0576\u057f\u0585\u0589\u0593\u0598"+
		"\u05a5\u05aa\u05af\u05b4\u05c2\u05c5\u05c8\u05cc\u05d6\u05dd\u05ec\u05f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}