package com.test.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		Queue<Integer> queue=new PriorityQueue<>(5);
		queue.add(11);
		queue.add(12);
		queue.add(13);
		queue.add(14);
		queue.add(15);
		
		
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.offer(67));
		System.out.println(queue.element());
	}

}