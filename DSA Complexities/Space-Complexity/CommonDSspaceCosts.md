# Space Costs of Common Data Structures

---

## Quick Reference

| Data Structure | Space | Notes |
|---|---|---|
| Array of size n | O(n) | Stores n elements |
| 2D array n×m | O(n×m) | All cells allocated |
| ArrayList (dynamic) | O(n) | Amortised |
| LinkedList (n nodes) | O(n) | Extra pointer per node |
| HashMap / HashSet | O(n) | n key-value pairs |
| Stack (n elements) | O(n) | |
| Queue (n elements) | O(n) | |
| Binary Tree (n nodes) | O(n) | |
| Trie | O(alphabet × n) | Worst case |
| Graph — Adjacency Matrix | O(V²) | V = vertices |
| Graph — Adjacency List | O(V + E) | E = edges |

---

## Detailed Breakdown

### Array / ArrayList

```java
int[] arr = new int[n];           // O(n)
int[][] matrix = new int[n][m];   // O(n × m)
```

### HashMap

```java
Map<Integer, Integer> freq = new HashMap<>();
// Stores at most n key-value pairs
// SC: O(n)

// Example: frequency count
for (int num : nums) {
    freq.put(num, freq.getOrDefault(num, 0) + 1);
}
// If nums has n elements, map has at most n entries → O(n)
```

### HashSet

```java
Set<Integer> seen = new HashSet<>();
// Stores at most n elements
// SC: O(n)
```

### Stack

```java
Deque<Integer> stack = new ArrayDeque<>();
// Worst case: all n elements pushed
// SC: O(n)

// Example in DFS — stack holds at most depth-of-tree elements
// For balanced BST: O(log n)
// For skewed tree:  O(n)
```

### Queue (BFS)

```java
Queue<TreeNode> queue = new LinkedList<>();
// BFS: holds at most one level of the tree at a time
// Worst case (last level of complete tree): n/2 nodes → O(n)
```

### Graph Storage

```java
// Adjacency Matrix — O(V²)
int[][] adjMatrix = new int[V][V];
// Good for dense graphs (many edges)
// Bad for sparse graphs (wastes space)

// Adjacency List — O(V + E)
List<List<Integer>> adjList = new ArrayList<>();
// Good for sparse graphs
// Most common in competitive programming
```

---

## Space in Common Operations

### BFS — Space analysis

```java
void bfs(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        TreeNode node = queue.poll();
        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
    }
}
// Queue holds at most the widest level
// Perfect binary tree: last level has n/2 nodes
// SC: O(n)
```

### DFS — Space analysis

```java
void dfs(TreeNode node) {
    if (node == null) return;
    dfs(node.left);
    dfs(node.right);
}
// Call stack holds one path root-to-leaf
// Balanced tree: height = log n → SC: O(log n)
// Skewed tree: height = n     → SC: O(n)
```

---

## Key Patterns

- Using a HashMap/Set to cache results → adds O(n) space
- BFS always needs O(n) queue space
- DFS space = tree height (O(log n) balanced, O(n) worst)
- Every node/element stored costs space — count them carefully