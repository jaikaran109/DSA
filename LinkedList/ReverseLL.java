package LinkedList;


public class ReverseLL {

	Node head;
	
	void insertLast(int val) {
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
	
	void reverse() {
		Node prev = null;
		Node curr = head;
		Node next;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data +"  ");
			temp = temp.next;
		}
		System.out.println("End");
	}
	public static void main(String[] args) {
		
		ReverseLL list = new ReverseLL();
		list.insertLast(10);
		list.insertLast(20);
		list.insertLast(30);
		list.insertLast(40);
		
		list.reverse();
		list.display();
		
	}


  // TC : O(n)

}
