package main.ast.nodes.declaration;

import main.ast.nodes.expression.primary.Identifier;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class StructDefinition extends ContractPart {
    private Identifier nameId;

    private ArrayList<VariableDeclaration> variableDeclarations = new ArrayList<>();

    public StructDefinition(String name) {
        this.nameId = new Identifier(name);
    }

    public void addVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclarations.add(variableDeclaration);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Identifier getNameId() {
        return nameId;
    }

    public void setNameId(Identifier nameId) {
        this.nameId = nameId;
    }

    public ArrayList<VariableDeclaration> getVariableDeclarations() {
        return variableDeclarations;
    }

    public void setVariableDeclarations(ArrayList<VariableDeclaration> variableDeclarations) {
        this.variableDeclarations = variableDeclarations;
    }
}

