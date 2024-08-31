package main.ast.nodes.declaration;

import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.expression.value.EnumValue;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class EnumDefinition extends ContractPart {
    public Identifier name;
    private ArrayList<EnumValue> enumValues = new ArrayList<>();

    public EnumDefinition(Identifier name) {
        this.name = name;
    }

    public void addEnumValue(EnumValue enumValue) {
        this.enumValues.add(enumValue);
    }

    @Override
    public<T>T accept(IVisitor<T> visitor){return visitor.visit(this);}

    public Identifier getName() {
        return name;
    }

    public void setName(Identifier name) {
        this.name = name;
    }

    public ArrayList<EnumValue> getEnumValues() {
        return enumValues;
    }

    public void setEnumValues(ArrayList<EnumValue> enumValues) {
        this.enumValues = enumValues;
    }
}

