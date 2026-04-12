package Assessment_05;
import java.util.*;

class StackArray{
    int arr[];
    int top;
    int size;

    StackArray(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int x){
        if(top == size - 1){
            System.out.println("Stack Overflow");
            return ;
        }
        top++;
        arr[top] = x;
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = arr[top];
        top--;
        return val;
    }

    int peek(){
        if(top == -1){
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty(){
        return top == -1;
    }
}
public class stackUsingArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StackArray st = new StackArray(n);
        for (int i = 0; i < 5; i++) {
            int value = input.nextInt();
            st.push(value);
        }
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
