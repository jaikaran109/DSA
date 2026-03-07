package LinkedList;


public class MidElement {
	
	Node head;
	
	void insert(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	
	void middle() {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
	}
	
	public static void main(String[] args) {
		MidElement list = new MidElement();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		
		list.middle();
	}



  // TC : O(n)
}
