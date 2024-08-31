package main.ast.nodes.expression.modifier;

import main.ast.nodes.expression.type.UserDefinedTypeName;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class OverrideSpecifier extends Modifier {
    private ArrayList<UserDefinedTypeName> types = new ArrayList<>();

    public OverrideSpecifier() {
    }

    public void addType(UserDefinedTypeName type) {
        this.types.add(type);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}

    public ArrayList<UserDefinedTypeName> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<UserDefinedTypeName> types) {
        this.types = types;
    }
}
