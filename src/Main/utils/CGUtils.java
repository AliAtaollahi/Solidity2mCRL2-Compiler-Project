package main.utils;

import main.ast.nodes.declaration.StructDefinition;
import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.expression.primary.Type;
import main.ast.nodes.expression.type.UserDefinedTypeName;
import main.ast.nodes.expression.type.primitive.*;

import java.util.Random;

public class CGUtils {
    public static String getBuiltInVarType(String var) {
        if (var.equals("addr"))
            return "Address";
        else if (var.equals("value"))
            return "Int";
        else
            return "";
    }
    private static Random random = new Random();
    public static String generateRandomString() {
        StringBuilder sb = new StringBuilder(3);
        for (int i = 0; i < 3; i++) {
            char randomChar = (char) ('a' + random.nextInt(26)); // Generates a letter between 'a' and 'z'
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public static String buildConstructor(StructDefinition structDefinition) {
        StringBuilder constructorSignature = new StringBuilder();
        for (VariableDeclaration varDecl : structDefinition.getVariableDeclarations()) {
            String varType = typeBuilder(varDecl.getVariableType());
            if (!constructorSignature.isEmpty()) {
                constructorSignature.append("#");
            }
            constructorSignature.append(varType);
        }
        return constructorSignature.toString();
    }

    public static String getDefaultValue(String type) {
        switch (type) {
            case "Address":
                return "null";
            case "Int":
                return "-2";
            case "Bool":
                return "false";
            default:
                return "null";
        }
    }

    public static String capitalizeFirstLetter(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    public static String typeBuilder(Type type) {
        if (type instanceof UintType)
            return "Int";
        else if (type instanceof AddressType)
            return "Address";
        else if (type instanceof BoolType)
            return "Bool";
        else if (type instanceof IntType)
            return "Int";
        else if (type instanceof UserDefinedTypeName userDefinedTypeName)
            return userDefinedTypeName.getTypeChain().get(0).getName();
        else if (type instanceof ByteUpperCaseType || type instanceof ByteLowerCaseType)
            return "Nat";
        return "";
    }

    public static boolean isBuiltIn (String functionName) {
        if (functionName.equals("payable")
                || functionName.equals("delegatecall")
                || functionName.equals("send")
                || functionName.equals("require")
                || functionName.equals("transfer")
                || functionName.equals("revert"))
            return true;
        return false;
    }
}
