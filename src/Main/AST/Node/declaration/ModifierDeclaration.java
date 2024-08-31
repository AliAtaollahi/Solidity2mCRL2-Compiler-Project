package Main.AST.Node.declaration;

import Main.AST.Type.Type;
import Main.AST.Type.primitiveType.Modifier;
import Main.visitor.IVisitor;

public class ModifierDeclaration extends Declaration{

    private Modifier type;

    public Type getType() {
        return type;
    }

    public void setType(Modifier type) {
        this.type = type;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}
