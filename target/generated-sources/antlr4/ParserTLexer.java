// Generated from ParserT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__23=1, T__22=2, T__21=3, T__20=4, T__19=5, T__18=6, T__17=7, T__16=8, 
		T__15=9, T__14=10, T__13=11, T__12=12, T__11=13, T__10=14, T__9=15, T__8=16, 
		T__7=17, T__6=18, T__5=19, T__4=20, T__3=21, T__2=22, T__1=23, T__0=24, 
		BEGIN=25, END=26, BEGINRECETA=27, ASIGN=28, INPUT=29, OUTPUT=30, VARNAME=31, 
		CADENA=32, INT=33, FLOAT=34, OR=35, AND=36, MAYOR=37, MENOR=38, EQUAL=39, 
		NOTEQUAL=40, WS=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'"
	};
	public static final String[] ruleNames = {
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "BEGIN", 
		"END", "BEGINRECETA", "ASIGN", "INPUT", "OUTPUT", "VARNAME", "CADENA", 
		"INT", "FLOAT", "OR", "AND", "MAYOR", "MENOR", "EQUAL", "NOTEQUAL", "WS"
	};


	public ParserTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u01ab\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \6 \u014e\n \r \16 \u014f\3!\3!\6!\u0154"+
		"\n!\r!\16!\u0155\3!\3!\3\"\6\"\u015b\n\"\r\"\16\"\u015c\3#\6#\u0160\n"+
		"#\r#\16#\u0161\3#\3#\6#\u0166\n#\r#\16#\u0167\3$\3$\3%\3%\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3*\6*\u01a6\n*\r*\16*\u01a7\3*\3*\2\2+\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+\3\2\5\3\2c|\3\2\62;\5\2\13\f\17\17\"\"\u01b0\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U"+
		"\3\2\2\2\5^\3\2\2\2\7h\3\2\2\2\tq\3\2\2\2\13v\3\2\2\2\ry\3\2\2\2\17\u0083"+
		"\3\2\2\2\21\u0087\3\2\2\2\23\u008b\3\2\2\2\25\u0096\3\2\2\2\27\u00a0\3"+
		"\2\2\2\31\u00a7\3\2\2\2\33\u00ae\3\2\2\2\35\u00b5\3\2\2\2\37\u00c2\3\2"+
		"\2\2!\u00c9\3\2\2\2#\u00d0\3\2\2\2%\u00d6\3\2\2\2\'\u00dc\3\2\2\2)\u00e4"+
		"\3\2\2\2+\u00e7\3\2\2\2-\u00ef\3\2\2\2/\u00f2\3\2\2\2\61\u00f8\3\2\2\2"+
		"\63\u00fa\3\2\2\2\65\u0107\3\2\2\2\67\u0111\3\2\2\29\u011f\3\2\2\2;\u012c"+
		"\3\2\2\2=\u0144\3\2\2\2?\u014d\3\2\2\2A\u0151\3\2\2\2C\u015a\3\2\2\2E"+
		"\u015f\3\2\2\2G\u0169\3\2\2\2I\u016b\3\2\2\2K\u016d\3\2\2\2M\u0176\3\2"+
		"\2\2O\u0181\3\2\2\2Q\u0191\3\2\2\2S\u01a5\3\2\2\2UV\7r\2\2VW\7q\2\2WX"+
		"\7t\2\2XY\7\"\2\2YZ\7e\2\2Z[\7c\2\2[\\\7f\2\2\\]\7c\2\2]\4\3\2\2\2^_\7"+
		".\2\2_`\7\"\2\2`a\7r\2\2ab\7t\2\2bc\7q\2\2cd\7u\2\2de\7k\2\2ef\7i\2\2"+
		"fg\7c\2\2g\6\3\2\2\2hi\7o\2\2ij\7k\2\2jk\7g\2\2kl\7p\2\2lm\7v\2\2mn\7"+
		"t\2\2no\7c\2\2op\7u\2\2p\b\3\2\2\2qr\7j\2\2rs\7c\2\2st\7i\2\2tu\7c\2\2"+
		"u\n\3\2\2\2vw\7u\2\2wx\7k\2\2x\f\3\2\2\2yz\7r\2\2z{\7q\2\2{|\7t\2\2|}"+
		"\7e\2\2}~\7k\2\2~\177\7q\2\2\177\u0080\7p\2\2\u0080\u0081\7g\2\2\u0081"+
		"\u0082\7u\2\2\u0082\16\3\2\2\2\u0083\u0084\7e\2\2\u0084\u0085\7q\2\2\u0085"+
		"\u0086\7p\2\2\u0086\20\3\2\2\2\u0087\u0088\7s\2\2\u0088\u0089\7w\2\2\u0089"+
		"\u008a\7g\2\2\u008a\22\3\2\2\2\u008b\u008c\7.\2\2\u008c\u008d\7\"\2\2"+
		"\u008d\u008e\7r\2\2\u008e\u008f\7t\2\2\u008f\u0090\7q\2\2\u0090\u0091"+
		"\7u\2\2\u0091\u0092\7k\2\2\u0092\u0093\7i\2\2\u0093\u0094\7c\2\2\u0094"+
		"\u0095\7\60\2\2\u0095\24\3\2\2\2\u0096\u0097\7j\2\2\u0097\u0098\7c\2\2"+
		"\u0098\u0099\7u\2\2\u0099\u009a\7v\2\2\u009a\u009b\7c\2\2\u009b\u009c"+
		"\7\"\2\2\u009c\u009d\7s\2\2\u009d\u009e\7w\2\2\u009e\u009f\7g\2\2\u009f"+
		"\26\3\2\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7e\2\2\u00a3"+
		"\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7g\2\2\u00a6\30\3\2\2\2\u00a7"+
		"\u00a8\7f\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7x\2\2\u00aa\u00ab\7k\2\2"+
		"\u00ab\u00ac\7f\2\2\u00ac\u00ad\7c\2\2\u00ad\32\3\2\2\2\u00ae\u00af\7"+
		"s\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3"+
		"\7c\2\2\u00b3\u00b4\7t\2\2\u00b4\34\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7"+
		"\7p\2\2\u00b7\u00b8\7\"\2\2\u00b8\u00b9\7e\2\2\u00b9\u00ba\7w\2\2\u00ba"+
		"\u00bb\7c\2\2\u00bb\u00bc\7f\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7k\2\2"+
		"\u00be\u00bf\7v\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7u\2\2\u00c1\36\3\2"+
		"\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6"+
		"\7k\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7c\2\2\u00c8 \3\2\2\2\u00c9\u00ca"+
		"\7u\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7|\2\2\u00cc\u00cd\7q\2\2\u00cd"+
		"\u00ce\7p\2\2\u00ce\u00cf\7g\2\2\u00cf\"\3\2\2\2\u00d0\u00d1\7o\2\2\u00d1"+
		"\u00d2\7c\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7e\2\2\u00d4\u00d5\7c\2\2"+
		"\u00d5$\3\2\2\2\u00d6\u00d7\7m\2\2\u00d7\u00d8\7i\2\2\u00d8\u00d9\7\""+
		"\2\2\u00d9\u00da\7f\2\2\u00da\u00db\7g\2\2\u00db&\3\2\2\2\u00dc\u00dd"+
		"\7c\2\2\u00dd\u00de\7i\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7g\2\2\u00e0"+
		"\u00e1\7i\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7t\2\2\u00e3(\3\2\2\2\u00e4"+
		"\u00e5\7c\2\2\u00e5\u00e6\7n\2\2\u00e6*\3\2\2\2\u00e7\u00e8\7o\2\2\u00e8"+
		"\u00e9\7g\2\2\u00e9\u00ea\7|\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7n\2\2"+
		"\u00ec\u00ed\7c\2\2\u00ed\u00ee\7t\2\2\u00ee,\3\2\2\2\u00ef\u00f0\7g\2"+
		"\2\u00f0\u00f1\7p\2\2\u00f1.\3\2\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4\7"+
		"q\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7g\2\2\u00f7\60"+
		"\3\2\2\2\u00f8\u00f9\7.\2\2\u00f9\62\3\2\2\2\u00fa\u00fb\7K\2\2\u00fb"+
		"\u00fc\7p\2\2\u00fc\u00fd\7i\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7g\2\2"+
		"\u00ff\u0100\7f\2\2\u0100\u0101\7k\2\2\u0101\u0102\7g\2\2\u0102\u0103"+
		"\7p\2\2\u0103\u0104\7v\2\2\u0104\u0105\7g\2\2\u0105\u0106\7u\2\2\u0106"+
		"\64\3\2\2\2\u0107\u0108\7F\2\2\u0108\u0109\7k\2\2\u0109\u010a\7u\2\2\u010a"+
		"\u010b\7h\2\2\u010b\u010c\7t\2\2\u010c\u010d\7w\2\2\u010d\u010e\7v\2\2"+
		"\u010e\u010f\7g\2\2\u010f\u0110\7#\2\2\u0110\66\3\2\2\2\u0111\u0112\7"+
		"K\2\2\u0112\u0113\7p\2\2\u0113\u0114\7u\2\2\u0114\u0115\7v\2\2\u0115\u0116"+
		"\7t\2\2\u0116\u0117\7w\2\2\u0117\u0118\7e\2\2\u0118\u0119\7e\2\2\u0119"+
		"\u011a\7k\2\2\u011a\u011b\7q\2\2\u011b\u011c\7p\2\2\u011c\u011d\7g\2\2"+
		"\u011d\u011e\7u\2\2\u011e8\3\2\2\2\u011f\u0120\7w\2\2\u0120\u0121\7v\2"+
		"\2\u0121\u0122\7k\2\2\u0122\u0123\7n\2\2\u0123\u0124\7k\2\2\u0124\u0125"+
		"\7|\2\2\u0125\u0126\7c\2\2\u0126\u0127\7t\2\2\u0127\u0128\7g\2\2\u0128"+
		"\u0129\7o\2\2\u0129\u012a\7q\2\2\u012a\u012b\7u\2\2\u012b:\3\2\2\2\u012c"+
		"\u012d\7t\2\2\u012d\u012e\7g\2\2\u012e\u012f\7e\2\2\u012f\u0130\7q\2\2"+
		"\u0130\u0131\7o\2\2\u0131\u0132\7g\2\2\u0132\u0133\7p\2\2\u0133\u0134"+
		"\7f\2\2\u0134\u0135\7c\2\2\u0135\u0136\7e\2\2\u0136\u0137\7k\2\2\u0137"+
		"\u0138\7q\2\2\u0138\u0139\7p\2\2\u0139\u013a\7\"\2\2\u013a\u013b\7f\2"+
		"\2\u013b\u013c\7g\2\2\u013c\u013d\7n\2\2\u013d\u013e\7\"\2\2\u013e\u013f"+
		"\7e\2\2\u013f\u0140\7j\2\2\u0140\u0141\7g\2\2\u0141\u0142\7h\2\2\u0142"+
		"\u0143\7<\2\2\u0143<\3\2\2\2\u0144\u0145\7g\2\2\u0145\u0146\7o\2\2\u0146"+
		"\u0147\7r\2\2\u0147\u0148\7n\2\2\u0148\u0149\7c\2\2\u0149\u014a\7v\2\2"+
		"\u014a\u014b\7g\2\2\u014b>\3\2\2\2\u014c\u014e\t\2\2\2\u014d\u014c\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"@\3\2\2\2\u0151\u0153\7$\2\2\u0152\u0154\t\2\2\2\u0153\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0158\7$\2\2\u0158B\3\2\2\2\u0159\u015b\t\3\2\2\u015a\u0159"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"D\3\2\2\2\u015e\u0160\t\3\2\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2"+
		"\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165"+
		"\7\60\2\2\u0164\u0166\t\3\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2"+
		"\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168F\3\2\2\2\u0169\u016a\7"+
		"q\2\2\u016aH\3\2\2\2\u016b\u016c\7{\2\2\u016cJ\3\2\2\2\u016d\u016e\7j"+
		"\2\2\u016e\u016f\7c\2\2\u016f\u0170\7{\2\2\u0170\u0171\7c\2\2\u0171\u0172"+
		"\7\"\2\2\u0172\u0173\7o\2\2\u0173\u0174\7c\2\2\u0174\u0175\7u\2\2\u0175"+
		"L\3\2\2\2\u0176\u0177\7j\2\2\u0177\u0178\7c\2\2\u0178\u0179\7{\2\2\u0179"+
		"\u017a\7c\2\2\u017a\u017b\7\"\2\2\u017b\u017c\7o\2\2\u017c\u017d\7g\2"+
		"\2\u017d\u017e\7p\2\2\u017e\u017f\7q\2\2\u017f\u0180\7u\2\2\u0180N\3\2"+
		"\2\2\u0181\u0182\7j\2\2\u0182\u0183\7c\2\2\u0183\u0184\7{\2\2\u0184\u0185"+
		"\7c\2\2\u0185\u0186\7\"\2\2\u0186\u0187\7n\2\2\u0187\u0188\7q\2\2\u0188"+
		"\u0189\7u\2\2\u0189\u018a\7\"\2\2\u018a\u018b\7o\2\2\u018b\u018c\7k\2"+
		"\2\u018c\u018d\7u\2\2\u018d\u018e\7o\2\2\u018e\u018f\7q\2\2\u018f\u0190"+
		"\7u\2\2\u0190P\3\2\2\2\u0191\u0192\7p\2\2\u0192\u0193\7q\2\2\u0193\u0194"+
		"\7\"\2\2\u0194\u0195\7j\2\2\u0195\u0196\7c\2\2\u0196\u0197\7{\2\2\u0197"+
		"\u0198\7c\2\2\u0198\u0199\7\"\2\2\u0199\u019a\7n\2\2\u019a\u019b\7q\2"+
		"\2\u019b\u019c\7u\2\2\u019c\u019d\7\"\2\2\u019d\u019e\7o\2\2\u019e\u019f"+
		"\7k\2\2\u019f\u01a0\7u\2\2\u01a0\u01a1\7o\2\2\u01a1\u01a2\7q\2\2\u01a2"+
		"\u01a3\7u\2\2\u01a3R\3\2\2\2\u01a4\u01a6\t\4\2\2\u01a5\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2"+
		"\2\2\u01a9\u01aa\b*\2\2\u01aaT\3\2\2\2\t\2\u014f\u0155\u015c\u0161\u0167"+
		"\u01a7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}