package main.ast.nodes.declaration.utility;

public enum ContractType {
    // Define the enum values with their string representations
    CONTRACT("contract"),
    INTERFACE("interface"),
    LIBRARY("library");

    // Field to store the string representation
    private final String type;

    // Constructor to initialize the type
    ContractType(String type) {
        this.type = type;
    }

    // Method to get the type
    public String getType() {
        return this.type;
    }

    // Static method to get the enum by string type
    public static ContractType fromString(String type) {
        for (ContractType contractType : ContractType.values()) {
            if (contractType.getType().equals(type)) {
                return contractType;
            }
        }
        throw new IllegalArgumentException("Unknown contract type: " + type);
    }
}
