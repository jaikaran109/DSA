# O(n) — Linear Time

---

## What it means

Work done is **directly proportional to input size**. Double the input → double the work.

```
n = 10    → ~10 operations
n = 1000  → ~1000 operations
n = 10⁶   → ~10⁶ operations
```

---

## Examples

### Single loop — find max

```java
int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {   // n iterations
        if (arr[i] > max) max = arr[i];
    }
    return max;
}
// TC: O(n)   SC: O(1)
```

### Linear search

```java
int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {   // worst case: all n elements
        if (arr[i] == target) return i;
    }
    return -1;
}
// TC: O(n)   SC: O(1)
```

### Two separate loops (still O(n))

```java
void twoLoops(int[] arr) {
    for (int i = 0; i < arr.length; i++) {   // n
        System.out.println(arr[i]);
    }
    for (int j = 0; j < arr.length; j++) {   // n
        System.out.println(arr[j] * 2);
    }
}
// Total: n + n = 2n = O(n)
// Two sequential loops — they ADD, not multiply
```

### Two-pointer technique

```java
// Check if array is palindrome
boolean isPalindrome(int[] arr) {
    int left = 0, right = arr.length - 1;
    while (left < right) {         // each pointer moves at most n/2 times
        if (arr[left] != arr[right]) return false;
        left++;
        right--;
    }
    return true;
}
// Total pointer moves ≤ n
// TC: O(n)   SC: O(1)
```

### Recursion — single call

```java
int sumArray(int[] arr, int i) {
    if (i == arr.length) return 0;
    return arr[i] + sumArray(arr, i + 1);   // one recursive call per element
}
// n recursive calls total
// TC: O(n)   SC: O(n) — call stack
```

---

## Sneaky O(n) Cases

### String operations

```java
String reverse(String s) {
    return new StringBuilder(s).reverse().toString();
}
// .reverse() internally iterates all n characters
// TC: O(n)   SC: O(n)
```

### Sliding window

```java
// Maximum sum subarray of size k
int maxSumSubarray(int[] arr, int k) {
    int windowSum = 0;
    for (int i = 0; i < k; i++) windowSum += arr[i];   // build first window

    int maxSum = windowSum;
    for (int i = k; i < arr.length; i++) {              // slide window
        windowSum += arr[i] - arr[i - k];
        maxSum = Math.max(maxSum, windowSum);
    }
    return maxSum;
}
// Two loops but each element touched at most twice
// TC: O(n)   SC: O(1)
```

---

## How to Recognise O(n)

- Single loop over entire input → O(n)
- Two-pointer where both move forward only → O(n)
- One recursive call that reduces n by 1 → O(n)
- Multiple sequential loops → still O(n)

---

## TC: O(n) | SC: O(1) for iterative, O(n) for recursive