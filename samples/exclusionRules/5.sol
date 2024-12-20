// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

// The original ConstantGetter contract
contract ConstantGetter {
    uint8 constant public AGE = 100;
    address constant public USER = 0x5B38Da6a701c568545dCfcB03FcB875f56beddC4;

    constructor() {
        address getAddress = USER;
    }

    function getAge() public pure returns (uint8) {
        return AGE;
    }
}

// Another contract that will access AGE from ConstantGetter using its instance
contract AnotherContract {
    function getAgeFromConstantGetter(address constantGetterAddress) public view returns (uint8) {
        // Create an instance of the ConstantGetter contract
        ConstantGetter getter = ConstantGetter(constantGetterAddress);
        // Access the public constant AGE from the ConstantGetter instance
        return getter.AGE();
    }
}

// Another contract that inherits from ConstantGetter and accesses AGE directly
contract InheritedContract is ConstantGetter {
    function getInheritedAge() public pure returns (uint8) {
        // Direct access to AGE because AnotherContract s ConstantGetter
        return AGE;
    }
}