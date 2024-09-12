package main.symbolTable.items;

import main.ast.nodes.declaration.utility.ParameterList;
import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.statement.Block;

public class ModifierSymbolTableItem extends SymbolTableItem {
    private String modifierName;        // Name of the modifier
    private ParameterList parameterList; // Parameters for the modifier
    private Block scope;                // Block (scope) of the modifier

    public ModifierSymbolTableItem(String modifierName, ParameterList parameterList, Block scope) {
        this.modifierName = modifierName;
        this.parameterList = parameterList;
        this.scope = scope;
    }

    @Override
    public String getKey() {
        return "Modifier_" + modifierName; // Unique identifier for this modifier
    }

    public String getModifierName() {
        return modifierName;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public Block getScope() {
        return scope;
    }
}
