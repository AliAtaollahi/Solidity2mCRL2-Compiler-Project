package main.ast.nodes.declaration;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.modifier.Modifier;
import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class StateVariableDeclaration extends ContractPart {
    private Type type;
    private ArrayList<Modifier> modifiers = new ArrayList<>();
    private Identifier name;
    private Expression value;

    public StateVariableDeclaration(Type type) {
        this.type = type;
    }

    public void addModifier(Modifier modifier) {
        this.modifiers.add(modifier);
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    public void setName(Identifier name) {
        this.name = name;
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

    public ArrayList<Modifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(ArrayList<Modifier> modifiers) {
        this.modifiers = modifiers;
    }

    public Identifier getName() {
        return name;
    }

    public Expression getValue() {
        return value;
    }
}

