// Generated from C:/Users/Luc/workspace/vNES/src/main/java/com/lsieben/vnes/parser\vNES.g4 by ANTLR 4.7
package com.lsieben.vnes.parser.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class vNESLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, FunctionalEntityModifier=7, 
		NativeModifier=8, EntityDataType=9, Colon=10, Function=11, NumberDataType=12, 
		Comma=13, ReturnKeyword=14, End=15, Define=16, OpenBracket=17, CloseBracket=18, 
		WS=19, INT=20, Quotes=21, Equals=22, NL=23, StringLiteral=24, Use=25, 
		ID=26, Addition=27, Minus=28, Times=29, Devision=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "FunctionalEntityModifier", 
		"NativeModifier", "EntityDataType", "Colon", "Function", "NumberDataType", 
		"Comma", "ReturnKeyword", "End", "Define", "OpenBracket", "CloseBracket", 
		"WS", "INT", "Quotes", "Equals", "NL", "StringLiteral", "Use", "ID", "Addition", 
		"Minus", "Times", "Devision"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'###'", "'STRING'", "'MODULE'", "'PROPERTY'", "'MANDATORY'", 
		"'FUNCTIONAL'", "'NATIVE'", "'ENTITY'", "':'", "'FUNCTION'", "'NUMBER'", 
		"','", "'RETURN'", "'END'", "'DEF'", "'('", "')'", null, null, "'\"'", 
		"'='", null, null, "'USE'", null, "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "FunctionalEntityModifier", 
		"NativeModifier", "EntityDataType", "Colon", "Function", "NumberDataType", 
		"Comma", "ReturnKeyword", "End", "Define", "OpenBracket", "CloseBracket", 
		"WS", "INT", "Quotes", "Equals", "NL", "StringLiteral", "Use", "ID", "Addition", 
		"Minus", "Times", "Devision"
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


	public vNESLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "vNES.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00dc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\6\24\u00a8\n\24\r\24\16\24\u00a9\3\24\3\24\3\25\6\25\u00af"+
		"\n\25\r\25\16\25\u00b0\3\26\3\26\3\27\3\27\3\30\5\30\u00b8\n\30\3\30\3"+
		"\30\5\30\u00bc\n\30\3\31\3\31\3\31\7\31\u00c1\n\31\f\31\16\31\u00c4\13"+
		"\31\5\31\u00c6\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\7\33\u00d0"+
		"\n\33\f\33\16\33\u00d3\13\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\2"+
		"\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= \3\2\6\5\2\13\f\17\17\"\"\4\2C\\c|\6\2.\60\62;C\\c|\7\2\60\60\62"+
		";C\\aac|\2\u00e2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7E\3\2\2\2\tL"+
		"\3\2\2\2\13S\3\2\2\2\r\\\3\2\2\2\17f\3\2\2\2\21q\3\2\2\2\23x\3\2\2\2\25"+
		"\177\3\2\2\2\27\u0081\3\2\2\2\31\u008a\3\2\2\2\33\u0091\3\2\2\2\35\u0093"+
		"\3\2\2\2\37\u009a\3\2\2\2!\u009e\3\2\2\2#\u00a2\3\2\2\2%\u00a4\3\2\2\2"+
		"\'\u00a7\3\2\2\2)\u00ae\3\2\2\2+\u00b2\3\2\2\2-\u00b4\3\2\2\2/\u00bb\3"+
		"\2\2\2\61\u00bd\3\2\2\2\63\u00c9\3\2\2\2\65\u00cd\3\2\2\2\67\u00d4\3\2"+
		"\2\29\u00d6\3\2\2\2;\u00d8\3\2\2\2=\u00da\3\2\2\2?@\7%\2\2@\4\3\2\2\2"+
		"AB\7%\2\2BC\7%\2\2CD\7%\2\2D\6\3\2\2\2EF\7U\2\2FG\7V\2\2GH\7T\2\2HI\7"+
		"K\2\2IJ\7P\2\2JK\7I\2\2K\b\3\2\2\2LM\7O\2\2MN\7Q\2\2NO\7F\2\2OP\7W\2\2"+
		"PQ\7N\2\2QR\7G\2\2R\n\3\2\2\2ST\7R\2\2TU\7T\2\2UV\7Q\2\2VW\7R\2\2WX\7"+
		"G\2\2XY\7T\2\2YZ\7V\2\2Z[\7[\2\2[\f\3\2\2\2\\]\7O\2\2]^\7C\2\2^_\7P\2"+
		"\2_`\7F\2\2`a\7C\2\2ab\7V\2\2bc\7Q\2\2cd\7T\2\2de\7[\2\2e\16\3\2\2\2f"+
		"g\7H\2\2gh\7W\2\2hi\7P\2\2ij\7E\2\2jk\7V\2\2kl\7K\2\2lm\7Q\2\2mn\7P\2"+
		"\2no\7C\2\2op\7N\2\2p\20\3\2\2\2qr\7P\2\2rs\7C\2\2st\7V\2\2tu\7K\2\2u"+
		"v\7X\2\2vw\7G\2\2w\22\3\2\2\2xy\7G\2\2yz\7P\2\2z{\7V\2\2{|\7K\2\2|}\7"+
		"V\2\2}~\7[\2\2~\24\3\2\2\2\177\u0080\7<\2\2\u0080\26\3\2\2\2\u0081\u0082"+
		"\7H\2\2\u0082\u0083\7W\2\2\u0083\u0084\7P\2\2\u0084\u0085\7E\2\2\u0085"+
		"\u0086\7V\2\2\u0086\u0087\7K\2\2\u0087\u0088\7Q\2\2\u0088\u0089\7P\2\2"+
		"\u0089\30\3\2\2\2\u008a\u008b\7P\2\2\u008b\u008c\7W\2\2\u008c\u008d\7"+
		"O\2\2\u008d\u008e\7D\2\2\u008e\u008f\7G\2\2\u008f\u0090\7T\2\2\u0090\32"+
		"\3\2\2\2\u0091\u0092\7.\2\2\u0092\34\3\2\2\2\u0093\u0094\7T\2\2\u0094"+
		"\u0095\7G\2\2\u0095\u0096\7V\2\2\u0096\u0097\7W\2\2\u0097\u0098\7T\2\2"+
		"\u0098\u0099\7P\2\2\u0099\36\3\2\2\2\u009a\u009b\7G\2\2\u009b\u009c\7"+
		"P\2\2\u009c\u009d\7F\2\2\u009d \3\2\2\2\u009e\u009f\7F\2\2\u009f\u00a0"+
		"\7G\2\2\u00a0\u00a1\7H\2\2\u00a1\"\3\2\2\2\u00a2\u00a3\7*\2\2\u00a3$\3"+
		"\2\2\2\u00a4\u00a5\7+\2\2\u00a5&\3\2\2\2\u00a6\u00a8\t\2\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\b\24\2\2\u00ac(\3\2\2\2\u00ad\u00af\4\62;\2"+
		"\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7$\2\2\u00b3,\3\2\2\2\u00b4\u00b5"+
		"\7?\2\2\u00b5.\3\2\2\2\u00b6\u00b8\7\17\2\2\u00b7\u00b6\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\7\f\2\2\u00ba\u00bc\7\17"+
		"\2\2\u00bb\u00b7\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\60\3\2\2\2\u00bd\u00c5"+
		"\5+\26\2\u00be\u00c6\t\3\2\2\u00bf\u00c1\t\4\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00be\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\5+\26\2\u00c8\62\3\2\2\2\u00c9\u00ca\7W\2\2"+
		"\u00ca\u00cb\7U\2\2\u00cb\u00cc\7G\2\2\u00cc\64\3\2\2\2\u00cd\u00d1\t"+
		"\3\2\2\u00ce\u00d0\t\5\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\66\3\2\2\2\u00d3\u00d1\3\2\2"+
		"\2\u00d4\u00d5\7-\2\2\u00d58\3\2\2\2\u00d6\u00d7\7/\2\2\u00d7:\3\2\2\2"+
		"\u00d8\u00d9\7,\2\2\u00d9<\3\2\2\2\u00da\u00db\7\61\2\2\u00db>\3\2\2\2"+
		"\n\2\u00a9\u00b0\u00b7\u00bb\u00c2\u00c5\u00d1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}