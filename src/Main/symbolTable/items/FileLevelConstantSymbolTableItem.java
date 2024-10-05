package main.symbolTable.items;

import main.ast.nodes.declaration.FileLevelConstant;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

public class FileLevelConstantSymbolTableItem extends SymbolTableItem {
    private String constantName;
    private Type constantType;  // Type of the file-level constant
    private Expression constantValue;
    private FileLevelConstant fileLevelConstant;

    public FileLevelConstantSymbolTableItem(String constantName, Type constantType, Expression constantValue, FileLevelConstant fileLevelConstant) {
        this.constantName = constantName;
        this.constantType = constantType;
        this.constantValue = constantValue;
        this.fileLevelConstant = fileLevelConstant;
        this.setLine(fileLevelConstant.getLine());
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

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
