# Best, Average, and Worst Case

---

## Overview

For any algorithm, complexity can vary depending on the input. We analyse three scenarios:

| Case | Symbol | Meaning |
|---|---|---|
| Best Case | Ω (Omega) | Most favourable input |
| Average Case | Θ (Theta) | Typical / random input |
| Worst Case | O (Big O) | Most unfavourable input |

---

## Example — Linear Search

```java
// Search for target in array
int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) return i;
    }
    return -1;
}
```

**Best Case → O(1)**
Target is at index 0. Found in the first comparison.
```
arr = [7, 2, 5, 9, 1],  target = 7
Found at index 0 → 1 operation
```

**Average Case → O(n/2) = O(n)**
Target is somewhere in the middle on average.
```
arr = [7, 2, 5, 9, 1],  target = 5
Found at index 2 → ~n/2 operations on average
```

**Worst Case → O(n)**
Target is at the last index or not present at all.
```
arr = [7, 2, 5, 9, 1],  target = 1 or target = 99
→ Must check all n elements
```

---

## Example — Binary Search

```java
int binarySearch(int[] arr, int target) {
    int lo = 0, hi = arr.length - 1;
    while (lo <= hi) {
        int mid = (lo + hi) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) lo = mid + 1;
        else hi = mid - 1;
    }
    return -1;
}
```

| Case | Complexity | Scenario |
|---|---|---|
| Best | O(1) | Target is the middle element |
| Average | O(log n) | Target found after log n divisions |
| Worst | O(log n) | Target not present, search exhausted |

---

## Example — Bubble Sort

```java
void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++)
        for (int j = 0; j < arr.length - 1 - i; j++)
            if (arr[j] > arr[j+1]) swap(arr, j, j+1);
}
```

| Case | Complexity | Scenario |
|---|---|---|
| Best | O(n) | Already sorted (with early-exit optimisation) |
| Average | O(n²) | Random order |
| Worst | O(n²) | Sorted in reverse order |

---

## Which Case Should You Report?

In interviews and practice, **always state the worst case** unless asked otherwise. Reasons:

1. Worst case guarantees an upper limit on performance
2. It's the most commonly expected answer
3. It helps in comparing algorithms fairly

```
"This solution runs in O(n log n) time and O(1) space."
→ This always means worst case.
```

---

## Summary Table

| Algorithm | Best | Average | Worst |
|---|---|---|---|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |
| Bubble Sort | O(n) | O(n²) | O(n²) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) |
| Quick Sort | O(n log n) | O(n log n) | O(n²) |
| Hash Map Lookup | O(1) | O(1) | O(n) |