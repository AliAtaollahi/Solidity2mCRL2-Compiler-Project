package main;



import main.ast.nodes.SourceUnit;
import main.symbolTable.SymbolTable;
import main.visitor.ExclusionAnalyzer;

import main.visitor.NameAnalyzer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parsers.SolidityLexer;
import parsers.SolidityParser;

import java.io.IOException;

public class Solidity {
    public static void main(String[] args) throws IOException{
        CharStream reader = CharStreams.fromFileName(args[0]);
        SolidityLexer flLexer = new SolidityLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(flLexer);
        SolidityParser flParser = new SolidityParser(tokens);
        SourceUnit sourceUnit = flParser.sourceUnit().sourceUnitRet;
        NameAnalyzer nameAnalyzer = new NameAnalyzer();
        nameAnalyzer.visit(sourceUnit);
        SymbolTable.root.hashCode();

        System.out.println();
        ExclusionAnalyzer exclusionAnalyzer = new ExclusionAnalyzer();
        exclusionAnalyzer.visit(sourceUnit);
    }
}
