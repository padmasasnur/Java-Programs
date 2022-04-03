package com.onebill.sethashset;

import java.util.Objects;

import com.onebill.arraylistimp.Employee1;

public class Student {
	int id;
	String name;
	String department;
	long phonenumber;

	public Student(int id, String name, String department, long phonenumber) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.phonenumber = phonenumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) { // in hashset we hv to write equals method to compare n its used for sorting
		Student std = (Student) obj;// downcast
		return this.id == std.id;
		// return this.name == std.name;

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", phonenumber=" + phonenumber
				+ "]";
	}

}
