pragma solidity ^0.8.0;


// Library definition
library Math {
    function add(uint a, uint b) public pure returns (uint) {
        return a + b;
    }
}

contract AllFunctionCallExpressions {

    // A struct definition
    struct MyStruct {
        uint x;
        uint y;
    }

    // Function that adds two numbers
    function add(uint a, uint b) public pure returns (uint) {
        return a + b;
    }

    // Function that multiplies two numbers
    function multiply(uint a, uint b) public pure returns (uint) {
        return a * b;
    }

    // Function that returns multiple values
    function getMultipleValues() public pure returns (uint, uint) {
        return (1, 2);
    }

    // A simple function with no arguments
    function getValue() public pure returns (uint) {
        return 42;
    }

    // Function that takes a struct as input
    function useStruct(MyStruct memory s) public pure returns (uint) {
        return s.x + s.y;
    }

    // Fallback function to receive Ether
    fallback() external payable {}

    using Math for uint;  // Attach the Math library to the uint type

    // Function that demonstrates all types of FunctionCallExpressions
    function demonstrateFunctionCalls() public payable {
        // 1. Calling a function with positional arguments
        uint result1 = add(5, 10);

        // 2. Calling a function with named arguments
        uint result2 = useStruct({x: 7, y: 3});

        // 3. Calling a function with no arguments
        uint result3 = getValue();

        // 4. Calling a function and ignoring return value
        getValue();

        // 5. Calling a function with inline arguments
        uint result4 = add(multiply(2, 3), 5);

        // 6. Calling a function that returns multiple values
        (uint a, uint b) = getMultipleValues();

        // 7. Calling a function with a struct parameter
        MyStruct memory myStruct = MyStruct(5, 10);
        uint result5 = useStruct(myStruct);

        // 8. Calling a contract constructor with `new`
        MyContract newContractInstance = new MyContract(100);

        // 9. Calling a low-level function (fallback function)
        address(this).call{value: 1 ether}("");

        // 10. Calling a function and using its return value in an expression
        uint result6 = add(getValue(), 100);

        // 11. Calling a function with Ether transfer
        deposit{value: 1 ether}();

        // 12. Calling a function via interface
        IMyInterface(contractAddress).myFunction(42);

        // 13. Calling a function via `require`
        require(isEven(4), "Number must be even");

        // 14. Unpacking multiple returns from a function call
        (uint x, uint y) = getMultipleValues();

        // 15. Library function call using 'using for'
        uint result7 = 5.add(10);
    }

    // A function to check if a number is even
    function isEven(uint number) public pure returns (bool) {
        return number % 2 == 0;
    }

    // Function to deposit Ether
    function deposit() public payable {}

    // Contract constructor
    constructor(uint _value) {}

}

// An interface for another contract
interface IMyInterface {
    function myFunction(uint a) external returns (uint);
}

contract MyContract {
    uint public value;

    constructor(uint _value) {
        value = _value;
    }
}
