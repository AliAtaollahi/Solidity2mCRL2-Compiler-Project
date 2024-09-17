package main.symbolTable.items;

import main.ast.nodes.declaration.utility.FunctionCallArguments;
import main.ast.nodes.expression.AccessExpression;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.ObjectCreation;
import main.ast.nodes.expression.StructInitializationExpression;
import main.ast.nodes.expression.primary.Identifier;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

public class FunctionCallSymbolTableItem extends SymbolTableItem {

    private Expression functionName;  // The function being called
    private FunctionCallArguments args;  // The arguments passed to the function
    private int symbolTableSize;
    private boolean hasSimpleName;

    public SymbolTable getCurrentSymbolTable() {
        return currentSymbolTable;
    }

    public void setCurrentSymbolTable(SymbolTable currentSymbolTable) {
        this.currentSymbolTable = currentSymbolTable;
    }

    private SymbolTable currentSymbolTable;

    public FunctionCallSymbolTableItem(Expression functionName, FunctionCallArguments args, int stackSize, SymbolTable top) {
        this.functionName = functionName;
        this.args = args;
        this.symbolTableSize = stackSize;
        this.hasSimpleName = (functionName instanceof Identifier);
        this.currentSymbolTable = top;
    }

    @Override
    public String getKey() {
        return exractName(this.functionName);
    }

    private String exractName(Expression functionName) {
        if (functionName instanceof Identifier) {
            return "FunctionCall_" + ((Identifier) functionName).getName() + this.symbolTableSize;
        } else if (functionName instanceof ObjectCreation) {
            return "ObjectCreation_" + ((ObjectCreation) functionName).toString() + this.symbolTableSize;
        } else if (functionName instanceof AccessExpression) {
            return "MethodCall_" + ((AccessExpression) functionName).getMember().getName() + this.symbolTableSize;
        } else if (functionName instanceof StructInitializationExpression) {
            if (((StructInitializationExpression) functionName).getName() instanceof Identifier)
                return "StructInitialization_" + ((Identifier)((StructInitializationExpression) functionName).getName()).getName() + this.symbolTableSize;
            else
                return "StructInitialization_" + exractName(((StructInitializationExpression) functionName).getName());
        } else {
            return functionName.toString() + this.symbolTableSize;
        }
    }

    public Expression getFunctionName() {
        return this.functionName;
    }

    public FunctionCallArguments getArgs() {
        return this.args;
    }

    public void setFunctionName(Expression functionName) {
        this.functionName = functionName;
    }

    public void setArgs(FunctionCallArguments args) {
        this.args = args;
    }

    public boolean isHasSimpleName() {
        return hasSimpleName;
    }

    public void setHasSimpleName(boolean hasSimpleName) {
        this.hasSimpleName = hasSimpleName;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
