# Selection Sort

## Definition

**Selection Sort** is a comparison-based sorting algorithm that repeatedly finds the **smallest element** from the unsorted part of the array and places it at its correct position.

---

## Example

### Code

```java
int[] arr = {64, 25, 12, 22, 11};

for(int i = 0; i < arr.length - 1; i++) {

    int minIndex = i;

    for(int j = i + 1; j < arr.length; j++) {
        if(arr[j] < arr[minIndex]) {
            minIndex = j;
        }
    }

    int temp = arr[i];
    arr[i] = arr[minIndex];
    arr[minIndex] = temp;
}
```

### Dry Run

Initial Array:

```text
[64, 25, 12, 22, 11]
```

**Pass 1:** Find minimum `11` → Swap with `64`

```text
[11, 25, 12, 22, 64]
```

**Pass 2:** Find minimum `12` → Swap with `25`

```text
[11, 12, 25, 22, 64]
```

**Pass 3:** Find minimum `22` → Swap with `25`

```text
[11, 12, 22, 25, 64]
```

**Pass 4:** Remaining elements are already sorted

```text
[11, 12, 22, 25, 64]
```

---

## Complexity

| Case | Complexity |
|------|------------|
| Best | O(n²) |
| Average | O(n²) |
| Worst | O(n²) |

**Space Complexity:** `O(1)`

---

## Key Points

- In-place sorting algorithm.
- Not stable.
- Performs maximum `n - 1` swaps.
- Suitable for small datasets.