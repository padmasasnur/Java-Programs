package com.ob.autospringconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ob.springjavaconfig.Car;
import com.ob.springjavaconfig.CarConfig;

public class Main {
	  public static void main( String[] args )
	    {
	    	ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
	    	Car bean = context.getBean(Car.class);
	    	System.out.println(bean);
	    	
	    }

}
