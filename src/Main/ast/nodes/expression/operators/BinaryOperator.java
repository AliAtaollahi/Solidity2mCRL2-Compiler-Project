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

    // Method to check if the operator is arithmetic
    public boolean isArithmeticOperator() {
        return this == ADDITION || this == SUBTRACTION || this == MULTIPLICATION || this == DIVISION || this == MODULUS || this == EXPONENTIATION;
    }

    // Method to check if the operator is logical
    public boolean isLogicalOperator() {
        return this == LOGICAL_AND || this == LOGICAL_OR;
    }

    // Method to check if the operator is a comparison operator
    public boolean isComparisonOperator() {
        return this == LESS_THAN || this == GREATER_THAN || this == LESS_THAN_OR_EQUAL_TO || this == GREATER_THAN_OR_EQUAL_TO || this == EQUALITY || this == INEQUALITY;
    }

    // Method to check if the operator is a bitwise operator
    public boolean isBitwiseOperator() {
        return this == BITWISE_AND || this == BITWISE_OR || this == BITWISE_XOR || this == LEFT_SHIFT || this == RIGHT_SHIFT;
    }
}
