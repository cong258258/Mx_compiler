// Generated from .\Mx.g4 by ANTLR 4.8
package parser;
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
		ADD_OP=1, MINUS_OP=2, MULTI_OP=3, DIV_OP=4, MOD_OP=5, XIAOYU_OP=6, DAYU_OP=7, 
		XIAOYUDENGYU_OP=8, DAYUDENGYU_OP=9, NOT_EQUAL_OP=10, EQUAL_OP=11, LOGIC_AND_OP=12, 
		LOGIC_OR_OP=13, LOGIC_NOT_OP=14, LEFT_SHIFT_OP=15, RIGHT_SHIFT_OP=16, 
		AND_OP=17, OR_OP=18, XOR_OP=19, NOT_OP=20, ASSIGN=21, ZIZENG_OP=22, ZIJIAN_OP=23, 
		DOT=24, LEFT_PAREN=25, RIGHT_PAREN=26, LEFT_BRACKET=27, RIGHT_BRACKET=28, 
		LEFT_BIGBRACE=29, RIGHT_BIGBRACE=30, COMMA=31, COLON=32, SEMICOLON=33, 
		BOOL_CONST=34, INT_CONST=35, STRING_CONST=36, NULL_CONST=37, INT=38, BOOL=39, 
		STRING=40, NULL=41, VOID=42, IF=43, ELSE=44, FOR=45, WHILE=46, BREAK=47, 
		CONTINUE=48, RETURN=49, NEW=50, CLASS=51, THIS=52, TRUE=53, FALSE=54, 
		IDENTIFIER=55, WHITE=56, Newline=57, BLOCKCOMMENT=58, LINECOMMENT=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ADD_OP", "MINUS_OP", "MULTI_OP", "DIV_OP", "MOD_OP", "XIAOYU_OP", "DAYU_OP", 
			"XIAOYUDENGYU_OP", "DAYUDENGYU_OP", "NOT_EQUAL_OP", "EQUAL_OP", "LOGIC_AND_OP", 
			"LOGIC_OR_OP", "LOGIC_NOT_OP", "LEFT_SHIFT_OP", "RIGHT_SHIFT_OP", "AND_OP", 
			"OR_OP", "XOR_OP", "NOT_OP", "ASSIGN", "ZIZENG_OP", "ZIJIAN_OP", "DOT", 
			"LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_BIGBRACE", 
			"RIGHT_BIGBRACE", "COMMA", "COLON", "SEMICOLON", "BOOL_CONST", "INT_CONST", 
			"STRING_CHAR_CONST", "STRING_CONST", "NULL_CONST", "INT", "BOOL", "STRING", 
			"NULL", "VOID", "IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", "RETURN", 
			"NEW", "CLASS", "THIS", "TRUE", "FALSE", "IDENTIFIER", "WHITE", "Newline", 
			"BLOCKCOMMENT", "LINECOMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", 
			"'!='", "'=='", "'&&'", "'||'", "'!'", "'<<'", "'>>'", "'&'", "'|'", 
			"'^'", "'~'", "'='", "'++'", "'--'", "'.'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "','", "':'", "';'", null, null, null, null, "'int'", "'bool'", 
			"'string'", "'null'", "'void'", "'if'", "'else'", "'for'", "'while'", 
			"'break'", "'continue'", "'return'", "'new'", "'class'", "'this'", "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD_OP", "MINUS_OP", "MULTI_OP", "DIV_OP", "MOD_OP", "XIAOYU_OP", 
			"DAYU_OP", "XIAOYUDENGYU_OP", "DAYUDENGYU_OP", "NOT_EQUAL_OP", "EQUAL_OP", 
			"LOGIC_AND_OP", "LOGIC_OR_OP", "LOGIC_NOT_OP", "LEFT_SHIFT_OP", "RIGHT_SHIFT_OP", 
			"AND_OP", "OR_OP", "XOR_OP", "NOT_OP", "ASSIGN", "ZIZENG_OP", "ZIJIAN_OP", 
			"DOT", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", 
			"LEFT_BIGBRACE", "RIGHT_BIGBRACE", "COMMA", "COLON", "SEMICOLON", "BOOL_CONST", 
			"INT_CONST", "STRING_CONST", "NULL_CONST", "INT", "BOOL", "STRING", "NULL", 
			"VOID", "IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", "RETURN", 
			"NEW", "CLASS", "THIS", "TRUE", "FALSE", "IDENTIFIER", "WHITE", "Newline", 
			"BLOCKCOMMENT", "LINECOMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u0170\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\5#\u00ca\n#\3$\6$\u00cd\n$\r$\16$\u00ce\3%\3%\3%\3%\3%\3%\3%\5%\u00d8"+
		"\n%\3&\3&\7&\u00dc\n&\f&\16&\u00df\13&\3&\3&\3\'\3\'\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3"+
		"-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\3"+
		"8\38\38\39\39\79\u0143\n9\f9\169\u0146\139\3:\6:\u0149\n:\r:\16:\u014a"+
		"\3:\3:\3;\3;\5;\u0151\n;\3;\5;\u0154\n;\3;\3;\3<\3<\3<\3<\7<\u015c\n<"+
		"\f<\16<\u015f\13<\3<\3<\3<\3<\3<\3=\3=\3=\3=\7=\u016a\n=\f=\16=\u016d"+
		"\13=\3=\3=\3\u015d\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I\2K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62"+
		"e\63g\64i\65k\66m\67o8q9s:u;w<y=\3\2\b\3\2\62;\6\2\f\f\17\17))^^\4\2C"+
		"\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u017a\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5}\3\2\2\2\7"+
		"\177\3\2\2\2\t\u0081\3\2\2\2\13\u0083\3\2\2\2\r\u0085\3\2\2\2\17\u0087"+
		"\3\2\2\2\21\u0089\3\2\2\2\23\u008c\3\2\2\2\25\u008f\3\2\2\2\27\u0092\3"+
		"\2\2\2\31\u0095\3\2\2\2\33\u0098\3\2\2\2\35\u009b\3\2\2\2\37\u009d\3\2"+
		"\2\2!\u00a0\3\2\2\2#\u00a3\3\2\2\2%\u00a5\3\2\2\2\'\u00a7\3\2\2\2)\u00a9"+
		"\3\2\2\2+\u00ab\3\2\2\2-\u00ad\3\2\2\2/\u00b0\3\2\2\2\61\u00b3\3\2\2\2"+
		"\63\u00b5\3\2\2\2\65\u00b7\3\2\2\2\67\u00b9\3\2\2\29\u00bb\3\2\2\2;\u00bd"+
		"\3\2\2\2=\u00bf\3\2\2\2?\u00c1\3\2\2\2A\u00c3\3\2\2\2C\u00c5\3\2\2\2E"+
		"\u00c9\3\2\2\2G\u00cc\3\2\2\2I\u00d7\3\2\2\2K\u00d9\3\2\2\2M\u00e2\3\2"+
		"\2\2O\u00e4\3\2\2\2Q\u00e8\3\2\2\2S\u00ed\3\2\2\2U\u00f4\3\2\2\2W\u00f9"+
		"\3\2\2\2Y\u00fe\3\2\2\2[\u0101\3\2\2\2]\u0106\3\2\2\2_\u010a\3\2\2\2a"+
		"\u0110\3\2\2\2c\u0116\3\2\2\2e\u011f\3\2\2\2g\u0126\3\2\2\2i\u012a\3\2"+
		"\2\2k\u0130\3\2\2\2m\u0135\3\2\2\2o\u013a\3\2\2\2q\u0140\3\2\2\2s\u0148"+
		"\3\2\2\2u\u0153\3\2\2\2w\u0157\3\2\2\2y\u0165\3\2\2\2{|\7-\2\2|\4\3\2"+
		"\2\2}~\7/\2\2~\6\3\2\2\2\177\u0080\7,\2\2\u0080\b\3\2\2\2\u0081\u0082"+
		"\7\61\2\2\u0082\n\3\2\2\2\u0083\u0084\7\'\2\2\u0084\f\3\2\2\2\u0085\u0086"+
		"\7>\2\2\u0086\16\3\2\2\2\u0087\u0088\7@\2\2\u0088\20\3\2\2\2\u0089\u008a"+
		"\7>\2\2\u008a\u008b\7?\2\2\u008b\22\3\2\2\2\u008c\u008d\7@\2\2\u008d\u008e"+
		"\7?\2\2\u008e\24\3\2\2\2\u008f\u0090\7#\2\2\u0090\u0091\7?\2\2\u0091\26"+
		"\3\2\2\2\u0092\u0093\7?\2\2\u0093\u0094\7?\2\2\u0094\30\3\2\2\2\u0095"+
		"\u0096\7(\2\2\u0096\u0097\7(\2\2\u0097\32\3\2\2\2\u0098\u0099\7~\2\2\u0099"+
		"\u009a\7~\2\2\u009a\34\3\2\2\2\u009b\u009c\7#\2\2\u009c\36\3\2\2\2\u009d"+
		"\u009e\7>\2\2\u009e\u009f\7>\2\2\u009f \3\2\2\2\u00a0\u00a1\7@\2\2\u00a1"+
		"\u00a2\7@\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7(\2\2\u00a4$\3\2\2\2\u00a5"+
		"\u00a6\7~\2\2\u00a6&\3\2\2\2\u00a7\u00a8\7`\2\2\u00a8(\3\2\2\2\u00a9\u00aa"+
		"\7\u0080\2\2\u00aa*\3\2\2\2\u00ab\u00ac\7?\2\2\u00ac,\3\2\2\2\u00ad\u00ae"+
		"\7-\2\2\u00ae\u00af\7-\2\2\u00af.\3\2\2\2\u00b0\u00b1\7/\2\2\u00b1\u00b2"+
		"\7/\2\2\u00b2\60\3\2\2\2\u00b3\u00b4\7\60\2\2\u00b4\62\3\2\2\2\u00b5\u00b6"+
		"\7*\2\2\u00b6\64\3\2\2\2\u00b7\u00b8\7+\2\2\u00b8\66\3\2\2\2\u00b9\u00ba"+
		"\7]\2\2\u00ba8\3\2\2\2\u00bb\u00bc\7_\2\2\u00bc:\3\2\2\2\u00bd\u00be\7"+
		"}\2\2\u00be<\3\2\2\2\u00bf\u00c0\7\177\2\2\u00c0>\3\2\2\2\u00c1\u00c2"+
		"\7.\2\2\u00c2@\3\2\2\2\u00c3\u00c4\7<\2\2\u00c4B\3\2\2\2\u00c5\u00c6\7"+
		"=\2\2\u00c6D\3\2\2\2\u00c7\u00ca\5m\67\2\u00c8\u00ca\5o8\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00c8\3\2\2\2\u00caF\3\2\2\2\u00cb\u00cd\t\2\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cfH\3\2\2\2\u00d0\u00d1\7^\2\2\u00d1\u00d8\7p\2\2\u00d2\u00d3"+
		"\7^\2\2\u00d3\u00d8\7^\2\2\u00d4\u00d5\7^\2\2\u00d5\u00d8\7$\2\2\u00d6"+
		"\u00d8\n\3\2\2\u00d7\u00d0\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d7\u00d4\3\2"+
		"\2\2\u00d7\u00d6\3\2\2\2\u00d8J\3\2\2\2\u00d9\u00dd\7$\2\2\u00da\u00dc"+
		"\5I%\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7$"+
		"\2\2\u00e1L\3\2\2\2\u00e2\u00e3\5U+\2\u00e3N\3\2\2\2\u00e4\u00e5\7k\2"+
		"\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7v\2\2\u00e7P\3\2\2\2\u00e8\u00e9\7"+
		"d\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7n\2\2\u00ecR"+
		"\3\2\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7t\2\2\u00f0"+
		"\u00f1\7k\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7i\2\2\u00f3T\3\2\2\2\u00f4"+
		"\u00f5\7p\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7n\2\2"+
		"\u00f8V\3\2\2\2\u00f9\u00fa\7x\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7k\2"+
		"\2\u00fc\u00fd\7f\2\2\u00fdX\3\2\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7"+
		"h\2\2\u0100Z\3\2\2\2\u0101\u0102\7g\2\2\u0102\u0103\7n\2\2\u0103\u0104"+
		"\7u\2\2\u0104\u0105\7g\2\2\u0105\\\3\2\2\2\u0106\u0107\7h\2\2\u0107\u0108"+
		"\7q\2\2\u0108\u0109\7t\2\2\u0109^\3\2\2\2\u010a\u010b\7y\2\2\u010b\u010c"+
		"\7j\2\2\u010c\u010d\7k\2\2\u010d\u010e\7n\2\2\u010e\u010f\7g\2\2\u010f"+
		"`\3\2\2\2\u0110\u0111\7d\2\2\u0111\u0112\7t\2\2\u0112\u0113\7g\2\2\u0113"+
		"\u0114\7c\2\2\u0114\u0115\7m\2\2\u0115b\3\2\2\2\u0116\u0117\7e\2\2\u0117"+
		"\u0118\7q\2\2\u0118\u0119\7p\2\2\u0119\u011a\7v\2\2\u011a\u011b\7k\2\2"+
		"\u011b\u011c\7p\2\2\u011c\u011d\7w\2\2\u011d\u011e\7g\2\2\u011ed\3\2\2"+
		"\2\u011f\u0120\7t\2\2\u0120\u0121\7g\2\2\u0121\u0122\7v\2\2\u0122\u0123"+
		"\7w\2\2\u0123\u0124\7t\2\2\u0124\u0125\7p\2\2\u0125f\3\2\2\2\u0126\u0127"+
		"\7p\2\2\u0127\u0128\7g\2\2\u0128\u0129\7y\2\2\u0129h\3\2\2\2\u012a\u012b"+
		"\7e\2\2\u012b\u012c\7n\2\2\u012c\u012d\7c\2\2\u012d\u012e\7u\2\2\u012e"+
		"\u012f\7u\2\2\u012fj\3\2\2\2\u0130\u0131\7v\2\2\u0131\u0132\7j\2\2\u0132"+
		"\u0133\7k\2\2\u0133\u0134\7u\2\2\u0134l\3\2\2\2\u0135\u0136\7v\2\2\u0136"+
		"\u0137\7t\2\2\u0137\u0138\7w\2\2\u0138\u0139\7g\2\2\u0139n\3\2\2\2\u013a"+
		"\u013b\7h\2\2\u013b\u013c\7c\2\2\u013c\u013d\7n\2\2\u013d\u013e\7u\2\2"+
		"\u013e\u013f\7g\2\2\u013fp\3\2\2\2\u0140\u0144\t\4\2\2\u0141\u0143\t\5"+
		"\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145r\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0149\t\6\2\2"+
		"\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\b:\2\2\u014dt\3\2\2\2\u014e\u0150"+
		"\7\17\2\2\u014f\u0151\7\f\2\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2"+
		"\u0151\u0154\3\2\2\2\u0152\u0154\7\f\2\2\u0153\u014e\3\2\2\2\u0153\u0152"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\b;\2\2\u0156v\3\2\2\2\u0157\u0158"+
		"\7\61\2\2\u0158\u0159\7,\2\2\u0159\u015d\3\2\2\2\u015a\u015c\13\2\2\2"+
		"\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015e\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7,\2\2\u0161"+
		"\u0162\7\61\2\2\u0162\u0163\3\2\2\2\u0163\u0164\b<\2\2\u0164x\3\2\2\2"+
		"\u0165\u0166\7\61\2\2\u0166\u0167\7\61\2\2\u0167\u016b\3\2\2\2\u0168\u016a"+
		"\n\7\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\b="+
		"\2\2\u016fz\3\2\2\2\r\2\u00c9\u00ce\u00d7\u00dd\u0144\u014a\u0150\u0153"+
		"\u015d\u016b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}