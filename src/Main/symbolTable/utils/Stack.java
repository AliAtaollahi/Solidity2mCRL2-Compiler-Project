package main.symbolTable.utils;

import java.util.ArrayList;

public class Stack <T>{
    private int top;
    private ArrayList<T> elements;
    public Stack(){
        this.top = -1;
        elements = new ArrayList<>();
    }
    public void push(T toBePushed){
        this.elements.add(toBePushed);
        ++this.top;
    }
    public T pop(){
        if(this.top == -1){
            return null;
        }
        --this.top;
        T popped = elements.get(this.top + 1);
        elements.remove(this.top + 1);
        return popped;
    }
}
