package main.ast.nodes.expression.operators;

public enum UnaryOperator {
    // Define the enum values
    POST_INCREMENT("++", true, false),
    POST_DECREMENT("--", true, false),
    PRE_INCREMENT("++", false, true),
    PRE_DECREMENT("--", false, true),
    PLUS("+", false, true),
    MINUS("-", false, true),
    DELETE("delete", false, true),
    NOT("!", false, true),
    TILDE("~", false, true);

    private final String symbol;
    private final boolean isPostfix;  // Indicates if the operator is a postfix operator
    private final boolean isPrefix;   // Indicates if the operator is a prefix operator

    // Constructor to initialize the operator symbol and whether it's prefix or postfix
    UnaryOperator(String symbol, boolean isPostfix, boolean isPrefix) {
        this.symbol = symbol;
        this.isPostfix = isPostfix;
        this.isPrefix = isPrefix;
    }

    // Method to get the symbol
    public String getSymbol() {
        return this.symbol;
    }

    // Method to check if the operator is postfix
    public boolean isPostfix() {
        return this.isPostfix;
    }

    // Method to check if the operator is prefix
    public boolean isPrefix() {
        return this.isPrefix;
    }

    // Static method to get the enum value by its symbol
    public static UnaryOperator fromString(String symbol) {
        for (UnaryOperator operator : UnaryOperator.values()) {
            if (operator.getSymbol().equals(symbol)) {
                return operator;
            }
        }
        throw new IllegalArgumentException("Unknown operator: " + symbol);
    }

    // Utility methods to classify operators

    // Check if the operator is an arithmetic operator (+, -, ++, --)
    public boolean isArithmeticOperator() {
        return this == PLUS || this == MINUS || this == PRE_INCREMENT || this == POST_INCREMENT || this == PRE_DECREMENT || this == POST_DECREMENT;
    }

    // Check if the operator is a logical operator (!)
    public boolean isLogicalOperator() {
        return this == NOT;
    }

    // Check if the operator is a bitwise operator (~)
    public boolean isBitwiseOperator() {
        return this == TILDE;
    }
}
