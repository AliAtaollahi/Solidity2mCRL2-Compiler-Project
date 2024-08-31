package main.ast.nodes.declaration.utility;

import main.ast.nodes.declaration.Declaration;
import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.expression.primary.Type;
import main.ast.nodes.expression.value.StorageLocation;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class IdentifierList extends VariableList {
    private ArrayList<Identifier> identifiers = new ArrayList<>();
    private boolean isFirstNull = false;
    public IdentifierList() {}

    public void setFirstNull(boolean firstNull) {
        isFirstNull = firstNull;
    }

    public void addIdentifier(Identifier identifier) {
        this.identifiers.add(identifier);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
