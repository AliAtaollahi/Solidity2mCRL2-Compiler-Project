package Main.visitor;

import Main.AST.Node.Program;
import Main.AST.Node.declaration.*;
import Main.AST.Node.expression.*;
import Main.AST.Node.expression.values.*;
import Main.AST.Node.Statement.*;

public interface IVisitor<T> {
    T visit(Program program);

    T visit(ContractDeclaration contractDeclaration);

    T visit(FunctionDeclaration functionDeclaration);

    T visit(VarDeclaration varDeclaration);

    T visit(GlobVariableDeclaration globVariableDeclaration);

    T visit(UnaryExpression unaryExpression);

    T visit(BinaryExpression binaryExpression);

    T visit(VarAccess varAccess);

    T visit(Identifier identifier);

    T visit(ArrayIdentifier arrayIdentifier);

    T visit(IntValue value);

    T visit(StringValue value);

    T visit(BoolValue boolValue);

    T visit(FloatValue floatValue);

    T visit(FunctionCall functionCall);

    T visit(MethodCall methodCall);

    T visit(IfElseStmt conditional);

    T visit(Assignment assignStmt);

    T visit(ForStmt forStmt);

    //T visit(WhileStmt whileStmt);

    //T visit(ContinueBreakStmt continueBreakStmt);

    T visit(ExpressionStmt expressionStmt);

    T visit(ReturnStmt returnStmt);

    T visit(AddressValue addressValue);

    //T visit(ThrowStmt throwStmt);

    //T visit(TryCatchStmt tryCatchStmt);
}
