package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<>(200);//capacity
		ArrayList<String> list2=new ArrayList<>();
		
		List<String> mylist=new ArrayList();
		
		list2.ensureCapacity(10);
		ArrayList list3=new ArrayList<>();
		ArrayList list4=new ArrayList<>();
		list3.add("A");
		list3.add("B");
		list3.add("C");
		list3.add("D");
		list3.add("E");
		list3.add("F");
		
		
		list4.add("C");
		list4.add("D");
		
		/*
		 * System.out.println(list3); System.out.println(list3.size());
		 * System.out.println(list3.remove(0)); System.out.println(list3.remove(12.89));
		 * System.out.println(list3.removeAll(list4));
		 */
		
		System.out.println(list3);
		
		
		list3.clear();
		System.out.println(list3);
		
		list3=list2; //deep copy
		ArrayList<String> newList= (ArrayList<String>) list2.clone();//shallow copy
		/*
		 * System.out.println(list2.addAll(newList)); System.out.println(list2.get(0));
		 * System.out.println(list2.contains(11));
		 * System.out.println(list2.containsAll(newList));
		 * System.out.println(list2.equals(newList));
		 * System.out.println(list2.indexOf(12));
		 * System.out.println(list2.lastIndexOf(56)); 
		 * System.out.println(list2.set(1,
		 * "J"));
		 */
		
		
		//method 1		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		
		
		//method 2
		//standard for loop
		Iterator<String> itr=list1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//method 2
		//advanced for loop
		for(String s:list1)
		{
			System.out.println(s);
		}
		
		
		//method 4
		//for each
		list1.forEach(
				x -> System.out.println(x) //lambda expression
				);
		
		
	    //method 5
		//using list iterator
		
		ArrayList list5=new ArrayList<>();
		list5.add("F");
		list5.add("V");
		list5.add("Z");
		list5.add("B");
		list5.add("C");
		list5.add("D");
		list5.add("E");
		
		
		
		
		
		
		Iterator<String> itr1=list5.listIterator();
		
		System.out.println(list5);
		Collections.sort(list5);
		
		System.out.println(list5);
		
		ArrayList a=new ArrayList<>();
		a.add("Aman");
		a.add("Bhushan");
		a.add("Raman");
		
		
		 System.out.println(a);
		 Predicate<String> p=(x) -> x.startsWith("B");
		 a.removeIf(p);
		 System.out.println(a);
		 
		 
		 List<String> langs=new ArrayList<>();
		 langs.add("C");
		 langs.add("C++");
		 langs.add("C#");
		 langs.add("Java");
		 langs.add("python");
		 
		 
		 for(String l:langs)
		 {
			 if(langs.contains("Java"))
			 {
				 langs.remove(l);
			 }
		 }

		
		
	}

}
