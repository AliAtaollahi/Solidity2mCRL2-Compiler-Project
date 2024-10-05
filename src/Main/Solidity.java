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

import java.io.*;
import java.nio.file.*;

import static main.utils.AddBuiltInFunctions.*;
import static org.antlr.v4.runtime.misc.Utils.writeFile;

public class Solidity {
    public static void main(String[] args) throws IOException {
        String filePath = args[0];
        String originalFileContent = readOriginalFileContent(filePath);
        String modifiedContent = addBuiltInFunctionsToFile(filePath);
        writeFile(filePath, modifiedContent);
        CharStream readerInput = CharStreams.fromFileName(filePath);
        SolidityLexer flLexer = new SolidityLexer(readerInput);
        CommonTokenStream tokens = new CommonTokenStream(flLexer);
        SolidityParser flParser = new SolidityParser(tokens);
        writeOriginalFile(filePath, originalFileContent);

        SourceUnit sourceUnit = flParser.sourceUnit().sourceUnitRet;

        // Name analysis
        NameAnalyzer nameAnalyzer = new NameAnalyzer();
        nameAnalyzer.visit(sourceUnit);

        // Symbol table processing
        SymbolTable.root.hashCode();



        // New exclusion analyzer
        NewExclusionAnalyzer newExclusionAnalyzer = new NewExclusionAnalyzer();
        newExclusionAnalyzer.visit(sourceUnit);

        // Dependency detection
        DependencyDetector dependencyDetector = new DependencyDetector();
        dependencyDetector.visit(sourceUnit);

        // Final symbol table hash code to ensure no errors
        SymbolTable.root.hashCode();
    }
}

