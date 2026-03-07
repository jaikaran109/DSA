package LinkedList;


public class insertKthPosition {

	private static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
	
	private static Node insert(Node head , int val , int k) {
		if(head == null) {
			if(k == 1) return new Node(val);
			else return null;
		}
		 if(k == 1) {
			 Node x = new Node(val);
			 x.next = head;
			 return x;
		 }
		 
		 int count = 0;
		 Node temp = head;
		 while(temp != null) {
			 count++;
			 if(count == k - 1) {
				 Node x = new Node(val);
				 x.next = temp.next;
				 temp.next = x;
				 break;
			 }
			 temp = temp.next;
		 }
		 return head;
	}
	public static void main(String[] args) {
		Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("Display Original -- ");
        display(head);
        
        int index = 2;
		int val = 999;
		head = insert(head,val,index);
		System.out.println("Display Result -- ");
		display(head);
		
		

	}

}


// Time Complexity : O(n)
