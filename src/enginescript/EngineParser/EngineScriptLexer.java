// Generated from D:\Projects\IntelJProjects\Antlr\src\enginescript\EngineScriptLexer.g4 by ANTLR 4.9.1
package enginescript.EngineParser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EngineScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INCLUDE=1, ENTRY=2, FUNCTION=3, RETURN=4, HEADER=5, STRUCTURE=6, CLASS=7, 
		LPAREN=8, RPAREN=9, LCURLY=10, RCURLY=11, LBRACKET=12, RBRACKET=13, RELATION=14, 
		COMMA=15, SEMI=16, COLON=17, DOT=18, INCREMENT=19, DECREMENT=20, ASSIGN=21, 
		PLUS=22, MINUS=23, POW=24, MUL=25, DIV=26, SMALLER=27, BIGGER=28, ADDASSIGN=29, 
		SUBASSIGN=30, MULASSIGN=31, DIVASSIGN=32, IF=33, ELSE=34, AND=35, OR=36, 
		NOT=37, IDENTIFIER=38, STRINGLITERAL=39, DECIMALLITERAL=40, BOOLLITERAL=41, 
		WS=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INCLUDE", "ENTRY", "FUNCTION", "RETURN", "HEADER", "STRUCTURE", "CLASS", 
			"LPAREN", "RPAREN", "LCURLY", "RCURLY", "LBRACKET", "RBRACKET", "RELATION", 
			"COMMA", "SEMI", "COLON", "DOT", "INCREMENT", "DECREMENT", "ASSIGN", 
			"PLUS", "MINUS", "POW", "MUL", "DIV", "SMALLER", "BIGGER", "ADDASSIGN", 
			"SUBASSIGN", "MULASSIGN", "DIVASSIGN", "IF", "ELSE", "AND", "OR", "NOT", 
			"Digits", "IDENTIFIER", "STRINGLITERAL", "DECIMALLITERAL", "BOOLLITERAL", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'entry'", "'function'", "'return'", "'script'", null, null, 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "'='", "','", "';'", "':'", 
			"'.'", "'++'", "'--'", "':='", "'+'", "'-'", "'^'", "'*'", "'/'", "'<'", 
			"'>'", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INCLUDE", "ENTRY", "FUNCTION", "RETURN", "HEADER", "STRUCTURE", 
			"CLASS", "LPAREN", "RPAREN", "LCURLY", "RCURLY", "LBRACKET", "RBRACKET", 
			"RELATION", "COMMA", "SEMI", "COLON", "DOT", "INCREMENT", "DECREMENT", 
			"ASSIGN", "PLUS", "MINUS", "POW", "MUL", "DIV", "SMALLER", "BIGGER", 
			"ADDASSIGN", "SUBASSIGN", "MULASSIGN", "DIVASSIGN", "IF", "ELSE", "AND", 
			"OR", "NOT", "IDENTIFIER", "STRINGLITERAL", "DECIMALLITERAL", "BOOLLITERAL", 
			"WS"
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


	public EngineScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EngineScriptLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u013f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2d\n\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u0092\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u009f\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00e0\n\"\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\5#\u00ef\n#\3$\3$\3$\3$\5$\u00f5\n$\3%\3%\3%\5%\u00fa"+
		"\n%\3&\3&\3&\3&\5&\u0100\n&\3\'\3\'\7\'\u0104\n\'\f\'\16\'\u0107\13\'"+
		"\3\'\5\'\u010a\n\'\3(\3(\7(\u010e\n(\f(\16(\u0111\13(\3)\3)\7)\u0115\n"+
		")\f)\16)\u0118\13)\3)\3)\3*\3*\3*\5*\u011f\n*\3*\6*\u0122\n*\r*\16*\u0123"+
		"\3*\5*\u0127\n*\5*\u0129\n*\3*\5*\u012c\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\5+\u0137\n+\3,\6,\u013a\n,\r,\16,\u013b\3,\3,\2\2-\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M\2O(Q)S*U+W,\3\2\n\3\2\62;\4\2\62;aa\4\2C\\c|\6\2\62;C\\aac|\5\2\f\f"+
		"\17\17$$\3\2\63;\4\2NNnn\5\2\13\f\17\17\"\"\2\u0150\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3c\3\2\2"+
		"\2\5e\3\2\2\2\7k\3\2\2\2\tt\3\2\2\2\13{\3\2\2\2\r\u0091\3\2\2\2\17\u009e"+
		"\3\2\2\2\21\u00a0\3\2\2\2\23\u00a2\3\2\2\2\25\u00a4\3\2\2\2\27\u00a6\3"+
		"\2\2\2\31\u00a8\3\2\2\2\33\u00aa\3\2\2\2\35\u00ac\3\2\2\2\37\u00ae\3\2"+
		"\2\2!\u00b0\3\2\2\2#\u00b2\3\2\2\2%\u00b4\3\2\2\2\'\u00b6\3\2\2\2)\u00b9"+
		"\3\2\2\2+\u00bc\3\2\2\2-\u00bf\3\2\2\2/\u00c1\3\2\2\2\61\u00c3\3\2\2\2"+
		"\63\u00c5\3\2\2\2\65\u00c7\3\2\2\2\67\u00c9\3\2\2\29\u00cb\3\2\2\2;\u00cd"+
		"\3\2\2\2=\u00d0\3\2\2\2?\u00d3\3\2\2\2A\u00d6\3\2\2\2C\u00df\3\2\2\2E"+
		"\u00ee\3\2\2\2G\u00f4\3\2\2\2I\u00f9\3\2\2\2K\u00ff\3\2\2\2M\u0101\3\2"+
		"\2\2O\u010b\3\2\2\2Q\u0112\3\2\2\2S\u0128\3\2\2\2U\u0136\3\2\2\2W\u0139"+
		"\3\2\2\2YZ\7k\2\2Z[\7p\2\2[\\\7e\2\2\\]\7n\2\2]^\7w\2\2^_\7f\2\2_d\7g"+
		"\2\2`a\7k\2\2ab\7p\2\2bd\7e\2\2cY\3\2\2\2c`\3\2\2\2d\4\3\2\2\2ef\7g\2"+
		"\2fg\7p\2\2gh\7v\2\2hi\7t\2\2ij\7{\2\2j\6\3\2\2\2kl\7h\2\2lm\7w\2\2mn"+
		"\7p\2\2no\7e\2\2op\7v\2\2pq\7k\2\2qr\7q\2\2rs\7p\2\2s\b\3\2\2\2tu\7t\2"+
		"\2uv\7g\2\2vw\7v\2\2wx\7w\2\2xy\7t\2\2yz\7p\2\2z\n\3\2\2\2{|\7u\2\2|}"+
		"\7e\2\2}~\7t\2\2~\177\7k\2\2\177\u0080\7r\2\2\u0080\u0081\7v\2\2\u0081"+
		"\f\3\2\2\2\u0082\u0083\7u\2\2\u0083\u0084\7v\2\2\u0084\u0085\7t\2\2\u0085"+
		"\u0086\7w\2\2\u0086\u0087\7e\2\2\u0087\u0088\7v\2\2\u0088\u0089\7w\2\2"+
		"\u0089\u008a\7t\2\2\u008a\u0092\7g\2\2\u008b\u008c\7u\2\2\u008c\u008d"+
		"\7v\2\2\u008d\u008e\7t\2\2\u008e\u008f\7w\2\2\u008f\u0090\7e\2\2\u0090"+
		"\u0092\7v\2\2\u0091\u0082\3\2\2\2\u0091\u008b\3\2\2\2\u0092\16\3\2\2\2"+
		"\u0093\u0094\7e\2\2\u0094\u0095\7n\2\2\u0095\u0096\7c\2\2\u0096\u0097"+
		"\7u\2\2\u0097\u009f\7u\2\2\u0098\u0099\7o\2\2\u0099\u009a\7g\2\2\u009a"+
		"\u009b\7o\2\2\u009b\u009c\7d\2\2\u009c\u009d\7g\2\2\u009d\u009f\7t\2\2"+
		"\u009e\u0093\3\2\2\2\u009e\u0098\3\2\2\2\u009f\20\3\2\2\2\u00a0\u00a1"+
		"\7*\2\2\u00a1\22\3\2\2\2\u00a2\u00a3\7+\2\2\u00a3\24\3\2\2\2\u00a4\u00a5"+
		"\7}\2\2\u00a5\26\3\2\2\2\u00a6\u00a7\7\177\2\2\u00a7\30\3\2\2\2\u00a8"+
		"\u00a9\7]\2\2\u00a9\32\3\2\2\2\u00aa\u00ab\7_\2\2\u00ab\34\3\2\2\2\u00ac"+
		"\u00ad\7?\2\2\u00ad\36\3\2\2\2\u00ae\u00af\7.\2\2\u00af \3\2\2\2\u00b0"+
		"\u00b1\7=\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7<\2\2\u00b3$\3\2\2\2\u00b4"+
		"\u00b5\7\60\2\2\u00b5&\3\2\2\2\u00b6\u00b7\7-\2\2\u00b7\u00b8\7-\2\2\u00b8"+
		"(\3\2\2\2\u00b9\u00ba\7/\2\2\u00ba\u00bb\7/\2\2\u00bb*\3\2\2\2\u00bc\u00bd"+
		"\7<\2\2\u00bd\u00be\7?\2\2\u00be,\3\2\2\2\u00bf\u00c0\7-\2\2\u00c0.\3"+
		"\2\2\2\u00c1\u00c2\7/\2\2\u00c2\60\3\2\2\2\u00c3\u00c4\7`\2\2\u00c4\62"+
		"\3\2\2\2\u00c5\u00c6\7,\2\2\u00c6\64\3\2\2\2\u00c7\u00c8\7\61\2\2\u00c8"+
		"\66\3\2\2\2\u00c9\u00ca\7>\2\2\u00ca8\3\2\2\2\u00cb\u00cc\7@\2\2\u00cc"+
		":\3\2\2\2\u00cd\u00ce\7-\2\2\u00ce\u00cf\7?\2\2\u00cf<\3\2\2\2\u00d0\u00d1"+
		"\7/\2\2\u00d1\u00d2\7?\2\2\u00d2>\3\2\2\2\u00d3\u00d4\7,\2\2\u00d4\u00d5"+
		"\7?\2\2\u00d5@\3\2\2\2\u00d6\u00d7\7\61\2\2\u00d7\u00d8\7?\2\2\u00d8B"+
		"\3\2\2\2\u00d9\u00da\7k\2\2\u00da\u00e0\7h\2\2\u00db\u00dc\7y\2\2\u00dc"+
		"\u00dd\7j\2\2\u00dd\u00de\7g\2\2\u00de\u00e0\7p\2\2\u00df\u00d9\3\2\2"+
		"\2\u00df\u00db\3\2\2\2\u00e0D\3\2\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7"+
		"n\2\2\u00e3\u00e4\7u\2\2\u00e4\u00ef\7g\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7"+
		"\7v\2\2\u00e7\u00e8\7j\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7t\2\2\u00ea"+
		"\u00eb\7y\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ef\7g\2\2"+
		"\u00ee\u00e1\3\2\2\2\u00ee\u00e5\3\2\2\2\u00efF\3\2\2\2\u00f0\u00f5\7"+
		"(\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f5\7f\2\2\u00f4\u00f0"+
		"\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5H\3\2\2\2\u00f6\u00fa\7~\2\2\u00f7\u00f8"+
		"\7q\2\2\u00f8\u00fa\7t\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"J\3\2\2\2\u00fb\u0100\7#\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7q\2\2\u00fe"+
		"\u0100\7v\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100L\3\2\2\2\u0101"+
		"\u0109\t\2\2\2\u0102\u0104\t\3\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010a\t\2\2\2\u0109\u0105\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010aN\3\2\2\2\u010b\u010f\t\4\2\2\u010c\u010e\t\5\2\2\u010d\u010c"+
		"\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"P\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0116\7$\2\2\u0113\u0115\n\6\2\2\u0114"+
		"\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7$\2\2\u011a"+
		"R\3\2\2\2\u011b\u0129\7\62\2\2\u011c\u0126\t\7\2\2\u011d\u011f\5M\'\2"+
		"\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0127\3\2\2\2\u0120\u0122"+
		"\7\60\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2"+
		"\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\5M\'\2\u0126\u011e"+
		"\3\2\2\2\u0126\u0121\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u011b\3\2\2\2\u0128"+
		"\u011c\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u012c\t\b\2\2\u012b\u012a\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012cT\3\2\2\2\u012d\u012e\7v\2\2\u012e\u012f"+
		"\7t\2\2\u012f\u0130\7w\2\2\u0130\u0137\7g\2\2\u0131\u0132\7h\2\2\u0132"+
		"\u0133\7c\2\2\u0133\u0134\7n\2\2\u0134\u0135\7u\2\2\u0135\u0137\7g\2\2"+
		"\u0136\u012d\3\2\2\2\u0136\u0131\3\2\2\2\u0137V\3\2\2\2\u0138\u013a\t"+
		"\t\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\b,\2\2\u013eX\3\2\2\2\26"+
		"\2c\u0091\u009e\u00df\u00ee\u00f4\u00f9\u00ff\u0105\u0109\u010f\u0116"+
		"\u011e\u0123\u0126\u0128\u012b\u0136\u013b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}