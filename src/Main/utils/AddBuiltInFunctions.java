package main.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AddBuiltInFunctions {

    // Built-in functions in one line
    private static final String BUILT_IN_FUNCTIONS =
            " function transfer_builtIn(address payable recipient, uint256 amount) public { }" +
                    " function payable_builtIn(address targetAddress) public pure returns (address payable) { }" +
                    " function require_builtIn(bool condition) public pure { }" +
                    " function delegatecall_builtIn(address target, bytes memory functionAddress) public returns (bool, bytes memory) { }" +
                    " function send_builtIn(address payable recipient, uint256 amount) public returns (bool) { }";

    // Method to add the built-in functions after the line containing 'contract'
    public static String addBuiltInFunctionsToFile(String filePath) throws IOException {
        StringBuilder modifiedFileContent = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read each line and check for the word 'contract'
            while ((line = reader.readLine()) != null) {
                modifiedFileContent.append(line);

                // Insert the built-in functions on the same line after 'contract'
                if (line.contains("contract")) {
                    modifiedFileContent.append(BUILT_IN_FUNCTIONS);
                }

                modifiedFileContent.append("\n");
            }
        }

        return modifiedFileContent.toString();
    }

    // Method to write content to a file
    private static void writeFile(String filePath, String content) throws IOException {
        Files.write(Paths.get(filePath), content.getBytes());
    }

    // Method to read the original content of a file
    public static String readOriginalFileContent(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    // Method to restore the original file content
    public static void writeOriginalFile(String filePath, String content) throws IOException {
        Files.write(Paths.get(filePath), content.getBytes());
    }
}
