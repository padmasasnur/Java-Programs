package com.onebill.interfaceclass;

public class StudentMain {
	public static void main(String[] args) {
		Calculator cal = new Casio();
		System.out.println(cal.add(10, 10));
		System.out.println(cal.sub(50, 20));
		System.out.println(cal.multiply(10, 40));
		System.out.println(cal.division(10, 5));

	}

}
