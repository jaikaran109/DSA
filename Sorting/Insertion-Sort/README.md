# Insertion Sort

## Definition

Insertion Sort is a simple sorting algorithm that builds the sorted array one element at a time.

It picks an element from the unsorted part and inserts it into its correct position in the sorted part.

---

## Example + Dry Run

Sort the given array:

```text
[5, 2, 4, 6, 1, 3]
```

### Initial Array

```text
[5, 2, 4, 6, 1, 3]
```

### Pass 1: Insert 2

Take `2` as the key and compare it with elements on the left.

```
2 < 5 → Shift 5 to the right

[2, 5, 4, 6, 1, 3]
```

---

### Pass 2: Insert 4

Compare `4` with the sorted part.

```
4 < 5 → Shift 5 to the right

[2, 4, 5, 6, 1, 3]
```

---

### Pass 3: Insert 6

```
6 is already greater than 5.

[2, 4, 5, 6, 1, 3]
```

---

### Pass 4: Insert 1

```
1 is smaller than all sorted elements.

Shift elements and insert 1.

[1, 2, 4, 5, 6, 3]
```

---

### Pass 5: Insert 3

```
3 is placed between 2 and 4.

[1, 2, 3, 4, 5, 6]
```

---

## Final Sorted Array

```text
[1, 2, 3, 4, 5, 6]
```

---

# Java Implementation

```java
import java.util.*;

public class InsertionSort {

    static void insertionSort(int[] arr) {

        // Start from second element
        for (int i = 1; i < arr.length; i++) {

            int key = arr[i]; // Element to be inserted
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 4, 6, 1, 3};

        insertionSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
```

---

## Output

```text
Sorted Array: [1, 2, 3, 4, 5, 6]
```

---

## Complexity

| Case | Time Complexity |
|------|-----------------|
| Best Case | O(n) |
| Average Case | O(n²) |
| Worst Case | O(n²) |

**Space Complexity:** O(1)

---

## Properties

- Stable Sorting Algorithm
- In-place Sorting Algorithm
- Efficient for small and nearly sorted arrays