package main.visitor;

import main.ast.nodes.SourceUnit;
import main.ast.nodes.expression.AccessExpression;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.expression.primary.OtherFunctionDescriptors;
import main.ast.nodes.expression.primary.Type;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.*;
import main.utils.DependencyNode;
import main.utils.DependencyTree;
import org.antlr.v4.runtime.misc.Pair;

import java.io.File;
import java.util.*;

public class CodeGeneration extends Visitor<Void> {
    private String outputPath;
    @Override
    public Void visit(SourceUnit sourceUnit) {
        prepareOutputFolder(); // TODO check output file and folder created

        // TODO add header

        SymbolTable symbolTable = SymbolTable.root;
        for (SymbolTableItem item : symbolTable.items.values()) {
            item.accept(this);
        }
        return null;
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
        catch(SecurityException e) {//unreachable

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
}
