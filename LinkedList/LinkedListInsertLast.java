package LinkedList;

import java.util.*;

public class LinkedListInsertLast {

    static Node head = null;

    static void insertLast(int val){

        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    static void display(){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            insertLast(val);
        }

        display();
    }
}


//	TC : O(n)
