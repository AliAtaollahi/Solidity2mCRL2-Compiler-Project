package main.ast.nodes.declaration;

import main.ast.nodes.declaration.utility.ModifierList;
import main.ast.nodes.declaration.utility.ParameterList;
import main.ast.nodes.expression.PrimaryExpression;
import main.ast.nodes.expression.primary.FunctionDescriptor;
import main.ast.nodes.statement.Block;
import main.visitor.IVisitor;

public class FunctionDefinition extends ContractPart {
    private PrimaryExpression functionDescriptor;
    private ParameterList parameterList;
    private ModifierList modifierList;
    private ParameterList returnParameterList;
    private Block scope;

    public FunctionDefinition(PrimaryExpression functionDescriptor, ParameterList parameterList, ModifierList modifierList) {
        this.functionDescriptor = functionDescriptor;
        this.parameterList = parameterList;
        this.modifierList = modifierList;
    }

    public void setReturnParameterList(ParameterList returnParameterList) {
        this.returnParameterList = returnParameterList;
    }

    public void setScope(Block scope) {
        this.scope = scope;
    }

    @Override
    public<T>T accept(IVisitor<T> visitor){return visitor.visit(this);}
}