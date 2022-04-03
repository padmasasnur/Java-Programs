package com.onebill.throwableexception;
import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		try {
			Scanner sc = new  Scanner(System.in);
			System.out.println("Enter the first number");
			int number1 = sc.nextInt();
			System.out.println("Enter the second number");
			int number2 = sc.nextInt();
			int res = 0;
			res = number1 / number2;
			
		int[] a;
		a = new int[res];
		
		a[4] = 20;
		System.out.println("a[4]");
		System.out.println("res");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The index your accessing is not present");
		} catch(ArithmeticException e) {
			 System.out.println("enter the denom > 0");
			
		//try {
		//	System.out.println(a[5]);
		//} catch(ArrayIndexOutOfBoundException e) {
		//	System.out.println("The index your accessing is not present");
		//}
		
		System.out.println("program end");
		}
	}
}
