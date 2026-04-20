# Lowest Common Ancestor (Binary Tree)

**Problem**: Find LCA of two nodes in a binary tree (not BST).

**Core Concept**:
- If root is p or q, return root
- Search in left and right subtrees
- If both return non-null → root is LCA
- Otherwise return non-null side

**Example**:
```
      3
     / \
    5   1
   / \
  6   2
```
LCA(5, 1) = 3

**Complexity**:
- Time: O(n) - visit each node once
- Space: O(h) - recursion stack

**Code**:
```java
TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root == p || root == q) return root;
    
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);
    
    if (left != null && right != null) return root;
    return left != null ? left : right;
}
```
