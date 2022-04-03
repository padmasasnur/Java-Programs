package com.onebill.exception;

import java.util.Scanner;
//vote
//age
public class CustomException {
	public static void main(String[] args) throws InvalidAgeException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Age to validate :");
		int age = scanner.nextInt();
		
		if(age >= 18)
			System.out.println("Eligible for vote");
		else
			throw new InvalidAgeException("Not eligible for vote");
	}


}
