// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

// Base contracts to demonstrate inheritance
contract BaseContract1 {
    function baseFunction1() public pure returns (string memory) {
        return "BaseContract1";
    }
}

contract BaseContract2 {
    function baseFunction2() public pure returns (string memory) {
        return "BaseContract2";
    }
}

// Interface definition
interface MyInterface {
    function interfaceFunction() external view returns (string memory);
}

// Library definition
library MyLibrary {
    function add(uint a, uint b) internal pure returns (uint) {
        return a + b;
    }
}

// Abstract contract definition
abstract contract MyAbstractContract is BaseContract1, BaseContract2 {
    function abstractFunction() public virtual returns (string memory);

    // Concrete function in an abstract contract
    function baseFunction() public pure returns (string memory) {
        return "Concrete function in MyAbstractContract";
    }
}

// Main contract definition
contract MyContract is MyAbstractContract, MyInterface {
    using MyLibrary for uint;

    struct MyStruct {
        uint id;
        string name;
    }

    address public owner;

    // Modifier definition
    modifier onlyOwner(uint a, uint b) {
        uint id;
        string name;
        require(msg.sender == owner, "Not the owner");
        _;
    }

    constructor() {
        owner = msg.sender;
    }

    // Function overriding an abstract function
    function abstractFunction() public override returns (string memory) {
        return "Abstract function implemented";
    }

    // Function from interface implementation
    function interfaceFunction() external view override returns (string memory) {
        return "Interface function implemented";
    }

    // A simple function using a modifier
    function myFunction(uint a, uint b) public onlyOwner returns (uint) {
        return a.add(b);
    }
}

// Empty contract definition
contract EmptyContract {}

// Another contract with multiple inheritance and an abstract function
abstract contract MySecondAbstractContract is BaseContract1, BaseContract2 {
    function anotherAbstractFunction() public virtual returns (string memory);
}
