package main.ast.nodes.expression.modifier;

import main.ast.nodes.declaration.Declaration;
import main.ast.nodes.declaration.utility.ExpressionList;
import main.ast.nodes.expression.primary.Identifier;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ModifierInvocation extends Modifier {
    private Identifier name;
    private boolean paranthesized = false;
    private ExpressionList expressionList;

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
        ModifierInvocation other = (ModifierInvocation) obj;
        return name != null ? name.equals(other.name) : other.name == null;
    }

    public ModifierInvocation(Identifier name) {
        this.name = name;
    }

    public void setParanthesized(boolean paranthesized) {
        this.paranthesized = paranthesized;
    }

    public void setExpressionList(ExpressionList expressionList) {
        this.expressionList = expressionList;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Identifier getName() {
        return name;
    }

    public void setName(Identifier name) {
        this.name = name;
    }

    public boolean isParanthesized() {
        return paranthesized;
    }

    public ExpressionList getExpressionList() {
        return expressionList;
    }
}
