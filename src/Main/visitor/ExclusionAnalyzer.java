package main.visitor;

import main.ast.nodes.SourceUnit;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.utility.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.modifier.Modifier;
import main.ast.nodes.expression.modifier.ModifierInvocation;
import main.ast.nodes.expression.modifier.OtherModifers;
import main.ast.nodes.expression.modifier.OverrideSpecifier;
import main.ast.nodes.expression.primary.*;
import main.ast.nodes.expression.type.AddressPayable;
import main.ast.nodes.expression.type.FunctionTypeName;
import main.ast.nodes.expression.type.Mapping;
import main.ast.nodes.expression.type.UserDefinedTypeName;
import main.ast.nodes.expression.type.primitive.*;
import main.ast.nodes.expression.value.EnumValue;
import main.ast.nodes.expression.value.ImportPath;
import main.ast.nodes.expression.value.StorageLocation;
import main.ast.nodes.statement.*;

import java.util.ArrayList;

public class ExclusionAnalyzer extends Visitor<Void> {
    @Override
    public Void visit(SourceUnit sourceUnit) {
        // Visit all ImportDirectives
        for (ImportDirective importDirective : sourceUnit.getImportDirectives()) {
            importDirective.accept(this);
        }

        // Visit all ContractDefinitions
        for (ContractDefinition contractDefinition : sourceUnit.getContractDefinitions()) {
            contractDefinition.accept(this);
        }

        // Visit all EnumDefinitions
        for (EnumDefinition enumDefinition : sourceUnit.getEnumDefinitions()) {
            enumDefinition.accept(this);
        }

        // Visit all StructDefinitions
        for (StructDefinition structDefinition : sourceUnit.getStructDefinitions()) {
            structDefinition.accept(this);
        }

        // Visit all FunctionDefinitions
        for (FunctionDefinition functionDefinition : sourceUnit.getFunctionDefinitions()) {
            functionDefinition.accept(this);
        }

        // Visit all FileLevelConstants
        for (FileLevelConstant fileLevelConstant : sourceUnit.getFileLevelConstants()) {
            fileLevelConstant.accept(this);
        }

        // Visit all CustomErrorDefinitions
        for (CustomErrorDefinition customErrorDefinition : sourceUnit.getCustomErrorDefinitions()) {
            customErrorDefinition.accept(this);
        }

        // Visit all UsingForDeclarations
        for (UsingForDeclaration usingForDeclaration : sourceUnit.getUsingForDeclarations()) {
            usingForDeclaration.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        // Visit the first operand
        if (binaryExpression.getFirstOperand() != null) {
            binaryExpression.getFirstOperand().accept(this);
        }

        // Visit the second operand
        if (binaryExpression.getSecondOperand() != null) {
            binaryExpression.getSecondOperand().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        // Visit the operand
        if (unaryExpression.getExpression() != null) {
            unaryExpression.getExpression().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(ImportDirective importDirective) {
        // Visit the import path
        if (importDirective.getImportPath() != null) {
            importDirective.getImportPath().accept(this);
        }

        // Visit the alias identifier
        if (importDirective.getAliasId() != null) {
            importDirective.getAliasId().accept(this);
        }

        // Visit each import element in the list
        for (ImportElement element : importDirective.getImportedElements()) {
            if (element != null) {
                element.accept(this);
            }
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(ContractDefinition contractDefinition) {
        // Visit the contract name
        if (contractDefinition.getName() != null) {
            contractDefinition.getName().accept(this);
        }

        // Visit each inheritance specifier in the list
        for (InheritanceSpecifier inheritanceSpecifier : contractDefinition.getInheritanceSpecifiers()) {
            if (inheritanceSpecifier != null) {
                inheritanceSpecifier.accept(this);
            }
        }

        // Visit each contract part in the list
        ArrayList<ContractPart> cleanContractParts = new ArrayList<>();
        for (ContractPart contractPart : contractDefinition.getContractParts()) {
            if (contractPart != null) {
                cleanContractParts.add(contractPart);
                contractPart.accept(this);
            }
        }
        contractDefinition.setContractParts(cleanContractParts);

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(EnumDefinition enumDefinition) {
        // Visit the enum name
        if (enumDefinition.getName() != null) {
            enumDefinition.getName().accept(this);
        }

        // Visit each enum value in the list
        for (EnumValue enumValue : enumDefinition.getEnumValues()) {
            if (enumValue != null) {
                enumValue.accept(this);
            }
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(StructDefinition structDefinition) {
        // Visit the struct name identifier
        if (structDefinition.getNameId() != null) {
            structDefinition.getNameId().accept(this);
        }

        // Visit each variable declaration in the list
        for (VariableDeclaration variableDeclaration : structDefinition.getVariableDeclarations()) {
            if (variableDeclaration != null) {
                variableDeclaration.accept(this);
            }
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(FileLevelConstant fileLevelConstant) {
        // Visit the type
        if (fileLevelConstant.getType() != null) {
            fileLevelConstant.getType().accept(this);
        }

        // Visit the name identifier
        if (fileLevelConstant.getName() != null) {
            fileLevelConstant.getName().accept(this);
        }

        // Visit the value expression
        if (fileLevelConstant.getValue() != null) {
            fileLevelConstant.getValue().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(CustomErrorDefinition customErrorDefinition) {
        // Visit the error name identifier
        if (customErrorDefinition.getName() != null) {
            customErrorDefinition.getName().accept(this);
        }

        // Visit the parameter list
        if (customErrorDefinition.getParameters() != null) {
            customErrorDefinition.getParameters().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(UsingForDeclaration usingForDeclaration) {
        // Visit the UsingForObject
        if (usingForDeclaration.getUsingForObject() != null) {
            usingForDeclaration.getUsingForObject().accept(this);
        }

        // Visit the Type if it is not for all types
        if (!usingForDeclaration.isAllType() && usingForDeclaration.getType() != null) {
            usingForDeclaration.getType().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition) {
        // Visit the function descriptor
        if (functionDefinition.getFunctionDescriptor() != null) {
            functionDefinition.getFunctionDescriptor().accept(this);
        }

        // Visit the parameter list
        if (functionDefinition.getParameterList() != null) {
            functionDefinition.getParameterList().accept(this);
        }

        // Visit the modifier list
        if (functionDefinition.getModifierList() != null) {
            functionDefinition.getModifierList().accept(this);
        }

        // Visit the return parameter list
        if (functionDefinition.getReturnParameterList() != null) {
            functionDefinition.getReturnParameterList().accept(this);
        }

        // Visit the scope (block)
        if (functionDefinition.getScope() != null) {
            functionDefinition.getScope().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(FunctionDescriptor functionDescriptor) {
        // Visit the function name identifier
        if (functionDescriptor.getName() != null) {
            functionDescriptor.getName().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(ImportElement importElement) {
        // Visit the element identifier
        if (importElement.getElementId() != null) {
            importElement.getElementId().accept(this);
        }

        // Visit the alias identifier
        if (importElement.getAliasId() != null) {
            importElement.getAliasId().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(VariableDeclaration variableDeclaration) {
        // Visit the variable name identifier
        if (variableDeclaration.getVariableName() != null) {
            variableDeclaration.getVariableName().accept(this);
        }

        // Visit the variable type
        if (variableDeclaration.getVariableType() != null) {
            variableDeclaration.getVariableType().accept(this);
        }

        // Visit the storage location
        if (variableDeclaration.getStorageLocation() != null) {
            variableDeclaration.getStorageLocation().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(ImportPath importPath) {
        return null;
    }

    @Override
    public Void visit(StorageLocation storageLocation) {
        return null;
    }

    @Override
    public Void visit(AddressType addressType) {
        return null;
    }

    @Override
    public Void visit(BoolType boolType) {
        return null;
    }

    @Override
    public Void visit(ByteLowerCaseType byteLowerCaseType) {
        return null;
    }

    @Override
    public Void visit(ByteUpperCaseType byteUpperCaseType) {
        return null;
    }

    @Override
    public Void visit(FixedType fixedType) {
        return null;
    }

    @Override
    public Void visit(IntType intType) {
        return null;
    }

    @Override
    public Void visit(StringType stringType) {
        return null;
    }

    @Override
    public Void visit(UfixedType ufixedType) {
        return null;
    }

    @Override
    public Void visit(UintType uintType) {
        return null;
    }

    @Override
    public Void visit(VarType varType) {
        return null;
    }

    @Override
    public Void visit(Mapping mapping) {
        // Visit the mapping key type
        if (mapping.getMappingKey() != null) {
            mapping.getMappingKey().accept(this);
        }

        // Visit the mapping key name identifier
        if (mapping.getMappingKeyName() != null) {
            mapping.getMappingKeyName().accept(this);
        }

        // Visit the mapping value type
        if (mapping.getMappingValue() != null) {
            mapping.getMappingValue().accept(this);
        }

        // Visit the mapping value name identifier
        if (mapping.getMappingValueName() != null) {
            mapping.getMappingValueName().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(UserDefinedTypeName userDefinedTypeName) {
        // Visit each identifier in the type chain
        for (Identifier identifier : userDefinedTypeName.getTypeChain()) {
            if (identifier != null) {
                identifier.accept(this);
            }
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(FunctionTypeParameterList functionTypeParameterList) {
        // Visit each FunctionTypeParameter in the list
        for (FunctionTypeParameter functionTypeParameter : functionTypeParameterList.getFunctionTypeParameters()) {
            if (functionTypeParameter != null) {
                functionTypeParameter.accept(this);
            }
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(FunctionTypeParameter functionTypeParameter) {
        // Visit the type of the function type parameter
        if (functionTypeParameter.getType() != null) {
            functionTypeParameter.getType().accept(this);
        }

        // Visit the storage location of the function type parameter
        if (functionTypeParameter.getStorageLocation() != null) {
            functionTypeParameter.getStorageLocation().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(FunctionTypeName functionTypeName) {
        // Visit the function type parameter list
        if (functionTypeName.getFunctionTypeParameterList() != null) {
            functionTypeName.getFunctionTypeParameterList().accept(this);
        }

        // Visit the function return type parameter list
        if (functionTypeName.getFunctionReturnTypeParameterList() != null) {
            functionTypeName.getFunctionReturnTypeParameterList().accept(this);
        }

        // Visit each function modifier
        for (Modifier modifier : functionTypeName.getFunctionModifiers()) {
            if (modifier != null) {
                modifier.accept(this);
            }
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(AddressPayable addressPayable) {
        return null;
    }

    @Override
    public Void visit(ListType listType) {
        // Visit the type of the list
        if (listType.getType() != null) {
            listType.getType().accept(this);
        }

        // Visit the size of the list, if it exists
        if (listType.getSize() != null) {
            listType.getSize().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(OtherPrimaryExpression otherPrimaryExpression) {
        return null;
    }

    @Override
    public Void visit(NumberLiteral numberLiteral) {
        return null;
    }

    @Override
    public Void visit(HexLiteral hexLiteral) {
        return null;
    }

    @Override
    public Void visit(StringLiteral stringLiteral) {
        return null;
    }

    @Override
    public Void visit(TupleExpression tupleExpression) {
        // Visit each expression in the tuple
        for (Expression expression : tupleExpression.getExpressions()) {
            if (expression != null) {
                expression.accept(this);
            }
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(NullExpression nullExpression) {
        return null;
    }

    @Override
    public Void visit(AccessExpression accessExpression) {
        // Visit the master expression
        if (accessExpression.getMaster() != null) {
            accessExpression.getMaster().accept(this);
        }

        // Visit the member identifier
        if (accessExpression.getMember() != null) {
            accessExpression.getMember().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(ObjectCreation objectCreation) {
        // Visit the type associated with the object creation
        if (objectCreation.getType() != null) {
            objectCreation.getType().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(NameValue nameValue) {
        // Visit the key identifier
        if (nameValue.getKey() != null) {
            nameValue.getKey().accept(this);
        }

        // Visit the value expression
        if (nameValue.getValue() != null) {
            nameValue.getValue().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(NameValueList nameValueList) {
        // Iterate through each NameValue in the list and visit it
        for (NameValue nameValue : nameValueList.getNameValues()) {
            if (nameValue != null) {
                nameValue.accept(this);
            }
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(ExpressionList expressionList) {
        // Iterate through each Expression in the list and visit it
        for (Expression expression : expressionList.getExpressionList()) {
            if (expression != null) {
                expression.accept(this);
            }
        }

        return null;  // Since the method return type is T and we need to return a value, we use null
    }

    @Override
    public Void visit(FunctionCallArguments functionCallArguments) {
        return null;
    }

    @Override
    public Void visit(FunctionCallExpression functionCallExpression) {
        // Visit the functionName
        if (functionCallExpression.getFunctionName() != null) {
            functionCallExpression.getFunctionName().accept(this);
        }

        // Visit the arguments
        if (functionCallExpression.getArgs() != null) {
            functionCallExpression.getArgs().accept(this);
        }

        return null;  // Return null as the specific implementation might need to handle different return types
    }

    @Override
    public Void visit(StructInitializationExpression structInitializationExpression) {
        // Visit the name expression
        if (structInitializationExpression.getName() != null) {
            structInitializationExpression.getName().accept(this);
        }

        // Visit the name-value list
        if (structInitializationExpression.getNameValueList() != null) {
            structInitializationExpression.getNameValueList().accept(this);
        }

        return null;  // Return null as the specific implementation might need to handle different return types
    }

    @Override
    public Void visit(TernaryOperatorExpression ternaryOperatorExpression) {
        // Visit the condition expression
        if (ternaryOperatorExpression.getCondition() != null) {
            ternaryOperatorExpression.getCondition().accept(this);
        }

        // Visit the true result expression
        if (ternaryOperatorExpression.getTrueResult() != null) {
            ternaryOperatorExpression.getTrueResult().accept(this);
        }

        // Visit the false result expression
        if (ternaryOperatorExpression.getFalseResult() != null) {
            ternaryOperatorExpression.getFalseResult().accept(this);
        }

        return null;  // Return null as the specific implementation might need to handle different return types
    }

    @Override
    public Void visit(ParenthesizedExpression parenthesizedExpression) {
        // Visit the inner expression
        if (parenthesizedExpression.getExpression() != null) {
            return parenthesizedExpression.getExpression().accept(this);
        }

        return null;  // Return null as the specific implementation might need to handle different return types
    }

    @Override
    public Void visit(RequireExpression requireExpression) {
        // Visit the expression inside the RequireExpression
        if (requireExpression.getExpression() != null) {
            requireExpression.getExpression().accept(this);
        }

        // Visit the message inside the RequireExpression
        if (requireExpression.getMessage() != null) {
            requireExpression.getMessage().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(EnumValue enumValue) {
        // Visit the value (Identifier) inside the EnumValue
        if (enumValue.getValue() != null) {
            enumValue.getValue().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(Parameter parameter) {
        // Visit the type inside the Parameter
        if (parameter.getType() != null) {
            parameter.getType().accept(this);
        }

        // Visit the storageLocation inside the Parameter
        if (parameter.getStorageLocation() != null) {
            parameter.getStorageLocation().accept(this);
        }

        // Visit the identifier inside the Parameter
        if (parameter.getIdentifier() != null) {
            parameter.getIdentifier().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ParameterList parameterList) {
        // Iterate over the parameters in the ParameterList
        for (Parameter parameter : parameterList.getParameters()) {
            if (parameter != null) {
                parameter.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(UsingForObjectDirective usingForObjectDirective) {
        // Visit the type inside the UsingForObjectDirective
        if (usingForObjectDirective.getType() != null) {
            usingForObjectDirective.getType().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(UsingForObject usingForObject) {
        // Visit the type inside the UsingForObject
        if (usingForObject.getType() != null) {
            usingForObject.getType().accept(this);
        }

        // Visit each UsingForObjectDirective in the objectDirectives list
        for (UsingForObjectDirective directive : usingForObject.getObjectDirectives()) {
            if (directive != null) {
                directive.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(OtherModifers otherModifers) {
        return null;
    }

    @Override
    public Void visit(ModifierList modifierList) {
        // Iterate over the modifiers in the ModifierList
        for (Modifier modifier : modifierList.getModifiers()) {
            if (modifier != null) {
                modifier.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(ModifierInvocation modifierInvocation) {
        // Visit the name (Identifier) inside the ModifierInvocation
        if (modifierInvocation.getName() != null) {
            modifierInvocation.getName().accept(this);
        }

        // Visit the expressionList inside the ModifierInvocation if it exists
        if (modifierInvocation.getExpressionList() != null) {
            modifierInvocation.getExpressionList().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(OverrideSpecifier overrideSpecifier) {
        // Iterate over the types in the OverrideSpecifier
        for (UserDefinedTypeName type : overrideSpecifier.getTypes()) {
            if (type != null) {
                type.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(Block block) {
        ArrayList<Statement> cleanStatements = new ArrayList<>();
        for (Statement statement : block.getStatements()) {
            if (statement != null) {
                cleanStatements.add(statement);
                statement.accept(this);
            }
        }
        block.setStatements(cleanStatements);
        return null;
    }

    @Override
    public Void visit(IfStatement ifStatement) {
        // Visit the condition of the IfStatement
        if (ifStatement.getCondition() != null) {
            ifStatement.getCondition().accept(this);
        }

        // Visit the trueResult of the IfStatement
        if (ifStatement.getTrueResult() != null) {
            ifStatement.getTrueResult().accept(this);
        }

        // Visit the falseResult of the IfStatement if it exists
        if (ifStatement.getFalseResult() != null) {
            ifStatement.getFalseResult().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(WhileStatement whileStatement) {
        // Visit the condition of the WhileStatement
        if (whileStatement.getCondition() != null) {
            whileStatement.getCondition().accept(this);
        }

        // Visit the scope (Statement) of the WhileStatement
        if (whileStatement.getScope() != null) {
            whileStatement.getScope().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ForStatement forStatement) {
        // Visit the initial statement of the ForStatement
        if (forStatement.getInitial() != null) {
            forStatement.getInitial().accept(this);
        }

        // Visit the condition (ExpressionStatement) of the ForStatement
        if (forStatement.getCondition() != null) {
            forStatement.getCondition().accept(this);
        }

        // Visit the iteration (Expression) of the ForStatement
        if (forStatement.getIteration() != null) {
            forStatement.getIteration().accept(this);
        }

        // Visit the scope (Statement) of the ForStatement
        if (forStatement.getScope() != null) {
            forStatement.getScope().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(FunctionCall functionCall) {
        // Visit the function (Expression) of the FunctionCall
        if (functionCall.getFunction() != null) {
            functionCall.getFunction().accept(this);
        }

        // Visit the arguments (FunctionCallArguments) of the FunctionCall
        if (functionCall.getArgs() != null) {
            functionCall.getArgs().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(RevertStatement revertStatement) {
        // Visit the functionCall (FunctionCall) inside the RevertStatement
        if (revertStatement.getFunctionCall() != null) {
            revertStatement.getFunctionCall().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(IdentifierList identifierList) {
        // Iterate over the identifiers in the IdentifierList
        for (Identifier identifier : identifierList.getIdentifiers()) {
            if (identifier != null) {
                identifier.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(VariableDeclarationList variableDeclarationList) {
        // Iterate over the variableDeclarations in the VariableDeclarationList
        for (VariableDeclaration variableDeclaration : variableDeclarationList.getVariableDeclarations()) {
            if (variableDeclaration != null) {
                variableDeclaration.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(VariableDeclarationStatement variableDeclarationStatement) {
        // Visit the variableList (VariableList) in the VariableDeclarationStatement
        if (variableDeclarationStatement.getVariableList() != null) {
            variableDeclarationStatement.getVariableList().accept(this);
        }

        // Visit the initiateValue (Expression) in the VariableDeclarationStatement
        if (variableDeclarationStatement.getInitiateValue() != null) {
            variableDeclarationStatement.getInitiateValue().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ExpressionStatement expressionStatement) {
        // Visit the expression (Expression) inside the ExpressionStatement
        if (expressionStatement.getExpression() != null) {
            expressionStatement.getExpression().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(BreakStatement breakStatement) {
        return null;
    }

    @Override
    public Void visit(ContinueStatement continueStatement) {
        return null;
    }

    @Override
    public Void visit(ThrowStatement throwStatement) {
        return null;
    }

    @Override
    public Void visit(ReturnStatement returnStatement) {
        // Visit the value (Expression) inside the ReturnStatement
        if (returnStatement.getValue() != null) {
            returnStatement.getValue().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(DoWhileStatement doWhileStatement) {
        // Visit the scope (Statement) inside the DoWhileStatement
        if (doWhileStatement.getScope() != null) {
            doWhileStatement.getScope().accept(this);
        }

        // Visit the condition (Expression) inside the DoWhileStatement
        if (doWhileStatement.getCondition() != null) {
            doWhileStatement.getCondition().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(InheritanceSpecifier inheritanceSpecifier) {
        // Visit the type (Type) inside the InheritanceSpecifier
        if (inheritanceSpecifier.getType() != null) {
            inheritanceSpecifier.getType().accept(this);
        }

        // Visit the expressionList (ExpressionList) inside the InheritanceSpecifier
        if (inheritanceSpecifier.getExpressionList() != null) {
            inheritanceSpecifier.getExpressionList().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ModifierDefinition modifierDefinition) {
        // Visit the identifier (Identifier) inside the ModifierDefinition
        if (modifierDefinition.getIdentifier() != null) {
            modifierDefinition.getIdentifier().accept(this);
        }

        // Visit the parameterList (ParameterList) inside the ModifierDefinition
        if (modifierDefinition.getParameterList() != null) {
            modifierDefinition.getParameterList().accept(this);
        }

        // Visit the modifier (Modifier) inside the ModifierDefinition
        if (modifierDefinition.getModifier() != null) {
            modifierDefinition.getModifier().accept(this);
        }

        // Visit the scope (Block) inside the ModifierDefinition
        if (modifierDefinition.getScope() != null) {
            modifierDefinition.getScope().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(StateVariableDeclaration stateVariableDeclaration) {
        // Visit the type (Type) inside the StateVariableDeclaration
        if (stateVariableDeclaration.getType() != null) {
            stateVariableDeclaration.getType().accept(this);
        }

        // Visit each modifier (Modifier) inside the StateVariableDeclaration
        for (Modifier modifier : stateVariableDeclaration.getModifiers()) {
            if (modifier != null) {
                modifier.accept(this);
            }
        }

        // Visit the name (Identifier) inside the StateVariableDeclaration
        if (stateVariableDeclaration.getName() != null) {
            stateVariableDeclaration.getName().accept(this);
        }

        // Visit the value (Expression) inside the StateVariableDeclaration
        if (stateVariableDeclaration.getValue() != null) {
            stateVariableDeclaration.getValue().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(OtherFunctionDescriptors otherFunctionDescriptors) {
        return null;
    }
}
