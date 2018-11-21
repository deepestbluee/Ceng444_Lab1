parser grammar XPLNParser;

options { tokenVocab=XPLNLexer; }



start		:    stmt SEMICOLON (entry SEMICOLON)*  ;
entry		:    stmt | def			 	;
stmts		:    (stmt SEMICOLON)*			;
stmt		:    S | ifx | wh | ret | io		;
ifx		:    IF cond stmts ENDIF		;
wh		:    WHILE cond stmts ENDWH		;
ret		:    RETURN E				;
io		:    (INPUT | OUTPUT) ID		;
def		:    FUN ID plist stmts ENDFUN		;
plist		:    ( )				;
f		:    ID plist 				;
cond		:    E BOP E | cond LOP cond | UOP cond ;
