package StacksAndQueues;

import java.util.*;

public class copyStack {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		int size = input.nextInt();
		for(int i = 1 ; i <= size ; i++) {
			int x = input.nextInt();
			st.push(x);
		}
		System.out.println(st); 
		
		
//		reverse
		Stack<Integer> rev = new Stack<>();
		while(!st.isEmpty()) {
			rev.push(st.pop());
		}
		System.out.println(rev);
		
		
		Stack<Integer> copy = new Stack<>();
		while(!rev.isEmpty()) {
			copy.push(rev.pop());
		}
		System.out.println(copy);
	}

}
