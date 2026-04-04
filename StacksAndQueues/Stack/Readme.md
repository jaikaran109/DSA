# 📦 Stack in Java (Complete Guide)

## 🧠 Approach Summary

In this approach:

* A **Stack (`java.util.Stack`)** is used
* It follows **LIFO (Last In First Out)** principle
* Elements are added/removed only from the **top**
* It extends **Vector**, so it inherits many methods
* It is **synchronized (thread-safe)**

👉 This is easy to use but considered a **legacy class**

---

## 🏗️ Class Hierarchy

```
Object
   ↓
AbstractCollection
   ↓
AbstractList
   ↓
Vector
   ↓
Stack
```

---

## ⚙️ Features

* LIFO data structure
* Allows duplicate elements
* Allows null values
* Dynamic size (auto grows)
* Thread-safe (synchronized)
* Inherits Vector methods
* Part of legacy classes

---

## 🧱 Constructors

### 1. Default Constructor

```java
Stack<Integer> stack = new Stack<>();
```

👉 Creates an empty stack

---

## 🔑 Core Methods

### 1. push(E item)

* Adds element to top

```java
stack.push(10);
```

---

### 2. pop()

* Removes & returns top element

```java
stack.pop();
```

⚠️ Throws `EmptyStackException` if empty

---

### 3. peek()

* Returns top element without removing

```java
stack.peek();
```

⚠️ Throws `EmptyStackException` if empty

---

### 4. empty()

* Checks if stack is empty

```java
stack.empty();
```

---

### 5. search(Object o)

* Returns position from top (1-based)

```java
stack.search(20);
```

👉 Returns `-1` if not found

---

## 🔄 Vector Methods (Inherited)

Since Stack extends Vector:

* `add()`
* `get()`
* `remove()`
* `size()`
* `capacity()`
* `clear()`
* `contains()`
* `indexOf()`

👉 Example:

```java
stack.add(100);
System.out.println(stack.get(0));
```

---

## 💻 Example 1: Basic Operations

```java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);
        System.out.println("Top: " + stack.peek());
        System.out.println("Removed: " + stack.pop());
        System.out.println("After pop: " + stack);
    }
}
```

### ✅ Output

```
Stack: [10, 20, 30]
Top: 30
Removed: 30
After pop: [10, 20]
```

---

## 💻 Example 2: empty()

```java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.empty());
        stack.push(50);
        System.out.println(stack.empty());
    }
}
```

### ✅ Output

```
true
false
```

---

## 💻 Example 3: search()

```java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.search(20));
    }
}
```

### ✅ Output

```
2
```

---

## 💻 Example 4: Full Demonstration

```java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Initial Stack: " + stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("After Pop: " + stack);
        System.out.println("Search B: " + stack.search("B"));
        System.out.println("Is Empty: " + stack.empty());
    }
}
```

### ✅ Output

```
Initial Stack: [A, B, C]
Peek: C
Pop: C
After Pop: [A, B]
Search B: 1
Is Empty: false
```

---

## ⏱️ Time Complexity

* push → O(1)
* pop → O(1)
* peek → O(1)
* search → O(n)

---

## ⚖️ Advantages

* Simple implementation
* Built-in support
* Thread-safe
* Dynamic size

---

## ❌ Disadvantages

* Legacy class
* Slower due to synchronization
* Extends Vector (unnecessary overhead)

---

## 🔄 Stack vs ArrayDeque

| Feature     | Stack  | ArrayDeque |
| ----------- | ------ | ---------- |
| Performance | Slower | Faster     |
| Thread-safe | Yes    | No         |
| Recommended | ❌ No   | ✅ Yes      |

---

## 🚀 Modern Alternative

### Using ArrayDeque

```java
import java.util.*;

Deque<Integer> stack = new ArrayDeque<>();

stack.push(10);
stack.push(20);

System.out.println(stack.pop());
```

---

## 🎯 Use Cases

* Expression evaluation
* Parentheses matching
* Undo/Redo
* Recursion (call stack)
* DFS
* Backtracking

---

## 🔥 Important Interview Points

* Stack follows **LIFO**
* `pop()` & `peek()` throw exception if empty
* `search()` is 1-based from top
* Stack is **legacy**
* Prefer **ArrayDeque**

---

## 📌 Summary

* Stack = LIFO data structure
* Works on top element only
* Extends Vector
* Thread-safe but slower
* Use ArrayDeque in modern coding
