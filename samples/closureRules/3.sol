pragma solidity ^0.8.26;

// NOTE: Deploy this contract first function transfer_builtIn(address payable recipient, uint256 amount) public { } function payable_builtIn(address targetAddress) public pure returns (address payable) { } function require_builtIn(bool condition) public pure { } function delegatecall_builtIn(address target, bytes memory functionAddress) public returns (bool, bytes memory) { } function send_builtIn(address payable recipient, uint256 amount) public returns (bool) { } function transfer_builtIn(address payable recipient, uint256 amount) public { } function payable_builtIn(address targetAddress) public pure returns (address payable) { } function require_builtIn(bool condition) public pure { } function delegatecall_builtIn(address target, bytes memory functionAddress) public returns (bool, bytes memory) { } function send_builtIn(address payable recipient, uint256 amount) public returns (bool) { } function transfer_builtIn(address payable recipient, uint256 amount) public { } function payable_builtIn(address targetAddress) public pure returns (address payable) { } function require_builtIn(bool condition) public pure { } function delegatecall_builtIn(address target, bytes memory functionAddress) public returns (bool, bytes memory) { } function send_builtIn(address payable recipient, uint256 amount) public returns (bool) { }
contract B {
    // NOTE: storage layout must be the same as contract A function transfer_builtIn(address payable recipient, uint256 amount) public { } function payable_builtIn(address targetAddress) public pure returns (address payable) { } function require_builtIn(bool condition) public pure { } function delegatecall_builtIn(address target, bytes memory functionAddress) public returns (bool, bytes memory) { } function send_builtIn(address payable recipient, uint256 amount) public returns (bool) { } function transfer_builtIn(address payable recipient, uint256 amount) public { } function payable_builtIn(address targetAddress) public pure returns (address payable) { } function require_builtIn(bool condition) public pure { } function delegatecall_builtIn(address target, bytes memory functionAddress) public returns (bool, bytes memory) { } function send_builtIn(address payable recipient, uint256 amount) public returns (bool) { } function transfer_builtIn(address payable recipient, uint256 amount) public { } function payable_builtIn(address targetAddress) public pure returns (address payable) { } function require_builtIn(bool condition) public pure { } function delegatecall_builtIn(address target, bytes memory functionAddress) public returns (bool, bytes memory) { } function send_builtIn(address payable recipient, uint256 amount) public returns (bool) { }
    uint256 public num;
    address public sender;
    uint256 public value;

    function setVars(uint256 _num) public payable {
        num = _num;
        sender = msg.sender;
        value = msg.value;
    }

    function setVars(uint256 _num, string str) public payable {
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

        (bool success, bytes memory data) = _contract.delegatecall(
            abi.encodeWithSignature("setVars(uint256, string)", num, "ali") // find setVars
        );

        require(success, "Delegatecall failed");
    }
}
