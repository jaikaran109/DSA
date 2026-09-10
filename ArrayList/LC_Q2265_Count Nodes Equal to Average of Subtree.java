class Solution {
    int count = 0;

    public int averageOfSubtree(TreeNode root) {
        solve(root);
        return count;
    }

    private void solve(TreeNode root) {
        if (root == null) return;
        List<Integer> temp = new ArrayList<>();
        collect(root, temp);
        
        int sum = 0;
        for (int val : temp) sum += val;
        
        // agr sare subtree ka avg root ke value ke equal h to +1
        if (sum / temp.size() == root.val) count++;

        solve(root.left);
        solve(root.right);
    }

    private void collect(TreeNode node, List<Integer> temp) {
        if (node == null) return;
        temp.add(node.val);
        collect(node.left, temp);
        collect(node.right, temp);
    }
}
