// Copyright 2020 Gonçalo Sá <goncalo.sa@consensys.net>
// Copyright 2016-2019 Federico Bond <federicobond@gmail.com>
// Licensed under the MIT license. See LICENSE file in the project root for details.

grammar Solidity;

sourceUnit
  : (
    pragmaDirective
    | importDirective
    | contractDefinition
    | enumDefinition
    | eventDefinition
    | structDefinition
    | functionDefinition
    | fileLevelConstant
    | customErrorDefinition
    | typeDefinition
    | usingForDeclaration
    )* EOF ;

//this rule is not included
pragmaDirective
  : 'pragma' pragmaName pragmaValue ';' ;

//this rule is not included
pragmaName
  : identifier ;

//this rule is not included
pragmaValue
  : '*' | version | expression ;

//this rule is not included
version
  : versionConstraint ('||'? versionConstraint)* ;

//this rule is not included
versionOperator
  : '^' | '~' | '>=' | '>' | '<' | '<=' | '=' ;

//this rule is not included
versionConstraint
  : versionOperator? VersionLiteral
  | versionOperator? DecimalNumber ;

///imp rule
importDeclaration
  : identifier ('as' identifier)? ;

///imp rule
importDirective
  : 'import' importPath ('as' identifier)? ';'
  | 'import' ('*' | identifier) ('as' identifier)? 'from' importPath ';'
  | 'import' '{' importDeclaration ( ',' importDeclaration )* '}' 'from' importPath ';' ;

///imp rule
importPath : StringLiteralFragment ;

///imp rule
contractDefinition
  : 'abstract'? ( 'contract' | 'interface' | 'library' ) identifier
    ( 'is' inheritanceSpecifier (',' inheritanceSpecifier )* )?
    '{' contractPart* '}' ;

///imp rule
inheritanceSpecifier
  : userDefinedTypeName ( '(' expressionList? ')' )? ;

///imp rule
contractPart
  : stateVariableDeclaration
  | usingForDeclaration
  | structDefinition
  | modifierDefinition
  | functionDefinition
  | eventDefinition
  | enumDefinition
  | customErrorDefinition
  | typeDefinition;

///imp rule
stateVariableDeclaration
  : typeName
    ( PublicKeyword | InternalKeyword | PrivateKeyword | ConstantKeyword | ImmutableKeyword | overrideSpecifier )*
    identifier ('=' expression)? ';' ;

///imp rule
fileLevelConstant
  : typeName ConstantKeyword identifier '=' expression ';' ;

///imp rule
customErrorDefinition
  : 'error' identifier parameterList ';' ;

//this rule is not included
typeDefinition
  : 'type' identifier
    'is'  elementaryTypeName ';' ;

///imp rule
usingForDeclaration
  : 'using' usingForObject 'for' ('*' | typeName) GlobalKeyword? ';';

///imp rule
usingForObject
  : userDefinedTypeName
  | '{' usingForObjectDirective ( ',' usingForObjectDirective )* '}';

///imp rule
usingForObjectDirective
  : userDefinedTypeName ( 'as' userDefinableOperators )?;

///imp rule
userDefinableOperators
  : '|' | '&' | '^' | '~' | '+' | '-' | '*' | '/' | '%' | '==' | '!=' | '<' | '>' | '<=' | '>=' ;

///imp rule
structDefinition
  : 'struct' identifier
    '{' ( variableDeclaration ';' (variableDeclaration ';')* )? '}' ;

///imp rule
modifierDefinition
  : 'modifier' identifier parameterList? ( VirtualKeyword | overrideSpecifier )* ( ';' | block ) ;

///imp rule
modifierInvocation
  : identifier ( '(' expressionList? ')' )? ;

///imp rule
functionDefinition
  : functionDescriptor parameterList modifierList returnParameters? ( ';' | block ) ;

///imp rule
functionDescriptor
  : 'function' identifier?
  | ConstructorKeyword
  | FallbackKeyword
  | ReceiveKeyword ;

///imp rule
returnParameters
  : 'returns' parameterList ;

///imp rule
modifierList
  : (ExternalKeyword | PublicKeyword | InternalKeyword | PrivateKeyword | VirtualKeyword | stateMutability | modifierInvocation | overrideSpecifier )* ;

//this rule is not included
eventDefinition
  : 'event' identifier eventParameterList AnonymousKeyword? ';' ;

///imp rule
enumValue
  : identifier ;

///imp rule
enumDefinition
  : 'enum' identifier '{' enumValue? (',' enumValue)* '}' ;

///imp rule
parameterList
  : '(' ( parameter (',' parameter)* )? ')' ;

///imp rule
parameter
  : typeName storageLocation? identifier? ;

//this rule is not included
eventParameterList
  : '(' ( eventParameter (',' eventParameter)* )? ')' ;

//this rule is not included
eventParameter
  : typeName IndexedKeyword? identifier? ;

///imp rule
functionTypeParameterList
  : '(' ( functionTypeParameter (',' functionTypeParameter)* )? ')' ;

///imp rule
functionTypeParameter
  : typeName storageLocation? ;

///imp rule
variableDeclaration
  : typeName storageLocation? identifier ;

///imp rule
typeName
  : elementaryTypeName
  | userDefinedTypeName
  | mapping
  | typeName '[' expression? ']'
  | functionTypeName
  | 'address' 'payable' ;

///imp rule
userDefinedTypeName
  : identifier ( '.' identifier )* ;

///imp rule
mappingKey
  : elementaryTypeName
  | userDefinedTypeName ;

///imp rule
mapping
  : 'mapping' '(' mappingKey mappingKeyName? '=>' typeName mappingValueName? ')' ;

///imp rule
mappingKeyName : identifier;
mappingValueName : identifier;

///imp rule
functionTypeName
  : 'function' functionTypeParameterList
    ( InternalKeyword | ExternalKeyword | stateMutability )*
    ( 'returns' functionTypeParameterList )? ;

///imp rule
storageLocation
  : 'memory' | 'storage' | 'calldata';

///imp rule
stateMutability
  : PureKeyword | ConstantKeyword | ViewKeyword | PayableKeyword ;

///imp rule
block
  : '{' statement* '}' ;

///imp rule
statement
  : ifStatement
  | tryStatement
  | whileStatement
  | forStatement
  | block
  | inlineAssemblyStatement
  | doWhileStatement
  | continueStatement
  | breakStatement
  | returnStatement
  | throwStatement
  | emitStatement
  | simpleStatement
  | uncheckedStatement
  | revertStatement;

///imp rule
expressionStatement
  : expression ';' ;

///imp rule
ifStatement
  : 'if' '(' expression ')' statement ( 'else' statement )? ;

//this rule is not included
tryStatement : 'try' expression returnParameters? block catchClause+ ;

// In reality catch clauses still are not processed as below
// the identifier can only be a set string: "Error". But plans
// of the Solidity team include possible expansion so we'll
// leave this as is, befitting with the Solidity docs.
//this rule is not included
catchClause : 'catch' ( identifier? parameterList )? block ;

///imp rule
whileStatement
  : 'while' '(' expression ')' statement ;

///imp rule
simpleStatement
  : ( variableDeclarationStatement | expressionStatement ) ;

//this rule is not included
uncheckedStatement
  : 'unchecked' block ;

///imp rule
forStatement
  : 'for' '(' ( simpleStatement | ';' ) ( expressionStatement | ';' ) expression? ')' statement ;

//this rule is not included
inlineAssemblyStatement
  : 'assembly' StringLiteralFragment? ('(' inlineAssemblyStatementFlag ')')? assemblyBlock ;

//this rule is not included
inlineAssemblyStatementFlag
  : stringLiteral;

///imp rule
doWhileStatement
  : 'do' statement 'while' '(' expression ')' ';' ;

///imp rule
continueStatement
  : 'continue' ';' ;

///imp rule
breakStatement
  : 'break' ';' ;

///imp rule
returnStatement
  : 'return' expression? ';' ;

///imp rule
throwStatement
  : 'throw' ';' ;

//this rule is not included
emitStatement
  : 'emit' functionCall ';' ;

///imp rule
revertStatement
  : 'revert' functionCall ';' ;

///imp rule
variableDeclarationStatement
  : ( 'var' identifierList | variableDeclaration | '(' variableDeclarationList ')' ) ( '=' expression )? ';';

///imp rule
variableDeclarationList
  : variableDeclaration? (',' variableDeclaration? )* ;

///imp rule
identifierList
  : '(' ( identifier? ',' )* identifier? ')' ;

///imp rule
elementaryTypeName
  : 'address' | 'bool' | 'string' | 'var' | Int | Uint | 'byte' | Byte | Fixed | Ufixed ;

Int
  : 'int' (NumberOfBits)? ;

Uint
  : 'uint' (NumberOfBits)? ;

Byte
  : 'bytes' (NumberOfBytes)?;

Fixed
  : 'fixed' ( NumberOfBits 'x' [0-9]+ )? ;

Ufixed
  : 'ufixed' ( NumberOfBits 'x' [0-9]+ )? ;

fragment
NumberOfBits
  : '8' | '16' | '24' | '32' | '40' | '48' | '56' | '64' | '72' | '80' | '88' | '96' | '104' | '112' | '120' | '128' | '136' | '144' | '152' | '160' | '168' | '176' | '184' | '192' | '200' | '208' | '216' | '224' | '232' | '240' | '248' | '256' ;

fragment
NumberOfBytes
  : [1-9] | [12] [0-9] | '3' [0-2] ;

///imp rule
expression
  : expression ('++' | '--')
  | 'new' typeName
  | expression '[' expression ']'
  | expression '[' expression? ':' expression? ']'
  | expression '.' identifier
  | expression '{' nameValueList '}'
  | 'require' '(' expression ',' stringLiteral ')'
  | expression '(' functionCallArguments ')'
  | '(' expression ')'
  | ('++' | '--') expression
  | ('+' | '-') expression
  | 'delete' expression
  | '!' expression
  | '~' expression
  | <assoc=right> expression '**' expression
  | expression ('*' | '/' | '%') expression
  | expression ('+' | '-') expression
  | expression ('<<' | '>>') expression
  | expression '&' expression
  | expression '^' expression
  | expression '|' expression
  | expression ('<' | '>' | '<=' | '>=') expression
  | expression ('==' | '!=') expression
  | expression '&&' expression
  | expression '||' expression
  | <assoc=right> expression '?' expression ':' expression
  | expression ('=' | '|=' | '^=' | '&=' | '<<=' | '>>=' | '+=' | '-=' | '*=' | '/=' | '%=') expression
  | primaryExpression ;

///imp rule
primaryExpression
  : BooleanLiteral
  | numberLiteral
  | hexLiteral
  | stringLiteral
  | identifier
  | TypeKeyword
  | PayableKeyword
  | tupleExpression
  | typeName;

///imp rule
expressionList
  : expression (',' expression)* ;

///imp rule
nameValueList
  : nameValue (',' nameValue)* ','? ;

///imp rule
nameValue
  : identifier ':' expression ;

///imp rule
functionCallArguments
  : '{' nameValueList? '}'
  | expressionList? ;

///imp rule
functionCall
  : expression '(' functionCallArguments ')' ;

//this rule is not included
assemblyBlock
  : '{' assemblyItem* '}' ;

//this rule is not included
assemblyItem
  : identifier
  | assemblyBlock
  | assemblyExpression
  | assemblyLocalDefinition
  | assemblyAssignment
  | assemblyStackAssignment
  | labelDefinition
  | assemblySwitch
  | assemblyFunctionDefinition
  | assemblyFor
  | assemblyIf
  | BreakKeyword
  | ContinueKeyword
  | LeaveKeyword
  | numberLiteral
  | stringLiteral
  | hexLiteral ;

//this rule is not included
assemblyExpression
  : assemblyCall | assemblyLiteral | assemblyMember ;

//this rule is not included
assemblyMember
  : identifier '.' identifier ;

//this rule is not included
assemblyCall
  : ( 'return' | 'address' | 'byte' | identifier ) ( '(' assemblyExpression? ( ',' assemblyExpression )* ')' )? ;

//this rule is not included
assemblyLocalDefinition
  : 'let' assemblyIdentifierOrList ( ':=' assemblyExpression )? ;

//this rule is not included
assemblyAssignment
  : assemblyIdentifierOrList ':=' assemblyExpression;

//this rule is not included
assemblyIdentifierOrList
  : identifier
  | assemblyMember
  | assemblyIdentifierList
  | '(' assemblyIdentifierList ')';

//this rule is not included
assemblyIdentifierList
  : identifier ( ',' identifier )* ;

//this rule is not included
assemblyStackAssignment
  : assemblyExpression '=:' identifier ;

//this rule is not included
labelDefinition
  : identifier ':' ;

//this rule is not included
assemblySwitch
  : 'switch' assemblyExpression assemblyCase* ;

//this rule is not included
assemblyCase
  : 'case' assemblyLiteral assemblyBlock
  | 'default' assemblyBlock ;

//this rule is not included
assemblyFunctionDefinition
  : 'function' identifier '(' assemblyIdentifierList? ')'
    assemblyFunctionReturns? assemblyBlock ;

//this rule is not included
assemblyFunctionReturns
  : ( '->' assemblyIdentifierList ) ;

//this rule is not included
assemblyFor
  : 'for' ( assemblyBlock | assemblyExpression )
    assemblyExpression ( assemblyBlock | assemblyExpression ) assemblyBlock ;

//this rule is not included
assemblyIf
  : 'if' assemblyExpression assemblyBlock ;

//this rule is not included
assemblyLiteral
  : stringLiteral | DecimalNumber | HexNumber | hexLiteral | BooleanLiteral ;

///imp rule
tupleExpression
  : '(' ( expression? ( ',' expression? )* ) ')'
  | '[' ( expression ( ',' expression )* )? ']' ;

///imp rule
numberLiteral
  : (DecimalNumber | HexNumber) NumberUnit? ;

// some keywords need to be added here to avoid ambiguities
// for example, "revert" is a keyword but it can also be a function name
///imp rule
identifier
  : ('from' | 'calldata' | 'receive' | 'callback' | 'revert' | 'error' | 'address' | GlobalKeyword | ConstructorKeyword | PayableKeyword | LeaveKeyword | Identifier) ;

BooleanLiteral
  : 'true' | 'false' ;

DecimalNumber
  : ( DecimalDigits | (DecimalDigits? '.' DecimalDigits) ) ( [eE] '-'? DecimalDigits )? ;

fragment
DecimalDigits
  : [0-9] ( '_'? [0-9] )* ;

HexNumber
  : '0' [xX] HexDigits ;

fragment
HexDigits
  : HexCharacter ( '_'? HexCharacter )* ;

NumberUnit
  : 'wei' | 'gwei' | 'szabo' | 'finney' | 'ether'
  | 'seconds' | 'minutes' | 'hours' | 'days' | 'weeks' | 'years' ;

///imp rule
hexLiteral : HexLiteralFragment+ ;

HexLiteralFragment : 'hex' ('"' HexDigits? '"' | '\'' HexDigits? '\'') ;

fragment
HexCharacter
  : [0-9A-Fa-f] ;

//this rule is included
ReservedKeyword
  : 'abstract'
  | 'after'
  | 'case'
  | 'catch'
  | 'default'
  | 'final'
  | 'in'
  | 'inline'
  | 'let'
  | 'match'
  | 'null'
  | 'of'
  | 'relocatable'
  | 'static'
  | 'switch'
  | 'try'
  | 'typeof' ;

AnonymousKeyword : 'anonymous' ;
BreakKeyword : 'break' ;
ConstantKeyword : 'constant' ;
ImmutableKeyword : 'immutable' ;
ContinueKeyword : 'continue' ;
LeaveKeyword : 'leave' ;
ExternalKeyword : 'external' ;
IndexedKeyword : 'indexed' ;
InternalKeyword : 'internal' ;
PayableKeyword : 'payable' ;
PrivateKeyword : 'private' ;
PublicKeyword : 'public' ;
VirtualKeyword : 'virtual' ;
PureKeyword : 'pure' ;
TypeKeyword : 'type' ;
ViewKeyword : 'view' ;
GlobalKeyword : 'global' ;

ConstructorKeyword : 'constructor' ;
FallbackKeyword : 'fallback' ;
ReceiveKeyword : 'receive' ;

///imp rule
overrideSpecifier : 'override' ( '(' userDefinedTypeName (',' userDefinedTypeName)* ')' )? ;

Identifier
  : IdentifierStart IdentifierPart* ;

fragment
IdentifierStart
  : [a-zA-Z$_] ;

fragment
IdentifierPart
  : [a-zA-Z0-9$_] ;

///imp rule
stringLiteral
  : StringLiteralFragment+ ;

StringLiteralFragment
  : 'unicode'? ( '"' DoubleQuotedStringCharacter* '"' | '\'' SingleQuotedStringCharacter* '\'' ) ;

fragment
DoubleQuotedStringCharacter
  : ~["\r\n\\] | ('\\' .) ;

fragment
SingleQuotedStringCharacter
  : ~['\r\n\\] | ('\\' .) ;

VersionLiteral
  : [0-9]+ '.' [0-9]+ ('.' [0-9]+)? ;

WS
  : [ \t\r\n\u000C]+ -> skip ;

COMMENT
  : '/*' .*? '*/' -> channel(HIDDEN) ;

LINE_COMMENT
  : '//' ~[\r\n]* -> channel(HIDDEN) ;