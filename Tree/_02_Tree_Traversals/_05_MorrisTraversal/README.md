# Morris Traversal (O(1) Space)

**Problem**: Traverse tree without using stack or recursion (constant space).

**Core Concept**:
- Create temporary links using rightmost node of left subtree
- Link points back to current node (threaded binary tree)
- Break link after visiting

**Example**:
```
    1
   / \
  2   3
```
Output: [2, 1, 3]

**Complexity**:
- Time: O(n) - each edge traversed at most twice
- Space: O(1) - no extra space!

**Code**:
```java
List<Integer> morris(TreeNode root) {
    TreeNode curr = root;
    while (curr != null) {
        if (curr.left == null) {
            result.add(curr.val);
            curr = curr.right;
        } else {
            TreeNode pred = findPredecessor(curr);
            if (pred.right == null) {
                pred.right = curr; // Create link
                curr = curr.left;
            } else {
                pred.right = null; // Break link
                result.add(curr.val);
                curr = curr.right;
            }
        }
    }
}
```
