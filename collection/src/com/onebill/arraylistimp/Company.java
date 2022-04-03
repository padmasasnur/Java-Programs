package com.onebill.arraylistimp;

import java.util.ArrayList;

public class Company {
	public static void main(String[] args) {
		Employee soumya = new Employee(1,"Soumya","Trainee",30000);
		Employee gouri = new Employee(2,"Gouri","Trainee",30000);
		Employee lavu = new Employee(3,"Lavu","Trainee",30000);
		Employee megha = new Employee(4,"Megha","Trainee",30000 );
		Employee spoorthi = new Employee(5,"Spoorthi","Trainee",30000);
		Employee pramila = new Employee(6,"Pramila","Trainee",30000);
		
		ArrayList<Employee> listofEmployees = new ArrayList<>();
		listofEmployees.add(pramila);
		listofEmployees.add(soumya);
		listofEmployees.add(gouri);
		listofEmployees.add(megha);
		listofEmployees.add(spoorthi);
		listofEmployees.add(lavu);
		
		

		

		
	}

}
