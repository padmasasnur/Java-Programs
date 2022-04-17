package com.ob.hibernatebidirection;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		ProductCart cart = new ProductCart();
		
		Product product = new Product();
		product.setId(3);
		product.setCategory("Phone");
		product.setName("Samsung");
		product.setPrice(900000);
		product.setQuantity(1);
		product.setRating(5);
		
		Product product2 = new Product();
		product2.setId(4);
		product2.setCategory("Laptop");
		product2.setName("HP");
		product2.setPrice(240000);
		product2.setQuantity(2);
		product2.setRating(5);
		
		cart.setProduct(Arrays.asList(product,product2));
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cart");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(cart);
        transaction.commit();
	}
	

}
