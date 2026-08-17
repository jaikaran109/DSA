# Amortised Analysis

---

## What is Amortised Analysis?

Some operations are occasionally expensive but cheap on average over many calls.
Amortised complexity = **total cost over n operations ÷ n**.

```
Single worst-case op: O(n)
But averaged over many ops: O(1) amortised
```

---

## Classic Example — Dynamic Array (ArrayList)

When the array is full, it doubles in size (O(n) copy). But this happens rarely.

```
Start with capacity 1:

Insert 1: [1]              → O(1)
Insert 2: [1, _] → [1, 2] → O(2) resize + O(1) insert
Insert 3: [1,2,_,_] → [1,2,3,_] → O(1)
Insert 4: [1,2,3,4] → O(1)
Insert 5: [1,2,3,4,_,_,_,_] → O(4) resize + O(1) insert
...

Total cost for n inserts:
1 + 2 + 1 + 1 + 4 + 1 + 1 + 1 + 8 + ...
= n + (1 + 2 + 4 + 8 + ... + n)   [resize costs]
= n + 2n = 3n

Amortised per insert: 3n / n = O(1)
```

---

## HashMap Rehashing

Similar to dynamic array. When load factor exceeds threshold (0.75 in Java):
- Rehash all n elements: O(n)
- But this doubles capacity → won't happen for another n inserts

Amortised cost per `put()`: **O(1)**

---

## Stack with Monotonic Property

```java
// Monotonic stack — each element pushed and popped at most once
int[] nextGreater(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    Arrays.fill(result, -1);
    Deque<Integer> stack = new ArrayDeque<>();

    for (int i = 0; i < n; i++) {
        while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
            result[stack.pop()] = nums[i];
        }
        stack.push(i);
    }
    return result;
}
```

The inner `while` can run O(n) in a single iteration — looks like O(n²).
But across all iterations: total pushes = n, total pops ≤ n.
**Amortised: O(1) per element → TC: O(n) total**

---

## Key Insight

When you see a nested loop but suspect it might be O(n), count:
- How many times can each element be pushed / added?
- How many times can each element be popped / removed?

If both are bounded by 1 per element → total cost is O(n).

---

## Summary

| Structure / Operation | Worst Single Op | Amortised |
|---|---|---|
| ArrayList insert | O(n) resize | O(1) |
| HashMap put | O(n) rehash | O(1) |
| Monotonic stack ops | O(n) pops | O(1) per element |
| StringBuilder append | O(n) copy | O(1) |