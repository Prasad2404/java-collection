/**
 * 
 */
package com.test.collection;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Chittaranjan
 *
 */
public class LinkedHashMapExample {
	
	public static void main(String[] args) {
		
		Map<String, String> map=new LinkedHashMap<>();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "3");
		map.put("D", "4");
		map.put("E", "5");
		
		System.out.println(map);
		
		
		LinkedHashMap<String, String> map2=new LinkedHashMap<>();
	}

}
