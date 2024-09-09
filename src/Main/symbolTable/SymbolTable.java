package main.symbolTable;


import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.SymbolTableItem;
import main.symbolTable.utils.stack.Stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class SymbolTable {

    //Start of static members

    public static SymbolTable top;
    public static SymbolTable root;
    private static Stack<SymbolTable> stack = new Stack<>();

    public static void push(SymbolTable symbolTable) {
        if (top != null)
            stack.push(top);
        top = symbolTable;
    }

    public static void pop() {
        top = stack.pop();
    }

    //End of static members

    public SymbolTable pre;
    private Map<String, SymbolTableItem> items;

    public SymbolTable() {
        this(null);
    }

    public SymbolTable(SymbolTable pre) {
        this.pre = pre;
        this.items = new HashMap<>();
    }

    public void put(SymbolTableItem item) throws ItemAlreadyExistsException {
        if (items.containsKey(item.getKey()))
            throw new ItemAlreadyExistsException();
        items.put(item.getKey(), item);
    }

    public SymbolTableItem getItem(String key, Boolean searchCurrent) throws ItemNotFoundException {
        Set<SymbolTable> visitedSymbolTables = new HashSet<>();
        SymbolTable currentSymbolTable = this;
        if(!searchCurrent) {
            visitedSymbolTables.add(this);
            currentSymbolTable = this.pre;
        }
        while((currentSymbolTable != null) && (!visitedSymbolTables.contains(currentSymbolTable))) {
            visitedSymbolTables.add( currentSymbolTable );
            SymbolTableItem symbolTableItem = currentSymbolTable.items.get(key);
            if( symbolTableItem != null )
                return symbolTableItem;
            currentSymbolTable = currentSymbolTable.pre;
        }
        throw new ItemNotFoundException();
    }

}
