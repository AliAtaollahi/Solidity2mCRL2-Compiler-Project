function exampleFunction() {
    // 1. If Statement
    if (x > 10) {
        x = 0;
    } else {
        x = 5;
    }

    // 2. While Statement
    while (x < 100) {
        x += 10;
    }

    // 3. For Statement
    for (uint i = 0; i < 10; i++) {
        sum += i;
    }

    // 4. Do-While Statement
    do {
        x += 1;
    } while (x < 10);

    // 5. Continue Statement
    for (uint i = 0; i < 10; i++) {
        if (i % 2 == 0) {
            continue;
        }
        sum += i;
    }

    // 6. Break Statement
    for (uint i = 0; i < 10; i++) {
        if (i == 5) {
            break;
        }
        sum += i;
    }

    // 7. Return Statement
    uint returnValue = getValue();

    // 8. Throw Statement (deprecated, replaced by revert)
    // throw; // Deprecated in favor of revert

    // 9. Emit Statement
    emit Transfer(msg.sender, address(this), 100);

    // 10. Simple Statement with Variable Declaration
    uint y = 10;

    // 11. Simple Statement with Expression
    x += 5;

    // 12. Unchecked Statement
    unchecked {
        x += y;
    }

    // 13. Revert Statement
    if (x > 100) {
        revert("Error: x is greater than 100");
    }

    // 14. Inline Assembly Statement
    assembly {
        let result := add(1, 2)
    }

    // 16. Expression Statement
    x = x + 1;

    // 17. Parenthesized Expression
    bool isPositive = (x > 0);

    // 18. Array Indexing
    if (myArray.length > 0) {
        uint element = myArray[0];
    }

    // 20. Function Call Statement
    anotherFunction(1, 2, 3);
}