package com.onebill.exception;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		Licence licence = new Licence();
		licence.age = sc.nextInt();
		licence.generate(licence.age);

		// Licence licence = new Licence();
		// licence.generate(17);
	}


}
