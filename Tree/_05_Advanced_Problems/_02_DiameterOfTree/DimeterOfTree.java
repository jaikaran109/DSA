package DSA.Tree._05_Advanced_Problems._02_DiameterOfTree;

public class DimeterOfTree {
    class TreeNode {
        int val;
        TreeNode left, right;

        // Constructor
        public TreeNode(int item) {
            val = item;
            left = right = null;
        }
    }
    int max =  0;
    public int height(TreeNode root){
        if(root==null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        max = Math.max( max , left+right );

        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return max;
    }

}
