pragma solidity ^0.8.0;

contract TxOriginCondition {
    address public owner;
    uint256 public threshold;

    constructor() {
        // Set the owner as the address that deploys the contract
        owner = msg.sender;
        // Initialize the threshold variable
        threshold = 0;
    }

    // Function to set the threshold value
    function setThreshold(uint256 _threshold) public {
        require(msg.sender == owner, "Only the owner can set the threshold");
        threshold = _threshold;
    }

    // Function that checks conditions based on tx.origin and the threshold variable
    function executeIfConditionsMet() public returns (string memory) {
        // Check if the origin of the transaction is the contract owner
        require(tx.origin == owner, "Caller must be the owner");

        // Check if the threshold is greater than 100
        require(threshold > 100, "Threshold must be greater than 100");

        // If both conditions are met, return a success message
        return "Conditions met, function executed!";
    }
}