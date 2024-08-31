package main.ast.nodes.expression.modifier;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

public class OtherModifers extends Modifier {
    private String name;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof String && ((String)obj).equals(this.name)) {
            return true;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OtherModifers other = (OtherModifers) obj;
        return name != null ? name.equals(other.name) : other.name == null;
    }

    public OtherModifers(String name) {
        this.name = name;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
