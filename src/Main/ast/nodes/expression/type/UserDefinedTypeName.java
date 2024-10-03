package main.ast.nodes.expression.type;

import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.stream.Collectors;

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

    @Override
    public String toString() {
        // Join the typeChain's identifiers into a single string, handling null case
        if (typeChain.isEmpty()) {
            return "UserDefinedTypeName: [Empty Type Chain]";
        }

        // Convert the list of Identifiers to their name strings and join them with "->"
        String chainString = typeChain.stream()
                .map(Identifier::getName)  // Get the name of each Identifier
                .collect(Collectors.joining("->"));  // Join names with "->"

        return "UserDefinedTypeName: [" + chainString + "]";
    }
}
