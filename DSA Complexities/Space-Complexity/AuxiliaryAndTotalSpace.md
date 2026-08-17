# Auxiliary Space vs Total Space

---

## Definitions

### Total Space
Everything the program uses:
- Input data
- Extra variables and data structures
- Recursion stack

### Auxiliary Space
Only the **extra space** used by the algorithm, NOT counting the input.

> In most interviews and problems, "Space Complexity" refers to **Auxiliary Space**.

---

## Why the Distinction Matters

```java
// Sort an array
void sort(int[] arr) {
    Arrays.sort(arr);   // modifies in place
}
```

- Total Space: O(n) — the input array itself
- Auxiliary Space: O(log n) — Java's sort uses a stack internally

When we say "sort is O(1) space" we mean **auxiliary** space (ignoring the input).

---

## Examples

### Example 1 — O(1) Auxiliary Space

```java
int sum(int[] arr) {
    int total = 0;           // 1 variable
    for (int x : arr) {
        total += x;
    }
    return total;
}
// Input: O(n) — the array
// Auxiliary: O(1) — just one variable 'total'
// We report: O(1) space
```

### Example 2 — O(n) Auxiliary Space

```java
int[] doubleArray(int[] arr) {
    int[] result = new int[arr.length];   // new array of size n
    for (int i = 0; i < arr.length; i++) {
        result[i] = arr[i] * 2;
    }
    return result;
}
// Input: O(n)
// Auxiliary: O(n) — the result array
// We report: O(n) space
```

### Example 3 — Merge Sort

```java
void mergeSort(int[] arr, int lo, int hi) {
    if (lo >= hi) return;
    int mid = (lo + hi) / 2;
    mergeSort(arr, lo, mid);
    mergeSort(arr, mid + 1, hi);
    merge(arr, lo, mid, hi);   // needs a temp array of size n
}
// Input: O(n)
// Auxiliary: O(n) for temp array + O(log n) for call stack
// Dominant: O(n)
// We report: O(n) space
```

---

## Quick Reference

| Algorithm | Auxiliary Space | Reason |
|---|---|---|
| Linear Search | O(1) | No extra structure |
| Binary Search (iterative) | O(1) | Just lo, hi, mid |
| Binary Search (recursive) | O(log n) | Call stack depth |
| Merge Sort | O(n) | Temp array for merging |
| Heap Sort | O(1) | In-place |
| Quick Sort | O(log n) avg | Call stack |
| DFS on graph | O(V) | Visited set + stack |
| BFS on graph | O(V) | Queue |

---

## Key Rule

When reporting Space Complexity:
- Default = Auxiliary Space (extra space only)
- Say "O(1) auxiliary space" to be precise
- Always exclude the input size unless asked otherwise