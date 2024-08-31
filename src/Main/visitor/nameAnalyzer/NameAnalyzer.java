package Main.visitor.nameAnalyzer;

import java.util.ArrayList;

import Main.AST.Node.Program;
import Main.AST.Node.declaration.ContractDeclaration;
import Main.AST.Node.declaration.FunctionDeclaration;
import Main.AST.Node.declaration.GlobVariableDeclaration;
import Main.AST.Node.declaration.ContractDeclaration;
import Main.AST.Node.declaration.VarDeclaration;
//import Main.AST.Node.Statement.Statement;
//import Main.compileError.CompileError;
//import Main.compileError.name.FunctionVariableConflict;
//import Main.compileError.name.GlobalVariableRedefinition;
//import Main.compileError.name.IrregularDefenition;
//import Main.compileError.name.MethodRedefinition;
//import Main.compileError.name.PrimitiveFunctionRedefinition;
//import Main.compileError.name.VariableRedefinition;
//import Main.symbolTable.SymbolTable;
//import Main.symbolTable.itemException.ItemAlreadyExistsException;
//import Main.symbolTable.itemException.ItemNameExist;
//import Main.symbolTable.symbolTableItems.FunctionItem;
//import Main.symbolTable.symbolTableItems.GlobalVariableItem;
//import Main.symbolTable.symbolTableItems.MainItem;
//import Main.symbolTable.symbolTableItems.OnInitItem;
//import Main.symbolTable.symbolTableItems.OnStartItem;
//import Main.symbolTable.symbolTableItems.VariableItem;
import Main.visitor.Visitor;

public class NameAnalyzer extends Visitor<Void> {

    @Override
    public Void visit(Program program) {
        return null;
    }

    @Override
    public Void visit(ContractDeclaration contractDeclaration) {
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDeclaration) {
        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        return null;
    }

    @Override
    public Void visit(GlobVariableDeclaration globVariableDeclaration) {
        return null;
    }

    private void visitAllProgramMainDeclaration(Program program) {
    }

    private void visitAllFunctionDeclaration(Program program) {
    }

    private void visitAllGlobVariableDeclaration(Program program) {
    }

    private void visitTradeStatementcheckVariableRedefinitionOnVisitOninitDeclaration(VarDeclaration tradeStm) {
    }
}

