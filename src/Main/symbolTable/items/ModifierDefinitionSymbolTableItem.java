package main.symbolTable.items;

import main.ast.nodes.declaration.ModifierDefinition;
import main.ast.nodes.declaration.utility.ParameterList;
import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.statement.Block;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

public class ModifierDefinitionSymbolTableItem extends SymbolTableItem {
    private String modifierName;        // Name of the modifier
    private ParameterList parameterList; // Parameters for the modifier
    private Block scope;                // Block (scope) of the modifier
    private SymbolTable symbolTable;    // Symbol table for the modifier's scope
    private ModifierDefinition modifierDefinition;

    // Constructor
    public ModifierDefinitionSymbolTableItem(String modifierName, ParameterList parameterList, Block scope, ModifierDefinition modifierDefinition) {
        this.modifierName = modifierName;
        this.parameterList = parameterList;
        this.scope = scope;
        this.modifierDefinition = modifierDefinition;
        this.setLine(modifierDefinition.getLine());
    }

    @Override
    public String getKey() {
        return "Modifier_" + modifierName; // Unique identifier for this modifier
    }

    // Getter for modifier name
    public String getModifierName() {
        return modifierName;
    }

    // Getter for parameter list
    public ParameterList getParameterList() {
        return parameterList;
    }

    // Getter for scope
    public Block getScope() {
        return scope;
    }

    // Setter for the symbol table
    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    // Getter for the symbol table
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
