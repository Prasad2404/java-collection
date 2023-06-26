package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeInfo
{
	int id;
	String name;
	double salary;
	
	public EmployeeInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeInfo(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeInfo [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

class SalaryComparator implements Comparator<EmployeeInfo>
{

	@Override
	public int compare(EmployeeInfo o1, EmployeeInfo o2) {
		
		if(o1.salary==o2.salary)
		{
			return 0;
		}
		else if(o1.salary>o2.salary)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}

class NameComparator implements Comparator<EmployeeInfo>
{

	@Override
	public int compare(EmployeeInfo o1, EmployeeInfo o2) {
		
		if(o1.name.compareTo(o2.name)==0)
		{
			return 0;
		}
		else if(o1.name.compareTo(o2.name)>0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
public class ComparatorExample {

	public static void main(String[] args) {
		
		ArrayList<EmployeeInfo> list=new ArrayList<>();
		
		list.add(new EmployeeInfo(25, "Kumar", 270000));
		list.add(new EmployeeInfo(23, "Aman", 250000));
		list.add(new EmployeeInfo(27, "Mohana", 400000));
		list.add(new EmployeeInfo(26, "Sunil", 300000));
		
		System.out.println("Before Soring.... ");
		for(EmployeeInfo emp:list)
		{
			System.out.println(emp);
		}
		
		Collections.sort(list, new NameComparator());
		
		System.out.println("After Soring.... ");
		for(EmployeeInfo emp:list)
		{
			System.out.println(emp);
		}
		

	}

}