package DSA.Tree._05_Advanced_Problems._03_MaxPathSum;

public class MaxPathSum {

    class TreeNode {
        int val;
        TreeNode left, right;

        // Constructor
        public TreeNode(int item) {
            val = item;
            left = right = null;
        }
    }
    int max = Integer.MIN_VALUE;
    public int helper(TreeNode root){
        if(root==null)
            return 0;
        int left = Math.max(0 , helper(root.left));
        int right = Math.max(0, helper(root.right));
        max = Math.max( max , root.val+left+right );

        return root.val + Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }

    public static void main(String[] args) {

    }
}
