// Generated from XPLNParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XPLNParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOP=1, LOP=2, UOP=3, SEMICOLON=4, RETURN=5, INPUT=6, OUTPUT=7, IF=8, WHILE=9, 
		ENDIF=10, ENDWH=11, FUN=12, ENDFUN=13, S=14, E=15, T=16, F=17, ID=18, 
		NUMBER=19, WHITESPACE=20, NEWLINE=21;
	public static final int
		RULE_start = 0, RULE_entry = 1, RULE_stmts = 2, RULE_stmt = 3, RULE_ifx = 4, 
		RULE_wh = 5, RULE_ret = 6, RULE_io = 7, RULE_def = 8, RULE_plist = 9, 
		RULE_f = 10, RULE_cond = 11;
	public static final String[] ruleNames = {
		"start", "entry", "stmts", "stmt", "ifx", "wh", "ret", "io", "def", "plist", 
		"f", "cond"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'!(not)'", "';'", "'return'", "'input'", "'output'", 
		"'if'", "'while'", "'endf'", "'endw'", "'fun'", "'endfun'", null, null, 
		null, null, null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOP", "LOP", "UOP", "SEMICOLON", "RETURN", "INPUT", "OUTPUT", "IF", 
		"WHILE", "ENDIF", "ENDWH", "FUN", "ENDFUN", "S", "E", "T", "F", "ID", 
		"NUMBER", "WHITESPACE", "NEWLINE"
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

	@Override
	public String getGrammarFileName() { return "XPLNParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XPLNParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(XPLNParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(XPLNParser.SEMICOLON, i);
		}
		public List<EntryContext> entry() {
			return getRuleContexts(EntryContext.class);
		}
		public EntryContext entry(int i) {
			return getRuleContext(EntryContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			stmt();
			setState(25);
			match(SEMICOLON);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << WHILE) | (1L << FUN) | (1L << S))) != 0)) {
				{
				{
				setState(26);
				entry();
				setState(27);
				match(SEMICOLON);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntryContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).exitEntry(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entry);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case INPUT:
			case OUTPUT:
			case IF:
			case WHILE:
			case S:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				stmt();
				}
				break;
			case FUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				def();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtsContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(XPLNParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(XPLNParser.SEMICOLON, i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).exitStmts(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << WHILE) | (1L << S))) != 0)) {
				{
				{
				setState(38);
				stmt();
				setState(39);
				match(SEMICOLON);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode S() { return getToken(XPLNParser.S, 0); }
		public IfxContext ifx() {
			return getRuleContext(IfxContext.class,0);
		}
		public WhContext wh() {
			return getRuleContext(WhContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public IoContext io() {
			return getRuleContext(IoContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case S:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(S);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				ifx();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				wh();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				ret();
				}
				break;
			case INPUT:
			case OUTPUT:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				io();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfxContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(XPLNParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(XPLNParser.ENDIF, 0); }
		public IfxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).enterIfx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).exitIfx(this);
		}
	}

	public final IfxContext ifx() throws RecognitionException {
		IfxContext _localctx = new IfxContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(IF);
			setState(54);
			cond(0);
			setState(55);
			stmts();
			setState(56);
			match(ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(XPLNParser.WHILE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode ENDWH() { return getToken(XPLNParser.ENDWH, 0); }
		public WhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).enterWh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).exitWh(this);
		}
	}

	public final WhContext wh() throws RecognitionException {
		WhContext _localctx = new WhContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_wh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(WHILE);
			setState(59);
			cond(0);
			setState(60);
			stmts();
			setState(61);
			match(ENDWH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(XPLNParser.RETURN, 0); }
		public TerminalNode E() { return getToken(XPLNParser.E, 0); }
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).exitRet(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(RETURN);
			setState(64);
			match(E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XPLNParser.ID, 0); }
		public TerminalNode INPUT() { return getToken(XPLNParser.INPUT, 0); }
		public TerminalNode OUTPUT() { return getToken(XPLNParser.OUTPUT, 0); }
		public IoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).enterIo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).exitIo(this);
		}
	}

	public final IoContext io() throws RecognitionException {
		IoContext _localctx = new IoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_io);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==INPUT || _la==OUTPUT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(67);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(XPLNParser.FUN, 0); }
		public TerminalNode ID() { return getToken(XPLNParser.ID, 0); }
		public PlistContext plist() {
			return getRuleContext(PlistContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode ENDFUN() { return getToken(XPLNParser.ENDFUN, 0); }
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).exitDef(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(FUN);
			setState(70);
			match(ID);
			setState(71);
			plist();
			setState(72);
			stmts();
			setState(73);
			match(ENDFUN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlistContext extends ParserRuleContext {
		public PlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).enterPlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).exitPlist(this);
		}
	}

	public final PlistContext plist() throws RecognitionException {
		PlistContext _localctx = new PlistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_plist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XPLNParser.ID, 0); }
		public PlistContext plist() {
			return getRuleContext(PlistContext.class,0);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).exitF(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_f);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ID);
			setState(78);
			plist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public List<TerminalNode> E() { return getTokens(XPLNParser.E); }
		public TerminalNode E(int i) {
			return getToken(XPLNParser.E, i);
		}
		public TerminalNode BOP() { return getToken(XPLNParser.BOP, 0); }
		public TerminalNode UOP() { return getToken(XPLNParser.UOP, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public TerminalNode LOP() { return getToken(XPLNParser.LOP, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_cond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case E:
				{
				setState(81);
				match(E);
				setState(82);
				match(BOP);
				setState(83);
				match(E);
				}
				break;
			case UOP:
				{
				setState(84);
				match(UOP);
				setState(85);
				cond(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(88);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(89);
					match(LOP);
					setState(90);
					cond(3);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\3\3\3\5\3"+
		"\'\n\3\3\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\5\3\5\3\5\3\5\3\5\5\5\66"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\rY\n\r\3\r\3\r\3\r\7\r^\n\r\f\r\16\ra\13\r\3\r\2\3\30\16\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\2\3\3\2\b\t\2_\2\32\3\2\2\2\4&\3\2\2\2\6-\3\2\2\2\b"+
		"\65\3\2\2\2\n\67\3\2\2\2\f<\3\2\2\2\16A\3\2\2\2\20D\3\2\2\2\22G\3\2\2"+
		"\2\24M\3\2\2\2\26O\3\2\2\2\30X\3\2\2\2\32\33\5\b\5\2\33!\7\6\2\2\34\35"+
		"\5\4\3\2\35\36\7\6\2\2\36 \3\2\2\2\37\34\3\2\2\2 #\3\2\2\2!\37\3\2\2\2"+
		"!\"\3\2\2\2\"\3\3\2\2\2#!\3\2\2\2$\'\5\b\5\2%\'\5\22\n\2&$\3\2\2\2&%\3"+
		"\2\2\2\'\5\3\2\2\2()\5\b\5\2)*\7\6\2\2*,\3\2\2\2+(\3\2\2\2,/\3\2\2\2-"+
		"+\3\2\2\2-.\3\2\2\2.\7\3\2\2\2/-\3\2\2\2\60\66\7\20\2\2\61\66\5\n\6\2"+
		"\62\66\5\f\7\2\63\66\5\16\b\2\64\66\5\20\t\2\65\60\3\2\2\2\65\61\3\2\2"+
		"\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\t\3\2\2\2\678\7\n\2\2"+
		"89\5\30\r\29:\5\6\4\2:;\7\f\2\2;\13\3\2\2\2<=\7\13\2\2=>\5\30\r\2>?\5"+
		"\6\4\2?@\7\r\2\2@\r\3\2\2\2AB\7\7\2\2BC\7\21\2\2C\17\3\2\2\2DE\t\2\2\2"+
		"EF\7\24\2\2F\21\3\2\2\2GH\7\16\2\2HI\7\24\2\2IJ\5\24\13\2JK\5\6\4\2KL"+
		"\7\17\2\2L\23\3\2\2\2MN\3\2\2\2N\25\3\2\2\2OP\7\24\2\2PQ\5\24\13\2Q\27"+
		"\3\2\2\2RS\b\r\1\2ST\7\21\2\2TU\7\3\2\2UY\7\21\2\2VW\7\5\2\2WY\5\30\r"+
		"\3XR\3\2\2\2XV\3\2\2\2Y_\3\2\2\2Z[\f\4\2\2[\\\7\4\2\2\\^\5\30\r\5]Z\3"+
		"\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\31\3\2\2\2a_\3\2\2\2\b!&-\65X_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}