// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract DelegateCallExample {
    address public owner;
    uint256 public y;  // Variable y that will be assigned a value in another function

    constructor() {
        owner = msg.sender; // Set contract owner
    }

    // Function to set the value of y
    function setY(uint256 _value) public {
        require(msg.sender == owner, "Only the owner can set y");
        y = _value;
    }

    // Function with variable assignment (x = y) and a delegatecall
    function updateXAndDelegatecall(address targetContract, bytes memory data) public payable {
        uint256 x = y; // Assign y's value to x

        // Perform a delegatecall to another contract
        (bool success, bytes memory result) = targetContract.delegatecall(data);
        require(success, "Delegatecall failed");
    }
}