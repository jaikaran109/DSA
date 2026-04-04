Stack Class in Java (README)
🔹 Introduction

The Java Stack class is a part of the Java Collection Framework and represents a LIFO (Last In First Out) stack.

Last inserted element → first removed
Defined in java.util package
Extends Vector class
🔹 Key Features
Follows LIFO principle
Allows:
Duplicate elements
Null values
Dynamic size (auto grow/shrink)
Thread-safe (methods are synchronized)
Inherits methods from Vector
🔹 Hierarchy
Object
   ↓
Vector
   ↓
Stack
🔹 Declaration
Stack<Type> stack = new Stack<>();

Example:

Stack<Integer> stack = new Stack<>();
