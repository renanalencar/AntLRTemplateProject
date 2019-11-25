// arquivo com o conjunto de regras de produção da gramática aritmética

// nome da gramática
grammar SimpleCalc;

// conjunto de regras de produção
expr : term ( ( '+' | '-' | '*' | '/' | '=' ) term )* ';' (expr)* ;
term : number ;
number  : DIGIT+ ;	
DIGIT : '0'..'9' ;
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> channel(HIDDEN);
