package com.test.collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	list.add("E");
	
	System.out.println(list);
	
	list.remove();	
	
	System.out.println(list);
	
	list.remove(0);
	
	System.out.println(list);
	list.remove("E");
	
	System.out.println(list);
	
	list.removeLast();
	
	System.out.println(list);
	System.out.println(list.size());
	System.out.println(list.get(0));
	
	//iterate over LinkedList
	
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i));
	}
	
	
	LinkedList<Integer> list1=new LinkedList<>();
	list1.add(new Integer(88));
	list1.add(new Integer(44));
	list1.add(new Integer(11));
	list1.add(new Integer(91));
	list1.add(new Integer(77));
	
	System.out.println(list1);
	Collections.sort(list1);
	
	System.out.println(list1);
	
	
	
	
	
	
	}

}
