package main.ast.nodes.declaration;

import main.ast.nodes.expression.operators.UserDefinableOperator;
import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

public class UsingForObjectDirective extends Declaration {
    private Type type;
    private UserDefinableOperator aliasOperator;

    public UsingForObjectDirective(Type type) {
        this.type = type;
    }

    public void setAliasOperator(UserDefinableOperator aliasOperator) {
        this.aliasOperator = aliasOperator;
    }

    @Override
    public<T>T accept(IVisitor<T> visitor){return visitor.visit(this);}

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public UserDefinableOperator getAliasOperator() {
        return aliasOperator;
    }
}
