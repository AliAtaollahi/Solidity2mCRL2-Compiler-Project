package main.ast.nodes.expression.type;

import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

import java.util.Collection;
import java.util.List;

public class TupleType extends Type {
    private List<Type> elementTypes;

    public TupleType(List<Type> elementTypes) {
        this.elementTypes = elementTypes;
    }

    public List<Type> getElementTypes() {
        return elementTypes;
    }

    public void setElementTypes(List<Type> elementTypes) {
        this.elementTypes = elementTypes;
    }

    @Override
    public String toString() {
        return "TupleType{" +
                "elementTypes=" + elementTypes +
                '}';
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }

}
