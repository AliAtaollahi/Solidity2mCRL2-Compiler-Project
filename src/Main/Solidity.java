package main;



import main.ast.nodes.SourceUnit;
import main.symbolTable.SymbolTable;
import main.visitor.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parsers.SolidityLexer;
import parsers.SolidityParser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
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


//        // Serialize and save to file
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        String json = gson.toJson(sourceUnit);

//        DependencyDetector dependencyDetector = new DependencyDetector();
//        dependencyDetector.visit(sourceUnit);
//        ExclusionAnalyzer exclusionAnalyzer = new ExclusionAnalyzer();
//        exclusionAnalyzer.visit(sourceUnit);
        NewExclusionAnalyzer newExclusionAnalyzer = new NewExclusionAnalyzer();
        newExclusionAnalyzer.visit(sourceUnit);
        SymbolTable.root.hashCode();

    }
}
