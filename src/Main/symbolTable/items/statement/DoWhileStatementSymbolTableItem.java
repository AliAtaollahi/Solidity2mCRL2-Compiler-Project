package main.symbolTable.items.statement;

import main.ast.nodes.statement.Block;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

public class DoWhileStatementSymbolTableItem extends StatementSymbolTableItem {

    private Block body;
    private int symbolTableSize;
    private SymbolTable symbolTable;

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public DoWhileStatementSymbolTableItem(Block body, int symbolTableSize) {
        this.body = body;
        this.symbolTableSize = symbolTableSize;
    }

    @Override
    public String getKey() {
        return extractDoWhileKey();
    }

    private String extractDoWhileKey() {
        return "DoWhileCondition_" + this.symbolTableSize;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public int getSymbolTableSize() {
        return symbolTableSize;
    }

    public void setSymbolTableSize(int symbolTableSize) {
        this.symbolTableSize = symbolTableSize;
    }
}
