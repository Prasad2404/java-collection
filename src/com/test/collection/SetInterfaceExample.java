package com.test.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;

public class SetInterfaceExample {

	public static void main(String[] args) {
		
		
		Set<String> set=new HashSet<>();
		set.add("A");
		set.add("E");
		set.add("I");
		set.add("O");
		set.add("U");
		
		System.out.println(set.size());
		System.out.println(set.contains("O"));
		System.out.println(set.isEmpty());
		System.out.println(set.remove("U"));
		//set.clear();

		//splitIterator	: fail-fast iterator over the elements in the set.
		
		Spliterator<String> itr=set.spliterator();
		
		itr.forEachRemaining(System.out::println);
		
		//System.out.println(set);
		
	}

}
