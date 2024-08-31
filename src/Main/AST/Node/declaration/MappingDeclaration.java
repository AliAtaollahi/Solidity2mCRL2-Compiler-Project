package Main.AST.Node.declaration;

import Main.AST.Node.expression.Expression;
import Main.AST.Node.expression.Identifier;
import Main.AST.Type.Type;
import Main.visitor.IVisitor;

public class MappingDeclaration extends Declaration{

    private Type sourceType;
    private Type destinationType;
    private Identifier identifier;
    private Expression expression;
    private int length = 0; // > 0 means array

    public MappingDeclaration() {
    }
    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public Type getSourceType() {
        return sourceType;
    }

    public void setSourceType(Type type) {
        this.sourceType = type;
    }
    public void setDestinationType(Type destinationType) {
        this.destinationType = destinationType;
    }
    public Type getDestinationType() {
        return destinationType;
    }
    public void setExpression(Expression expression) {this.expression = expression;}

    public Expression getExpression() { return this.expression; }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isArray() {
        return this.length > 0;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}
