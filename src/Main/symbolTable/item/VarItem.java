package main.symbolTable.item;

import main.ast.nodes.expression.primary.Identifier;

public class VarItem extends SymbolTableItem{
    public static String START_KEY = "VAR:";
    public VarItem(Identifier identifier){
        this.name = identifier.getName();
    }
    @Override
    public String getKey(){return START_KEY + this.name;}
}
