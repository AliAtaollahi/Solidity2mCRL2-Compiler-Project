package main.ast.nodes.declaration;

import main.ast.nodes.declaration.utility.ParameterList;
import main.ast.nodes.expression.modifier.Modifier;
import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.statement.Block;
import main.ast.nodes.statement.Statement;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ModifierDefinition extends ContractPart {
    private Identifier identifier;
    private ParameterList parameterList;
    private Modifier modifier;
    private Block scope;

    public ModifierDefinition(Identifier identifier) {
        this.identifier = identifier;
    }

    public void setScope(Block scope) {
        this.scope = scope;
    }

    public void setModifier(Modifier modifier) {
        this.modifier = modifier;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public Modifier getModifier() {
        return modifier;
    }

    public Block getScope() {
        return scope;
    }
}

