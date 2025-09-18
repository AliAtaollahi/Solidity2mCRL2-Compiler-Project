// SPDX-License-Identifier: GPL-3.0
pragma solidity ^0.8.4;

contract KingOfEther {
    address public king;
    uint public treasure;
    uint public increasePercentage;

    mapping (address => uint) pendingWithdrawals;

    event NewKing(address king, uint money);

    constructor(uint _increasePercentage) {
        increasePercentage = _increasePercentage;
        king = msg.sender;
        treasure = 0;
    }

    function becomeKing() public payable {
        require(msg.sender != king, "You are already the king.");
        require(msg.value * 100 > treasure * (100 + increasePercentage), "Not enough money sent.");
        pendingWithdrawals[king] += msg.value;
        king = msg.sender;
        treasure = msg.value;
        emit NewKing(king, treasure);
    }

    function withdraw() public {
        uint amount = pendingWithdrawals[msg.sender];
        if (amount > 0) {
            pendingWithdrawals[msg.sender] = 0;
            payable(msg.sender).transfer(amount);
        }
    }

    function amountWithdrawable() public view returns (uint) {
        return pendingWithdrawals[msg.sender];
    }
}