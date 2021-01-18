// Generated from .\Mx.g4 by ANTLR 4.8
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
		INT=1, BOOL=2, STRING=3, NULL=4, VOID=5, TRUE=6, FALSE=7, IF=8, ELSE=9, 
		FOR=10, WHILE=11, BREAK=12, CONTINUE=13, RETURN=14, NEW=15, CLASS=16, 
		THIS=17, ADD_OP=18, MINUS_OP=19, MULTI_OP=20, DIV_OP=21, MOD_OP=22, XIAOYU_OP=23, 
		DAYU_OP=24, XIAOYUDENGYU_OP=25, DAYUDENGYU_OP=26, NOT_EQUAL_OP=27, EQUAL_OP=28, 
		LOGIC_AND_OP=29, LOGIC_OR_OP=30, LOGIC_NOT_OP=31, LEFT_SHIFT_OP=32, RIGHT_SHIFT_OP=33, 
		AND_OP=34, OR_OP=35, XOR_OP=36, NOT_OP=37, ASSIGN=38, ZIZENG_OP=39, ZIJIAN_OP=40, 
		DOT=41, LEFT_PAREN=42, RIGHT_PAREN=43, LEFT_BRACKET=44, RIGHT_BRACKET=45, 
		LEFT_BIGBRACE=46, RIGHT_BIGBRACE=47, COMMA=48, COLON=49, SEMICOLON=50, 
		WHITE=51, LINECOMMENT=52, CONST=53, IDENTIFIER=54;
	public static final int
		RULE_expression_list = 0, RULE_expression = 1, RULE_var_multi_def = 2, 
		RULE_var_def_and_init = 3, RULE_var_def = 4, RULE_var_malloc = 5, RULE_statement = 6, 
		RULE_program = 7, RULE_program_part = 8, RULE_type = 9, RULE_class_def = 10, 
		RULE_param = 11, RULE_paramlist = 12, RULE_func_def = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression_list", "expression", "var_multi_def", "var_def_and_init", 
			"var_def", "var_malloc", "statement", "program", "program_part", "type", 
			"class_def", "param", "paramlist", "func_def"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'bool'", "'string'", "'null'", "'void'", "'true'", "'false'", 
			"'if'", "'else'", "'for'", "'while'", "'break'", "'continue'", "'return'", 
			"'new'", "'class'", "'this'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", 
			"'>'", "'<='", "'>='", "'!='", "'=='", "'&&'", "'||'", "'!'", "'<<'", 
			"'>>'", "'&'", "'|'", "'^'", "'~'", "'='", "'++'", "'--'", "'.'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "','", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "BOOL", "STRING", "NULL", "VOID", "TRUE", "FALSE", "IF", 
			"ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", "RETURN", "NEW", "CLASS", 
			"THIS", "ADD_OP", "MINUS_OP", "MULTI_OP", "DIV_OP", "MOD_OP", "XIAOYU_OP", 
			"DAYU_OP", "XIAOYUDENGYU_OP", "DAYUDENGYU_OP", "NOT_EQUAL_OP", "EQUAL_OP", 
			"LOGIC_AND_OP", "LOGIC_OR_OP", "LOGIC_NOT_OP", "LEFT_SHIFT_OP", "RIGHT_SHIFT_OP", 
			"AND_OP", "OR_OP", "XOR_OP", "NOT_OP", "ASSIGN", "ZIZENG_OP", "ZIJIAN_OP", 
			"DOT", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", 
			"LEFT_BIGBRACE", "RIGHT_BIGBRACE", "COMMA", "COLON", "SEMICOLON", "WHITE", 
			"LINECOMMENT", "CONST", "IDENTIFIER"
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
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			expression(0);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(29);
				match(COMMA);
				setState(30);
				expression(0);
				}
				}
				setState(35);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(MxParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public TerminalNode THIS() { return getToken(MxParser.THIS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD_OP() { return getToken(MxParser.ADD_OP, 0); }
		public TerminalNode MINUS_OP() { return getToken(MxParser.MINUS_OP, 0); }
		public TerminalNode ZIZENG_OP() { return getToken(MxParser.ZIZENG_OP, 0); }
		public TerminalNode ZIJIAN_OP() { return getToken(MxParser.ZIJIAN_OP, 0); }
		public TerminalNode NOT_OP() { return getToken(MxParser.NOT_OP, 0); }
		public TerminalNode MULTI_OP() { return getToken(MxParser.MULTI_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(MxParser.DIV_OP, 0); }
		public TerminalNode MOD_OP() { return getToken(MxParser.MOD_OP, 0); }
		public TerminalNode LOGIC_NOT_OP() { return getToken(MxParser.LOGIC_NOT_OP, 0); }
		public TerminalNode NEW() { return getToken(MxParser.NEW, 0); }
		public Var_mallocContext var_malloc() {
			return getRuleContext(Var_mallocContext.class,0);
		}
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
		public TerminalNode ASSIGN() { return getToken(MxParser.ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(MxParser.DOT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MxParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(MxParser.RIGHT_BRACKET, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(MxParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(MxParser.RIGHT_PAREN, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExpression(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(37);
				match(CONST);
				}
				break;
			case IDENTIFIER:
				{
				setState(38);
				match(IDENTIFIER);
				}
				break;
			case THIS:
				{
				setState(39);
				match(THIS);
				}
				break;
			case ADD_OP:
			case MINUS_OP:
			case NOT_OP:
			case ZIZENG_OP:
			case ZIJIAN_OP:
				{
				setState(40);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_OP) | (1L << MINUS_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(41);
				expression(5);
				}
				break;
			case MULTI_OP:
			case DIV_OP:
			case MOD_OP:
			case LOGIC_NOT_OP:
				{
				setState(42);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << LOGIC_NOT_OP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(43);
				expression(4);
				}
				break;
			case NEW:
				{
				setState(44);
				match(NEW);
				setState(45);
				var_malloc();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(70);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(48);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(49);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_OP) | (1L << MINUS_OP) | (1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << XIAOYU_OP) | (1L << DAYU_OP) | (1L << XIAOYUDENGYU_OP) | (1L << DAYUDENGYU_OP) | (1L << NOT_EQUAL_OP) | (1L << EQUAL_OP) | (1L << LOGIC_AND_OP) | (1L << LOGIC_OR_OP) | (1L << LEFT_SHIFT_OP) | (1L << RIGHT_SHIFT_OP) | (1L << AND_OP) | (1L << OR_OP) | (1L << XOR_OP))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(50);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(51);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(52);
						match(ASSIGN);
						setState(53);
						expression(2);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(54);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(55);
						match(DOT);
						setState(56);
						match(IDENTIFIER);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(57);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(58);
						match(LEFT_BRACKET);
						setState(59);
						expression(0);
						setState(60);
						match(RIGHT_BRACKET);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(62);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(63);
						match(LEFT_PAREN);
						setState(65);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << ADD_OP) | (1L << MINUS_OP) | (1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << CONST) | (1L << IDENTIFIER))) != 0)) {
							{
							setState(64);
							expression_list();
							}
						}

						setState(67);
						match(RIGHT_PAREN);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(69);
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
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	}

	public final Var_multi_defContext var_multi_def() throws RecognitionException {
		Var_multi_defContext _localctx = new Var_multi_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_multi_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			type(0);
			setState(76);
			match(IDENTIFIER);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(77);
				match(COMMA);
				setState(78);
				match(IDENTIFIER);
				}
				}
				setState(83);
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
	}

	public final Var_def_and_initContext var_def_and_init() throws RecognitionException {
		Var_def_and_initContext _localctx = new Var_def_and_initContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_def_and_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			type(0);
			setState(85);
			match(IDENTIFIER);
			setState(86);
			match(ASSIGN);
			setState(87);
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
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(89);
				var_multi_def();
				}
				break;
			case 2:
				{
				setState(90);
				var_def_and_init();
				}
				break;
			}
			setState(93);
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
		public List<TerminalNode> CONST() { return getTokens(MxParser.CONST); }
		public TerminalNode CONST(int i) {
			return getToken(MxParser.CONST, i);
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
	}

	public final Var_mallocContext var_malloc() throws RecognitionException {
		Var_mallocContext _localctx = new Var_mallocContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_malloc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			type(0);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					match(LEFT_BRACKET);
					setState(97);
					match(CONST);
					setState(98);
					match(RIGHT_BRACKET);
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					match(LEFT_BRACKET);
					setState(105);
					match(RIGHT_BRACKET);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(111);
				match(LEFT_PAREN);
				setState(112);
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
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public TerminalNode LEFT_BIGBRACE() { return getToken(MxParser.LEFT_BIGBRACE, 0); }
		public TerminalNode RIGHT_BIGBRACE() { return getToken(MxParser.RIGHT_BIGBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IF() { return getToken(MxParser.IF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(MxParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(MxParser.RIGHT_PAREN, 0); }
		public TerminalNode ELSE() { return getToken(MxParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(MxParser.FOR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(MxParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MxParser.SEMICOLON, i);
		}
		public TerminalNode WHILE() { return getToken(MxParser.WHILE, 0); }
		public TerminalNode RETURN() { return getToken(MxParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(MxParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(MxParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				var_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(LEFT_BIGBRACE);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << NEW) | (1L << THIS) | (1L << ADD_OP) | (1L << MINUS_OP) | (1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << LEFT_BIGBRACE) | (1L << CONST) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(117);
					statement();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(RIGHT_BIGBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(IF);
				setState(125);
				match(LEFT_PAREN);
				setState(126);
				expression(0);
				setState(127);
				match(RIGHT_PAREN);
				setState(128);
				statement();
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(129);
					match(ELSE);
					setState(130);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(FOR);
				setState(134);
				match(LEFT_PAREN);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << NEW) | (1L << THIS) | (1L << ADD_OP) | (1L << MINUS_OP) | (1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << LEFT_BIGBRACE) | (1L << CONST) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(135);
					statement();
					}
				}

				setState(138);
				match(SEMICOLON);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << ADD_OP) | (1L << MINUS_OP) | (1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << CONST) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(139);
					expression(0);
					}
				}

				setState(142);
				match(SEMICOLON);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << NEW) | (1L << THIS) | (1L << ADD_OP) | (1L << MINUS_OP) | (1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << LEFT_BIGBRACE) | (1L << CONST) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(143);
					statement();
					}
				}

				setState(146);
				match(RIGHT_PAREN);
				setState(147);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				match(WHILE);
				setState(149);
				match(LEFT_PAREN);
				setState(150);
				expression(0);
				setState(151);
				match(RIGHT_PAREN);
				setState(152);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				match(RETURN);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << ADD_OP) | (1L << MINUS_OP) | (1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << CONST) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(155);
					expression(0);
					}
				}

				setState(158);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				match(BREAK);
				setState(160);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(161);
				match(CONTINUE);
				setState(162);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(163);
				expression(0);
				setState(164);
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << CLASS) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(168);
				program_part();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
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
	}

	public final Program_partContext program_part() throws RecognitionException {
		Program_partContext _localctx = new Program_partContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_program_part);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				class_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				func_def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
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
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(182);
				match(IDENTIFIER);
				}
				break;
			case INT:
				{
				setState(183);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(184);
				match(BOOL);
				}
				break;
			case STRING:
				{
				setState(185);
				match(STRING);
				}
				break;
			case VOID:
				{
				setState(186);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(189);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(190);
					match(LEFT_BRACKET);
					setState(191);
					match(RIGHT_BRACKET);
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(CLASS);
			setState(198);
			match(IDENTIFIER);
			setState(199);
			match(LEFT_BIGBRACE);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(200);
					var_def();
					}
					break;
				case 2:
					{
					setState(201);
					func_def();
					}
					break;
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(RIGHT_BIGBRACE);
			setState(208);
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
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			type(0);
			setState(211);
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
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_paramlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			param();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(214);
				match(COMMA);
				setState(215);
				param();
				}
				}
				setState(220);
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

	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(MxParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(MxParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BIGBRACE() { return getToken(MxParser.LEFT_BIGBRACE, 0); }
		public TerminalNode RIGHT_BIGBRACE() { return getToken(MxParser.RIGHT_BIGBRACE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(221);
				type(0);
				}
				break;
			}
			setState(224);
			match(IDENTIFIER);
			setState(225);
			match(LEFT_PAREN);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(226);
				paramlist();
				}
			}

			setState(229);
			match(RIGHT_PAREN);
			setState(230);
			match(LEFT_BIGBRACE);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << NEW) | (1L << THIS) | (1L << ADD_OP) | (1L << MINUS_OP) | (1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << LEFT_BIGBRACE) | (1L << CONST) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(231);
				statement();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(RIGHT_BIGBRACE);
			}
		}
		catch (RecognitionException re) {
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
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 9:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 1);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u00f2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2"+
		"%\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3D\n\3\3\3"+
		"\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\4\3\4\3\4\3\4\7\4R\n\4\f\4\16\4U\13"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6^\n\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7f\n"+
		"\7\f\7\16\7i\13\7\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\3\7\3\7\5\7t\n\7\3\b"+
		"\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0086"+
		"\n\b\3\b\3\b\3\b\5\b\u008b\n\b\3\b\3\b\5\b\u008f\n\b\3\b\3\b\5\b\u0093"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009f\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u00a9\n\b\3\t\7\t\u00ac\n\t\f\t\16\t\u00af\13"+
		"\t\3\t\3\t\3\n\3\n\3\n\5\n\u00b6\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00be\n\13\3\13\3\13\3\13\7\13\u00c3\n\13\f\13\16\13\u00c6\13\13\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u00cd\n\f\f\f\16\f\u00d0\13\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\7\16\u00db\n\16\f\16\16\16\u00de\13\16\3\17\5\17\u00e1"+
		"\n\17\3\17\3\17\3\17\5\17\u00e6\n\17\3\17\3\17\3\17\7\17\u00eb\n\17\f"+
		"\17\16\17\u00ee\13\17\3\17\3\17\3\17\2\4\4\24\20\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\2\6\5\2\24\25\'\')*\4\2\26\30!!\4\2\24 \"&\3\2)*\2\u0111"+
		"\2\36\3\2\2\2\4\60\3\2\2\2\6M\3\2\2\2\bV\3\2\2\2\n]\3\2\2\2\fa\3\2\2\2"+
		"\16\u00a8\3\2\2\2\20\u00ad\3\2\2\2\22\u00b5\3\2\2\2\24\u00bd\3\2\2\2\26"+
		"\u00c7\3\2\2\2\30\u00d4\3\2\2\2\32\u00d7\3\2\2\2\34\u00e0\3\2\2\2\36#"+
		"\5\4\3\2\37 \7\62\2\2 \"\5\4\3\2!\37\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3"+
		"\2\2\2$\3\3\2\2\2%#\3\2\2\2&\'\b\3\1\2\'\61\7\67\2\2(\61\78\2\2)\61\7"+
		"\23\2\2*+\t\2\2\2+\61\5\4\3\7,-\t\3\2\2-\61\5\4\3\6./\7\21\2\2/\61\5\f"+
		"\7\2\60&\3\2\2\2\60(\3\2\2\2\60)\3\2\2\2\60*\3\2\2\2\60,\3\2\2\2\60.\3"+
		"\2\2\2\61J\3\2\2\2\62\63\f\5\2\2\63\64\t\4\2\2\64I\5\4\3\6\65\66\f\3\2"+
		"\2\66\67\7(\2\2\67I\5\4\3\489\f\13\2\29:\7+\2\2:I\78\2\2;<\f\n\2\2<=\7"+
		".\2\2=>\5\4\3\2>?\7/\2\2?I\3\2\2\2@A\f\t\2\2AC\7,\2\2BD\5\2\2\2CB\3\2"+
		"\2\2CD\3\2\2\2DE\3\2\2\2EI\7-\2\2FG\f\b\2\2GI\t\5\2\2H\62\3\2\2\2H\65"+
		"\3\2\2\2H8\3\2\2\2H;\3\2\2\2H@\3\2\2\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2J"+
		"K\3\2\2\2K\5\3\2\2\2LJ\3\2\2\2MN\5\24\13\2NS\78\2\2OP\7\62\2\2PR\78\2"+
		"\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\7\3\2\2\2US\3\2\2\2VW\5\24"+
		"\13\2WX\78\2\2XY\7(\2\2YZ\5\4\3\2Z\t\3\2\2\2[^\5\6\4\2\\^\5\b\5\2][\3"+
		"\2\2\2]\\\3\2\2\2^_\3\2\2\2_`\7\64\2\2`\13\3\2\2\2ag\5\24\13\2bc\7.\2"+
		"\2cd\7\67\2\2df\7/\2\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hn\3\2\2"+
		"\2ig\3\2\2\2jk\7.\2\2km\7/\2\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2"+
		"os\3\2\2\2pn\3\2\2\2qr\7,\2\2rt\7-\2\2sq\3\2\2\2st\3\2\2\2t\r\3\2\2\2"+
		"u\u00a9\5\n\6\2vz\7\60\2\2wy\5\16\b\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{"+
		"\3\2\2\2{}\3\2\2\2|z\3\2\2\2}\u00a9\7\61\2\2~\177\7\n\2\2\177\u0080\7"+
		",\2\2\u0080\u0081\5\4\3\2\u0081\u0082\7-\2\2\u0082\u0085\5\16\b\2\u0083"+
		"\u0084\7\13\2\2\u0084\u0086\5\16\b\2\u0085\u0083\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u00a9\3\2\2\2\u0087\u0088\7\f\2\2\u0088\u008a\7,\2\2\u0089"+
		"\u008b\5\16\b\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008c\u008e\7\64\2\2\u008d\u008f\5\4\3\2\u008e\u008d\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\7\64\2\2\u0091\u0093\5"+
		"\16\b\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\7-\2\2\u0095\u00a9\5\16\b\2\u0096\u0097\7\r\2\2\u0097\u0098\7,"+
		"\2\2\u0098\u0099\5\4\3\2\u0099\u009a\7-\2\2\u009a\u009b\5\16\b\2\u009b"+
		"\u00a9\3\2\2\2\u009c\u009e\7\20\2\2\u009d\u009f\5\4\3\2\u009e\u009d\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a9\7\64\2\2\u00a1"+
		"\u00a2\7\16\2\2\u00a2\u00a9\7\64\2\2\u00a3\u00a4\7\17\2\2\u00a4\u00a9"+
		"\7\64\2\2\u00a5\u00a6\5\4\3\2\u00a6\u00a7\7\64\2\2\u00a7\u00a9\3\2\2\2"+
		"\u00a8u\3\2\2\2\u00a8v\3\2\2\2\u00a8~\3\2\2\2\u00a8\u0087\3\2\2\2\u00a8"+
		"\u0096\3\2\2\2\u00a8\u009c\3\2\2\2\u00a8\u00a1\3\2\2\2\u00a8\u00a3\3\2"+
		"\2\2\u00a8\u00a5\3\2\2\2\u00a9\17\3\2\2\2\u00aa\u00ac\5\22\n\2\u00ab\u00aa"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\2\2\3\u00b1\21\3\2\2"+
		"\2\u00b2\u00b6\5\26\f\2\u00b3\u00b6\5\34\17\2\u00b4\u00b6\5\n\6\2\u00b5"+
		"\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\23\3\2\2"+
		"\2\u00b7\u00b8\b\13\1\2\u00b8\u00be\78\2\2\u00b9\u00be\7\3\2\2\u00ba\u00be"+
		"\7\4\2\2\u00bb\u00be\7\5\2\2\u00bc\u00be\7\7\2\2\u00bd\u00b7\3\2\2\2\u00bd"+
		"\u00b9\3\2\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2"+
		"\2\2\u00be\u00c4\3\2\2\2\u00bf\u00c0\f\b\2\2\u00c0\u00c1\7.\2\2\u00c1"+
		"\u00c3\7/\2\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\25\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8"+
		"\7\22\2\2\u00c8\u00c9\78\2\2\u00c9\u00ce\7\60\2\2\u00ca\u00cd\5\n\6\2"+
		"\u00cb\u00cd\5\34\17\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d3\7\64\2\2\u00d3\27\3\2"+
		"\2\2\u00d4\u00d5\5\24\13\2\u00d5\u00d6\78\2\2\u00d6\31\3\2\2\2\u00d7\u00dc"+
		"\5\30\r\2\u00d8\u00d9\7\62\2\2\u00d9\u00db\5\30\r\2\u00da\u00d8\3\2\2"+
		"\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\33"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\5\24\13\2\u00e0\u00df\3\2\2\2"+
		"\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\78\2\2\u00e3\u00e5"+
		"\7,\2\2\u00e4\u00e6\5\32\16\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7-\2\2\u00e8\u00ec\7\60\2\2\u00e9\u00eb"+
		"\5\16\b\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2"+
		"\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0"+
		"\7\61\2\2\u00f0\35\3\2\2\2\35#\60CHJS]gnsz\u0085\u008a\u008e\u0092\u009e"+
		"\u00a8\u00ad\u00b5\u00bd\u00c4\u00cc\u00ce\u00dc\u00e0\u00e5\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}