package com.test.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
	
		Map<String, Integer> map=new HashMap<>();
		
		map.put("Mohan",87);
		map.put("Komal",97);
		map.put("Vikash",85);
		map.put("Raman",77);
		map.put("Ritika",80);
		
		System.out.println(map);
		System.out.println(map.containsKey("Raman"));
		System.out.println(map.containsValue(77));
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println(map.remove("Mohan", 87));
		System.out.println(map.replace("Raman", 77, 76));
		System.out.println(map.get("Vikash"));
		System.out.println(map.getOrDefault("Aman", 71));
		
		
		for(Map.Entry<String , Integer> m:map.entrySet())
		{
			System.out.println(m.getKey() + " "+m.getValue());
		}
		
		
		
		map.clear();
		
		System.out.println(map);

	}

}
