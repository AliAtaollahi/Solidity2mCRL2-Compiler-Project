package main.symbolTable.items;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.primary.Type;

public class VariantTypeVariableDeclarationSymbolTableItem extends SymbolTableItem {
    public static String START_KEY = "VariantType_";  // Prefix for variable keys with variant types
    protected Type type;                          // Type of the variable
    protected Expression initiateValue;           // The initialization value of the variable

    // Constructor to create the symbol table item for a variable with a variant type
    public VariantTypeVariableDeclarationSymbolTableItem(String name) {
        this.name = name;
        this.type = null;  // Type will be assigned later if known
        this.initiateValue = null;  // By default, no initial value
    }

    // Generates the unique key for the variable in the format "VarType_<name>"
    @Override
    public String getKey() {
        return START_KEY + this.name;
    }

    // Getter for the variable type
    public Type getType() {
        return type;
    }

    // Setter for the variable type
    public void setType(Type type) {
        this.type = type;
    }

    // Getter for the initialization value
    public Expression getInitiateValue() {
        return initiateValue;
    }

    // Setter for the initialization value
    public void setInitiateValue(Expression initiateValue) {
        this.initiateValue = initiateValue;
    }
}
