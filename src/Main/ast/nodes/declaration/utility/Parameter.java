package main.ast.nodes.declaration.utility;

import main.ast.nodes.declaration.Declaration;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.expression.primary.Type;
import main.ast.nodes.expression.value.StorageLocation;
import main.visitor.IVisitor;

public class Parameter extends Declaration {
    private Type type;
    private StorageLocation storageLocation;
    Identifier identifier;

    public Parameter(Type type, String storageLocation) {
        this.type = type;
        this.storageLocation = new StorageLocation(storageLocation);
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
