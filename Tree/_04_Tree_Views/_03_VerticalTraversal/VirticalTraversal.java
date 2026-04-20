package DSA.Tree._04_Tree_Views._03_VerticalTraversal;
import java.util.*;
// we are taking PriorityQueue so that elements are sorted(for overlapped element) in order
public class VirticalTraversal {
    class TreeNode{
        int val;
        private TreeNode  left;
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
    class Tuple{
        TreeNode node;
        int x;
        int y;
        Tuple(TreeNode node,int x,int y){
            this.node = node;
            this.x = x;
            this.y = y;
        }
    }
    public void verticalTraversal(){
        List<List<Integer>> list = verticalTraversal(root);
        System.out.println(list);
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<Tuple>();
        q.add(new Tuple(root,0,0));

        while(!q.isEmpty()){
            Tuple tuple = q.poll();
            TreeNode node = tuple.node;
            int x = tuple.x;
            int y = tuple.y;

            if(!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y,new PriorityQueue<>());
            }

            map.get(x).get(y).offer(node.val);
            if(node.left != null) q.offer(new Tuple(node.left,x-1,y+1));
            if(node.right != null) q.offer(new Tuple(node.right,x+1,y+1));
        }

        List<List<Integer>> list = new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> y : map.values()){
            List<Integer> temp = new ArrayList<>();
            for(PriorityQueue<Integer> nodes : y.values()){
                while(!nodes.isEmpty()){
                    System.out.print(nodes.peek()+" ");
                    temp.add(nodes.poll());
                }
            }
            list.add(new ArrayList<>(temp));
        }
        return list;
    }

    public static void main(String[] args) {
        VirticalTraversal obj = new VirticalTraversal();
        obj.buildTree();
        obj.verticalTraversal();
    }
}

