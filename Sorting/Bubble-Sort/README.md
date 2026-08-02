# Bubble Sort

## 📌 Definition

Bubble Sort is a simple sorting algorithm used to arrange elements in an array in **ascending or descending order**.

It works by repeatedly comparing **two adjacent elements** and swapping them if they are in the wrong order.

After every pass, the **largest element moves to its correct position at the end of the array**.

---

## 💡 Working Principle

Example:

```
arr = [5, 3, 8, 4, 2]
```

Bubble Sort compares neighboring elements:

```
5 > 3  → Swap
5 < 8  → No Swap
8 > 4  → Swap
8 > 2  → Swap
```

After the first pass:

```
[3, 5, 4, 2, 8]
```

The largest element `8` reaches the last position.

This process continues until the complete array is sorted.

---

# Algorithm

1. Run a loop for `n-1` passes.
2. Compare adjacent elements in each pass.
3. If the left element is greater than the right element, swap them.
4. After every pass, the largest element gets fixed at the end.
5. Repeat until the array is sorted.

---

# Java Implementation

```java
import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
```

### Output

```
[2, 3, 4, 5, 8]
```

---

# Dry Run

Initial Array:

```
[5, 3, 8, 4, 2]
```

## Pass 1

### Compare 5 and 3

```
5 > 3 → Swap

[3, 5, 8, 4, 2]
```

### Compare 5 and 8

```
5 < 8 → No Swap

[3, 5, 8, 4, 2]
```

### Compare 8 and 4

```
8 > 4 → Swap

[3, 5, 4, 8, 2]
```

### Compare 8 and 2

```
8 > 2 → Swap

[3, 5, 4, 2, 8]
```

After Pass 1:

```
[3, 5, 4, 2, 8]
```

Largest element `8` is placed correctly.

---

## Pass 2

```
[3, 5, 4, 2, 8]
```

Comparisons:

```
5 > 4 → Swap

[3, 4, 5, 2, 8]


5 > 2 → Swap

[3, 4, 2, 5, 8]
```

---

## Pass 3

```
[3, 4, 2, 5, 8]
```

Comparison:

```
4 > 2 → Swap

[3, 2, 4, 5, 8]
```

---

## Pass 4

```
3 > 2 → Swap

[2, 3, 4, 5, 8]
```

Sorted Array:

```
[2, 3, 4, 5, 8]
```

---

# Complexity Analysis

| Case | Time Complexity |
|------|----------------|
| Best Case | O(n) |
| Average Case | O(n²) |
| Worst Case | O(n²) |

### Space Complexity

```
O(1)
```

Bubble Sort is an **in-place sorting algorithm** because it does not require extra memory.

---

# Optimized Bubble Sort

The normal Bubble Sort always runs all passes.

We can optimize it by checking whether any swap happened during a pass.

If no swapping occurs, the array is already sorted, so we stop early.

```java
static void bubbleSort(int[] arr) {

    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {

        boolean swapped = false;

        for (int j = 0; j < n - i - 1; j++) {

            if (arr[j] > arr[j + 1]) {

                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                swapped = true;
            }
        }

        if (!swapped)
            break;
    }
}
```

---

# Important Points

✅ Bubble Sort compares adjacent elements.  
✅ Largest element reaches the end after every pass.  
✅ It is easy to implement.  
✅ It uses constant extra space.  
✅ It is a stable sorting algorithm.  
❌ Not suitable for large datasets because of `O(n²)` complexity.

---

# When to Use Bubble Sort?

- When learning sorting algorithms.
- When the dataset is very small.
- When simplicity is more important than performance.

For large datasets, algorithms like **Merge Sort, Quick Sort, or Heap Sort** are preferred.