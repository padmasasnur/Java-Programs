package com.ob.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainDelete {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(3);
		employee.setName("Adi");
		employee.setDesignation("Developer");
		employee.setSalary(120000);
		
		//to delete
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Employee merge = manager.merge(employee);
		manager.remove(merge);
		transaction.begin();
		transaction.commit();
	
	}

}
