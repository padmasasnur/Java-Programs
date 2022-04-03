package com.onebill.encapsulation;

import com.onebill.encapsulation.Employee;

public class Company {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("pramila");
		emp.setAge(20);
		emp.setSalary(200000);
		emp.setDesignation("xyz");
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getSalary());
		System.out.println(emp.getDesignation());


}
}
