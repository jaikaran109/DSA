package Trees;

public class inorderTraversal {

    public static class Node {

        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);
        root.left = a;
        root.right = b;

        Node c = new Node(40);
        Node d = new Node(50);
        a.left = c;
        a.right = d;

        Node e = new Node(60);
        b.right = e;

        inorder(root);

    }

}
