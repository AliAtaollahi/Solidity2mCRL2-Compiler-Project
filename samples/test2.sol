// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

// Import Directive
import * as aliasName from "path/to/file.sol";


// Enum Definition
    enum Status { Pending, Active, Inactive }

// Event Definition
    event StatusChanged(uint256 indexed id, Status newStatus);

// Struct Definition
    struct User {
        uint256 id;
        string name;
        Status status;
    }

// File Level Constant
uint256 constant MAX_SUPPLY = 1000000;

// Custom Error Definition
error InvalidStatus(uint256 id, Status currentStatus);

// Type Definition
type Price is uint256;

// Using For Declaration
using SafeMath for uint256;

// Contract Definition
contract ExampleContract {
// State variable
mapping(uint256 => User) public users;

// Function Definition
function changeStatus(uint256 _id, Status _newStatus) public {
User storage user = users[_id];
if (_newStatus == Status.Inactive && user.status != Status.Active) {
revert InvalidStatus(_id, user.status);
}
user.status = _newStatus;
emit StatusChanged(_id, _newStatus);
}

// Example function using custom type
function calculatePrice(Price price) public pure returns (uint256) {
return Price.unwrap(price).mul(MAX_SUPPLY);
}
}

function multiply(uint256 x, uint256 y) public pure returns (uint256) {
    return x * y;
}

constructor(uint256 initialValue) public {
value = initialValue;
}

fallback() external payable {
// handle the incoming ether
}

receive() external payable {
// receive ether
}