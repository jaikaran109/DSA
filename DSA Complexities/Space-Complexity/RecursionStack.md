# Recursion Stack Space

---

## How Recursion Uses Memory

Every recursive call adds a **frame** to the call stack. Each frame holds:
- Function parameters
- Local variables
- Return address

The stack holds all active frames simultaneously.
**Maximum stack depth = Space Complexity.**

---

## Rule

```
Space = maximum number of frames on stack at any one time
      = depth of the recursion tree (not total nodes)
```

---

## Example 1 — Linear Recursion: O(n) space

```java
void countdown(int n) {
    if (n == 0) return;
    System.out.println(n);
    countdown(n - 1);           // one call, reduces by 1
}
```

Call stack at deepest point (n=5):
```
countdown(5)   ← bottom of stack
  countdown(4)
    countdown(3)
      countdown(2)
        countdown(1)
          countdown(0)   ← top of stack (base case)
```

Maximum depth = n → **SC: O(n)**

---

## Example 2 — Halving Recursion: O(log n) space

```java
int binarySearch(int[] arr, int lo, int hi, int target) {
    if (lo > hi) return -1;
    int mid = (lo + hi) / 2;
    if (arr[mid] == target) return mid;
    if (arr[mid] < target) return binarySearch(arr, mid + 1, hi, target);
    return binarySearch(arr, lo, mid - 1, target);
}
```

Each call halves the search space → maximum depth = log n

**SC: O(log n)**

---

## Example 3 — Two Branch Recursion: O(n) space (NOT O(2ⁿ))

```java
int fibonacci(int n) {
    if (n <= 1) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```

Even though TC is O(2ⁿ), SC is only O(n):

```
At any moment, the stack only holds ONE branch path

fib(5) calls fib(4)
  fib(4) calls fib(3)
    fib(3) calls fib(2)
      fib(2) calls fib(1) → returns
    fib(2) calls fib(0) → returns     ← left branch done
  ...fib(3) finishes, THEN fib(4) calls fib(2)...
```

Only depth n frames exist at once → **SC: O(n)**

---

## Example 4 — Tail Recursion (can be O(1) with optimisation)

```java
// Regular recursion — O(n) stack
int factorial(int n) {
    if (n == 0) return 1;
    return n * factorial(n - 1);   // multiplication waits for return
}

// Tail recursive — O(1) with TCO (Tail Call Optimisation)
int factorial(int n, int acc) {
    if (n == 0) return acc;
    return factorial(n - 1, n * acc);   // nothing to do after call returns
}
// Note: Java does NOT do TCO — still O(n) in Java
// TCO works in: Scala, Kotlin (with tailrec), functional languages
```

---

## Summary

| Recursion Pattern | TC | SC |
|---|---|---|
| `f(n) { f(n-1) }` | O(n) | O(n) |
| `f(n) { f(n/2) }` | O(log n) | O(log n) |
| `f(n) { f(n-1); f(n-1) }` | O(2ⁿ) | O(n) |
| `f(n) { f(n-1); f(n-2) }` | O(2ⁿ) | O(n) |
| Merge sort | O(n log n) | O(n) |

**Key insight:** SC depends on the **maximum depth**, not the total number of calls.