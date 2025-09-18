// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract Counter {
    uint256 private count;

    // Public function to increment the counter
    function increment() public {
        _changeCount(1); // Calls internal function
    }

    // Public function to decrement the counter
    function decrement() public {
        _changeCount(-1); // Calls internal function
    }

    // Public function to reset the counter to zero
    function reset() public {
        _resetCounter(); // Calls internal function
    }

    // Internal function to change the count by a given delta
    function _changeCount(int256 delta) internal {
        if (delta < 0 && count < uint256(-delta)) {
            count = 0; // prevent underflow
        } else {
            count = uint256(int256(count) + delta);
        }
    }

    // Internal function to reset the counter
    function _resetCounter() internal {
        count = 0;
    }
}
