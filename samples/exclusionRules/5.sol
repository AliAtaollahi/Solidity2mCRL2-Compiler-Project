contract ConstantGetter{
     uint8 constant public AGE = 100;

     address constant public USER = 0x5B38Da6a701c568545dCfcB03FcB875f56beddC4;

     constructor(){
         address getAddress = USER;
     }

     function getAge() public pure returns(uint8){
         return AGE;
     }
 }