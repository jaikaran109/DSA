# O(n log n) — Linearithmic Time

---

## What it means

Combines linear work with a logarithmic factor.
Think of it as: **do O(log n) work for each of n elements**.

```
n = 10    → ~33 operations
n = 100   → ~664 operations
n = 1000  → ~9,966 operations
```

Much better than O(n²) for large inputs.

---

## Why Sorting is O(n log n)

Most efficient comparison-based sorting algorithms split the array (log n levels deep) and do O(n) work at each level.

```
Merge Sort on [5, 2, 8, 1, 9, 3]:

Level 0 (1 piece):       [5, 2, 8, 1, 9, 3]
Level 1 (2 pieces):      [5, 2, 8]  [1, 9, 3]
Level 2 (4 pieces):      [5,2] [8] [1,9] [3]
Level 3 (6 pieces):      [5][2] [8] [1][9] [3]

Merge back up:
Level 3→2: [2,5] [8] [1,9] [3]
Level 2→1: [2,5,8] [1,3,9]
Level 1→0: [1,2,3,5,8,9]

log₂(6) ≈ 3 levels × n=6 merges per level = ~18 ops
```

---

## Examples

### Merge Sort

```java
void mergeSort(int[] arr, int lo, int hi) {
    if (lo >= hi) return;
    int mid = (lo + hi) / 2;

    mergeSort(arr, lo, mid);         // left half
    mergeSort(arr, mid + 1, hi);     // right half
    merge(arr, lo, mid, hi);         // merge: O(n) per level
}

void merge(int[] arr, int lo, int mid, int hi) {
    int[] temp = new int[hi - lo + 1];
    int i = lo, j = mid + 1, k = 0;

    while (i <= mid && j <= hi) {
        if (arr[i] <= arr[j]) temp[k++] = arr[i++];
        else temp[k++] = arr[j++];
    }
    while (i <= mid) temp[k++] = arr[i++];
    while (j <= hi)  temp[k++] = arr[j++];

    for (int x = 0; x < temp.length; x++) arr[lo + x] = temp[x];
}
// TC: O(n log n)   SC: O(n) — temp array
```

### Heap Sort

```java
void heapSort(int[] arr) {
    int n = arr.length;

    // Build max-heap: O(n)
    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(arr, n, i);

    // Extract max one by one: O(n log n)
    for (int i = n - 1; i > 0; i--) {
        swap(arr, 0, i);         // move current max to end
        heapify(arr, i, 0);      // O(log n) each time
    }
}
// TC: O(n log n)   SC: O(1)
```

### Using built-in sort (most common in interviews)

```java
int[] arr = {5, 2, 8, 1, 9};
Arrays.sort(arr);    // O(n log n) internally
// TC: O(n log n)   SC: O(log n) — sort's internal stack
```

### Finding kth largest (using sort)

```java
int findKthLargest(int[] nums, int k) {
    Arrays.sort(nums);              // O(n log n)
    return nums[nums.length - k];   // O(1)
}
// Total TC: O(n log n)   SC: O(log n)
```

---

## When you see O(n log n)

- Sorting the input (`Arrays.sort`, `Collections.sort`)
- Divide and conquer with O(n) merge step (merge sort)
- Building a heap and extracting all elements
- Problems where sort first, then O(n) pass is the solution

---

## O(n log n) vs O(n²) — The Gap Matters

| n | O(n log n) | O(n²) | Difference |
|---|---|---|---|
| 100 | ~664 | 10,000 | 15× faster |
| 1,000 | ~9,966 | 1,000,000 | 100× faster |
| 10,000 | ~132,877 | 100,000,000 | 750× faster |

---

## TC: O(n log n) | SC: O(n) for merge sort, O(1) for heap sort