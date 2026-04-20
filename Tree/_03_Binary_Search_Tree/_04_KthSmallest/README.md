# Kth Smallest Element in BST

**Problem**: Find the kth smallest element in a BST.

**Core Concept**:
- InOrder traversal of BST gives sorted order
- Use iterative inorder with counter
- Return when counter reaches k

**Example**:
```
    3
   / \
  1   4
   \
    2
```
k=1 → 1, k=3 → 3

**Complexity**:
- Time: O(h + k) - go to leftmost, then k nodes
- Space: O(h) - stack height

**Code**:
```java
int kthSmallest(TreeNode root, int k) {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode curr = root;
    int count = 0;
    while (curr != null || !stack.isEmpty()) {
        while (curr != null) {
            stack.push(curr);
            curr = curr.left;
        }
        curr = stack.pop();
        if (++count == k) return curr.val;
        curr = curr.right;
    }
}
```
