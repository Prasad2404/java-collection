package com.test.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {

		Deque<String> queue=new ArrayDeque<>();
		queue.add("A");
		queue.addFirst("Z");
		queue.addLast("Y");
		System.out.println(queue);
		
		queue.remove();
		queue.add("p");
		queue.peek();
		
		queue.poll();
		System.out.println(queue);
	}

}