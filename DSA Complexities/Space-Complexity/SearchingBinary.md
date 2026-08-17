# Searching & Binary Search — Time and Space Complexity

---

## Search Algorithms

| Algorithm | TC | SC | Requirement |
|---|---|---|---|
| Linear Search | O(n) | O(1) | None |
| Binary Search | O(log n) | O(1) iterative | Sorted array |
| Binary Search (recursive) | O(log n) | O(log n) | Sorted array |

---

## Binary Search — Template

```java
int binarySearch(int[] nums, int target) {
    int lo = 0, hi = nums.length - 1;

    while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;   // avoids overflow vs (lo+hi)/2

        if (nums[mid] == target) return mid;
        else if (nums[mid] < target) lo = mid + 1;
        else hi = mid - 1;
    }
    return -1;
}
// TC: O(log n)   SC: O(1)
```

---

## Binary Search on Answer

```java
// Minimum days to make m bouquets (LeetCode 1482)
boolean canMake(int[] bloomDay, int day, int m, int k) {
    int bouquets = 0, flowers = 0;
    for (int d : bloomDay) {
        if (d <= day) {
            flowers++;
            if (flowers == k) { bouquets++; flowers = 0; }
        } else flowers = 0;
    }
    return bouquets >= m;
}

int minDays(int[] bloomDay, int m, int k) {
    int lo = 1, hi = (int) 1e9;
    while (lo < hi) {
        int mid = (lo + hi) / 2;
        if (canMake(bloomDay, mid, m, k)) hi = mid;
        else lo = mid + 1;
    }
    return lo;
}
// TC: O(n log(max)) — log of answer range × n per check
// SC: O(1)
```

---

## Summary

| Variant | TC | SC |
|---|---|---|
| Standard binary search | O(log n) | O(1) |
| Recursive binary search | O(log n) | O(log n) |
| Binary search on answer | O(n log(range)) | O(1) |
| Find first / last position | O(log n) | O(1) |