// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract NestedVariableScope {

    // State variable (global scope)
    uint256 public mmmmmmmmmmmeee = 100;
    uint256 public constant globalVariable = 100;

    function nestedScopeExample(uint256 input) public returns (uint256) {
        tx.origin;
        // Local variable in function scope
        uint256 functionVariable = 1;

        // `if` block scope
        if (input > 0) {
            meow1();
            uint256 ifVariable = 3;  // Local to the if block
            functionVariable += ifVariable;  // Accessing outer variable
        }

        // `while` loop scope
        uint256 i = 0;  // Declared in the function scope
        while (i < input) {
            meow2();
            if (input > 0) {
                meow3();
                uint256 ifVariable = 3;  // Local to the if block
                functionVariable += ifVariable;  // Accessing outer variable
                mmmmmmmmmmmeee = 10;
            }
            uint256 whileVariable = 4;  // Local to the while loop scope
            functionVariable += whileVariable;  // Accessing outer variable
            i++;
        }

        // `for` loop scope
        for (uint256 j = 0; j < input; j++) {
            uint256 forVariable = 5;  // Local to the for loop
            functionVariable += forVariable;  // Accessing outer variable
        }

        // `do-while` loop scope
        uint256 k = 0;
        do {
            uint256 doWhileVariable = 6;  // Local to do-while loop
            functionVariable += doWhileVariable;  // Accessing outer variable
            k++;
        } while (k < input);

        return functionVariable;  // Returning modified function variable
    }

    // Dummy function to simulate a value return
    function meow1() public pure returns (uint) {
        return 42;
    }

    // Dummy function to simulate a value return
    function meow2() public pure returns (uint) {
        return 42;
    }

    // Dummy function to simulate a value return
    function meow3() public pure returns (uint) {
        return 42;
    }

    // Dummy function to simulate a value return
    function meow4() public returns (uint) {
        mmmmmmmmmmmeee = 1000;
        return 42;
    }

    // Dummy function to simulate a value return
    function meow5() public returns (uint) {
        return 42;
    }
}
