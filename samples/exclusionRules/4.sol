// SPDX-License-Identifier: GPL-3.0
pragma solidity >=0.5.0 <0.9.0;

// First contract C
contract C1 {
    // View function that uses block.timestamp
    function f(uint a, uint b) public view returns (uint) {
        return a * (b + 42) + block.timestamp;
    }
}

// Second contract C with a pure function
contract C2 {
    // Pure function that only performs arithmetic
    function f(uint a, uint b) public pure returns (uint) {
        return a * (b + 42);
    }
}

// Third contract UseConstant
pragma solidity 0.4.16;

contract UseConstant {
    string greeting;

    // Constructor to initialize greeting
    function UseConstant() public {
        greeting = "Hello";
    }

    // Constant function to return the greeting
    function SayHello() public constant returns(string says) {
        return greeting;
    }

    // Pure function returning a constant value
    function myFunctionType1() public pure returns (uint) {
        return 42;
    }

    // Constant function returning a different constant value
    function myFunctionType2() public constant returns (uint) {
        return 100;
    }

    function() view constant pure returns (uint) public myFunctionType;
    function() view pure returns (uint) public myFunctionType;
}

// Combined contract that uses functions from all previous contracts
contract Combined {
    // Instances of the previous contracts
    C1 public contractC1;
    C2 public contractC2;
    UseConstant public contractUseConstant;

    // Constructor to deploy and link all contracts
    constructor() public {
        contractC1 = new C1();
        contractC2 = new C2();
        contractUseConstant = new UseConstant();
    }

    // Function that uses contractC1's f function
    function useC1Function(uint a, uint b) public view returns (uint) {
        contractC1.f(a, b);
    }

    // Function that uses contractC2's f function
    function useC2Function(uint a, uint b) public pure returns (uint) {
        contractC2.f(a, b);
    }

    // Function that uses SayHello from contractUseConstant
    function useSayHello() public constant returns (string) {
        contractUseConstant.SayHello();
    }

    // Function that uses myFunctionType1 from contractUseConstant
    function useMyFunctionType1() public pure returns (uint) {
        contractUseConstant.myFunctionType1();
    }

    // Function that uses myFunctionType2 from contractUseConstant
    function useMyFunctionType2() public constant returns (uint) {
        contractUseConstant.myFunctionType2();
    }
}
