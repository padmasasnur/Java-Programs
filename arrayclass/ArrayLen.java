package com.onebill.arrayclass;

import java.util.Scanner;

public class ArrayLen {
	public static void main(String[] args) throws Exception{
		int a[];
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit : ");
        int limit=sc.nextInt();
      a=new int[limit];
		System.out.println("Enter the array of input");
		for(int i=0;i<limit;i++)
			a[i]=sc.nextInt();
		int c=0;
		for(int i=0;i<limit;i++) {
			if(a[i]==3 )  {
				count++;
					if(i+1<limit && a[i+1]==3) 
					break;
			}
			c++;
		}
		/*count= 3 means that number 3 is exactly apear  3 times in that array 
		   c=limit means it will check upto last input or not 
		   and no 3's are next to each other*/
		if(count==3 && c==limit)
			System.out.println("True");
		else
			System.out.println("False");
	
	}
}

