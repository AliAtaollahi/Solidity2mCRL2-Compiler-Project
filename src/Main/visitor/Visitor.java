package Main.visitor;

import Main.AST.Node.Program;
import Main.AST.Node.declaration.*;
import Main.AST.Node.expression.*;
import Main.AST.Node.expression.values.*;
import Main.AST.Node.Statement.*;

public class Visitor<T> implements IVisitor<T> {

    @Override
    public T visit(Program program) {
        return null;
    }

    @Override
    public T visit(FunctionDeclaration functionDeclaration) {
        return null;
    }

    @Override
    public T visit(VarDeclaration varDeclaration) {
        return null;
    }

    @Override
    public T visit(GlobVariableDeclaration globVariableDeclaration) {
        return null;
    }

    @Override
    public T visit(ContractDeclaration contractDeclaration) {
        return null;
    }

    @Override
    public T visit(UnaryExpression unaryExpression) {
        return null;
    }

    @Override
    public T visit(BinaryExpression binaryExpression) {
        return null;
    }

    @Override
    public T visit(VarAccess varAccess) {
        return null;
    }

    @Override
    public T visit(Identifier identifier) {
        return null;
    }

    @Override
    public T visit(ArrayIdentifier arrayIdentifier) {
        return null;
    }

    @Override
    public T visit(IntValue value) {
        return null;
    }

    @Override
    public T visit(StringValue value) {
        return null;
    }
    
    @Override
    public T visit(BoolValue boolValue) {
        return null;
    }

    @Override
    public T visit(FloatValue floatValue) {
        return null;
    }

    @Override
    public T visit(IfElseStmt conditional) {
        return null;
    }

    @Override
    public T visit(FunctionCall functionCall) {
        return null;
    }

    @Override
    public T visit(MethodCall methodCall) {
        return null;
    }

    @Override
    public T visit(Assignment assignStmt) {
        return null;
    }

    @Override
    public T visit(ForStmt forStmt) {
        return null;
    }

    @Override
    public T visit(ExpressionStmt expressionStmt) {
        return null;
    }

    @Override
    public T visit(ReturnStmt returnStmt) {
        return null;
    }

    @Override
    public T visit(AddressValue addressValue) {
        return null;
    }
}
