package main.ast.nodes.declaration.utility;

import main.ast.nodes.declaration.Declaration;
import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.expression.primary.Type;
import main.ast.nodes.expression.value.StorageLocation;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ParameterList extends Declaration {
    private ArrayList<Parameter> parameters = new ArrayList<>();

    public ParameterList() {
    }

    public void addParameter(Parameter parameter) {
        this.parameters.add(parameter);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
