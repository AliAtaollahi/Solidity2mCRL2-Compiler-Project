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

    public Type getMappingKey() {
        return mappingKey;
    }

    public void setMappingKey(Type mappingKey) {
        this.mappingKey = mappingKey;
    }

    public Identifier getMappingKeyName() {
        return mappingKeyName;
    }

    public void setMappingKeyName(Identifier mappingKeyName) {
        this.mappingKeyName = mappingKeyName;
    }

    public Type getMappingValue() {
        return mappingValue;
    }

    public void setMappingValue(Type mappingValue) {
        this.mappingValue = mappingValue;
    }

    public Identifier getMappingValueName() {
        return mappingValueName;
    }

    public void setMappingValueName(Identifier mappingValueName) {
        this.mappingValueName = mappingValueName;
    }

    @Override
    public String toString() {
        // Convert the mapping key type and name to a string, handling potential null values
        String keyTypeString = (mappingKey != null) ? mappingKey.toString() : "Unknown Key Type";
        String keyNameString = (mappingKeyName != null) ? mappingKeyName.toString() : "Unknown Key Name";

        // Convert the mapping value type and name to a string, handling potential null values
        String valueTypeString = (mappingValue != null) ? mappingValue.toString() : "Unknown Value Type";
        String valueNameString = (mappingValueName != null) ? mappingValueName.toString() : "Unknown Value Name";

        // Combine all components into a readable format
        return "Mapping [Key: (" + keyTypeString + " " + keyNameString +
                "), Value: (" + valueTypeString + " " + valueNameString + ")]";
    }
}
