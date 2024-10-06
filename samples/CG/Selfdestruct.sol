// SPDX-License-Identifier: MIT
pragma solidity ^0.8.13;

contract EtherGame {
    uint public targetAmount = 3 wei;
    address public winner;

    function deposit() public payable {
        require(msg.value == 1 wei, "You can only send 1 Wei");

        uint balance = address(this).balance;
        require(balance <= targetAmount, "Game is over");

        if (balance == targetAmount) {
            winner = msg.sender;
			(bool sent, ) = winner.call{value: address(this).balance}("");
			require(sent, "Failed to send Ether");
        }
    }
}