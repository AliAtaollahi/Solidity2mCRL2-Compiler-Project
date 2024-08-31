package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ReturnStatement extends Statement {
    private Expression value;

    public ReturnStatement() {
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Expression getValue() {
        return value;
    }
}
