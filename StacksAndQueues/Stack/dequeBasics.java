package StacksAndQueues;

import java.util.*;

public class dequeBasics {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.add(89);
		deque.addFirst(34);
		deque.addLast(900);
		System.out.println(deque);
		System.out.println(deque.removeFirst());
		System.out.println(deque.removeLast());

	}

}
