# Common Beginner Mistakes in Complexity Analysis

---

## Mistake 1 — Counting Loops Instead of Operations

```java
// Beginner thinks: "2 loops = O(n²)"
int i = 0, j = 0;
while (i < n && j < n) {
    process(i, j);
    i++;
    j++;
}
// CORRECT: O(n) — both pointers only move forward, total moves = n
```

**Fix:** Ask "how many total operations happen?" not "how many loops?"

---

## Mistake 2 — Ignoring Built-in Method Costs

```java
for (int i = 0; i < n; i++) {
    list.contains(x);        // O(n) — NOT O(1)!
}
// Beginner: "It's one line inside the loop → O(n)"
// CORRECT: O(n) × O(n) = O(n²)
```

Common hidden costs:
- `List.contains()` → O(n)
- `String.substring()` → O(length)
- `String + String` → O(n + m)
- `Collections.sort()` → O(n log n)

---

## Mistake 3 — Confusing Space of Input vs Auxiliary Space

```java
int sum(int[] arr) {
    int total = 0;
    for (int x : arr) total += x;
    return total;
}
// Beginner: "SC = O(n) because input array is size n"
// CORRECT: SC = O(1) auxiliary (we only use 1 extra variable)
```

---

## Mistake 4 — Forgetting Recursion Stack Space

```java
void dfs(TreeNode node) {
    if (node == null) return;
    dfs(node.left);
    dfs(node.right);
}
// Beginner: "No extra data structures → O(1) space"
// CORRECT: SC = O(h) where h = height of tree (call stack!)
// Skewed tree: O(n). Balanced tree: O(log n)
```

---

## Mistake 5 — Quick Sort Is Not Always O(n log n)

```java
// Quick Sort worst case: already sorted + last element as pivot
[1, 2, 3, 4, 5] with pivot = last element
→ Always partitions into [n-1] + [0]
→ n + (n-1) + (n-2) + ... = O(n²)
```

Always mention: "O(n log n) average, O(n²) worst case for Quick Sort."

---

## Mistake 6 — Two Different Input Sizes

```java
for (int x : listA) {           // n elements
    for (int y : listB) {       // m elements
        process(x, y);
    }
}
// Beginner: "O(n²)"
// CORRECT: O(n × m)
// If n = m, then O(n²). But if m is constant, it's O(n).
```

Use different variable names for different inputs.

---

## Mistake 7 — Amortised Operations Misunderstood

```java
List<Integer> list = new ArrayList<>();
for (int i = 0; i < n; i++) {
    list.add(i);                // O(1) amortised, not O(n)
}
// Beginner: "ArrayList doubles capacity → O(n) per add → O(n²) total?"
// CORRECT: O(n) total — each resize cost is amortised over many adds
```

---

## Summary

| Mistake | Wrong | Correct |
|---|---|---|
| Count loops | 2 loops = O(n²) | Count total operations |
| Built-in methods | Always O(1) | Check actual cost |
| Input vs auxiliary space | Any array = O(n) | Only count EXTRA space |
| Recursion space | No DS = O(1) | Count call stack depth |
| Quick Sort | Always O(n log n) | O(n²) worst case |
| Two different arrays | O(n²) | O(n × m) |
| ArrayList add | O(n) per call | O(1) amortised |