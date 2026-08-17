# O(n²) — Quadratic Time

---

## What it means

For every element, you do work proportional to n again.
Double the input → 4× the work.

```
n = 10   → 100 operations
n = 100  → 10,000 operations
n = 1000 → 1,000,000 operations
```

Acceptable for small n (≤ 1000). Avoid for large inputs.

---

## Examples

### Classic nested loops

```java
// Print all pairs
void printPairs(int[] arr) {
    for (int i = 0; i < arr.length; i++) {       // n times
        for (int j = 0; j < arr.length; j++) {   // n times each
            System.out.println(arr[i] + ", " + arr[j]);
        }
    }
}
// Total: n × n = n²
// TC: O(n²)   SC: O(1)
```

### Bubble Sort

```java
void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
// Passes: (n-1) + (n-2) + ... + 1 = n(n-1)/2 ≈ n²/2 = O(n²)
// TC: O(n²)   SC: O(1)
```

### Selection Sort

```java
void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        int minIdx = i;
        for (int j = i + 1; j < arr.length; j++) {   // find minimum in rest
            if (arr[j] < arr[minIdx]) minIdx = j;
        }
        swap(arr, i, minIdx);
    }
}
// TC: O(n²)   SC: O(1)
```

### Find all duplicate pairs

```java
List<int[]> findDuplicates(int[] arr) {
    List<int[]> result = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {   // compare each pair
            if (arr[i] == arr[j]) result.add(new int[]{i, j});
        }
    }
    return result;
}
// TC: O(n²)   SC: O(n²) worst case (all duplicates)
```

---

## O(n²) is NOT always bad

For small n (≤ 500), O(n²) algorithms are perfectly fine and often simpler to code.

```
n = 100:
O(n²)    = 10,000 ops  ✓ fast
O(n log n) = 664 ops   ✓ also fast

n = 100,000:
O(n²)      = 10,000,000,000 ops  ✗ too slow
O(n log n) = 1,660,964 ops       ✓ fast
```

---

## How to Recognise O(n²)

- Two nested loops both going up to n
- "Compare every element with every other element"
- Simple sorting algorithms (bubble, selection, insertion)
- Checking all pairs in an array

---

## TC: O(n²) | SC: O(1) for in-place sorts