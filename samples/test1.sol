// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract ExampleContract {
    // Define state variables
    uint[] public myArray;

    // Event declaration
    event Transfer(address indexed from, address indexed to, uint amount);

    // Constructor to initialize the contract
    constructor() {
    }

    // Function to demonstrate various Solidity features
    function exampleFunction(int x) public returns (uint returnValue) {
        int temp = 0;
        tx.origin;
        if (x > 10) {
            temp = 0;
            returnValue = getValue();
            uint meow = getValue();
        } else if (true) {
            temp = 5;
            while(true) {
                uint meow = getValue();
            }
        }
        else {
            uint meow = getValue();
        }

    }

    // Dummy function to simulate a value return
    function getValue() public pure returns (uint) {
        return 42;
    }

    // Another dummy function to simulate function call
    function anotherFunction(uint a, uint b, uint c) public pure returns (uint) {
        return a + b + c;
    }
}
