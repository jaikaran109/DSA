# Arrays & Strings — Time and Space Complexity

---

## Core Operations

| Operation | Array | Dynamic Array (ArrayList) |
|---|---|---|
| Access by index | O(1) | O(1) |
| Search (unsorted) | O(n) | O(n) |
| Search (sorted) | O(log n) | O(log n) |
| Insert at end | O(1) | O(1) amortised |
| Insert at middle | O(n) | O(n) |
| Delete at end | O(1) | O(1) |
| Delete at middle | O(n) | O(n) |

---

## String Operations (Java)

| Operation | Complexity | Notes |
|---|---|---|
| `s.length()` | O(1) | Cached |
| `s.charAt(i)` | O(1) | Direct access |
| `s.substring(i, j)` | O(j - i) | Creates new string |
| `s1 + s2` | O(n + m) | Creates new string |
| `s.contains()` | O(n × m) | Naive search |
| `StringBuilder.append()` | O(1) amortised | Efficient |
| `s.toCharArray()` | O(n) | |

---

## Common Patterns

### Two Pointer — O(n) time, O(1) space

```java
// Check if string is palindrome
boolean isPalindrome(String s) {
    int left = 0, right = s.length() - 1;
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) return false;
        left++;
        right--;
    }
    return true;
}
// TC: O(n)   SC: O(1)
```

### Sliding Window — O(n) time, O(k) space

```java
// Longest substring without repeating characters
int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> map = new HashMap<>();
    int max = 0, left = 0;

    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        if (map.containsKey(c)) {
            left = Math.max(left, map.get(c) + 1);
        }
        map.put(c, right);
        max = Math.max(max, right - left + 1);
    }
    return max;
}
// TC: O(n)   SC: O(min(n, alphabet)) = O(1) for ASCII
```

### Prefix Sum — O(n) build, O(1) query

```java
// Range sum queries after O(n) preprocessing
int[] buildPrefix(int[] arr) {
    int[] prefix = new int[arr.length + 1];
    for (int i = 0; i < arr.length; i++) {
        prefix[i + 1] = prefix[i] + arr[i];
    }
    return prefix;
}

int rangeSum(int[] prefix, int lo, int hi) {
    return prefix[hi + 1] - prefix[lo];   // O(1)
}
// Build: TC O(n), SC O(n)
// Query: TC O(1)
```

### Frequency Count with Array — O(n) time, O(1) space

```java
// Check if two strings are anagrams
boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    int[] freq = new int[26];         // fixed size = O(1)

    for (char c : s.toCharArray()) freq[c - 'a']++;
    for (char c : t.toCharArray()) freq[c - 'a']--;

    for (int count : freq) {
        if (count != 0) return false;
    }
    return true;
}
// TC: O(n)   SC: O(1) — fixed 26-size array
```

---

## String Concatenation Warning

```java
// WRONG — O(n²) due to repeated string creation
String result = "";
for (int i = 0; i < n; i++) {
    result += str;       // creates new string each time: O(1+2+...+n) = O(n²)
}

// CORRECT — O(n) using StringBuilder
StringBuilder sb = new StringBuilder();
for (int i = 0; i < n; i++) {
    sb.append(str);      // O(1) amortised each time
}
String result = sb.toString();   // O(n) at the end
// TC: O(n)   SC: O(n)
```

---

## Summary

| Pattern | TC | SC |
|---|---|---|
| Two pointers | O(n) | O(1) |
| Sliding window | O(n) | O(k) |
| Prefix sum (build) | O(n) | O(n) |
| Prefix sum (query) | O(1) | O(1) |
| Frequency array | O(n) | O(1) |
| String concatenation in loop | O(n²) | O(n) |
| StringBuilder | O(n) | O(n) |