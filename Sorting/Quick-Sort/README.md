# Quick Sort in Java

## 📌 Overview

**Quick Sort** is an efficient sorting algorithm based on the **Divide and Conquer** approach.

The main idea behind Quick Sort is simple:

1. Choose an element as a **Pivot**.
2. Rearrange the array so that:

   * Elements smaller than or equal to the pivot are placed on the left.
   * Elements greater than the pivot are placed on the right.
3. The pivot reaches its correct sorted position.
4. Recursively apply the same process to the left and right parts.

Unlike Merge Sort, Quick Sort does **not** require a separate merge operation.

> **Quick Sort = Choose Pivot → Partition → Recursively Sort Left and Right**

---

# 🧠 How Quick Sort Works

Consider the following array:

```text
[6, 3, 8, 5, 2, 7, 4, 1]
```

Suppose we choose the first element as the pivot:

```text
Pivot = 6
```

After partitioning, the array is rearranged so that:

```text
Smaller Elements     Pivot     Greater Elements

[3, 5, 2, 4, 1]       6        [8, 7]
```

The pivot is now in its correct position.

The array conceptually becomes:

```text
[3, 5, 2, 4, 1, 6, 8, 7]
                 ↑
               Pivot
```

Now we recursively sort:

```text
Left Part  → [3, 5, 2, 4, 1]

Right Part → [8, 7]
```

Eventually, the complete array becomes:

```text
[1, 2, 3, 4, 5, 6, 7, 8]
```

---

# ⚡ Quick Sort vs Merge Sort

Both algorithms use the **Divide and Conquer** technique, but they work differently.

## Merge Sort

```text
Divide
  ↓
Recursively Sort Left
  ↓
Recursively Sort Right
  ↓
Merge Both Sorted Parts
```

Structure:

```java
mergeSort(left);
mergeSort(right);
merge();
```

---

## Quick Sort

```text
Choose Pivot
  ↓
Partition Array
  ↓
Pivot Reaches Correct Position
  ↓
Recursively Sort Left
  ↓
Recursively Sort Right
```

Structure:

```java
pivotIndex = partition();

quickSort(left);
quickSort(right);
```

### The Main Difference

> **Merge Sort divides the array first and merges later.**

> **Quick Sort partitions the array around a pivot and then recursively sorts both parts.**

Quick Sort does not have a separate `merge()` function.

---

# 🧩 Divide and Conquer Approach

Quick Sort follows the Divide and Conquer strategy.

## 1. Divide

Choose a pivot and partition the array around it.

```text
[6, 3, 8, 5, 2, 7, 4, 1]

Pivot = 6

        ↓

[Smaller Elements]  6  [Greater Elements]
```

---

## 2. Conquer

Recursively apply Quick Sort to both sides of the pivot.

```java
quickSort(arr, low, pivotIndex - 1);

quickSort(arr, pivotIndex + 1, high);
```

---

## 3. Combine

There is no explicit combine or merge operation.

The array gets sorted automatically as pivots reach their correct positions.

---

# 💻 Basic Java Structure

The basic Quick Sort implementation looks like this:

```java
public class QuickSort {

    static void quickSort(int[] arr, int low, int high) {

        // Base condition
        if (low >= high) {
            return;
        }

        // Find the correct position of the pivot
        int pivotIndex = partition(arr, low, high);

        // Sort the left side of the pivot
        quickSort(arr, low, pivotIndex - 1);

        // Sort the right side of the pivot
        quickSort(arr, pivotIndex + 1, high);
    }
}
```

The most important part of Quick Sort is:

```java
partition(arr, low, high);
```

---

# 🔥 Understanding the Pivot

A **pivot** is the element used to divide the array into two parts.

For example:

```text
[6, 3, 8, 5, 2, 7, 4, 1]
 ↑
Pivot = 6
```

After partitioning:

```text
Elements ≤ Pivot | Pivot | Elements > Pivot

[3, 5, 2, 4, 1] | 6 | [8, 7]
```

The goal of the partition operation is to place the pivot in such a position that:

```text
All elements on the left  ≤ Pivot
All elements on the right > Pivot
```

Once this happens:

> The pivot is already in its final sorted position.

---

# 🔀 Partitioning

Partitioning is the heart of Quick Sort.

Suppose:

```text
arr = [6, 3, 8, 5, 2, 7, 4, 1]
```

Choose:

```text
Pivot = 6
```

After partitioning:

```text
[3, 5, 2, 4, 1, 6, 8, 7]
                 ↑
             Pivot Index
```

Now the pivot `6` does not need to move again.

We only need to sort:

```text
Left  → [3, 5, 2, 4, 1]

Right → [8, 7]
```

This is where recursion comes into action.

---

# 🌳 Quick Sort Recursion

Consider:

```text
[6, 3, 8, 5, 2, 7, 4, 1]
```

After placing `6` in its correct position:

```text
               [6, 3, 8, 5, 2, 7, 4, 1]
                           │
                    Pivot = 6
                           │
                          / \
                         /   \
                        ▼     ▼
              [3,5,2,4,1]   [8,7]
```

Then Quick Sort recursively processes both parts.

Conceptually:

```text
                    [6]
                   /   \
                  /     \
         [3,5,2,4,1]   [8,7]
               / \       / \
              ... ...   ... ...
```

The recursion continues until the subarray contains:

```text
One element
```

or:

```text
No elements
```

At that point, the recursion stops.

---

# 🛑 Base Condition

The base condition is:

```java
if (low >= high) {
    return;
}
```

Why?

Because:

```text
low == high
```

means there is only one element.

For example:

```text
[5]
```

A single element is already sorted.

Also:

```text
low > high
```

means there are no elements to sort.

Therefore, in both cases:

```java
return;
```

---

# 🔁 Recursive Calls

After the pivot reaches its correct position:

```java
int pivotIndex = partition(arr, low, high);
```

we recursively sort both sides.

### Sort Left Side

```java
quickSort(arr, low, pivotIndex - 1);
```

### Sort Right Side

```java
quickSort(arr, pivotIndex + 1, high);
```

The pivot itself is excluded because it is already in its correct position.

```text
[ Left Side | Pivot | Right Side ]

            ↑
     Already Sorted
```

---

# 📊 Example

Consider:

```text
[4, 2, 7, 3, 1]
```

Suppose:

```text
Pivot = 4
```

After partitioning:

```text
[2, 3, 1, 4, 7]
          ↑
        Pivot
```

Now:

```text
Left Side  → [2, 3, 1]

Right Side → [7]
```

Quick Sort is called recursively.

### Left Side

```text
[2, 3, 1]
```

After partitioning:

```text
[1, 2, 3]
```

Eventually, the complete array becomes:

```text
[1, 2, 3, 4, 7]
```

---

# 🧠 Quick Sort Flow

The complete process can be remembered as:

```text
quickSort(arr, low, high)
            │
            ▼
     Check Base Condition
            │
            ▼
        Choose Pivot
            │
            ▼
      Partition Array
            │
            ▼
 Pivot Reaches Correct Position
            │
           / \
          ▼   ▼
   Sort Left   Sort Right
```

---

# ⏱️ Time Complexity

The performance of Quick Sort depends heavily on how the pivot divides the array.

| Case         | Time Complexity |
| ------------ | --------------- |
| Best Case    | O(n log n)      |
| Average Case | O(n log n)      |
| Worst Case   | O(n²)           |

---

## 🌟 Best Case

The best case happens when the pivot divides the array into approximately equal halves.

```text
        n
       / \
      n/2 n/2
     / \   / \
```

The recursion depth becomes:

```text
O(log n)
```

At every level, partitioning processes:

```text
O(n)
```

Therefore:

```text
O(n) × O(log n)
```

Final complexity:

```text
O(n log n)
```

---

## 📈 Average Case

On average, the pivot divides the array reasonably well.

Therefore, the average time complexity is:

```text
O(n log n)
```

---

## ⚠️ Worst Case

The worst case happens when the pivot repeatedly creates highly unbalanced partitions.

For example:

```text
[1, 2, 3, 4, 5]
```

If we always choose the first or last element as the pivot:

```text
[1] [2,3,4,5]
```

Then:

```text
[2] [3,4,5]
```

Then:

```text
[3] [4,5]
```

The recursion becomes:

```text
n
↓
n - 1
↓
n - 2
↓
...
```

Therefore:

```text
O(n²)
```

---

# 💾 Space Complexity

Quick Sort uses recursion.

### Best / Average Case

```text
O(log n)
```

because the recursion tree is approximately balanced.

### Worst Case

```text
O(n)
```

because the recursion tree becomes completely unbalanced.

Unlike Merge Sort, Quick Sort can be implemented without requiring an additional array of size `n`.

Therefore, Quick Sort is generally considered an **in-place sorting algorithm**.

---

# ⭐ Properties of Quick Sort

| Property           | Quick Sort         |
| ------------------ | ------------------ |
| Best Time          | O(n log n)         |
| Average Time       | O(n log n)         |
| Worst Time         | O(n²)              |
| Best/Average Space | O(log n)           |
| Worst Space        | O(n)               |
| Stable             | No                 |
| In-place           | Yes                |
| Technique          | Divide and Conquer |

---

# ✅ Advantages

* Very efficient on average.
* Average time complexity is `O(n log n)`.
* Can be implemented in-place.
* Requires less additional memory than Merge Sort.
* Often performs very well in practice.
* Uses the Divide and Conquer approach.

---

# ❌ Disadvantages

* Worst-case time complexity is `O(n²)`.
* Performance depends on pivot selection.
* Not a stable sorting algorithm in its standard implementation.
* Recursive calls can cause a deep recursion stack in the worst case.

---

# 🎯 Choosing the Pivot

The pivot can be selected in different ways.

## 1. First Element

```java
int pivot = arr[low];
```

## 2. Last Element

```java
int pivot = arr[high];
```

## 3. Middle Element

```java
int pivot = arr[(low + high) / 2];
```

## 4. Random Element

Choose a random index between:

```text
low and high
```

## 5. Median of Three

Choose the median among:

```text
First Element
Middle Element
Last Element
```

Better pivot selection can reduce the chances of reaching the `O(n²)` worst case.

---

# 🔑 Key Points to Remember

### 1. Quick Sort uses Divide and Conquer

```text
Pivot
  ↓
Partition
  ↓
Recursive Calls
```

### 2. The Pivot Reaches Its Correct Position

After partitioning:

```text
Left Side ≤ Pivot < Right Side
```

The exact comparison may vary depending on the partition implementation, but the pivot separates the two sides according to the chosen ordering.

### 3. No Merge Operation

Unlike Merge Sort:

```text
Merge Sort → Merge Required
Quick Sort → No Merge Required
```

### 4. The Partition Function Is the Most Important Part

```java
int pivotIndex = partition(arr, low, high);
```

The partition function determines where the pivot should be placed.

### 5. Recursively Sort Both Sides

```java
quickSort(arr, low, pivotIndex - 1);
quickSort(arr, pivotIndex + 1, high);
```

---

# 🚀 Quick Revision

```text
QUICK SORT

Choose Pivot
     ↓
Partition Array
     ↓
Pivot Reaches Correct Position
     ↓
Sort Left Side Recursively
     ↓
Sort Right Side Recursively
     ↓
Array Sorted
```

### Core Java Structure

```java
static void quickSort(int[] arr, int low, int high) {

    if (low >= high) {
        return;
    }

    int pivotIndex = partition(arr, low, high);

    quickSort(arr, low, pivotIndex - 1);

    quickSort(arr, pivotIndex + 1, high);
}
```

---

# 🔥 Quick Sort vs Merge Sort — Final Comparison

| Feature        | Quick Sort                       | Merge Sort         |
| -------------- | -------------------------------- | ------------------ |
| Technique      | Divide and Conquer               | Divide and Conquer |
| Main Operation | Partition                        | Merge              |
| Best Case      | O(n log n)                       | O(n log n)         |
| Average Case   | O(n log n)                       | O(n log n)         |
| Worst Case     | O(n²)                            | O(n log n)         |
| Extra Space    | O(log n) average recursion stack | O(n)               |
| In-place       | Yes                              | No                 |
| Stable         | No                               | Yes                |

---

# 📚 Conclusion

Quick Sort is one of the most important sorting algorithms in Data Structures and Algorithms.

Its complete idea can be summarized as:

> **Choose a pivot, partition the array around that pivot, place the pivot in its correct position, and recursively sort the left and right parts.**

The most important concept to master is the **`partition()` function**, because that is where the actual rearrangement of elements happens.

Once you understand how partitioning works, the recursive Quick Sort logic becomes straightforward.

```text
Choose Pivot → Partition → Recursively Sort Left & Right
```

🚀 **Next Step: Understanding the `partition()` function using the Two Pointer approach in Java.**
