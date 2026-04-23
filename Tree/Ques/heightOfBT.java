package Trees;


public class heightOfBT {

	public static class Node{
			
			int val; // 0
			Node left; // null
			Node right; // null
			
			public Node(int val) {
				this.val = val;
			}
		}

	public static int height(Node root) {
		if(root == null) return 0;
		if(root.left == null && root.right == null) return 0;
		return 1 + Math.max(height(root.left),height(root.right));
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
		
		System.out.println(height(root));

	}

}
