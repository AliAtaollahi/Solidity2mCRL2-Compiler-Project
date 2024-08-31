package main.ast.nodes.declaration;

import main.ast.nodes.declaration.utility.ParameterList;
import main.ast.nodes.expression.primary.Identifier;
import main.visitor.IVisitor;

public class CustomErrorDefinition extends ContractPart {
    private Identifier name;
    private ParameterList parameters;

    public CustomErrorDefinition(Identifier name, ParameterList parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    @Override
    public<T>T accept(IVisitor<T> visitor){return visitor.visit(this);}

    public Identifier getName() {
        return name;
    }

    public void setName(Identifier name) {
        this.name = name;
    }

    public ParameterList getParameters() {
        return parameters;
    }

    public void setParameters(ParameterList parameters) {
        this.parameters = parameters;
    }
}

