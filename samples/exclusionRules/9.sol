// SPDX-License-Identifier: MIT
pragma solidity ^0.8.24;

// Hash function that accepts multiple input types and returns a keccak256 hash
function meow(string memory text, uint256 num, address _addr)
returns (bytes32)
{
    // Corrected variable names to match function signature
    return keccak256(abi.encodePacked(text, num, _addr));
}

contract HashFunction {

    // Hash function that accepts multiple input types and returns a keccak256 hash
    function hash(string memory text, uint256 num, address _addr)
    public
    pure
    returns (bytes32)
    {
        // Corrected variable names to match function signature
        return keccak256(abi.encodePacked(text, num, _addr));
    }

    // Example of hash collision
    // Hash collision can occur when you pass more than one dynamic data type
    // to abi.encodePacked. In such case, you should use abi.encode instead.
    function collision(string memory text, string memory anotherText)
    public
    pure
    returns (bytes32)
    {
        // Potential for collision: AA + BBB vs AAA + BB
        return keccak256(abi.encodePacked(text, anotherText));
    }

    // New function that uses abi.encode to prevent collision
    function safeHash(string memory text, string memory anotherText)
    public
    pure
    returns (bytes32)
    {
        // Using abi.encode to ensure no collision occurs
        return keccak256(abi.encode(text, anotherText));
    }

    // Function to compute the hash of a number
    function hashNumber(uint256 number) public pure returns (bytes32) {
        return keccak256(abi.encodePacked(number));
    }

    // Function to compute the hash of an address
    function hashAddress(address _addr) public pure returns (bytes32) {
        return keccak256(abi.encodePacked(_addr));
    }

    // Function to combine and hash a text and a boolean value
    function hashWithBoolean(string memory text, bool flag)
    public
    pure
    returns (bytes32)
    {
        return keccak256(abi.encodePacked(text, flag));
    }

    // Function that takes an array of numbers and returns its hash
    function hashArray(uint256[] memory numbers) public pure returns (bytes32) {
        return keccak256(abi.encodePacked(numbers));
    }
}

contract GuessTheMagicWord {
    bytes32 public answer =
    0x60298f78cc0b47170ba79c10aa3851d7648bd96f2f8e46a19dbc777c36fb0c00;

    // Magic word is "Solidity"
    function guess(string memory _word) public view returns (bool) {
        return keccak256(abi.encodePacked(_word)) == answer;
    }

    // New function to change the magic word (only if guessed correctly)
    function setNewMagicWord(string memory newWord, string memory guessWord) public returns (bool) {
        // Check if the guess is correct
        if (keccak256(abi.encodePacked(guessWord)) == answer) {
            // Set new magic word
            answer = keccak256(abi.encodePacked(newWord));
            return true;
        }
        return false;
    }

    // New function that allows guessing multiple words
    function guessMultiple(string[] memory _words) public view returns (bool) {
        for (uint256 i = 0; i < _words.length; i++) {
            if (keccak256(abi.encodePacked(_words[i])) == answer) {
                return true;
            }
        }
        return false;
    }

    // Function that returns the hash of a word for users to check
    function getHash(string memory _word) public pure returns (bytes32) {
        return abi.encodePacked(_word);
    }

    // Function to reset the answer to a default value
    function resetAnswer() public {
        answer = 0x60298f78cc0b47170ba79c10aa3851d7648bd96f2f8e46a19dbc777c36fb0c00;
    }
}
