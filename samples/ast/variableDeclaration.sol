// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;


    function getStoredValue() external view returns (uint, uint, uint, uint) {
        // Local variables (temporary, only exist during function execution)
        uint localVariable1 = value1 * 2; // Using state variable in local calculation
        uint localVariable2 = value2 + 10; // Another local variable

        // Accessing special global variables (blockchain-related information)
        uint blockTimestamp = block.timestamp; // Global variable (current block's timestamp)
        uint gasLimit = block.gaslimit; // Global variable (current block's gas limit)

        // Return different types of values
        return (localVariable1, localVariable2, blockTimestamp, gasLimit);
    }

    function setValues(uint256 _num1, uint256 _num2) public {
        // Example of variable declaration list with initialization
        (uint qq, uint ww, uint ee) = (1, 2, 3);
        var (gg, hh, mm) = (4, 5, 6);

        uint256 a;
        uint256 b = _num2;
        (num1, num2) = (a, b);
    }
