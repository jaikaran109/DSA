# Heap & Priority Queue — Time and Space Complexity

---

## Core Operations

| Operation | Time | Notes |
|---|---|---|
| Insert (offer) | O(log n) | Sift up |
| Remove min/max (poll) | O(log n) | Sift down |
| Peek min/max | O(1) | Top element |
| Build heap from array | O(n) | Not O(n log n)! |
| Heap Sort | O(n log n) | Build + n extractions |

**Space: O(n)** for n elements.

---

## Java PriorityQueue

```java
// Min-Heap (default)
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
minHeap.offer(5);          // O(log n)
minHeap.offer(2);
minHeap.offer(8);
int min = minHeap.peek();  // O(1) → returns 2
minHeap.poll();            // O(log n) → removes 2

// Max-Heap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
```

---

## Kth Largest Element — O(n log k) time, O(k) space

```java
int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    for (int num : nums) {
        minHeap.offer(num);          // O(log k)
        if (minHeap.size() > k) {
            minHeap.poll();          // keep only k largest
        }
    }
    return minHeap.peek();           // smallest of k largest = kth largest
}
// TC: O(n log k)   SC: O(k)
// Better than sorting: O(n log n) → O(n log k)
```

---

## Top K Frequent Elements — O(n log k)

```java
int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int num : nums) freq.put(num, freq.getOrDefault(num, 0) + 1);

    PriorityQueue<Integer> minHeap =
        new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));

    for (int num : freq.keySet()) {
        minHeap.offer(num);
        if (minHeap.size() > k) minHeap.poll();
    }

    int[] result = new int[k];
    for (int i = k - 1; i >= 0; i--) result[i] = minHeap.poll();
    return result;
}
// TC: O(n log k)   SC: O(n + k)
```

---

## Summary

| Use Case | TC | SC |
|---|---|---|
| Kth largest/smallest | O(n log k) | O(k) |
| Heap sort | O(n log n) | O(1) |
| Median of stream | O(log n) per insert | O(n) |
| Dijkstra shortest path | O((V+E) log V) | O(V) |