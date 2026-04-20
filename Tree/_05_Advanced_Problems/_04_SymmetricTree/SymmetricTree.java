package DSA.Tree._05_Advanced_Problems._04_SymmetricTree;

public class SymmetricTree {
    class TreeNode {
        int val;
        TreeNode left, right;

        // Constructor
        public TreeNode(int item) {
            val = item;
            left = right = null;
        }
    }
    public boolean check(TreeNode left , TreeNode right){
        if(left==null && right==null)
            return true;
        if(left==null || right==null)
            return false;
        if(left.val!=right.val)
            return false;
        return check(left.left,right.right) && check(left.right,right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }
}
