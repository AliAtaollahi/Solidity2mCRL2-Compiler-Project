package main.symbolTable.items;

import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.expression.Expression;  // For the initiation value
import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

public class VariableDeclarationSymbolTableItem extends SymbolTableItem {
    public static String START_KEY = "VarDeclaration_";  // Prefix for variable keys
    protected Type type;                      // Type of the variable
    protected Expression initiateValue;       // The initialization value of the variable

    // Constructor to create the symbol table item from a VariableDeclaration
    public VariableDeclarationSymbolTableItem(VariableDeclaration varDeclaration) {
        this.name = varDeclaration.getVariableName().getName();
        this.type = varDeclaration.getVariableType();
        this.initiateValue = null; // By default, no initial value
        this.setLine(varDeclaration.getLine());
    }

    // Generates the unique key for the variable in the format "VarDeclaration_<name>"
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

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
