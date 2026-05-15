class Solution {
    int totalSum = 0;
    public int findTilt(TreeNode root) {
        sum(root);
        return totalSum;
    }
    public int sum(TreeNode node){
        if(node == null) return 0;
        int left = sum(node.left);
        int right = sum(node.right);
        totalSum += Math.abs(left - right);
        return left + right + node.val;
    }
}
