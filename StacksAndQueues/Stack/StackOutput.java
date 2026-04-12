package StacksAndQueues;

import java.util.*;

public class StackOutput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		stack.push(23);
		stack.push(443);
		stack.push(3);
		stack.push(4);
		stack.push(232323232);
		stack.push(234345);
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
//		System.out.println(stack.pop()); -- error - EmptyStackException
		
	}

}
