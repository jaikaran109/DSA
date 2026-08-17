# O(2ⁿ) — Exponential Time

---

## What it means

Every additional element **doubles** the number of operations.

```
n = 10  →       1,024 operations
n = 20  →   1,048,576 operations
n = 30  → 1,073,741,824 operations
n = 50  → 10^15 operations (practically impossible)
```

Acceptable only for very small n (≤ 20-25). Usually needs optimisation with DP.

---

## Why Two Recursive Calls → O(2ⁿ)

```java
int fibonacci(int n) {
    if (n <= 1) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);   // 2 calls each time
}
```

Recursion tree for n = 5:
```
                    fib(5)
                 /          \
            fib(4)          fib(3)
           /      \         /    \
       fib(3)  fib(2)   fib(2)  fib(1)
       /   \   /   \    /   \
   fib(2) fib(1) ...  ...   ...

Total nodes ≈ 2⁵ = 32
```

Each level doubles the number of calls.
- Level 0: 1 call
- Level 1: 2 calls
- Level 2: 4 calls
- Level k: 2^k calls

Total calls ≈ 2^n.

**TC: O(2ⁿ)   SC: O(n) — maximum depth of call stack**

---

## Example — Subsets (Power Set)

```java
// Generate all subsets of an array
void subsets(int[] arr, int idx, List<Integer> current, List<List<Integer>> result) {
    result.add(new ArrayList<>(current));   // add current subset

    for (int i = idx; i < arr.length; i++) {
        current.add(arr[i]);
        subsets(arr, i + 1, current, result);   // include arr[i]
        current.remove(current.size() - 1);     // exclude arr[i]
    }
}
// For n elements, there are 2ⁿ possible subsets
// TC: O(2ⁿ)   SC: O(n) — recursion depth
```

For arr = [1, 2, 3]:
```
Subsets: [], [1], [2], [3], [1,2], [1,3], [2,3], [1,2,3]
Total: 2³ = 8 subsets
```

---

## Example — Naive Fibonacci (with repeated work)

```java
// Shows why O(2ⁿ) is wasteful — same values computed many times
int fib(int n) {
    if (n <= 1) return n;
    return fib(n - 1) + fib(n - 2);
}

// fib(5) computes fib(3) twice, fib(2) three times, fib(1) five times...
```

**Fix with Memoisation → O(n)**
```java
int[] memo = new int[n + 1];
Arrays.fill(memo, -1);

int fib(int n, int[] memo) {
    if (n <= 1) return n;
    if (memo[n] != -1) return memo[n];
    memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
    return memo[n];
}
// TC: O(n)   SC: O(n)
```

---

## How to Recognise O(2ⁿ)

- Two recursive calls per function call
- "Generate all subsets / combinations"
- "Try including or excluding each element"
- Backtracking where each item has two choices (include/exclude)

---

## O(2ⁿ) vs Optimised with DP

| Approach | TC | SC | Notes |
|---|---|---|---|
| Naive recursion | O(2ⁿ) | O(n) | Recomputes subproblems |
| Memoisation (top-down DP) | O(n) | O(n) | Cache results |
| Tabulation (bottom-up DP) | O(n) | O(n) | Iterative, best |

When you see O(2ⁿ) in a problem, ask: "Are subproblems being repeated?" If yes, DP can reduce it.

---

## TC: O(2ⁿ) | SC: O(n) — recursion stack depth