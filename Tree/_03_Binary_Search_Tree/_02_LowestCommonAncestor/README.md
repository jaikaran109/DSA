# Lowest Common Ancestor in BST

**Problem**: Find the lowest common ancestor of two nodes in a BST.

**Core Concept**:
- Use BST property: left < root < right
- If both nodes < root → LCA in left subtree
- If both nodes > root → LCA in right subtree
- Otherwise, root is LCA

**Example**:
```
      6
     / \
    2   8
   / \
  0   4
```
LCA(2, 8) = 6

**Complexity**:
- Time: O(h) - height of tree
- Space: O(h) - recursion stack

**Code**:
```java
TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (p.val < root.val && q.val < root.val)
        return lowestCommonAncestor(root.left, p, q);
    if (p.val > root.val && q.val > root.val)
        return lowestCommonAncestor(root.right, p, q);
    return root;
}
```
