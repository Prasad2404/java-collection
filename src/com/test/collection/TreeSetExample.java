package com.test.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		TreeSet<String> set=new  TreeSet<>();
		String s=null;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter string object:");
			s=br.readLine();
			set.add(s);
		}
		
		
		
		set.add("SQL");
		set.add("MYSQL");
		set.add("SQL SERVER");
		set.add("ORACLE COMMUNITY SERVER");
		set.add("MONGO DB");
		set.add("FIREBASE");
		//set.add(null); - null not allowed
		set.add("ORACLE COMMUNITY SERVER");
		System.out.println(set);
		
		List<String> list=new ArrayList<>();
		list.add("Postgres");
		list.add("mariadb");
		
		set.addAll(list);
		set.size();
		set.clone();
		//set.clear();
		//set.contains(list);
		set.remove("SQL");
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		Iterator<String> ditr=set.descendingIterator();
		while(ditr.hasNext())
		{
			System.out.println(ditr.next());
		}
		
		System.out.println(set.pollLast());
		System.out.println(set.pollFirst());
	}

}