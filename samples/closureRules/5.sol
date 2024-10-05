pragma solidity ^0.8.0;

contract TransferAndCall {
    address public owner;
    uint public totalTransferred;

    constructor() {
        owner = msg.sender;
        totalTransferred = 0;
    }

    // Function that handles an Ether transfer and calls another function
    function executeTransfer(address payable recipient, uint amount) public {
        require(msg.sender == owner, "Only the owner can execute transfers");
        require(address(this).balance >= _amount, "Insufficient balance");

        // Call another function within the contract to update the totalTransferred
        updateTotalTransferred(_amount);

        // Perform the Ether transfer
        _recipient.transfer(_amount);
    }

    // Function to update the total amount of Ether transferred
    function updateTotalTransferred(uint _amount) internal {
        // Add the transferred amount to the totalTransferred state variable
        totalTransferred += _amount;
    }

    // Fallback function to receive Ether
    receive() external payable {}
}