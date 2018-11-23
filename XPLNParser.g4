parser grammar XPLNParser;

options { tokenVocab=XPLNLexer; }



start	:    stmt SEMICOLON (entry SEMICOLON)*  ;
entry	:    stmt | def			 	;
stmts	:    (stmt SEMICOLON)*			;
stmt	:    s | ifx | wh | ret | io		;
ifx		:    IF cond stmts ENDIF		;
wh		:    WHILE cond stmts ENDWH		;
ret		:    RETURN e				;
io		:    (INPUT | OUTPUT) ID		;
def		:    FUN ID plist stmts ENDFUN		;
plist	:    OPEN_PLIST (ID)+ CLOSE_PLIST				;
f		:    ID plist 				;
cond	:    e BOP e | cond LOP cond | UOP cond ;


s			: ID EQUALS e			;
e			: t MINUS e | t PLUS e | t		;
t			: ff MULTI t | ff DIVIDE t | ff		;
ff			: ID | NUMBER | OPEN_PLIST e CLOSE_PLIST	;