package main.ast.nodes.expression.type;

import main.ast.nodes.declaration.utility.FunctionTypeParameterList;
import main.ast.nodes.expression.modifier.Modifier;
import main.ast.nodes.expression.modifier.OtherModifers;
import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.stream.Collectors;

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

    public FunctionTypeParameterList getFunctionTypeParameterList() {
        return functionTypeParameterList;
    }

    public FunctionTypeParameterList getFunctionReturnTypeParameterList() {
        return functionReturnTypeParameterList;
    }

    public ArrayList<Modifier> getFunctionModifiers() {
        return functionModifiers;
    }

    public void setFunctionModifiers(ArrayList<Modifier> functionModifiers) {
        this.functionModifiers = functionModifiers;
    }

    @Override
    public String toString() {
        // Convert functionTypeParameterList to a string
        String parameterListString = functionTypeParameterList != null ?
                functionTypeParameterList.toString() : "No Parameters";

        // Convert functionReturnTypeParameterList to a string
        String returnTypeListString = functionReturnTypeParameterList != null ?
                functionReturnTypeParameterList.toString() : "No Return Type";

        // Convert modifiers to a string
        String modifiersString = functionModifiers.isEmpty() ? "No Modifiers" :
                functionModifiers.stream()
                        .map(Modifier::toString)
                        .collect(Collectors.joining(", "));

        // Return a readable format combining all elements
        return "FunctionTypeName: [Parameters: " + parameterListString
                + ", Return Type: " + returnTypeListString
                + ", Modifiers: " + modifiersString + "]";
    }
}
