package main.visitor;

import main.ast.nodes.SourceUnit;
import main.ast.nodes.declaration.ContractDefinition;
import main.ast.nodes.declaration.ContractPart;
import main.ast.nodes.declaration.FunctionDefinition;
import main.ast.nodes.declaration.utility.ContractType;
import main.ast.nodes.declaration.utility.InheritanceSpecifier;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.modifier.Modifier;
import main.ast.nodes.expression.primary.*;
import main.ast.nodes.expression.type.UserDefinedTypeName;
import main.ast.nodes.statement.Statement;
import main.symbolTable.SymbolTable;
import main.symbolTable.items.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class NewExclusionAnalyzer extends Visitor<Void> {
    private SourceUnit sourceUnit;
    private ArrayList<ContractDefinition> deletedContractDefinitions = new ArrayList<>();
    private ArrayList<FunctionDefinition> deletedFunctionDefinitions = new ArrayList<>();

    private ExpressionAnalyzer expressionAnalyzer = new ExpressionAnalyzer();
    private Iterator<Map.Entry<String, SymbolTableItem>> currentIterator1;
    private Iterator<SymbolTableItem> currentIterator2;

    @Override
    public Void visit(SourceUnit sourceUnit) {
        this.sourceUnit = sourceUnit;
        SymbolTable symbolTable = SymbolTable.root;
        Iterator<Map.Entry<String, SymbolTableItem>> iterator = symbolTable.items.entrySet().iterator();

        while (iterator.hasNext()) {
            this.currentIterator1 = iterator;
            Map.Entry<String, SymbolTableItem> entry = iterator.next();
            SymbolTableItem item = entry.getValue();
            item.accept(this);

            if (item instanceof ContractDefinitionSymbolTableItem) {
                ContractDefinitionSymbolTableItem tempItem = (ContractDefinitionSymbolTableItem) item;

                // Rule 2 of elimination rules
                if (tempItem.getContractDefinition().getContractType().equals(ContractType.INTERFACE)) {
                    ContractDefinition mustDeletedContractDefinition = tempItem.getContractDefinition();
                    this.deletedContractDefinitions.add(mustDeletedContractDefinition);
                    sourceUnit.removeContractDefinition(mustDeletedContractDefinition);
                    iterator.remove();
                }
                // Rule 8 of elimination rules
                else if (tempItem.getContractSymbolTable().getItemsSize() == 0) {
                    ContractDefinition mustDeletedContractDefinition = tempItem.getContractDefinition();
                    this.deletedContractDefinitions.add(mustDeletedContractDefinition);
                    sourceUnit.removeContractDefinition(mustDeletedContractDefinition);
                    iterator.remove();
                }
            }
        }

        return null;
    }


    @Override
    public Void visit(ContractDefinitionSymbolTableItem contractDefinitionSymbolTableItem) {
        SymbolTable contractDefinitionSymbolTable = contractDefinitionSymbolTableItem.getContractSymbolTable();
        ContractDefinition contractDefinition = contractDefinitionSymbolTableItem.getContractDefinition();

        // Rule 2 of elimination rules
        ArrayList<InheritanceSpecifier> cleanInheritanceSpecifiers = new ArrayList<>();
        for (InheritanceSpecifier inheritanceSpecifier : contractDefinition.getInheritanceSpecifiers()) {
            boolean check = true;
            if (inheritanceSpecifier != null) {
                if (inheritanceSpecifier.getType() instanceof UserDefinedTypeName) {
                    for (ContractDefinition contractDefinition1 : this.deletedContractDefinitions) {
                        if (((UserDefinedTypeName) inheritanceSpecifier.getType()).getTypeChain().contains(contractDefinition1.getName())) {
                            check = false;
                        }
                    }
                }
                if (check) {
                    cleanInheritanceSpecifiers.add(inheritanceSpecifier);
                    inheritanceSpecifier.accept(this);
                }
            }
        }
        contractDefinition.setInheritanceSpecifiers(cleanInheritanceSpecifiers);
        contractDefinitionSymbolTableItem.setInheritanceSpecifiers(cleanInheritanceSpecifiers);

        Iterator<SymbolTableItem> iterator = contractDefinitionSymbolTable.items.values().iterator();
        while (iterator.hasNext()) {
            this.currentIterator2 = iterator;
            SymbolTableItem item = iterator.next();
            item.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(CustomErrorSymbolTableItem customErrorSymbolTableItem) {
        SymbolTable customErrorSymbolTable = customErrorSymbolTableItem.getSymbolTable();
        for (SymbolTableItem item : customErrorSymbolTable.items.values()) {
            item.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(EnumDefinitionSymbolTableItem enumDefinitionSymbolTableItem) {
        SymbolTable enumDefinitionSymbolTable = enumDefinitionSymbolTableItem.getSymbolTable();
        for (SymbolTableItem item : enumDefinitionSymbolTable.items.values()) {
            item.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(EnumValueSymbolTableItem enumValueSymbolTableItem) {
        return null;
    }

    @Override
    public Void visit(FileLevelConstantSymbolTableItem fileLevelConstantSymbolTableItem) {
        return null;
    }

    @Override
    public Void visit(FunctionCallSymbolTableItem functionCallSymbolTableItem) {

        return null;
    }

    @Override
    public Void visit(VariantTypeVariableDeclarationSymbolTableItem variantTypeVariableDeclarationSymbolTableItem) {
        return null;
    }

    @Override
    public Void visit(VariableDeclarationSymbolTableItem variableDeclarationSymbolTableItem) {
        return null;
    }

    @Override
    public Void visit(UsingForSymbolTableItem usingForSymbolTableItem) {
        return null;
    }

    @Override
    public Void visit(StructDefinitionSymbolTableItem structDefinitionSymbolTableItem) {
        SymbolTable structDefinitionSymbolTable = structDefinitionSymbolTableItem.getSymbolTable();
        for (SymbolTableItem item : structDefinitionSymbolTable.items.values()) {
            item.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(StateVariableSymbolTableItem stateVariableSymbolTableItem) {
        return null;
    }

    @Override
    public Void visit(PrimaryExpressionSymbolTableItem primaryExpressionSymbolTableItem) {
        return null;
    }

    @Override
    public Void visit(ParameterSymbolTableItem parameterSymbolTableItem) {
        return null;
    }

    @Override
    public Void visit(ModifierDefinitionSymbolTableItem modifierDefinitionSymbolTableItem) {
        SymbolTable modifierDefinitionSymbolTable = modifierDefinitionSymbolTableItem.getSymbolTable();
        for (SymbolTableItem item : modifierDefinitionSymbolTable.items.values()) {
            item.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(FunctionDefinitionSymbolTableItem functionDefinitionSymbolTableItem) {

        // Rule 9 of elimination rules
        if(functionDefinitionSymbolTableItem.getScope() != null) {
            if (this.expressionAnalyzer.findItem("keccak256", functionDefinitionSymbolTableItem.getScope())) {
                deleteFunctionDefinitionSymbolTableItem(functionDefinitionSymbolTableItem);
                return null;
            } else if (this.expressionAnalyzer.findAccessExpression("abi", "encodePacked", functionDefinitionSymbolTableItem.getScope())) {
                deleteFunctionDefinitionSymbolTableItem(functionDefinitionSymbolTableItem);
                return null;
            }
        }

        SymbolTable functionDefinitionSymbolTable = functionDefinitionSymbolTableItem.getSymbolTable();
        for (SymbolTableItem item : functionDefinitionSymbolTable.items.values()) {
            item.accept(this);
        }
        return null;
    }

    private void deleteFunctionDefinitionSymbolTableItem(FunctionDefinitionSymbolTableItem functionDefinitionSymbolTableItem) {
        String functionKey = functionDefinitionSymbolTableItem.getKey();
        if(functionDefinitionSymbolTableItem.getContractDefinitionContainer() == null) {
            sourceUnit.removeFunctionDefinition(functionDefinitionSymbolTableItem.getFunctionDefinitionPointer());
            this.currentIterator1.remove();
        }
        else {
            ContractDefinition contractDefinition = functionDefinitionSymbolTableItem.getContractDefinitionContainer();
            contractDefinition.removeFunctionDefinition(functionDefinitionSymbolTableItem.getFunctionDefinitionPointer());
            SymbolTable symbolTable = functionDefinitionSymbolTableItem.getSymbolTable().pre;
            this.currentIterator2.remove();
        }
    }
}
