package com.ob.hibernateonetomany;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Cart soumyacart = new Cart();

		Item item = new Item();
		item.setId(3);
		item.setCategory("Phone");
		item.setName("Samsung");
		item.setPrice(90000);
		item.setQuantity(2);
		item.setProductrating(4.5);

		Item item2 = new Item();
		item2.setId(4);
		item2.setCategory("Laptop");
		item2.setName("HP");
		item2.setPrice(120000);
		item2.setQuantity(2);
		item2.setProductrating(5);

		soumyacart.setItem(Arrays.asList(item, item2));
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cart");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(soumyacart);
		transaction.commit();
	}
}
