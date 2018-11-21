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

IF			: 'if' 		;
WHILE			: 'while'	;
ENDIF			: 'endf'	;
ENDWH			: 'endw'	;
FUN			: 'fun'		;
ENDFUN			: 'endfun'	;

S			: ID ':=' E			;
E			: T '-' E | T '+' E | T		;
T			: F '*' T | F '/' T | F		;
F			: ID | NUMBER | '(' E ')'	;


ID			: (LOWERCASE | UPPERCASE)IDC		;
fragment IDC		: (LOWERCASE | UPPERCASE)IDC | 		;
NUMBER         		: DIGIT+ ([.,] DIGIT+)? 		;
WHITESPACE		: ' ' -> skip 				;  
NEWLINE    		: ('\r'? '\n' | '\r')+ 			;
