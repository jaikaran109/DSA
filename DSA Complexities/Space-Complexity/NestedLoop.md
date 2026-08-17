# Nested Loops ≠ Always O(n²)

---

## The Common Misconception

Most beginners think:
```
2 loops = O(n²)   ← WRONG (not always)
```

The correct approach:
```
Count total operations, not number of loops
```

---

## Case 1 — Two Pointers Moving Together: O(n)

```java
// Looks like O(n²) but is O(n)
int i = 0, j = 0;
while (i < n && j < n) {
    i++;
    j++;
}
// Both pointers only move FORWARD
// Total moves: n for i + n for j = 2n = O(n)
```

---

## Case 2 — Sliding Window: O(n)

```java
int left = 0;
for (int right = 0; right < n; right++) {   // outer loop: n times
    while (condition && left <= right) {     // inner while
        left++;                              // left only moves FORWARD
    }
}
// right moves n times total, left moves at most n times total
// Total: 2n = O(n)
```

The trick: `left` never resets. It only moves right across the entire run.

---

## Case 3 — Loop Bound Depends on Outer Variable: O(n²) still

```java
// This IS O(n²) — inner loop resets to 0 each time
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {   // j resets each outer iteration
        // work
    }
}
// Total: n × n = n²
```

```java
// This is O(n²) even though j starts from i
for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) {   // j resets to i, not to where it left off
        // work
    }
}
// Total: n + (n-1) + ... + 1 = n(n+1)/2 = O(n²)
```

---

## Case 4 — Inner Loop Runs Constant Times: O(n)

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < 5; j++) {   // inner loop runs FIXED 5 times
        // work
    }
}
// Total: n × 5 = 5n = O(n)
```

---

## Case 5 — Different Variables: O(n × m)

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {   // m and n are different inputs
        // work
    }
}
// Total: n × m = O(n × m)
// NOT O(n²) unless n == m
```

---

## The Golden Question

Before assuming O(n²), ask:

> "Does the inner pointer / variable reset to 0 on every outer iteration?"

- **YES** → Multiply → O(n²) likely
- **NO** (pointer only moves forward) → Add → O(n) likely

---

## Summary Table

| Code Shape | TC | Reason |
|---|---|---|
| `j` resets to 0 each outer loop | O(n²) | True nesting |
| `j` starts from `i`, resets | O(n²) | Still n(n-1)/2 |
| `j` only moves forward (two ptr) | O(n) | Total moves = n |
| `left` only moves right (sliding) | O(n) | left + right ≤ 2n |
| Inner loop runs fixed k times | O(n) | n × k = O(n) |
| Loops over different inputs | O(n × m) | Not O(n²) |