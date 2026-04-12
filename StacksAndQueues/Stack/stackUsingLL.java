package Assessment_05;
import java.util.*;


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class stackLL{
    Node top;

    void push(int x){
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    int pop(){
        if(top == null){
            System.out.println("stack Underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    int peek(){
        if(top == null) return -1;
        return top.data;
    }

    boolean isEmpty(){
        return top == null;
    }
}


public class stackUsingLL {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        stackLL stack = new stackLL();
        for (int i = 1; i <= 5; i++) {
            int value = input.nextInt();
            stack.push(value);
        }
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
