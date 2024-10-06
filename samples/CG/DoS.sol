// SPDX-License-Identifier: MIT
pragma solidity ^0.8.13;

contract DosAuction {
    address highestBidder = 0x0000000000000000000000000000000000000000;
    uint256 highestBid = 0;

    function bid() public payable {
        require(msg.value > highestBid, "Need to be higher than highest bid");
		if(highestBidder == 0x0000000000000000000000000000000000000000){
			highestBidder = msg.sender;
			highestBid = msg.value;
		}
        else{
			// Refund the old leader, if it fails then revert 
			require(payable(highestBidder).send(highestBid), "Failed to send Ether");
			highestBidder = msg.sender;
			highestBid = msg.value;
		}
    }
}