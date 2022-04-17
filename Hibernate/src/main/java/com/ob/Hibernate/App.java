package com.ob.Hibernate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Employee employee = new Employee(3,"Adi","Developer",50000);
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
    	EntityManager manager =factory.createEntityManager(); 
    	
    	Query createQuery = manager.createQuery("from Employee");
    	List<Employee> resultList = createQuery.getResultList();
    	
    	for(Employee employee1:resultList) {
    		System.out.println(employee1.getName());
    		
    	}
    	
    	
    	
    	//EntityTransaction transaction = manager.getTransaction();
    	//manager.persist(employee);
    	//transaction.begin();
    	//transaction.commit();
    	
    }
}
