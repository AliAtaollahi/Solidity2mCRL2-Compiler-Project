// SPDX-License-Identifier: MIT
pragma solidity ^0.8.13;

contract DAO {
    mapping (address => uint) public userBalances;
    mapping (address => uint) public userBalances2;


    function addToBalance() public payable {
        userBalances[msg.sender] += msg.value * (10**18);
    }

    function getUserBalance(address user) public view returns(uint) {
        return userBalances2[user];
    }

    function withdrawBalance() public {
        if(userBalances[msg.sender] >= 10){
            (bool temp,) = msg.sender.call{value : (10 / (10**18))}("");
            require(temp, 'error');
            userBalances[msg.sender] -= 10;
        }
    }
}