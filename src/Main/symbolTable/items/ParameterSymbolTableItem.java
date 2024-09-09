package main.symbolTable.items;

import main.ast.nodes.expression.primary.Type;
import main.ast.nodes.expression.value.StorageLocation;

public class ParameterSymbolTableItem extends SymbolTableItem {
    private String parameterName;
    private Type parameterType;
    private StorageLocation storageLocation;

    public ParameterSymbolTableItem(String parameterName, Type parameterType, StorageLocation storageLocation) {
        this.parameterName = parameterName;
        this.parameterType = parameterType;
        this.storageLocation = storageLocation;
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
}
