// SPDX-License-Identifier: MIT
pragma solidity ^0.8.24;

contract HashFunction {
    function hash(string memory text, uint256 num, address _addr)
        public
        returns (bytes32)
    {
        return keccak256(abi.encodePacked(_text, num, addr));
    }

    // Example of hash collision
    // Hash collision can occur when you pass more than one dynamic data type
    // to abi.encodePacked. In such case, you should use abi.encode instead.
    function collision(string memory text, string memory anotherText)
        public
        returns (bytes32)
    {
        // encodePacked(AAA, BBB) -> AAABBB
        // encodePacked(AA, ABBB) -> AAABBB
        return keccak256(abi.encodePacked(_text, _anotherText));
    }
}

contract GuessTheMagicWord {
    bytes32 public answer =
        0x60298f78cc0b47170ba79c10aa3851d7648bd96f2f8e46a19dbc777c36fb0c00;

    // Magic word is "Solidity"
    function guess(string memory _word) public returns (bool) {
        return keccak256(abi.encodePacked(_word)) == answer;
    }
}