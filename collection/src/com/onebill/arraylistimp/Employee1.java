package com.onebill.arraylistimp;

//comparable sorts single element and used compareTo() method
//comparable is a interface
public class Employee1 implements Comparable<Employee1> {
	int id;
	String name;
	String designation;
	double salary;

	public Employee1(int id, String name, String designation, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee1 o) {
		return o.id-this.id;
	}

}
