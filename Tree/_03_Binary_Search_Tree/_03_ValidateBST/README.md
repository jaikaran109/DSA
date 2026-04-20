# Validate Binary Search Tree

**Problem**: Check if a binary tree is a valid BST.

**Core Concept**:
- Each node must satisfy: min < node.val < max
- Left subtree: (min, node.val)
- Right subtree: (node.val, max)
- Use Long.MIN/MAX to handle edge cases

**Example**:
```
Valid:     2          Invalid:    5
          / \                    / \
         1   3                  1   4
                                   /
                                  3
```

**Complexity**:
- Time: O(n) - visit each node once
- Space: O(h) - recursion stack

**Code**:
```java
boolean isValidBST(TreeNode root) {
    return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
}

boolean validate(TreeNode node, long min, long max) {
    if (node == null) return true;
    if (node.val <= min || node.val >= max) return false;
    return validate(node.left, min, node.val) && 
           validate(node.right, node.val, max);
}
```
