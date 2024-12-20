package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class Block extends Statement {
    private ArrayList<Statement> statements = new ArrayList<>();

    public Block() {
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public void setStatements(ArrayList<Statement> statements) {
        this.statements = statements;
    }

    public void removeStatement(Statement statement) {
        this.statements.remove(statement);
    }
}
