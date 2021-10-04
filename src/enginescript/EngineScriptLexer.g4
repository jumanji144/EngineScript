lexer grammar EngineScriptLexer;

INCLUDE: 'include' | 'inc';

ENTRY: 'entry'; // entry function

FUNCTION: 'function'; // function declaration

RETURN: 'return';

HEADER: 'script';

STRUCTURE: 'structure' | 'struct';

CLASS: 'class' | 'member';

// punctuation
LPAREN                 : '(';
RPAREN                 : ')';
LCURLY                 : '{';
RCURLY                 : '}';
LBRACKET               : '[';
RBRACKET               : ']';
RELATION               : '=';
COMMA                  : ',';
SEMI                   : ';';
COLON                  : ':';
DOT                    : '.';
INCREMENT              : '++';
DECREMENT              : '--';
ASSIGN                 : ':=';

PLUS                   : '+';
MINUS                  : '-';
POW                    : '^';
MUL                    : '*';
DIV                    : '/';
SMALLER                : '<';
BIGGER                 : '>';

ADDASSIGN             : '+=';
SUBASSIGN             : '-=';
MULASSIGN             : '*=';
DIVASSIGN             : '/=';

// keywords
IF: 'if' | 'when';
ELSE: 'else' | 'otherwise';

// Operations

AND: '&' | 'and';
OR: '|' | 'or';
NOT: '!' | 'not';

// fragments
fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;

IDENTIFIER: ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*;
STRINGLITERAL: '"' ~ ["\r\n]* '"';
DECIMALLITERAL:    ('0' | [1-9] (Digits? | '.'+ Digits)) [lL]?;
BOOLLITERAL:       'true'
            |       'false'
            ;

WS              : [ \t\n\r]+ -> skip ;

