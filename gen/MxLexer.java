// Generated from D:/Mx_compiler\Mx.g4 by ANTLR 4.9
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
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT=2, BOOL=3, STRING=4, NULL=5, VOID=6, TRUE=7, FALSE=8, IF=9, 
		ELSE=10, FOR=11, WHILE=12, BREAK=13, CONTINUE=14, RETURN=15, NEW=16, CLASS=17, 
		THIS=18, ADD_OP=19, MINUS_OP=20, MULTI_OP=21, DIV_OP=22, MOD_OP=23, XIAOYU_OP=24, 
		DAYU_OP=25, XIAOYUDENGYU_OP=26, DAYUDENGYU_OP=27, NOT_EQUAL_OP=28, EQUAL_OP=29, 
		LOGIC_AND_OP=30, LOGIC_OR_OP=31, LOGIC_NOT_OP=32, LEFT_SHIFT_OP=33, RIGHT_SHIFT_OP=34, 
		AND_OP=35, OR_OP=36, XOR_OP=37, NOT_OP=38, ASSIGN=39, ZIZENG_OP=40, ZIJIAN_OP=41, 
		DOT=42, LEFT_PAREN=43, RIGHT_PAREN=44, LEFT_BRACKET=45, RIGHT_BRACKET=46, 
		LEFT_BIGBRACE=47, RIGHT_BIGBRACE=48, COMMA=49, COLON=50, SEMICOLON=51, 
		WHITE=52, LINECOMMENT=53, CONST=54, IDENTIFIER=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "INT", "BOOL", "STRING", "NULL", "VOID", "TRUE", "FALSE", "IF", 
			"ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", "RETURN", "NEW", "CLASS", 
			"THIS", "ADD_OP", "MINUS_OP", "MULTI_OP", "DIV_OP", "MOD_OP", "XIAOYU_OP", 
			"DAYU_OP", "XIAOYUDENGYU_OP", "DAYUDENGYU_OP", "NOT_EQUAL_OP", "EQUAL_OP", 
			"LOGIC_AND_OP", "LOGIC_OR_OP", "LOGIC_NOT_OP", "LEFT_SHIFT_OP", "RIGHT_SHIFT_OP", 
			"AND_OP", "OR_OP", "XOR_OP", "NOT_OP", "ASSIGN", "ZIZENG_OP", "ZIJIAN_OP", 
			"DOT", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", 
			"LEFT_BIGBRACE", "RIGHT_BIGBRACE", "COMMA", "COLON", "SEMICOLON", "WHITE", 
			"LINECOMMENT", "BOOL_CONST", "INT_CONST", "STRING_CHAR_CONST", "STRING_CONST", 
			"NULL_CONST", "CONST", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'int'", "'bool'", "'string'", "'null'", "'void'", "'true'", 
			"'false'", "'if'", "'else'", "'for'", "'while'", "'break'", "'continue'", 
			"'return'", "'new'", "'class'", "'this'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", "'&&'", "'||'", 
			"'!'", "'<<'", "'>>'", "'&'", "'|'", "'^'", "'~'", "'='", "'++'", "'--'", 
			"'.'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INT", "BOOL", "STRING", "NULL", "VOID", "TRUE", "FALSE", 
			"IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", "RETURN", "NEW", "CLASS", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0171\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\6\65\u0127\n\65\r\65\16\65\u0128"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u0131\n\66\f\66\16\66\u0134\13\66"+
		"\3\66\3\66\3\66\3\66\5\66\u013a\n\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\5\67\u0147\n\67\38\38\68\u014b\n8\r8\168\u014c\3"+
		"9\39\39\39\39\39\39\59\u0156\n9\3:\3:\6:\u015a\n:\r:\16:\u015b\3:\3:\3"+
		";\3;\3;\3;\3;\3<\3<\3<\3<\5<\u0169\n<\3=\3=\7=\u016d\n=\f=\16=\u0170\13"+
		"=\2\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66"+
		"k\67m\2o\2q\2s\2u\2w8y9\3\2\t\5\2\13\f\17\17\"\"\5\2\f\f^^tt\3\2\63;\3"+
		"\2\62;\6\2\f\f\17\17))^^\4\2C\\c|\6\2\62;C\\aac|\2\u0179\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3"+
		"{\3\2\2\2\5}\3\2\2\2\7\u0081\3\2\2\2\t\u0086\3\2\2\2\13\u008d\3\2\2\2"+
		"\r\u0092\3\2\2\2\17\u0097\3\2\2\2\21\u009c\3\2\2\2\23\u00a2\3\2\2\2\25"+
		"\u00a5\3\2\2\2\27\u00aa\3\2\2\2\31\u00ae\3\2\2\2\33\u00b4\3\2\2\2\35\u00ba"+
		"\3\2\2\2\37\u00c3\3\2\2\2!\u00ca\3\2\2\2#\u00ce\3\2\2\2%\u00d4\3\2\2\2"+
		"\'\u00d9\3\2\2\2)\u00db\3\2\2\2+\u00dd\3\2\2\2-\u00df\3\2\2\2/\u00e1\3"+
		"\2\2\2\61\u00e3\3\2\2\2\63\u00e5\3\2\2\2\65\u00e7\3\2\2\2\67\u00ea\3\2"+
		"\2\29\u00ed\3\2\2\2;\u00f0\3\2\2\2=\u00f3\3\2\2\2?\u00f6\3\2\2\2A\u00f9"+
		"\3\2\2\2C\u00fb\3\2\2\2E\u00fe\3\2\2\2G\u0101\3\2\2\2I\u0103\3\2\2\2K"+
		"\u0105\3\2\2\2M\u0107\3\2\2\2O\u0109\3\2\2\2Q\u010b\3\2\2\2S\u010e\3\2"+
		"\2\2U\u0111\3\2\2\2W\u0113\3\2\2\2Y\u0115\3\2\2\2[\u0117\3\2\2\2]\u0119"+
		"\3\2\2\2_\u011b\3\2\2\2a\u011d\3\2\2\2c\u011f\3\2\2\2e\u0121\3\2\2\2g"+
		"\u0123\3\2\2\2i\u0126\3\2\2\2k\u012c\3\2\2\2m\u0146\3\2\2\2o\u0148\3\2"+
		"\2\2q\u0155\3\2\2\2s\u0157\3\2\2\2u\u015f\3\2\2\2w\u0168\3\2\2\2y\u016a"+
		"\3\2\2\2{|\7\"\2\2|\4\3\2\2\2}~\7k\2\2~\177\7p\2\2\177\u0080\7v\2\2\u0080"+
		"\6\3\2\2\2\u0081\u0082\7d\2\2\u0082\u0083\7q\2\2\u0083\u0084\7q\2\2\u0084"+
		"\u0085\7n\2\2\u0085\b\3\2\2\2\u0086\u0087\7u\2\2\u0087\u0088\7v\2\2\u0088"+
		"\u0089\7t\2\2\u0089\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c\7i\2\2"+
		"\u008c\n\3\2\2\2\u008d\u008e\7p\2\2\u008e\u008f\7w\2\2\u008f\u0090\7n"+
		"\2\2\u0090\u0091\7n\2\2\u0091\f\3\2\2\2\u0092\u0093\7x\2\2\u0093\u0094"+
		"\7q\2\2\u0094\u0095\7k\2\2\u0095\u0096\7f\2\2\u0096\16\3\2\2\2\u0097\u0098"+
		"\7v\2\2\u0098\u0099\7t\2\2\u0099\u009a\7w\2\2\u009a\u009b\7g\2\2\u009b"+
		"\20\3\2\2\2\u009c\u009d\7h\2\2\u009d\u009e\7c\2\2\u009e\u009f\7n\2\2\u009f"+
		"\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1\22\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3"+
		"\u00a4\7h\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7n\2\2\u00a7"+
		"\u00a8\7u\2\2\u00a8\u00a9\7g\2\2\u00a9\26\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab"+
		"\u00ac\7q\2\2\u00ac\u00ad\7t\2\2\u00ad\30\3\2\2\2\u00ae\u00af\7y\2\2\u00af"+
		"\u00b0\7j\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7g\2\2"+
		"\u00b3\32\3\2\2\2\u00b4\u00b5\7d\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7"+
		"g\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7m\2\2\u00b9\34\3\2\2\2\u00ba\u00bb"+
		"\7e\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7v\2\2\u00be"+
		"\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7g\2\2"+
		"\u00c2\36\3\2\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7"+
		"v\2\2\u00c6\u00c7\7w\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7p\2\2\u00c9 "+
		"\3\2\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7y\2\2\u00cd"+
		"\"\3\2\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7c\2\2\u00d1"+
		"\u00d2\7u\2\2\u00d2\u00d3\7u\2\2\u00d3$\3\2\2\2\u00d4\u00d5\7v\2\2\u00d5"+
		"\u00d6\7j\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7u\2\2\u00d8&\3\2\2\2\u00d9"+
		"\u00da\7-\2\2\u00da(\3\2\2\2\u00db\u00dc\7/\2\2\u00dc*\3\2\2\2\u00dd\u00de"+
		"\7,\2\2\u00de,\3\2\2\2\u00df\u00e0\7\61\2\2\u00e0.\3\2\2\2\u00e1\u00e2"+
		"\7\'\2\2\u00e2\60\3\2\2\2\u00e3\u00e4\7>\2\2\u00e4\62\3\2\2\2\u00e5\u00e6"+
		"\7@\2\2\u00e6\64\3\2\2\2\u00e7\u00e8\7>\2\2\u00e8\u00e9\7?\2\2\u00e9\66"+
		"\3\2\2\2\u00ea\u00eb\7@\2\2\u00eb\u00ec\7?\2\2\u00ec8\3\2\2\2\u00ed\u00ee"+
		"\7#\2\2\u00ee\u00ef\7?\2\2\u00ef:\3\2\2\2\u00f0\u00f1\7?\2\2\u00f1\u00f2"+
		"\7?\2\2\u00f2<\3\2\2\2\u00f3\u00f4\7(\2\2\u00f4\u00f5\7(\2\2\u00f5>\3"+
		"\2\2\2\u00f6\u00f7\7~\2\2\u00f7\u00f8\7~\2\2\u00f8@\3\2\2\2\u00f9\u00fa"+
		"\7#\2\2\u00faB\3\2\2\2\u00fb\u00fc\7>\2\2\u00fc\u00fd\7>\2\2\u00fdD\3"+
		"\2\2\2\u00fe\u00ff\7@\2\2\u00ff\u0100\7@\2\2\u0100F\3\2\2\2\u0101\u0102"+
		"\7(\2\2\u0102H\3\2\2\2\u0103\u0104\7~\2\2\u0104J\3\2\2\2\u0105\u0106\7"+
		"`\2\2\u0106L\3\2\2\2\u0107\u0108\7\u0080\2\2\u0108N\3\2\2\2\u0109\u010a"+
		"\7?\2\2\u010aP\3\2\2\2\u010b\u010c\7-\2\2\u010c\u010d\7-\2\2\u010dR\3"+
		"\2\2\2\u010e\u010f\7/\2\2\u010f\u0110\7/\2\2\u0110T\3\2\2\2\u0111\u0112"+
		"\7\60\2\2\u0112V\3\2\2\2\u0113\u0114\7*\2\2\u0114X\3\2\2\2\u0115\u0116"+
		"\7+\2\2\u0116Z\3\2\2\2\u0117\u0118\7]\2\2\u0118\\\3\2\2\2\u0119\u011a"+
		"\7_\2\2\u011a^\3\2\2\2\u011b\u011c\7}\2\2\u011c`\3\2\2\2\u011d\u011e\7"+
		"\177\2\2\u011eb\3\2\2\2\u011f\u0120\7.\2\2\u0120d\3\2\2\2\u0121\u0122"+
		"\7<\2\2\u0122f\3\2\2\2\u0123\u0124\7=\2\2\u0124h\3\2\2\2\u0125\u0127\t"+
		"\2\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\b\65\2\2\u012bj\3\2\2\2"+
		"\u012c\u012d\7\61\2\2\u012d\u012e\7\61\2\2\u012e\u0132\3\2\2\2\u012f\u0131"+
		"\n\3\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0139\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u013a\7\f"+
		"\2\2\u0136\u0137\7\17\2\2\u0137\u013a\7\f\2\2\u0138\u013a\7\2\2\3\u0139"+
		"\u0135\3\2\2\2\u0139\u0136\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u013c\b\66\2\2\u013cl\3\2\2\2\u013d\u013e\7V\2\2\u013e\u013f"+
		"\7t\2\2\u013f\u0140\7w\2\2\u0140\u0147\7g\2\2\u0141\u0142\7H\2\2\u0142"+
		"\u0143\7c\2\2\u0143\u0144\7n\2\2\u0144\u0145\7u\2\2\u0145\u0147\7g\2\2"+
		"\u0146\u013d\3\2\2\2\u0146\u0141\3\2\2\2\u0147n\3\2\2\2\u0148\u014a\t"+
		"\4\2\2\u0149\u014b\t\5\2\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014dp\3\2\2\2\u014e\u014f\7^\2\2\u014f"+
		"\u0156\7p\2\2\u0150\u0151\7^\2\2\u0151\u0156\7^\2\2\u0152\u0153\7^\2\2"+
		"\u0153\u0156\7$\2\2\u0154\u0156\n\6\2\2\u0155\u014e\3\2\2\2\u0155\u0150"+
		"\3\2\2\2\u0155\u0152\3\2\2\2\u0155\u0154\3\2\2\2\u0156r\3\2\2\2\u0157"+
		"\u0159\7$\2\2\u0158\u015a\5q9\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2"+
		"\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e"+
		"\7$\2\2\u015et\3\2\2\2\u015f\u0160\7p\2\2\u0160\u0161\7w\2\2\u0161\u0162"+
		"\7n\2\2\u0162\u0163\7n\2\2\u0163v\3\2\2\2\u0164\u0169\5m\67\2\u0165\u0169"+
		"\5o8\2\u0166\u0169\5s:\2\u0167\u0169\5u;\2\u0168\u0164\3\2\2\2\u0168\u0165"+
		"\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169x\3\2\2\2\u016a"+
		"\u016e\t\7\2\2\u016b\u016d\t\b\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2"+
		"\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016fz\3\2\2\2\u0170\u016e"+
		"\3\2\2\2\f\2\u0128\u0132\u0139\u0146\u014c\u0155\u015b\u0168\u016e\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}