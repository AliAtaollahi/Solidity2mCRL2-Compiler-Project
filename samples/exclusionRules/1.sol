// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;


contract MyContract {
  event NewTransaction(uint indexed transactionId, address sender, uint amount);
  
}

function performTransaction(address receiver, uint amount) public {
  // Perform the transaction logic...
  
  emit NewTransaction(transactionId, msg.sender, _amount);
  
  // Rest of the function code...
}