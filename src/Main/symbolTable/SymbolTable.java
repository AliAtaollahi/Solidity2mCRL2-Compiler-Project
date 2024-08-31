package main.symbolTable;

import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.SymbolTableItem;
import main.symbolTable.utils.Stack;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    public static SymbolTable top;
    public static SymbolTable root;
    private static Stack<SymbolTable> stack = new Stack<>();
    private Map<String, SymbolTableItem> items;
    public static void push(SymbolTable symbolTable) {
        if (top != null)
            stack.push(top);
        top = symbolTable;
    }
    public static void pop() {
        top = stack.pop();
    }
    public SymbolTable() {
        this.items = new HashMap<>();
    }
    public void put(SymbolTableItem item) throws ItemAlreadyExists {
        if (items.containsKey(item.getKey()))
            throw new ItemAlreadyExists();
//        System.out.println("~ " + item + " : " + item.getKey());
        items.put(item.getKey(), item);
    }
    public SymbolTableItem getItem(String key) throws ItemNotFound {
        SymbolTableItem symbolTableItem = this.items.get(key);
        if( symbolTableItem != null ){
            return symbolTableItem;
        }
        throw new ItemNotFound();
    }
    public SymbolTable createSnapshot() {
        SymbolTable snapshot = new SymbolTable();
        for(var item : SymbolTable.top.items.entrySet()){
            try {
                snapshot.put(item.getValue());
            } catch (ItemAlreadyExists ignored){}
        }
        return snapshot;
    }
}
