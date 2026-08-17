# Big O Notation

---

## What is Big O?

Big O Notation is a mathematical way to describe the **upper bound** of an algorithm's complexity. It tells us the **worst-case scenario** — how bad can it get?

```
O(f(n)) → algorithm takes at most f(n) steps for input of size n
```

---

## Why "upper bound"?

We care about worst case because:
- In interviews, worst case matters most
- It guarantees performance even in bad situations
- It lets us compare algorithms fairly

---

## The Rules of Big O

### Rule 1 — Drop Constants

```
O(2n)   → O(n)
O(500)  → O(1)
O(3n²)  → O(n²)
```

Constants don't matter because for large n, they become irrelevant.

### Rule 2 — Drop Lower Order Terms

```
O(n² + n)     → O(n²)
O(n + log n)  → O(n)
O(2ⁿ + n³)   → O(2ⁿ)
```

The dominant term wins. For large n, smaller terms are negligible.

### Rule 3 — Different inputs = Different variables

```java
// WRONG to say O(n²)
for (int i = 0; i < a.length; i++)       // loops over array A
    for (int j = 0; j < b.length; j++)   // loops over array B
        // work

// CORRECT → O(a × b) or O(n × m)
```

If loops iterate over different inputs, use different variable names.

### Rule 4 — Sequential steps ADD, Nested steps MULTIPLY

```java
// Sequential → O(n) + O(n) = O(2n) = O(n)
for (int i = 0; i < n; i++) { }
for (int j = 0; j < n; j++) { }

// Nested → O(n) × O(n) = O(n²)
for (int i = 0; i < n; i++)
    for (int j = 0; j < n; j++) { }
```

---

## Complexity Hierarchy (slowest to fastest growth)

```
O(1) < O(log n) < O(n) < O(n log n) < O(n²) < O(2ⁿ) < O(n!)
```

| Complexity | Name | n=10 | n=100 | n=1000 |
|---|---|---|---|---|
| O(1) | Constant | 1 | 1 | 1 |
| O(log n) | Logarithmic | 3 | 7 | 10 |
| O(n) | Linear | 10 | 100 | 1,000 |
| O(n log n) | Linearithmic | 33 | 664 | 9,966 |
| O(n²) | Quadratic | 100 | 10,000 | 1,000,000 |
| O(2ⁿ) | Exponential | 1,024 | 10³⁰ | 10³⁰¹ |
| O(n!) | Factorial | 3,628,800 | ∞ | ∞ |

---

## Big O vs Big Θ vs Big Ω

| Notation | Meaning | Use case |
|---|---|---|
| O (Big O) | Upper bound (worst case) | Most commonly used |
| Ω (Big Omega) | Lower bound (best case) | Rarely used in interviews |
| Θ (Big Theta) | Tight bound (average) | Academic analysis |

In interviews and practice, always default to **Big O**.

---

## Quick Reference

```
Constant    → hash map lookup, array access by index
Logarithmic → binary search, balanced BST operations
Linear      → single loop, linear search
Linearithmic→ merge sort, heap sort, Arrays.sort()
Quadratic   → nested loops, bubble sort, insertion sort
Exponential → recursion with 2 calls (Fibonacci naive)
Factorial   → generating all permutations
```