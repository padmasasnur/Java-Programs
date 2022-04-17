package com.ob.mappingonetone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		Trainee trainee = new Trainee();
		trainee.setName("soumya");
		trainee.setSalary(60000);
		trainee.setDesignation("Tester");

		Laptop laptop = new Laptop();
		laptop.setId(101);
		laptop.setBrand("DELL");
		laptop.setBattery("Dell");
		laptop.setBattery("1 TB");

		trainee.setLaptop(laptop);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(laptop);
		manager.persist(trainee);
		transaction.commit();

	}

}
