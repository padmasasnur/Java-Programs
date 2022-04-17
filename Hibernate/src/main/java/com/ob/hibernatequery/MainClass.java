package com.ob.hibernatequery;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MainClass {
	public static void main( String[] args )
	    {
		  Intern intern = new Intern(3,"Adi","Developer",50000);
	    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
	    	EntityManager manager =factory.createEntityManager(); 
	    	
	    	Query createQuery = manager.createQuery("Select name from Intern where id = :number ");
	    	createQuery.setParameter("number", 3);
	    	Object singleResult = createQuery.getSingleResult();
	    	System.out.println("id number 3 employee is:" + singleResult);

	    	
	    	
	    	//Query createQuery = manager.createQuery("Select count(*) from Intern");
	    	//System.out.println(createQuery.getSingleResult());
	    	
	    //	Query createQuery = manager.createQuery("from Intern");
	    //	List<Intern> resultList = createQuery.getResultList();
	    	
	    	//for(Intern intern1:resultList) {
	    	//	System.out.println(intern1.getName());
	    	
	    	
	    		
	    	}
	    	


	    }
