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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, FunctionalEntityModifier=8, 
		NativeModifier=9, EntityDataType=10, Colon=11, Function=12, NumberDataType=13, 
		Comma=14, ReturnKeyword=15, End=16, Define=17, OpenBracket=18, CloseBracket=19, 
		WS=20, INT=21, Quotes=22, Equals=23, NL=24, StringLiteral=25, True=26, 
		False=27, Use=28, ID=29, Addition=30, Minus=31, Times=32, Devision=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "FunctionalEntityModifier", 
		"NativeModifier", "EntityDataType", "Colon", "Function", "NumberDataType", 
		"Comma", "ReturnKeyword", "End", "Define", "OpenBracket", "CloseBracket", 
		"WS", "INT", "Quotes", "Equals", "NL", "StringLiteral", "True", "False", 
		"Use", "ID", "Addition", "Minus", "Times", "Devision"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'###'", "'STRING'", "'BOOLEAN'", "'MODULE'", "'PROPERTY'", 
		"'MANDATORY'", "'FUNCTIONAL'", "'NATIVE'", "'ENTITY'", "':'", "'FUNCTION'", 
		"'NUMBER'", "','", "'RETURN'", "'END'", "'DEF'", "'('", "')'", null, null, 
		"'\"'", "'='", null, null, "'TRUE'", "'FALSE'", "'USE'", null, "'+'", 
		"'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "FunctionalEntityModifier", 
		"NativeModifier", "EntityDataType", "Colon", "Function", "NumberDataType", 
		"Comma", "ReturnKeyword", "End", "Define", "OpenBracket", "CloseBracket", 
		"WS", "INT", "Quotes", "Equals", "NL", "StringLiteral", "True", "False", 
		"Use", "ID", "Addition", "Minus", "Times", "Devision"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00f5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\6\25\u00b6\n\25\r\25\16\25\u00b7\3\25\3\25\3\26\6\26\u00bd\n"+
		"\26\r\26\16\26\u00be\3\27\3\27\3\30\3\30\3\31\5\31\u00c6\n\31\3\31\3\31"+
		"\5\31\u00ca\n\31\3\32\3\32\3\32\7\32\u00cf\n\32\f\32\16\32\u00d2\13\32"+
		"\5\32\u00d4\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\7\36\u00e9\n\36\f\36\16\36\u00ec"+
		"\13\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\6\5\2\13\f\17"+
		"\17\"\"\4\2C\\c|\6\2.\60\62;C\\c|\7\2\60\60\62;C\\aac|\2\u00fb\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7K\3"+
		"\2\2\2\tR\3\2\2\2\13Z\3\2\2\2\ra\3\2\2\2\17j\3\2\2\2\21t\3\2\2\2\23\177"+
		"\3\2\2\2\25\u0086\3\2\2\2\27\u008d\3\2\2\2\31\u008f\3\2\2\2\33\u0098\3"+
		"\2\2\2\35\u009f\3\2\2\2\37\u00a1\3\2\2\2!\u00a8\3\2\2\2#\u00ac\3\2\2\2"+
		"%\u00b0\3\2\2\2\'\u00b2\3\2\2\2)\u00b5\3\2\2\2+\u00bc\3\2\2\2-\u00c0\3"+
		"\2\2\2/\u00c2\3\2\2\2\61\u00c9\3\2\2\2\63\u00cb\3\2\2\2\65\u00d7\3\2\2"+
		"\2\67\u00dc\3\2\2\29\u00e2\3\2\2\2;\u00e6\3\2\2\2=\u00ed\3\2\2\2?\u00ef"+
		"\3\2\2\2A\u00f1\3\2\2\2C\u00f3\3\2\2\2EF\7%\2\2F\4\3\2\2\2GH\7%\2\2HI"+
		"\7%\2\2IJ\7%\2\2J\6\3\2\2\2KL\7U\2\2LM\7V\2\2MN\7T\2\2NO\7K\2\2OP\7P\2"+
		"\2PQ\7I\2\2Q\b\3\2\2\2RS\7D\2\2ST\7Q\2\2TU\7Q\2\2UV\7N\2\2VW\7G\2\2WX"+
		"\7C\2\2XY\7P\2\2Y\n\3\2\2\2Z[\7O\2\2[\\\7Q\2\2\\]\7F\2\2]^\7W\2\2^_\7"+
		"N\2\2_`\7G\2\2`\f\3\2\2\2ab\7R\2\2bc\7T\2\2cd\7Q\2\2de\7R\2\2ef\7G\2\2"+
		"fg\7T\2\2gh\7V\2\2hi\7[\2\2i\16\3\2\2\2jk\7O\2\2kl\7C\2\2lm\7P\2\2mn\7"+
		"F\2\2no\7C\2\2op\7V\2\2pq\7Q\2\2qr\7T\2\2rs\7[\2\2s\20\3\2\2\2tu\7H\2"+
		"\2uv\7W\2\2vw\7P\2\2wx\7E\2\2xy\7V\2\2yz\7K\2\2z{\7Q\2\2{|\7P\2\2|}\7"+
		"C\2\2}~\7N\2\2~\22\3\2\2\2\177\u0080\7P\2\2\u0080\u0081\7C\2\2\u0081\u0082"+
		"\7V\2\2\u0082\u0083\7K\2\2\u0083\u0084\7X\2\2\u0084\u0085\7G\2\2\u0085"+
		"\24\3\2\2\2\u0086\u0087\7G\2\2\u0087\u0088\7P\2\2\u0088\u0089\7V\2\2\u0089"+
		"\u008a\7K\2\2\u008a\u008b\7V\2\2\u008b\u008c\7[\2\2\u008c\26\3\2\2\2\u008d"+
		"\u008e\7<\2\2\u008e\30\3\2\2\2\u008f\u0090\7H\2\2\u0090\u0091\7W\2\2\u0091"+
		"\u0092\7P\2\2\u0092\u0093\7E\2\2\u0093\u0094\7V\2\2\u0094\u0095\7K\2\2"+
		"\u0095\u0096\7Q\2\2\u0096\u0097\7P\2\2\u0097\32\3\2\2\2\u0098\u0099\7"+
		"P\2\2\u0099\u009a\7W\2\2\u009a\u009b\7O\2\2\u009b\u009c\7D\2\2\u009c\u009d"+
		"\7G\2\2\u009d\u009e\7T\2\2\u009e\34\3\2\2\2\u009f\u00a0\7.\2\2\u00a0\36"+
		"\3\2\2\2\u00a1\u00a2\7T\2\2\u00a2\u00a3\7G\2\2\u00a3\u00a4\7V\2\2\u00a4"+
		"\u00a5\7W\2\2\u00a5\u00a6\7T\2\2\u00a6\u00a7\7P\2\2\u00a7 \3\2\2\2\u00a8"+
		"\u00a9\7G\2\2\u00a9\u00aa\7P\2\2\u00aa\u00ab\7F\2\2\u00ab\"\3\2\2\2\u00ac"+
		"\u00ad\7F\2\2\u00ad\u00ae\7G\2\2\u00ae\u00af\7H\2\2\u00af$\3\2\2\2\u00b0"+
		"\u00b1\7*\2\2\u00b1&\3\2\2\2\u00b2\u00b3\7+\2\2\u00b3(\3\2\2\2\u00b4\u00b6"+
		"\t\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\25\2\2\u00ba*\3\2\2\2"+
		"\u00bb\u00bd\4\62;\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf,\3\2\2\2\u00c0\u00c1\7$\2\2\u00c1."+
		"\3\2\2\2\u00c2\u00c3\7?\2\2\u00c3\60\3\2\2\2\u00c4\u00c6\7\17\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca\7\f"+
		"\2\2\u00c8\u00ca\7\17\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\62\3\2\2\2\u00cb\u00d3\5-\27\2\u00cc\u00d4\t\3\2\2\u00cd\u00cf\t\4\2"+
		"\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00cc\3\2\2\2\u00d3"+
		"\u00d0\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\5-\27\2\u00d6\64\3\2\2"+
		"\2\u00d7\u00d8\7V\2\2\u00d8\u00d9\7T\2\2\u00d9\u00da\7W\2\2\u00da\u00db"+
		"\7G\2\2\u00db\66\3\2\2\2\u00dc\u00dd\7H\2\2\u00dd\u00de\7C\2\2\u00de\u00df"+
		"\7N\2\2\u00df\u00e0\7U\2\2\u00e0\u00e1\7G\2\2\u00e18\3\2\2\2\u00e2\u00e3"+
		"\7W\2\2\u00e3\u00e4\7U\2\2\u00e4\u00e5\7G\2\2\u00e5:\3\2\2\2\u00e6\u00ea"+
		"\t\3\2\2\u00e7\u00e9\t\5\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb<\3\2\2\2\u00ec\u00ea\3\2\2\2"+
		"\u00ed\u00ee\7-\2\2\u00ee>\3\2\2\2\u00ef\u00f0\7/\2\2\u00f0@\3\2\2\2\u00f1"+
		"\u00f2\7,\2\2\u00f2B\3\2\2\2\u00f3\u00f4\7\61\2\2\u00f4D\3\2\2\2\n\2\u00b7"+
		"\u00be\u00c5\u00c9\u00d0\u00d3\u00ea\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}