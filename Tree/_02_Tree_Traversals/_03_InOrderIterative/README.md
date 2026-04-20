# InOrder Traversal (Iterative)

**Problem**: Traverse tree in Left → Root → Right order without recursion.

**Core Concept**:
- Use stack to simulate recursion
- Go left as far as possible, then process node, then go right
- Most important for BST (gives sorted order)

**Example**:
```
    1
     \
      2
     /
    3
```
Output: [1, 3, 2]

**Complexity**:
- Time: O(n) - visit each node once
- Space: O(h) - stack height

**Code**:
```java
List<Integer> inorder(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode curr = root;
    while (curr != null || !stack.isEmpty()) {
        while (curr != null) {
            stack.push(curr);
            curr = curr.left;
        }
        curr = stack.pop();
        result.add(curr.val);
        curr = curr.right;
    }
}
```
