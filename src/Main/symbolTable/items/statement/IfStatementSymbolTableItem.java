package main.symbolTable.items.statement;

import main.ast.nodes.statement.Block;
import main.ast.nodes.statement.Statement;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

public class IfStatementSymbolTableItem extends StatementSymbolTableItem {

    private Block trueBody;
    private Statement falseBody;
    private int symbolTableSize;
    private SymbolTable ifSymbolTable;
    private SymbolTable elseSymbolTable;

    public IfStatementSymbolTableItem(Block trueBody, Statement falseBody, int symbolTableSize) {
        this.trueBody = trueBody;
        this.falseBody = falseBody;
        this.symbolTableSize = symbolTableSize;
    }

    // Getters and setters for if and else symbol tables
    public SymbolTable getIfSymbolTable() {
        return ifSymbolTable;
    }

    public void setIfSymbolTable(SymbolTable ifSymbolTable) {
        this.ifSymbolTable = ifSymbolTable;
    }

    public SymbolTable getElseSymbolTable() {
        return elseSymbolTable;
    }

    public void setElseSymbolTable(SymbolTable elseSymbolTable) {
        this.elseSymbolTable = elseSymbolTable;
    }

    @Override
    public String getKey() {
        return extractIfKey();
    }

    private String extractIfKey() {
        return "IfCondition_" + this.symbolTableSize;
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
