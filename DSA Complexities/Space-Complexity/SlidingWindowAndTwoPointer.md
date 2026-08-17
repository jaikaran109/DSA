# Sliding Window & Two Pointers — Time and Space Complexity

---

## Why These Are O(n) (Not O(n²))

The key insight: **each pointer moves in only one direction**.

Even though there are two pointers inside nested logic, each element is touched at most twice (once when added to window, once when removed). Total operations = 2n = O(n).

---

## Two Pointers Pattern

### Opposite direction — start from both ends

```java
// Two Sum in sorted array
int[] twoSum(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left < right) {
        int sum = nums[left] + nums[right];
        if (sum == target) return new int[]{left, right};
        else if (sum < target) left++;    // need larger sum
        else right--;                     // need smaller sum
    }
    return new int[]{};
}
// TC: O(n)   SC: O(1)
// Each pointer moves inward only → total moves ≤ n
```

### Same direction — fast and slow

```java
// Remove duplicates from sorted array
int removeDuplicates(int[] nums) {
    int slow = 0;
    for (int fast = 1; fast < nums.length; fast++) {
        if (nums[fast] != nums[slow]) {
            slow++;
            nums[slow] = nums[fast];
        }
    }
    return slow + 1;
}
// TC: O(n)   SC: O(1)
```

---

## Fixed-Size Sliding Window

```java
// Maximum sum of subarray of size k
int maxSumFixed(int[] arr, int k) {
    int windowSum = 0;
    for (int i = 0; i < k; i++) windowSum += arr[i];   // first window

    int maxSum = windowSum;
    for (int i = k; i < arr.length; i++) {
        windowSum += arr[i] - arr[i - k];               // slide: add new, remove old
        maxSum = Math.max(maxSum, windowSum);
    }
    return maxSum;
}
// TC: O(n)   SC: O(1)
```

---

## Variable-Size Sliding Window

```java
// Longest substring with at most k distinct characters
int longestSubstringKDistinct(String s, int k) {
    Map<Character, Integer> freq = new HashMap<>();
    int left = 0, maxLen = 0;

    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        freq.put(c, freq.getOrDefault(c, 0) + 1);

        while (freq.size() > k) {                        // shrink window
            char leftChar = s.charAt(left);
            freq.put(leftChar, freq.get(leftChar) - 1);
            if (freq.get(leftChar) == 0) freq.remove(leftChar);
            left++;
        }
        maxLen = Math.max(maxLen, right - left + 1);
    }
    return maxLen;
}
// TC: O(n) — right moves n times, left moves at most n times total
// SC: O(k) — map holds at most k+1 chars
```

---

## Summary

| Pattern | TC | SC |
|---|---|---|
| Two pointers (opposite) | O(n) | O(1) |
| Two pointers (same dir) | O(n) | O(1) |
| Fixed window | O(n) | O(1) |
| Variable window | O(n) | O(k) |

**Key rule:** As long as each pointer moves in one direction only, the total moves ≤ 2n = O(n).