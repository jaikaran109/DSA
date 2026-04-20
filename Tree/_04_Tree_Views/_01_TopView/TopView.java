package DSA.Tree._04_Tree_Views._01_TopView;

import java.util.*;

public class TopView {
    class TreeNode{
        int val;
        private TreeNode left;
        private TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    };
    private TreeNode root;
    public void buildTree(){
        root = bt(root);
    }
    Scanner sc = new Scanner(System.in);
    public TreeNode bt(TreeNode root){
        int data = sc.nextInt();
        TreeNode new_node = new TreeNode(data);

        boolean bool = sc.nextBoolean();
        if(bool){
            new_node.left = bt(new_node);
        }
        bool = sc.nextBoolean();
        if(bool){
            new_node.right = bt(new_node);
        }
        return new_node;
    }
    class Pair{
        TreeNode node;
        int x;

        Pair(TreeNode node, int x){
            this.node = node;
            this.x = x;
        }
    }
    public void topView(){
        List<Integer> list = topView(root);
        System.out.println(list);
    }
    public List<Integer> topView(TreeNode root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root,0));

        while(!q.isEmpty()){
            Pair tuple = q.poll();
            TreeNode node = tuple.node;
            int x = tuple.x;


            if(!map.containsKey(x)){
                map.put(x, node.val);
            }

            if(node.left != null) q.offer(new Pair(node.left,x-1));
            if(node.right != null) q.offer(new Pair(node.right,x+1));
        }

        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()){

            list.add(map.get(key));
        }
        return list;
    }

    public static void main(String[] args) {
        TopView obj = new TopView();
        obj.buildTree();
        obj.topView();
    }
}
// 3 true 9 false false true 20 true 15 false false true 7 false false