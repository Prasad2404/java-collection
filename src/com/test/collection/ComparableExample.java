package com.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee implements Comparable<Employee> 
{
	private long id;
	private String name;
	
	public Employee() {
		
	}

	public Employee(long id, String name) {
		
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		if(this.id>o.id)
		{
			return (int) (this.id - o.id); //R>K
		}
		
		else if(this.id<o.id)
		{
			return (int) (this.id - o.id); //R>K
		}
		else 
		{
			return 0;
		}
		
		
	}
	
	
}


public class ComparableExample {

	public static void main(String[] args) {
		
		Employee employees[]=new Employee[4];//array
		
		Employee e1=new Employee(87,"Raman");
		Employee e2=new Employee(12,"Kumar");
		Employee e3=new Employee(56,"Aman");
		Employee e4=new Employee(99,"Dipak");
		
		
		employees[0]=e1;
		employees[1]=e2;
		employees[2]=e3;
		employees[3]=e4;
		
		
		System.out.println("Before sorting...");
		for(int i=0;i<employees.length;i++)
		{
			System.out.println(employees[i]);
		}
		
		Arrays.sort(employees);
		
		System.out.println("After sorting...");
		for(int i=0;i<employees.length;i++)
		{
			System.out.println(employees[i]);
		}
		
	}

}