package Trees;


// Number of elements present
public class sizeOfBT {

	public static class Node{
			
			int val; // 0
			Node left; // null
			Node right; // null
			
			public Node(int val) {
				this.val = val;
			}
		}

	public static int size(Node root) {
		if(root == null) return 0;
		return size(root.left) + size(root.right) + 1;
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
		
		System.out.println(size(root));

	}

}
