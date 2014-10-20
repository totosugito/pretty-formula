package antlr;

// Generated from VanesaFormula.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VanesaFormulaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULT=3, DIV=4, POW=5, LPAREN=6, RPAREN=7, NUMBER=8, VARIABLE=9, 
		WS=10, DIGIT=11, CHAR=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'"
	};
	public static final String[] ruleNames = {
		"PLUS", "MINUS", "MULT", "DIV", "POW", "LPAREN", "RPAREN", "NUMBER", "VARIABLE", 
		"WS", "DIGIT", "CHAR"
	};


	public VanesaFormulaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VanesaFormula.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16F\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\6\t+\n\t\r\t\16\t,\3\t\3\t\6\t\61\n\t\r\t\16\t\62\5\t\65\n"+
		"\t\3\n\6\n8\n\n\r\n\16\n9\3\13\6\13=\n\13\r\13\16\13>\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\3\2\6\4\2..\60\60\5\2\13\f\17\17\"\"\3\2\62;\6\2\62;C\\aac|J\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t!\3\2\2\2\13#\3\2\2\2\r"+
		"%\3\2\2\2\17\'\3\2\2\2\21*\3\2\2\2\23\67\3\2\2\2\25<\3\2\2\2\27B\3\2\2"+
		"\2\31D\3\2\2\2\33\34\7-\2\2\34\4\3\2\2\2\35\36\7/\2\2\36\6\3\2\2\2\37"+
		" \7,\2\2 \b\3\2\2\2!\"\7\61\2\2\"\n\3\2\2\2#$\7`\2\2$\f\3\2\2\2%&\7*\2"+
		"\2&\16\3\2\2\2\'(\7+\2\2(\20\3\2\2\2)+\5\27\f\2*)\3\2\2\2+,\3\2\2\2,*"+
		"\3\2\2\2,-\3\2\2\2-\64\3\2\2\2.\60\t\2\2\2/\61\5\27\f\2\60/\3\2\2\2\61"+
		"\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64.\3\2\2\2\64\65"+
		"\3\2\2\2\65\22\3\2\2\2\668\5\31\r\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2"+
		"\29:\3\2\2\2:\24\3\2\2\2;=\t\3\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2"+
		"\2\2?@\3\2\2\2@A\b\13\2\2A\26\3\2\2\2BC\t\4\2\2C\30\3\2\2\2DE\t\5\2\2"+
		"E\32\3\2\2\2\b\2,\62\649>\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}