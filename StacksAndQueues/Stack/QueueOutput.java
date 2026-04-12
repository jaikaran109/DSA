package StacksAndQueues;

import java.util.*;

public class QueueOutput {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(3);
		queue.add(6);
		queue.add(7);
		queue.add(10);
		queue.add(19);
		
		System.out.println(queue.remove());

	}

}
