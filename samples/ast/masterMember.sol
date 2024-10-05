// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract Contract0 {
    uint256 public value;

    function setValue(uint256 _value) public {
        value = _value;
    }

    function getValue() public view returns (uint256) {
        return value;
    }
}

contract Contract1 {
    uint256 public value;
    Contract0 public contract0Instance;

    constructor(address _contract0Address) {
        contract0Instance = new Contract0(_contract0Address);
    }

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
        contract1Instance = new Contract1(_contract1Address); // Initialize with an existing Contract1 instance address
    }

    function updateContract1Value(uint256 _value) public {
        contract1Instance.setValue(_value); // Use Contract1's function
        contract1Instance.getValue(_value); // Use Contract1's function
    }

    function getContract1Value() public view returns (uint256) {
        return contract1Instance.getValue(); // Use Contract1's function
    }
}

contract Contract3 {
    Contract2 public contract2Instance;

    constructor(address _contract2Address) {
        contract2Instance = new Contract2(_contract2Address); // Initialize with an existing Contract2 instance address
    }

    // This function calls a function from Contract1 via Contract2
    function updateContract1ValueThroughContract2(uint256 _value) public {
        _value = contract2Instance.contract1Instance.getValue(); // Access Contract1's function via Contract2
    }

//    function getContract1ValueThroughContract2() public view returns (uint256) {
//        return contract2Instance.contract1Instance.updateContract1ValueThroughContract2(); // Access Contract1's function via Contract2
//    }
}
