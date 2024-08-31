package main.ast.nodes.expression.operators;

public enum UserDefinableOperator {
    // Define the enum values with their string representations
    BITWISE_OR("|"),
    BITWISE_AND("&"),
    BITWISE_XOR("^"),
    BITWISE_NOT("~"),
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    MODULUS("%"),
    EQUALITY("=="),
    INEQUALITY("!="),
    LESS_THAN("<"),
    GREATER_THAN(">"),
    LESS_THAN_OR_EQUAL_TO("<="),
    GREATER_THAN_OR_EQUAL_TO(">=");

    // Field to store the string representation
    private final String symbol;

    // Constructor to initialize the symbol
    UserDefinableOperator(String symbol) {
        this.symbol = symbol;
    }

    // Method to get the symbol
    public String getSymbol() {
        return this.symbol;
    }

    // Static method to get the enum by string symbol
    public static UserDefinableOperator fromString(String symbol) {
        for (UserDefinableOperator operator : UserDefinableOperator.values()) {
            if (operator.getSymbol().equals(symbol)) {
                return operator;
            }
        }
        throw new IllegalArgumentException("Unknown operator: " + symbol);
    }
}
