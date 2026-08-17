# How to Calculate Time and Space Complexity

---

## Step-by-Step Approach

### Step 1 — Identify what n is

n is the size of your input. It could be:
- Length of an array
- Number of nodes in a tree
- Number of characters in a string
- Number of rows/columns in a matrix (n × m)

### Step 2 — Count operations, not lines

Not every line is equal. Focus on:
- Loop iterations
- Recursive calls
- Built-in function costs (e.g. `.sort()` is O(n log n))

### Step 3 — Apply Big O simplification rules

Drop constants and lower-order terms.

---

## Calculating Time Complexity

### Single Loop

```java
for (int i = 0; i < n; i++) {
    // O(1) work
}
// Total: O(n)
```

### Loop that halves

```java
for (int i = n; i > 0; i /= 2) {
    // O(1) work
}
// i goes: n → n/2 → n/4 → ... → 1
// Total iterations: log₂(n)
// Total: O(log n)
```

### Two sequential loops

```java
for (int i = 0; i < n; i++) { }    // O(n)
for (int j = 0; j < n; j++) { }    // O(n)
// Total: O(n) + O(n) = O(2n) = O(n)
```

### Nested loops

```java
for (int i = 0; i < n; i++) {       // n times
    for (int j = 0; j < n; j++) {   // n times each
        // O(1) work
    }
}
// Total: n × n = O(n²)
```

### Nested loops — different bounds

```java
for (int i = 0; i < n; i++) {       // n times
    for (int j = i; j < n; j++) {   // (n-i) times
        // work
    }
}
// Iterations: n + (n-1) + (n-2) + ... + 1 = n(n+1)/2
// Total: O(n²)
```

### Built-in functions inside loops

```java
for (int i = 0; i < n; i++) {
    Collections.sort(list);  // O(n log n) inside O(n) loop
}
// Total: O(n × n log n) = O(n² log n)
```

Always check the cost of built-in methods.

---

## Calculating Space Complexity

### No extra space

```java
int sum = 0;                        // O(1) — single variable
for (int i = 0; i < n; i++) {
    sum += arr[i];
}
// Space: O(1)
```

### Extra array

```java
int[] result = new int[n];          // O(n) space
for (int i = 0; i < n; i++) {
    result[i] = arr[i] * 2;
}
// Space: O(n)
```

### 2D array

```java
int[][] matrix = new int[n][m];     // O(n × m) space
// Space: O(n × m)
```

### Recursion — stack space

```java
void recurse(int n) {
    if (n == 0) return;
    recurse(n - 1);                 // call stack grows n deep
}
// Stack holds n frames at once
// Space: O(n)
```

```java
void recurse(int n) {
    if (n == 0) return;
    recurse(n / 2);                 // halves each time
}
// Stack depth: log n
// Space: O(log n)
```

---

## Common Patterns at a Glance

| Code Pattern | Time | Space |
|---|---|---|
| Single loop | O(n) | O(1) |
| Nested loop | O(n²) | O(1) |
| Loop + halving | O(log n) | O(1) |
| Recursion (n calls) | O(n) | O(n) |
| Merge sort | O(n log n) | O(n) |
| HashMap operations | O(1) avg | O(n) |

---

## Practice: Analyse This

```java
int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};
        }
        map.put(nums[i], i);
    }
    return new int[]{};
}
```

**Time Complexity → O(n)**
One loop over n elements. HashMap operations (get, put, containsKey) are O(1) average.

**Space Complexity → O(n)**
HashMap can store at most n elements in the worst case.