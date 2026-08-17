# Trees & BST — Time and Space Complexity

---

## Tree Terminology

```
n = number of nodes
h = height of tree
Balanced tree: h = O(log n)
Skewed tree:   h = O(n)
```

---

## Binary Tree — Core Operations

| Operation | Balanced | Skewed (worst) |
|---|---|---|
| Search | O(log n) | O(n) |
| Insert | O(log n) | O(n) |
| Delete | O(log n) | O(n) |
| Traversal | O(n) | O(n) |

---

## Tree Traversals — O(n) time, O(h) space

```java
// Inorder: Left → Root → Right (gives sorted order for BST)
void inorder(TreeNode node) {
    if (node == null) return;
    inorder(node.left);
    System.out.print(node.val + " ");
    inorder(node.right);
}
// TC: O(n)   SC: O(h) — call stack depth = tree height
// Balanced: O(log n)   Skewed: O(n)

// Preorder: Root → Left → Right
void preorder(TreeNode node) {
    if (node == null) return;
    System.out.print(node.val + " ");
    preorder(node.left);
    preorder(node.right);
}

// Postorder: Left → Right → Root
void postorder(TreeNode node) {
    if (node == null) return;
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.val + " ");
}

// Level-order (BFS)
void levelOrder(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        TreeNode node = queue.poll();
        System.out.print(node.val + " ");
        if (node.left != null)  queue.add(node.left);
        if (node.right != null) queue.add(node.right);
    }
}
// TC: O(n)   SC: O(n) — queue holds widest level (up to n/2 nodes)
```

---

## BST Operations

```java
// Search in BST
TreeNode search(TreeNode root, int val) {
    if (root == null || root.val == val) return root;
    if (val < root.val) return search(root.left, val);
    return search(root.right, val);
}
// TC: O(h)   SC: O(h)
// Balanced: O(log n)   Skewed: O(n)

// Insert in BST
TreeNode insert(TreeNode root, int val) {
    if (root == null) return new TreeNode(val);
    if (val < root.val) root.left = insert(root.left, val);
    else root.right = insert(root.right, val);
    return root;
}
// TC: O(h)   SC: O(h)
```

---

## Height and Depth Problems

```java
// Height of binary tree
int height(TreeNode root) {
    if (root == null) return 0;
    return 1 + Math.max(height(root.left), height(root.right));
}
// TC: O(n) — visits every node   SC: O(h)

// Count nodes
int countNodes(TreeNode root) {
    if (root == null) return 0;
    return 1 + countNodes(root.left) + countNodes(root.right);
}
// TC: O(n)   SC: O(h)
```

---

## Summary

| Operation | Balanced BST | Skewed BST |
|---|---|---|
| Search / Insert / Delete | O(log n) | O(n) |
| Any traversal | O(n) | O(n) |
| Height | O(n) | O(n) |
| Space (all traversals) | O(log n) | O(n) |
| BFS (level-order) space | O(n) | O(1) |