# Left View of Binary Tree

**Problem**: Print the leftmost node at each level.

**Core Concept**:
- Level order traversal (BFS)
- Print first node of each level
- Use queue with level tracking

**Example**:
```
      1
     / \
    2   3
     \   \
      4   5
```
Output: [1, 2, 4]

**Complexity**:
- Time: O(n) - visit each node once
- Space: O(w) - max width of tree

**Code**:
```java
List<Integer> leftView(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();
            if (i == 0) result.add(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
    }
}
```
