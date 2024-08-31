package main.ast.nodes.declaration.utility;

import main.ast.nodes.declaration.Declaration;
import main.ast.nodes.expression.modifier.Modifier;
import main.ast.nodes.expression.modifier.OtherModifers;
import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class InheritanceSpecifier extends Declaration {
    private Type type;
    private ExpressionList expressionList;

    public InheritanceSpecifier(Type type) {
        this.type = type;
    }

    public void setExpressionList(ExpressionList expressionList) {
        this.expressionList = expressionList;
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

    public ExpressionList getExpressionList() {
        return expressionList;
    }
}
