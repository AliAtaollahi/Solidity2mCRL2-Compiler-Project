package main.ast.nodes.declaration;

import main.ast.nodes.declaration.utility.VariableList;
import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.expression.primary.Type;
import main.ast.nodes.expression.value.StorageLocation;
import main.visitor.IVisitor;

public class VariableDeclaration extends VariableList {
    private Identifier variableName;
    private Type variableType;
    private StorageLocation storageLocation;

    public VariableDeclaration(Identifier variableName, Type type, String storageLocation) {
        this.variableName = variableName;
        this.variableType = type;
        this.storageLocation = new StorageLocation(storageLocation);
    }

    public Identifier getVariableName() {
        return variableName;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
