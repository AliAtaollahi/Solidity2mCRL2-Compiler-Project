package main.ast.nodes.declaration;

import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class UsingForObject extends Declaration {
    private Type type;
    private ArrayList<UsingForObjectDirective> objectDirectives = new ArrayList<>();

    public UsingForObject(Type type) {
        this.type = type;
    }

    public UsingForObject() {
    }

    public void addObjectDirective(UsingForObjectDirective objectDirective) {
        this.objectDirectives.add(objectDirective);
    }

    @Override
    public<T>T accept(IVisitor<T> visitor){return visitor.visit(this);}
}