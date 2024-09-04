pragma solidity ^0.8.0;

interface MyInterface1 {
  function foo(uint x) external returns (uint);
  function bar(string memory s) external;
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
  function bar(string memory s) external {
    // Implementation of bar goes here
  }
  // Functions and variables go here
}