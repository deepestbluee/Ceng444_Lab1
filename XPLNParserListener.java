// Generated from XPLNParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XPLNParser}.
 */
public interface XPLNParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XPLNParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(XPLNParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPLNParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(XPLNParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPLNParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(XPLNParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPLNParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(XPLNParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPLNParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(XPLNParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPLNParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(XPLNParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPLNParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(XPLNParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPLNParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(XPLNParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPLNParser#ifx}.
	 * @param ctx the parse tree
	 */
	void enterIfx(XPLNParser.IfxContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPLNParser#ifx}.
	 * @param ctx the parse tree
	 */
	void exitIfx(XPLNParser.IfxContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPLNParser#wh}.
	 * @param ctx the parse tree
	 */
	void enterWh(XPLNParser.WhContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPLNParser#wh}.
	 * @param ctx the parse tree
	 */
	void exitWh(XPLNParser.WhContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPLNParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(XPLNParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPLNParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(XPLNParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPLNParser#io}.
	 * @param ctx the parse tree
	 */
	void enterIo(XPLNParser.IoContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPLNParser#io}.
	 * @param ctx the parse tree
	 */
	void exitIo(XPLNParser.IoContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPLNParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(XPLNParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPLNParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(XPLNParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPLNParser#plist}.
	 * @param ctx the parse tree
	 */
	void enterPlist(XPLNParser.PlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPLNParser#plist}.
	 * @param ctx the parse tree
	 */
	void exitPlist(XPLNParser.PlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPLNParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(XPLNParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPLNParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(XPLNParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPLNParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(XPLNParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPLNParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(XPLNParser.CondContext ctx);
}