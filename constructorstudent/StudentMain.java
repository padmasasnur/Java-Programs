package com.onebill.constructorstudent;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student("Soumya");
		Student student1 = new Student();
		System.out.println(student.name);
		System.out.println(student1.name);
	}

}
