grammar vNES;


/****************** LEXER  ******************/

comment
  : '#' rest_of_line
  ;

  docComment
    :  '###' rest_of_line
    ;

FunctionalEntityModifier: 'FUNCTIONAL';
NativeEntityModifier: 'NATIVE';

EntityDataType: 'ENTITY';

entityModifier: FunctionalEntityModifier | NativeEntityModifier;

Colon: ':';

Function: 'FUNCTION';

NumberDataType: 'NUMBER';

Comma: ',';

ReturnKeyword: 'RETURN';

End: 'END';

Define: 'DEF';

OpenBracket: '(';
CloseBracket: ')';


WS: [ \n\t\r]+ -> skip;



INT
   : '0' .. '9'+
   ;
Quotes: '"';

Equals: '=';
NL      : '\r'? '\n' | '\r';
/** ADD MORE SYMBOLS*/
StringLiteral: Quotes (( 'a' .. 'z' | 'A' .. 'Z' ) | ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' | ',')*) Quotes;
rest_of_line
 : ~NL* // match any token other than a line break zero or more times
 ;
datatype: EntityDataType | ID | 'NUMBER' | 'STRING';

Use: 'USE';
ID
   : ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.')*
   ;


/****************** PARSER  ******************/
program: (module+ | entity+ | useStatement+)+;

module: moduleDefinition entity* endClause;

moduleDefinition: Define 'MODULE' ID;

useStatement: 'USE' ID;

entity: comment* entityDefinition entityBody endClause;
entityDefinition: Define entityModifier* datatype Colon ID;

functionDefinition: comment* Define Function Colon ID functionDefinitionArgumentList Colon datatype;
functionDefinitionArgumentList: OpenBracket definitionArgumentSpec* CloseBracket;
definitionArgumentSpec: datatype Colon ID Comma?;

endClause: End;

statement: returnStatement;

returnStatement: ReturnKeyword expression;

functionBody: statement*;

function: functionDefinition functionBody endClause;

entityBody: entityComponent*;

entityComponent: function | property;

property: Define propertyModifier? ID Colon datatype assignment?;

propertyModifier: 'MANDETORY';

assignment: Equals expression;
methodCall: ID OpenBracket argumentSpec* CloseBracket;

argumentSpec: expression Comma?;

arithmeticOperator: Addition | Minus | Times | Devision;

expression: atom (expressionComponent)*;
expressionComponent: arithmeticOperator atom;
atom: INT | methodCall | StringLiteral | ID;
add: Addition;

Addition: '+';
Minus: '-';
Times: '*';
Devision: '/';