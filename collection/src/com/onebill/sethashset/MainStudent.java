package com.onebill.sethashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import com.onebill.arraylistimp.Employee1;

public class MainStudent {
	public static void main(String[] args) {
		
	Student student = new Student(1, "soumya", "CS", 806890865);
	Student student1 = new Student(2, "lavu", "CS", 806890865);
	Student student2 = new Student(3, "pooja", "CS", 806890865);
	Student student3 = new Student(4, "gouri", "CS", 806890865);
	Student student4 = new Student(5, "megha", "CS", 806890865);
	Student student5 = new Student(5, "megha", "CS", 806890865);

	HashSet<Student> hashset = new HashSet<>();
	hashset.add(student);
	hashset.add(student1);
	hashset.add(student2);
	hashset.add(student3);
	hashset.add(student4);
	hashset.add(student5);
	
	ArrayList <Student> arraylist = new ArrayList<>(hashset);
	SortByName sortbyname = new SortByName();
	Collections.sort(arraylist , sortbyname);
	//to sort(prints o/p)
	Iterator <Student> iterator =  arraylist.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	System.out.println("======");
	//prints o/p
	for(Student std:arraylist) {
		System.out.println(std);
	}

	}

}
