# PostOrder Traversal (Iterative)

**Problem**: Traverse tree in Left → Right → Root order without recursion.

**Core Concept**:
- Use reverse of Root → Right → Left
- Add nodes at beginning of result
- Essential for tree deletion (delete children before parent)

**Example**:
```
    1
     \
      2
     /
    3
```
Output: [3, 2, 1]

**Complexity**:
- Time: O(n) - visit each node once
- Space: O(h) - stack height

**Code**:
```java
List<Integer> postorder(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
        TreeNode node = stack.pop();
        result.add(0, node.val); // Add at start
        if (node.left != null) stack.push(node.left);
        if (node.right != null) stack.push(node.right);
    }
}
```
