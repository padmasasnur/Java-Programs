package com.ob.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainGet {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = emf.createEntityManager();

		// to get the data
		Employee emp = manager.find(Employee.class, 1);

		// Employee reference = manager.getReference(Employee.class, 1);
		// System.out.println("This is ref ==>" + reference);

		System.out.println(emp);

	}

}
