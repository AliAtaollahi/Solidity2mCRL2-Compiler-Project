package main.ast.nodes.statement;

import main.ast.nodes.declaration.utility.FunctionCall;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class RevertStatement extends Statement {
    private FunctionCall functionCall;

    public RevertStatement(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
