class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        list.add(root.val);
        List<Integer> l = preorderTraversal(root.left);
        List<Integer> r = preorderTraversal(root.right);
        list.addAll(l);
        list.addAll(r);
        return list;
    }
}
