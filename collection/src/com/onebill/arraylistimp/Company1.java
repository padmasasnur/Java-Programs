package com.onebill.arraylistimp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Company1 {
	public static void main(String[] args) {
		Employee1 soumya = new Employee1(1,"Soumya","Trainee",30000);
		Employee1 gouri = new Employee1(2,"Gouri","Trainee",30000);
		Employee1 lavu = new Employee1(3,"Lavu","Trainee",30000);
		Employee1 megha = new Employee1(4,"Megha","Trainee",30000 );
		Employee1 spoorthi = new Employee1(5,"Spoorthi","Trainee",30000);
		Employee1 pramila = new Employee1(6,"Pramila","Trainee",30000);
		
		ArrayList<Employee1> listofEmployees1 = new ArrayList<>();
		listofEmployees1.add(pramila);
		listofEmployees1.add(soumya);
		listofEmployees1.add(gouri);
		listofEmployees1.add(megha);
		listofEmployees1.add(spoorthi);
		listofEmployees1.add(lavu);
		
		//soumya.compareTo(lavu);
		//Collections.sort(listofEmployees1);
		SortByName sortbyname = new SortByName();
		Collections.sort(listofEmployees1, sortbyname);
		
		SortById sortbyid = new SortById();
		Collections.sort(listofEmployees1, sortbyid);


		
		
		Iterator <Employee1> iterator =  listofEmployees1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		

		

		
	}

}



