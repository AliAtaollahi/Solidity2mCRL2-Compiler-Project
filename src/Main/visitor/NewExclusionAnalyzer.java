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
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.*;
import main.utils.TokensHandler;

import java.util.*;

public class NewExclusionAnalyzer extends Visitor<Void> {
    private SourceUnit sourceUnit;
    private ArrayList<ContractDefinition> deletedContractDefinitions = new ArrayList<>();
    private ArrayList<FunctionDefinition> deletedFunctionDefinitions = new ArrayList<>();

    private ExpressionAnalyzer expressionAnalyzer = new ExpressionAnalyzer();
    private Iterator<Map.Entry<String, SymbolTableItem>> currentIterator1;
    private Iterator<SymbolTableItem> currentIterator2;
    private Map<String, List<String>> tokenContracts = new HashMap<>();
    private TokensHandler tokensHandler = new TokensHandler();
    private Iterator<SymbolTableItem> currentIterator3;

    @Override
    public Void visit(SourceUnit sourceUnit) {
        for (String token : this.tokensHandler.getTokens()) {
            TokensHandler.addToMap(tokenContracts, token, token);
        }

        this.sourceUnit = sourceUnit;
        SymbolTable symbolTable = SymbolTable.root;

        List<Map.Entry<String, SymbolTableItem>> entries = new ArrayList<>(symbolTable.items.entrySet());
        entries.sort(Comparator.comparingInt(entry -> entry.getValue().getLine()));
        for (Map.Entry<String, SymbolTableItem> entry : entries) {
            this.currentIterator1 = symbolTable.items.entrySet().iterator(); // Reset iterator to original set

            SymbolTableItem item = entry.getValue();
            item.accept(this);

            // Rule 2 of elimination rules
            if (item instanceof ContractDefinitionSymbolTableItem) {
                ContractDefinitionSymbolTableItem tempItem = (ContractDefinitionSymbolTableItem) item;

                if (tempItem.getContractDefinition().getContractType().equals(ContractType.INTERFACE)) {
                    ContractDefinition mustDeletedContractDefinition = tempItem.getContractDefinition();
                    this.deletedContractDefinitions.add(mustDeletedContractDefinition);
                    sourceUnit.removeContractDefinition(mustDeletedContractDefinition);
                    symbolTable.items.entrySet().remove(entry);
                }
                // Rule 8 of elimination rules
                else if (tempItem.getContractSymbolTable().getItemsSize() <= 4) {
                    ContractDefinition mustDeletedContractDefinition = tempItem.getContractDefinition();
                    this.deletedContractDefinitions.add(mustDeletedContractDefinition);
                    sourceUnit.removeContractDefinition(mustDeletedContractDefinition);
                    symbolTable.items.entrySet().remove(entry);
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
                            String temp = ((UserDefinedTypeName) inheritanceSpecifier.getType()).getTypeChain().getFirst().getName();
                            boolean res = TokensHandler.addToMapIfStringFound(this.tokenContracts, contractDefinitionSymbolTableItem.getContractName(), temp);
                            if (res) {
                                contractDefinitionSymbolTableItem.getContractDefinition().setContractType(ContractType.INTERFACE);
                            }
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
        if (functionCallSymbolTableItem.getFunctionName() instanceof AccessExpression) {
            if (((AccessExpression) functionCallSymbolTableItem.getFunctionName()).getMaster() instanceof Identifier) {
                String nameOfCaller = ((Identifier)((AccessExpression) functionCallSymbolTableItem.getFunctionName()).getMaster()).getName();
                try {
                    SymbolTableItem item = functionCallSymbolTableItem.getCurrentSymbolTable().getItem(VariableDeclarationSymbolTableItem.START_KEY + nameOfCaller, true);
                    String tokenName = ((UserDefinedTypeName)((VariableDeclarationSymbolTableItem)item).getType()).getTypeChain().get(0).getName();
                    this.tokensHandler.buildByBuiltIn(tokenName, functionCallSymbolTableItem.getFunctionCallExpression());

                } catch (ItemNotFoundException e) {
                    try {
                        SymbolTableItem item = functionCallSymbolTableItem.getCurrentSymbolTable().getItem(StateVariableSymbolTableItem.START_KEY + nameOfCaller, true);
                        String tokenName = ((UserDefinedTypeName)((StateVariableSymbolTableItem)item).getType()).getTypeChain().get(0).getName();
                        this.tokensHandler.buildByBuiltIn(tokenName, functionCallSymbolTableItem.getFunctionCallExpression());

                    } catch (ItemNotFoundException e2) {

                    }
                }

            }
        }
        else if (functionCallSymbolTableItem.getFunctionName() instanceof Identifier) {
            String nameOfCaller = ((Identifier)functionCallSymbolTableItem.getFunctionName()).getName();
            if (TokensHandler.justFoundIfStringFound(this.tokenContracts, nameOfCaller)) {
                functionCallSymbolTableItem.getStatementCaller().getBlock().removeStatement(functionCallSymbolTableItem.getStatementCaller());
                this.currentIterator3.remove();
            }
        }

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
        Type type = stateVariableSymbolTableItem.getType();
        if (type instanceof UserDefinedTypeName) {
            String name = ((UserDefinedTypeName)type).getTypeChain().get(0).getName();
            if (TokensHandler.justFoundIfStringFound(this.tokenContracts, name)) {
                ContractDefinition currentContractDefinition = stateVariableSymbolTableItem.getCurrentContractDefinition();
                currentContractDefinition.removeStateVariableDeclaration(stateVariableSymbolTableItem.getStateVariableDeclaration());
            }
        }
//        if (TokensHandler.justFoundIfStringFound(this.tokenContracts, nameOfCaller)) {
//            functionCallSymbolTableItem.getStatementCaller().getBlock().removeStatement(functionCallSymbolTableItem.getStatementCaller());
//            this.currentIterator3.remove();
//        }

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
        Iterator<SymbolTableItem> iterator = functionDefinitionSymbolTable.items.values().iterator();
        while (iterator.hasNext()) {
            this.currentIterator3 = iterator;  // Storing the current iterator
            SymbolTableItem item = iterator.next();
            item.accept(this);  // Accept each item
        }
        return null;
    }

    private void deleteFunctionDefinitionSymbolTableItem(FunctionDefinitionSymbolTableItem functionDefinitionSymbolTableItem) {
        String functionKey = functionDefinitionSymbolTableItem.getKey();
        this.deletedFunctionDefinitions.add(functionDefinitionSymbolTableItem.getFunctionDefinitionPointer());
        if(functionDefinitionSymbolTableItem.getContractDefinitionContainer() == null) {
            sourceUnit.removeFunctionDefinition(functionDefinitionSymbolTableItem.getFunctionDefinitionPointer());
            this.deletedFunctionDefinitions.add(functionDefinitionSymbolTableItem.getFunctionDefinitionPointer());
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
