// Generated from XPLNLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XPLNLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOP=1, LOP=2, UOP=3, SEMICOLON=4, RETURN=5, INPUT=6, OUTPUT=7, OPEN_PLIST=8, 
		CLOSE_PLIST=9, EQUALS=10, MINUS=11, PLUS=12, MULTI=13, DIVIDE=14, IF=15, 
		WHILE=16, ENDIF=17, ENDWH=18, FUN=19, ENDFUN=20, NEWLINE=21, COMMENTS=22, 
		ID=23, NUMBER=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LOWERCASE", "UPPERCASE", "DIGIT", "BOP", "LOP", "UOP", "SEMICOLON", "RETURN", 
		"INPUT", "OUTPUT", "OPEN_PLIST", "CLOSE_PLIST", "EQUALS", "MINUS", "PLUS", 
		"MULTI", "DIVIDE", "IF", "WHILE", "ENDIF", "ENDWH", "FUN", "ENDFUN", "NEWLINE", 
		"COMMENTS", "ID", "NUMBER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'!(not)'", "';'", "'return'", "'input'", "'output'", 
		"'('", "')'", "':='", "'+'", "'-'", "'*'", "'/'", "'if'", "'while'", "'endf'", 
		"'endw'", "'fun'", "'endfun'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOP", "LOP", "UOP", "SEMICOLON", "RETURN", "INPUT", "OUTPUT", "OPEN_PLIST", 
		"CLOSE_PLIST", "EQUALS", "MINUS", "PLUS", "MULTI", "DIVIDE", "IF", "WHILE", 
		"ENDIF", "ENDWH", "FUN", "ENDFUN", "NEWLINE", "COMMENTS", "ID", "NUMBER", 
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


	public XPLNLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XPLNLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00d7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\6\5\6Q\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\5\31\u009e\n\31\3\31\3\31\6\31\u00a2\n\31\r\31\16\31\u00a3\3\32\3\32"+
		"\3\32\3\32\7\32\u00aa\n\32\f\32\16\32\u00ad\13\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\7\32\u00b5\n\32\f\32\16\32\u00b8\13\32\3\32\5\32\u00bb\n\32"+
		"\3\32\3\32\3\33\6\33\u00c0\n\33\r\33\16\33\u00c1\3\34\6\34\u00c5\n\34"+
		"\r\34\16\34\u00c6\3\34\3\34\6\34\u00cb\n\34\r\34\16\34\u00cc\5\34\u00cf"+
		"\n\34\3\35\6\35\u00d2\n\35\r\35\16\35\u00d3\3\35\3\35\3\u00ab\2\36\3\2"+
		"\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!"+
		"\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33\3\2\t\3\2"+
		"c|\3\2C\\\3\2\62;\3\2\f\f\4\2C\\c|\4\2..\60\60\5\2\13\f\17\17\"\"\2\u00e3"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tI\3\2\2"+
		"\2\13P\3\2\2\2\rR\3\2\2\2\17Y\3\2\2\2\21[\3\2\2\2\23b\3\2\2\2\25h\3\2"+
		"\2\2\27o\3\2\2\2\31q\3\2\2\2\33s\3\2\2\2\35v\3\2\2\2\37x\3\2\2\2!z\3\2"+
		"\2\2#|\3\2\2\2%~\3\2\2\2\'\u0081\3\2\2\2)\u0087\3\2\2\2+\u008c\3\2\2\2"+
		"-\u0091\3\2\2\2/\u0095\3\2\2\2\61\u00a1\3\2\2\2\63\u00ba\3\2\2\2\65\u00bf"+
		"\3\2\2\2\67\u00c4\3\2\2\29\u00d1\3\2\2\2;<\t\2\2\2<\4\3\2\2\2=>\t\3\2"+
		"\2>\6\3\2\2\2?@\t\4\2\2@\b\3\2\2\2AJ\7>\2\2BC\7>\2\2CJ\7?\2\2DE\7?\2\2"+
		"EJ\7?\2\2FJ\7@\2\2GH\7@\2\2HJ\7?\2\2IA\3\2\2\2IB\3\2\2\2ID\3\2\2\2IF\3"+
		"\2\2\2IG\3\2\2\2J\n\3\2\2\2KL\7c\2\2LM\7p\2\2MQ\7f\2\2NO\7q\2\2OQ\7t\2"+
		"\2PK\3\2\2\2PN\3\2\2\2Q\f\3\2\2\2RS\7#\2\2ST\7*\2\2TU\7p\2\2UV\7q\2\2"+
		"VW\7v\2\2WX\7+\2\2X\16\3\2\2\2YZ\7=\2\2Z\20\3\2\2\2[\\\7t\2\2\\]\7g\2"+
		"\2]^\7v\2\2^_\7w\2\2_`\7t\2\2`a\7p\2\2a\22\3\2\2\2bc\7k\2\2cd\7p\2\2d"+
		"e\7r\2\2ef\7w\2\2fg\7v\2\2g\24\3\2\2\2hi\7q\2\2ij\7w\2\2jk\7v\2\2kl\7"+
		"r\2\2lm\7w\2\2mn\7v\2\2n\26\3\2\2\2op\7*\2\2p\30\3\2\2\2qr\7+\2\2r\32"+
		"\3\2\2\2st\7<\2\2tu\7?\2\2u\34\3\2\2\2vw\7-\2\2w\36\3\2\2\2xy\7/\2\2y"+
		" \3\2\2\2z{\7,\2\2{\"\3\2\2\2|}\7\61\2\2}$\3\2\2\2~\177\7k\2\2\177\u0080"+
		"\7h\2\2\u0080&\3\2\2\2\u0081\u0082\7y\2\2\u0082\u0083\7j\2\2\u0083\u0084"+
		"\7k\2\2\u0084\u0085\7n\2\2\u0085\u0086\7g\2\2\u0086(\3\2\2\2\u0087\u0088"+
		"\7g\2\2\u0088\u0089\7p\2\2\u0089\u008a\7f\2\2\u008a\u008b\7h\2\2\u008b"+
		"*\3\2\2\2\u008c\u008d\7g\2\2\u008d\u008e\7p\2\2\u008e\u008f\7f\2\2\u008f"+
		"\u0090\7y\2\2\u0090,\3\2\2\2\u0091\u0092\7h\2\2\u0092\u0093\7w\2\2\u0093"+
		"\u0094\7p\2\2\u0094.\3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097\7p\2\2\u0097"+
		"\u0098\7f\2\2\u0098\u0099\7h\2\2\u0099\u009a\7w\2\2\u009a\u009b\7p\2\2"+
		"\u009b\60\3\2\2\2\u009c\u009e\7\17\2\2\u009d\u009c\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\7\f\2\2\u00a0\u00a2\7\17\2\2"+
		"\u00a1\u009d\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\62\3\2\2\2\u00a5\u00a6\7\61\2\2\u00a6"+
		"\u00a7\7,\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00aa\13\2\2\2\u00a9\u00a8\3\2"+
		"\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7,\2\2\u00af\u00bb\7\61"+
		"\2\2\u00b0\u00b1\7\61\2\2\u00b1\u00b2\7\61\2\2\u00b2\u00b6\3\2\2\2\u00b3"+
		"\u00b5\n\5\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00bb\7\f\2\2\u00ba\u00a5\3\2\2\2\u00ba\u00b0\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00bd\b\32\2\2\u00bd\64\3\2\2\2\u00be\u00c0\t\6\2\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\66\3\2\2\2\u00c3\u00c5\5\7\4\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2"+
		"\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ce\3\2\2\2\u00c8\u00ca"+
		"\t\7\2\2\u00c9\u00cb\5\7\4\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00c8\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf8\3\2\2\2\u00d0\u00d2\t\b\2\2\u00d1\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\b\35\2\2\u00d6:\3\2\2\2\20\2IP\u009d\u00a1"+
		"\u00a3\u00ab\u00b6\u00ba\u00c1\u00c6\u00cc\u00ce\u00d3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}