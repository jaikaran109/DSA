package DSA.Tree._01_Tree_Basics._01_BinaryTreeImplementation;

import java.util.*;

class Node {
    public int val;
    public Node left, right;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeNode {
    Scanner sc = new Scanner(System.in);
    private Node root;

    public void buildBinaryTree() {
        root = createTree();
    }

    private Node createTree() {
        System.out.println("Enter Data:");
        int item = sc.nextInt();
        Node nn = new Node(item);

        System.out.println("Enter Bool for inserting in left of " + nn.val + ":");
        boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = createTree();
        }

        System.out.println("Enter Bool for inserting in right of " + nn.val + ":");
        boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.right = createTree();
        }

        return nn;
    }

    public void Display() {
        Display(root);
    }

    private void Display(Node node) {
        if (node == null) {
            return;
        }

        String s = "";
        s = s + node.val;
        s = "<-" + s + "->";

        if (node.left != null) {
            s = node.left.val + s;
        } else {
            s = "." + s;
        }
        if (node.right != null) {
            s = s + node.right.val;
        } else {
            s = s + ".";
        }
        System.out.println(s);
        Display(node.left);
        Display(node.right);

    }

    public boolean find(int item) {
        return find(this.root, item);
    }

    public boolean find(Node root, int item) {
        if (root == null) return false;

        if (root.val == item) return true;

        boolean left = find(root.left, item);
        boolean right = find(root.right, item);

        return left || right;
    }

    public int max() {
        return max(root);
    }

    private int max(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int Left = max(node.left);
        int Right = max(node.right);

        return Math.max(node.val, Math.max(Left, Right));
    }

    public int height() {
        return height(this.root);
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }

        int lh = height(node.left);
        int rh = height(node.right);

        return Math.max(lh, rh) + 1;
    }

    public void levelOrd() {
        levelOrd(root);
    }

    private void levelOrd(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node rv = queue.poll();
            System.out.print(rv.val + " ");
            if (rv.left != null) {
                queue.add(rv.left);
            }
            if (rv.right != null) {
                queue.add(rv.right);
            }
        }
    }

    public void levelOrder() {
        List<Double> list = new ArrayList<>();
        levelVisePrinting(root, list);
        System.out.println(list);
    }

    public List<List<Integer>> levelVisePrinting(Node root, List<Double> list) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node x = q.remove();
                level.add(x.val);
                if (x.left != null)
                    q.add(x.left);
                if (x.right != null)
                    q.add(x.right);
            }
            int sum = 0;
            for (int val : level) {
                sum += val;
            }
            list.add(sum / (double) q.size());
            result.add(level);
        }
        System.out.println();
        return result;
    }

    public static Node LCA(Node root, Node p, Node q) {
        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        Node left = LCA(root.left, p, q);

        Node right = LCA(root.right, p, q);

        if (right != null && left != null) {
            return root;

        } else if (left == null) {
            return right;
        }
        return left;
    }

    private void removeLeaves() {
        removeLeaves(null, root, false);
    }

    private void removeLeaves(Node parent, Node child, boolean ilc) {
        if (child == null) {
            return;
        }

        // If the node is a leaf
        if (child.left == null && child.right == null) {
            if (ilc) {
                parent.left = null;
            } else {
                parent.right = null;
            }
            return;
        }

        // Recursively call for left and right children
        removeLeaves(child, child.left, true);
        removeLeaves(child, child.right, false);
    }

    private void sibling(Node node) {
        if (node == null) {
            return;
        }

        // If the node has only one child, print that child
        if (node.left != null && node.right == null) {
            System.out.print(node.left.val + " ");
        } else if (node.left == null && node.right != null) {
            System.out.print(node.right.val + " ");
        }

        // Recur for left and right subtrees
        sibling(node.left);
        sibling(node.right);
    }

    private void build(int preorder[], int[] inorder) {
        root = build(preorder, inorder, Integer.MIN_VALUE);
    }

    private int i = 0;
    private int p = 0;

    private Node build(int[] preorder, int[] inorder, int stop) {
        if (p >= preorder.length) {
            return null;
        }

        if (inorder[i] == stop) {
            ++i;
            return null;
        }

        Node node = new Node(preorder[p++]);
        node.left = build(preorder, inorder, node.val);
        node.right = build(preorder, inorder, stop);
        return node;
    }

    public boolean symmetricity(Node node1, Node node2) {
        if (node1 == null || node2 == null)
            return node1 == node2;

        if (node1.val != node2.val)
            return false;

        boolean s1 = symmetricity(node1.left, node2.right);
        boolean s2 = symmetricity(node1.right, node2.left);
        return s1 && s2;
    }

    public int heightBinaryTree(Node root) {
        if (root == null) return 0;

        int left = heightBinaryTree(root.left);
        int right = heightBinaryTree(root.right);

        return Math.max(left, right) + 1;
    }

    public int minDepthBinaryTree(Node root) {
        if (root == null) return 0;

        int left = minDepthBinaryTree(root.left);
        int right = minDepthBinaryTree(root.right);

        if (root.left == null) return right + 1;
        if (root.right == null) return left + 1;

        return Math.min(left, right) + 1;
    }

    int maxdia = 0;

    public int diameterBinaryTree(Node root) {
        dia(root);
        return maxdia;
    }

    public void dia(Node root) {
        if (root == null) return;

        int left_height = heightBinaryTree(root.left);
        int right_height = heightBinaryTree(root.right);

        maxdia = Math.max(left_height + right_height, maxdia);

        dia(root.left);
        dia(root.right);
    }

    public boolean isBalanced(Node root) {
        if (root == null) return true;

        // find left height
        int leftHeigth = heightBinaryTree(root.left);
        // find right height
        int rightHeight = heightBinaryTree(root.right);

        if (Math.abs(leftHeigth - rightHeight) > 1) return false;

        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);

        if (!left || !right) return false;

        return true;

    }

    public boolean flipEquiv(Node root1, Node root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val == root2.val) {
            boolean without_flip = flipEquiv(root1.left, root2.left) &&
                    flipEquiv(root1.right, root2.right);

            boolean with_flip = flipEquiv(root1.left, root2.right) &&
                    flipEquiv(root1.right, root2.left);

            return without_flip || with_flip;
        }
        return false;
    }

    public void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node node = q.poll();
            System.out.print(node.val + " ");
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
    }

    public void levelVisePrinting(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                System.out.print(node.val + " ");
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            System.out.println();
        }
    }

    public void HELP() {

        //finding an element
        System.out.println(find(root, 1));

        // symmetric
        boolean bool = symmetricity(root.left, root.right);
        System.out.println(bool);

        // height
        System.out.println(heightBinaryTree(root));

        // minDepthBinaryTree
        System.out.println(minDepthBinaryTree(root));

        // diameter
        System.out.println(diameterBinaryTree(root));

        // flip
        bool = flipEquiv(root.left, root.right);
        System.out.println(bool);

        // is balance
        bool = isBalanced(root);
        System.out.println(bool);

        //level order printing..
        System.out.println("level Vise printing value");
        levelVisePrinting(root);
    }

}

class Main {
    public static void main(String[] args) {
        BinaryTreeNode bt = new BinaryTreeNode();

        bt.buildBinaryTree();
//        bt.HELP();
//        bt.build(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});

//        bt.removeLeaves();
        bt.Display();

//        System.out.println(bt.find(7));
//        System.out.println(bt.max());
//        System.out.println(bt.height());

//        bt.levelOrd();
//        System.out.println();
//
//        System.out.println("-------------------------");
//
//        bt.levelOrder();

    }
}

// input : 1 true 2 true 3 false false true 4 false false true 5 true 6 false false true 7 false false
