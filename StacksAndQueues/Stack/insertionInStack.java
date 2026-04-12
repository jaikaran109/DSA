package StacksAndQueues;

import java.util.*;

public class insertionInStack {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		Stack<Integer> st = new Stack<>();
		for(int i = 1 ; i <= size ; i++) {
			int x = input.nextInt();
			st.push(x);
		}
		System.out.println(st);
		
		
		int insertPosition = input.nextInt();
		int insertVal = input.nextInt();

		if(insertPosition < 0 || insertPosition > st.size()) {
		    System.out.println("Invalid position");
		    return;
		}
		
		
		Stack<Integer> temp = new Stack<>();
		int k = st.size() - insertPosition;
		while(k-- > 0) {
			temp.push(st.pop());
		}
		st.push(insertVal);
		
		
		while(!temp.isEmpty()) {
			st.push(temp.pop());
		}
		System.out.println(st);

	}

}
