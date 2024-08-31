package main.ast.nodes.declaration.utility;

import main.ast.nodes.declaration.Declaration;
import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.expression.primary.Identifier;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class VariableDeclarationList extends VariableList {
    private ArrayList<VariableDeclaration> variableDeclarations = new ArrayList<>();
    private boolean isThereFirst = false;

    public VariableDeclarationList() {
    }

    public void setIsThereFirst(boolean isThereFirst) {
        this.isThereFirst = isThereFirst;
    }

    public void addVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclarations.add(variableDeclaration);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
