package main.ast.nodes.statement;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class ContinueStatement extends Statement {

    public ContinueStatement() {
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
