// Generated from .\Mx.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MxLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "BOOL", "STRING", "NULL", "VOID", "TRUE", "FALSE", "IF", "ELSE", 
			"FOR", "WHILE", "BREAK", "CONTINUE", "RETURN", "NEW", "CLASS", "THIS", 
			"ADD_OP", "MINUS_OP", "MULTI_OP", "DIV_OP", "MOD_OP", "XIAOYU_OP", "DAYU_OP", 
			"XIAOYUDENGYU_OP", "DAYUDENGYU_OP", "NOT_EQUAL_OP", "EQUAL_OP", "LOGIC_AND_OP", 
			"LOGIC_OR_OP", "LOGIC_NOT_OP", "LEFT_SHIFT_OP", "RIGHT_SHIFT_OP", "AND_OP", 
			"OR_OP", "XOR_OP", "NOT_OP", "ASSIGN", "ZIZENG_OP", "ZIJIAN_OP", "DOT", 
			"LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_BIGBRACE", 
			"RIGHT_BIGBRACE", "COMMA", "COLON", "SEMICOLON", "WHITE", "LINECOMMENT", 
			"BOOL_CONST", "INT_CONST", "STRING_CHAR_CONST", "STRING_CONST", "NULL_CONST", 
			"CONST", "IDENTIFIER"
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


	public MxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u016c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		" \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)"+
		"\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\6\64\u0123\n\64\r\64\16\64\u0124\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\7\65\u012d\n\65\f\65\16\65\u0130\13\65\3\65\3\65\3\65\3\65"+
		"\5\65\u0136\n\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\5\66\u0143\n\66\3\67\6\67\u0146\n\67\r\67\16\67\u0147\38\38\38\38\38"+
		"\38\38\58\u0151\n8\39\39\69\u0155\n9\r9\169\u0156\39\39\3:\3:\3:\3:\3"+
		":\3;\3;\3;\3;\5;\u0164\n;\3<\3<\7<\u0168\n<\f<\16<\u016b\13<\2\2=\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\2m\2o\2q\2"+
		"s\2u\67w8\3\2\b\5\2\13\f\17\17\"\"\5\2\f\f^^tt\3\2\62;\6\2\f\f\17\17)"+
		")^^\4\2C\\c|\6\2\62;C\\aac|\2\u0174\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5}\3\2\2\2\7\u0082\3"+
		"\2\2\2\t\u0089\3\2\2\2\13\u008e\3\2\2\2\r\u0093\3\2\2\2\17\u0098\3\2\2"+
		"\2\21\u009e\3\2\2\2\23\u00a1\3\2\2\2\25\u00a6\3\2\2\2\27\u00aa\3\2\2\2"+
		"\31\u00b0\3\2\2\2\33\u00b6\3\2\2\2\35\u00bf\3\2\2\2\37\u00c6\3\2\2\2!"+
		"\u00ca\3\2\2\2#\u00d0\3\2\2\2%\u00d5\3\2\2\2\'\u00d7\3\2\2\2)\u00d9\3"+
		"\2\2\2+\u00db\3\2\2\2-\u00dd\3\2\2\2/\u00df\3\2\2\2\61\u00e1\3\2\2\2\63"+
		"\u00e3\3\2\2\2\65\u00e6\3\2\2\2\67\u00e9\3\2\2\29\u00ec\3\2\2\2;\u00ef"+
		"\3\2\2\2=\u00f2\3\2\2\2?\u00f5\3\2\2\2A\u00f7\3\2\2\2C\u00fa\3\2\2\2E"+
		"\u00fd\3\2\2\2G\u00ff\3\2\2\2I\u0101\3\2\2\2K\u0103\3\2\2\2M\u0105\3\2"+
		"\2\2O\u0107\3\2\2\2Q\u010a\3\2\2\2S\u010d\3\2\2\2U\u010f\3\2\2\2W\u0111"+
		"\3\2\2\2Y\u0113\3\2\2\2[\u0115\3\2\2\2]\u0117\3\2\2\2_\u0119\3\2\2\2a"+
		"\u011b\3\2\2\2c\u011d\3\2\2\2e\u011f\3\2\2\2g\u0122\3\2\2\2i\u0128\3\2"+
		"\2\2k\u0142\3\2\2\2m\u0145\3\2\2\2o\u0150\3\2\2\2q\u0152\3\2\2\2s\u015a"+
		"\3\2\2\2u\u0163\3\2\2\2w\u0165\3\2\2\2yz\7k\2\2z{\7p\2\2{|\7v\2\2|\4\3"+
		"\2\2\2}~\7d\2\2~\177\7q\2\2\177\u0080\7q\2\2\u0080\u0081\7n\2\2\u0081"+
		"\6\3\2\2\2\u0082\u0083\7u\2\2\u0083\u0084\7v\2\2\u0084\u0085\7t\2\2\u0085"+
		"\u0086\7k\2\2\u0086\u0087\7p\2\2\u0087\u0088\7i\2\2\u0088\b\3\2\2\2\u0089"+
		"\u008a\7p\2\2\u008a\u008b\7w\2\2\u008b\u008c\7n\2\2\u008c\u008d\7n\2\2"+
		"\u008d\n\3\2\2\2\u008e\u008f\7x\2\2\u008f\u0090\7q\2\2\u0090\u0091\7k"+
		"\2\2\u0091\u0092\7f\2\2\u0092\f\3\2\2\2\u0093\u0094\7v\2\2\u0094\u0095"+
		"\7t\2\2\u0095\u0096\7w\2\2\u0096\u0097\7g\2\2\u0097\16\3\2\2\2\u0098\u0099"+
		"\7h\2\2\u0099\u009a\7c\2\2\u009a\u009b\7n\2\2\u009b\u009c\7u\2\2\u009c"+
		"\u009d\7g\2\2\u009d\20\3\2\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7h\2\2\u00a0"+
		"\22\3\2\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7u\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\24\3\2\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7q\2\2\u00a8"+
		"\u00a9\7t\2\2\u00a9\26\3\2\2\2\u00aa\u00ab\7y\2\2\u00ab\u00ac\7j\2\2\u00ac"+
		"\u00ad\7k\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7g\2\2\u00af\30\3\2\2\2\u00b0"+
		"\u00b1\7d\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7c\2\2"+
		"\u00b4\u00b5\7m\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7"+
		"q\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc"+
		"\7p\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7g\2\2\u00be\34\3\2\2\2\u00bf\u00c0"+
		"\7t\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7w\2\2\u00c3"+
		"\u00c4\7t\2\2\u00c4\u00c5\7p\2\2\u00c5\36\3\2\2\2\u00c6\u00c7\7p\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8\u00c9\7y\2\2\u00c9 \3\2\2\2\u00ca\u00cb\7e\2\2\u00cb"+
		"\u00cc\7n\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7u\2\2"+
		"\u00cf\"\3\2\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7j\2\2\u00d2\u00d3\7k"+
		"\2\2\u00d3\u00d4\7u\2\2\u00d4$\3\2\2\2\u00d5\u00d6\7-\2\2\u00d6&\3\2\2"+
		"\2\u00d7\u00d8\7/\2\2\u00d8(\3\2\2\2\u00d9\u00da\7,\2\2\u00da*\3\2\2\2"+
		"\u00db\u00dc\7\61\2\2\u00dc,\3\2\2\2\u00dd\u00de\7\'\2\2\u00de.\3\2\2"+
		"\2\u00df\u00e0\7>\2\2\u00e0\60\3\2\2\2\u00e1\u00e2\7@\2\2\u00e2\62\3\2"+
		"\2\2\u00e3\u00e4\7>\2\2\u00e4\u00e5\7?\2\2\u00e5\64\3\2\2\2\u00e6\u00e7"+
		"\7@\2\2\u00e7\u00e8\7?\2\2\u00e8\66\3\2\2\2\u00e9\u00ea\7#\2\2\u00ea\u00eb"+
		"\7?\2\2\u00eb8\3\2\2\2\u00ec\u00ed\7?\2\2\u00ed\u00ee\7?\2\2\u00ee:\3"+
		"\2\2\2\u00ef\u00f0\7(\2\2\u00f0\u00f1\7(\2\2\u00f1<\3\2\2\2\u00f2\u00f3"+
		"\7~\2\2\u00f3\u00f4\7~\2\2\u00f4>\3\2\2\2\u00f5\u00f6\7#\2\2\u00f6@\3"+
		"\2\2\2\u00f7\u00f8\7>\2\2\u00f8\u00f9\7>\2\2\u00f9B\3\2\2\2\u00fa\u00fb"+
		"\7@\2\2\u00fb\u00fc\7@\2\2\u00fcD\3\2\2\2\u00fd\u00fe\7(\2\2\u00feF\3"+
		"\2\2\2\u00ff\u0100\7~\2\2\u0100H\3\2\2\2\u0101\u0102\7`\2\2\u0102J\3\2"+
		"\2\2\u0103\u0104\7\u0080\2\2\u0104L\3\2\2\2\u0105\u0106\7?\2\2\u0106N"+
		"\3\2\2\2\u0107\u0108\7-\2\2\u0108\u0109\7-\2\2\u0109P\3\2\2\2\u010a\u010b"+
		"\7/\2\2\u010b\u010c\7/\2\2\u010cR\3\2\2\2\u010d\u010e\7\60\2\2\u010eT"+
		"\3\2\2\2\u010f\u0110\7*\2\2\u0110V\3\2\2\2\u0111\u0112\7+\2\2\u0112X\3"+
		"\2\2\2\u0113\u0114\7]\2\2\u0114Z\3\2\2\2\u0115\u0116\7_\2\2\u0116\\\3"+
		"\2\2\2\u0117\u0118\7}\2\2\u0118^\3\2\2\2\u0119\u011a\7\177\2\2\u011a`"+
		"\3\2\2\2\u011b\u011c\7.\2\2\u011cb\3\2\2\2\u011d\u011e\7<\2\2\u011ed\3"+
		"\2\2\2\u011f\u0120\7=\2\2\u0120f\3\2\2\2\u0121\u0123\t\2\2\2\u0122\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0127\b\64\2\2\u0127h\3\2\2\2\u0128\u0129\7\61\2"+
		"\2\u0129\u012a\7\61\2\2\u012a\u012e\3\2\2\2\u012b\u012d\n\3\2\2\u012c"+
		"\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0135\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0136\7\f\2\2\u0132"+
		"\u0133\7\17\2\2\u0133\u0136\7\f\2\2\u0134\u0136\7\2\2\3\u0135\u0131\3"+
		"\2\2\2\u0135\u0132\3\2\2\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\b\65\2\2\u0138j\3\2\2\2\u0139\u013a\7V\2\2\u013a\u013b\7t\2\2\u013b"+
		"\u013c\7w\2\2\u013c\u0143\7g\2\2\u013d\u013e\7H\2\2\u013e\u013f\7c\2\2"+
		"\u013f\u0140\7n\2\2\u0140\u0141\7u\2\2\u0141\u0143\7g\2\2\u0142\u0139"+
		"\3\2\2\2\u0142\u013d\3\2\2\2\u0143l\3\2\2\2\u0144\u0146\t\4\2\2\u0145"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148n\3\2\2\2\u0149\u014a\7^\2\2\u014a\u0151\7p\2\2\u014b\u014c"+
		"\7^\2\2\u014c\u0151\7^\2\2\u014d\u014e\7^\2\2\u014e\u0151\7$\2\2\u014f"+
		"\u0151\n\5\2\2\u0150\u0149\3\2\2\2\u0150\u014b\3\2\2\2\u0150\u014d\3\2"+
		"\2\2\u0150\u014f\3\2\2\2\u0151p\3\2\2\2\u0152\u0154\7$\2\2\u0153\u0155"+
		"\5o8\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\7$\2\2\u0159r\3\2\2\2\u015a"+
		"\u015b\7p\2\2\u015b\u015c\7w\2\2\u015c\u015d\7n\2\2\u015d\u015e\7n\2\2"+
		"\u015et\3\2\2\2\u015f\u0164\5k\66\2\u0160\u0164\5m\67\2\u0161\u0164\5"+
		"q9\2\u0162\u0164\5s:\2\u0163\u015f\3\2\2\2\u0163\u0160\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0163\u0162\3\2\2\2\u0164v\3\2\2\2\u0165\u0169\t\6\2\2\u0166"+
		"\u0168\t\7\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u0169\u016a\3\2\2\2\u016ax\3\2\2\2\u016b\u0169\3\2\2\2\f\2\u0124"+
		"\u012e\u0135\u0142\u0147\u0150\u0156\u0163\u0169\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}