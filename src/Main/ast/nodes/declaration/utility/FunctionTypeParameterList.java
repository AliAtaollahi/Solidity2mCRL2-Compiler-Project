package main.ast.nodes.declaration.utility;

import main.ast.nodes.declaration.Declaration;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class FunctionTypeParameterList extends Declaration {
    ArrayList<FunctionTypeParameter> functionTypeParameters = new ArrayList<FunctionTypeParameter>();

    public FunctionTypeParameterList() {}

    public void addFunctionTypeParameter(FunctionTypeParameter functionTypeParameter) {
        this.functionTypeParameters.add(functionTypeParameter);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
