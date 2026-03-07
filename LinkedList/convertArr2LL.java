package LinkedList;


public class convertArr2LL {

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
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		Node head = Arr2LL(arr);
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}

}
