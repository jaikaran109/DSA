class Solution {
    public TreeNode invertTree(TreeNode root) {

        if(root == null) return null;

        // Swap
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursive Call
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
