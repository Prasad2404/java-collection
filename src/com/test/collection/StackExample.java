package com.test.collection;

import java.util.Stack;

public class StackExample {
	
	public static void main(String args[])
	{
		//Default initialization of stack
		Stack stack=new Stack<>(); 
		
		//Initialization using generics
		Stack<Integer> stack1=new Stack<>(); 

		
		stack.push(12);
		stack.push(45);
		stack.push(88);
		stack.push(22);
		stack.push(99);
		
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		
		
		System.out.println(stack);
		
		
		
		
	}

}
 