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
IF			: 'if' 		;
WHILE			: 'while'	;
ENDIF			: 'endf'	;
ENDWH			: 'endw'	;
FUN			: 'fun'		;
ENDFUN			: 'endfun'	;



NEWLINE    		: ('\r'? '\n' | '\r')+ 	-> skip		;
COMMENTS        : ('/*' .*? '*/' | '//' ~'\n'* '\n' ) -> skip;

ID			: [a-zA-Z]+ ;
NUMBER      : DIGIT+ ([.,] DIGIT+)? 		;
WS		: [ \t\r\n]+ -> skip;  
