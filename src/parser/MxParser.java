// Generated from .\Mx.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL_CONST=1, INT_CONST=2, STRING_CONST=3, NULL_CONST=4, INT=5, BOOL=6, 
		STRING=7, NULL=8, VOID=9, IF=10, ELSE=11, FOR=12, WHILE=13, BREAK=14, 
		CONTINUE=15, RETURN=16, NEW=17, CLASS=18, THIS=19, TRUE=20, FALSE=21, 
		IDENTIFIER=22, WHITE=23, Newline=24, BLOCKCOMMENT=25, LINECOMMENT=26, 
		ADD_OP=27, MINUS_OP=28, MULTI_OP=29, DIV_OP=30, MOD_OP=31, XIAOYU_OP=32, 
		DAYU_OP=33, XIAOYUDENGYU_OP=34, DAYUDENGYU_OP=35, NOT_EQUAL_OP=36, EQUAL_OP=37, 
		LOGIC_AND_OP=38, LOGIC_OR_OP=39, LOGIC_NOT_OP=40, LEFT_SHIFT_OP=41, RIGHT_SHIFT_OP=42, 
		AND_OP=43, OR_OP=44, XOR_OP=45, NOT_OP=46, ASSIGN=47, ZIZENG_OP=48, ZIJIAN_OP=49, 
		DOT=50, LEFT_PAREN=51, RIGHT_PAREN=52, LEFT_BRACKET=53, RIGHT_BRACKET=54, 
		LEFT_BIGBRACE=55, RIGHT_BIGBRACE=56, COMMA=57, COLON=58, SEMICOLON=59;
	public static final int
		RULE_program = 0, RULE_program_part = 1, RULE_class_def = 2, RULE_func_def = 3, 
		RULE_param = 4, RULE_paramlist = 5, RULE_type = 6, RULE_var_multi_def = 7, 
		RULE_var_def_and_init = 8, RULE_var_def = 9, RULE_var_malloc = 10, RULE_statement = 11, 
		RULE_expression = 12, RULE_expression_list = 13, RULE_constant = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "program_part", "class_def", "func_def", "param", "paramlist", 
			"type", "var_multi_def", "var_def_and_init", "var_def", "var_malloc", 
			"statement", "expression", "expression_list", "constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'int'", "'bool'", "'string'", "'null'", 
			"'void'", "'if'", "'else'", "'for'", "'while'", "'break'", "'continue'", 
			"'return'", "'new'", "'class'", "'this'", "'true'", "'false'", null, 
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", 
			"'<='", "'>='", "'!='", "'=='", "'&&'", "'||'", "'!'", "'<<'", "'>>'", 
			"'&'", "'|'", "'^'", "'~'", "'='", "'++'", "'--'", "'.'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "','", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL_CONST", "INT_CONST", "STRING_CONST", "NULL_CONST", "INT", 
			"BOOL", "STRING", "NULL", "VOID", "IF", "ELSE", "FOR", "WHILE", "BREAK", 
			"CONTINUE", "RETURN", "NEW", "CLASS", "THIS", "TRUE", "FALSE", "IDENTIFIER", 
			"WHITE", "Newline", "BLOCKCOMMENT", "LINECOMMENT", "ADD_OP", "MINUS_OP", 
			"MULTI_OP", "DIV_OP", "MOD_OP", "XIAOYU_OP", "DAYU_OP", "XIAOYUDENGYU_OP", 
			"DAYUDENGYU_OP", "NOT_EQUAL_OP", "EQUAL_OP", "LOGIC_AND_OP", "LOGIC_OR_OP", 
			"LOGIC_NOT_OP", "LEFT_SHIFT_OP", "RIGHT_SHIFT_OP", "AND_OP", "OR_OP", 
			"XOR_OP", "NOT_OP", "ASSIGN", "ZIZENG_OP", "ZIJIAN_OP", "DOT", "LEFT_PAREN", 
			"RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_BIGBRACE", "RIGHT_BIGBRACE", 
			"COMMA", "COLON", "SEMICOLON"
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
	public String getGrammarFileName() { return "Mx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MxParser.EOF, 0); }
		public List<Program_partContext> program_part() {
			return getRuleContexts(Program_partContext.class);
		}
		public Program_partContext program_part(int i) {
			return getRuleContext(Program_partContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << CLASS) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(30);
				program_part();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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

	public static class Program_partContext extends ParserRuleContext {
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public Program_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterProgram_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitProgram_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitProgram_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Program_partContext program_part() throws RecognitionException {
		Program_partContext _localctx = new Program_partContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program_part);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				class_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				func_def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				var_def();
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MxParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_BIGBRACE() { return getToken(MxParser.LEFT_BIGBRACE, 0); }
		public TerminalNode RIGHT_BIGBRACE() { return getToken(MxParser.RIGHT_BIGBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(MxParser.SEMICOLON, 0); }
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitClass_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(CLASS);
			setState(44);
			match(IDENTIFIER);
			setState(45);
			match(LEFT_BIGBRACE);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(46);
					var_def();
					}
					break;
				case 2:
					{
					setState(47);
					func_def();
					}
					break;
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(RIGHT_BIGBRACE);
			setState(54);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(MxParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(MxParser.RIGHT_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(56);
				type(0);
				}
				break;
			}
			setState(59);
			match(IDENTIFIER);
			setState(60);
			match(LEFT_PAREN);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(61);
				paramlist();
				}
			}

			setState(64);
			match(RIGHT_PAREN);
			setState(65);
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

	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			type(0);
			setState(68);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamlistContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MxParser.COMMA, i);
		}
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterParamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitParamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitParamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			param();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(71);
				match(COMMA);
				setState(72);
				param();
				}
				}
				setState(77);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public TerminalNode INT() { return getToken(MxParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(MxParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(MxParser.STRING, 0); }
		public TerminalNode VOID() { return getToken(MxParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(MxParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(MxParser.RIGHT_BRACKET, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitType(this);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(79);
				match(IDENTIFIER);
				}
				break;
			case INT:
				{
				setState(80);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(81);
				match(BOOL);
				}
				break;
			case STRING:
				{
				setState(82);
				match(STRING);
				}
				break;
			case VOID:
				{
				setState(83);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(86);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(87);
					match(LEFT_BRACKET);
					setState(88);
					match(RIGHT_BRACKET);
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Var_multi_defContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(MxParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MxParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MxParser.COMMA, i);
		}
		public Var_multi_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_multi_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVar_multi_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVar_multi_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVar_multi_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_multi_defContext var_multi_def() throws RecognitionException {
		Var_multi_defContext _localctx = new Var_multi_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_multi_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			type(0);
			setState(95);
			match(IDENTIFIER);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(96);
				match(COMMA);
				setState(97);
				match(IDENTIFIER);
				}
				}
				setState(102);
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

	public static class Var_def_and_initContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(MxParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_def_and_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def_and_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVar_def_and_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVar_def_and_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVar_def_and_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_def_and_initContext var_def_and_init() throws RecognitionException {
		Var_def_and_initContext _localctx = new Var_def_and_initContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_def_and_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			type(0);
			setState(104);
			match(IDENTIFIER);
			setState(105);
			match(ASSIGN);
			setState(106);
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

	public static class Var_defContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(MxParser.SEMICOLON, 0); }
		public Var_multi_defContext var_multi_def() {
			return getRuleContext(Var_multi_defContext.class,0);
		}
		public Var_def_and_initContext var_def_and_init() {
			return getRuleContext(Var_def_and_initContext.class,0);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(108);
				var_multi_def();
				}
				break;
			case 2:
				{
				setState(109);
				var_def_and_init();
				}
				break;
			}
			setState(112);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_mallocContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> LEFT_BRACKET() { return getTokens(MxParser.LEFT_BRACKET); }
		public TerminalNode LEFT_BRACKET(int i) {
			return getToken(MxParser.LEFT_BRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RIGHT_BRACKET() { return getTokens(MxParser.RIGHT_BRACKET); }
		public TerminalNode RIGHT_BRACKET(int i) {
			return getToken(MxParser.RIGHT_BRACKET, i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(MxParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(MxParser.RIGHT_PAREN, 0); }
		public Var_mallocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_malloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVar_malloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVar_malloc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVar_malloc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_mallocContext var_malloc() throws RecognitionException {
		Var_mallocContext _localctx = new Var_mallocContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_malloc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			type(0);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					match(LEFT_BRACKET);
					setState(116);
					expression(0);
					setState(117);
					match(RIGHT_BRACKET);
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					match(LEFT_BRACKET);
					setState(125);
					match(RIGHT_BRACKET);
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(131);
				match(LEFT_PAREN);
				setState(132);
				match(RIGHT_PAREN);
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
	public static class BreakStatementContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(MxParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(MxParser.SEMICOLON, 0); }
		public BreakStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public TerminalNode IF() { return getToken(MxParser.IF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(MxParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(MxParser.RIGHT_PAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MxParser.ELSE, 0); }
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VardefStatementContext extends StatementContext {
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public VardefStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVardefStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVardefStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVardefStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(MxParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MxParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MxParser.SEMICOLON, 0); }
		public ExprStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyStatememtContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(MxParser.SEMICOLON, 0); }
		public EmptyStatememtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterEmptyStatememt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitEmptyStatememt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitEmptyStatememt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementsContext extends StatementContext {
		public TerminalNode LEFT_BIGBRACE() { return getToken(MxParser.LEFT_BIGBRACE, 0); }
		public TerminalNode RIGHT_BIGBRACE() { return getToken(MxParser.RIGHT_BIGBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatementContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(MxParser.WHILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(MxParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(MxParser.RIGHT_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends StatementContext {
		public TerminalNode FOR() { return getToken(MxParser.FOR, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(MxParser.LEFT_PAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(MxParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MxParser.SEMICOLON, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(MxParser.RIGHT_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStatementContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(MxParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(MxParser.SEMICOLON, 0); }
		public ContinueStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new VardefStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				var_def();
				}
				break;
			case 2:
				_localctx = new StatementsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(LEFT_BIGBRACE);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << STRING_CONST) | (1L << NULL_CONST) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << NEW) | (1L << THIS) | (1L << IDENTIFIER) | (1L << ADD_OP) | (1L << MINUS_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << LEFT_PAREN) | (1L << LEFT_BIGBRACE) | (1L << SEMICOLON))) != 0)) {
					{
					{
					setState(137);
					statement();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(RIGHT_BIGBRACE);
				}
				break;
			case 3:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(IF);
				setState(145);
				match(LEFT_PAREN);
				setState(146);
				expression(0);
				setState(147);
				match(RIGHT_PAREN);
				setState(148);
				statement();
				setState(151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(149);
					match(ELSE);
					setState(150);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(FOR);
				setState(154);
				match(LEFT_PAREN);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << STRING_CONST) | (1L << NULL_CONST) | (1L << NEW) | (1L << THIS) | (1L << IDENTIFIER) | (1L << ADD_OP) | (1L << MINUS_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << LEFT_PAREN))) != 0)) {
					{
					setState(155);
					expression(0);
					}
				}

				setState(158);
				match(SEMICOLON);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << STRING_CONST) | (1L << NULL_CONST) | (1L << NEW) | (1L << THIS) | (1L << IDENTIFIER) | (1L << ADD_OP) | (1L << MINUS_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << LEFT_PAREN))) != 0)) {
					{
					setState(159);
					expression(0);
					}
				}

				setState(162);
				match(SEMICOLON);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << STRING_CONST) | (1L << NULL_CONST) | (1L << NEW) | (1L << THIS) | (1L << IDENTIFIER) | (1L << ADD_OP) | (1L << MINUS_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << LEFT_PAREN))) != 0)) {
					{
					setState(163);
					expression(0);
					}
				}

				setState(166);
				match(RIGHT_PAREN);
				setState(167);
				statement();
				}
				break;
			case 5:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				match(WHILE);
				setState(169);
				match(LEFT_PAREN);
				setState(170);
				expression(0);
				setState(171);
				match(RIGHT_PAREN);
				setState(172);
				statement();
				}
				break;
			case 6:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				match(RETURN);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << STRING_CONST) | (1L << NULL_CONST) | (1L << NEW) | (1L << THIS) | (1L << IDENTIFIER) | (1L << ADD_OP) | (1L << MINUS_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << LEFT_PAREN))) != 0)) {
					{
					setState(175);
					expression(0);
					}
				}

				setState(178);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				match(BREAK);
				setState(180);
				match(SEMICOLON);
				}
				break;
			case 8:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(181);
				match(CONTINUE);
				setState(182);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(183);
				expression(0);
				setState(184);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new EmptyStatememtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(186);
				match(SEMICOLON);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubContext extends ExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(MxParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(MxParser.RIGHT_PAREN, 0); }
		public SubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(MxParser.NEW, 0); }
		public Var_mallocContext var_malloc() {
			return getRuleContext(Var_mallocContext.class,0);
		}
		public NewContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryPreContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ADD_OP() { return getToken(MxParser.ADD_OP, 0); }
		public TerminalNode MINUS_OP() { return getToken(MxParser.MINUS_OP, 0); }
		public TerminalNode ZIZENG_OP() { return getToken(MxParser.ZIZENG_OP, 0); }
		public TerminalNode ZIJIAN_OP() { return getToken(MxParser.ZIJIAN_OP, 0); }
		public TerminalNode NOT_OP() { return getToken(MxParser.NOT_OP, 0); }
		public TerminalNode LOGIC_NOT_OP() { return getToken(MxParser.LOGIC_NOT_OP, 0); }
		public UnaryPreContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterUnaryPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitUnaryPre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitUnaryPre(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryPosContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ZIZENG_OP() { return getToken(MxParser.ZIZENG_OP, 0); }
		public TerminalNode ZIJIAN_OP() { return getToken(MxParser.ZIJIAN_OP, 0); }
		public UnaryPosContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterUnaryPos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitUnaryPos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitUnaryPos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExprContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public IdentifierExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitIdentifierExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(MxParser.THIS, 0); }
		public ThisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitThis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(MxParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(MxParser.RIGHT_BRACKET, 0); }
		public IndexContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(MxParser.ASSIGN, 0); }
		public TerminalNode ADD_OP() { return getToken(MxParser.ADD_OP, 0); }
		public TerminalNode MINUS_OP() { return getToken(MxParser.MINUS_OP, 0); }
		public TerminalNode MULTI_OP() { return getToken(MxParser.MULTI_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(MxParser.DIV_OP, 0); }
		public TerminalNode MOD_OP() { return getToken(MxParser.MOD_OP, 0); }
		public TerminalNode LEFT_SHIFT_OP() { return getToken(MxParser.LEFT_SHIFT_OP, 0); }
		public TerminalNode RIGHT_SHIFT_OP() { return getToken(MxParser.RIGHT_SHIFT_OP, 0); }
		public TerminalNode XIAOYU_OP() { return getToken(MxParser.XIAOYU_OP, 0); }
		public TerminalNode XIAOYUDENGYU_OP() { return getToken(MxParser.XIAOYUDENGYU_OP, 0); }
		public TerminalNode DAYU_OP() { return getToken(MxParser.DAYU_OP, 0); }
		public TerminalNode DAYUDENGYU_OP() { return getToken(MxParser.DAYUDENGYU_OP, 0); }
		public TerminalNode EQUAL_OP() { return getToken(MxParser.EQUAL_OP, 0); }
		public TerminalNode NOT_EQUAL_OP() { return getToken(MxParser.NOT_EQUAL_OP, 0); }
		public TerminalNode AND_OP() { return getToken(MxParser.AND_OP, 0); }
		public TerminalNode OR_OP() { return getToken(MxParser.OR_OP, 0); }
		public TerminalNode XOR_OP() { return getToken(MxParser.XOR_OP, 0); }
		public TerminalNode LOGIC_AND_OP() { return getToken(MxParser.LOGIC_AND_OP, 0); }
		public TerminalNode LOGIC_OR_OP() { return getToken(MxParser.LOGIC_OR_OP, 0); }
		public BinaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MxParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public MemberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionParamContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(MxParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(MxParser.RIGHT_PAREN, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public FunctionParamContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterFunctionParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitFunctionParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFunctionParam(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				_localctx = new SubContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(190);
				match(LEFT_PAREN);
				setState(191);
				expression(0);
				setState(192);
				match(RIGHT_PAREN);
				}
				break;
			case ADD_OP:
			case MINUS_OP:
			case LOGIC_NOT_OP:
			case NOT_OP:
			case ZIZENG_OP:
			case ZIJIAN_OP:
				{
				_localctx = new UnaryPreContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_OP) | (1L << MINUS_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(195);
				expression(5);
				}
				break;
			case NEW:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(NEW);
				setState(197);
				var_malloc();
				}
				break;
			case BOOL_CONST:
			case INT_CONST:
			case STRING_CONST:
			case NULL_CONST:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				constant();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(IDENTIFIER);
				}
				break;
			case THIS:
				{
				_localctx = new ThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				match(THIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(225);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(204);
						match(ASSIGN);
						setState(205);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(207);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_OP) | (1L << MINUS_OP) | (1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << XIAOYU_OP) | (1L << DAYU_OP) | (1L << XIAOYUDENGYU_OP) | (1L << DAYUDENGYU_OP) | (1L << NOT_EQUAL_OP) | (1L << EQUAL_OP) | (1L << LOGIC_AND_OP) | (1L << LOGIC_OR_OP) | (1L << LEFT_SHIFT_OP) | (1L << RIGHT_SHIFT_OP) | (1L << AND_OP) | (1L << OR_OP) | (1L << XOR_OP))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(208);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new MemberContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(209);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(210);
						match(DOT);
						setState(211);
						match(IDENTIFIER);
						}
						break;
					case 4:
						{
						_localctx = new IndexContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(212);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(213);
						match(LEFT_BRACKET);
						setState(214);
						expression(0);
						setState(215);
						match(RIGHT_BRACKET);
						}
						break;
					case 5:
						{
						_localctx = new FunctionParamContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(218);
						match(LEFT_PAREN);
						setState(220);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << STRING_CONST) | (1L << NULL_CONST) | (1L << NEW) | (1L << THIS) | (1L << IDENTIFIER) | (1L << ADD_OP) | (1L << MINUS_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << LEFT_PAREN))) != 0)) {
							{
							setState(219);
							expression_list();
							}
						}

						setState(222);
						match(RIGHT_PAREN);
						}
						break;
					case 6:
						{
						_localctx = new UnaryPosContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(224);
						_la = _input.LA(1);
						if ( !(_la==ZIZENG_OP || _la==ZIJIAN_OP) ) {
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
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MxParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			expression(0);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(231);
				match(COMMA);
				setState(232);
				expression(0);
				}
				}
				setState(237);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode BOOL_CONST() { return getToken(MxParser.BOOL_CONST, 0); }
		public TerminalNode INT_CONST() { return getToken(MxParser.INT_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(MxParser.STRING_CONST, 0); }
		public TerminalNode NULL_CONST() { return getToken(MxParser.NULL_CONST, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << STRING_CONST) | (1L << NULL_CONST))) != 0)) ) {
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
		case 6:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u00f3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\3\2\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\7\4\63\n\4\f"+
		"\4\16\4\66\13\4\3\4\3\4\3\4\3\5\5\5<\n\5\3\5\3\5\3\5\5\5A\n\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bW\n\b\3\b\3\b\3\b\7\b\\\n\b\f\b\16\b_\13\b\3\t\3\t\3\t\3\t\7"+
		"\te\n\t\f\t\16\th\13\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13q\n\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\7\fz\n\f\f\f\16\f}\13\f\3\f\3\f\7\f\u0081\n\f"+
		"\f\f\16\f\u0084\13\f\3\f\3\f\5\f\u0088\n\f\3\r\3\r\3\r\7\r\u008d\n\r\f"+
		"\r\16\r\u0090\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009a\n\r\3\r\3"+
		"\r\3\r\5\r\u009f\n\r\3\r\3\r\5\r\u00a3\n\r\3\r\3\r\5\r\u00a7\n\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b3\n\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00be\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00cc\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00df\n\16\3\16"+
		"\3\16\3\16\7\16\u00e4\n\16\f\16\16\16\u00e7\13\16\3\17\3\17\3\17\7\17"+
		"\u00ec\n\17\f\17\16\17\u00ef\13\17\3\20\3\20\3\20\2\4\16\32\21\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36\2\6\6\2\35\36**\60\60\62\63\4\2\35)+/"+
		"\3\2\62\63\3\2\3\6\2\u0111\2#\3\2\2\2\4+\3\2\2\2\6-\3\2\2\2\b;\3\2\2\2"+
		"\nE\3\2\2\2\fH\3\2\2\2\16V\3\2\2\2\20`\3\2\2\2\22i\3\2\2\2\24p\3\2\2\2"+
		"\26t\3\2\2\2\30\u00bd\3\2\2\2\32\u00cb\3\2\2\2\34\u00e8\3\2\2\2\36\u00f0"+
		"\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2"+
		"%#\3\2\2\2&\'\7\2\2\3\'\3\3\2\2\2(,\5\6\4\2),\5\b\5\2*,\5\24\13\2+(\3"+
		"\2\2\2+)\3\2\2\2+*\3\2\2\2,\5\3\2\2\2-.\7\24\2\2./\7\30\2\2/\64\79\2\2"+
		"\60\63\5\24\13\2\61\63\5\b\5\2\62\60\3\2\2\2\62\61\3\2\2\2\63\66\3\2\2"+
		"\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7:\2\2"+
		"89\7=\2\29\7\3\2\2\2:<\5\16\b\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\30\2"+
		"\2>@\7\65\2\2?A\5\f\7\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\66\2\2CD\5\30"+
		"\r\2D\t\3\2\2\2EF\5\16\b\2FG\7\30\2\2G\13\3\2\2\2HM\5\n\6\2IJ\7;\2\2J"+
		"L\5\n\6\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\r\3\2\2\2OM\3\2\2\2"+
		"PQ\b\b\1\2QW\7\30\2\2RW\7\7\2\2SW\7\b\2\2TW\7\t\2\2UW\7\13\2\2VP\3\2\2"+
		"\2VR\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W]\3\2\2\2XY\f\b\2\2YZ\7\67"+
		"\2\2Z\\\78\2\2[X\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\17\3\2\2\2_]"+
		"\3\2\2\2`a\5\16\b\2af\7\30\2\2bc\7;\2\2ce\7\30\2\2db\3\2\2\2eh\3\2\2\2"+
		"fd\3\2\2\2fg\3\2\2\2g\21\3\2\2\2hf\3\2\2\2ij\5\16\b\2jk\7\30\2\2kl\7\61"+
		"\2\2lm\5\32\16\2m\23\3\2\2\2nq\5\20\t\2oq\5\22\n\2pn\3\2\2\2po\3\2\2\2"+
		"qr\3\2\2\2rs\7=\2\2s\25\3\2\2\2t{\5\16\b\2uv\7\67\2\2vw\5\32\16\2wx\7"+
		"8\2\2xz\3\2\2\2yu\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0082\3\2\2\2"+
		"}{\3\2\2\2~\177\7\67\2\2\177\u0081\78\2\2\u0080~\3\2\2\2\u0081\u0084\3"+
		"\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0087\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0086\7\65\2\2\u0086\u0088\7\66\2\2\u0087\u0085\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\27\3\2\2\2\u0089\u00be\5\24\13\2\u008a"+
		"\u008e\79\2\2\u008b\u008d\5\30\r\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u00be\7:\2\2\u0092\u0093\7\f\2\2\u0093\u0094\7\65"+
		"\2\2\u0094\u0095\5\32\16\2\u0095\u0096\7\66\2\2\u0096\u0099\5\30\r\2\u0097"+
		"\u0098\7\r\2\2\u0098\u009a\5\30\r\2\u0099\u0097\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\u00be\3\2\2\2\u009b\u009c\7\16\2\2\u009c\u009e\7\65\2\2\u009d"+
		"\u009f\5\32\16\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3"+
		"\2\2\2\u00a0\u00a2\7=\2\2\u00a1\u00a3\5\32\16\2\u00a2\u00a1\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\7=\2\2\u00a5\u00a7\5\32"+
		"\16\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\7\66\2\2\u00a9\u00be\5\30\r\2\u00aa\u00ab\7\17\2\2\u00ab\u00ac"+
		"\7\65\2\2\u00ac\u00ad\5\32\16\2\u00ad\u00ae\7\66\2\2\u00ae\u00af\5\30"+
		"\r\2\u00af\u00be\3\2\2\2\u00b0\u00b2\7\22\2\2\u00b1\u00b3\5\32\16\2\u00b2"+
		"\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00be\7="+
		"\2\2\u00b5\u00b6\7\20\2\2\u00b6\u00be\7=\2\2\u00b7\u00b8\7\21\2\2\u00b8"+
		"\u00be\7=\2\2\u00b9\u00ba\5\32\16\2\u00ba\u00bb\7=\2\2\u00bb\u00be\3\2"+
		"\2\2\u00bc\u00be\7=\2\2\u00bd\u0089\3\2\2\2\u00bd\u008a\3\2\2\2\u00bd"+
		"\u0092\3\2\2\2\u00bd\u009b\3\2\2\2\u00bd\u00aa\3\2\2\2\u00bd\u00b0\3\2"+
		"\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\31\3\2\2\2\u00bf\u00c0\b\16\1\2\u00c0\u00c1\7\65"+
		"\2\2\u00c1\u00c2\5\32\16\2\u00c2\u00c3\7\66\2\2\u00c3\u00cc\3\2\2\2\u00c4"+
		"\u00c5\t\2\2\2\u00c5\u00cc\5\32\16\7\u00c6\u00c7\7\23\2\2\u00c7\u00cc"+
		"\5\26\f\2\u00c8\u00cc\5\36\20\2\u00c9\u00cc\7\30\2\2\u00ca\u00cc\7\25"+
		"\2\2\u00cb\u00bf\3\2\2\2\u00cb\u00c4\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb"+
		"\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00e5\3\2"+
		"\2\2\u00cd\u00ce\f\16\2\2\u00ce\u00cf\7\61\2\2\u00cf\u00e4\5\32\16\17"+
		"\u00d0\u00d1\f\r\2\2\u00d1\u00d2\t\3\2\2\u00d2\u00e4\5\32\16\16\u00d3"+
		"\u00d4\f\13\2\2\u00d4\u00d5\7\64\2\2\u00d5\u00e4\7\30\2\2\u00d6\u00d7"+
		"\f\n\2\2\u00d7\u00d8\7\67\2\2\u00d8\u00d9\5\32\16\2\u00d9\u00da\78\2\2"+
		"\u00da\u00e4\3\2\2\2\u00db\u00dc\f\t\2\2\u00dc\u00de\7\65\2\2\u00dd\u00df"+
		"\5\34\17\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2"+
		"\u00e0\u00e4\7\66\2\2\u00e1\u00e2\f\b\2\2\u00e2\u00e4\t\4\2\2\u00e3\u00cd"+
		"\3\2\2\2\u00e3\u00d0\3\2\2\2\u00e3\u00d3\3\2\2\2\u00e3\u00d6\3\2\2\2\u00e3"+
		"\u00db\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\33\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ed"+
		"\5\32\16\2\u00e9\u00ea\7;\2\2\u00ea\u00ec\5\32\16\2\u00eb\u00e9\3\2\2"+
		"\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\35"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\t\5\2\2\u00f1\37\3\2\2\2\34#"+
		"+\62\64;@MV]fp{\u0082\u0087\u008e\u0099\u009e\u00a2\u00a6\u00b2\u00bd"+
		"\u00cb\u00de\u00e3\u00e5\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}