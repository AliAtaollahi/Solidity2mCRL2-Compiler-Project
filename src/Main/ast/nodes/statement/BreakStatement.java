package main.ast.nodes.statement;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class BreakStatement extends Statement {

    public BreakStatement() {
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
