package DSA.Tree._04_Tree_Views._04_VerticalOrderTraversal;
import java.util.*;
public class VerticalOrdPrinting {
    class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    };
    private Node root;

    public void buildTree(String input){
        String[] parts = input.split(" ");

        // Convert the input into an array of integers
        int[] nodes = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nodes[i] = Integer.parseInt(parts[i]);
        }
        root = bt(nodes);
        verticalOrdPrinting(root);
    }
    class Tuple{
        Node node;
        int v;
        int l;
        Tuple(Node node, int v, int l){
            this.node = node;
            this.v = v;
            this.l = l;
        }
    }
    public void verticalOrdPrinting(Node root){
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root,0,0));
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        while(!q.isEmpty()){

            Tuple tuple = q.poll();
            Node node = tuple.node;
            int v = tuple.v;
            int l = tuple.l;

            map.putIfAbsent(v, new TreeMap<>());
            map.get(v).putIfAbsent(l, new PriorityQueue<>());
            map.get(v).get(l).add(node.val);


            if(node.left != null){
                q.offer(new Tuple(node.left,v-1,l+1));
            }
            if(node.right != null){
                q.offer(new Tuple(node.right,v+1,l+1));
            }
        }

        for(TreeMap<Integer,PriorityQueue<Integer>> levels : map.values()){
            List<Integer> list = new ArrayList<>();
            for(PriorityQueue<Integer> pq : levels.values()){
                while(!pq.isEmpty()){
                    list.add(pq.peek());
                    pq.poll();
                }
            }
            System.out.println(list);
        }
    }
    public Node bt(int[] nodes) {
        if (nodes.length == 0 || nodes[0] == -1) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        Node root = new Node(nodes[0]);
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty() && index < nodes.length) {
            Node current = queue.poll();
            // Left child
            if (index < nodes.length && nodes[index] != -1) {
                current.left = new Node(nodes[index]);
                queue.add(current.left);
            }
            index++;
            // Right child
            if (index < nodes.length && nodes[index] != -1) {
                current.right = new Node(nodes[index]);
                queue.add(current.right);
            }
            index++;
        }
        return root;
    }

    public static void main(String[] args) {
        String input = "1 2 3 4 5 6 7 -1 -1 -1 -1 -1 8 -1 9 -1 -1 -1 -1";
        VerticalOrdPrinting obj =  new VerticalOrdPrinting();
        obj.buildTree(input);
    }
}
