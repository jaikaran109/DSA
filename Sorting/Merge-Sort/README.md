# Merge Sort in Java

## 📌 Overview

**Merge Sort** is a popular sorting algorithm based on the **Divide and Conquer** technique.

The main idea is to:

1. Divide the array into two halves.
2. Recursively divide those halves until every part contains only one element.
3. Merge the smaller sorted parts back together.
4. During merging, compare elements from both halves and place them in the correct order.

Merge Sort guarantees a time complexity of **O(n log n)** in the best, average, and worst cases.

---

## 🧠 How Merge Sort Works

Suppose we have the following array:

```text
[38, 27, 43, 3, 9, 82, 10]
```

### Step 1: Divide the Array

The array is repeatedly divided into two halves.

```text
                [38, 27, 43, 3, 9, 82, 10]
                         /              \
                [38, 27, 43]        [3, 9, 82, 10]
                  /       \            /        \
             [38, 27]    [43]       [3, 9]    [82, 10]
              /   \                  /  \       /  \
            [38] [27]              [3] [9]   [82] [10]
```

The division continues until each subarray contains only one element.

A single element is already considered sorted.

---

## 🔄 Step 2: Merge the Sorted Parts

Now we start merging the individual elements.

```text
[38] + [27]
      ↓
[27, 38]

[82] + [10]
      ↓
[10, 82]

[3] + [9]
      ↓
[3, 9]
```

Then we continue merging:

```text
[27, 38] + [43]
        ↓
[27, 38, 43]

[3, 9] + [10, 82]
        ↓
[3, 9, 10, 82]
```

Finally:

```text
[27, 38, 43] + [3, 9, 10, 82]
                    ↓
       [3, 9, 10, 27, 38, 43, 82]
```

---

# 🧩 Divide and Conquer

Merge Sort follows three main steps.

### 1. Divide

Split the array into two halves.

```text
mid = (low + high) / 2
```

### 2. Conquer

Recursively sort both halves.

```java
mergeSort(arr, low, mid);
mergeSort(arr, mid + 1, high);
```

### 3. Combine

Merge the two sorted halves.

```java
merge(arr, low, mid, high);
```

---

# 💻 Java Implementation

```java
public class MergeSort {

    static void mergeSort(int[] arr, int low, int high) {

        // Base condition
        if (low >= high) {
            return;
        }

        // Find middle index
        int mid = (low + high) / 2;

        // Sort left half
        mergeSort(arr, low, mid);

        // Sort right half
        mergeSort(arr, mid + 1, high);

        // Merge both sorted halves
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {

        // Temporary array to store sorted elements
        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        // Compare elements from both halves
        while (i <= mid && j <= high) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements from right half
        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy sorted elements back into original array
        for (int x = 0; x < temp.length; x++) {
            arr[low + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

### Output

```text
Sorted Array:
3 9 10 27 38 43 82
```

---

# 🔍 Understanding `mergeSort()`

The recursive function is:

```java
static void mergeSort(int[] arr, int low, int high) {

    if (low >= high) {
        return;
    }

    int mid = (low + high) / 2;

    mergeSort(arr, low, mid);
    mergeSort(arr, mid + 1, high);

    merge(arr, low, mid, high);
}
```

### Base Condition

```java
if (low >= high) {
    return;
}
```

When `low == high`, there is only one element.

For example:

```text
[38]
```

There is nothing to sort, so recursion stops.

---

## Finding the Middle

```java
int mid = (low + high) / 2;
```

For example:

```text
low = 0
high = 6

mid = (0 + 6) / 2
    = 3
```

So the array is divided as:

```text
Left  → indices 0 to 3
Right → indices 4 to 6
```

---

# 🔀 Recursive Calls

```java
mergeSort(arr, low, mid);
mergeSort(arr, mid + 1, high);
```

The first call sorts the left half.

The second call sorts the right half.

Only after both halves are sorted do we call:

```java
merge(arr, low, mid, high);
```

This is extremely important.

> **We always merge only after the left and right halves are sorted.**

---

# 🛠️ Understanding the `merge()` Function

The merge function receives:

```java
merge(arr, low, mid, high);
```

This means:

```text
Left Half  → low ... mid
Right Half → mid + 1 ... high
```

For example:

```text
low = 0
mid = 2
high = 5
```

The array can be viewed as:

```text
[10, 20, 30 | 5, 15, 25]
 ↑           ↑
left        right
```

Both halves are already sorted.

---

## Temporary Array

```java
int[] temp = new int[high - low + 1];
```

We use a temporary array to store the sorted result.

For example:

```text
Left  = [10, 20, 30]
Right = [5, 15, 25]

temp = []
```

---

# 👀 Two Pointer Technique

We maintain two pointers:

```java
int i = low;
int j = mid + 1;
```

* `i` points to the first element of the left half.
* `j` points to the first element of the right half.

Example:

```text
Left:   [10, 20, 30]
         ↑
         i

Right:  [5, 15, 25]
         ↑
         j
```

We compare:

```text
10 vs 5
```

Since:

```text
5 < 10
```

we put `5` into `temp`.

```text
temp = [5]
```

Then move `j`.

---

## Complete Merge Example

Suppose:

```text
Left  = [10, 20, 30]
Right = [5, 15, 25]
```

Comparison process:

```text
10 vs 5   → 5
10 vs 15  → 10
20 vs 15  → 15
20 vs 25  → 20
30 vs 25  → 25
Remaining → 30
```

Final result:

```text
[5, 10, 15, 20, 25, 30]
```

---

# 🔁 Main Merge Loop

```java
while (i <= mid && j <= high) {

    if (arr[i] <= arr[j]) {
        temp[k] = arr[i];
        i++;
    } else {
        temp[k] = arr[j];
        j++;
    }

    k++;
}
```

The loop continues while both halves still contain elements.

The important comparison is:

```java
if (arr[i] <= arr[j])
```

The smaller element is added to `temp`.

---

# 📥 Remaining Elements

It is possible that one half becomes empty while the other still contains elements.

For example:

```text
Left  = [10, 20, 30]
Right = [5]
```

After comparing:

```text
5 < 10
```

we get:

```text
temp = [5]
```

Now the right half is empty.

The remaining left elements:

```text
[10, 20, 30]
```

are already sorted, so we simply copy them.

```java
while (i <= mid) {
    temp[k] = arr[i];
    i++;
    k++;
}
```

Similarly, if elements remain in the right half:

```java
while (j <= high) {
    temp[k] = arr[j];
    j++;
    k++;
}
```

---

# 🔙 Copying Back to the Original Array

After merging, the sorted elements are stored inside `temp`.

We need to copy them back into `arr`.

```java
for (int x = 0; x < temp.length; x++) {
    arr[low + x] = temp[x];
}
```

For example:

```text
temp = [5, 10, 15, 20, 25, 30]
```

After copying:

```text
arr = [5, 10, 15, 20, 25, 30]
```

---

# 🌳 Recursion Tree

For:

```text
[38, 27, 43, 3]
```

The recursion looks like:

```text
                 [38, 27, 43, 3]
                    /        \
              [38, 27]      [43, 3]
               /   \         /   \
             [38] [27]     [43] [3]
               \   /         \   /
              [27,38]       [3,43]
                    \        /
                 [3,27,38,43]
```

The important point is:

```text
Divide → Divide → Divide
                       ↓
                  Merge → Merge
                            ↓
                       Final Merge
```

---

# ⏱️ Time Complexity

Merge Sort has:

```text
Best Case    → O(n log n)
Average Case → O(n log n)
Worst Case   → O(n log n)
```

Unlike some sorting algorithms, Merge Sort maintains `O(n log n)` even in the worst case.

---

# 💾 Space Complexity

Merge Sort requires an additional temporary array:

```java
int[] temp = new int[high - low + 1];
```

Therefore:

```text
Auxiliary Space → O(n)
```

The recursion stack also requires:

```text
O(log n)
```

But the overall auxiliary space is dominated by the temporary array:

```text
O(n)
```

---

# ⭐ Properties of Merge Sort

| Property     | Merge Sort         |
| ------------ | ------------------ |
| Best Time    | O(n log n)         |
| Average Time | O(n log n)         |
| Worst Time   | O(n log n)         |
| Space        | O(n)               |
| Stable       | Yes                |
| In-place     | No                 |
| Technique    | Divide and Conquer |

---

# ✅ Advantages

* Guaranteed `O(n log n)` time complexity.
* Stable sorting algorithm.
* Works efficiently with large datasets.
* Predictable performance.
* Particularly useful for sorting linked lists.
* Useful for external sorting when data does not fit entirely into memory.

---

# ❌ Disadvantages

* Requires additional memory.
* Generally needs `O(n)` extra space for arrays.
* Recursive implementation adds function-call overhead.
* For small arrays, simpler algorithms such as Insertion Sort can sometimes be faster.

---

# 🧠 Key Points to Remember

When implementing Merge Sort in Java, remember these points:

### 1. Base condition

```java
if (low >= high) {
    return;
}
```

### 2. Find middle

```java
int mid = (low + high) / 2;
```

### 3. Sort left

```java
mergeSort(arr, low, mid);
```

### 4. Sort right

```java
mergeSort(arr, mid + 1, high);
```

### 5. Merge

```java
merge(arr, low, mid, high);
```

### 6. During merging

```text
Compare → Pick smaller → Move pointer
```

### 7. Copy remaining elements

After one half becomes empty, directly copy the remaining elements from the other half.

---

# 🎯 Dry Run

Consider:

```text
arr = [5, 2, 4, 1]
```

### Divide

```text
[5, 2, 4, 1]

       /       \
   [5, 2]     [4, 1]

    /  \       /  \
  [5] [2]    [4] [1]
```

### First Merge

```text
[5] + [2]
→ [2, 5]
```

```text
[4] + [1]
→ [1, 4]
```

### Final Merge

```text
[2, 5] + [1, 4]
```

Compare:

```text
2 vs 1 → 1
2 vs 4 → 2
5 vs 4 → 4
remaining → 5
```

Final:

```text
[1, 2, 4, 5]
```

---

# 📌 Important Interview Question

### Why is Merge Sort O(n log n)?

The array is divided into approximately half at every level.

Therefore, the number of levels is:

```text
log₂(n)
```

At every level, all `n` elements are processed during merging.

Therefore:

```text
n × log(n)
```

So:

```text
Time Complexity = O(n log n)
```

---

# 📚 Quick Revision

```text
Merge Sort
    ↓
Divide and Conquer
    ↓
Divide array into two halves
    ↓
Recursively sort both halves
    ↓
Merge sorted halves
    ↓
Final sorted array
```

### Complexity

```text
Time  → O(n log n)
Space → O(n)
```

### Core Formula

```java
mid = (low + high) / 2;

mergeSort(arr, low, mid);
mergeSort(arr, mid + 1, high);

merge(arr, low, mid, high);
```

---

## 🚀 Conclusion

Merge Sort is one of the most important **Divide and Conquer** algorithms to understand for DSA.

The easiest way to remember it is:

> **Divide the array recursively until single elements remain, then merge those elements back in sorted order.**

The recursion handles the **division**, while the `merge()` function handles the **sorting and combining**.

Once you understand the `low`, `mid`, `high` indices and the two-pointer logic inside `merge()`, the complete Merge Sort implementation becomes straightforward.
