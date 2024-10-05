package main.ast.nodes.statement;

import main.ast.nodes.Node;

public abstract class Statement extends Node{
    private Block block;

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }
}
