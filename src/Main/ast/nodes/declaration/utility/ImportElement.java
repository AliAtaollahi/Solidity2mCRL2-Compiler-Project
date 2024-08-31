package main.ast.nodes.declaration.utility;

import main.ast.nodes.declaration.Declaration;
import main.ast.nodes.expression.primary.Identifier;
import main.visitor.IVisitor;

public class ImportElement extends Declaration {
    private Identifier elementId;
    private Identifier aliasId;

    public ImportElement(String element, String alias) {
        this.elementId = new Identifier(element);
        this.aliasId = new Identifier(alias);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
