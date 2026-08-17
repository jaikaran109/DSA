# Sorting Algorithms — Time and Space Complexity

---

## Master Comparison Table

| Algorithm | Best | Average | Worst | Space | Stable? |
|---|---|---|---|---|---|
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) | Yes |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) | No |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) | Yes |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) | Yes |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) | No |
| Heap Sort | O(n log n) | O(n log n) | O(n log n) | O(1) | No |
| Counting Sort | O(n + k) | O(n + k) | O(n + k) | O(k) | Yes |
| Radix Sort | O(nk) | O(nk) | O(nk) | O(n + k) | Yes |
| Arrays.sort (Java) | — | O(n log n) | O(n log n) | O(log n) | Yes |

---

## Detailed Breakdown

### Bubble Sort — O(n²)

```java
void bubbleSort(int[] arr) {
    boolean swapped;
    for (int i = 0; i < arr.length - 1; i++) {
        swapped = false;
        for (int j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
                swapped = true;
            }
        }
        if (!swapped) break;   // already sorted → best case O(n)
    }
}
// TC: O(n²) worst/avg, O(n) best   SC: O(1)
```

### Insertion Sort — O(n²) but fast for nearly sorted

```java
void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];   // shift right
            j--;
        }
        arr[j + 1] = key;
    }
}
// TC: O(n²) worst, O(n) best (nearly sorted)   SC: O(1)
// Best use: small arrays or nearly sorted data
```

### Merge Sort — O(n log n) guaranteed

```java
void mergeSort(int[] arr, int lo, int hi) {
    if (lo >= hi) return;
    int mid = (lo + hi) / 2;
    mergeSort(arr, lo, mid);
    mergeSort(arr, mid + 1, hi);
    merge(arr, lo, mid, hi);
}
// TC: O(n log n) always   SC: O(n) — temp array
// Best use: when stability required, linked lists
```

### Quick Sort — O(n log n) avg, O(n²) worst

```java
void quickSort(int[] arr, int lo, int hi) {
    if (lo >= hi) return;
    int pivot = partition(arr, lo, hi);
    quickSort(arr, lo, pivot - 1);
    quickSort(arr, pivot + 1, hi);
}

int partition(int[] arr, int lo, int hi) {
    int pivot = arr[hi];
    int i = lo - 1;
    for (int j = lo; j < hi; j++) {
        if (arr[j] <= pivot) {
            i++;
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, hi);
    return i + 1;
}
// TC: O(n log n) avg, O(n²) worst (sorted input + bad pivot)
// SC: O(log n) avg (call stack)
// Best use: general purpose, in-practice fastest
```

### Counting Sort — O(n + k)

```java
void countingSort(int[] arr, int max) {
    int[] count = new int[max + 1];     // O(k) space
    for (int x : arr) count[x]++;
    int idx = 0;
    for (int i = 0; i <= max; i++) {
        while (count[i]-- > 0) arr[idx++] = i;
    }
}
// TC: O(n + k)   SC: O(k)   where k = range of values
// Best use: integers in small range (e.g. ages, scores 0-100)
```

---

## When to Use Which

```
Nearly sorted array     → Insertion Sort (O(n) best case)
Stability required      → Merge Sort
Memory limited          → Heap Sort (O(1) space)
General purpose         → Quick Sort (fastest in practice)
Small range integers    → Counting Sort
Interview default       → Arrays.sort() → O(n log n)
```

---

## Key Insight — Theoretical Lower Bound

Any comparison-based sorting algorithm requires at least **O(n log n)** comparisons in the worst case. This is a mathematical proof. You cannot do better than O(n log n) using only comparisons.

Counting Sort and Radix Sort beat this because they don't use comparisons — they use the values directly.