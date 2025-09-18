// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract AhmadSupporter {
    uint256 public num;
    address public sender;
    uint256 public value;

    function setVars(uint256 _num) public payable {
        num = _num;
        sender = msg.sender;
        value = msg.value;
    }
}

contract ExampleContract {
    // Define state variables
    uint[] public myArray;

    // Event declaration
    event Transfer(address indexed from, address indexed to, uint amount);

    // Constructor to initialize the contract
    constructor() {
    }

    // Function to demonstrate various Solidity features
    function exampleFunction(int x, address _contract) public returns (uint returnValue) {
//        tx.origin;
        int temp = 0;
        int sum = 0;

        // 1. If Statement
        if (x > 10) {
            uint ahmad = 10;
            temp = 0;
        } else {
            temp = 5;
        }

        // 2. While Statement
        while (x < 100) {
            uint ahmad = 20 + (3 / anotherFunction(1,2,3));
            (bool success, bytes memory data) = _contract.delegatecall(
                abi.encodeWithSignature("setVars(uint256)", ahmad) // find setVars
            );
//            x += 20 + (3 * addFunc(1,2,3));
        }

        // 3. For Statement
        for (uint i = 0; i < 10; i++) {
            sum += int(i);
        }

        // 4. Do-While Statement
        do {
            x += 1;
        } while (x < 10);

        // 5. Continue Statement
        for (uint i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            sum += int(i);
        }

        // 6. Break Statement
        for (uint i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            sum += int(i);
        }

        // 7. Return Statement
        returnValue = getValue();

        // 9. Emit Statement (Transfer event)
        emit Transfer(msg.sender, address(this), 100);

        // 11. Simple Statement with Expression
        x += 5;

        // 13. Revert Statement
        if (x > 100) {
            revert("Error: x is greater than 100");
        }

        // 14. Inline Assembly Statement
        assembly {
            let result := add(1, 2)
        }

        // 16. Expression Statement
        x = x + 1;

        // 17. Parenthesized Expression
        bool isPositive = (x > 0);

        // 18. Array Indexing
        if (myArray.length > 0) {
            uint element = myArray[0];
        }
    }

    // Dummy function to simulate a value return
    function getValue() public pure returns (uint) {
        return 42;
    }

    // Another dummy function to simulate function call
    function anotherFunction(uint a, uint b, uint c) public pure returns (uint) {
        return a + b + c;
    }
}
