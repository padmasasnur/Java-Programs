package com.ob.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
    	EntityManager manager =factory.createEntityManager(); 
    	EntityTransaction transaction = manager.getTransaction();
    	
    	Employee ajay = manager.find(Employee.class, 1);
        ajay.setDesignation("Developer");
        manager.persist(ajay);
		
    	transaction.begin();
    	transaction.commit();
 
	}

}
