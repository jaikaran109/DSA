package LinkedList;

public class LLinsertFirst {

	Node head;
	
	void insert(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	
	void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println("End");
	}
	public static void main(String[] args) {
		
		LLinsertFirst list = new LLinsertFirst();
		
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		
		list.display();
	}


  // TC : O(n)
}


