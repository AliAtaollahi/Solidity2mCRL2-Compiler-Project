package main.visitor;

import main.ast.nodes.SourceUnit;
import main.ast.nodes.expression.primary.Type;
import main.ast.nodes.expression.type.Mapping;
import main.ast.nodes.expression.type.primitive.AddressType;
import main.ast.nodes.expression.type.primitive.UintType;
import main.symbolTable.SymbolTable;
import main.symbolTable.items.*;
import main.utils.DependencyNode;

import javax.lang.model.type.UnionType;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CodeGeneration extends Visitor<Void> {
    private String outputPath;
    private FileWriter currentFile;
    private String outputFileName;
    private Set<DependencyNode> initNodes;
    private List<ContractDefinitionSymbolTableItem> contractDefinitions = new ArrayList<>();

    public CodeGeneration(Set<DependencyNode> initNodes, String outputFileName) {
        this.outputFileName = outputFileName;
        this.initNodes = initNodes;
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
        
        addMaping();

        addInit();
        
        addProc();
        
        SymbolTable symbolTable = SymbolTable.root;
        for (SymbolTableItem item : symbolTable.items.values()) {
            item.accept(this);
        }

        return null;
    }

    private void addMaping() {
        for (DependencyNode dependencyNode : this.initNodes) {
            if (dependencyNode.getItemKey() instanceof StateVariableSymbolTableItem) {
                Type type = ((StateVariableSymbolTableItem) dependencyNode.getItemKey()).getType();
                if (type instanceof Mapping mapping) {
                    Type keyType = mapping.getMappingKey();
                    Type valueType = mapping.getMappingValue();

                    addCommand("sort mapping;", false);
                    addCommand("cons empty : mapping;", false);
                    addCommand("add : " + typeBuilder(keyType) + "#" + typeBuilder(valueType) + "#mapping -> mapping;", true);

                    addCommand("map", false);
                    addCommand("retValue : " + typeBuilder(keyType) + "#mapping -> " + typeBuilder(valueType) + ";", true);
                    addCommand("search : " + typeBuilder(keyType) + "#mapping -> Bool;", true);
                    addCommand("update: " + typeBuilder(keyType) + "#" + typeBuilder(valueType) + "#mapping -> mapping;", true);

                    addCommand("var", false);
                    addCommand("array : mapping;", true);
                    addCommand("b,d : " + typeBuilder(valueType) + ";", true);
                    addCommand("a,c : " + typeBuilder(keyType) + ";", true);

                    addCommand("eqn", false);
                    addCommand("retValue(a,empty) = -1;", true);
                    addCommand("retValue(a,add(c,b,array)) = if(a == c,b,retValue(a,array));", true);
                    addCommand("search(a,empty) = false;", true);
                    addCommand("search(a,add(c,b,array)) = if(a == c,true,search(a,array));", true);
                    addCommand("update(a,b,empty) = empty;", true);
                    addCommand("update(a,b,add(c,d,array)) = if(a == c,add(a,b,array),add(c,d,update(a,b,array)));", true);

                    addCommand("%-------------------------------------------------", false);
                }
            }
        }
    }

    private String typeBuilder(Type type) {
        if (type instanceof UintType)
            return "Int";
        else if (type instanceof AddressType)
            return "Address";
        return "";
    }

    private void addInit() {
    }

    private void addProc() {
        
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

    private String header = """
sort Address;
cons Normal,Attacker,Owner,null,Contract : Address;
map
        equal : Address#Address -> Bool;
var ad1,ad2: Address;
eqn
        equal(Normal,Normal) = true;
        equal(Normal,Attacker) = false;
        equal(Normal,Owner) = false;
        equal(Normal,null) = false;
        equal(Normal,Contract) = false;
        equal(Attacker,Attacker) = true;
        equal(Attacker,Normal) = false;
        equal(Attacker,Owner) = false;
        equal(Attacker,null) = false;
        equal(Attacker,Contract) = false;
        equal(Owner,Owner) = true;
        equal(Owner,Normal) = false;
        equal(Owner,Attacker) = false;
        equal(Owner,null) = false;
        equal(Owner,Contract) = false;
        equal(null,null) = true;
        equal(null,Normal) = false;
        equal(null,Attacker) = false;
        equal(null,Owner) = false;
        equal(null,Contract) = false;
        equal(Contract,Contract) = true;
        equal(Contract,Normal) = false;
        equal(Contract,Attacker) = false;
        equal(Contract,Owner) = false;
        equal(Contract,null) = false;
        ad1 == ad2 = equal(ad1,ad2);
%-------------------------------------------------""";

}
