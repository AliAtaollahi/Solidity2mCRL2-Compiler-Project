package main.ast.nodes.expression.value;

import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

public class ImportPath extends Type {
    private String path;

    public ImportPath(String path) {
        this.path = path;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
