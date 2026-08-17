# Recursion Tree Method

---

## What is it?

The recursion tree method is a visual technique to calculate the time complexity of recursive algorithms by drawing out all recursive calls as a tree.

**Steps:**
1. Draw the recursion tree
2. Count work done at each level
3. Count number of levels
4. Multiply (or sum) to get total

---

## Example 1 — Fibonacci O(2ⁿ)

```java
int fib(int n) {
    if (n <= 1) return n;
    return fib(n-1) + fib(n-2);
}
```

Tree for n=5:
```
Level 0:                    fib(5)                    → 1 node
Level 1:          fib(4)          fib(3)              → 2 nodes
Level 2:      fib(3)  fib(2)  fib(2)  fib(1)         → 4 nodes
Level 3:    fib(2)fib(1)fib(1)fib(0)...              → 8 nodes
...

Nodes per level doubles → total ≈ 2⁰ + 2¹ + 2² + ... + 2ⁿ = 2ⁿ⁺¹ - 1
TC: O(2ⁿ)
```

---

## Example 2 — Merge Sort O(n log n)

```java
void mergeSort(int[] arr, int lo, int hi) {
    if (lo >= hi) return;
    int mid = (lo + hi) / 2;
    mergeSort(arr, lo, mid);
    mergeSort(arr, mid+1, hi);
    merge(arr, lo, mid, hi);   // O(n) per level
}
```

Tree for n=8:
```
Level 0:      [8 elements]          → merge cost: O(8)
Level 1:   [4]       [4]            → merge cost: O(4) + O(4) = O(8)
Level 2: [2] [2]   [2] [2]          → merge cost: O(2)×4 = O(8)
Level 3: [1][1][1][1][1][1][1][1]  → base case, O(1) each = O(8)

Number of levels: log₂(8) = 3
Cost per level: O(n) = O(8)
Total: O(n log n)
```

---

## Example 3 — Binary Search O(log n)

```java
int bs(int[] arr, int lo, int hi, int target) {
    if (lo > hi) return -1;
    int mid = (lo + hi) / 2;
    if (arr[mid] == target) return mid;
    if (arr[mid] < target) return bs(arr, mid+1, hi, target);
    return bs(arr, lo, mid-1, target);
}
```

Tree:
```
bs(n)                    → 1 call, O(1) work
  bs(n/2)                → 1 call, O(1) work
    bs(n/4)              → 1 call, O(1) work
      ...
        bs(1) → O(1)     → log n levels total

Total: O(1) × log n = O(log n)
TC: O(log n)   SC: O(log n) — call stack depth
```

---

## General Formula

For recurrence T(n) = a·T(n/b) + O(n^d):

```
Compare log_b(a) vs d:

log_b(a) < d  → O(n^d)          (work at root dominates)
log_b(a) = d  → O(n^d × log n)  (equal at all levels)
log_b(a) > d  → O(n^log_b(a))   (leaves dominate)
```

This is the **Master Theorem**.

Examples:
- Merge Sort: a=2, b=2, d=1 → log₂2=1=d → O(n log n) ✓
- Binary Search: a=1, b=2, d=0 → log₂1=0=d → O(log n) ✓
- Fibonacci: a=2, b≈1 → doesn't fit neatly → O(2ⁿ)