package com.onebill.methodreference;

public class Exercise {
	public void chat() {
		System.out.println("this is from exercise method");
	}
	
	public static void msg() {
		System.out.println("this is from msg method");
	}
	public static void main(String[] args) {
	Test t = new Exercise():: chat;       //print by using method reference
	t.message();
	Test t1 = Exercise::msg;
	t1.message();
	}
	
	

}
