package com.onebill.Inheritance;

public class Employee extends Member {

	String specialization;

	public Employee(String n, int a, String Pn, String add, int sal) {
		super(n, a, Pn, add, sal);
		// TODO Auto-generated constructor stub
	}

	public void specialization() {
		System.out.println("specialization:" + specialization);
	}
	
	
	
	
}

