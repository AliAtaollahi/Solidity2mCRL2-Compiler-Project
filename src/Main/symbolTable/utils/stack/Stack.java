package main.symbolTable.utils.stack;

import java.util.ArrayList;

public class Stack<T> {
    private int top;
    private ArrayList<T> elements;

    public Stack() {
        top = -1;
        elements = new ArrayList<>();
    }

    public void push(T pushValue) {
        elements.add(pushValue);
        ++top;
    }

    public T pop() {
        if (top == -1)
            return null;
        --top;
        T e = elements.get(top + 1);
        elements.remove(top + 1);
        return e;
    }
}
