grammar Mx;

INT: 'int';
BOOL: 'bool';
STRING: 'string';
NULL: 'null';
VOID: 'void';
TRUE: 'true';
FALSE: 'false';
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

WHITE: [ \t\n\r]+ -> skip;
//BLOCKCOMMENT: '/*' [\s\S]*? '*/' -> skip;
LINECOMMENT: '//' ~[\\r\n]* ('\n' | '\r\n' | EOF) -> skip;


fragment BOOL_CONST: TRUE | FALSE;
fragment INT_CONST: [0-9]+;
fragment STRING_CHAR_CONST: '\\n' | '\\\\' | '\\"' | ~['\\\r\n];
fragment STRING_CONST: '"' STRING_CHAR_CONST+ '"';
fragment NULL_CONST: NULL;
CONST: BOOL_CONST | INT_CONST | STRING_CONST | NULL_CONST;

IDENTIFIER: [A-Za-z] [A-Za-z0-9_]*;
expression_list: expression (COMMA expression)*;
expression:
    CONST                                                                                               #Const
    | IDENTIFIER                                                                                        #IdentifierExpr
    | THIS                                                                                              #This
    | expression DOT IDENTIFIER                                                                         #Member
    | expression LEFT_BRACKET expression RIGHT_BRACKET                                                  #Index
    | expression LEFT_PAREN expression_list? RIGHT_PAREN                                                #FunctionParam
    | expression (ZIZENG_OP | ZIJIAN_OP)                                                                #UnaryPos
    | <assoc=right> (ADD_OP | MINUS_OP | ZIZENG_OP | ZIJIAN_OP | NOT_OP | LOGIC_NOT_OP) expression      #UnaryPre
    | expression (ADD_OP | MINUS_OP | MULTI_OP | DIV_OP | MOD_OP | LEFT_SHIFT_OP | RIGHT_SHIFT_OP | XIAOYU_OP | XIAOYUDENGYU_OP | DAYU_OP | DAYUDENGYU_OP | EQUAL_OP | NOT_EQUAL_OP | AND_OP | OR_OP | XOR_OP | LOGIC_AND_OP | LOGIC_OR_OP) expression   #Binary
    | NEW var_malloc                                                                                    #New
    | expression ASSIGN expression                                                                      #Binary
    ;

var_multi_def: type IDENTIFIER (COMMA IDENTIFIER)*;
var_def_and_init: type IDENTIFIER ASSIGN expression;
var_def: (var_multi_def | var_def_and_init) SEMICOLON;
var_malloc: type (LEFT_BRACKET CONST RIGHT_BRACKET)* (LEFT_BRACKET RIGHT_BRACKET)* (LEFT_PAREN RIGHT_PAREN)?;
statement:
    var_def                                                                                             #VardefStatement
    | LEFT_BIGBRACE statement* RIGHT_BIGBRACE                                                           #Statements
    | IF LEFT_PAREN expression RIGHT_PAREN statement (ELSE statement)?                                  #IfStatement
    | FOR LEFT_PAREN statement? SEMICOLON expression? SEMICOLON statement? RIGHT_PAREN statement        #ForStatement
    | WHILE LEFT_PAREN expression RIGHT_PAREN statement                                                 #WhileStatement
    | RETURN expression? SEMICOLON                                                                      #ReturnStatement
    | BREAK SEMICOLON                                                                                   #BreakStatement
    | CONTINUE SEMICOLON                                                                                #ContinueStatement
    | expression SEMICOLON                                                                              #ExprStatement
    ;
program: program_part* EOF;
program_part: class_def | func_def | var_def;
type: type LEFT_BRACKET RIGHT_BRACKET | IDENTIFIER | INT | BOOL | STRING | VOID;
class_def: CLASS IDENTIFIER LEFT_BIGBRACE (var_def | func_def)* RIGHT_BIGBRACE SEMICOLON;
param: type IDENTIFIER;
paramlist: param (COMMA param)*;
func_def: type? IDENTIFIER LEFT_PAREN paramlist? RIGHT_PAREN LEFT_BIGBRACE statement* RIGHT_BIGBRACE;
