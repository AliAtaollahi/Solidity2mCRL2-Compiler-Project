package Main.AST.Node;

import Main.visitor.IVisitor;

public abstract class Node {

    private int line;

    public void setLine(int line_num) {
        this.line = line_num;
    }

    public int getLine() {
        return this.line;
    }

    public abstract <T> T accept(IVisitor<T> visitor);
}
