package com.ob.hibernatequery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Intern {
	 @Id
		private int id;
	    @Column(name="First_name",nullable=false,length=20)
		private String name;
		private String designation;
		private double salary;
		
		public Intern() {
			super();
		}

		public Intern(int id, String name, String designation, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.designation = designation;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		
		
		

}
