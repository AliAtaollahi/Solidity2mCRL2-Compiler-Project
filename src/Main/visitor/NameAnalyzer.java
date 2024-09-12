package main.visitor;

import main.ast.nodes.SourceUnit;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.utility.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.modifier.Modifier;
import main.ast.nodes.expression.modifier.ModifierInvocation;
import main.ast.nodes.expression.modifier.OtherModifers;
import main.ast.nodes.expression.modifier.OverrideSpecifier;
import main.ast.nodes.expression.primary.*;
import main.ast.nodes.expression.type.AddressPayable;
import main.ast.nodes.expression.type.FunctionTypeName;
import main.ast.nodes.expression.type.Mapping;
import main.ast.nodes.expression.type.UserDefinedTypeName;
import main.ast.nodes.expression.type.primitive.*;
import main.ast.nodes.expression.value.EnumValue;
import main.ast.nodes.expression.value.ImportPath;
import main.ast.nodes.expression.value.StorageLocation;
import main.ast.nodes.statement.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.*;

import java.util.ArrayList;
import java.util.List;

public class NameAnalyzer extends Visitor<Void> {
    @Override
    public Void visit(SourceUnit sourceUnit) {
        SymbolTable.push(new SymbolTable());
        SymbolTable.root = SymbolTable.top;

//        // Visit all ImportDirectives
//        for (ImportDirective importDirective : sourceUnit.getImportDirectives()) {
//            importDirective.accept(this);
//        }

        // Visit all ContractDefinitions
        for (ContractDefinition contractDefinition : sourceUnit.getContractDefinitions()) {
            contractDefinition.accept(this);
        }

        // Visit all EnumDefinitions
        for (EnumDefinition enumDefinition : sourceUnit.getEnumDefinitions()) {
            enumDefinition.accept(this);
        }

        // Visit all StructDefinitions
        for (StructDefinition structDefinition : sourceUnit.getStructDefinitions()) {
            structDefinition.accept(this);
        }

        // Visit all FunctionDefinitions
        for (FunctionDefinition functionDefinition : sourceUnit.getFunctionDefinitions()) {
            functionDefinition.accept(this);
        }

        // Visit all FileLevelConstants
        for (FileLevelConstant fileLevelConstant : sourceUnit.getFileLevelConstants()) {
            fileLevelConstant.accept(this);
        }

        // Visit all CustomErrorDefinitions
        for (CustomErrorDefinition customErrorDefinition : sourceUnit.getCustomErrorDefinitions()) {
            customErrorDefinition.accept(this);
        }

        // Visit all UsingForDeclarations
        for (UsingForDeclaration usingForDeclaration : sourceUnit.getUsingForDeclarations()) {
            usingForDeclaration.accept(this);
        }

        return null;
    }

//    @Override
//    public Void visit(Identifier identifier) {
//        return null;
//    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        // Visit the first operand
        if (binaryExpression.getFirstOperand() != null) {
            binaryExpression.getFirstOperand().accept(this);
        }

        // Visit the second operand
        if (binaryExpression.getSecondOperand() != null) {
            binaryExpression.getSecondOperand().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        // Visit the operand
        if (unaryExpression.getExpression() != null) {
            unaryExpression.getExpression().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(ImportDirective importDirective) {
        // Visit the import path
        if (importDirective.getImportPath() != null) {
            importDirective.getImportPath().accept(this);
        }

        // Visit the alias identifier
        if (importDirective.getAliasId() != null) {
            importDirective.getAliasId().accept(this);
        }

        // Visit each import element in the list
        for (ImportElement element : importDirective.getImportedElements()) {
            if (element != null) {
                element.accept(this);
            }
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(ContractDefinition contractDefinition) {
        // Get the contract name
        Identifier contractNameId = contractDefinition.getName();

        // Create a ContractSymbolTableItem for the contract
        ContractSymbolTableItem contractSymbolTableItem = new ContractSymbolTableItem(contractNameId.getName());

        // Try to insert the contract symbol into the current symbol table
        try {
            SymbolTable.top.put(contractSymbolTableItem);
        } catch (ItemAlreadyExistsException e) {
            // If the contract is already defined in the current scope, report an error
            System.out.println("Error: Contract " + contractNameId.getName() + " already declared in the current scope.");
            return null;
        }

        // Create a new symbol table for the contract and link it to the symbol table item
        SymbolTable contractSymbolTable = new SymbolTable(SymbolTable.top);
        contractSymbolTableItem.setContractSymbolTable(contractSymbolTable);  // Link symbol table to the contract
        SymbolTable.push(contractSymbolTable);  // Push the new symbol table for the contract scope

        // Visit all inheritance specifiers and add them to the contract symbol table item
        for (InheritanceSpecifier inheritanceSpecifier : contractDefinition.getInheritanceSpecifiers()) {
            if (inheritanceSpecifier != null) {
                inheritanceSpecifier.accept(this);  // Visit the inheritance specifier
                contractSymbolTableItem.addInheritanceSpecifier(inheritanceSpecifier);  // Add to contract symbol
            }
        }

        // Visit all contract parts (functions, variables, etc.)
        ArrayList<ContractPart> cleanContractParts = new ArrayList<>();
        for (ContractPart contractPart : contractDefinition.getContractParts()) {
            if (contractPart != null) {
                cleanContractParts.add(contractPart);
                contractPart.accept(this);  // Visit the contract part
            }
        }

        // Update the contract definition with the clean list of contract parts
        contractDefinition.setContractParts(cleanContractParts);

        // Pop the symbol table after finishing the contract scope
        SymbolTable.pop();

        return null;
    }



    @Override
    public Void visit(EnumDefinition enumDefinition) {
        Identifier enumNameId = enumDefinition.getName();

        EnumSymbolTableItem enumSymbolTableItem = new EnumSymbolTableItem(enumNameId.getName());

        try {
            SymbolTable.top.put(enumSymbolTableItem);
        } catch (ItemAlreadyExistsException e) {
            System.out.println("Error: Enum " + enumNameId.getName() + " already declared in the current scope.");
            return null;
        }

        SymbolTable enumSymbolTable = new SymbolTable(SymbolTable.top);
        enumSymbolTableItem.setSymbolTable(enumSymbolTable);  // Link the symbol table to the enum
        SymbolTable.push(enumSymbolTable);  // Push the new symbol table for the enum scope

        int enumIndex = 0;
        for (EnumValue enumValue : enumDefinition.getEnumValues()) {
            if (enumValue != null) {
                EnumValueSymbolTableItem enumValueItem = new EnumValueSymbolTableItem(enumValue.getValue().getName(), enumIndex);

                try {
                    SymbolTable.top.put(enumValueItem);
                } catch (ItemAlreadyExistsException e) {
                    System.out.println("Error: Enum value '" + enumValue.getValue().getName() + "' already declared.");
                }

                enumIndex++;
            }
        }

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(StructDefinition structDefinition) {
        Identifier structNameId = structDefinition.getNameId();

        StructSymbolTableItem structSymbolTableItem = new StructSymbolTableItem(structNameId.getName());

        try {
            SymbolTable.top.put(structSymbolTableItem);
        } catch (ItemAlreadyExistsException e) {
            // If struct is already defined in the current scope, report an error
            System.out.println("Error: Struct " + structNameId.getName() + " already declared in the current scope.");
            return null;
        }

        SymbolTable structSymbolTable = new SymbolTable(SymbolTable.top);
        structSymbolTableItem.setSymbolTable(structSymbolTable); // Link symbol table to the struct
        SymbolTable.push(structSymbolTable);  // Push the new symbol table for the struct scope

        for (VariableDeclaration variableDeclaration : structDefinition.getVariableDeclarations()) {
            if (variableDeclaration != null) {
                variableDeclaration.accept(this); // Visit the variable declaration
            }
        }

        SymbolTable.pop();

        return null;
    }


    @Override
    public Void visit(FileLevelConstant fileLevelConstant) {
        FileLevelConstantSymbolTableItem constantSymbolTableItem = new FileLevelConstantSymbolTableItem(
                fileLevelConstant.getName().getName(),
                fileLevelConstant.getType(),
                fileLevelConstant.getValue()
        );

        try {
            SymbolTable.top.put(constantSymbolTableItem);
        } catch (ItemAlreadyExistsException e) {
            System.out.println("Error: File-level constant " + fileLevelConstant.getName().getName() + " already declared.");
            return null;
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(CustomErrorDefinition customErrorDefinition) {
        Identifier errorNameId = customErrorDefinition.getName();

        CustomErrorSymbolTableItem errorSymbolTableItem = new CustomErrorSymbolTableItem(errorNameId.getName());

        try {
            SymbolTable.top.put(errorSymbolTableItem);
        } catch (ItemAlreadyExistsException e) {
            System.out.println("Error: Custom Error " + errorNameId.getName() + " already declared in the current scope.");
            return null;
        }

        SymbolTable errorSymbolTable = new SymbolTable(SymbolTable.top);
        errorSymbolTableItem.setSymbolTable(errorSymbolTable);  // Link the symbol table to the custom error
        SymbolTable.push(errorSymbolTable);  // Push the new symbol table for the custom error's scope

        if (customErrorDefinition.getParameters() != null) {
            customErrorDefinition.getParameters().accept(this);
        }

        SymbolTable.pop();

        return null;
    }


    @Override
    public Void visit(UsingForDeclaration usingForDeclaration) {
        // Visit the UsingForObject if present
        if (usingForDeclaration.getUsingForObject() != null) {
            usingForDeclaration.getUsingForObject().accept(this);
        }

        // If the declaration is not "for all types", visit the type
        if (!usingForDeclaration.isAllType() && usingForDeclaration.getType() != null) {
            usingForDeclaration.getType().accept(this);
        }

        // Insert the UsingForDeclaration into the symbol table
        try {
            UsingForSymbolTableItem usingForItem = new UsingForSymbolTableItem(
                    usingForDeclaration.getUsingForObject(),
                    usingForDeclaration.isAllType() ? "*" : usingForDeclaration.getType().toString(),
                    usingForDeclaration.isGlobal()
            );
            SymbolTable.top.put(usingForItem);
        } catch (ItemAlreadyExistsException e) {
            System.out.println("Error: Using-for declaration already exists.");
        }

        return null;
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition) {
        // Handle functionDescriptor
        PrimaryExpression functionDescriptor = functionDefinition.getFunctionDescriptor();
        if (functionDescriptor == null) {
            System.out.println("Error: Function without a name.");
            return null;
        }

        String functionName = (functionDescriptor instanceof FunctionDescriptor) ?
                ((FunctionDescriptor) functionDescriptor).getName().getName() :
                ((OtherFunctionDescriptors) functionDescriptor).getName();

        // Create FunctionSymbolTableItem
        FunctionSymbolTableItem functionSymbolTableItem = new FunctionSymbolTableItem(functionName);

        // Store the function's modifiers in the symbol table item
        if (functionDefinition.getModifierList() != null) {
            functionSymbolTableItem.setModifierList(functionDefinition.getModifierList());
        }

        // Store the return parameters in the symbol table item
        if (functionDefinition.getReturnParameterList() != null) {
            functionSymbolTableItem.setReturnParameterList(functionDefinition.getReturnParameterList());
        }

        // Add function to symbol table
        try {
            SymbolTable.top.put(functionSymbolTableItem);
        } catch (ItemAlreadyExistsException e) {
            System.out.println("Error: Function " + functionName + " already declared in the current scope.");
            return null;
        }

        // Create a new symbol table for the function's scope
        SymbolTable functionSymbolTable = new SymbolTable(SymbolTable.top);
        functionSymbolTableItem.setSymbolTable(functionSymbolTable);
        SymbolTable.push(functionSymbolTable);  // Push the function's new scope

        // Process function parameters
        if (functionDefinition.getParameterList() != null) {
            for (Parameter parameter : functionDefinition.getParameterList().getParameters()) {
                if (parameter != null) {
                    try {
                        SymbolTable.root.getItem(VariableDeclarationSymbolTableItem.START_KEY + parameter.getIdentifier().getName(), true);
                        System.out.println("Error: Parameter " + parameter.getIdentifier().getName() + " conflicts with a global variable.");
                    } catch (ItemNotFoundException ignored) {
                        parameter.accept(this);  // Process parameter declaration
                    }
                }
            }
        }

        // Store and process return parameters
        if (functionDefinition.getReturnParameterList() != null) {
            for (Parameter returnParam : functionDefinition.getReturnParameterList().getParameters()) {
                if (returnParam != null && returnParam.getIdentifier() != null) {
                    try {
                        SymbolTable.root.getItem(VariableDeclarationSymbolTableItem.START_KEY + returnParam.getIdentifier().getName(), true);
                        System.out.println("Error: Return parameter " + returnParam.getIdentifier().getName() + " conflicts with a global variable.");
                    } catch (ItemNotFoundException ignored) {
                        returnParam.accept(this);  // Process return parameter declaration
                    }
                }
            }
        }

        // Process the function's block scope (local variables and statements)
        if (functionDefinition.getScope() != null) {
            functionDefinition.getScope().accept(this);  // Process the function's scope
        }

        // Pop the function's symbol table after finishing the function's scope
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(FunctionDescriptor functionDescriptor) {
        // Visit the function name identifier
        if (functionDescriptor.getName() != null) {
            functionDescriptor.getName().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(ImportElement importElement) {
        // Visit the element identifier
        if (importElement.getElementId() != null) {
            importElement.getElementId().accept(this);
        }

        // Visit the alias identifier
        if (importElement.getAliasId() != null) {
            importElement.getAliasId().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(VariableDeclaration varDeclaration) {
        try {
            // Attempt to add the variable to the symbol table
            SymbolTable.top.put(new VariableDeclarationSymbolTableItem(varDeclaration));
        } catch (ItemAlreadyExistsException e) {
        }
        return null;
    }


    @Override
    public Void visit(ImportPath importPath) {
        return null;
    }

    @Override
    public Void visit(StorageLocation storageLocation) {
        return null;
    }

    @Override
    public Void visit(AddressType addressType) {
        return null;
    }

    @Override
    public Void visit(BoolType boolType) {
        return null;
    }

    @Override
    public Void visit(ByteLowerCaseType byteLowerCaseType) {
        return null;
    }

    @Override
    public Void visit(ByteUpperCaseType byteUpperCaseType) {
        return null;
    }

    @Override
    public Void visit(FixedType fixedType) {
        return null;
    }

    @Override
    public Void visit(IntType intType) {
        return null;
    }

    @Override
    public Void visit(StringType stringType) {
        return null;
    }

    @Override
    public Void visit(UfixedType ufixedType) {
        return null;
    }

    @Override
    public Void visit(UintType uintType) {
        return null;
    }

    @Override
    public Void visit(VarType varType) {
        return null;
    }

    @Override
    public Void visit(Mapping mapping) {
        // Visit the mapping key type
        if (mapping.getMappingKey() != null) {
            mapping.getMappingKey().accept(this);
        }

        // Visit the mapping key name identifier
        if (mapping.getMappingKeyName() != null) {
            mapping.getMappingKeyName().accept(this);
        }

        // Visit the mapping value type
        if (mapping.getMappingValue() != null) {
            mapping.getMappingValue().accept(this);
        }

        // Visit the mapping value name identifier
        if (mapping.getMappingValueName() != null) {
            mapping.getMappingValueName().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(UserDefinedTypeName userDefinedTypeName) {
        // Visit each identifier in the type chain
        for (Identifier identifier : userDefinedTypeName.getTypeChain()) {
            if (identifier != null) {
                identifier.accept(this);
            }
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(FunctionTypeParameterList functionTypeParameterList) {
        // Visit each FunctionTypeParameter in the list
        for (FunctionTypeParameter functionTypeParameter : functionTypeParameterList.getFunctionTypeParameters()) {
            if (functionTypeParameter != null) {
                functionTypeParameter.accept(this);
            }
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(FunctionTypeParameter functionTypeParameter) {
        // Visit the type of the function type parameter
        if (functionTypeParameter.getType() != null) {
            functionTypeParameter.getType().accept(this);
        }

        // Visit the storage location of the function type parameter
        if (functionTypeParameter.getStorageLocation() != null) {
            functionTypeParameter.getStorageLocation().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(FunctionTypeName functionTypeName) {
        // Visit the function type parameter list
        if (functionTypeName.getFunctionTypeParameterList() != null) {
            functionTypeName.getFunctionTypeParameterList().accept(this);
        }

        // Visit the function return type parameter list
        if (functionTypeName.getFunctionReturnTypeParameterList() != null) {
            functionTypeName.getFunctionReturnTypeParameterList().accept(this);
        }

        // Visit each function modifier
        for (Modifier modifier : functionTypeName.getFunctionModifiers()) {
            if (modifier != null) {
                modifier.accept(this);
            }
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(AddressPayable addressPayable) {
        return null;
    }

    @Override
    public Void visit(ListType listType) {
        // Visit the type of the list
        if (listType.getType() != null) {
            listType.getType().accept(this);
        }

        // Visit the size of the list, if it exists
        if (listType.getSize() != null) {
            listType.getSize().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(OtherPrimaryExpression otherPrimaryExpression) {
        return null;
    }

    @Override
    public Void visit(NumberLiteral numberLiteral) {
        return null;
    }

    @Override
    public Void visit(HexLiteral hexLiteral) {
        return null;
    }

    @Override
    public Void visit(StringLiteral stringLiteral) {
        return null;
    }

    @Override
    public Void visit(TupleExpression tupleExpression) {
        // Visit each expression in the tuple
        for (Expression expression : tupleExpression.getExpressions()) {
            if (expression != null) {
                expression.accept(this);
            }
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(NullExpression nullExpression) {
        return null;
    }

    @Override
    public Void visit(AccessExpression accessExpression) {
        // Visit the master expression
        if (accessExpression.getMaster() != null) {
            accessExpression.getMaster().accept(this);
        }

        // Visit the member identifier
        if (accessExpression.getMember() != null) {
            accessExpression.getMember().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(ObjectCreation objectCreation) {
        // Visit the type associated with the object creation
        if (objectCreation.getType() != null) {
            objectCreation.getType().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(NameValue nameValue) {
        // Visit the key identifier
        if (nameValue.getKey() != null) {
            nameValue.getKey().accept(this);
        }

        // Visit the value expression
        if (nameValue.getValue() != null) {
            nameValue.getValue().accept(this);
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(NameValueList nameValueList) {
        // Iterate through each NameValue in the list and visit it
        for (NameValue nameValue : nameValueList.getNameValues()) {
            if (nameValue != null) {
                nameValue.accept(this);
            }
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(ExpressionList expressionList) {
        // Iterate through each Expression in the list and visit it
        for (Expression expression : expressionList.getExpressionList()) {
            if (expression != null) {
                expression.accept(this);
            }
        }

        return null;  // Since the method return type is T and we need to return a value, we use null
    }

    @Override
    public Void visit(FunctionCallArguments functionCallArguments) {
        return null;
    }

    @Override
    public Void visit(FunctionCallExpression functionCallExpression) {
        // Visit the functionName
        if (functionCallExpression.getFunctionName() != null) {
            functionCallExpression.getFunctionName().accept(this);
        }

        // Visit the arguments (FunctionCallArguments)
        if (functionCallExpression.getArgs() != null) {
            functionCallExpression.getArgs().accept(this);
        }

        // Create a FunctionCallSymbolTableItem for the function call
        FunctionCallSymbolTableItem functionCallSymbolTableItem = new FunctionCallSymbolTableItem(
                functionCallExpression.getFunctionName(),
                functionCallExpression.getArgs(),
                SymbolTable.top.getItemsSize()
        );

        // Try to insert the function call into the current symbol table
        try {
            SymbolTable.top.put(functionCallSymbolTableItem);
        } catch (ItemAlreadyExistsException e) {
            // If the function call is already defined in the current scope, report an error
            System.out.println("Error: Function call to " + functionCallExpression.getFunctionName().toString() + " already declared in the current scope. in line " + functionCallExpression.getLine() + " .");
            return null;
        }

        return null;  // Since the method return type is Void
    }


    @Override
    public Void visit(StructInitializationExpression structInitializationExpression) {
        // Visit the name expression
        if (structInitializationExpression.getName() != null) {
            structInitializationExpression.getName().accept(this);
        }

        // Visit the name-value list
        if (structInitializationExpression.getNameValueList() != null) {
            structInitializationExpression.getNameValueList().accept(this);
        }

        return null;  // Return null as the specific implementation might need to handle different return types
    }

    @Override
    public Void visit(TernaryOperatorExpression ternaryOperatorExpression) {
        // Visit the condition expression
        if (ternaryOperatorExpression.getCondition() != null) {
            ternaryOperatorExpression.getCondition().accept(this);
        }

        // Visit the true result expression
        if (ternaryOperatorExpression.getTrueResult() != null) {
            ternaryOperatorExpression.getTrueResult().accept(this);
        }

        // Visit the false result expression
        if (ternaryOperatorExpression.getFalseResult() != null) {
            ternaryOperatorExpression.getFalseResult().accept(this);
        }

        return null;  // Return null as the specific implementation might need to handle different return types
    }

    @Override
    public Void visit(ParenthesizedExpression parenthesizedExpression) {
        // Visit the inner expression
        if (parenthesizedExpression.getExpression() != null) {
            return parenthesizedExpression.getExpression().accept(this);
        }

        return null;  // Return null as the specific implementation might need to handle different return types
    }

    @Override
    public Void visit(RequireExpression requireExpression) {
        // Visit the expression inside the RequireExpression
        if (requireExpression.getExpression() != null) {
            requireExpression.getExpression().accept(this);
        }

        // Visit the message inside the RequireExpression
        if (requireExpression.getMessage() != null) {
            requireExpression.getMessage().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(EnumValue enumValue) {
        // Visit the value (Identifier) inside the EnumValue
        if (enumValue.getValue() != null) {
            enumValue.getValue().accept(this);
        }

        return null;
    }


    @Override
    public Void visit(Parameter parameter) {
        // Step 1: Visit the type of the parameter, if it exists
        if (parameter.getType() != null) {
            parameter.getType().accept(this);
        }

        // Step 2: Visit the storage location of the parameter, if it exists
        if (parameter.getStorageLocation() != null) {
            parameter.getStorageLocation().accept(this);
        }

        // Step 3: Visit the identifier of the parameter, if it exists
        if (parameter.getIdentifier() != null) {
            parameter.getIdentifier().accept(this);

            // Step 4: Insert the parameter into the symbol table
            ParameterSymbolTableItem paramSymbolTableItem = new ParameterSymbolTableItem(
                    parameter.getIdentifier().getName(),
                    parameter.getType(),
                    parameter.getStorageLocation()
            );

            try {
                // Insert the parameter into the current symbol table
                SymbolTable.top.put(paramSymbolTableItem);
            } catch (ItemAlreadyExistsException e) {
                // If the parameter name is already declared, report an error
                System.out.println("Error: Parameter " + parameter.getIdentifier().getName() + " already declared.");
            }
        }

        return null;  // Since the method return type is Void
    }

    @Override
    public Void visit(ParameterList parameterList) {
        // Iterate over the parameters in the ParameterList
        for (Parameter parameter : parameterList.getParameters()) {
            if (parameter != null) {
                parameter.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(UsingForObjectDirective usingForObjectDirective) {
        // Visit the type inside the UsingForObjectDirective
        if (usingForObjectDirective.getType() != null) {
            usingForObjectDirective.getType().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(UsingForObject usingForObject) {
        // Visit the type inside the UsingForObject
        if (usingForObject.getType() != null) {
            usingForObject.getType().accept(this);
        }

        // Visit each UsingForObjectDirective
        for (UsingForObjectDirective directive : usingForObject.getObjectDirectives()) {
            if (directive != null) {
                directive.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(OtherModifers otherModifers) {
        return null;
    }

    @Override
    public Void visit(ModifierList modifierList) {
        // Iterate over the modifiers in the ModifierList
        for (Modifier modifier : modifierList.getModifiers()) {
            if (modifier != null) {
                modifier.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(ModifierInvocation modifierInvocation) {
        // Visit the name (Identifier) inside the ModifierInvocation
        if (modifierInvocation.getName() != null) {
            modifierInvocation.getName().accept(this);
        }

        // Visit the expressionList inside the ModifierInvocation if it exists
        if (modifierInvocation.getExpressionList() != null) {
            modifierInvocation.getExpressionList().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(OverrideSpecifier overrideSpecifier) {
        // Iterate over the types in the OverrideSpecifier
        for (UserDefinedTypeName type : overrideSpecifier.getTypes()) {
            if (type != null) {
                type.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(Block block) {
        ArrayList<Statement> cleanStatements = new ArrayList<>();
        for (Statement statement : block.getStatements()) {
            if (statement != null) {
                cleanStatements.add(statement);
                statement.accept(this);
            }
        }
        block.setStatements(cleanStatements);
        return null;
    }

    @Override
    public Void visit(IfStatement ifStatement) {
        // Visit the condition of the IfStatement
        if (ifStatement.getCondition() != null) {
            ifStatement.getCondition().accept(this);
        }

        // Visit the trueResult of the IfStatement
        if (ifStatement.getTrueResult() != null) {
            ifStatement.getTrueResult().accept(this);
        }

        // Visit the falseResult of the IfStatement if it exists
        if (ifStatement.getFalseResult() != null) {
            ifStatement.getFalseResult().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(WhileStatement whileStatement) {
        // Visit the condition of the WhileStatement
        if (whileStatement.getCondition() != null) {
            whileStatement.getCondition().accept(this);
        }

        // Visit the scope (Statement) of the WhileStatement
        if (whileStatement.getScope() != null) {
            whileStatement.getScope().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ForStatement forStatement) {
        // Visit the initial statement of the ForStatement
        if (forStatement.getInitial() != null) {
            forStatement.getInitial().accept(this);
        }

        // Visit the condition (ExpressionStatement) of the ForStatement
        if (forStatement.getCondition() != null) {
            forStatement.getCondition().accept(this);
        }

        // Visit the iteration (Expression) of the ForStatement
        if (forStatement.getIteration() != null) {
            forStatement.getIteration().accept(this);
        }

        // Visit the scope (Statement) of the ForStatement
        if (forStatement.getScope() != null) {
            forStatement.getScope().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(RevertStatement revertStatement) {
        // Visit the functionCall (FunctionCall) inside the RevertStatement
        if (revertStatement.getFunctionCall() != null) {
            revertStatement.getFunctionCall().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(IdentifierList identifierList) {
        // Iterate over the identifiers in the IdentifierList
        for (Identifier identifier : identifierList.getIdentifiers()) {
            if (identifier != null) {
                identifier.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(VariableDeclarationList variableDeclarationList) {
        // Iterate over the variableDeclarations in the VariableDeclarationList
        for (VariableDeclaration variableDeclaration : variableDeclarationList.getVariableDeclarations()) {
            if (variableDeclaration != null) {
                variableDeclaration.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(VariableDeclarationStatement variableDeclarationStatement) {
        // Visit the variableList (VariableList) in the VariableDeclarationStatement
        if (variableDeclarationStatement.getVariableList() != null) {
            variableDeclarationStatement.getVariableList().accept(this);
        }

        // Visit the initiateValue (Expression) in the VariableDeclarationStatement
        Expression initiateValue = null;
        if (variableDeclarationStatement.getInitiateValue() != null) {
            variableDeclarationStatement.getInitiateValue().accept(this);
            initiateValue = variableDeclarationStatement.getInitiateValue();
        }

        // After visiting, we search for the variable in the symbol table
        if (variableDeclarationStatement.getVariableList() instanceof VariableDeclaration) {
            VariableDeclaration variableDeclaration = (VariableDeclaration)variableDeclarationStatement.getVariableList();
            Expression value = initiateValue;  // Get the corresponding value for the variable

            if (variableDeclaration != null) {
                try {
                    // Search for the variable in the current scope's symbol table
                    SymbolTableItem variableSymbolItem = SymbolTable.top.getItem(VariableDeclarationSymbolTableItem.START_KEY + variableDeclaration.getVariableName().getName(), true);

                    // Assign the respective value from initiateValues to the variable
                    ((VariableDeclarationSymbolTableItem) variableSymbolItem).setInitiateValue(value);

                } catch (ItemNotFoundException e) {
                    System.out.println("Error: Variable " + variableDeclaration.getVariableName().getName() + " not found in the current scope.");
                }
            }
        }
        else if (variableDeclarationStatement.getVariableList() instanceof VariableDeclarationList) {
            VariableDeclarationList variableList = (VariableDeclarationList) variableDeclarationStatement.getVariableList();
            List<VariableDeclaration> variableDeclarations = variableList.getVariableDeclarations();

            // Ensure initiateValue is a tuple-like structure (e.g., a list of expressions)
            if (initiateValue instanceof TupleExpression) {
                List<Expression> initiateValues = ((TupleExpression) initiateValue).getExpressions();

                // Ensure the number of variables matches the number of values
                if (variableDeclarations.size() == initiateValues.size()) {
                    for (int i = 0; i < variableDeclarations.size(); i++) {
                        VariableDeclaration variableDeclaration = variableDeclarations.get(i);
                        Expression value = initiateValues.get(i);  // Get the corresponding value for the variable

                        if (variableDeclaration != null) {
                            try {
                                // Search for the variable in the current scope's symbol table
                                SymbolTableItem variableSymbolItem = SymbolTable.top.getItem(VariableDeclarationSymbolTableItem.START_KEY + variableDeclaration.getVariableName().getName(), true);

                                // Assign the respective value from initiateValues to the variable
                                ((VariableDeclarationSymbolTableItem) variableSymbolItem).setInitiateValue(value);

                            } catch (ItemNotFoundException e) {
                                System.out.println("Error: Variable " + variableDeclaration.getVariableName().getName() + " not found in the current scope.");
                            }
                        }
                    }
                } else {
                    System.out.println("Error: Mismatched number of variables and initiate values.");
                }
            }
        }
        else if (variableDeclarationStatement.getVariableList() instanceof IdentifierList) {
            IdentifierList identifierList = (IdentifierList) variableDeclarationStatement.getVariableList();
            List<Identifier> identifiers = identifierList.getIdentifiers();

            // Ensure initiateValue is a tuple-like structure (e.g., a list of expressions) or a single value
            if (initiateValue instanceof TupleExpression) {
                List<Expression> initiateValues = ((TupleExpression) initiateValue).getExpressions();

                // Ensure the number of identifiers matches the number of values
                if (identifiers.size() == initiateValues.size()) {
                    for (int i = 0; i < identifiers.size(); i++) {
                        Identifier identifier = identifiers.get(i);
                        Expression value = initiateValues.get(i);  // Get the corresponding value for the identifier

                        if (identifier != null) {
                            // Create a new symbol table item for the identifier with a variant type
                            VariantTypeVariableDeclarationSymbolTableItem newSymbolItem = new VariantTypeVariableDeclarationSymbolTableItem(identifier.getName());

                            // Set the initial value for this identifier
                            newSymbolItem.setInitiateValue(value);

                            try {
                                // Add the new identifier to the symbol table using put()
                                SymbolTable.top.put(newSymbolItem);
                            } catch (ItemAlreadyExistsException e) {
                                System.out.println("Error: Identifier " + identifier.getName() + " already exists in the current scope.");
                            }
                        }
                    }
                } else {
                    System.out.println("Error: Mismatched number of identifiers and initiate values.");
                }
            }
            // Handle the case where there is only a single value assigned to multiple identifiers
            else if (initiateValue != null) {
                if (identifiers.size() == 1) {
                    Identifier identifier = identifiers.get(0);

                    if (identifier != null) {
                        // Create a new symbol table item for the identifier with a variant type
                        VariantTypeVariableDeclarationSymbolTableItem newSymbolItem = new VariantTypeVariableDeclarationSymbolTableItem(identifier.getName());

                        // Set the initial value for this identifier
                        newSymbolItem.setInitiateValue(initiateValue);

                        try {
                            // Add the new identifier to the symbol table using put()
                            SymbolTable.top.put(newSymbolItem);
                        } catch (ItemAlreadyExistsException e) {
                            System.out.println("Error: Identifier " + identifier.getName() + " already exists in the current scope.");
                        }
                    }
                } else {
                    System.out.println("Error: Multiple identifiers but single initiate value provided.");
                }
            }
        }


        return null;
    }

    @Override
    public Void visit(ExpressionStatement expressionStatement) {
        // Visit the expression (Expression) inside the ExpressionStatement
        if (expressionStatement.getExpression() != null) {
            expressionStatement.getExpression().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(BreakStatement breakStatement) {
        return null;
    }

    @Override
    public Void visit(ContinueStatement continueStatement) {
        return null;
    }

    @Override
    public Void visit(ThrowStatement throwStatement) {
        return null;
    }

    @Override
    public Void visit(ReturnStatement returnStatement) {
        // Visit the value (Expression) inside the ReturnStatement
        if (returnStatement.getValue() != null) {
            returnStatement.getValue().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(DoWhileStatement doWhileStatement) {
        // Visit the scope (Statement) inside the DoWhileStatement
        if (doWhileStatement.getScope() != null) {
            doWhileStatement.getScope().accept(this);
        }

        // Visit the condition (Expression) inside the DoWhileStatement
        if (doWhileStatement.getCondition() != null) {
            doWhileStatement.getCondition().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(InheritanceSpecifier inheritanceSpecifier) {
        // Visit the type (Type) inside the InheritanceSpecifier
        if (inheritanceSpecifier.getType() != null) {
            inheritanceSpecifier.getType().accept(this);
        }

        // Visit the expressionList (ExpressionList) inside the InheritanceSpecifier
        if (inheritanceSpecifier.getExpressionList() != null) {
            inheritanceSpecifier.getExpressionList().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ModifierDefinition modifierDefinition) {
        // Visit the identifier (Identifier) inside the ModifierDefinition
        if (modifierDefinition.getIdentifier() != null) {
            modifierDefinition.getIdentifier().accept(this);
        }

        // Visit the parameterList (ParameterList) inside the ModifierDefinition
        if (modifierDefinition.getParameterList() != null) {
            modifierDefinition.getParameterList().accept(this);
        }

        // Visit the modifier (Modifier) inside the ModifierDefinition
        if (modifierDefinition.getModifier() != null) {
            modifierDefinition.getModifier().accept(this);
        }

        // Create a ModifierSymbolTableItem for the modifier
        ModifierSymbolTableItem modifierSymbolTableItem = new ModifierSymbolTableItem(
                modifierDefinition.getIdentifier().getName(),   // Get the modifier name
                modifierDefinition.getParameterList(),          // Parameter list of the modifier
                modifierDefinition.getScope()                   // Scope of the modifier
        );

        // Try to insert the modifier symbol into the current symbol table
        try {
            SymbolTable.top.put(modifierSymbolTableItem);
        } catch (ItemAlreadyExistsException e) {
            // If the modifier is already defined in the current scope, report an error
            System.out.println("Error: Modifier " + modifierDefinition.getIdentifier().getName() + " already declared in the current scope.");
            return null;
        }

        // Visit the scope (Block) inside the ModifierDefinition
        if (modifierDefinition.getScope() != null) {
            modifierDefinition.getScope().accept(this);
        }

        return null;
    }


    @Override
    public Void visit(StateVariableDeclaration stateVariableDeclaration) {
        // Visit the type (Type) inside the StateVariableDeclaration
        if (stateVariableDeclaration.getType() != null) {
            stateVariableDeclaration.getType().accept(this);
        }

        // Visit each modifier (Modifier) inside the StateVariableDeclaration
        for (Modifier modifier : stateVariableDeclaration.getModifiers()) {
            if (modifier != null) {
                modifier.accept(this);
            }
        }

        // Create a StateVariableSymbolTableItem for the state variable
        StateVariableSymbolTableItem stateVariableSymbolTableItem = new StateVariableSymbolTableItem(
                stateVariableDeclaration.getName().getName(),
                stateVariableDeclaration.getType(),
                stateVariableDeclaration.getValue()
        );

        // Try to insert the state variable symbol into the current symbol table
        try {
            SymbolTable.top.put(stateVariableSymbolTableItem);
        } catch (ItemAlreadyExistsException e) {
            // If the state variable is already defined in the current scope, report an error
            System.out.println("Error: State variable " + stateVariableDeclaration.getName().getName() + " already declared in the current scope.");
            return null;
        }

        // Visit the value (Expression) inside the StateVariableDeclaration
        if (stateVariableDeclaration.getValue() != null) {
            stateVariableDeclaration.getValue().accept(this);
        }

        return null;  // Since the method return type is Void
    }


    @Override
    public Void visit(OtherFunctionDescriptors otherFunctionDescriptors) {
        return null;
    }
}
