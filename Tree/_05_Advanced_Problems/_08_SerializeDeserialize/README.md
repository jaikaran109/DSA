# Serialize and Deserialize Binary Tree

**Problem**: Convert tree to string and reconstruct it back.

**Core Concept**:
- Serialize: PreOrder traversal with "null" for empty nodes
- Deserialize: Build tree from queue of values
- Use comma separator

**Example**:
```
    1
   / \
  2   3
     / \
    4   5
```
Serialized: "1,2,null,null,3,4,null,null,5,null,null"

**Complexity**:
- Time: O(n) - visit each node once
- Space: O(n) - string storage

**Code**:
```java
String serialize(TreeNode root) {
    if (root == null) return "null";
    return root.val + "," + serialize(root.left) + "," + serialize(root.right);
}

TreeNode deserialize(String data) {
    Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
    return build(queue);
}
```
