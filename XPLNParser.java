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
		BOP=1, LOP=2, UOP=3, SEMICOLON=4, RETURN=5, INPUT=6, OUTPUT=7, OPEN_PLIST=8, 
		CLOSE_PLIST=9, EQUALS=10, MINUS=11, PLUS=12, MULTI=13, DIVIDE=14, IF=15, 
		WHILE=16, ENDIF=17, ENDWH=18, FUN=19, ENDFUN=20, NEWLINE=21, COMMENTS=22, 
		ID=23, NUMBER=24, WS=25;
	public static final int
		RULE_start = 0, RULE_entry = 1, RULE_stmts = 2, RULE_stmt = 3, RULE_ifx = 4, 
		RULE_wh = 5, RULE_ret = 6, RULE_io = 7, RULE_def = 8, RULE_plist = 9, 
		RULE_f = 10, RULE_cond = 11, RULE_s = 12, RULE_e = 13, RULE_t = 14, RULE_ff = 15;
	public static final String[] ruleNames = {
		"start", "entry", "stmts", "stmt", "ifx", "wh", "ret", "io", "def", "plist", 
		"f", "cond", "s", "e", "t", "ff"
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
			setState(32);
			stmt();
			setState(33);
			match(SEMICOLON);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << WHILE) | (1L << FUN) | (1L << ID))) != 0)) {
				{
				{
				setState(34);
				entry();
				setState(35);
				match(SEMICOLON);
				}
				}
				setState(41);
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
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case INPUT:
			case OUTPUT:
			case IF:
			case WHILE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				stmt();
				}
				break;
			case FUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(46);
				stmt();
				setState(47);
				match(SEMICOLON);
				}
				}
				setState(53);
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
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
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
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				s();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				ifx();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				wh();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				ret();
				}
				break;
			case INPUT:
			case OUTPUT:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
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
			setState(61);
			match(IF);
			setState(62);
			cond(0);
			setState(63);
			stmts();
			setState(64);
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
			setState(66);
			match(WHILE);
			setState(67);
			cond(0);
			setState(68);
			stmts();
			setState(69);
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
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
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
			setState(71);
			match(RETURN);
			setState(72);
			e();
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
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==INPUT || _la==OUTPUT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(75);
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
			setState(77);
			match(FUN);
			setState(78);
			match(ID);
			setState(79);
			plist();
			setState(80);
			stmts();
			setState(81);
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
		public TerminalNode OPEN_PLIST() { return getToken(XPLNParser.OPEN_PLIST, 0); }
		public TerminalNode CLOSE_PLIST() { return getToken(XPLNParser.CLOSE_PLIST, 0); }
		public List<TerminalNode> ID() { return getTokens(XPLNParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XPLNParser.ID, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(OPEN_PLIST);
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				match(ID);
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(89);
			match(CLOSE_PLIST);
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
			setState(91);
			match(ID);
			setState(92);
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
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PLIST:
			case ID:
			case NUMBER:
				{
				setState(95);
				e();
				setState(96);
				match(BOP);
				setState(97);
				e();
				}
				break;
			case UOP:
				{
				setState(99);
				match(UOP);
				setState(100);
				cond(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(103);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(104);
					match(LOP);
					setState(105);
					cond(3);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class SContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XPLNParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(XPLNParser.EQUALS, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
			setState(112);
			match(EQUALS);
			setState(113);
			e();
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

	public static class EContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(XPLNParser.MINUS, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(XPLNParser.PLUS, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_e);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				t();
				setState(116);
				match(MINUS);
				setState(117);
				e();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				t();
				setState(120);
				match(PLUS);
				setState(121);
				e();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				t();
				}
				break;
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

	public static class TContext extends ParserRuleContext {
		public FfContext ff() {
			return getRuleContext(FfContext.class,0);
		}
		public TerminalNode MULTI() { return getToken(XPLNParser.MULTI, 0); }
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(XPLNParser.DIVIDE, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).exitT(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_t);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				ff();
				setState(127);
				match(MULTI);
				setState(128);
				t();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				ff();
				setState(131);
				match(DIVIDE);
				setState(132);
				t();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				ff();
				}
				break;
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

	public static class FfContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XPLNParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(XPLNParser.NUMBER, 0); }
		public TerminalNode OPEN_PLIST() { return getToken(XPLNParser.OPEN_PLIST, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode CLOSE_PLIST() { return getToken(XPLNParser.CLOSE_PLIST, 0); }
		public FfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).enterFf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPLNParserListener ) ((XPLNParserListener)listener).exitFf(this);
		}
	}

	public final FfContext ff() throws RecognitionException {
		FfContext _localctx = new FfContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ff);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(NUMBER);
				}
				break;
			case OPEN_PLIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(OPEN_PLIST);
				setState(140);
				e();
				setState(141);
				match(CLOSE_PLIST);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0094\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\7\4"+
		"\64\n\4\f\4\16\4\67\13\4\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\6\13X\n\13\r\13\16\13Y\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\rh\n\r\3\r\3\r\3\r\7\rm\n\r\f\r\16\rp\13\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\177\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u008a\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0092\n\21\3\21\2\3\30\22\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \2\3\3\2\b\t\2\u0093\2\"\3\2\2\2\4.\3\2\2\2\6\65"+
		"\3\2\2\2\b=\3\2\2\2\n?\3\2\2\2\fD\3\2\2\2\16I\3\2\2\2\20L\3\2\2\2\22O"+
		"\3\2\2\2\24U\3\2\2\2\26]\3\2\2\2\30g\3\2\2\2\32q\3\2\2\2\34~\3\2\2\2\36"+
		"\u0089\3\2\2\2 \u0091\3\2\2\2\"#\5\b\5\2#)\7\6\2\2$%\5\4\3\2%&\7\6\2\2"+
		"&(\3\2\2\2\'$\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+)\3\2"+
		"\2\2,/\5\b\5\2-/\5\22\n\2.,\3\2\2\2.-\3\2\2\2/\5\3\2\2\2\60\61\5\b\5\2"+
		"\61\62\7\6\2\2\62\64\3\2\2\2\63\60\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2"+
		"\65\66\3\2\2\2\66\7\3\2\2\2\67\65\3\2\2\28>\5\32\16\29>\5\n\6\2:>\5\f"+
		"\7\2;>\5\16\b\2<>\5\20\t\2=8\3\2\2\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2\2=<\3"+
		"\2\2\2>\t\3\2\2\2?@\7\21\2\2@A\5\30\r\2AB\5\6\4\2BC\7\23\2\2C\13\3\2\2"+
		"\2DE\7\22\2\2EF\5\30\r\2FG\5\6\4\2GH\7\24\2\2H\r\3\2\2\2IJ\7\7\2\2JK\5"+
		"\34\17\2K\17\3\2\2\2LM\t\2\2\2MN\7\31\2\2N\21\3\2\2\2OP\7\25\2\2PQ\7\31"+
		"\2\2QR\5\24\13\2RS\5\6\4\2ST\7\26\2\2T\23\3\2\2\2UW\7\n\2\2VX\7\31\2\2"+
		"WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\13\2\2\\\25\3"+
		"\2\2\2]^\7\31\2\2^_\5\24\13\2_\27\3\2\2\2`a\b\r\1\2ab\5\34\17\2bc\7\3"+
		"\2\2cd\5\34\17\2dh\3\2\2\2ef\7\5\2\2fh\5\30\r\3g`\3\2\2\2ge\3\2\2\2hn"+
		"\3\2\2\2ij\f\4\2\2jk\7\4\2\2km\5\30\r\5li\3\2\2\2mp\3\2\2\2nl\3\2\2\2"+
		"no\3\2\2\2o\31\3\2\2\2pn\3\2\2\2qr\7\31\2\2rs\7\f\2\2st\5\34\17\2t\33"+
		"\3\2\2\2uv\5\36\20\2vw\7\r\2\2wx\5\34\17\2x\177\3\2\2\2yz\5\36\20\2z{"+
		"\7\16\2\2{|\5\34\17\2|\177\3\2\2\2}\177\5\36\20\2~u\3\2\2\2~y\3\2\2\2"+
		"~}\3\2\2\2\177\35\3\2\2\2\u0080\u0081\5 \21\2\u0081\u0082\7\17\2\2\u0082"+
		"\u0083\5\36\20\2\u0083\u008a\3\2\2\2\u0084\u0085\5 \21\2\u0085\u0086\7"+
		"\20\2\2\u0086\u0087\5\36\20\2\u0087\u008a\3\2\2\2\u0088\u008a\5 \21\2"+
		"\u0089\u0080\3\2\2\2\u0089\u0084\3\2\2\2\u0089\u0088\3\2\2\2\u008a\37"+
		"\3\2\2\2\u008b\u0092\7\31\2\2\u008c\u0092\7\32\2\2\u008d\u008e\7\n\2\2"+
		"\u008e\u008f\5\34\17\2\u008f\u0090\7\13\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008b\3\2\2\2\u0091\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0092!\3\2\2\2"+
		"\f).\65=Ygn~\u0089\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}