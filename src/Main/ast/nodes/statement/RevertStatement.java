package main.ast.nodes.statement;

import main.ast.nodes.expression.FunctionCallExpression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class RevertStatement extends Statement {
    private FunctionCallExpression functionCallExpression;

    public RevertStatement(FunctionCallExpression functionCall) {
        this.functionCallExpression = functionCall;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public FunctionCallExpression getFunctionCall() {
        return functionCallExpression;
    }

    public void setFunctionCall(FunctionCallExpression functionCall) {
        this.functionCallExpression = functionCall;
    }
}
