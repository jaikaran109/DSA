# O(log n) — Logarithmic Time

---

## What it means

Every step **eliminates half the remaining input**. The number of steps needed is log₂(n).

```
n = 16   → 4 steps   (16 → 8 → 4 → 2 → 1)
n = 1024 → 10 steps
n = 10⁶  → ~20 steps
```

This is extremely efficient for large inputs.

---

## The Halving Pattern

Whenever input keeps halving, you get O(log n):

```java
// Classic halving loop
while (n > 1) {
    n = n / 2;
}
// n = 16: 16 → 8 → 4 → 2 → 1  (4 iterations = log₂16)
// TC: O(log n)
```

---

## Examples

### Binary Search

```java
int binarySearch(int[] arr, int target) {
    int lo = 0, hi = arr.length - 1;

    while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) lo = mid + 1;  // eliminate left half
        else hi = mid - 1;                          // eliminate right half
    }
    return -1;
}
// TC: O(log n)   SC: O(1)
```

Trace for arr = [1, 3, 5, 7, 9, 11, 13], target = 7:
```
Step 1: mid=3, arr[3]=7 → FOUND!   (just 1 step here, but worst case is log n)
```

Worst case trace for target = 13:
```
Step 1: lo=0, hi=6, mid=3, arr[3]=7 < 13  → lo = 4
Step 2: lo=4, hi=6, mid=5, arr[5]=11 < 13 → lo = 6
Step 3: lo=6, hi=6, mid=6, arr[6]=13 → FOUND
3 steps for n=7 (log₂7 ≈ 2.8)
```

### Power function

```java
// Fast power: a^n
double power(double a, int n) {
    if (n == 0) return 1;
    if (n % 2 == 0) {
        double half = power(a, n / 2);
        return half * half;       // halves the problem each call
    }
    return a * power(a, n - 1);
}
// TC: O(log n)   SC: O(log n) — recursion stack
```

### BST operations (balanced tree)

```java
// In a balanced BST, each step goes left or right — eliminating half
TreeNode search(TreeNode root, int val) {
    if (root == null || root.val == val) return root;
    if (val < root.val) return search(root.left, val);
    return search(root.right, val);
}
// TC: O(log n)   SC: O(log n) — recursion stack
```

---

## How to Recognise O(log n)

Ask: "Does the input size halve (or reduce by a fraction) at each step?"

- `i = i / 2` or `i = i * 2` in a loop → O(log n)
- Binary search pattern → O(log n)
- Balanced BST traversal → O(log n)
- `Math.log()` calculation of something → likely O(log n)

---

## TC: O(log n) | SC: O(1) for iterative, O(log n) for recursive