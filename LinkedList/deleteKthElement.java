package LinkedList;

public class deleteKthElement {
	
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
	private static void display(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("End");
	}
	private static Node delete_KthElement(Node head , int k){
		if(head == null) return null;
		if(k == 1) {
			head = head.next;
			return head;
		}
		int count = 0;
		Node temp = head;
		Node prev = null;
		while(temp != null) {
			count++;
			if(count == k) {
				prev.next = prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
		
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		Node head = Arr2LL(arr);
		display(head);
		int k = 3;
		head = delete_KthElement(head,k);
		display(head);
	}

}
