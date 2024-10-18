package main.visitor;

import main.ast.nodes.SourceUnit;
import main.ast.nodes.declaration.StructDefinition;
import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.declaration.utility.Parameter;
import main.ast.nodes.declaration.utility.ParameterList;
import main.ast.nodes.expression.primary.Type;
import main.ast.nodes.expression.type.Mapping;
import main.ast.nodes.expression.type.primitive.AddressType;
import main.ast.nodes.expression.type.primitive.BoolType;
import main.ast.nodes.expression.type.primitive.UintType;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.*;
import main.utils.CGUtils;
import main.utils.DependencyNode;
import org.antlr.v4.runtime.misc.Pair;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CodeGeneration extends Visitor<Void> {
    private String initTab = "";
    private Map<String, String> variableNameMap = new HashMap<>();
    private Map<Pair<Type, Type>, String> mappings = new HashMap<>();
    private String outputPath;
    private FileWriter currentFile;
    private String outputFileName;
    private Set<DependencyNode> initNodes;
    private List<ContractDefinitionSymbolTableItem> contractDefinitions = new ArrayList<>();
    private boolean isNewMappingAdded = false;

    public CodeGeneration(Set<DependencyNode> initNodes, String outputFileName) {
        this.outputFileName = outputFileName;
        Set<DependencyNode> clearInitNodes = new HashSet<>();
        for (DependencyNode dependencyNode : initNodes) {
            if (dependencyNode.getItemKey() instanceof FunctionDefinitionSymbolTableItem functionDefinitionSymbolTableItem) {
                if (!CGUtils.isBuiltIn(functionDefinitionSymbolTableItem.getFunctionName())) {
                    clearInitNodes.add(dependencyNode);
                }
            }
            else {
                clearInitNodes.add(dependencyNode);
            }
        }
        this.initNodes = clearInitNodes;

        for (DependencyNode dependencyNode : initNodes) {
            if (dependencyNode.getItemKey() instanceof FunctionDefinitionSymbolTableItem) {
                if(!this.contractDefinitions.contains(((FunctionDefinitionSymbolTableItem) dependencyNode.getItemKey()).getContractDefinitionSymbolTableItem())) {
                    this.contractDefinitions.add(((FunctionDefinitionSymbolTableItem) dependencyNode.getItemKey()).getContractDefinitionSymbolTableItem());
                }
            }
        }
    }

    @Override
    public Void visit(SourceUnit sourceUnit) {
        prepareOutputFolder();
        createFile(this.outputFileName);
        addCommand(this.header, false);

        addStrcuts();
        addMapings();
        addAct();
        addProc();
        addInit();
        
        SymbolTable symbolTable = SymbolTable.root;
        for (SymbolTableItem item : symbolTable.items.values()) {
            item.accept(this);
        }

        return null;
    }

    private void addStrcuts() {
        for (DependencyNode dependencyNode : this.initNodes) {
            if (dependencyNode.getItemKey() instanceof StructDefinitionSymbolTableItem) {
                StructDefinitionSymbolTableItem structItem = (StructDefinitionSymbolTableItem) dependencyNode.getItemKey();
                StructDefinition structDefinition = structItem.getStructDefinition();
                String structName = structDefinition.getNameId().getName();

                addCommand("sort " + structName + ";", false);

                String constructorSignature = CGUtils.buildConstructor(structDefinition);
                addCommand("cons emp" + structName + " : " + structName + ";", false);
                addCommand("add" + structName + " : " + constructorSignature + " -> " + structName + ";", true);

                addCommand("map", false);
                for (VariableDeclaration varDecl : structDefinition.getVariableDeclarations()) {
                    String varName = varDecl.getVariableName().getName();
                    String varType = CGUtils.typeBuilder(varDecl.getVariableType());
                    addCommand("get" + CGUtils.capitalizeFirstLetter(varName) + structName + " : " + structName + " -> " + varType + ";", true);
                }

                addCommand("var", false);
                for (VariableDeclaration varDecl : structDefinition.getVariableDeclarations()) {
                    String varName = varDecl.getVariableName().getName();
                    String varType = CGUtils.typeBuilder(varDecl.getVariableType());
                    String randomVarName = getOrGenerateRandomVarName(varName);
                    addCommand(randomVarName + " : " + varType + ";", true);
                }

                addCommand("eqn", false);
                for (VariableDeclaration varDecl : structDefinition.getVariableDeclarations()) {
                    String varName = varDecl.getVariableName().getName();
                    String accessorName = "get" + CGUtils.capitalizeFirstLetter(varName) + structName;
                    String randomVarName = getOrGenerateRandomVarName(varName);
                    String varType = CGUtils.typeBuilder(varDecl.getVariableType());
                    String defaultValue = CGUtils.getDefaultValue(varType);

                    addCommand(accessorName + "(emp" + structName + ") = " + defaultValue + ";", true);
                    addCommand(accessorName + "(add" + structName + "(" + buildAccessorParams(structDefinition) + ")) = " + randomVarName + ";", true);
                }
                addCommand(this.endOfEachPart, false);
            }
        }
    }

    private String buildAccessorParams(StructDefinition structDefinition) {
        StringBuilder params = new StringBuilder();
        for (VariableDeclaration varDecl : structDefinition.getVariableDeclarations()) {
            String varName = varDecl.getVariableName().getName();
            String randomVarName = getOrGenerateRandomVarName(varName); // Get or generate the random name

            if (!params.isEmpty()) {
                params.append(",");
            }
            params.append(randomVarName); // Append the random variable name
        }
        return params.toString();
    }

    private String getOrGenerateRandomVarName(String varName) {
        if (!variableNameMap.containsKey(varName)) {
            String randomVarName = CGUtils.generateRandomString();
            while (variableNameMap.containsValue(randomVarName)) {
                randomVarName = CGUtils.generateRandomString();
            }
            variableNameMap.put(varName, randomVarName);
        }
        return variableNameMap.get(varName);
    }

    private void addMapings() {
        for (DependencyNode dependencyNode : this.initNodes) {
            if (dependencyNode.getItemKey() instanceof StateVariableSymbolTableItem) {
                Type type = ((StateVariableSymbolTableItem) dependencyNode.getItemKey()).getType();
                if (type instanceof Mapping mapping) {
                    Type keyType = mapping.getMappingKey();
                    Type valueType = mapping.getMappingValue();
                    String mappingName = getMappingName(keyType, valueType);

                    if (!this.isNewMappingAdded)
                        return;

                    String empty = "empty" + CGUtils.capitalizeFirstLetter(mappingName),
                            add = "add" + CGUtils.capitalizeFirstLetter(mappingName),
                            retValue = "retValue" + CGUtils.capitalizeFirstLetter(mappingName),
                            search = "search" + CGUtils.capitalizeFirstLetter(mappingName),
                            update = "update" + CGUtils.capitalizeFirstLetter(mappingName);

                    addCommand("sort " + mappingName + ";", false);
                    addCommand("cons " + empty + " : " + mappingName + ";", false);
                    addCommand(add + " : " + CGUtils.typeBuilder(keyType) + "#" + CGUtils.typeBuilder(valueType) + "#" + mappingName + " -> " + mappingName + ";", true);

                    addCommand("map", false);
                    addCommand(retValue + " : " + CGUtils.typeBuilder(keyType) + "#" + mappingName + " -> " + CGUtils.typeBuilder(valueType) + ";", true);
                    addCommand(search + " : " + CGUtils.typeBuilder(keyType) + "#" + mappingName + " -> Bool;", true);
                    addCommand(update + " : " + CGUtils.typeBuilder(keyType) + "#" + CGUtils.typeBuilder(valueType) + "#" + mappingName + " -> " + mappingName + ";", true);

                    addCommand("var", false);
                    addCommand("array : " + mappingName + ";", true);
                    addCommand("b,d : " + CGUtils.typeBuilder(valueType) + ";", true);
                    addCommand("a,c : " + CGUtils.typeBuilder(keyType) + ";", true);

                    addCommand("eqn", false);
                    addCommand(retValue + "(a," + empty + ") = -1;", true);
                    addCommand(retValue + "(a," + add + "(c,b,array)) = if(a == c,b," + retValue + "(a,array));", true);
                    addCommand(search + "(a," + empty + ") = false;", true);
                    addCommand(search + "(a," + add + "(c,b,array)) = if(a == c,true," + search + "(a,array));", true);
                    addCommand(update + "(a,b," + empty + ") = " + empty + ";", true);
                    addCommand(update + "(a,b," + add + "(c,d,array)) = if(a == c," + add + "(a,b,array)," + add + "(c,d," + update + "(a,b,array)));", true);

                    addCommand(this.endOfEachPart, false);
                }
            }
        }
    }

    private String getMappingName(Type keyType, Type valueType) {
        for (Map.Entry<Pair<Type, Type>, String> entry : mappings.entrySet()) {
            Pair<Type, Type> key = entry.getKey();
            String value = entry.getValue();
            if (keyType.getClass() ==  key.a.getClass() && valueType.getClass() == key.b.getClass()) {
                this.isNewMappingAdded = false;
                return value;
            }
        }

        String mappingName = "mapping" + (mappings.size() + 1);
        mappings.put(new Pair<Type, Type>(keyType, valueType), mappingName);
        this.isNewMappingAdded = true;
        return mappingName;
    }

    private void addAct() {
        addCommand("act", false);
        addCommand("", false);
    }

    private void addProc() {
        addCommand("proc", false);
        initTab = "\t";
        addHarness();
        addContracts();
        addOtherParts();
        initTab = "";
        addCommand("", false);
    }

    private void addHarness() {
        addCommand("harness(destructCounter:Int) =", false);
        addCommand("", false);
    }

    private void addContracts() {
        for (ContractDefinitionSymbolTableItem contractDefinitionSymbolTableItem : this.contractDefinitions) {
            buildContractScope(contractDefinitionSymbolTableItem);
            addContractFunctions(contractDefinitionSymbolTableItem);
        }
    }

    private void buildContractScope(ContractDefinitionSymbolTableItem contractDefinitionSymbolTableItem) {
        // Placeholder variable names
        String userBalancesMapping = "userBalances";
        StringBuilder declareLine = new StringBuilder(contractDefinitionSymbolTableItem.getContractName() + "(");

        // Iterate through the contract's state variables
        for (SymbolTableItem symbolTableItem : contractDefinitionSymbolTableItem.getContractSymbolTable().items.values()) {
            if (symbolTableItem instanceof StateVariableSymbolTableItem stateVariableSymbolTableItem) {
                Type type = stateVariableSymbolTableItem.getType();

                String varName = stateVariableSymbolTableItem.getVariableName();

                // Handle mapping type (like userBalances)
                if (type instanceof Mapping mapping) {
                    declareLine.append(varName).append(":" + this.mappings.get(new Pair<Type, Type>(mapping.getMappingKey(), mapping.getMappingValue())) + ",");
                }
                // Handle AddressType (like highestBidder)
                else if (type instanceof AddressType) {
                    declareLine.append(varName).append(":Address,");
                }
                // Handle UintType (like highestBid)
                else if (type instanceof UintType) {
                    declareLine.append(varName).append(":Int,");
                }
                // Handle BoolType
                else if (type instanceof BoolType) {
                    declareLine.append(varName).append(":Bool,");
                }
            }
        }

        // Close the contract declaration
        declareLine.append("balance").append(":Int) =");
        addCommand(declareLine.toString(), false);
        addCommand("", false);


//        // Sum logic for addToBalance
//        addCommand("sum value:Int.sum addr:Address.get_addToBalance(value,addr).addToBalance(" + userBalancesMapping + "," + daoBalance + ",value,addr) +", true);
//
//        // Sum logic for withdrawBalance
//        addCommand("sum amount:Int.sum addr:Address.get_withdrawBalance(amount,addr).withdrawBalance(" + userBalancesMapping + "," + daoBalance + ",amount,addr) +", true);
//
//        // Sum logic for updateDAO
//        addCommand("sum value:Int.sum addr:Address.get_updateDAO(value,addr).DAO(update(addr,(retValue(addr," + userBalancesMapping + ")) - value," + userBalancesMapping + ")," + daoBalance + ") +", true);
//
//        // Sum logic for selfdestruct
//        addCommand("sum value:Int.sum addr:Address.get_selfdestruct(value,addr).DAO(" + userBalancesMapping + "," + daoBalance + " + value);", true);
    }

    private void addContractFunctions(ContractDefinitionSymbolTableItem contractDefinitionSymbolTableItem) {
        for (DependencyNode dependencyNode : initNodes) {
            SymbolTableItem symbolTableItem = dependencyNode.getItemKey();
            if (!contractDefinitionSymbolTableItem.getContractSymbolTable().items.containsValue(symbolTableItem)) {
                continue;
            }

            if (symbolTableItem instanceof FunctionDefinitionSymbolTableItem functionDefinitionSymbolTableItem) {
                String functionName = functionDefinitionSymbolTableItem.getFunctionName();
                ParameterList parameters = functionDefinitionSymbolTableItem.getFunctionDefinitionPointer().getParameterList();
                ParameterList returnParameters = functionDefinitionSymbolTableItem.getReturnParameterList();

                StringBuilder functionSignature = new StringBuilder();
                functionSignature.append(functionName).append("(");

                if (parameters != null) {
                    for (Parameter param : parameters.getParameters()) {
                        String paramName = param.getIdentifier().getName();
                        String paramType = CGUtils.typeBuilder(param.getType()); // Use CGUtils to resolve the type
                        functionSignature.append(paramName).append(":").append(paramType).append(",");
                    }

                    // Remove the last comma
                    if (functionSignature.charAt(functionSignature.length() - 1) == ',') {
                        functionSignature.setLength(functionSignature.length() - 1);
                    }
                }

                for (String builtInVar : functionDefinitionSymbolTableItem.getBuiltInusedVars())
                    functionSignature.append(builtInVar).append(":").append(CGUtils.getBuiltInVarType(builtInVar)).append(",");

                functionSignature.append("balance").append(":Int");
                functionSignature.append(")");

                // Generate the command for each function
                addCommand(functionSignature.toString() + " =", false);
                addCommand("", false);

            }
        }
    }


    private void addOtherParts() {

    }

    private void addInit() {
        addCommand("init", false);
    }

    private void prepareOutputFolder() {
        this.outputPath = "output/";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e) {

        }
    }

    private void createFile(String name) {
        try {
            String path = this.outputPath + name + ".mcrl2";
            File file = new File(path);
            file.createNewFile();
            this.currentFile = new FileWriter(path);
        } catch (IOException e) {//never reached
        }
    }

    private void addCommand(String command, Boolean hasTab) {
        try {
            this.currentFile.write(initTab);
            if (hasTab) {
                this.currentFile.write("\t");
            }
            this.currentFile.write(command + "\n");
            this.currentFile.flush();
        } catch (IOException e) {//unreachable

        }
    }

    @Override
    public Void visit(ContractDefinitionSymbolTableItem contractDefinitionSymbolTableItem) {
        SymbolTable contractDefinitionSymbolTable = contractDefinitionSymbolTableItem.getContractSymbolTable();
        for (SymbolTableItem item : contractDefinitionSymbolTable.items.values()) {
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
        List<SymbolTableItem> sortedItems = new ArrayList<>(functionDefinitionSymbolTableItem.getSymbolTable().items.values());
        sortedItems.sort(Comparator.comparingInt(this::getItemLineNumber));

        for (SymbolTableItem item : sortedItems) {
            item.accept(this);
        }

        return null;
    }

    private int getItemLineNumber(SymbolTableItem item) {
        try {
            return ((FunctionCallSymbolTableItem)item).getFunctionName().getLine();
        } catch (Exception e) {
            return Integer.MAX_VALUE;
        }
    }

    private String endOfEachPart = "%-------------------------------------------------";
    private String header = """
sort Address;
cons Normal,Attacker,Owner,null,Contract : Address;
map
\tequal : Address#Address -> Bool;
var ad1,ad2: Address;
eqn
\tequal(Normal,Normal) = true;
\tequal(Normal,Attacker) = false;
\tequal(Normal,Owner) = false;
\tequal(Normal,null) = false;
\tequal(Normal,Contract) = false;
\tequal(Attacker,Attacker) = true;
\tequal(Attacker,Normal) = false;
\tequal(Attacker,Owner) = false;
\tequal(Attacker,null) = false;
\tequal(Attacker,Contract) = false;
\tequal(Owner,Owner) = true;
\tequal(Owner,Normal) = false;
\tequal(Owner,Attacker) = false;
\tequal(Owner,null) = false;
\tequal(Owner,Contract) = false;
\tequal(null,null) = true;
\tequal(null,Normal) = false;
\tequal(null,Attacker) = false;
\tequal(null,Owner) = false;
\tequal(null,Contract) = false;
\tequal(Contract,Contract) = true;
\tequal(Contract,Normal) = false;
\tequal(Contract,Attacker) = false;
\tequal(Contract,Owner) = false;
\tequal(Contract,null) = false;
\tad1 == ad2 = equal(ad1,ad2);
%-------------------------------------------------""";


}
