package StacksAndQueues;

import java.util.*;

public class BalancesBrackets {

	
	static boolean balanced(String str) {
		Stack<Character> st = new Stack<>();
		for(char ch : str.toCharArray()) {
			if(ch == '(') st.push(ch);
			else if(ch == ')') {
				if(st.size() == 0) return false;
				if(st.peek() == '(') st.pop();
			}
		}
		return st.isEmpty();
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		Stack<Character> st = new Stack<>();
		System.out.println(balanced(str));

	}

}
