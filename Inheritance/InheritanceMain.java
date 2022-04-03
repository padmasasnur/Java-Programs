package com.onebill.Inheritance;

public class InheritanceMain {
	public static void main(String[] args) {
		
		Employee employee = new Employee("pramila",20,"8908765432","xyz",200000);
		//employee.name = "Pramila";
		//employee.age = 20;
		//employee.Phonenumber = "8908765432";
		//employee.Address = "xyz";
		//employee.salary = 200000;
		employee.details();
		employee.specialization = "abc";
		employee.specialization();
		
		
		Manager manager = new Manager("XYZ", 20, "8908654321","xyzxyz", 500000);
		//manager.name = "XYZ";
		//manager.age = 20;
		//manager.Phonenumber = "8908654321";
		//manager.Address = "xyzxyz";
		//manager.salary = 500000;
		manager.details();
		manager.department = "abcde";
		manager.department();
		

		
	}

}
