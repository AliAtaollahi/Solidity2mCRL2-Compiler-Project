// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

// Simple Custom Error with No Parameters
error Unauthorized();

// Custom Error with One Parameter
error InsufficientBalance(uint256 requested, uint256 available);

// Custom Error with Multiple Parameters
error TransferFailed(address from, address to, uint256 amount);

// Custom Error with Complex Parameters
error InvalidOrder(address buyer, uint256[2 * 3] itemIds, bytes32 orderId);

// Custom Error Using Structs as Parameters
struct Order {
    address buyer;
    uint256[] itemIds;
    bytes32 orderId;
}

error OrderRejected(Order order, string reason);
