grammar Mx;

program: program_part* EOF;
program_part: class_def | func_def | var_def;
class_def: CLASS IDENTIFIER LEFT_BIGBRACE (var_def | func_def)* RIGHT_BIGBRACE SEMICOLON;
func_def: type? IDENTIFIER LEFT_PAREN paramlist? RIGHT_PAREN statement;
param: type IDENTIFIER;
paramlist: param (COMMA param)*;
type: type LEFT_BRACKET RIGHT_BRACKET | IDENTIFIER | INT | BOOL | STRING | VOID;
basictype_for_array: IDENTIFIER | INT | BOOL | STRING;
var_multi_def: type IDENTIFIER (COMMA IDENTIFIER)*;
var_def_and_init: type IDENTIFIER ASSIGN expression;
var_def: (var_multi_def | var_def_and_init) SEMICOLON;
var_malloc: basictype_for_array (LEFT_BRACKET expression RIGHT_BRACKET)* (LEFT_BRACKET RIGHT_BRACKET)* (LEFT_PAREN RIGHT_PAREN)?;

statement:
    var_def                                                                                             #VardefStatement
    | LEFT_BIGBRACE statement* RIGHT_BIGBRACE                                                           #Statements
    | IF LEFT_PAREN expression RIGHT_PAREN statement (ELSE statement)?                                  #IfStatement
    | FOR LEFT_PAREN expression? SEMICOLON expression? SEMICOLON expression? RIGHT_PAREN statement      #ForStatement
    | WHILE LEFT_PAREN expression RIGHT_PAREN statement                                                 #WhileStatement
    | RETURN expression? SEMICOLON                                                                      #ReturnStatement
    | BREAK SEMICOLON                                                                                   #BreakStatement
    | CONTINUE SEMICOLON                                                                                #ContinueStatement
    | expression SEMICOLON                                                                              #ExprStatement
    | SEMICOLON                                                                                         #EmptyStatememt;

expression:
    expression ASSIGN expression                                                                        #Binary
    | <assoc=right> NEW var_malloc                                                                      #New
    | expression DOT IDENTIFIER                                                                         #Member
    | expression LEFT_BRACKET expression RIGHT_BRACKET                                                  #Index
    | expression LEFT_PAREN expression_list? RIGHT_PAREN                                                #FunctionParam
    | expression (ZIZENG_OP | ZIJIAN_OP)                                                                #UnaryPos
    | <assoc=right> (ADD_OP | MINUS_OP | ZIZENG_OP | ZIJIAN_OP | NOT_OP | LOGIC_NOT_OP) expression      #UnaryPre
    | expression (MULTI_OP | DIV_OP | MOD_OP) expression                                                #Binary
    | expression (ADD_OP | MINUS_OP) expression                                                         #Binary
    | expression (LEFT_SHIFT_OP | RIGHT_SHIFT_OP) expression                                            #Binary
    | expression (XIAOYU_OP | DAYU_OP | XIAOYUDENGYU_OP | DAYUDENGYU_OP) expression                     #Binary
    | expression (EQUAL_OP | NOT_EQUAL_OP) expression                                                   #Binary
    | expression AND_OP expression                                                                      #Binary
    | expression XOR_OP expression                                                                      #Binary
    | expression OR_OP expression                                                                       #Binary
    | expression LOGIC_AND_OP expression                                                                #Binary
    | expression LOGIC_OR_OP expression                                                                 #Binary
    | LEFT_PAREN expression RIGHT_PAREN                                                                 #Sub
    | constant                                                                                          #Const
    | IDENTIFIER                                                                                        #IdentifierExpr
    | THIS                                                                                              #This
    ;
expression_list: expression (COMMA expression)*;

constant: BOOL_CONST | INT_CONST | STRING_CONST | NULL_CONST;
BOOL_CONST: TRUE | FALSE;
INT_CONST: '0' | [1-9][0-9]*;
STRING_CONST: '"' STRING_CHAR_CONST*? '"';
NULL_CONST: NULL;
fragment STRING_CHAR_CONST: '\\n' | '\\\\' | '\\"' | ~["\\\r\n];

INT: 'int';
BOOL: 'bool';
STRING: 'string';
NULL: 'null';
VOID: 'void';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
BREAK: 'break';
CONTINUE: 'continue';
RETURN: 'return';
NEW: 'new';
CLASS: 'class';
THIS: 'this';
TRUE: 'true';
FALSE: 'false';

IDENTIFIER: [A-Za-z] [A-Za-z0-9_]*;

WHITE: [ \t\n\r]+ -> skip;
Newline: ('\r' '\n'? |'\n') -> skip;
BLOCKCOMMENT: '/*' .*? '*/' -> skip;
LINECOMMENT: '//' ~[\r\n]* -> skip;


ADD_OP : '+';
MINUS_OP : '-';
MULTI_OP: '*';
DIV_OP : '/';
MOD_OP : '%';

XIAOYU_OP: '<';
DAYU_OP: '>';
XIAOYUDENGYU_OP: '<=';
DAYUDENGYU_OP: '>=';
NOT_EQUAL_OP: '!=';
EQUAL_OP: '==';

LOGIC_AND_OP: '&&';
LOGIC_OR_OP: '||';
LOGIC_NOT_OP: '!';

LEFT_SHIFT_OP: '<<';
RIGHT_SHIFT_OP: '>>';
AND_OP: '&';
OR_OP: '|';
XOR_OP: '^';
NOT_OP: '~';

ASSIGN: '=';
ZIZENG_OP: '++';
ZIJIAN_OP: '--';

DOT: '.';
LEFT_PAREN: '(';
RIGHT_PAREN: ')';
LEFT_BRACKET: '[';
RIGHT_BRACKET: ']';
LEFT_BIGBRACE: '{';
RIGHT_BIGBRACE: '}';
COMMA: ',';
COLON: ':';
SEMICOLON: ';';