package LinkedList;
public class insertBeforeVal {
	
	private static Node insertBefore(Node head, int target, int val) {
        
		
        if (head == null) return null;


        if (head.data == target) {
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }
        
        Node temp = head;
        
        while (temp.next != null) {
        	
            if (temp.next.data == target) {
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
                break; 
            }
            
            temp = temp.next;
            
        }
        
        return head;
        
    }
	
	private static void display(Node head) {
		
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        
        System.out.println("null");
    }
	
	public static void main(String[] args) {
		
		Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        
        System.out.print("Before: ");
        display(head);
        
        head = insertBefore(head, 20, 15);
        System.out.print("After:  ");
        display(head);
	}
}

// Time Complexity : O(n)
