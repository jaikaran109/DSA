package DSA.Tree._05_Advanced_Problems._08_SerializeDeserialize;

import java.util.*;

public class SerializeDeserialize {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public String serialize(TreeNode root) {
        if (root == null) return "null";
        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return buildTree(queue);
    }

    private TreeNode buildTree(Queue<String> queue) {
        String val = queue.poll();
        if (val.equals("null")) return null;
        
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = buildTree(queue);
        node.right = buildTree(queue);
        return node;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        
        SerializeDeserialize obj = new SerializeDeserialize();
        String serialized = obj.serialize(root);
        System.out.println("Serialized: " + serialized);
        
        TreeNode deserialized = obj.deserialize(serialized);
        System.out.println("Deserialized root: " + deserialized.val);
    }
}
