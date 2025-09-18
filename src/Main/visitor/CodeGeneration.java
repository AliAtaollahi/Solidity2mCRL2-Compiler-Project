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
import main.ast.nodes.expression.type.primitive.ListType;
import main.ast.nodes.expression.type.primitive.UintType;
import main.ast.nodes.statement.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.items.*;
import main.symbolTable.items.statement.DoWhileStatementSymbolTableItem;
import main.symbolTable.items.statement.ForStatementSymbolTableItem;
import main.symbolTable.items.statement.IfStatementSymbolTableItem;
import main.symbolTable.items.statement.WhileStatementSymbolTableItem;
import main.utils.CGUtils;
import main.utils.DependencyNode;
import org.antlr.v4.runtime.misc.Pair;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CodeGeneration extends Visitor<Void> {
    private String currentOuter = "";
    private VariableDeclarationCollector variableDeclarationCollector = new VariableDeclarationCollector();
    private Block initialStatement = new Block();

    private String initTab = "";
    private Map<String, String> variableNameMap = new HashMap<>();
    private Map<Pair<Type, Type>, String> mappings = new HashMap<>();
    private Map<Pair<Type, Type>, String> arrays = new HashMap<>();
    private String outputPath;
    private FileWriter currentFile;
    private String outputFileName;
    private Set<DependencyNode> initNodes;
    private List<ContractDefinitionSymbolTableItem> contractDefinitions = new ArrayList<>();
    private boolean isNewMappingAdded = false;
    private boolean isNewArrayAdded = false;
    private Set<StateVariableSymbolTableItem> stateVariableSymbolTableItems = new HashSet<>();
    private Stack<SymbolTableItem> statementsStack = new Stack<>();
    private Map<SymbolTableItem, String> labels = new HashMap<>();
    private Map<SymbolTableItem, String> labelsOuter = new HashMap<>();
    private Map<SymbolTableItem, String> labelsInner = new HashMap<>();
    private Map<SymbolTableItem, String> labelsElse = new HashMap<>();
    private Map<VariableDeclarationSymbolTableItem, String> variableRenames = new HashMap<>();
    private boolean hasDelegatecall;


    public CodeGeneration(Set<DependencyNode> initNodes, String outputFileName, boolean hasDelegatecall) {
        this.hasDelegatecall = hasDelegatecall;
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

        this.stateVariableSymbolTableItems = new HashSet<>();
        for (DependencyNode dependencyNode : this.initNodes) {
            if (dependencyNode.getItemKey() instanceof FunctionDefinitionSymbolTableItem functionDefinitionSymbolTableItem) {
                stateVariableSymbolTableItems.addAll(functionDefinitionSymbolTableItem.getStateVariableSymbolTableItems());
            }
        }

        for (DependencyNode dependencyNode : initNodes) {
            if (dependencyNode.getItemKey() instanceof FunctionDefinitionSymbolTableItem) {
                if(!this.contractDefinitions.contains(((FunctionDefinitionSymbolTableItem) dependencyNode.getItemKey()).getContractDefinitionSymbolTableItem())) {
                    if(((FunctionDefinitionSymbolTableItem) dependencyNode.getItemKey()).getContractDefinitionContainer().getName().getName().equals("abi"))
                        continue;

                    this.contractDefinitions.add(((FunctionDefinitionSymbolTableItem) dependencyNode.getItemKey()).getContractDefinitionSymbolTableItem());
                }
            }
        }

//        this.statementsStack.push(this.initialStatement);
    }

    @Override
    public Void visit(SourceUnit sourceUnit) {
        prepareOutputFolder();
        createFile(this.outputFileName);
        addCommand(this.header, false);

        addArrays();
        addStrcuts();
        addMapings();
        addFuncs();
        addAct();
        addProc();
        addInit();
        
        SymbolTable symbolTable = SymbolTable.root;
        symbolTable.items.values().stream()
                .sorted(Comparator.comparingInt(SymbolTableItem::getLine))
                .forEach(item -> item.accept(this));

        return null;
    }

    private void addArrays() {
        List<Type> types = new ArrayList<>();

        for (StateVariableSymbolTableItem stateVariableSymbolTableItem : this.stateVariableSymbolTableItems) {
            types.add(stateVariableSymbolTableItem.getType());
        }

        for (DependencyNode dependencyNode : initNodes) {
            SymbolTableItem symbolTableItem = dependencyNode.getItemKey();
            if (symbolTableItem instanceof FunctionDefinitionSymbolTableItem functionDefinitionSymbolTableItem) {
                // local variable
                List<VariableDeclarationSymbolTableItem> localVariables = getAndUpdateLocalVariables(functionDefinitionSymbolTableItem);
                for (VariableDeclarationSymbolTableItem localVariable : localVariables) {
                    types.add(localVariable.getType());
                }
            }
        }

        for (Type type : types) {
            if (!(type instanceof ListType))
                continue;
            // We assume the `type` here represents an array type.

            ListType listType = (ListType) type;
            String typeName = getArrayName(type, listType.getType());
            String insideBracket = CGUtils.typeBuilder(listType.getType());

            addCommand("sort " + typeName + ";", false);

            addCommand("cons empty" + typeName + " : " + typeName + ";", false);
            addCommand("add" + typeName + " : Nat#" + insideBracket + "#" + typeName + " -> " + typeName + ";", true);

            addCommand("map", false);
            addCommand("retItem" + typeName + " : Nat#" + typeName + " -> " + insideBracket + ";", true);
            addCommand("searchItem" + typeName + " : " + insideBracket + "#" + typeName + " -> Bool;", true);
            addCommand("searchIndex" + typeName + " : " + insideBracket + "#" + typeName + " -> Nat;", true);
            addCommand("update" + typeName + " : Nat#" + insideBracket + "#" + typeName + " -> " + typeName + ";", true);

            // Define variables
            addCommand("var", false);
            addCommand("array : " + typeName + ";", true);
            addCommand("b,d : Int;", true);
            addCommand("a,c : Nat;", true);

            // Define equations for each function
            addCommand("eqn", false);
            addCommand("retItem" + typeName + "(a, empty" + typeName + ") = -9000;", true);
            addCommand("retItem" + typeName + "(a, add" + typeName + "(c,b,array)) = if(a == c, b, retItem" + typeName + "(a, array));", true);

            addCommand("searchItem" + typeName + "(a, empty" + typeName + ") = false;", true);
            addCommand("searchItem" + typeName + "(a, add" + typeName + "(c,b,array)) = if(a == b, true, searchItem" + typeName + "(a, array));", true);

            addCommand("searchIndex" + typeName + "(a, empty" + typeName + ") = 9000;", true);
            addCommand("searchIndex" + typeName + "(a, add" + typeName + "(c,b,array)) = if(a == b, c, searchIndex" + typeName + "(a, array));", true);

            addCommand("update" + typeName + "(a, b, empty" + typeName + ") = empty" + typeName + ";", true);
            addCommand("update" + typeName + "(a, b, add" + typeName + "(c, d, array)) = if(a == c, add" + typeName + "(a, b, array), add" + typeName + "(c, d, update" + typeName + "(a, b, array)));", true);

            addCommand(this.endOfEachPart, false);
        }
    }

    private void addFuncs() {
        if(!hasDelegatecall) {
            return;
        }

        List<String> functionNames = new ArrayList<>();

        // Collect function names from initNodes
        for (DependencyNode dependencyNode : this.initNodes) {
            if (dependencyNode.getItemKey() instanceof FunctionDefinitionSymbolTableItem functionDefinitionSymbolTableItem) {
                functionNames.add(functionDefinitionSymbolTableItem.getFunctionName());
            }
        }

        // Add the sort command
        addCommand("sort FunctionName;", false);

        StringBuilder functionNamesConst = new StringBuilder("cons ");
        for (int i = 0; i < functionNames.size(); i++) {
            functionNamesConst.append(functionNames.get(i));
            if (i < functionNames.size() - 1) {
                functionNamesConst.append(",");
            }
        }
        functionNamesConst.append(" : FunctionName;");
        addCommand(functionNamesConst.toString(), false);

        addCommand("map\tequalFunc : FunctionName#FunctionName -> Bool;", false);

        addCommand("var f1,f2: FunctionName;", false);

        for (String functionName1 : functionNames) {
            for (String functionName2 : functionNames) {
                if (functionName1.equals(functionName2)) {
                    addCommand("eqn\tequalFunc(" + functionName1 + "," + functionName1 + ") = true;", false);
                } else {
                    addCommand("eqn\tequalFunc(" + functionName1 + "," + functionName2 + ") = false;", false);
                }
            }
        }

        addCommand("f1 == f2 = equalFunc(f1,f2);", false);
        addCommand(this.endOfEachPart, false);
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
        for (StateVariableSymbolTableItem stateVariableSymbolTableItem : this.stateVariableSymbolTableItems) {
            Type type = stateVariableSymbolTableItem.getType();
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

    private String getArrayName(Type keyType, Type valueType) {
        for (Map.Entry<Pair<Type, Type>, String> entry : arrays.entrySet()) {
            Pair<Type, Type> key = entry.getKey();
            String value = entry.getValue();
            if (keyType.getClass() ==  key.a.getClass() && valueType.getClass() == key.b.getClass()) {
                this.isNewArrayAdded = false;
                return value;
            }
        }

        String arrayName = "Array" + (arrays.size() + 1);
        arrays.put(new Pair<Type, Type>(keyType, valueType), arrayName);
        this.isNewArrayAdded = true;
        return arrayName;
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
        for (StateVariableSymbolTableItem stateVariableSymbolTableItem : this.stateVariableSymbolTableItems) {
            Type type = stateVariableSymbolTableItem.getType();

            String varName = stateVariableSymbolTableItem.getVariableName();

            if (type instanceof Mapping mapping) {
                declareLine.append(varName).append(":" + getMappingName(mapping.getMappingKey(), mapping.getMappingValue()) + ",");
            }
            else if (type instanceof AddressType) {
                declareLine.append(varName).append(":Address,");
            }
            else if (type instanceof UintType) {
                declareLine.append(varName).append(":Int,");
            }
            else if (type instanceof BoolType) {
                declareLine.append(varName).append(":Bool,");
            }
            else if (type instanceof ListType listType) {
                declareLine.append(varName).append(":" + getArrayName(type, listType) + ",");

            }
            else {
                System.out.println("");
            }

        }

        // Close the contract declaration
        declareLine.append("balance").append(":Int) =");
        addCommand(declareLine.toString(), false);

//        addCommand("sum value:Int.sum addr:Address.get_addToBalance(value,addr).addToBalance(" + userBalancesMapping + ",balance,value,addr) +", true);
        for (DependencyNode dependencyNode : initNodes) {
            SymbolTableItem symbolTableItem = dependencyNode.getItemKey();
            if (!contractDefinitionSymbolTableItem.getContractSymbolTable().items.containsValue(symbolTableItem)) {
                continue;
            }

            if (symbolTableItem instanceof FunctionDefinitionSymbolTableItem functionDefinitionSymbolTableItem) {
                String functionName = functionDefinitionSymbolTableItem.getFunctionName();
                ParameterList parameters = functionDefinitionSymbolTableItem.getFunctionDefinitionPointer().getParameterList();

                StringBuilder functionSignature = new StringBuilder();

                if (parameters != null) {
                    for (Parameter param : parameters.getParameters()) {
                        String paramName = param.getIdentifier().getName();
                        String paramType = CGUtils.typeBuilder(param.getType());
                        functionSignature.append("sum ").append(paramName).append(":").append(paramType).append(".");
                    }
                }
                for (String builtInVar : functionDefinitionSymbolTableItem.getBuiltInusedVars()) {
                    functionSignature.append("sum ").append(builtInVar).append(":").append(CGUtils.getBuiltInVarType(builtInVar)).append(".");
                }

                functionSignature.append("get_").append(functionName).append("(");
                if (parameters != null) {
                    for (Parameter param : parameters.getParameters()) {
                        String paramName = param.getIdentifier().getName();
                        functionSignature.append(paramName).append(",");
                    }
                }
                for (String builtInVar : functionDefinitionSymbolTableItem.getBuiltInusedVars()) {
                    functionSignature.append(builtInVar).append(",");
                }
                if (functionSignature.charAt(functionSignature.length() - 1) == ',') {
                    functionSignature.deleteCharAt(functionSignature.length() - 1);
                }
                functionSignature.append(").");

                functionSignature.append(functionName).append("(");
                if (parameters != null) {
                    for (Parameter param : parameters.getParameters()) {
                        String paramName = param.getIdentifier().getName();
                        functionSignature.append(paramName).append(",");
                    }

                }
                for (StateVariableSymbolTableItem stateVariableSymbolTableItem : functionDefinitionSymbolTableItem.getStateVariableSymbolTableItems()) {
                    String paramName = stateVariableSymbolTableItem.getVariableName();
                    functionSignature.append(paramName).append(",");
                }
                for (String builtInVar : functionDefinitionSymbolTableItem.getBuiltInusedVars()) {
                    functionSignature.append(builtInVar).append(",");
                }
                functionSignature.append("balance");
                functionSignature.append(")");

                // Generate the command for each function
                addCommand(functionSignature.toString() + ".", true);
            }
        }

        addCommand("sum value:Int.sum addr:Address.get_update" + contractDefinitionSymbolTableItem.getContractName() + "(value,addr)." + contractDefinitionSymbolTableItem.getContractName() + "(update(addr,(retValue(addr," + userBalancesMapping + ")) - value," + userBalancesMapping + "),balance) +", true);
        addCommand("sum value:Int.sum addr:Address.get_selfdestruct(value,addr)." + contractDefinitionSymbolTableItem.getContractName() + "(" + userBalancesMapping + ",balance + value);", true);
        addCommand("", false);
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

                // statevariable
                for (StateVariableSymbolTableItem stateVariableSymbolTableItem : functionDefinitionSymbolTableItem.getStateVariableSymbolTableItems()) {
                    String paramName = stateVariableSymbolTableItem.getVariableName();
                    String paramType;
                    if (stateVariableSymbolTableItem.getType() instanceof Mapping mapping) {
                        paramType = getMappingName(mapping.getMappingKey(), mapping.getMappingValue());
                    } else if (stateVariableSymbolTableItem.getType() instanceof ListType listType) {
                        paramType = getArrayName(listType, listType.getType());
                    } else {
                        paramType = CGUtils.typeBuilder(stateVariableSymbolTableItem.getType());
                    }
                    functionSignature.append(paramName).append(":").append(paramType).append(",");
                }

                // parameter
                if (parameters != null) {
                    for (Parameter param : parameters.getParameters()) {
                        String paramName = param.getIdentifier().getName();
                        String paramType = CGUtils.typeBuilder(param.getType()); // Use CGUtils to resolve the type
                        functionSignature.append(paramName).append(":").append(paramType).append(",");
                    }

                }

                // value addr
                for (String builtInVar : functionDefinitionSymbolTableItem.getBuiltInusedVars()) {
                    functionSignature.append(builtInVar).append(":").append(CGUtils.getBuiltInVarType(builtInVar)).append(",");
                }

                // local variable
                List<VariableDeclarationSymbolTableItem> localVariables = getAndUpdateLocalVariables(functionDefinitionSymbolTableItem);
                for (VariableDeclarationSymbolTableItem localVariable : localVariables) {
                    String localVariableName = this.variableRenames.get(localVariable);
                    String localVariableType;
                    if (localVariable.getType() instanceof Mapping mapping) {
                        localVariableType = getMappingName(mapping.getMappingKey(), mapping.getMappingValue());
                    } else {
                        localVariableType = CGUtils.typeBuilder(localVariable.getType());
                    }
                    functionSignature.append(localVariableName).append(":").append(localVariableType).append(",");
                }

                functionSignature.append("balance").append(":Int");
                functionSignature.append(")");

                // Generate the command for each function
                addCommand(functionSignature.toString() + " =", false);

                for (SymbolTableItem symbolTableItem1 : functionDefinitionSymbolTableItem.getSymbolTable().items.values().stream()
                        .sorted(Comparator.comparingInt(SymbolTableItem::getLine))
                        .toList()) {

                    symbolTableItem1.accept(this);
                }

                List<SymbolTableItem> statementsWithInner = new ArrayList<>();
                for (SymbolTableItem symbolTableItem1 : functionDefinitionSymbolTableItem.getSymbolTable().items.values().stream()
                        .sorted(Comparator.comparingInt(SymbolTableItem::getLine))
                        .toList()) {

                    if (this.labelsInner.get(symbolTableItem1) != null) {
                        statementsWithInner.add(symbolTableItem1);
                    }
                }

                processItemWithIndex(0, statementsWithInner);

                for (Map.Entry<SymbolTableItem, String> entry : labelsOuter.entrySet()) {
                    if (this.labelsOuter.get(entry.getKey()) != null)
                        addCommand(this.labelsOuter.get(entry.getKey()), false);
                }
                this.labelsOuter = new HashMap<>();
                addCommand("", false);

            }
        }
    }

    // meow
    public void processItemWithIndex(int i, List<SymbolTableItem> statementsWithInner) {
        // Loop starting from index i
        for (int index = i; index < statementsWithInner.size(); index++) {
            SymbolTableItem symbolTableItem1 = statementsWithInner.get(index);
            String context = "";

            // Check if the current item is an instance of IfStatementSymbolTableItem
            if (symbolTableItem1 instanceof IfStatementSymbolTableItem) {
                // Handle IfStatementSymbolTableItem logic if needed
                String ifContext = this.labelsInner.get(symbolTableItem1);
                String elseContext = this.labelsElse.get(symbolTableItem1);

                if (elseContext == null) {
                    // Remove trailing newline character, if any
                    if (ifContext.endsWith("\n")) {
                        ifContext = ifContext.substring(0, ifContext.length() - 1);
                    }

                    addCommand(ifContext, true);

//                // Append a period if this is not the last item in the list
                    if (index > statementsWithInner.size() - 1) {
                        addCommand("<> ()", true);
                        addCommand(").", true);
                    } else {
                        addCommand("<> ()", true);
                        addCommand(")", true);
                    }
                } else {
                    addCommand(ifContext, true);
                    processItemWithIndex(i + 1, statementsWithInner);

                    addCommand(") <> (", true);
                    addCommand(elseContext, true);
                    processItemWithIndex(i + 1, statementsWithInner);
                    addCommand(")", true);
                    addCommand("", false);

                    return;
                }

            } else {
                // Get the context from the labelsInner map using the current symbol table item
                context = this.labelsInner.get(symbolTableItem1);

                // Remove trailing newline character, if any
                if (context.endsWith("\n")) {
                    context = context.substring(0, context.length() - 1);
                }

                // Append a period if this is not the last item in the list
                if (index != statementsWithInner.size() - 1) {
                    context += ".";
                }

                // Add the command using the processed context
                addCommand(context, true);
            }
        }
        addCommand("", false);
    }

    private List<VariableDeclarationSymbolTableItem> getAndUpdateLocalVariables(FunctionDefinitionSymbolTableItem functionDefinitionSymbolTableItem) {
        List<VariableDeclarationSymbolTableItem> variableDeclarationSymbolTableItems = this.variableDeclarationCollector.collectVariableDeclarations(functionDefinitionSymbolTableItem);
        for (VariableDeclarationSymbolTableItem varDeclItem : variableDeclarationSymbolTableItems) {
            String newVarName = varDeclItem.getName() + varDeclItem.getLine();  // Create the new name
            this.variableRenames.put(varDeclItem, newVarName);  // Add to variableRenames map
        }
        return variableDeclarationSymbolTableItems;
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

    private String addContextCommand(String command, String context, Boolean hasTab) {
        if (hasTab) {
            context += (this.initTab + "\t" + command + "\n");
        }
        else {
            context += (command + "\n");
        }
        return context;
    }

    @Override
    public Void visit(ContractDefinitionSymbolTableItem contractDefinitionSymbolTableItem) {
        SymbolTable contractDefinitionSymbolTable = contractDefinitionSymbolTableItem.getContractSymbolTable();
        for (SymbolTableItem item : contractDefinitionSymbolTable.items.values().stream()
                .sorted(Comparator.comparingInt(SymbolTableItem::getLine))
                .toList()) {

            item.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(CustomErrorSymbolTableItem customErrorSymbolTableItem) {
        SymbolTable customErrorSymbolTable = customErrorSymbolTableItem.getSymbolTable();
        for (SymbolTableItem item : customErrorSymbolTable.items.values().stream()
                .sorted(Comparator.comparingInt(SymbolTableItem::getLine))
                .toList()) {

            item.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(EnumDefinitionSymbolTableItem enumDefinitionSymbolTableItem) {
        SymbolTable enumDefinitionSymbolTable = enumDefinitionSymbolTableItem.getSymbolTable();
        for (SymbolTableItem item : enumDefinitionSymbolTable.items.values().stream()
                .sorted(Comparator.comparingInt(SymbolTableItem::getLine))
                .toList()) {

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
        for (SymbolTableItem item : structDefinitionSymbolTable.items.values().stream()
                .sorted(Comparator.comparingInt(SymbolTableItem::getLine))
                .toList()) {

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
        for (SymbolTableItem item : modifierDefinitionSymbolTable.items.values().stream()
                .sorted(Comparator.comparingInt(SymbolTableItem::getLine))
                .toList()) {

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

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public Void visit(WhileStatementSymbolTableItem whileStatementSymbolTableItem) {
        statementsStack.push(whileStatementSymbolTableItem);

        labels.put(whileStatementSymbolTableItem, "whileScope" + labels.size());

        String innerContext = "";
        innerContext = addContextCommand("(" + labels.get(whileStatementSymbolTableItem) + "())", innerContext, false);
        this.labelsInner.put(whileStatementSymbolTableItem, innerContext);

        String outerContext = "";
        outerContext = addContextCommand(labels.get(whileStatementSymbolTableItem) + "() = % while in line " + whileStatementSymbolTableItem.getLine(), outerContext, false);
        this.labelsOuter.put(whileStatementSymbolTableItem, outerContext);

        SymbolTable whileSymbolTable = whileStatementSymbolTableItem.getSymbolTable();
        for (SymbolTableItem item : whileSymbolTable.items.values().stream()
                .sorted(Comparator.comparingInt(SymbolTableItem::getLine))
                .toList()) {

            item.accept(this);
        }

        List<SymbolTableItem> symbolTableItems = new ArrayList<>();
        while (!this.statementsStack.peek().equals(whileStatementSymbolTableItem)) {
            SymbolTableItem symbolTableItem = this.statementsStack.pop();
            symbolTableItems.add(symbolTableItem);
//            String newContentOfOuter = addContextCommand(labelsInner.get(symbolTableItem), labelsOuter.get(forStatementSymbolTableItem), true);
//            labelsOuter.put(forStatementSymbolTableItem, newContentOfOuter);
        }

        symbolTableItems.sort(Comparator.comparingInt(SymbolTableItem::getLine));
        this.currentOuter = outerContext;
        processOuterWithIndex(0, symbolTableItems, true);
        labelsOuter.put(whileStatementSymbolTableItem, this.currentOuter);

        return null;
    }


    // meow
    @Override
    public Void visit(IfStatementSymbolTableItem ifStatementSymbolTableItem) {
        statementsStack.push(ifStatementSymbolTableItem);

        labels.put(ifStatementSymbolTableItem, "if" + labels.size());

        String innerContext = "";
        innerContext = addContextCommand("() -> " + "% if in " + ifStatementSymbolTableItem.getLine(), innerContext, false);
        this.labelsInner.put(ifStatementSymbolTableItem, innerContext);
        innerContext = addContextCommand("(" , labelsInner.get(ifStatementSymbolTableItem), true);
        this.labelsInner.put(ifStatementSymbolTableItem, innerContext);


        SymbolTable ifSymbolTable = ifStatementSymbolTableItem.getIfSymbolTable();
        SymbolTable elseSymbolTable = ifStatementSymbolTableItem.getElseSymbolTable();


        for (SymbolTableItem item : ifSymbolTable.items.values().stream()
                .sorted(Comparator.comparingInt(SymbolTableItem::getLine))
                .toList()) {

            item.accept(this);
        }

        List<SymbolTableItem> symbolTableItems = new ArrayList<>();
        while (!this.statementsStack.peek().equals(ifStatementSymbolTableItem)) {
            SymbolTableItem symbolTableItem = this.statementsStack.pop();
            symbolTableItems.add(symbolTableItem);
//            String newContentOfOuter = addContextCommand(labelsInner.get(symbolTableItem), labelsOuter.get(forStatementSymbolTableItem), true);
//            labelsOuter.put(forStatementSymbolTableItem, newContentOfOuter);
        }

        symbolTableItems.sort(Comparator.comparingInt(SymbolTableItem::getLine));
        this.currentOuter = innerContext;
        processOuterWithIndex(0, symbolTableItems, true);
        labelsInner.put(ifStatementSymbolTableItem, this.currentOuter);

        if (elseSymbolTable != null) {
            for (SymbolTableItem item : elseSymbolTable.items.values().stream()
                    .sorted(Comparator.comparingInt(SymbolTableItem::getLine))
                    .toList()) {

                item.accept(this);
            }

            symbolTableItems = new ArrayList<>();
            while (!this.statementsStack.peek().equals(ifStatementSymbolTableItem)) {
                SymbolTableItem symbolTableItem = this.statementsStack.pop();
                symbolTableItems.add(symbolTableItem);
//            String newContentOfOuter = addContextCommand(labelsInner.get(symbolTableItem), labelsOuter.get(forStatementSymbolTableItem), true);
//            labelsOuter.put(forStatementSymbolTableItem, newContentOfOuter);
            }

            symbolTableItems.sort(Comparator.comparingInt(SymbolTableItem::getLine));
            this.currentOuter = "";
            processOuterWithIndex(0, symbolTableItems, false);
            labelsElse.put(ifStatementSymbolTableItem, this.currentOuter);
        }


        return null;
    }

    // meow
    public void processOuterWithIndex(int i, List<SymbolTableItem> statementsWithInner, boolean hasTab) {
        // Loop starting from index i
        for (int index = i; index < statementsWithInner.size(); index++) {
            SymbolTableItem symbolTableItem1 = statementsWithInner.get(index);
            String context = "";

            // Check if the current item is an instance of IfStatementSymbolTableItem
            if (symbolTableItem1 instanceof IfStatementSymbolTableItem) {
                // Handle IfStatementSymbolTableItem logic if needed
                String ifContext = this.labelsInner.get(symbolTableItem1);
                String elseContext = this.labelsOuter.get(symbolTableItem1);

                // Remove trailing newline character, if any
                if (ifContext.endsWith("\n")) {
                    ifContext = ifContext.substring(0, ifContext.length() - 1);
                }

                this.currentOuter = addContextCommand(ifContext, this.currentOuter, hasTab);

//                // Append a period if this is not the last item in the list
                if (index != statementsWithInner.size() - 1) {
                    this.currentOuter = addContextCommand("<> ()", this.currentOuter, hasTab);
                    this.currentOuter = addContextCommand(").", this.currentOuter, hasTab);
                }
                else {
                    this.currentOuter = addContextCommand("<> ()", this.currentOuter, hasTab);
                    this.currentOuter = addContextCommand(")", this.currentOuter, hasTab);
                }

            } else {
                // Get the context from the labelsInner map using the current symbol table item
                context = this.labelsInner.get(symbolTableItem1);

                // Remove trailing newline character, if any
                if (context.endsWith("\n")) {
                    context = context.substring(0, context.length() - 1);
                }

                // Append a period if this is not the last item in the list
                if (index != statementsWithInner.size() - 1) {
                    context += ".";
                }

                // Add the command using the processed context
                this.currentOuter = addContextCommand(context, this.currentOuter, hasTab);
            }
        }

    }


    @Override
    public Void visit(ForStatementSymbolTableItem forStatementSymbolTableItem) {
        statementsStack.push(forStatementSymbolTableItem);

        labels.put(forStatementSymbolTableItem, "forScope" + labels.size());
        String innerContext = "";
        innerContext = addContextCommand("(" + labels.get(forStatementSymbolTableItem) + "())", innerContext, false);
        this.labelsInner.put(forStatementSymbolTableItem, innerContext);

        String outerContext = "";
        outerContext = addContextCommand(labels.get(forStatementSymbolTableItem) + "() = % for in line " + forStatementSymbolTableItem.getLine(), outerContext, false);
        this.labelsOuter.put(forStatementSymbolTableItem, outerContext);

        SymbolTable forSymbolTable = forStatementSymbolTableItem.getSymbolTable();
        for (SymbolTableItem item : forSymbolTable.items.values().stream()
                .sorted(Comparator.comparingInt(SymbolTableItem::getLine))
                .toList()) {

            item.accept(this);
        }

        List<SymbolTableItem> symbolTableItems = new ArrayList<>();
        while (!this.statementsStack.peek().equals(forStatementSymbolTableItem)) {
            SymbolTableItem symbolTableItem = this.statementsStack.pop();
            symbolTableItems.add(symbolTableItem);
//            String newContentOfOuter = addContextCommand(labelsInner.get(symbolTableItem), labelsOuter.get(forStatementSymbolTableItem), true);
//            labelsOuter.put(forStatementSymbolTableItem, newContentOfOuter);
        }

        symbolTableItems.sort(Comparator.comparingInt(SymbolTableItem::getLine));
        this.currentOuter = outerContext;
        processOuterWithIndex(0, symbolTableItems, true);
        labelsOuter.put(forStatementSymbolTableItem, this.currentOuter);

        return null;
    }

    @Override
    public Void visit(DoWhileStatementSymbolTableItem doWhileStatementSymbolTableItem) {
        statementsStack.push(doWhileStatementSymbolTableItem);

        labels.put(doWhileStatementSymbolTableItem, "doWhileScope" + labels.size());

        String innerContext = "";
        innerContext = addContextCommand("(" + labels.get(doWhileStatementSymbolTableItem) + "())", innerContext, false);
        this.labelsInner.put(doWhileStatementSymbolTableItem, innerContext);

        String outerContext = "";
        outerContext = addContextCommand(labels.get(doWhileStatementSymbolTableItem) + "() = % doWhile in line " + doWhileStatementSymbolTableItem.getLine(), outerContext, false);
        this.labelsOuter.put(doWhileStatementSymbolTableItem, outerContext);

        SymbolTable doWhileSymbolTable = doWhileStatementSymbolTableItem.getSymbolTable();
        for (SymbolTableItem item : doWhileSymbolTable.items.values().stream()
                .sorted(Comparator.comparingInt(SymbolTableItem::getLine))
                .toList()) {

            item.accept(this);
        }

        List<SymbolTableItem> symbolTableItems = new ArrayList<>();
        while (!this.statementsStack.peek().equals(doWhileStatementSymbolTableItem)) {
            SymbolTableItem symbolTableItem = this.statementsStack.pop();
            symbolTableItems.add(symbolTableItem);
//            String newContentOfOuter = addContextCommand(labelsInner.get(symbolTableItem), labelsOuter.get(forStatementSymbolTableItem), true);
//            labelsOuter.put(forStatementSymbolTableItem, newContentOfOuter);
        }

        symbolTableItems.sort(Comparator.comparingInt(SymbolTableItem::getLine));
        this.currentOuter = outerContext;
        processOuterWithIndex(0, symbolTableItems, true);
        labelsOuter.put(doWhileStatementSymbolTableItem, this.currentOuter);

        return null;
    }


    @Override
    public Void visit(RevertStatement revertStatement) {

        // Visit the functionCall (FunctionCall) inside the RevertStatement
        if (revertStatement.getFunctionCall() != null) {
            revertStatement.getFunctionCall().accept(this);
        }

        return null;
    }


    @Override
    public Void visit(VariableDeclarationStatement variableDeclarationStatement) {

        // Visit the variableList (VariableList) in the VariableDeclarationStatement
        if (variableDeclarationStatement.getVariableList() != null) {
            variableDeclarationStatement.getVariableList().accept(this);
        }

        // Visit the initiateValue (Expression) in the VariableDeclarationStatement
        if (variableDeclarationStatement.getInitiateValue() != null) {
            variableDeclarationStatement.getInitiateValue().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ExpressionStatement expressionStatement) {

        // Visit the expression (Expression) inside the ExpressionStatement
        if (expressionStatement.getExpression() != null) {
            expressionStatement.getExpression().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(BreakStatement breakStatement) {

        return null;
    }

    @Override
    public Void visit(ContinueStatement continueStatement) {

        return null;
    }

    @Override
    public Void visit(ThrowStatement throwStatement) {

        return null;
    }

    @Override
    public Void visit(ReturnStatement returnStatement) {

        // Visit the value (Expression) inside the ReturnStatement
        if (returnStatement.getValue() != null) {
            returnStatement.getValue().accept(this);
        }

        return null;
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
