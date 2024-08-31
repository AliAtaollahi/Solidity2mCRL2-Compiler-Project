package main.ast.nodes.declaration.utility;

import main.ast.nodes.declaration.Declaration;
import main.ast.nodes.expression.modifier.Modifier;
import main.ast.nodes.expression.modifier.OtherModifers;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ModifierList extends Declaration {
    private ArrayList<Modifier> modifiers = new ArrayList<>();

    public ModifierList() {
    }

    public void addModifier(String modifier) {
        this.modifiers.add(new OtherModifers(modifier));
    }

    public void addModifier(Modifier modifier) {
        this.modifiers.add(modifier);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
