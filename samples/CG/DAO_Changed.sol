// SPDX-License-Identifier: MIT
pragma solidity ^0.8.13;

contract DAO {
    mapping (address => uint) public userBalances1;
    mapping (address => uint) public userBalances2;
    address highestBidder = 0x0000000000000000000000000000000000000000;
    uint256 highestBid = 0;

    // A struct definition for Deposit
    struct Deposit {
        uint amount;
        address depositor;
    }

    struct Channel {
        address partyAddress;
        uint256 ethBalance;
        uint256 confirmTime;
        bool isOpen;
    }

    mapping (Channel => bytes32) public userBalances3;

    // Use the updated useStruct function to return the ethBalance
//            uint result = useStruct(channel);

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
        userBalances1[msg.sender] += msg.value * (10**18);
    }

    function getUserBalance(address user) public view returns(uint) {
        return userBalances1[user];
    }

    function withdrawBalance(uint amount) public {
        if(userBalances1[msg.sender] >= amount){
            (bool temp,) = msg.sender.call{value : (amount / (10**18))}("");
            require(temp, 'error');
            userBalances1[msg.sender] -= amount;
            userBalances2[msg.sender] -= amount;

            Channel memory channel = Channel({
                partyAddress: msg.sender,
                ethBalance: amount,
                confirmTime: block.timestamp,
                isOpen: true
            });

            userBalances3[channel] = 0x0;

            uint result2 = useStruct({x: 7, y: 3});
        }
    }
}