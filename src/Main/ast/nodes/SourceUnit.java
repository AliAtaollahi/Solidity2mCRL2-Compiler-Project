package main.ast.nodes;

import main.ast.nodes.declaration.*;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class SourceUnit extends Node{
    private ArrayList<ImportDirective> importDirectives = new ArrayList<>();
    private ArrayList<ContractDefinition> contractDefinitions = new ArrayList<>();
    private ArrayList<EnumDefinition> enumDefinitions = new ArrayList<>();
    private ArrayList<StructDefinition> structDefinitions = new ArrayList<>();
    private ArrayList<FunctionDefinition> functionDefinitions = new ArrayList<>();

    private ArrayList<FileLevelConstant> fileLevelConstants = new ArrayList<>();
    private ArrayList<CustomErrorDefinition> customErrorDefinitions = new ArrayList<>();
    private ArrayList<UsingForDeclaration> usingForDeclarations = new ArrayList<>();

    public void addImportDirective(ImportDirective importDirective) {
        this.importDirectives.add(importDirective);
    }

    public void addContractDefinition(ContractDefinition contractDefinition) {
        this.contractDefinitions.add(contractDefinition);
    }

    public void addEnumDefinition(EnumDefinition enumDefinition) {
        this.enumDefinitions.add(enumDefinition);
    }

    public void addStructDefinition(StructDefinition structDefinition) {
        this.structDefinitions.add(structDefinition);
    }

    public void addFunctionDefinition(FunctionDefinition functionDefinition) {
        this.functionDefinitions.add(functionDefinition);
    }

    public void addFileLevelConstant(FileLevelConstant fileLevelConstant) {
        this.fileLevelConstants.add(fileLevelConstant);
    }

    public void addCustomErrorDefinition(CustomErrorDefinition customErrorDefinition) {
        this.customErrorDefinitions.add(customErrorDefinition);
    }

    public void addUsingForDeclaration(UsingForDeclaration usingForDeclaration) {
        this.usingForDeclarations.add(usingForDeclaration);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
