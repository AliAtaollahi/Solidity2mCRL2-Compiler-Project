package main.symbolTable.items.statement;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.statement.Block;
import main.ast.nodes.statement.Statement;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

public class WhileStatementSymbolTableItem extends StatementSymbolTableItem {

    private Block body;
    private int symbolTableSize; // Assuming a symbol table size context for key generation
    private SymbolTable symbolTable;

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public WhileStatementSymbolTableItem(Block body, int symbolTableSize) {
        this.body = body;
        this.symbolTableSize = symbolTableSize;
    }

    @Override
    public String getKey() {
        return extractConditionKey();
    }

    private String extractConditionKey() {
        return "WhileCondition_" + this.symbolTableSize;
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
