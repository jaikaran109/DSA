package LinkedList;



public class searchTarget {
	
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

	private static int search(Node head , int val) {
		Node temp = head;
		while(temp != null) {
			if(temp.data == val) return 1;
			temp =  temp.next;
		}
		return 0;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		Node head = Arr2LL(arr);
		System.out.println(search(head,5));

	}

}


// TC : O(n)
