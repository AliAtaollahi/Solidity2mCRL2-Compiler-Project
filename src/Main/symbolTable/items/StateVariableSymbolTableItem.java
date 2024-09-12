package main.symbolTable.items;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.primary.Type;

public class StateVariableSymbolTableItem extends SymbolTableItem {
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
        return "StateVariable_" + variableName;
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
}
