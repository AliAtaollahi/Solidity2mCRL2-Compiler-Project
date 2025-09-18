pragma solidity ^0.8.0;

contract ExampleContract {
    // Define state variables
    uint[] public myArray;
    address[] public myArray1;

    // Event declaration
    event Transfer(address indexed from, address indexed to, uint amount);

    // Constructor to initialize the contract
    constructor() {
    }

    // Function to demonstrate various Solidity features
    function exampleFunction(int x, address _contract) public returns (uint returnValue) {
        tx.origin;
        int temp = 0;
        int sum = 0;
        myArray1 = "";
        // 1. If Statement
        if (x > 10) {
            while (x < 100) {
            }
        } else {
            do {
                x += 1;
            } while (x < 10);
        }

        while (x < 100) {
        }

        if (x > 10) {
            while (x < 100) {
            }
        } else {
            do {
                x += 1;
            } while (x < 10);
        }
    }
}
