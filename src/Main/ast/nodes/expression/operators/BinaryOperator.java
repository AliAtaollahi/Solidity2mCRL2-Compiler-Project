package main.ast.nodes.expression.operators;

public enum BinaryOperator {
    // Define the enum values with their string representations
    INDEXING("[]"),
    SLICING("[:]"),
    SLICING_RANGE("[::]"),
    EXPONENTIATION("**"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    MODULUS("%"),
    ADDITION("+"),
    SUBTRACTION("-"),
    LEFT_SHIFT("<<"),
    RIGHT_SHIFT(">>"),
    BITWISE_AND("&"),
    BITWISE_XOR("^"),
    BITWISE_OR("|"),
    LESS_THAN("<"),
    GREATER_THAN(">"),
    LESS_THAN_OR_EQUAL_TO("<="),
    GREATER_THAN_OR_EQUAL_TO(">="),
    EQUALITY("=="),
    INEQUALITY("!="),
    LOGICAL_AND("&&"),
    LOGICAL_OR("||"),
    TERNARY_OPERATOR("?:"),
    ASSIGNMENT("="),
    ADDITION_ASSIGNMENT("+="),
    SUBTRACTION_ASSIGNMENT("-="),
    MULTIPLICATION_ASSIGNMENT("*="),
    DIVISION_ASSIGNMENT("/="),
    MODULUS_ASSIGNMENT("%="),
    BITWISE_OR_ASSIGNMENT("|="),
    BITWISE_XOR_ASSIGNMENT("^="),
    BITWISE_AND_ASSIGNMENT("&="),
    LEFT_SHIFT_ASSIGNMENT("<<="),
    RIGHT_SHIFT_ASSIGNMENT(">>=");

    // Field to store the string representation
    private final String symbol;

    // Constructor to initialize the symbol
    BinaryOperator(String symbol) {
        this.symbol = symbol;
    }

    // Method to get the symbol
    public String getSymbol() {
        return this.symbol;
    }

    // Static method to get the enum by string symbol
    public static BinaryOperator fromString(String symbol) {
        for (BinaryOperator operator : BinaryOperator.values()) {
            if (operator.getSymbol().equals(symbol)) {
                return operator;
            }
        }
        throw new IllegalArgumentException("Unknown operator: " + symbol);
    }
}
