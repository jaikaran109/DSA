# In-Place Algorithms

---

## What is an In-Place Algorithm?

An in-place algorithm **modifies the input directly** without using significant extra space.

```
Space used: O(1) auxiliary space
```

It may use a few extra variables (counters, temp for swap) — those are O(1).

---

## Why In-Place Matters

| Approach | Space | Trade-off |
|---|---|---|
| In-place | O(1) | Modifies original input |
| Out-of-place | O(n) | Preserves original input |

Choose in-place when memory is limited. Choose out-of-place when you need to preserve the input.

---

## Examples

### Reverse Array In-Place

```java
// Out-of-place — O(n) space
int[] reverseOutOfPlace(int[] arr) {
    int[] result = new int[arr.length];   // extra array
    for (int i = 0; i < arr.length; i++) {
        result[i] = arr[arr.length - 1 - i];
    }
    return result;
}

// In-place — O(1) space
void reverseInPlace(int[] arr) {
    int left = 0, right = arr.length - 1;
    while (left < right) {
        int temp = arr[left];    // just one temp variable
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}
// SC: O(1)
```

### Remove Duplicates from Sorted Array (LeetCode 26)

```java
// In-place using two pointers
int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int slow = 0;                        // pointer to next unique position

    for (int fast = 1; fast < nums.length; fast++) {
        if (nums[fast] != nums[slow]) {
            slow++;
            nums[slow] = nums[fast];     // overwrite in original array
        }
    }
    return slow + 1;
}
// TC: O(n)   SC: O(1)
```

### Rotate Array In-Place (LeetCode 189)

```java
// Rotate right by k steps — 3 reversals technique
void rotate(int[] nums, int k) {
    k = k % nums.length;
    reverse(nums, 0, nums.length - 1);   // reverse all
    reverse(nums, 0, k - 1);             // reverse first k
    reverse(nums, k, nums.length - 1);   // reverse rest
}

void reverse(int[] nums, int lo, int hi) {
    while (lo < hi) {
        int temp = nums[lo];
        nums[lo] = nums[hi];
        nums[hi] = temp;
        lo++; hi--;
    }
}
// TC: O(n)   SC: O(1)
```

### Heap Sort (in-place O(n log n) sort)

```java
void heapSort(int[] arr) {
    int n = arr.length;
    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(arr, n, i);              // build heap in-place

    for (int i = n - 1; i > 0; i--) {
        swap(arr, 0, i);                 // place max at end
        heapify(arr, i, 0);
    }
}
// TC: O(n log n)   SC: O(1)
```

---

## In-Place vs Not — Common Algorithms

| Algorithm | In-Place? | SC |
|---|---|---|
| Bubble Sort | Yes | O(1) |
| Selection Sort | Yes | O(1) |
| Insertion Sort | Yes | O(1) |
| Heap Sort | Yes | O(1) |
| Quick Sort | Yes (mostly) | O(log n) stack |
| Merge Sort | No | O(n) |
| Counting Sort | No | O(k) |
| Hash Map operations | No | O(n) |

---

## Key Takeaway

In-place = O(1) auxiliary space. Swap variables directly in the input.
Look for the two-pointer pattern — it is the most common in-place technique.