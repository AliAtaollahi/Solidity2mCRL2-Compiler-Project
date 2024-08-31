// Global 'using for' declarations
    using MathLib for uint256;            // Applies MathLib functions to uint256 globally
    using UniversalMathLib for *;         // Applies UniversalMathLib functions to all types globally
    using DataLib for Data;               // Applies DataLib functions to the Data struct globally
    using MathLib1 for uint256;           // Applies MathLib1 functions to uint256 globally
    using MathLib2 for uint256;           // Applies MathLib2 functions to uint256 globally
    using ArrayLib for uint[];            // Applies ArrayLib functions to uint[] globally
    using StructLib for * global;         // Applies StructLib functions to all structs globally
// Remove the problematic OperatorLib line
    using MultiTypeLib for uint256;       // Applies MultiTypeLib functions to uint256 globally
    using MultiTypeLib for string;        // Applies MultiTypeLib functions to string globally
    using MappingLib for mapping(uint256 => uint256); // Applies MappingLib functions to mappings globally
    using FunctionLib for function() external; // Applies FunctionLib functions to function types globally
    using DataArrayLib for Data[];        // Applies DataArrayLib functions to Data[] globally
    using GlobalLib for uint256 global;   // Applies GlobalLib functions to all instances of uint256 globally
