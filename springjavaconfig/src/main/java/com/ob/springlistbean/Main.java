package com.ob.springlistbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigName.class);
		ListofName bean = context.getBean(ListofName.class);
		System.out.println(bean);
	}

}
