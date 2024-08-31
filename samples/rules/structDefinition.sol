// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

// Simple Struct Definition
    struct SimpleStruct {
        uint memory age;
        string calldata name;
    }

// Struct with No Variables (not typically useful, but syntactically correct)
    struct EmptyStruct {
    }

// Struct with Multiple Variables of Different Types
    struct ComplexStruct {
        address wallet;
        uint balance;
        bool isActive;
        bytes32 dataHash;
    }

// Struct with Nested Struct
    struct OuterStruct {
        SimpleStruct innerStruct;
        uint outerValue;
    }

// Struct with Array and Mapping
    struct AdvancedStruct {
        uint[] values;
        mapping(address => uint) balances;
    }

// Struct with Storage Location Specifiers
    struct StorageStruct {
        uint storageValue;
        // Removed 'memoryValue' since memory is not valid in struct fields
        uint256 value;
    }

// Struct without Visibility Modifiers (since they're not allowed)
    struct VisibilityStruct {
        uint publicValue;
        uint privateValue;
    }
