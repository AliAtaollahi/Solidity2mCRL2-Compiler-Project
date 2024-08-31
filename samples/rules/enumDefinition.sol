// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

// Simple Enumeration
    enum Status {
        Pending,
        Active,
        Inactive
    }

// Enumeration with a Single Value
    enum Direction {
        North
    }

// Enumeration with a Placeholder Value (to avoid an empty enum)
    enum EmptyEnum {
        Placeholder
    }

// Enumeration without Extra Comma
    enum TrafficLight {
        Red,
        Yellow,
        Green
    }

// Enumeration with Mixed Cases in Identifiers
    enum ComplexEnum {
        FirstValue,
        SECOND_VALUE,
        third_value
    }
