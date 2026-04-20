package DSA.Tree._05_Advanced_Problems._06_UniqueBST;
import java.util.*;
public class DifferentWaysToBuildTree {
    class TreeNode {
        int value;
        TreeNode left, right;
        TreeNode(int value) {
            this.value = value;
            left = right = null;
        }
    }

    TreeNode insert(TreeNode root, int value) {
        if (root == null) return new TreeNode(value);
        if (value < root.value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    // Example: Constructing a simple binary tree recursively
    TreeNode buildTree(int[] arr, int index) {
        if (index >= arr.length) return null;
        TreeNode node = new TreeNode(arr[index]);
        node.left = buildTree(arr, 2 * index + 1);
        node.right = buildTree(arr, 2 * index + 2);
        return node;
    }



    // Using BFS to build a binary tree from an array representation
    TreeNode buildTree(int[] arr) {
        if (arr.length == 0) return null;
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (i < arr.length) {
            TreeNode current = queue.poll();
            if (i < arr.length) {
                current.left = new TreeNode(arr[i++]);
                queue.add(current.left);
            }
            if (i < arr.length) {
                current.right = new TreeNode(arr[i++]);
                queue.add(current.right);
            }
        }
        return root;
    }




    TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) return null;
        int rootValue = preorder[preStart];
        TreeNode root = new TreeNode(rootValue);

        // Find the index of root in inorder array
        int inIndex = inStart;
        while (inorder[inIndex] != rootValue) {
            inIndex++;
        }

        int leftTreeSize = inIndex - inStart;
        root.left = buildTreeHelper(preorder, preStart + 1, preStart + leftTreeSize, inorder, inStart, inIndex - 1);
        root.right = buildTreeHelper(preorder, preStart + leftTreeSize + 1, preEnd, inorder, inIndex + 1, inEnd);
        return root;
    }



    // Building a Balanced Binary Search Tree
    TreeNode buildBalancedBST(int[] sortedArray, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(sortedArray[mid]);
        node.left = buildBalancedBST(sortedArray, start, mid - 1);
        node.right = buildBalancedBST(sortedArray, mid + 1, end);
        return node;
    }







}
