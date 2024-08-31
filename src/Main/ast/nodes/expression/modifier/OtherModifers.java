package main.ast.nodes.expression.modifier;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

public class OtherModifers extends Modifier {
    private String name;

    public OtherModifers(String name) {
        this.name = name;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
