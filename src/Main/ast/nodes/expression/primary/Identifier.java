package main.ast.nodes.expression.primary;

import main.ast.nodes.expression.PrimaryExpression;
import main.visitor.IVisitor;

public class Identifier extends PrimaryExpression {
    private String name;

    public Identifier() {
    }

    public Identifier(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Identifier && this.name == ((Identifier)obj).getName()) {
            return true;
        }

        if (this == obj) {
            return true; // Check if the two references are the same
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Check for null and if the classes are different
        }
        Identifier other = (Identifier) obj; // Cast to Identifier
        return name != null ? name.equals(other.name) : other.name == null;
        // Check if names are equal, handling nulls appropriately
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
        // Generate hash code based on the name field
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
