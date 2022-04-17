package com.ob.mappingbidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		Trainee1 trainee1 = new Trainee1();
		trainee1.setName("soumya");
		trainee1.setSalary(60000);
		trainee1.setDesignation("Tester");
		

		Laptop1 laptop1 = new Laptop1();
		laptop1.setId(101);
		laptop1.setBrand("DELL");
		laptop1.setBattery("Dell");
		laptop1.setBattery("1 TB");
		
		laptop1.setTrainee1(trainee1);
        trainee1.setLaptop1(laptop1);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(laptop1);
		manager.persist(trainee1);
		transaction.commit();

	}



}
