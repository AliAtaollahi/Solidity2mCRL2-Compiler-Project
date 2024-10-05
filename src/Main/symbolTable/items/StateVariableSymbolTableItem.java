package main.symbolTable.items;

import main.ast.nodes.declaration.ContractDefinition;
import main.ast.nodes.declaration.StateVariableDeclaration;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.primary.Type;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

public class StateVariableSymbolTableItem extends SymbolTableItem {
    public static String START_KEY = "StateVariable_";

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    private String variableName;
    private Type type;
    private Expression value;
    private StateVariableDeclaration stateVariableDeclaration;
    private SymbolTable currentSymbolTable;
    private ContractDefinition currentContractDefinition;

    public StateVariableSymbolTableItem(String variableName, Type type, Expression value, StateVariableDeclaration stateVariableDeclaration, SymbolTable currentSymbolTable, ContractDefinition currentContractDefinition) {
        this.variableName = variableName;
        this.type = type;
        this.value = value;
        this.stateVariableDeclaration = stateVariableDeclaration;
        this.setLine(stateVariableDeclaration.getLine());
        this.currentSymbolTable = currentSymbolTable;
        this.currentContractDefinition = currentContractDefinition;
    }

    @Override
    public String getKey() {
        return this.START_KEY + variableName;
    }

    public String getVariableName() {
        return variableName;
    }

    public Type getType() {
        return type;
    }

    public Expression getValue() {
        return value;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public SymbolTable getCurrentSymbolTable() {
        return currentSymbolTable;
    }

    public void setCurrentSymbolTable(SymbolTable currentSymbolTable) {
        this.currentSymbolTable = currentSymbolTable;
    }

    public StateVariableDeclaration getStateVariableDeclaration() {
        return stateVariableDeclaration;
    }

    public void setStateVariableDeclaration(StateVariableDeclaration stateVariableDeclaration) {
        this.stateVariableDeclaration = stateVariableDeclaration;
    }

    public ContractDefinition getCurrentContractDefinition() {
        return currentContractDefinition;
    }

    public void setCurrentContractDefinition(ContractDefinition currentContractDefinition) {
        this.currentContractDefinition = currentContractDefinition;
    }
}
