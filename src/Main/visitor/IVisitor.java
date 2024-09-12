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

public interface IVisitor<T> {
    T visit(SourceUnit sourceUnit);
    T visit(Identifier identifier);
    T visit(BinaryExpression binaryExpression);
    T visit(UnaryExpression unaryExpression);
    T visit(ImportDirective importDirective);
    T visit(ContractDefinition contractDefinition);
    T visit(EnumDefinition enumDefinition);
    T visit(StructDefinition structDefinition);
    T visit(FileLevelConstant fileLevelConstant);
    T visit(CustomErrorDefinition customErrorDefinition);
    T visit(UsingForDeclaration usingForDeclaration);
    T visit(FunctionDefinition functionDefinition);

    T visit(FunctionDescriptor functionDescriptor);

    T visit(ImportElement importElement);

    T visit(VariableDeclaration variableDeclaration);

    T visit(ImportPath importPath);

    T visit(StorageLocation storageLocation);

    T visit(AddressType addressType);

    T visit(BoolType boolType);

    T visit(ByteLowerCaseType byteLowerCaseType);

    T visit(ByteUpperCaseType byteUpperCaseType);

    T visit(FixedType fixedType);

    T visit(IntType intType);

    T visit(StringType stringType);

    T visit(UfixedType ufixedType);

    T visit(UintType uintType);

    T visit(VarType varType);

    T visit(Mapping mapping);

    T visit(UserDefinedTypeName userDefinedTypeName);

    T visit(FunctionTypeParameterList functionTypeParameterList);

    T visit(FunctionTypeParameter functionTypeParameter);

    T visit(FunctionTypeName functionTypeName);

    T visit(AddressPayable addressPayable);

    T visit(ListType listType);

    T visit(OtherPrimaryExpression otherPrimaryExpression);

    T visit(NumberLiteral numberLiteral);

    T visit(HexLiteral hexLiteral);

    T visit(StringLiteral stringLiteral);

    T visit(TupleExpression tupleExpression);

    T visit(NullExpression nullExpression);

    T visit(AccessExpression accessExpression);

    T visit(ObjectCreation objectCreation);

    T visit(NameValue nameValue);

    T visit(NameValueList nameValueList);

    T visit(ExpressionList expressionList);

    T visit(FunctionCallArguments functionCallArguments);

    T visit(FunctionCallExpression functionCallExpression);

    T visit(StructInitializationExpression structInitializationExpression);

    T visit(TernaryOperatorExpression ternaryOperatorExpression);

    T visit(ParenthesizedExpression parenthesizedExpression);

    T visit(RequireExpression requireExpression);

    T visit(EnumValue enumValue);

    T visit(Parameter parameter);

    T visit(ParameterList parameterList);

    T visit(UsingForObjectDirective usingForObjectDirective);

    T visit(UsingForObject usingForObject);

    T visit(OtherModifers otherModifers);

    T visit(ModifierList modifierList);

    T visit(ModifierInvocation modifierInvocation);

    T visit(OverrideSpecifier overrideSpecifier);

    T visit(Block block);

    T visit(IfStatement ifStatement);

    T visit(WhileStatement whileStatement);

    T visit(ForStatement forStatement);

    T visit(RevertStatement revertStatement);

    T visit(IdentifierList identifierList);

    T visit(VariableDeclarationList variableDeclarationList);

    T visit(VariableDeclarationStatement variableDeclarationStatement);

    T visit(ExpressionStatement expressionStatement);

    T visit(BreakStatement breakStatement);

    T visit(ContinueStatement continueStatement);

    T visit(ThrowStatement throwStatement);

    T visit(ReturnStatement returnStatement);

    T visit(DoWhileStatement doWhileStatement);

    T visit(InheritanceSpecifier inheritanceSpecifier);

    T visit(ModifierDefinition modifierDefinition);

    T visit(StateVariableDeclaration stateVariableDeclaration);

    T visit(OtherFunctionDescriptors otherFunctionDescriptors);
    T visit(TupleType tupleType);

}
