package com.onebill.Inheritance;

public class Member {
	String name;
	int age;
	String Phonenumber;
	String Address;
	int salary;
	
	public Member(String n, int a, String Pn, String add,int sal) {
		name = n;
		age = a;
		Phonenumber = Pn;
		Address = add;
		salary = sal;
		
	}
	public void details() {
		System.out.println("name: "+ name );
		System.out.println("age: "+ age );
		System.out.println("Phonenumber: "+ Phonenumber );
		System.out.println("Address: "+ Address );
		System.out.println("salary: "+ salary );

	}
	
	public void printSalary() {
		System.out.println("salary of the employee is :" + salary );
		
	}

}
