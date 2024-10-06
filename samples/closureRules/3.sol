pragma solidity ^0.8.26;

contract abi {
//    // Function to encode data using the function signature with dynamic arguments
//    function encodeWithSignature(string memory functionSignature, bytes memory args) public pure returns (bytes memory) {
//        // Encode the function call with the provided signature and dynamic arguments
//        return abi.encodeWithSignature(functionSignature, args);
//    }
//
//    // Helper function to encode arguments and return the encoded function call
//    function encodeCallWithDynamicArgs(string memory functionSignature, bytes[] memory arguments) public pure returns (bytes memory) {
//        // Unpack the dynamic arguments into a single bytes array using abi.encode
//        bytes memory args = abi.encode(arguments);
//
//        // Return the encoded function signature with the packed arguments
//        return abi.encodeWithSignature(functionSignature, args);
//    }
    function encodeWithSignature(string memory functionSignature, uint256 num) public pure returns (bytes memory) {
        return abi.encodeWithSignature(functionSignature, num);
    }
}

// NOTE: Deploy this contract first
contract B {
    // NOTE: storage layout must be the same as contract A
    uint256 public num;
    address public sender;
    uint256 public value;

    function setVars(uint256 _num) public payable {
        num = _num;
        sender = msg.sender;
        value = msg.value;
    }
}

contract A {
    uint256 public num;
    address public sender;
    uint256 public value;

    function setVars(address _contract, uint256 num) public payable {
        // A's storage is set, B is not modified.
        (bool success, bytes memory data) = _contract.delegatecall(
            abi.encodeWithSignature("setVars(uint256)", num) // find setVars
        );
        require(success, "Delegatecall failed");
    }
}
