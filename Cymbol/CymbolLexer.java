// Generated from Cymbol.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CymbolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPEINT=1, TYPEVOID=2, IF=3, ELSE=4, RETURN=5, LP=6, RP=7, COMMA=8, SEMICOLON=9, 
		LB=10, RB=11, AS=12, EQ=13, NE=14, NOT=15, GT=16, LT=17, GE=18, LE=19, 
		MUL=20, DIV=21, PLUS=22, MINUS=23, ID=24, INT=25, BLOCKCOMMENT=26, LINECOMMENT=27, 
		WS=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NUMBER", "LETTER", "UNDERLINE", "TYPEINT", "TYPEVOID", "IF", "ELSE", 
		"RETURN", "LP", "RP", "COMMA", "SEMICOLON", "LB", "RB", "AS", "EQ", "NE", 
		"NOT", "GT", "LT", "GE", "LE", "MUL", "DIV", "PLUS", "MINUS", "ID", "INT", 
		"BLOCKCOMMENT", "LINECOMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'void'", "'if'", "'else'", "'return'", "'('", "')'", "','", 
		"';'", "'{'", "'}'", "'='", "'=='", "'!='", "'!'", "'>'", "'<'", "'>='", 
		"'<='", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TYPEINT", "TYPEVOID", "IF", "ELSE", "RETURN", "LP", "RP", "COMMA", 
		"SEMICOLON", "LB", "RB", "AS", "EQ", "NE", "NOT", "GT", "LT", "GE", "LE", 
		"MUL", "DIV", "PLUS", "MINUS", "ID", "INT", "BLOCKCOMMENT", "LINECOMMENT", 
		"WS"
	};
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


	public CymbolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cymbol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00ba\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\5\34\u008a\n\34\3\34\3\34"+
		"\3\34\7\34\u008f\n\34\f\34\16\34\u0092\13\34\3\35\6\35\u0095\n\35\r\35"+
		"\16\35\u0096\3\36\3\36\3\36\3\36\7\36\u009d\n\36\f\36\16\36\u00a0\13\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u00ab\n\37\f\37\16"+
		"\37\u00ae\13\37\3\37\3\37\3\37\3\37\3 \6 \u00b5\n \r \16 \u00b6\3 \3 "+
		"\4\u009e\u00ac\2!\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31"+
		"\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31"+
		"\67\329\33;\34=\35?\36\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\u00be"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2"+
		"\2\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13K\3\2\2\2\rP\3\2\2\2\17S\3\2\2\2"+
		"\21X\3\2\2\2\23_\3\2\2\2\25a\3\2\2\2\27c\3\2\2\2\31e\3\2\2\2\33g\3\2\2"+
		"\2\35i\3\2\2\2\37k\3\2\2\2!m\3\2\2\2#p\3\2\2\2%s\3\2\2\2\'u\3\2\2\2)w"+
		"\3\2\2\2+y\3\2\2\2-|\3\2\2\2/\177\3\2\2\2\61\u0081\3\2\2\2\63\u0083\3"+
		"\2\2\2\65\u0085\3\2\2\2\67\u0089\3\2\2\29\u0094\3\2\2\2;\u0098\3\2\2\2"+
		"=\u00a6\3\2\2\2?\u00b4\3\2\2\2AB\t\2\2\2B\4\3\2\2\2CD\t\3\2\2D\6\3\2\2"+
		"\2EF\7a\2\2F\b\3\2\2\2GH\7k\2\2HI\7p\2\2IJ\7v\2\2J\n\3\2\2\2KL\7x\2\2"+
		"LM\7q\2\2MN\7k\2\2NO\7f\2\2O\f\3\2\2\2PQ\7k\2\2QR\7h\2\2R\16\3\2\2\2S"+
		"T\7g\2\2TU\7n\2\2UV\7u\2\2VW\7g\2\2W\20\3\2\2\2XY\7t\2\2YZ\7g\2\2Z[\7"+
		"v\2\2[\\\7w\2\2\\]\7t\2\2]^\7p\2\2^\22\3\2\2\2_`\7*\2\2`\24\3\2\2\2ab"+
		"\7+\2\2b\26\3\2\2\2cd\7.\2\2d\30\3\2\2\2ef\7=\2\2f\32\3\2\2\2gh\7}\2\2"+
		"h\34\3\2\2\2ij\7\177\2\2j\36\3\2\2\2kl\7?\2\2l \3\2\2\2mn\7?\2\2no\7?"+
		"\2\2o\"\3\2\2\2pq\7#\2\2qr\7?\2\2r$\3\2\2\2st\7#\2\2t&\3\2\2\2uv\7@\2"+
		"\2v(\3\2\2\2wx\7>\2\2x*\3\2\2\2yz\7@\2\2z{\7?\2\2{,\3\2\2\2|}\7>\2\2}"+
		"~\7?\2\2~.\3\2\2\2\177\u0080\7,\2\2\u0080\60\3\2\2\2\u0081\u0082\7\61"+
		"\2\2\u0082\62\3\2\2\2\u0083\u0084\7-\2\2\u0084\64\3\2\2\2\u0085\u0086"+
		"\7/\2\2\u0086\66\3\2\2\2\u0087\u008a\5\7\4\2\u0088\u008a\5\5\3\2\u0089"+
		"\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u0090\3\2\2\2\u008b\u008f\5\7"+
		"\4\2\u008c\u008f\5\5\3\2\u008d\u008f\5\3\2\2\u008e\u008b\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u00918\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095"+
		"\5\3\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097:\3\2\2\2\u0098\u0099\7\61\2\2\u0099\u009a\7,\2\2"+
		"\u009a\u009e\3\2\2\2\u009b\u009d\13\2\2\2\u009c\u009b\3\2\2\2\u009d\u00a0"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a2\7,\2\2\u00a2\u00a3\7\61\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a5\b\36\2\2\u00a5<\3\2\2\2\u00a6\u00a7\7\61\2\2\u00a7\u00a8"+
		"\7\61\2\2\u00a8\u00ac\3\2\2\2\u00a9\u00ab\13\2\2\2\u00aa\u00a9\3\2\2\2"+
		"\u00ab\u00ae\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\f\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\b\37\2\2\u00b2>\3\2\2\2\u00b3\u00b5\t\4\2\2\u00b4\u00b3\3\2\2\2"+
		"\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00b9\b \2\2\u00b9@\3\2\2\2\n\2\u0089\u008e\u0090\u0096"+
		"\u009e\u00ac\u00b6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}