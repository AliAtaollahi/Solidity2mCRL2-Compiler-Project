package main.symbolTable.items;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

public class StateVariableSymbolTableItem extends SymbolTableItem {
    public static String START_KEY = "StateVariable_";

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    private String variableName;
    private Type type;
    private Expression value;

    public StateVariableSymbolTableItem(String variableName, Type type, Expression value) {
        this.variableName = variableName;
        this.type = type;
        this.value = value;
    }

    @Override
    public String getKey() {
        return this.START_KEY + variableName;
    }

    public String getVariableName() {
        return variableName;
    }

    public Type getType() {
        return type;
    }

    public Expression getValue() {
        return value;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
