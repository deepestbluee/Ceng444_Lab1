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
		CLOSE_PLIST=9, EQUALS=10, MINUS=11, PLUS=12, MULTI=13, DIVIDE=14, COMMA=15, 
		IF=16, WHILE=17, ENDIF=18, ENDWH=19, FUN=20, ENDFUN=21, ELSE=22, NEWLINE=23, 
		COMMENTS=24, NUMBER=25, ID=26, AA=27, WS=28;
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
		"'('", "')'", "':='", "'+'", "'-'", "'*'", "'/'", "','", "'if'", "'while'", 
		"'endi'", "'endw'", "'fun'", "'endf'", "'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOP", "LOP", "UOP", "SEMICOLON", "RETURN", "INPUT", "OUTPUT", "OPEN_PLIST", 
		"CLOSE_PLIST", "EQUALS", "MINUS", "PLUS", "MULTI", "DIVIDE", "COMMA", 
		"IF", "WHILE", "ENDIF", "ENDWH", "FUN", "ENDFUN", "ELSE", "NEWLINE", "COMMENTS", 
		"NUMBER", "ID", "AA", "WS"
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
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(XPLNParser.ENDIF, 0); }
		public List<TerminalNode> ELSE() { return getTokens(XPLNParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(XPLNParser.ELSE, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(IF);
			setState(62);
			cond(0);
			setState(63);
			stmts();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(64);
				match(ELSE);
				setState(65);
				stmts();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
			setState(73);
			match(WHILE);
			setState(74);
			cond(0);
			setState(75);
			stmts();
			setState(76);
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
			setState(78);
			match(RETURN);
			setState(79);
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
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==INPUT || _la==OUTPUT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(82);
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
			setState(84);
			match(FUN);
			setState(85);
			match(ID);
			setState(86);
			plist();
			setState(87);
			stmts();
			setState(88);
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
		public List<TerminalNode> ID() { return getTokens(XPLNParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XPLNParser.ID, i);
		}
		public TerminalNode CLOSE_PLIST() { return getToken(XPLNParser.CLOSE_PLIST, 0); }
		public List<TerminalNode> COMMA() { return getTokens(XPLNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XPLNParser.COMMA, i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(OPEN_PLIST);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(91);
					match(ID);
					setState(92);
					match(COMMA);
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(98);
			match(ID);
			setState(99);
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
			setState(101);
			match(ID);
			setState(102);
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
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PLIST:
			case NUMBER:
			case ID:
				{
				setState(105);
				e();
				setState(106);
				match(BOP);
				setState(107);
				e();
				}
				break;
			case UOP:
				{
				setState(109);
				match(UOP);
				setState(110);
				cond(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(113);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(114);
					match(LOP);
					setState(115);
					cond(3);
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(121);
			match(ID);
			setState(122);
			match(EQUALS);
			setState(123);
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
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				t();
				setState(126);
				match(MINUS);
				setState(127);
				e();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				t();
				setState(130);
				match(PLUS);
				setState(131);
				e();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				t();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				f();
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
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				ff();
				setState(138);
				match(MULTI);
				setState(139);
				t();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				ff();
				setState(142);
				match(DIVIDE);
				setState(143);
				t();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
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
		public TerminalNode NUMBER() { return getToken(XPLNParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(XPLNParser.ID, 0); }
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
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(ID);
				}
				break;
			case OPEN_PLIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(OPEN_PLIST);
				setState(151);
				e();
				setState(152);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u009f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\7\4"+
		"\64\n\4\f\4\16\4\67\13\4\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\7\6E\n\6\f\6\16\6H\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13`\n\13\f\13\16\13"+
		"c\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rr\n"+
		"\r\3\r\3\r\3\r\7\rw\n\r\f\r\16\rz\13\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008a\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0095\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u009d\n\21\3\21\2\3\30\22\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \2\3\3\2\b\t\2\u00a0\2\"\3\2\2\2\4.\3\2\2\2\6\65\3\2\2\2\b=\3\2"+
		"\2\2\n?\3\2\2\2\fK\3\2\2\2\16P\3\2\2\2\20S\3\2\2\2\22V\3\2\2\2\24\\\3"+
		"\2\2\2\26g\3\2\2\2\30q\3\2\2\2\32{\3\2\2\2\34\u0089\3\2\2\2\36\u0094\3"+
		"\2\2\2 \u009c\3\2\2\2\"#\5\b\5\2#)\7\6\2\2$%\5\4\3\2%&\7\6\2\2&(\3\2\2"+
		"\2\'$\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+)\3\2\2\2,/\5"+
		"\b\5\2-/\5\22\n\2.,\3\2\2\2.-\3\2\2\2/\5\3\2\2\2\60\61\5\b\5\2\61\62\7"+
		"\6\2\2\62\64\3\2\2\2\63\60\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3"+
		"\2\2\2\66\7\3\2\2\2\67\65\3\2\2\28>\5\32\16\29>\5\n\6\2:>\5\f\7\2;>\5"+
		"\16\b\2<>\5\20\t\2=8\3\2\2\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>"+
		"\t\3\2\2\2?@\7\22\2\2@A\5\30\r\2AF\5\6\4\2BC\7\30\2\2CE\5\6\4\2DB\3\2"+
		"\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\24\2\2J\13"+
		"\3\2\2\2KL\7\23\2\2LM\5\30\r\2MN\5\6\4\2NO\7\25\2\2O\r\3\2\2\2PQ\7\7\2"+
		"\2QR\5\34\17\2R\17\3\2\2\2ST\t\2\2\2TU\7\34\2\2U\21\3\2\2\2VW\7\26\2\2"+
		"WX\7\34\2\2XY\5\24\13\2YZ\5\6\4\2Z[\7\27\2\2[\23\3\2\2\2\\a\7\n\2\2]^"+
		"\7\34\2\2^`\7\21\2\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2"+
		"ca\3\2\2\2de\7\34\2\2ef\7\13\2\2f\25\3\2\2\2gh\7\34\2\2hi\5\24\13\2i\27"+
		"\3\2\2\2jk\b\r\1\2kl\5\34\17\2lm\7\3\2\2mn\5\34\17\2nr\3\2\2\2op\7\5\2"+
		"\2pr\5\30\r\3qj\3\2\2\2qo\3\2\2\2rx\3\2\2\2st\f\4\2\2tu\7\4\2\2uw\5\30"+
		"\r\5vs\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\31\3\2\2\2zx\3\2\2\2{|\7"+
		"\34\2\2|}\7\f\2\2}~\5\34\17\2~\33\3\2\2\2\177\u0080\5\36\20\2\u0080\u0081"+
		"\7\r\2\2\u0081\u0082\5\34\17\2\u0082\u008a\3\2\2\2\u0083\u0084\5\36\20"+
		"\2\u0084\u0085\7\16\2\2\u0085\u0086\5\34\17\2\u0086\u008a\3\2\2\2\u0087"+
		"\u008a\5\36\20\2\u0088\u008a\5\26\f\2\u0089\177\3\2\2\2\u0089\u0083\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\35\3\2\2\2\u008b"+
		"\u008c\5 \21\2\u008c\u008d\7\17\2\2\u008d\u008e\5\36\20\2\u008e\u0095"+
		"\3\2\2\2\u008f\u0090\5 \21\2\u0090\u0091\7\20\2\2\u0091\u0092\5\36\20"+
		"\2\u0092\u0095\3\2\2\2\u0093\u0095\5 \21\2\u0094\u008b\3\2\2\2\u0094\u008f"+
		"\3\2\2\2\u0094\u0093\3\2\2\2\u0095\37\3\2\2\2\u0096\u009d\7\33\2\2\u0097"+
		"\u009d\7\34\2\2\u0098\u0099\7\n\2\2\u0099\u009a\5\34\17\2\u009a\u009b"+
		"\7\13\2\2\u009b\u009d\3\2\2\2\u009c\u0096\3\2\2\2\u009c\u0097\3\2\2\2"+
		"\u009c\u0098\3\2\2\2\u009d!\3\2\2\2\r).\65=Faqx\u0089\u0094\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}