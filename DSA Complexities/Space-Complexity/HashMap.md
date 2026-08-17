# Hashing & HashMap — Time and Space Complexity

---

## Core Operations

| Operation | Average | Worst Case | Notes |
|---|---|---|---|
| `get(key)` | O(1) | O(n) | Worst = all keys collide |
| `put(key, val)` | O(1) | O(n) | |
| `containsKey(key)` | O(1) | O(n) | |
| `remove(key)` | O(1) | O(n) | |
| `keySet() / values()` | O(n) | O(n) | Iterate all entries |

In interviews, always assume **O(1) average case**.

---

## Space: O(n) for n entries

```java
Map<Integer, Integer> freq = new HashMap<>();
// Stores at most n entries → O(n) space
```

---

## Common Patterns

### Frequency Count — O(n) time, O(n) space

```java
// Count frequency of each element
Map<Integer, Integer> countFreq(int[] nums) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int num : nums) {
        freq.put(num, freq.getOrDefault(num, 0) + 1);
    }
    return freq;
}
// TC: O(n)   SC: O(n)
```

### Two Sum — O(n) time, O(n) space

```java
int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();  // value → index
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};
        }
        map.put(nums[i], i);
    }
    return new int[]{};
}
// TC: O(n)   SC: O(n)
```

### Subarray Sum = K — O(n) time, O(n) space

```java
int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> prefixCount = new HashMap<>();
    prefixCount.put(0, 1);
    int sum = 0, count = 0;

    for (int num : nums) {
        sum += num;
        count += prefixCount.getOrDefault(sum - k, 0);
        prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
    }
    return count;
}
// TC: O(n)   SC: O(n)
```

---

## HashSet Operations

| Operation | Average | Worst |
|---|---|---|
| `add(val)` | O(1) | O(n) |
| `contains(val)` | O(1) | O(n) |
| `remove(val)` | O(1) | O(n) |

```java
// Detect cycle with HashSet
Set<Integer> seen = new HashSet<>();
for (int num : nums) {
    if (seen.contains(num)) return true;
    seen.add(num);
}
// TC: O(n)   SC: O(n)
```

---

## Key Takeaway

HashMap trades **O(n) space** for **O(1) time** — this is the classic time-space trade-off.
Whenever you see O(n²) nested loop solution, ask: "Can a HashMap reduce this to O(n)?"