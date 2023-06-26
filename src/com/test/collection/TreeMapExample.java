package com.test.collection;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
	
		NavigableMap map=new TreeMap<>();

		TreeMap<String, String> map2=new TreeMap<>();
		
		map2.put("1", "One");
		map2.put("2", "Two");
		map2.put("3", "Three");
		
		System.out.println(map2);
		
		for(Map.Entry m:map2.entrySet())
		{
			System.out.println(m.getKey() + " "+m.getValue());
		}
		
	}

}
