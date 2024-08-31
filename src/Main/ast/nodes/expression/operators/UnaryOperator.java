package main.ast.nodes.expression.operators;

public enum UnaryOperator {
    // Define the enum values
    POST_INCREMENT("++"),
    POST_DECREMENT("--"),
    PRE_INCREMENT("++"),
    PRE_DECREMENT("--"),
    PLUS("+"),
    MINUS("-"),
    DELETE("delete"),
    NOT("!"),
    TILDE("~");

    private final String symbol;

    UnaryOperator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public static UnaryOperator fromString(String symbol) {
        for (UnaryOperator operator : UnaryOperator.values()) {
            if (operator.getSymbol().equals(symbol)) {
                return operator;
            }
        }
        throw new IllegalArgumentException("Unknown operator: " + symbol);
    }
}
