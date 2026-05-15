class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        List<Integer> l = postorderTraversal(root.left);
        List<Integer> r = postorderTraversal(root.right);
        list.addAll(l);
        list.addAll(r);
        list.add(root.val);
        return list;
    }
}
