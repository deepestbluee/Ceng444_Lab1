lexer grammar XPLNLexer;

fragment LOWERCASE  	: [a-z] 			;
fragment UPPERCASE  	: [A-Z] 			;
fragment DIGIT 		: [0-9] 			;
BOP 			: '<'| '<=' | '==' | '>' | '>=' ;
LOP 			: 'and' | 'or' 			;
UOP 			: '!(not)' 			;
SEMICOLON		: ';'				;
RETURN			: 'return'			;
INPUT			: 'input'			;
OUTPUT			: 'output'			;
OPEN_PLIST		: '('				;
CLOSE_PLIST		: ')'				;
EQUALS			: ':='				;
MINUS			: '+'				;
PLUS			: '-'				;
MULTI			: '*'				;
DIVIDE			: '/'				;
COMMA			: ','				;
IF			: 'if' 		;
WHILE			: 'while'	;
ENDIF			: 'endi'	;
ENDWH			: 'endw'	;
FUN			: 'fun'		;
ENDFUN			: 'endf'	;
ELSE			: 'else'	;


NEWLINE    		: ('\r'? '\n' | '\r')+ 	-> skip		;
COMMENTS        : ('/*' .*? '*/' | '//' ~'\n'* '\n' ) -> skip;

NUMBER      : DIGIT+ ([.,] DIGIT+)? 		;
ID			: [a-zA-Z] AA ;
AA          : (LOWERCASE | UPPERCASE | DIGIT) AA | ; 
WS		: [ \t\r\n]+ -> skip;  
