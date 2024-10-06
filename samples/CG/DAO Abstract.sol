// SPDX-License-Identifier: MIT
pragma solidity ^0.8.13;

contract DAO {
    mapping (address => uint) public userBalances;

    function addToBalance() public payable {
        userBalances[msg.sender] += msg.value * (10**18);
    }

    function withdrawBalance(uint amount) public {
        if(userBalances[msg.sender] >= amount){
            (bool temp,) = msg.sender.call{value : (amount / (10**18))}("");
            require(temp, 'error');
            userBalances[msg.sender] -= amount;
        }
    }
}