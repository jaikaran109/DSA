# Right View of Binary Tree

**Problem**: Print the rightmost node at each level.

**Core Concept**:
- Level order traversal (BFS)
- Print last node of each level
- Use queue with level tracking

**Example**:
```
      1
     / \
    2   3
     \   \
      5   4
```
Output: [1, 3, 4]

**Complexity**:
- Time: O(n) - visit each node once
- Space: O(w) - max width of tree

**Code**:
```java
List<Integer> rightView(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();
            if (i == size - 1) result.add(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
    }
}
```
