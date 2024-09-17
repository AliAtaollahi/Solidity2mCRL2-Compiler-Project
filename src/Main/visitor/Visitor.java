package main.visitor;

import main.ast.nodes.SourceUnit;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.utility.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.modifier.ModifierInvocation;
import main.ast.nodes.expression.modifier.OtherModifers;
import main.ast.nodes.expression.modifier.OverrideSpecifier;
import main.ast.nodes.expression.primary.*;
import main.ast.nodes.expression.type.*;
import main.ast.nodes.expression.type.primitive.*;
import main.ast.nodes.expression.value.EnumValue;
import main.ast.nodes.expression.value.ImportPath;
import main.ast.nodes.expression.value.StorageLocation;
import main.ast.nodes.statement.*;
import main.symbolTable.items.*;

public abstract class Visitor<T> implements IVisitor<T> {
    @Override
    public T visit(SourceUnit sourceUnit) {
        return null;
    }

    @Override
    public T visit(Identifier identifier) {
        return null;
    }

    @Override
    public T visit(BinaryExpression binaryExpression) {
        return null;
    }

    @Override
    public T visit(UnaryExpression unaryExpression) {
        return null;
    }

    @Override
    public T visit(ImportDirective importDirective) {
        return null;
    }

    @Override
    public T visit(ContractDefinition contractDefinition) {
        return null;
    }

    @Override
    public T visit(EnumDefinition enumDefinition) {
        return null;
    }

    @Override
    public T visit(StructDefinition structDefinition) {
        return null;
    }

    @Override
    public T visit(FileLevelConstant fileLevelConstant) {
        return null;
    }

    @Override
    public T visit(CustomErrorDefinition customErrorDefinition) {
        return null;
    }

    @Override
    public T visit(UsingForDeclaration usingForDeclaration) {
        return null;
    }

    @Override
    public T visit(FunctionDefinition functionDefinition) {
        return null;
    }

    @Override
    public T visit(FunctionDescriptor functionDescriptor) {
        return null;
    }

    @Override
    public T visit(ImportElement importElement) {
        return null;
    }


    @Override
    public T visit(VariableDeclaration variableDeclaration) {
        return null;
    }

    @Override
    public T visit(ImportPath importPath) {
        return null;
    }

    @Override
    public T visit(StorageLocation storageLocation) {
        return null;
    }

    @Override
    public T visit(AddressType addressType) {
        return null;
    }

    @Override
    public T visit(BoolType boolType) {
        return null;
    }

    @Override
    public T visit(ByteLowerCaseType byteLowerCaseType) {
        return null;
    }

    @Override
    public T visit(ByteUpperCaseType byteUpperCaseType) {
        return null;
    }

    @Override
    public T visit(FixedType fixedType) {
        return null;
    }

    @Override
    public T visit(IntType intType) {
        return null;
    }

    @Override
    public T visit(StringType stringType) {
        return null;
    }

    @Override
    public T visit(UfixedType ufixedType) {
        return null;
    }

    @Override
    public T visit(UintType uintType) {
        return null;
    }

    @Override
    public T visit(VarType varType) {
        return null;
    }

    @Override
    public T visit(Mapping mapping) {
        return null;
    }

    @Override
    public T visit(UserDefinedTypeName userDefinedTypeName) {
        return null;
    }

    @Override
    public T visit(FunctionTypeParameterList functionTypeParameterList) {
        return null;
    }

    @Override
    public T visit(FunctionTypeParameter functionTypeParameter) {
        return null;
    }

    @Override
    public T visit(FunctionTypeName functionTypeName) {
        return null;
    }

    @Override
    public T visit(AddressPayable addressPayable) {
        return null;
    }

    @Override
    public T visit(ListType listType) {
        return null;
    }

    @Override
    public T visit(OtherPrimaryExpression otherPrimaryExpression) {
        return null;
    }

    @Override
    public T visit(NumberLiteral numberLiteral) {
        return null;
    }

    @Override
    public T visit(HexLiteral hexLiteral) {
        return null;
    }

    @Override
    public T visit(StringLiteral stringLiteral) {
        return null;
    }

    @Override
    public T visit(TupleExpression tupleExpression) {
        return null;
    }

    @Override
    public T visit(NullExpression nullExpression) {
        return null;
    }

    @Override
    public T visit(AccessExpression accessExpression) {
        return null;
    }

    @Override
    public T visit(ObjectCreation objectCreation) {
        return null;
    }

    @Override
    public T visit(NameValue nameValue) {
        return null;
    }

    @Override
    public T visit(NameValueList nameValueList) {
        return null;
    }

    @Override
    public T visit(ExpressionList expressionList) {
        return null;
    }

    @Override
    public T visit(FunctionCallArguments functionCallArguments) {
        return null;
    }

    @Override
    public T visit(FunctionCallExpression functionCallExpression) {
        return null;
    }

    @Override
    public T visit(StructInitializationExpression structInitializationExpression) {
        return null;
    }

    @Override
    public T visit(TernaryOperatorExpression ternaryOperatorExpression) {
        return null;
    }

    @Override
    public T visit(ParenthesizedExpression parenthesizedExpression) {
        return null;
    }

    @Override
    public T visit(RequireExpression requireExpression) {
        return null;
    }

    @Override
    public T visit(EnumValue enumValue) {
        return null;
    }

    @Override
    public T visit(Parameter parameter) {
        return null;
    }

    @Override
    public T visit(ParameterList parameterList) {
        return null;
    }

    @Override
    public T visit(UsingForObjectDirective usingForObjectDirective) {
        return null;
    }

    @Override
    public T visit(UsingForObject usingForObject) {
        return null;
    }

    @Override
    public T visit(OtherModifers otherModifers) {
        return null;
    }

    @Override
    public T visit(ModifierList modifierList) {
        return null;
    }

    @Override
    public T visit(ModifierInvocation modifierInvocation) {
        return null;
    }

    @Override
    public T visit(OverrideSpecifier overrideSpecifier) {
        return null;
    }

    @Override
    public T visit(Block block) {
        return null;
    }

    @Override
    public T visit(IfStatement ifStatement) {
        return null;
    }

    @Override
    public T visit(WhileStatement whileStatement) {
        return null;
    }

    @Override
    public T visit(ForStatement forStatement) {
        return null;
    }

    @Override
    public T visit(RevertStatement revertStatement) {
        return null;
    }

    @Override
    public T visit(IdentifierList identifierList) {
        return null;
    }

    @Override
    public T visit(VariableDeclarationList variableDeclarationList) {
        return null;
    }

    @Override
    public T visit(VariableDeclarationStatement variableDeclarationStatement) {
        return null;
    }

    @Override
    public T visit(ExpressionStatement expressionStatement) {
        return null;
    }

    @Override
    public T visit(BreakStatement breakStatement) {
        return null;
    }

    @Override
    public T visit(ContinueStatement continueStatement) {
        return null;
    }

    @Override
    public T visit(ThrowStatement throwStatement) {
        return null;
    }

    @Override
    public T visit(ReturnStatement returnStatement) {
        return null;
    }

    @Override
    public T visit(DoWhileStatement doWhileStatement) {
        return null;
    }

    @Override
    public T visit(InheritanceSpecifier inheritanceSpecifier) {
        return null;
    }

    @Override
    public T visit(ModifierDefinition modifierDefinition) {
        return null;
    }

    @Override
    public T visit(StateVariableDeclaration stateVariableDeclaration) {
        return null;
    }

    @Override
    public T visit(OtherFunctionDescriptors otherFunctionDescriptors) {
        return null;
    }

    @Override
    public T visit(TupleType tupleType) {
        return null;
    }

    @Override
    public T visit(ContractDefinitionSymbolTableItem contractDefinitionSymbolTableItem) {
        return null;
    }

    @Override
    public T visit(CustomErrorSymbolTableItem customErrorSymbolTableItem) {
        return null;
    }

    @Override
    public T visit(EnumDefinitionSymbolTableItem enumDefinitionSymbolTableItem) {
        return null;
    }

    @Override
    public T visit(EnumValueSymbolTableItem enumValueSymbolTableItem) {
        return null;
    }

    @Override
    public T visit(FileLevelConstantSymbolTableItem fileLevelConstantSymbolTableItem) {
        return null;
    }

    @Override
    public T visit(FunctionCallSymbolTableItem functionCallSymbolTableItem) {
        return null;
    }

    @Override
    public T visit(VariantTypeVariableDeclarationSymbolTableItem variantTypeVariableDeclarationSymbolTableItem) {
        return null;
    }

    @Override
    public T visit(VariableDeclarationSymbolTableItem variableDeclarationSymbolTableItem) {
        return null;
    }

    @Override
    public T visit(UsingForSymbolTableItem usingForSymbolTableItem) {
        return null;
    }

    @Override
    public T visit(StructDefinitionSymbolTableItem structDefinitionSymbolTableItem) {
        return null;
    }

    @Override
    public T visit(StateVariableSymbolTableItem stateVariableSymbolTableItem) {
        return null;
    }

    @Override
    public T visit(PrimaryExpressionSymbolTableItem primaryExpressionSymbolTableItem) {
        return null;
    }

    @Override
    public T visit(ParameterSymbolTableItem parameterSymbolTableItem) {
        return null;
    }

    @Override
    public T visit(ModifierDefinitionSymbolTableItem modifierDefinitionSymbolTableItem) {
        return null;
    }

    @Override
    public T visit(FunctionDefinitionSymbolTableItem functionDefinitionSymbolTableItem) {
        return null;
    }

    @Override
    public T visit(Expression expression){
        return null;
    }

    @Override
    public T visit(NoType noType){
        return null;
    }
}
