package main.symbolTable.items;

import main.ast.nodes.declaration.utility.Parameter;
import main.ast.nodes.expression.primary.Type;
import main.ast.nodes.expression.value.StorageLocation;
import main.visitor.IVisitor;

public class ParameterSymbolTableItem extends SymbolTableItem {
    private String parameterName;
    private Type parameterType;
    private StorageLocation storageLocation;
    private Parameter parameter;

    public ParameterSymbolTableItem(String parameterName, Type parameterType, StorageLocation storageLocation, Parameter parameter) {
        this.parameterName = parameterName;
        this.parameterType = parameterType;
        this.storageLocation = storageLocation;
        this.parameter = parameter;
        this.setLine(parameter.getLine());
    }

    @Override
    public String getKey() {
        return parameterName;
    }

    public String getParameterName() {
        return parameterName;
    }

    public Type getParameterType() {
        return parameterType;
    }

    public StorageLocation getStorageLocation() {
        return storageLocation;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
