// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

// Define an additional struct for user-defined types
    struct OtherStruct {
        uint someValue;
    }

// Define base structs in a nested manner
    struct AddressDetails {
        string city;
        string country;
    }

    struct AddressBook {
        string name;
        AddressDetails addressDetails; // Nested struct
    }

    struct Person {
        string firstName;
        string lastName;
        uint age;
    }

    struct CompleteStruct {
        // Elementary types
        uint myUint;
        int myInt;
        bool myBool;
        string myString;

        // User-defined type
        OtherStruct nestedStruct;


        // Array types
        uint[] dynamicArray;
        int[5] fixedArray;

        // Function type
        function(uint, uint) external returns (uint) myFunction;

        // Address payable type
        address payable recipient;

        // userDefinedTypeName
        Person[] relatives;     // Array of userDefinedTypeName
        AddressBook.AddressDetails addr; // userDefinedTypeName with dot notation
    }

    struct ExampleStruct {
        address userAddress;     // Address type
        bool isActive;           // Boolean type
        string name;             // String type
        // var type is deprecated and not used in modern Solidity
        int256 balance;          // Signed integer with maximum bit size (int256)
        uint256 id;              // Unsigned integer with maximum bit size (uint256)
        byte singleByte;         // Single byte (deprecated, equivalent to bytes1)
        bytes32 hash;            // Fixed-size byte array of 32 bytes
        fixed8x1 fixedValue;     // Signed fixed-point decimal number with 8 bits and 1 decimal place
        ufixed16x2 ufixedValue;  // Unsigned fixed-point decimal number with 16 bits and 2 decimal places
    }

    struct ExampleMapping {
        // Mapping type
        mapping(address => uint) balances;
        mapping(address keyName => uint valueName) meow;
    }

    struct ExampleStruct {
        // 1. Simple Function Type Without Parameters
        function() external simpleFunction;

        // 2. Function Type with Parameters
        function(uint256, address) parameterFunction;

        // 3. Function Type with Parameters (Without Pure/State Mutability)
        function(uint256) pureFunction;

        // 4. Function Type with Parameters and Return Values
        function(uint256, uint256) returns (uint256) returnFunction;

        // 5. Function Type with Multiple Return Values
        function(uint256) returns (uint256, bool) multiReturnFunction;

        // 6. Function Type with Mixed Visibility and Mutability - Corrected without visibility or mutability
        function() viewFunction;
        function(uint256) payableFunction;
    }

    struct ExampleAddressPayable {
        address payable meow;
        address payable memory meow2;
    }