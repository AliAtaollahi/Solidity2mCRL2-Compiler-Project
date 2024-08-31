package main.ast.nodes.expression.type;

import main.ast.nodes.declaration.utility.FunctionTypeParameterList;
import main.ast.nodes.expression.modifier.Modifier;
import main.ast.nodes.expression.modifier.OtherModifers;
import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class FunctionTypeName extends Type {
    private FunctionTypeParameterList functionTypeParameterList;
    private FunctionTypeParameterList functionReturnTypeParameterList;
    private ArrayList<Modifier> functionModifiers = new ArrayList<>();

    public FunctionTypeName() {
    }

    public void setFunctionTypeParameterList(FunctionTypeParameterList functionTypeParameterList) {
        this.functionTypeParameterList = functionTypeParameterList;
    }

    public void setFunctionReturnTypeParameterList(FunctionTypeParameterList functionReturnTypeParameterList) {
        this.functionReturnTypeParameterList = functionReturnTypeParameterList;
    }

    public void addFunctionModifier(String functionModifier) {
        this.functionModifiers.add(new OtherModifers(functionModifier));
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
