// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract ExampleContract {
    // State variable (global variable)
    uint public myNumber = 42;

    // Function that reads the state variable using the 'view' modifier
    function getMyNumber() public view returns (uint) {
        return myNumber;  // Accessing the state variable
    }
}