package Trees;

public class implementation {

	public static class Node{
		
		int val; // 0
		Node left; // null
		Node right; // null
		
		public Node(int val) {
			this.val = val;
		}
	}	
	
//	 Preorder Traversal
	public static void display(Node root) {
		if(root == null) return ;
		System.out.print(root.val + " --> ");
		if(root.left != null) System.out.print(root.left.val + "  ");
		if(root.right != null) System.out.print(root.right.val);
		System.out.println();
		display(root.left);
		display(root.right);
	}
	public static void main(String[] args) {
//		Node root = new Node(10);
//		System.out.println(root.val); // 10
//		System.out.println(root.left);// null
//		System.out.println(root.right);// null

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
		
		display(root);
	}

}
