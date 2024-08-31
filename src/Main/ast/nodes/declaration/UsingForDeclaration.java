package main.ast.nodes.declaration;

import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

public class UsingForDeclaration extends ContractPart {
    private UsingForObject usingForObject;
    private boolean isAllType = false;
    private Type type;
    private boolean isGlobal = false;

    public UsingForDeclaration(UsingForObject usingForObject) {
        this.usingForObject = usingForObject;
    }

    public void setAllType(boolean allType) {
        isAllType = allType;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setGlobal(boolean global) {
        isGlobal = global;
    }

    @Override
    public<T>T accept(IVisitor<T> visitor){return visitor.visit(this);}

    public UsingForObject getUsingForObject() {
        return usingForObject;
    }

    public void setUsingForObject(UsingForObject usingForObject) {
        this.usingForObject = usingForObject;
    }

    public boolean isAllType() {
        return isAllType;
    }

    public Type getType() {
        return type;
    }

    public boolean isGlobal() {
        return isGlobal;
    }
}
