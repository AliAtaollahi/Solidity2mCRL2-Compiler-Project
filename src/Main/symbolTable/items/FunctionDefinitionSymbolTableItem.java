package main.symbolTable.items;

import main.ast.nodes.declaration.ContractDefinition;
import main.ast.nodes.declaration.utility.Parameter;
import main.symbolTable.SymbolTable;

import java.sql.Blob;

import main.ast.nodes.declaration.FunctionDefinition;
import main.ast.nodes.declaration.utility.ModifierList;

import main.ast.nodes.declaration.utility.ParameterList;
import main.ast.nodes.statement.Block;
import main.ast.nodes.declaration.utility.ModifierList;
import main.visitor.IVisitor;

public class FunctionDefinitionSymbolTableItem extends SymbolTableItem {
    private String functionName;
    private SymbolTable symbolTable;
    private ModifierList modifierList;
    private ParameterList returnParameterList;  // Store return parameters
    private Block scope;
    private ContractDefinition contractDefinitionContainer = null;
    private FunctionDefinition functionDefinitionPointer;

    public FunctionDefinitionSymbolTableItem(String functionName, FunctionDefinition functionDefinition, ContractDefinition contractDefinition) {
        this.functionName = functionName;
        this.functionDefinitionPointer = functionDefinition;
        this.contractDefinitionContainer = contractDefinition;
    }

    @Override
    public String getKey() {
        // Start with the function name
        StringBuilder keyBuilder = new StringBuilder(FunctionDefinition.START_KEY + functionName);

        // Append parameter types to the key
        if (functionDefinitionPointer.getParameterList() != null) {
            keyBuilder.append("(");
            for (Parameter param : functionDefinitionPointer.getParameterList().getParameters()) {
                keyBuilder.append(param.getType().toString()).append(",");
            }

            // Remove the last comma if there are parameters
            if (keyBuilder.charAt(keyBuilder.length() - 1) == ',') {
                keyBuilder.setLength(keyBuilder.length() - 1);
            }

            keyBuilder.append(")");
        } else {
            keyBuilder.append("()");
        }

        return keyBuilder.toString();
    }


    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public ModifierList getModifierList() {
        return modifierList;
    }

    public void setModifierList(ModifierList modifierList) {
        this.modifierList = modifierList;
    }

    public ParameterList getReturnParameterList() {
        return returnParameterList;
    }

    public void setReturnParameterList(ParameterList returnParameterList) {
        this.returnParameterList = returnParameterList;
    }

    public Block getScope() {
        return scope;
    }

    public void setScope(Block scope) {
        this.scope = scope;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ContractDefinition getContractDefinitionContainer() {
        return contractDefinitionContainer;
    }

    public void setContractDefinitionContainer(ContractDefinition contractDefinitionContainer) {
        this.contractDefinitionContainer = contractDefinitionContainer;
    }

    public FunctionDefinition getFunctionDefinitionPointer() {
        return functionDefinitionPointer;
    }

    public void setFunctionDefinitionPointer(FunctionDefinition functionDefinitionPointer) {
        this.functionDefinitionPointer = functionDefinitionPointer;
    }
}

