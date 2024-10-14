// SPDX-License-Identifier: MIT
pragma solidity ^0.8.13;

contract DAO {
    mapping (address => uint) public userBalances;

    // A struct definition for Deposit
    struct Deposit {
        uint amount;
        address depositor;
    }

    // A struct definition for MyStruct
    struct MyStruct {
        uint x;
        uint y;
    }

    // Function that takes a struct as input
    function useStruct(MyStruct memory s) public pure returns (uint) {
        return s.x + s.y;
    }

    function addToBalance() public payable {
        userBalances[msg.sender] += msg.value * (10**18);
    }

    function getUserBalance(address user) public view returns(uint) {
        return userBalances[user];
    }

    function withdrawBalance(uint amount) public {
        if(userBalances[msg.sender] >= amount){
            (bool temp,) = msg.sender.call{value : (amount / (10**18))}("");
            require(temp, 'error');
            userBalances[msg.sender] -= amount;

//            MyStruct memory myStruct = MyStruct(5, 10);
//            uint result5 = useStruct(myStruct);

            uint result2 = useStruct({x: 7, y: 3});
        }
    }
}