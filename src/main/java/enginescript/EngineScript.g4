parser grammar EngineScript;

options {
    tokenVocab = EngineScriptLexer;
}

program: HEADER IDENTIFIER block?;

block: statement (statement)*;

statement:
(
   ifStatement | functionDeclartion | entryStatement | entryParameterStatement
   | expressionStatement | WS
   | requireStatement | structureStatement | classStatement | returnStatement
);

expression:
     IDENTIFIER                                          # IdentifierExpression
   | STRINGLITERAL                                       # StringExpression
   | DECIMALLITERAL                                      # DecimalExpression
   | BOOLLITERAL                                         # BooleanExpression
   | expression ('*' | '/') expression                   # ArithmeticOrLogicalExpression
   | expression ('+' | '-') expression                   # ArithmeticOrLogicalExpression
   | expression comparisonOperator expression            # ComparisonExpression
   | IDENTIFIER '(' callParameters? ')'                  # CallExpression
   | expression '.' IDENTIFIER                           # FieldExpression
   | expression '.' IDENTIFIER '(' callParameters? ')'   # MethodCallExpression
   | expression '[' expression ']'                       # IndexExpression
   | IDENTIFIER? IDENTIFIER (':=' expression)?           # AssignExpression;

expressionStatement:
   expression ';';

returnStatement:
 'return' expression? SEMI;

comparisonOperator
   : RELATION
   | BIGGER
   | SMALLER
   ;

ifStatement:
   IF expression
    LCURLY
        block
    RCURLY
    (:
      ELSE
        LCURLY
          block
        RCURLY)?;


parameterList:
    IDENTIFIER IDENTIFIER (COMMA IDENTIFIER IDENTIFIER)*; // parameter list

entryParameterStatement:
  ENTRY LPAREN parameterList RPAREN LCURLY block RCURLY;

entryStatement:
  ENTRY LCURLY block RCURLY;

functionDeclartion:
   FUNCTION
     IDENTIFIER
      LPAREN
       (parameterList)?
      RPAREN
   LCURLY block? RCURLY;

requireStatement:
  INCLUDE STRINGLITERAL SEMI;

callParameters:
  expression (',' expression)* ;

structureStatement:
  STRUCTURE IDENTIFIER
    LCURLY
      (IDENTIFIER IDENTIFIER SEMI)*
    RCURLY;

classStatement:
  CLASS IDENTIFIER
    LCURLY
      block
    RCURLY;