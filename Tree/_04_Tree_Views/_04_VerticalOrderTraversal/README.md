# Vertical Order Traversal

**Problem**: Print nodes in vertical order from left to right, top to bottom.

**Core Concept**:
- Assign vertical distance (v) and level (l) to each node
- Use TreeMap<v, TreeMap<l, PriorityQueue>> for sorting
- BFS traversal with (node, v, l) tuples

**Example**:
```
        1
       / \
      2   3
     / \ / \
    4  5 6  7
```
Output: [4], [2], [1,5,6], [3], [7]

**Complexity**:
- Time: O(n log n) - TreeMap operations
- Space: O(n) - queue and map storage

**Code**:
```java
void verticalOrder(Node root) {
    Queue<Tuple> q = new LinkedList<>();
    TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
    q.offer(new Tuple(root, 0, 0));
    // Process queue and populate map
}
```
