# What is Time Complexity and Space Complexity?

---

## Time Complexity (TC)

Time Complexity measures **how the runtime of an algorithm grows** as the input size increases.

> It does NOT measure actual seconds — it measures the **number of operations**.

### Why it matters

Two algorithms can solve the same problem, but one might take 10 steps while the other takes 10,000 steps for the same input. Time Complexity helps us compare them objectively.

### Example

```java
// Algorithm 1 — O(n)
for (int i = 0; i < n; i++) {
    System.out.println(arr[i]);
}

// Algorithm 2 — O(n²)
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(arr[i] + arr[j]);
    }
}
```

For n = 1000:
- Algorithm 1 → ~1,000 operations
- Algorithm 2 → ~1,000,000 operations

---

## Space Complexity (SC)

Space Complexity measures **how much extra memory an algorithm uses** as input size grows.

> This includes variables, arrays, recursion stack, etc. — NOT the input itself (usually).

### Example

```java
// O(1) space — only one extra variable used
int sum = 0;
for (int i = 0; i < n; i++) {
    sum += arr[i];
}

// O(n) space — creating a new array of size n
int[] copy = new int[n];
for (int i = 0; i < n; i++) {
    copy[i] = arr[i];
}
```

---

## TC vs SC — Side by Side

| | Time Complexity | Space Complexity |
|---|---|---|
| Measures | Number of operations | Extra memory used |
| Goal | Faster algorithms | Memory-efficient algorithms |
| Trade-off | Sometimes use more space to save time | Sometimes slower to save memory |
| Example | Binary Search = O(log n) time | Binary Search = O(1) space |

---

## The Trade-Off

Often, you can trade space for time or time for space.

```java
// Approach 1 — O(n²) time, O(1) space
// Check every pair to find duplicate
for (int i = 0; i < n; i++)
    for (int j = i+1; j < n; j++)
        if (arr[i] == arr[j]) return true;

// Approach 2 — O(n) time, O(n) space
// Use HashSet to find duplicate in one pass
Set<Integer> seen = new HashSet<>();
for (int num : arr) {
    if (seen.contains(num)) return true;
    seen.add(num);
}
```

Approach 2 is faster but uses more memory. **Which is better depends on the situation.**

---

## Key Takeaway

- **Time Complexity** → How fast does it scale?
- **Space Complexity** → How much memory does it need?
- Always analyse both when solving problems.