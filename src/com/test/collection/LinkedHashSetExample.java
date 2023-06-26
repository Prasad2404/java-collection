package com.test.collection;

import java.util.LinkedHashSet;
import java.util.Set;

import com.google.common.collect.Sets;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> set1=new LinkedHashSet<>();
		LinkedHashSet<String> set2=new LinkedHashSet<>();
		set1.add("Java");		
		set1.add("C");
		set1.add("C++");
		set1.add("C#");
		set1.add("Python");
		
		
		set2.add("Java");
		set2.add("Python");
		set2.add("C++");
		
		
		Set<String> finalSet=Sets.union(set1, set2);
		System.out.println(finalSet);
		
		set1.removeAll(set2);
		
		
		System.out.println(set1);
		
		
	}

}