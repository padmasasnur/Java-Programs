package com.ob.mappingbidirection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.ob.mappingonetone.Laptop;
@Entity
public class Trainee1 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String designation;
	private double salary;
	@OneToOne
	private Laptop1 laptop1;
	
	public Trainee1(int id, String name, String designation, double salary, Laptop1 laptop1) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.laptop1 = laptop1;
	}

	public Trainee1() {
		super();
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

	public Laptop1 getLaptop1() {
		return laptop1;
	}

	public void setLaptop1(Laptop1 laptop1) {
		this.laptop1 = laptop1;
	}
	
	
	

}
