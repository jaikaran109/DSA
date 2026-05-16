class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;   // -- Combined Comparision


        // int left = 1 + maxDepth(root.left);  -- Max of Left subtree
        // int right = 1 + maxDepth(root.right); -- Max of Right Subtree
        // return Math.max(left,right); -- Max bw Both 

    }
}
