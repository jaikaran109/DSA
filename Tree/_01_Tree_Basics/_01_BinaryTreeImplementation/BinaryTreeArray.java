package DSA.Tree._01_Tree_Basics._01_BinaryTreeImplementation;
public class BinaryTreeArray {
    String[] tree;
    int size;

    public BinaryTreeArray(int capacity) {
        tree = new String[capacity];
        size = 0;
    }

    // Add root
    public void setRoot(String value) {
        tree[0] = value;
        size = Math.max(size, 1);
    }

    // Add left child at index i
    public void setLeft(int i, String value) {
        int leftIndex = 2 * i + 1;
        if (i >= size || leftIndex >= tree.length) {
            System.out.println("Invalid position");
            return;
        }
        tree[leftIndex] = value;
        size = Math.max(size, leftIndex + 1);
    }

    // Add right child at index i
    public void setRight(int i, String value) {
        int rightIndex = 2 * i + 2;
        if (i >= size || rightIndex >= tree.length) {
            System.out.println("Invalid position");
            return;
        }
        tree[rightIndex] = value;
        size = Math.max(size, rightIndex + 1);
    }

    // Display tree
    public void display() {
        for (int i = 0; i < size; i++) {
            if (tree[i] != null)
                System.out.println("Node at index " + i + ": " + tree[i]);
            else
                System.out.println("Node at index " + i + ": NULL");
        }
    }

    public static void main(String[] args) {
        BinaryTreeArray bt = new BinaryTreeArray(15);
        bt.setRoot("A");
        bt.setLeft(0, "B");
        bt.setRight(0, "C");
        bt.setLeft(1, "D");
        bt.setRight(1, "E");
        bt.setLeft(2, "F");

        bt.display();
    }
}

