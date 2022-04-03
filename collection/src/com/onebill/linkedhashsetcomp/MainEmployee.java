package com.onebill.linkedhashsetcomp;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class MainEmployee {
	public static void main(String[] args) {
		Employee employee1 = new Employee(105,"Padma");
		Employee employee2 = new Employee(107,"Soumya");
		Employee employee3 = new Employee(102,"Kavya");
		
		LinkedHashSet<Employee> hashSet = new LinkedHashSet<Employee>();
		hashSet.add(employee1);
		hashSet.add(employee2);
		hashSet.add(employee3);
		
		List<Employee> list = new ArrayList<>();
		list.addAll(hashSet);
		Collections.sort(list);
		
		System.out.println("using comparable\n");
		
		for (Employee  details: list) {
			System.out.println(details);
		}
		System.out.println("\n using Comparator\n");
		
		Collections.sort(list, new ComparatorClass());
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}

}
