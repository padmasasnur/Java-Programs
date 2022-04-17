package com.ob.hibernatemanytomany;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		User pramila = new User();
		pramila.setName("pramila");
		pramila.setMailid("pramila.s@gmail.com");
		pramila.setPassword("padma");
		
		User gouri = new User();
		gouri.setName("gouri");
		gouri.setMailid("gouri.s@gmail.com");
		gouri.setPassword("padma");
		
		Application whatsapp = new Application();
		whatsapp.setId(1);
		whatsapp.setName("whatsapp");
		whatsapp.setCategory("socialmedia");
		
		Application insta = new Application();
		insta.setId(1);
		insta.setName("insta");
		insta.setCategory("socialmedia");
		
	pramila.setApp(Arrays.asList(whatsapp,insta));
	gouri.setApp(Arrays.asList(whatsapp,insta));
	
	whatsapp.setUser(Arrays.asList(pramila,gouri));
	insta.setUser(Arrays.asList(pramila,gouri));
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("user");
	    EntityManager manager = factory.createEntityManager();
	    EntityTransaction transaction = manager.getTransaction();
	    transaction.begin();
	    manager.persist(pramila);
	    manager.persist(gouri);
	    transaction.commit();
	}

}
