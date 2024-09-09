package main.symbolTable.items;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.primary.Type;

public class FileLevelConstantSymbolTableItem extends SymbolTableItem {
    private String constantName;
    private Type constantType;  // Type of the file-level constant
    private Expression constantValue;

    public FileLevelConstantSymbolTableItem(String constantName, Type constantType, Expression constantValue) {
        this.constantName = constantName;
        this.constantType = constantType;
        this.constantValue = constantValue;
    }

    @Override
    public String getKey() {
        return constantName;
    }

    public String getConstantName() {
        return constantName;
    }

    public Type getConstantType() {
        return constantType;
    }
}
