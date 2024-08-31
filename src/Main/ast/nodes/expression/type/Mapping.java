package main.ast.nodes.expression.type;

import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

public class Mapping extends Type {
    private Type mappingKey;
    private Identifier mappingKeyName;
    private Type mappingValue;
    private Identifier mappingValueName;
    public Mapping() {}
    public Mapping(Type mappingKey, String mappingKeyName, Type mappingValue, String mappingValueName) {
        this.mappingKey = mappingKey;
        this.mappingKeyName = new Identifier(mappingKeyName);
        this.mappingValue = mappingValue;
        this.mappingValueName = new Identifier(mappingValueName);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
