package com.onebill.abstractconstructor;

public abstract class SuperClass {

	public SuperClass() {
		System.out.println("This is a Constructor of a abstract class");

	}
	public abstract void a_method(); //abstract method do not specifies body/definition
	
	public void method() {
		System.out.println("This is a normal method of a abstract class");
	}

}
