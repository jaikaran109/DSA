# O(1) — Constant Time

---

## What it means

The algorithm takes the **same number of steps regardless of input size**.

```
n = 10    → 1 operation
n = 1000  → 1 operation
n = 10⁶   → 1 operation
```

---

## Examples

### Array access by index

```java
int getFirst(int[] arr) {
    return arr[0];   // Always 1 operation
}
// TC: O(1)   SC: O(1)
```

### HashMap lookup

```java
Map<String, Integer> map = new HashMap<>();
map.put("apple", 5);

int val = map.get("apple");   // O(1) average
// TC: O(1)   SC: O(1)
```

### Math formula (no loop needed)

```java
// Sum of 1 to n = n*(n+1)/2
long sumToN(long n) {
    return n * (n + 1) / 2;   // One formula, no loop
}
// TC: O(1)   SC: O(1)

// Compare to naive approach: O(n)
long sumToNSlow(int n) {
    long sum = 0;
    for (int i = 1; i <= n; i++) sum += i;  // n iterations
    return sum;
}
```

### Stack peek / push / pop

```java
Deque<Integer> stack = new ArrayDeque<>();
stack.push(10);       // O(1)
int top = stack.peek(); // O(1)
stack.pop();          // O(1)
```

---

## When you see O(1)

- Direct index access: `arr[i]`, `arr[arr.length - 1]`
- HashMap / HashSet: `get()`, `put()`, `contains()`
- Math formula replacing a loop
- Stack / Queue: push, pop, peek
- Bitwise operations: `n & 1`, `n >> 1`

---

## Important Note

O(1) does NOT mean "one operation". It means the number of operations does **not depend on n**.

```java
void constantWork() {
    int a = 1;
    int b = 2;
    int c = 3;
    int d = a + b + c;   // 4 operations — still O(1)
}
```

---

## TC: O(1) | SC: O(1)