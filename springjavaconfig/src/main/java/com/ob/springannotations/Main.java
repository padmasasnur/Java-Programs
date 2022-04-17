package com.ob.springannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MobileConfig.class);
		Mobile bean = context.getBean(Mobile.class);
		System.out.println(bean);
	}

}
