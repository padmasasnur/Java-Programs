package com.onebill.Inheritance;

public class Manager extends Member{
	
	String department;

	
	public Manager(String n, int a, String Pn, String add, int sal) {
		super(n, a, Pn, add, sal);
		// TODO Auto-generated constructor stub
	}
	public void department() {
		System.out.println("department: " + department);
		
	}

	
	
}
