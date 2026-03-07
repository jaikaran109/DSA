package LinkedList;


public class LengthLL {
	
private static Node Arr2LL(int[] arr) {
		
		if(arr.length == 0) return null;
		
		Node head = new Node(arr[0]);
		
		Node mover = head;
		
		for(int i = 1 ; i < arr.length ; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		
		return head;
		
	}

	private static int length(Node head) {
		int count = 0;
		Node temp = head;
		while(temp != null) {
			count++;
			temp =  temp.next;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		Node head = Arr2LL(arr);
		System.out.println(length(head));

	}

}

package LinkedList;


public class LengthLL {
	
private static Node Arr2LL(int[] arr) {
		
		if(arr.length == 0) return null;
		
		Node head = new Node(arr[0]);
		
		Node mover = head;
		
		for(int i = 1 ; i < arr.length ; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		
		return head;
		
	}

	private static int length(Node head) {
		int count = 0;
		Node temp = head;
		while(temp != null) {
			count++;
			temp =  temp.next;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		Node head = Arr2LL(arr);
		System.out.println(length(head));

	}

}

// TC : O(n)

