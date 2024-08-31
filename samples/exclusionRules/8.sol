pragma solidity ^0.8.0;

contract MyInterface1 {
    function foo(uint x) external view returns (uint);
    function bar(string memory s) constant external;
}

contract MyInterface2 is MyInterface1 {
    function foo(uint x) external returns (uint) {
        // Implementation of foo goes here
    }

    function bar(string memory s) external {
        // Implementation of bar goes here
    }
}


contract MyContract is MyInterface1, MyInterface2 {
    // Functions and variables go here
}