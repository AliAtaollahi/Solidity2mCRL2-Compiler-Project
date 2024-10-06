// SPDX-License-Identifier: MIT
pragma solidity 0.8.17;

contract GuessingGame{
    //Declaration
    address owner;
    uint guessNum;
    bool endGame = false;
    address winner;
    uint winnerMoney;

    constructor(uint guess_number) payable {
        owner = msg.sender;
		guessNum = guess_number;
    }

    function Play(uint number) payable public {
        require(endGame == false,"The game has already finished!!");
        if(number == guessNum){
            endGame = true;
            winner = msg.sender;
            winnerMoney = msg.value;
        }
    }

    function reward() public {
        require(msg.sender == owner,"You cannot access to this function!");
		require(endGame == true,"The game is running!!");
        payable(winner).transfer((winnerMoney/address(this).balance)*(address(this).balance - winnerMoney) + winnerMoney);
    }
    
    function withdraw() public {
        require(tx.origin == owner,"You cannot access to this function!");
        payable(msg.sender).transfer(address(this).balance);
    }
}