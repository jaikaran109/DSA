package Trees;

public class maxValue {

	public static class Node{
			
			int val; // 0
			Node left; // null
			Node right; // null
			
			public Node(int val) {
				this.val = val;
			}
		}

	public static int max(Node root) {
		if(root == null) return Integer.MIN_VALUE;
		return Math.max(root.val,Math.max(max(root.left), max(root.right)));
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
		
		System.out.println(max(root));

	}

}
