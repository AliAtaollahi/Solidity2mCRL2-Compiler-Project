// Copyright 2020 Gonçalo Sá <goncalo.sa@consensys.net>
// Copyright 2016-2019 Federico Bond <federicobond@gmail.com>
// Licensed under the MIT license. See LICENSE file in the project root for details.

grammar Solidity;

@header{
    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.declaration.utility.*;
    import main.ast.nodes.statement.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.modifier.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.primary.*;
    import main.ast.nodes.expression.value.*;
//    import main.ast.nodes.expression.value.primitive.*;
    import main.ast.nodes.expression.type.*;
    import main.ast.nodes.expression.type.primitive.*;
}

sourceUnit returns [SourceUnit sourceUnitRet]
  :
    {
        $sourceUnitRet = new SourceUnit();
        $sourceUnitRet.setLine(1);
    }
    (
    pragmaDirective //this rule is not included
    | i = importDirective { $sourceUnitRet.addImportDirective($i.importDirectiveRet); }
    | co = contractDefinition { $sourceUnitRet.addContractDefinition($co.contractDefinitionRet); }
    | en = enumDefinition { $sourceUnitRet.addEnumDefinition($en.enumDefinitionRet); }
    | eventDefinition //this rule is not included
    | s = structDefinition { $sourceUnitRet.addStructDefinition($s.structDefinitionRet); }
    | fu = functionDefinition { $sourceUnitRet.addFunctionDefinition($fu.functionDefinitionRet); }
    | fi = fileLevelConstant { $sourceUnitRet.addFileLevelConstant($fi.fileLevelConstantRet); }
    | cu = customErrorDefinition { $sourceUnitRet.addCustomErrorDefinition($cu.customErrorDefinitionRet); }
    | typeDefinition //this rule is not included
    | u = usingForDeclaration { $sourceUnitRet.addUsingForDeclaration($u.usingForDeclarationRet); }
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
importDeclaration returns [ImportElement importElementRet]
  : id = identifier ('as' as = identifier)? { $importElementRet = new ImportElement($id.text, $as.text); };

///imp rule
importDirective returns [ImportDirective importDirectiveRet]
  : im = 'import'
    (
        ip = importPath ('as' as = identifier)? ';'
        {
            $importDirectiveRet = new ImportDirective($ip.text);
            $importDirectiveRet.setAlias($as.text);
        }

        | el = importElement ('as' as = identifier)? 'from' ip = importPath  ';'
        {
            $importDirectiveRet = new ImportDirective($ip.text);
            $importDirectiveRet.addImportElement($el.text, $as.text);
        }

        | { $importDirectiveRet = new ImportDirective(); }
        '{' id = importDeclaration { $importDirectiveRet.addImportElement($id.importElementRet); }
        ( ',' newId = importDeclaration { $importDirectiveRet.addImportElement($newId.importElementRet); } )* '}'
        'from' ip = importPath ';' { $importDirectiveRet.setImportPath($ip.text); }
    )
    { $importDirectiveRet.setLine($im.line); };

importElement : ('*' | identifier);

///imp rule
importPath : StringLiteralFragment;

///imp rule
contractDefinition returns [ContractDefinition contractDefinitionRet]
  : (ab1 = 'abstract')? ab2 = ( 'contract' | 'interface' | 'library' ) i = identifier
    {
        $contractDefinitionRet = new ContractDefinition($i.identifierRet);
        if($ab1.text != null)
        {
            $contractDefinitionRet.setLine($ab1.line);
            $contractDefinitionRet.setIsAbstract(true);
        }
        else $contractDefinitionRet.setLine($ab2.line);
    }
    (
        'is' i1 = inheritanceSpecifier { $contractDefinitionRet.addInheritanceSpecifier($i1.inheritanceSpecifierRet); }
        (',' i2 = inheritanceSpecifier { $contractDefinitionRet.addInheritanceSpecifier($i2.inheritanceSpecifierRet); } )*
    )?
    '{' (c = contractPart { $contractDefinitionRet.addContractPart($c.contractPartRet); } )* '}';

///imp rule
inheritanceSpecifier returns [InheritanceSpecifier inheritanceSpecifierRet]
  : u = userDefinedTypeName { $inheritanceSpecifierRet = new InheritanceSpecifier($u.userDefinedTypeNameRet); }
    ( '('
    ( e = expressionList { $inheritanceSpecifierRet.setExpressionList($e.expressionListRet); } )? ')' )? ;

///imp rule
contractPart returns [ContractPart contractPartRet]
  : st = stateVariableDeclaration { $contractPartRet = $st.stateVariableDeclarationRet; }
    | us = usingForDeclaration { $contractPartRet = $us.usingForDeclarationRet; }
    | str = structDefinition { $contractPartRet = $str.structDefinitionRet; }
    | mo = modifierDefinition { $contractPartRet = $mo.modifierDefinitionRet; }
    | fu = functionDefinition { $contractPartRet = $fu.functionDefinitionRet; }
    | ev = eventDefinition //this rule is not included
    | en = enumDefinition { $contractPartRet = $en.enumDefinitionRet; }
    | cu = customErrorDefinition { $contractPartRet = $cu.customErrorDefinitionRet; }
    | ty = typeDefinition; //this rule is not included

///imp rule
stateVariableDeclaration returns [StateVariableDeclaration stateVariableDeclarationRet]
  : t = typeName
    {
        $stateVariableDeclarationRet = new StateVariableDeclaration($t.typeNameRet);
        $stateVariableDeclarationRet.setLine($t.typeNameRet.getLine());
    }
    (
        m1 = (PublicKeyword | InternalKeyword | PrivateKeyword | ConstantKeyword | ImmutableKeyword)
        { $stateVariableDeclarationRet.addModifier(new OtherModifers($m1.text)); }
        | m2 = overrideSpecifier { $stateVariableDeclarationRet.addModifier($m2.overrideSpecifierRet); }
    )*
    i = identifier { $stateVariableDeclarationRet.setName($i.identifierRet); }
    ('=' e = expression { $stateVariableDeclarationRet.setValue($e.expressionRet); } )? ';' ;

///imp rule
fileLevelConstant returns [FileLevelConstant fileLevelConstantRet]
  : t = typeName ConstantKeyword i = identifier '=' e = expression ';'
    {
        $fileLevelConstantRet = new FileLevelConstant($t.typeNameRet, $i.identifierRet, $e.expressionRet);
        $fileLevelConstantRet.setLine($t.typeNameRet.getLine());
    };

///imp rule
customErrorDefinition returns [CustomErrorDefinition customErrorDefinitionRet]
  : e = 'error' i = identifier p = parameterList ';'
    {
        $customErrorDefinitionRet = new CustomErrorDefinition($i.identifierRet, $p.parameterListRet);
        $customErrorDefinitionRet.setLine($e.line);
    };

//this rule is not included
typeDefinition
  : 'type' identifier
    'is'  elementaryTypeName ';' ;

///imp rule
usingForDeclaration returns [UsingForDeclaration usingForDeclarationRet]
  : u = 'using' ufo = usingForObject 'for'
    {
        $usingForDeclarationRet = new UsingForDeclaration($ufo.usingForObjectRet);
        $usingForDeclarationRet.setLine($u.line);
    }
    (
        '*' { $usingForDeclarationRet.setAllType(true); }
        | t = typeName { $usingForDeclarationRet.setType($t.typeNameRet); }
    )
    gk = GlobalKeyword? { if($gk.text != null) $usingForDeclarationRet.setGlobal(true); }
    ';' ;

///imp rule
usingForObject returns [UsingForObject usingForObjectRet]
  : u = userDefinedTypeName
    {
        $usingForObjectRet = new UsingForObject($u.userDefinedTypeNameRet);
        $usingForObjectRet.setLine($u.userDefinedTypeNameRet.getLine());
    }
    | br = '{'
    {
      $usingForObjectRet = new UsingForObject();
      $usingForObjectRet.setLine($br.line);
    }
    o1 = usingForObjectDirective { $usingForObjectRet.addObjectDirective($o1.usingForObjectDirectiveRet); }
    ( ',' o2 = usingForObjectDirective { $usingForObjectRet.addObjectDirective($o2.usingForObjectDirectiveRet); } )* '}';

///imp rule
usingForObjectDirective returns [UsingForObjectDirective usingForObjectDirectiveRet]
  : udt = userDefinedTypeName
    {
        $usingForObjectDirectiveRet = new UsingForObjectDirective($udt.userDefinedTypeNameRet);
        $usingForObjectDirectiveRet.setLine($udt.userDefinedTypeNameRet.getLine());
    }
    ( 'as' udo = userDefinableOperators { $usingForObjectDirectiveRet.setAliasOperator($udo.userDefinableOperatorRet); } )?;

///imp rule
userDefinableOperators returns [UserDefinableOperator userDefinableOperatorRet]
  : op = ( '|' | '&' | '^' | '~' | '+' | '-' | '*' | '/' | '%' | '==' | '!=' | '<' | '>' | '<=' | '>=' )
    { $userDefinableOperatorRet = UserDefinableOperator.fromString($op.text); };

///imp rule
structDefinition returns [StructDefinition structDefinitionRet]
  : s = 'struct' id = identifier
    {
        $structDefinitionRet = new StructDefinition($id.text);
        $structDefinitionRet.setLine($s.line);
    }
    '{' (
    vd = variableDeclaration ';' { $structDefinitionRet.addVariableDeclaration($vd.variableDeclarationRet); }
    ( newVd = variableDeclaration ';' { $structDefinitionRet.addVariableDeclaration($newVd.variableDeclarationRet); } )*
    )? '}';

///imp rule
modifierDefinition returns [ModifierDefinition modifierDefinitionRet]
  : m = 'modifier'
    i = identifier
    {
        $modifierDefinitionRet = new ModifierDefinition($i.identifierRet);
        $modifierDefinitionRet.setLine($m.line);
    }
    ( p = parameterList { $modifierDefinitionRet.setParameterList($p.parameterListRet); } )?
    (
        m1 = VirtualKeyword { $modifierDefinitionRet.setModifier(new OtherModifers($m1.text)); }
        | m2 = overrideSpecifier { $modifierDefinitionRet.setModifier($m2.overrideSpecifierRet); }
    )*
    ( ';' | b = block { $modifierDefinitionRet.setScope($b.blockRet); } ) ;

///imp rule
modifierInvocation returns [ModifierInvocation modifierInvocationRet]
  : i = identifier { $modifierInvocationRet = new ModifierInvocation($i.identifierRet); }
    (
        { $modifierInvocationRet.setParanthesized(true); }
        '('
        (
            e = expressionList
            { $modifierInvocationRet.setExpressionList($e.expressionListRet); }
        )?
        ')'
    )?;

///imp rule
functionDefinition returns [FunctionDefinition functionDefinitionRet]
  : fd = functionDescriptor pl = parameterList ml = modifierList
    {
        $functionDefinitionRet = new FunctionDefinition($fd.functionDescriptorRet, $pl.parameterListRet, $ml.modifierListRet);
        $functionDefinitionRet.setLine($fd.functionDescriptorRet.getLine());
    }
    (r = returnParameters { $functionDefinitionRet.setReturnParameterList($r.returnParametersRet); } )?
    (
        ';'
        | b = block { $functionDefinitionRet.setScope($b.blockRet); }
    );

///imp rule
functionDescriptor returns [PrimaryExpression functionDescriptorRet]
  : (
        fd = 'function'
        {
            $functionDescriptorRet = new FunctionDescriptor();
            $functionDescriptorRet.setLine($fd.line);
        }
        ( i = identifier
        {
            $functionDescriptorRet = new FunctionDescriptor($i.identifierRet);
            $functionDescriptorRet.setLine($fd.line);
        } )?
        | f1 = ConstructorKeyword
        {
            $functionDescriptorRet = new OtherFunctionDescriptors($f1.text);
            $functionDescriptorRet.setLine($f1.line);
        }
        | f2 = FallbackKeyword
        {
            $functionDescriptorRet = new OtherFunctionDescriptors($f2.text);
            $functionDescriptorRet.setLine($f2.line);
        }
        | f3 = ReceiveKeyword
        {
            $functionDescriptorRet = new OtherFunctionDescriptors($f3.text);
            $functionDescriptorRet.setLine($f3.line);
        }
    )
    {  };

///imp rule
returnParameters returns [ParameterList returnParametersRet]
  : 'returns' p = parameterList { $returnParametersRet = $p.parameterListRet; };

///imp rule
modifierList returns [ModifierList modifierListRet]
  : { $modifierListRet = new ModifierList(); }
    (
        op = ( ExternalKeyword | PublicKeyword | InternalKeyword | PrivateKeyword | VirtualKeyword )
        {
            $modifierListRet.addModifier($op.text);
        }
        |
        (
            s = stateMutability { $modifierListRet.addModifier($s.text);  }
            | m = modifierInvocation { $modifierListRet.addModifier($m.modifierInvocationRet); }
            | ov = overrideSpecifier { $modifierListRet.addModifier($ov.overrideSpecifierRet); }
        )
    )* ;

//this rule is not included
eventDefinition
  : 'event' identifier eventParameterList AnonymousKeyword? ';' ;

///imp rule
enumValue returns [EnumValue enumValueRet]
  : i = identifier { $enumValueRet = new EnumValue($i.identifierRet); $enumValueRet.setLine($i.identifierRet.getLine()); };

///imp rule
enumDefinition returns [EnumDefinition enumDefinitionRet]
  : e = 'enum' i = identifier { $enumDefinitionRet = new EnumDefinition($i.identifierRet); $enumDefinitionRet.setLine($e.line); }
    '{' e1 = enumValue? { if($e1.text != null) $enumDefinitionRet.addEnumValue($e1.enumValueRet); }
    (',' e2 = enumValue {$enumDefinitionRet.addEnumValue($e2.enumValueRet);} )* '}';

///imp rule
parameterList returns [ParameterList parameterListRet]
  : '(' { $parameterListRet = new ParameterList(); }
    ( p1 = parameter { $parameterListRet.addParameter($p1.parameterRet); }
    (',' p2 = parameter { $parameterListRet.addParameter($p2.parameterRet); } )* )? ')' ;

///imp rule
parameter returns [Parameter parameterRet]
  : t = typeName
    s = storageLocation? { $parameterRet = new Parameter($t.typeNameRet, $s.text); }
    i = identifier? { if($i.text != null) $parameterRet.setIdentifier($i.identifierRet); };

//this rule is not included
eventParameterList
  : '(' ( eventParameter (',' eventParameter)* )? ')' ;

//this rule is not included
eventParameter
  : typeName IndexedKeyword? identifier? ;

///imp rule
functionTypeParameterList returns [FunctionTypeParameterList functionTypeParameterListRet]
  : { $functionTypeParameterListRet = new FunctionTypeParameterList(); }
    '(' (
    ftp = functionTypeParameter { $functionTypeParameterListRet.addFunctionTypeParameter($ftp.functionTypeParameterRet); }
    (','
    newFtp = functionTypeParameter { $functionTypeParameterListRet.addFunctionTypeParameter($newFtp.functionTypeParameterRet); }
    )* )? ')' ;

///imp rule
functionTypeParameter returns [FunctionTypeParameter functionTypeParameterRet]
  : t = typeName s = storageLocation?
    { $functionTypeParameterRet = new FunctionTypeParameter($t.typeNameRet, $s.text); };

///imp rule
variableDeclaration returns [VariableDeclaration variableDeclarationRet]
  : tn = typeName s = storageLocation? id = identifier
    {
        $variableDeclarationRet = new VariableDeclaration($id.identifierRet, $tn.typeNameRet, $s.text);
        $variableDeclarationRet.setLine($tn.typeNameRet.getLine());
    };

///imp rule
typeName returns [Type typeNameRet]
  : e = elementaryTypeName { $typeNameRet = $e.elementaryTypeNameRet; }
  | u = userDefinedTypeName { $typeNameRet = $u.userDefinedTypeNameRet; }
  | m = mapping { $typeNameRet = $m.mappingRet; }
  | t = typeName '[' ex = expression? ']'
     {
         if ($ex.text == null) $typeNameRet = new ListType($t.typeNameRet);
         else $typeNameRet = new ListType($t.typeNameRet, $ex.expressionRet);
         $typeNameRet.setLine($t.typeNameRet.getLine());
     }
  | f = functionTypeName { $typeNameRet = $f.functionTypeNameRet; }
  | a = 'address' 'payable' { $typeNameRet = new AddressPayable(); $typeNameRet.setLine($a.line); }
  ;

///imp rule
userDefinedTypeName returns [UserDefinedTypeName userDefinedTypeNameRet]
  : { $userDefinedTypeNameRet = new UserDefinedTypeName(); }
    id = identifier { $userDefinedTypeNameRet.addChainRing($id.text); }
    ( '.' newId = identifier { $userDefinedTypeNameRet.addChainRing($newId.text); } )*
    { $userDefinedTypeNameRet.setLine($id.identifierRet.getLine()); };


///imp rule
mappingKey returns [Type mappingKeyRet]
  : e = elementaryTypeName { $mappingKeyRet = $e.elementaryTypeNameRet; }
    | u = userDefinedTypeName { $mappingKeyRet = $u.userDefinedTypeNameRet; };

///imp rule
mapping returns [Mapping mappingRet]
  : m = 'mapping' '(' mk = mappingKey mkn = mappingKeyName? '=>' tn = typeName mvn = mappingValueName? ')'
    {
        $mappingRet = new Mapping($mk.mappingKeyRet, $mkn.text, $tn.typeNameRet, $mvn.text);
        $mappingRet.setLine($m.line);
    };

///imp rule
mappingKeyName : identifier;
mappingValueName : identifier;

///imp rule
functionTypeName returns [FunctionTypeName functionTypeNameRet]
  : f = 'function' { $functionTypeNameRet = new FunctionTypeName(); }
    ftplf = functionTypeParameterList { $functionTypeNameRet.setFunctionTypeParameterList($ftplf.functionTypeParameterListRet); }
    (
        i = InternalKeyword { $functionTypeNameRet.addFunctionModifier($i.text); }
        | e = ExternalKeyword { $functionTypeNameRet.addFunctionModifier($e.text); }
        | s = stateMutability { $functionTypeNameRet.addFunctionModifier($s.text); }
    )*
    ( 'returns' ftplr = functionTypeParameterList { $functionTypeNameRet.setFunctionReturnTypeParameterList($ftplr.functionTypeParameterListRet); } )?
    { $functionTypeNameRet.setLine($f.line); };

///imp rule
storageLocation
  : 'memory' | 'storage' | 'calldata';

///imp rule
stateMutability
  : PureKeyword | ConstantKeyword | ViewKeyword | PayableKeyword ;

///imp rule
block returns [Block blockRet]
  : br = '{'
    { $blockRet = new Block(); $blockRet.setLine($br.line); }
    ( s = statement { $blockRet.addStatement($s.statementRet); } )* '}' ;

///imp rule
statement returns [Statement statementRet]
  : ifs = ifStatement { $statementRet = $ifs.ifStatementRet; }
    | tr = tryStatement //this rule is not included
    | w = whileStatement { $statementRet = $w.whileStatementRet; }
    | f = forStatement { $statementRet = $f.forStatementRet; }
    | bl = block { $statementRet = $bl.blockRet; }
    | i = inlineAssemblyStatement //this rule is not included
    | d = doWhileStatement { $statementRet = $d.doWhileStatementRet; }
    | c = continueStatement { $statementRet = $c.continueStatementRet; }
    | br = breakStatement { $statementRet = $br.breakStatementRet; }
    | re = returnStatement { $statementRet = $re.returnStatementRet; }
    | th = throwStatement { $statementRet = $th.throwStatementRet; }
    | em = emitStatement //this rule is not included
    | si = simpleStatement { $statementRet = $si.simpleStatementRet; }
    | un = uncheckedStatement //this rule is not included
    | rev = revertStatement { $statementRet = $rev.revertStatementRet; };


///imp rule
expressionStatement returns [ExpressionStatement expressionStatementRet]
  : e = expression
    {
        $expressionStatementRet = new ExpressionStatement($e.expressionRet);
        $expressionStatementRet.setLine($e.expressionRet.getLine());
    }
    ';' ;

///imp rule
ifStatement returns [IfStatement ifStatementRet]
  : i = 'if' '(' e = expression ')' s1 = statement
    {
        $ifStatementRet = new IfStatement($e.expressionRet, $s1.statementRet);
        $ifStatementRet.setLine($i.line);
    }
    ( 'else' s2 = statement { $ifStatementRet.setFalseResult($s2.statementRet); } )? ;

//this rule is not included
tryStatement : 'try' expression returnParameters? block catchClause+ ;

// In reality catch clauses still are not processed as below
// the identifier can only be a set string: "Error". But plans
// of the Solidity team include possible expansion so we'll
// leave this as is, befitting with the Solidity docs.
//this rule is not included
catchClause : 'catch' ( identifier? parameterList )? block ;

///imp rule
whileStatement returns [WhileStatement whileStatementRet]
  : w = 'while' '(' e = expression ')' s = statement
    {
        $whileStatementRet = new WhileStatement($e.expressionRet, $s.statementRet);
        $whileStatementRet.setLine($w.line);
    };

///imp rule
simpleStatement returns [SimpleStatement simpleStatementRet]
  : ( v = variableDeclarationStatement { $simpleStatementRet = $v.variableDeclarationStatementRet; }
    | e = expressionStatement { $simpleStatementRet = $e.expressionStatementRet; } ) ;

//this rule is not included
uncheckedStatement
  : 'unchecked' block ;

///imp rule
forStatement returns [ForStatement forStatementRet]
  : f = 'for' '(' { $forStatementRet = new ForStatement(); $forStatementRet.setLine($f.line); }
    ( si = simpleStatement { $forStatementRet.setInitial($si.simpleStatementRet); } | ';' )
    ( es = expressionStatement { $forStatementRet.setCondition($es.expressionStatementRet); } | ';' )
    ( e = expression { $forStatementRet.setIteration($e.expressionRet); } )?
    ')' st = statement { $forStatementRet.setScope($st.statementRet); } ;

//this rule is not included
inlineAssemblyStatement
  : 'assembly' StringLiteralFragment? ('(' inlineAssemblyStatementFlag ')')? assemblyBlock ;

//this rule is not included
inlineAssemblyStatementFlag
  : stringLiteral;

///imp rule
doWhileStatement returns [DoWhileStatement doWhileStatementRet]
  : d = 'do' s = statement 'while' '(' c = expression ')' ';'
    {
        $doWhileStatementRet = new DoWhileStatement($s.statementRet, $c.expressionRet);
        $doWhileStatementRet.setLine($d.line);
    };

///imp rule
continueStatement returns [ContinueStatement continueStatementRet]
  : c = 'continue' ';'
    {
        $continueStatementRet = new ContinueStatement();
        $continueStatementRet.setLine($c.line);
    };

///imp rule
breakStatement returns [BreakStatement breakStatementRet]
  : b = 'break' ';'
    {
        $breakStatementRet = new BreakStatement();
        $breakStatementRet.setLine($b.line);
    };

///imp rule
returnStatement returns [ReturnStatement returnStatementRet]
  : r = 'return' { $returnStatementRet = new ReturnStatement(); $returnStatementRet.setLine($r.line); }
    ( e = expression { $returnStatementRet.setValue($e.expressionRet); } )? ';' ;

///imp rule
throwStatement returns [ThrowStatement throwStatementRet]
  : t = 'throw' ';'
    {
        $throwStatementRet = new ThrowStatement();
        $throwStatementRet.setLine($t.line);
    };

//this rule is not included
emitStatement
  : 'emit' functionCall ';' ;

///imp rule
revertStatement returns [RevertStatement revertStatementRet]
  : r = 'revert' fc = functionCall ';'
    { $revertStatementRet = new RevertStatement($fc.functionCallRet); };

///imp rule
variableDeclarationStatement returns [VariableDeclarationStatement variableDeclarationStatementRet]
  : { $variableDeclarationStatementRet = new VariableDeclarationStatement(); }
    (
        v = 'var' { $variableDeclarationStatementRet.setLine($v.line); }
        i = identifierList
        {
            $variableDeclarationStatementRet.setVariableList($i.identifierListRet);
        }
        | vd = variableDeclaration
        {
            $variableDeclarationStatementRet.setVariableList($vd.variableDeclarationRet);
            $variableDeclarationStatementRet.setLine($vd.variableDeclarationRet.getLine());
        }
        | para = '(' vdl = variableDeclarationList
        {
            $variableDeclarationStatementRet.setVariableList($vdl.variableDeclarationListRet);
            $variableDeclarationStatementRet.setLine($para.line);
        } ')'
    )
    ( '=' e = expression { $variableDeclarationStatementRet.setInitiateValue($e.expressionRet); } )? ';';

///imp rule
variableDeclarationList returns [VariableDeclarationList variableDeclarationListRet]
  : { $variableDeclarationListRet = new VariableDeclarationList(); }
    ( (vd1 = variableDeclaration
    {
        $variableDeclarationListRet.addVariableDeclaration($vd1.variableDeclarationRet);
        $variableDeclarationListRet.setIsThereFirst(true);
    })? ',' )*
    (vd2 = variableDeclaration
    {
        $variableDeclarationListRet.addVariableDeclaration($vd2.variableDeclarationRet);
    })?;

///imp rule
identifierList returns [IdentifierList identifierListRet]
  : '(' { $identifierListRet = new IdentifierList(); }
    ( ( i1 = identifier { $identifierListRet.addIdentifier($i1.identifierRet); } )? ',' )*
    (i2 = identifier { $identifierListRet.addIdentifier($i2.identifierRet); })? ')'
    { if($i1.text == null) $identifierListRet.setFirstNull(true); };

///imp rule
elementaryTypeName returns [ElementaryTypeName elementaryTypeNameRet]
  : a = 'address' { $elementaryTypeNameRet = new AddressType(); $elementaryTypeNameRet.setLine($a.line); }
    | bo = 'bool' { $elementaryTypeNameRet = new BoolType(); $elementaryTypeNameRet.setLine($bo.line); }
    | s = 'string' { $elementaryTypeNameRet = new StringType(); $elementaryTypeNameRet.setLine($s.line); }
    | v = 'var' { $elementaryTypeNameRet = new VarType(); $elementaryTypeNameRet.setLine($v.line); }
    | i = Int { $elementaryTypeNameRet = new IntType($i.text); $elementaryTypeNameRet.setLine($i.line); }
    | ui = Uint { $elementaryTypeNameRet = new UintType($ui.text); $elementaryTypeNameRet.setLine($ui.line); }
    | by = 'byte' { $elementaryTypeNameRet = new ByteLowerCaseType(); $elementaryTypeNameRet.setLine($by.line); }
    | by_ = Byte { $elementaryTypeNameRet = new ByteUpperCaseType($by_.text); $elementaryTypeNameRet.setLine($by_.line); }
    | f = Fixed { $elementaryTypeNameRet = new FixedType($f.text); $elementaryTypeNameRet.setLine($f.line); }
    | uf = Ufixed { $elementaryTypeNameRet = new UfixedType($uf.text); $elementaryTypeNameRet.setLine($uf.line); };

///imp rule
expression returns [Expression expressionRet]
  : e1 = expression (
    '++' { $expressionRet = new UnaryExpression($e1.expressionRet, UnaryOperator.POST_INCREMENT); }
    | '--' { $expressionRet = new UnaryExpression($e1.expressionRet, UnaryOperator.POST_DECREMENT); }
    ) { $expressionRet.setLine($e1.expressionRet.getLine()); }
  | n = 'new' tn = typeName
    {
        $expressionRet = new ObjectCreation($tn.typeNameRet);
        $expressionRet.setLine($n.line);
    }
  | e2 = expression '[' e3 = expression ']'
    {
        $expressionRet = new BinaryExpression($e2.expressionRet, $e3.expressionRet, BinaryOperator.INDEXING);
        $expressionRet.setLine($e2.expressionRet.getLine());
    }
  | e4 = expression '[' e5 = expression? ':' e6 = expression? ']'
    {
        Expression start, end;
        start = ($e5.text == null) ? new NullExpression() : $e5.expressionRet;
        end = ($e6.text == null) ? new NullExpression() : $e6.expressionRet;
        BinaryExpression sliceExpression = new BinaryExpression(start, end, BinaryOperator.SLICING_RANGE);
        $expressionRet = new BinaryExpression($e4.expressionRet, sliceExpression, BinaryOperator.SLICING);
        $expressionRet.setLine($e4.expressionRet.getLine());
    }
  | e7 = expression '.' id1 = identifier
    {
        $expressionRet = new AccessExpression($e7.expressionRet, $id1.identifierRet);
        $expressionRet.setLine($e7.expressionRet.getLine());
    }
  | e8 = expression '{' nvl = nameValueList '}'
    { 
        $expressionRet = new StructInitializationExpression($e8.expressionRet, $nvl.nameValueListRet);
        $expressionRet.setLine($e8.expressionRet.getLine());
    }
  | r = 'require' '(' e9 = expression ',' s = stringLiteral ')'
    { 
        $expressionRet = new RequireExpression($e9.expressionRet, $s.stringLiteralRet);
        $expressionRet.setLine($r.line);
    }
  | e10 = expression '(' fa = functionCallArguments ')'
    { 
        $expressionRet = new FunctionCallExpression($e10.expressionRet, $fa.functionCallArgumentsRet);
        $expressionRet.setLine($e10.expressionRet.getLine());
    }
  | para = '(' e11 = expression ')'
    { 
        $expressionRet = new ParenthesizedExpression($e11.expressionRet);
        $expressionRet.setLine($para.line);
    }
  | un = ('++' | '--') e12 = expression
    {
        String opText = $un.text;
        UnaryOperator op = (opText.equals("++")) ? UnaryOperator.PRE_INCREMENT : UnaryOperator.PRE_DECREMENT;
        $expressionRet = new UnaryExpression($e12.expressionRet, op);
        $expressionRet.setLine($un.line);
    }
  | un_ = ('+' | '-') e13 = expression
    {
        $expressionRet = new UnaryExpression($e13.expressionRet, UnaryOperator.fromString($un_.text));
        $expressionRet.setLine($un_.line);
    }
  | d = 'delete' e14 = expression
    {
        $expressionRet = new UnaryExpression($e14.expressionRet, UnaryOperator.fromString($d.text));
        $expressionRet.setLine($d.line);
    }
  | excla = '!' e15 = expression
    { 
        $expressionRet = new UnaryExpression($e15.expressionRet, UnaryOperator.fromString($excla.text));
        $expressionRet.setLine($excla.line);
    }
  | til = '~' e16 = expression
    { 
        $expressionRet = new UnaryExpression($e16.expressionRet, UnaryOperator.fromString($til.text));
        $expressionRet.setLine($til.line);
    }
  | <assoc=right> e17 = expression op = '**' e18 = expression
    { 
        $expressionRet = new BinaryExpression($e17.expressionRet, $e18.expressionRet, BinaryOperator.fromString($op.text));
        $expressionRet.setLine($e17.expressionRet.getLine());
    }
  | e19 = expression op = ('*' | '/' | '%') e20 = expression
    {
        $expressionRet = new BinaryExpression($e19.expressionRet, $e20.expressionRet, BinaryOperator.fromString($op.text));
        $expressionRet.setLine($e19.expressionRet.getLine());
    }
  | e21 = expression op = ('+' | '-') e22 = expression
    { 
        $expressionRet = new BinaryExpression($e21.expressionRet, $e22.expressionRet, BinaryOperator.fromString($op.text));
        $expressionRet.setLine($e21.expressionRet.getLine());
    }
  | e23 = expression op = ('<<' | '>>') e24 = expression
    { 
        $expressionRet = new BinaryExpression($e23.expressionRet, $e24.expressionRet, BinaryOperator.fromString($op.text));
        $expressionRet.setLine($e23.expressionRet.getLine());
    }
  | e25 = expression op = '&' e26 = expression
    { 
        $expressionRet = new BinaryExpression($e25.expressionRet, $e26.expressionRet, BinaryOperator.fromString($op.text));
        $expressionRet.setLine($e25.expressionRet.getLine());
    }
  | e27 = expression op = '^' e28 = expression
    { 
        $expressionRet = new BinaryExpression($e27.expressionRet, $e28.expressionRet, BinaryOperator.fromString($op.text));
        $expressionRet.setLine($e27.expressionRet.getLine());
    }
  | e29 = expression op = '|' e30 = expression
    { 
        $expressionRet = new BinaryExpression($e29.expressionRet, $e30.expressionRet, BinaryOperator.fromString($op.text));
        $expressionRet.setLine($e29.expressionRet.getLine());
    }
  | e31 = expression op = ('<' | '>' | '<=' | '>=') e32 = expression
    { 
        $expressionRet = new BinaryExpression($e31.expressionRet, $e32.expressionRet, BinaryOperator.fromString($op.text));
        $expressionRet.setLine($e31.expressionRet.getLine());
    }
  | e33 = expression op = ('==' | '!=') e34 = expression
    { 
        $expressionRet = new BinaryExpression($e33.expressionRet, $e34.expressionRet, BinaryOperator.fromString($op.text));
        $expressionRet.setLine($e33.expressionRet.getLine());
    }
  | e35 = expression op = '&&' e36 = expression
    { 
        $expressionRet = new BinaryExpression($e35.expressionRet, $e36.expressionRet, BinaryOperator.fromString($op.text));
        $expressionRet.setLine($e35.expressionRet.getLine());
    }
  | e37 = expression op = '||' e38 = expression
    { 
        $expressionRet = new BinaryExpression($e37.expressionRet, $e38.expressionRet, BinaryOperator.fromString($op.text));
        $expressionRet.setLine($e37.expressionRet.getLine());
    }
  | <assoc=right> e39 = expression '?' e40 = expression ':' e41 = expression
    {
        $expressionRet = new TernaryOperatorExpression($e39.expressionRet, $e40.expressionRet, $e41.expressionRet);
        $expressionRet.setLine($e39.expressionRet.getLine());
    }
  | e42 = expression op = ('=' | '|=' | '^=' | '&=' | '<<=' | '>>=' | '+=' | '-=' | '*=' | '/=' | '%=') e43 = expression
    { 
        $expressionRet = new BinaryExpression($e42.expressionRet, $e43.expressionRet, BinaryOperator.fromString($op.text));
        $expressionRet.setLine($e42.expressionRet.getLine());
    }
  | primary = primaryExpression
    { 
        $expressionRet = $primary.primaryExpressionRet;
        $expressionRet.setLine($primary.primaryExpressionRet.getLine());
    };

///imp rule
primaryExpression returns [PrimaryExpression primaryExpressionRet]
  : b = BooleanLiteral { $primaryExpressionRet = new OtherPrimaryExpression($b.text); $primaryExpressionRet.setLine($b.line); }
  | n = numberLiteral { $primaryExpressionRet = $n.numberLiteralRet; }
  | h = hexLiteral { $primaryExpressionRet = $h.hexLiteralRet; }
  | s = stringLiteral { $primaryExpressionRet = $s.stringLiteralRet; }
  | i = identifier { $primaryExpressionRet = $i.identifierRet; }
  | t = TypeKeyword { $primaryExpressionRet = new OtherPrimaryExpression($t.text); $primaryExpressionRet.setLine($t.line); }
  | p = PayableKeyword { $primaryExpressionRet = new OtherPrimaryExpression($p.text); $primaryExpressionRet.setLine($p.line); }
  | tu = tupleExpression { $primaryExpressionRet = $tu.tupleExpressionRet; }
  | ty = typeName { $primaryExpressionRet = $ty.typeNameRet; };

///imp rule
expressionList returns [ExpressionList expressionListRet]
  : { $expressionListRet = new ExpressionList(); }
    e1 = expression { $expressionListRet.addExpression($e1.expressionRet); }
    (',' e2 = expression { $expressionListRet.addExpression($e2.expressionRet); } )*;

///imp rule
nameValueList returns [NameValueList nameValueListRet]
  : { $nameValueListRet = new NameValueList(); }
    n = nameValue { $nameValueListRet.addNameValue($n.nameValueRet); }
    (',' nv = nameValue { $nameValueListRet.addNameValue($nv.nameValueRet); } )* ','? ;

///imp rule
nameValue returns [NameValue nameValueRet]
  : i = identifier ':' e = expression
    { $nameValueRet = new NameValue($i.identifierRet, $e.expressionRet); };

///imp rule
functionCallArguments returns [FunctionCallArguments functionCallArgumentsRet]
  : '{' ( n = nameValueList { $functionCallArgumentsRet = $n.nameValueListRet; } )? '}'
  | ( e = expressionList { $functionCallArgumentsRet = $e.expressionListRet; } )?;

///imp rule
functionCall returns [FunctionCall functionCallRet]
  : e = expression '(' f = functionCallArguments ')'
    { $functionCallRet = new FunctionCall($e.expressionRet, $f.functionCallArgumentsRet); };

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
tupleExpression returns [TupleExpression tupleExpressionRet]
  : lineHolder = '('
    { $tupleExpressionRet = new TupleExpression(); $tupleExpressionRet.setLine($lineHolder.line); }
    ( e1 = expression?
    {
        if ($e1.text == null)
            {
                Expression e = new NullExpression();
                e.setLine($lineHolder.line);
                $tupleExpressionRet.addExpression(e);
            }
        else $tupleExpressionRet.addExpression($e1.expressionRet);
    }
    ( ',' e2 = expression?
    {
        if ($e2.text == null)
            {
                Expression e = new NullExpression();
                e.setLine($lineHolder.line);
                $tupleExpressionRet.addExpression(e);
            }
        else $tupleExpressionRet.addExpression($e2.expressionRet);
    }
    )* )
    ')'
    | lineHolder = '['
    { $tupleExpressionRet = new TupleExpression(); $tupleExpressionRet.setLine($lineHolder.line); }
    ( e3 = expression
    {
        if ($e3.text == null)
            {
                Expression e = new NullExpression();
                e.setLine($lineHolder.line);
                $tupleExpressionRet.addExpression(e);
            }
        else $tupleExpressionRet.addExpression($e3.expressionRet);
    }
    ( ',' e4 = expression
    {
        if ($e4.text == null)
            {
                Expression e = new NullExpression();
                e.setLine($lineHolder.line);
                $tupleExpressionRet.addExpression(e);
            }
        else $tupleExpressionRet.addExpression($e4.expressionRet);
    }
    )* )?
    ']';

///imp rule
numberLiteral returns [NumberLiteral numberLiteralRet]
  : num = (DecimalNumber | HexNumber) unit = NumberUnit?
    {
        $numberLiteralRet = new NumberLiteral($num.text, $unit.text);
        $numberLiteralRet.setLine($num.line);
    };

// some keywords need to be added here to avoid ambiguities
// for example, "revert" is a keyword but it can also be a function name
///imp rule
identifier returns [Identifier identifierRet]
  : x = ('from' | 'calldata' | 'receive' | 'callback' | 'revert' | 'error' | 'address' | GlobalKeyword | ConstructorKeyword | PayableKeyword | LeaveKeyword | Identifier)
    { $identifierRet = new Identifier($x.text); $identifierRet.setLine($x.line); };

///imp rule
hexLiteral returns [HexLiteral hexLiteralRet]
  : h = HexLiteralFragment+
    {
        $hexLiteralRet = new HexLiteral($h.text);
        $hexLiteralRet.setLine($h.line);
    };

///imp rule
stringLiteral returns [StringLiteral stringLiteralRet]
  : s = StringLiteralFragment+
    {
        $stringLiteralRet = new StringLiteral($s.text);
        $stringLiteralRet.setLine($s.line);
    };

///imp rule
overrideSpecifier returns [OverrideSpecifier overrideSpecifierRet]
  : { $overrideSpecifierRet = new OverrideSpecifier(); }
    'override'
    ( '('
        u1 = userDefinedTypeName { $overrideSpecifierRet.addType($u1.userDefinedTypeNameRet); }
        (','
            u2 = userDefinedTypeName { $overrideSpecifierRet.addType($u2.userDefinedTypeNameRet); }
        )* ')'
    )? ;

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

Identifier
  : IdentifierStart IdentifierPart* ;

fragment
IdentifierStart
  : [a-zA-Z$_] ;

fragment
IdentifierPart
  : [a-zA-Z0-9$_] ;

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