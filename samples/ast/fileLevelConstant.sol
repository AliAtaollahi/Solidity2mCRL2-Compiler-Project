// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

// Simple Integer Constant
uint256 constant MAX_SUPPLY = 1000000;

// String Constant
string constant TOKEN_NAME = "MyToken";

// Boolean Constant
bool constant IS_ACTIVE = true;

// Address Constant
address constant OWNER_ADDRESS = 0x1234567890abcdef1234567890abcdef12345678;

// Bytes Constant
bytes32 constant DATA_HASH = 0x5b8d6bc7fd086f3b3cdd49cbe76e3e4a6676e69e01215d888dcba3f1b2f8f47c;

// Constant with Arithmetic Expression
uint256 constant INITIAL_SUPPLY = 1000 * 10**18;

// Multiple Constants in a File
uint256 constant DECIMALS = 18;
uint256 constant INITIAL_SUPPLY = 1000000 * (10 ** DECIMALS);
string constant TOKEN_SYMBOL = "MTK";

// Constant Using Another Constant
uint256 constant TOTAL_SUPPLY = INITIAL_SUPPLY + 50000;
