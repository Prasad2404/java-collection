package com.test.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<Integer> vector=new Vector(10);
		
		vector.add(56);
		vector.add(66);
		vector.add(76);
		vector.add(86);
		vector.add(96);
		vector.add(106);
		vector.add(116);
		vector.add(126);
		vector.add(136);
		vector.add(146);
		vector.add(156);
		System.out.println(vector);
		
		//System.out.println(vector.capacity());
		//System.out.println(vector.clone());
		//System.out.println();
		
		
		
		
		  for(int i=0;i<vector.size();i++) 
		  { 						  
			  if(vector.contains(116))
		  	   vector.remove(i);	
		  }
		
		  System.out.println(vector);
	
	}
	}


