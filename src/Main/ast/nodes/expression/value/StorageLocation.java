package main.ast.nodes.expression.value;

import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

public class StorageLocation extends Type {
    private String location;

    public StorageLocation(String location) {
        this.location = location;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
