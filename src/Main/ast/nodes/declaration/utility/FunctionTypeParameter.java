package main.ast.nodes.declaration.utility;

import main.ast.nodes.declaration.Declaration;
import main.ast.nodes.expression.value.StorageLocation;
import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

public class FunctionTypeParameter extends Declaration {
    private Type type;
    private StorageLocation storageLocation;
    public FunctionTypeParameter(Type type, String storageLocation) {
        this.type = type;
        this.storageLocation = new StorageLocation(storageLocation);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public StorageLocation getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(StorageLocation storageLocation) {
        this.storageLocation = storageLocation;
    }
}
