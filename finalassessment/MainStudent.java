package com.onebill.finalassessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		int id;
		String name;
		double marks = 0;
		String course = null;
		int index;
		List<Student> list = new ArrayList<Student>
		        (Arrays.asList(new Student(1, "soumya", 90, "MTECH")
				,new Student(2, "gouri", 80, "BTECH")
				, new Student(3, "pramila", 95, "BE")));
		do {
			System.out.println(
					"\n1.Add student details\n2.Edit student details\n3.Delete student details\n4.List the student details\n5.get the student details by id\n6.sort the list of students\n7.Exit");
			System.out.println("Choose");
			ch = sc.nextInt();
			switch (ch) {

			case 1:
				System.out.println("\nAdd Student details");
				System.out.println("enter student id");
				id = sc.nextInt();
				System.out.println("enter student name");
				name = sc.next();
				System.out.println("enter student marks");
				marks = sc.nextInt();
				System.out.println("enter student course");
				course = sc.next();

				Student studentdetails = new Student(id, name, marks, course);
				list.add(studentdetails);
				break;

			case 2:
				System.out.println("\nEdit student details");
				System.out.println("Enter the id for edit");
				id = sc.nextInt();
				System.out.println("Enter the Name");
				name = sc.next();

				Student newdetails = new Student(id, name, marks, course);
				index = 0;
				for (Student studentdetails1 : list) {
					if (studentdetails1.getId() == id) {
						index = list.indexOf(studentdetails1);
					}
				}
				list.set(index, newdetails);
				break;

			case 3:
				System.out.println("\nDelete student details");
				System.out.println("Enter student id");
				id = sc.nextInt();

				index = 0;
				for (Student studentdetails1 : list) {
					if (studentdetails1.getId() == id) {
						index = list.indexOf(studentdetails1);
					}
				}
				list.remove(index);
			case 4:
				System.out.println("\nList All Students");
				for (Student studentDetails : list) {
					System.out.println(studentDetails);
				}
				break;
			case 5:
				System.out.println("\nGet Student Details");
				System.out.println("enter your id : ");
				id = sc.nextInt();
				for (Student studentDetails : list) {
					if (studentDetails.getId() == id) {
						System.out.println(id + "  " + studentDetails);
					}
				}
				break;
			case 6:
				System.out.println("\nSort the Student Details");
				Collections.sort(list);
				for (Student studentDetails : list) {
					System.out.println(studentDetails);
				}
				break;
			case 7:
				System.out.println("Exit");
			}
		} while (ch <= 6);

	}

}
