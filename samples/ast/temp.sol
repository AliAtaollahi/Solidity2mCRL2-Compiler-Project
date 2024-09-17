// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract Contract1 {
    uint256 public value;

    function setValue(uint256 _value) public {
        value = _value;
    }

    function getValue() public view returns (uint256) {
        return value;
    }
}

contract Contract2 {
    Contract1 public contract1Instance;

    constructor(address _contract1Address) {
        contract1Instance = Contract1(_contract1Address); // Initialize with an existing Contract1 instance address
    }

    function updateContract1Value(uint256 _value) public {
        contract1Instance.setValue(_value); // Use Contract1's function
    }

    function getContract1Value() public view returns (uint256) {
        return contract1Instance.getValue(); // Use Contract1's function
    }
}
