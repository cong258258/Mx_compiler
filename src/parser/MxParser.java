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
		RULE_var_def_and_init = 3, RULE_var_def = 4, RULE_statement = 5, RULE_program = 6, 
		RULE_program_part = 7, RULE_type = 8, RULE_class_def = 9, RULE_param = 10, 
		RULE_paramlist = 11, RULE_func_def = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression_list", "expression", "var_multi_def", "var_def_and_init", 
			"var_def", "statement", "program", "program_part", "type", "class_def", 
			"param", "paramlist", "func_def"
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
			setState(26);
			expression(0);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(27);
				match(COMMA);
				setState(28);
				expression(0);
				}
				}
				setState(33);
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
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(35);
				match(CONST);
				}
				break;
			case IDENTIFIER:
				{
				setState(36);
				match(IDENTIFIER);
				}
				break;
			case ADD_OP:
			case MINUS_OP:
			case NOT_OP:
			case ZIZENG_OP:
			case ZIJIAN_OP:
				{
				setState(37);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_OP) | (1L << MINUS_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(38);
				expression(4);
				}
				break;
			case MULTI_OP:
			case DIV_OP:
			case MOD_OP:
			case LOGIC_NOT_OP:
				{
				setState(39);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << LOGIC_NOT_OP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(40);
				expression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(65);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(43);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(44);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_OP) | (1L << MINUS_OP) | (1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << XIAOYU_OP) | (1L << DAYU_OP) | (1L << XIAOYUDENGYU_OP) | (1L << DAYUDENGYU_OP) | (1L << NOT_EQUAL_OP) | (1L << EQUAL_OP) | (1L << LOGIC_AND_OP) | (1L << LOGIC_OR_OP) | (1L << LEFT_SHIFT_OP) | (1L << RIGHT_SHIFT_OP) | (1L << AND_OP) | (1L << OR_OP) | (1L << XOR_OP))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(45);
						expression(3);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(46);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(47);
						match(ASSIGN);
						setState(48);
						expression(2);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(49);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(50);
						match(DOT);
						setState(51);
						match(IDENTIFIER);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(52);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(53);
						match(LEFT_BRACKET);
						setState(54);
						expression(0);
						setState(55);
						match(RIGHT_BRACKET);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(57);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(58);
						match(LEFT_PAREN);
						setState(60);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_OP) | (1L << MINUS_OP) | (1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << CONST) | (1L << IDENTIFIER))) != 0)) {
							{
							setState(59);
							expression_list();
							}
						}

						setState(62);
						match(RIGHT_PAREN);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(63);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(64);
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
				setState(69);
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
			setState(70);
			type();
			setState(71);
			match(IDENTIFIER);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(72);
				match(COMMA);
				setState(73);
				match(IDENTIFIER);
				}
				}
				setState(78);
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
			setState(79);
			type();
			setState(80);
			match(IDENTIFIER);
			setState(81);
			match(ASSIGN);
			setState(82);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(84);
				var_multi_def();
				}
				break;
			case 2:
				{
				setState(85);
				var_def_and_init();
				}
				break;
			}
			setState(88);
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
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				var_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(LEFT_BIGBRACE);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << ADD_OP) | (1L << MINUS_OP) | (1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << LEFT_BIGBRACE) | (1L << CONST) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(92);
					statement();
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				match(RIGHT_BIGBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(IF);
				setState(100);
				match(LEFT_PAREN);
				setState(101);
				expression(0);
				setState(102);
				match(RIGHT_PAREN);
				setState(103);
				statement();
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(104);
					match(ELSE);
					setState(105);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(FOR);
				setState(109);
				match(LEFT_PAREN);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << ADD_OP) | (1L << MINUS_OP) | (1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << LEFT_BIGBRACE) | (1L << CONST) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(110);
					statement();
					}
				}

				setState(113);
				match(SEMICOLON);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_OP) | (1L << MINUS_OP) | (1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << CONST) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(114);
					expression(0);
					}
				}

				setState(117);
				match(SEMICOLON);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << ADD_OP) | (1L << MINUS_OP) | (1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << LEFT_BIGBRACE) | (1L << CONST) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(118);
					statement();
					}
				}

				setState(121);
				match(RIGHT_PAREN);
				setState(122);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				match(WHILE);
				setState(124);
				match(LEFT_PAREN);
				setState(125);
				expression(0);
				setState(126);
				match(RIGHT_PAREN);
				setState(127);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				match(RETURN);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_OP) | (1L << MINUS_OP) | (1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << CONST) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(130);
					expression(0);
					}
				}

				setState(133);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
				match(BREAK);
				setState(135);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(136);
				match(CONTINUE);
				setState(137);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(138);
				expression(0);
				setState(139);
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
		enterRule(_localctx, 12, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << CLASS) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(143);
				program_part();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
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
		enterRule(_localctx, 14, RULE_program_part);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				class_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				func_def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
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
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << IDENTIFIER))) != 0)) ) {
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
		enterRule(_localctx, 18, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(CLASS);
			setState(159);
			match(IDENTIFIER);
			setState(160);
			match(LEFT_BIGBRACE);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(161);
					var_def();
					}
					break;
				case 2:
					{
					setState(162);
					func_def();
					}
					break;
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(RIGHT_BIGBRACE);
			setState(169);
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
		enterRule(_localctx, 20, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			type();
			setState(172);
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
		enterRule(_localctx, 22, RULE_paramlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			param();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(175);
				match(COMMA);
				setState(176);
				param();
				}
				}
				setState(181);
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
		enterRule(_localctx, 24, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(182);
				type();
				}
				break;
			}
			setState(185);
			match(IDENTIFIER);
			setState(186);
			match(LEFT_PAREN);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(187);
				paramlist();
				}
			}

			setState(190);
			match(RIGHT_PAREN);
			setState(191);
			match(LEFT_BIGBRACE);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << ADD_OP) | (1L << MINUS_OP) | (1L << MULTI_OP) | (1L << DIV_OP) | (1L << MOD_OP) | (1L << LOGIC_NOT_OP) | (1L << NOT_OP) | (1L << ZIZENG_OP) | (1L << ZIJIAN_OP) | (1L << LEFT_BIGBRACE) | (1L << CONST) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(192);
				statement();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
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
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u00cb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\3\3\3\3\3\7\3D\n\3\f\3\16"+
		"\3G\13\3\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\5\6Y\n\6\3\6\3\6\3\7\3\7\3\7\7\7`\n\7\f\7\16\7c\13\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7m\n\7\3\7\3\7\3\7\5\7r\n\7\3\7\3\7\5\7v\n\7"+
		"\3\7\3\7\5\7z\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0086\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0090\n\7\3\b\7\b\u0093\n\b\f\b"+
		"\16\b\u0096\13\b\3\b\3\b\3\t\3\t\3\t\5\t\u009d\n\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u00a6\n\13\f\13\16\13\u00a9\13\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\7\r\u00b4\n\r\f\r\16\r\u00b7\13\r\3\16\5\16\u00ba"+
		"\n\16\3\16\3\16\3\16\5\16\u00bf\n\16\3\16\3\16\3\16\7\16\u00c4\n\16\f"+
		"\16\16\16\u00c7\13\16\3\16\3\16\3\16\2\3\4\17\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\2\7\5\2\24\25\'\')*\4\2\26\30!!\4\2\24 \"&\3\2)*\5\2\3\5\7\7"+
		"88\2\u00e1\2\34\3\2\2\2\4+\3\2\2\2\6H\3\2\2\2\bQ\3\2\2\2\nX\3\2\2\2\f"+
		"\u008f\3\2\2\2\16\u0094\3\2\2\2\20\u009c\3\2\2\2\22\u009e\3\2\2\2\24\u00a0"+
		"\3\2\2\2\26\u00ad\3\2\2\2\30\u00b0\3\2\2\2\32\u00b9\3\2\2\2\34!\5\4\3"+
		"\2\35\36\7\62\2\2\36 \5\4\3\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3"+
		"\2\2\2\"\3\3\2\2\2#!\3\2\2\2$%\b\3\1\2%,\7\67\2\2&,\78\2\2\'(\t\2\2\2"+
		"(,\5\4\3\6)*\t\3\2\2*,\5\4\3\5+$\3\2\2\2+&\3\2\2\2+\'\3\2\2\2+)\3\2\2"+
		"\2,E\3\2\2\2-.\f\4\2\2./\t\4\2\2/D\5\4\3\5\60\61\f\3\2\2\61\62\7(\2\2"+
		"\62D\5\4\3\4\63\64\f\n\2\2\64\65\7+\2\2\65D\78\2\2\66\67\f\t\2\2\678\7"+
		".\2\289\5\4\3\29:\7/\2\2:D\3\2\2\2;<\f\b\2\2<>\7,\2\2=?\5\2\2\2>=\3\2"+
		"\2\2>?\3\2\2\2?@\3\2\2\2@D\7-\2\2AB\f\7\2\2BD\t\5\2\2C-\3\2\2\2C\60\3"+
		"\2\2\2C\63\3\2\2\2C\66\3\2\2\2C;\3\2\2\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2"+
		"EF\3\2\2\2F\5\3\2\2\2GE\3\2\2\2HI\5\22\n\2IN\78\2\2JK\7\62\2\2KM\78\2"+
		"\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\7\3\2\2\2PN\3\2\2\2QR\5\22"+
		"\n\2RS\78\2\2ST\7(\2\2TU\5\4\3\2U\t\3\2\2\2VY\5\6\4\2WY\5\b\5\2XV\3\2"+
		"\2\2XW\3\2\2\2YZ\3\2\2\2Z[\7\64\2\2[\13\3\2\2\2\\\u0090\5\n\6\2]a\7\60"+
		"\2\2^`\5\f\7\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2"+
		"\2\2d\u0090\7\61\2\2ef\7\n\2\2fg\7,\2\2gh\5\4\3\2hi\7-\2\2il\5\f\7\2j"+
		"k\7\13\2\2km\5\f\7\2lj\3\2\2\2lm\3\2\2\2m\u0090\3\2\2\2no\7\f\2\2oq\7"+
		",\2\2pr\5\f\7\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\7\64\2\2tv\5\4\3\2ut\3"+
		"\2\2\2uv\3\2\2\2vw\3\2\2\2wy\7\64\2\2xz\5\f\7\2yx\3\2\2\2yz\3\2\2\2z{"+
		"\3\2\2\2{|\7-\2\2|\u0090\5\f\7\2}~\7\r\2\2~\177\7,\2\2\177\u0080\5\4\3"+
		"\2\u0080\u0081\7-\2\2\u0081\u0082\5\f\7\2\u0082\u0090\3\2\2\2\u0083\u0085"+
		"\7\20\2\2\u0084\u0086\5\4\3\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\u0090\7\64\2\2\u0088\u0089\7\16\2\2\u0089\u0090"+
		"\7\64\2\2\u008a\u008b\7\17\2\2\u008b\u0090\7\64\2\2\u008c\u008d\5\4\3"+
		"\2\u008d\u008e\7\64\2\2\u008e\u0090\3\2\2\2\u008f\\\3\2\2\2\u008f]\3\2"+
		"\2\2\u008fe\3\2\2\2\u008fn\3\2\2\2\u008f}\3\2\2\2\u008f\u0083\3\2\2\2"+
		"\u008f\u0088\3\2\2\2\u008f\u008a\3\2\2\2\u008f\u008c\3\2\2\2\u0090\r\3"+
		"\2\2\2\u0091\u0093\5\20\t\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0098\7\2\2\3\u0098\17\3\2\2\2\u0099\u009d\5\24\13\2\u009a"+
		"\u009d\5\32\16\2\u009b\u009d\5\n\6\2\u009c\u0099\3\2\2\2\u009c\u009a\3"+
		"\2\2\2\u009c\u009b\3\2\2\2\u009d\21\3\2\2\2\u009e\u009f\t\6\2\2\u009f"+
		"\23\3\2\2\2\u00a0\u00a1\7\22\2\2\u00a1\u00a2\78\2\2\u00a2\u00a7\7\60\2"+
		"\2\u00a3\u00a6\5\n\6\2\u00a4\u00a6\5\32\16\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\61\2\2\u00ab"+
		"\u00ac\7\64\2\2\u00ac\25\3\2\2\2\u00ad\u00ae\5\22\n\2\u00ae\u00af\78\2"+
		"\2\u00af\27\3\2\2\2\u00b0\u00b5\5\26\f\2\u00b1\u00b2\7\62\2\2\u00b2\u00b4"+
		"\5\26\f\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2"+
		"\u00b5\u00b6\3\2\2\2\u00b6\31\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba"+
		"\5\22\n\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2"+
		"\u00bb\u00bc\78\2\2\u00bc\u00be\7,\2\2\u00bd\u00bf\5\30\r\2\u00be\u00bd"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7-\2\2\u00c1"+
		"\u00c5\7\60\2\2\u00c2\u00c4\5\f\7\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3"+
		"\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00c9\7\61\2\2\u00c9\33\3\2\2\2\30!+>CENXalquy\u0085"+
		"\u008f\u0094\u009c\u00a5\u00a7\u00b5\u00b9\u00be\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}