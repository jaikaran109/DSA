package DSA.Tree._03_Binary_Search_Tree._01_BSTImplementation;

import java.util.ArrayList;
// Validate Binary Search Tree
class BST {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }
    private TreeNode root;

    private void buildTree(int arr[]) {
        for (int val : arr) {
            root = insert(root, val);
        }
    }
    private TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Method to perform an inorder traversal of the BST
    private void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    // finding an element.
    private boolean find(TreeNode root, int element) {
        if (root == null) {
            return false;
        }
        if (root.val == element) {

            return true;
        }
        if (root.val > element) {
            return find(root.left, element);
        } else {
            return find(root.right, element);
        }
    }

    // Method to find max.
    private int max(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int max = max(root.right);
        return Math.max(max, root.val);
    }

    public TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // deletion fo node
    public int successor(TreeNode root) { // max element of right side
        // 1. right side
        root = root.right;
        // 2. minimum value
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }

    // method definition of predecessor
    public int predecessor(TreeNode root) { // min element of left side
        // 1. left side
        root = root.left;
        // 2. maximum value
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        // 1. Search the key in the given tree
        // base case condition
        if (root == null) {
            return null;
        }

        // traverse towards the right subtree - recursion
        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }

        // traverse towards the left subtree - recursion
        else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            // case 1: node to be deleted is the leaf node
            if (root.left == null && root.right == null) {
                root = null;
            }

            // case 2: non-leaf node
            else if (root.right != null) {
                // function calling of successor
                // right side - minimum value
                root.val = successor(root);
                root.right = deleteNode(root.right, root.val);
            } else {
                // function calling of predecssor
                // left side - maximum value
                root.val = predecessor(root);
                root.left = deleteNode(root.left, root.val);
            }
        }
        return root;
    }

    ArrayList<Integer> arr = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        inOrderTraversal(root,arr);

        int n = arr.size();

        // whether the inorder traversal of a tree stored in the list is sorted or not
        for (int i = 0; i < n - 1; i++) {
            if (arr.get(i) >= arr.get(i + 1)) {
                return false;
            }
        }

        return true;
    }

    // Kth Smallest Element in BST
    public void inOrderTraversal(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }

        // 1. traverse towards the left side of the node
        inOrderTraversal(root.left, result);
        // 2. store the node value in the result array
        result.add(root.val);
        // 3. traverse towards the right side of the node
        inOrderTraversal(root.right, result);

    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val+" ");

        // 1. traverse towards the left side of the node
        preOrder(root.left);
        // 2. store the node value in the result array

        // 3. traverse towards the right side of the node
        preOrder(root.right);

    }

    // Lowest Common Ancestor Of BST
    public void lca(){
        System.out.println(lowestCommonAncestor(root,new TreeNode(5),new TreeNode(1)).val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentVal = root.val;
        int pVal = p.val;
        int qVal = q.val;

        if (pVal > parentVal && qVal > parentVal) {
            // traverse towards the right subtree
            return lowestCommonAncestor(root.right, p, q);
        } else if (pVal < parentVal && qVal < parentVal) {
            // travese towards the left subtree
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return root;
        }
    }

    // Search in a BST
    public TreeNode searchBST(TreeNode root, int val) {
        // base case condition
        if (root == null || root.val == val) {
            return root;
        }

        // left side via recursion
        if (val < root.val) {
            // recursive call
            return searchBST(root.left, val);
        }


        // right side via recursion
        else {
            // recursive call
            return searchBST(root.right, val);
        }

    }

    // Search for a node
    public TreeNode search(TreeNode root, int key) {
        if (root == null || root.val == key) {
            return root;
        }
        if (root.val > key) {
            return search(root.left, key);
        }
        return search(root.right, key);
    }

    // Delete a node
    public TreeNode delete(TreeNode root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.val) {
            root.left = delete(root.left, key);
        } else if (key > root.val) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.val = findMin(root.right).val;
            root.right = delete(root.right, root.val);
        }

        return root;
    }



    public static void main(String[] args){
        BST obj = new BST();
        int arr[] = {-10,-3,0,5,9};
        obj.buildTree(arr);

//        obj.lca();

//        System.out.print("Inorder Traversal of the BST: ");
        obj.preOrder(obj.root);

//        System.out.println();
//        System.out.print("max element : " + obj.max(obj.root));

//        System.out.println();
//        System.out.print("element fount or not : " + obj.find(obj.root, 6));

//        System.out.println();
//        obj.deleteNode(obj.root,2);
//        obj.inorderTraversal(obj.root);
    }
}
