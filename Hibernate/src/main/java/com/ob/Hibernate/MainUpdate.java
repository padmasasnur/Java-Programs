package com.ob.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainUpdate {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Ajay");
		employee.setDesignation("Dev");
		employee.setSalary(120000);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(employee);
		transaction.begin();
		transaction.commit();
	}

}

