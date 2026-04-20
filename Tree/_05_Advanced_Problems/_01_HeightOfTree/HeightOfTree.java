package DSA.Tree._05_Advanced_Problems._01_HeightOfTree;

public class HeightOfTree {
    class TreeNode {
        int val;
        TreeNode left, right;

        // Constructor
        TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    public void makeTree(){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
    }

    public static void main(String[] args) {

    }
}
