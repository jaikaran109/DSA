# Recursion in Java

A guide to understanding and using recursion in Java.

## What is Recursion?

Recursion is a programming technique where a method calls itself in order to solve a problem. Instead of solving a large problem all at once, the method breaks it down into smaller, simpler instances of the same problem — until it reaches a case simple enough to solve directly.

## Key Components

Every recursive method needs two things:

1. **Base Case** — The condition under which the method stops calling itself and returns a value directly. Without this, the method will call itself forever, causing a `StackOverflowError`.
2. **Recursive Case** — The part where the method calls itself with a smaller or simpler version of the original problem, moving it closer to the base case.

## Basic Structure

```java
returnType recurse(parameters) {
    if (/* base case condition */) {
        return baseValue;
    }
    return recurse(smallerInput); // recursive case
}
```

## Example: Factorial

```java
public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {              // base case
            return 1;
        }
        return n * factorial(n - 1); // recursive case
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
    }
}
```

## Example: Fibonacci Sequence

```java
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        // 0 1 1 2 3 5 8 13 21 34
    }
}
```

## Example: Sum of an Array

```java
public class SumArray {
    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) {  // base case
            return 0;
        }
        return arr[index] + sumArray(arr, index + 1); // recursive case
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(sumArray(numbers, 0)); // 15
    }
}
```

## Example: Reversing a String

```java
public class ReverseString {
    public static String reverse(String str) {
        if (str.isEmpty()) {       // base case
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0); // recursive case
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello")); // olleh
    }
}
```

## How Recursion Works (Call Stack)

Each recursive call is pushed onto Java's **call stack** until the base case is reached, then the results are returned back up the stack:

```
factorial(3)
= 3 * factorial(2)
= 3 * (2 * factorial(1))
= 3 * (2 * (1 * factorial(0)))
= 3 * (2 * (1 * 1))
= 6
```

If recursion goes too deep without hitting a base case, Java throws a `StackOverflowError`:

```java
public static void infiniteRecursion() {
    infiniteRecursion(); // no base case — will crash
}
```

## Types of Recursion

- **Direct Recursion** — A method calls itself directly.
- **Indirect Recursion** — Method A calls Method B, which calls Method A.
- **Tail Recursion** — The recursive call is the last operation in the method. Note: unlike some languages, **Java does not optimize tail recursion**, so deep tail-recursive calls can still overflow the stack.
- **Tree Recursion** — A method makes more than one recursive call (e.g., Fibonacci above).

## Recursion vs. Iteration

| Aspect | Recursion | Iteration |
|---|---|---|
| Readability | Often cleaner for naturally recursive problems (trees, divide & conquer) | Often simpler for straightforward repetition |
| Memory | Uses call stack; more memory overhead | Generally more memory-efficient |
| Performance | Can be slower due to method call overhead | Usually faster |
| Use Case | Trees, graphs, backtracking, divide & conquer | Simple loops, counters |

## Common Use Cases

- Tree and graph traversal (DFS on binary trees, file systems)
- Divide-and-conquer algorithms (merge sort, quick sort, binary search)
- Backtracking (mazes, N-Queens, Sudoku solvers)
- Mathematical computations (factorial, Fibonacci, power, GCD)
- Parsing nested structures (JSON, expressions, directory trees)

## Example: Recursive Binary Search

```java
public class BinarySearch {
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // base case: not found
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return mid; // base case: found
        } else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, high);
        } else {
            return binarySearch(arr, target, low, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] sorted = {1, 3, 5, 7, 9, 11, 13};
        System.out.println(binarySearch(sorted, 7, 0, sorted.length - 1)); // 3
    }
}
```

## Tips & Pitfalls

- **Always define a base case** — every recursive call must move toward it.
- **Watch for `StackOverflowError`** — Java's default stack size is limited (~512KB–1MB depending on JVM settings); deep recursion can exceed it.
- **Consider memoization** — for problems like Fibonacci, caching results (e.g., with a `HashMap`) avoids redundant recalculation.
- **Java has no tail-call optimization** — very deep tail-recursive methods will still overflow the stack, unlike in languages such as Scala or Scheme.
- **Increase stack size if needed** — the `-Xss` JVM flag (e.g., `-Xss4m`) can increase the stack size for legitimately deep recursion.
- **When in doubt, trace it out** — draw the call stack on paper for tricky recursive logic.

## License

Free to use and modify for learning purposes.