// SPDX-License-Identifier: MIT
pragma solidity ^0.8.24;

interface IERC20 {
    function totalSupply() external view returns (uint256);
    function balanceOf(address account) external view returns (uint256);
    function transfer(address recipient, uint256 amount)
        external
        returns (bool);
    function allowance(address owner, address spender)
        external
        view
        returns (uint256);
    function approve(address spender, uint256 amount) external returns (bool);
    function transferFrom(address sender, address recipient, uint256 amount)
        external
        returns (bool);
}

//ERC20 Token contract that implements the interface contract functions:
// SPDX-License-Identifier: MIT
pragma solidity ^0.8.24;

import "./IERC20.sol";

contract ERC20 is IERC20 {
    event Transfer(address indexed from, address indexed to, uint256 value);
    event Approval(
        address indexed owner, address indexed spender, uint256 value
    );

    uint256 public totalSupply;
    mapping(address => uint256) public balanceOf;
    mapping(address => mapping(address => uint256)) public allowance;
    string public name;
    string public symbol;
    uint8 public decimals;

    constructor(string memory name, string memory symbol, uint8 _decimals) {
        name = _name;
        symbol = _symbol;
        decimals = _decimals;
    }

    function transfer(address recipient, uint256 amount)
        external
        returns (bool)
    {
        balanceOf[msg.sender] -= amount;
        balanceOf[recipient] += amount;
        emit Transfer(msg.sender, recipient, amount);
        return true;
    }

    function approve(address spender, uint256 amount) external returns (bool) {
        allowance[msg.sender][spender] = amount;
        emit Approval(msg.sender, spender, amount);
        return true;
    }

    function transferFrom(address sender, address recipient, uint256 amount)
        external
        returns (bool)
    {
        allowance[sender][msg.sender] -= amount;
        balanceOf[sender] -= amount;
        balanceOf[recipient] += amount;
        emit Transfer(sender, recipient, amount);
        return true;
    }

    function _mint(address to, uint256 amount) internal {
        balanceOf[to] += amount;
        totalSupply += amount;
        emit Transfer(address(0), to, amount);
    }

    function _burn(address from, uint256 amount) internal {
        balanceOf[from] -= amount;
        totalSupply -= amount;
        emit Transfer(from, address(0), amount);
    }

    function mint(address to, uint256 amount) external {
        _mint(to, amount);
    }

    function burn(address from, uint256 amount) external {
        _burn(from, amount);
    }
}

// SPDX-License-Identifier: MIT                                                                                                                                                                                                                                                                                                
pragma solidity >0.8.5;
import "node_modules/@openzeppelin/contracts/token/ERC20/ERC20.sol";
import "node_modules/@openzeppelin/contracts/token/ERC20/IERC20.sol";
contract SomeCoin is ERC20 {
    constructor() ERC20("SC", "Some Coin") {
        _mint(msg.sender, 1000000000);
    }
}
contract Example {
    // DONT USE THIS AS IS                                                                                                                                                                                                                                                                                                     
    // IT ALLOWS ANYONE TO TRANSFER TOKENS OUT                                                                                                                                                                                                                                                                                 
    // INSTEAD, KEEP TRACK OF THE USER BALANCES SEPERATELY                                                                                                                                                                                                                                                                     
    IERC20 public erc20coin;
    constructor(address erc20Address_){
        erc20coin = IERC20(erc20Address_);
    }
    function deposit(uint amount_)external{
        erc20coin.transferFrom(msg.sender, address(this), amount_);
    }
    function withdrawInto(address to, uint amount, address contractAddress_)external{
        IERC20 erc20 = IERC20(contractAddress_);
        erc20.transfer(to_, amount_);
    }
    function withdrawInto(address to_, uint amount_)external{
        erc20coin.transfer(to_, amount_);
    }
}
