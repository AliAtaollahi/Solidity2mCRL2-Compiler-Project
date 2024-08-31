package main.ast.nodes.statement;

import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.declaration.utility.IdentifierList;
import main.ast.nodes.declaration.utility.VariableDeclarationList;
import main.ast.nodes.declaration.utility.VariableList;
import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

public class VariableDeclarationStatement extends SimpleStatement {
    private VariableList variableList;
    private Expression initiateValue;

    public VariableDeclarationStatement() {
    }

    public void setInitiateValue(Expression initiateValue) {
        this.initiateValue = initiateValue;
    }

    public void setVariableList(VariableList variableList) {
        this.variableList = variableList;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
