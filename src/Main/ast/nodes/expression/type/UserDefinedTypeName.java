package main.ast.nodes.expression.type;

import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class UserDefinedTypeName extends Type {
    ArrayList<Identifier> typeChain = new ArrayList<>();
    public UserDefinedTypeName() {}
    public void addChainRing(String typeName) {
        this.typeChain.add(new Identifier(typeName));
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Identifier> getTypeChain() {
        return typeChain;
    }

    public void setTypeChain(ArrayList<Identifier> typeChain) {
        this.typeChain = typeChain;
    }
}
