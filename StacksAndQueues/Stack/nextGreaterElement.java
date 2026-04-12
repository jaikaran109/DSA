package StacksAndQueues;

import java.util.*;

public class nextGreaterElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		
		int[] res = new int[size];
		Stack<Integer> st = new Stack<>();
		res[size - 1] = -1;
		st.push(arr[size - 1]);
		for(int i = size - 2 ; i >= 0 ; i--) {
			while(!st.isEmpty() && st.peek() <= arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) res[i] = -1;
			else res[i] = st.peek();
			st.push(arr[i]);
		}
		for(int i = 0 ; i < size ; i++) {
			System.out.print(res[i] + " ");
		}
		
		
		
//		via Loop
//		for(int i = 0 ; i < size ; i++) {
//			res[i] = -1;
//			for(int j = i + 1 ; j < size ; j++) {
//				if(arr[j] > arr[i]){
//					res[i] = arr[j];
//					break;
//				}
//			}
//		}
//		for(int i = 0 ; i < size ; i++) {
//			System.out.print(res[i] + " ");
//		}
	}

}
