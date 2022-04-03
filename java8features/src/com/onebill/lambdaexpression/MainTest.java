package com.onebill.lambdaexpression;

public class MainTest {
public static void main(String[] args) {
	MyFunctionalInterface obj = (x,y)->{
		return x+y;
	};
	int add = obj.add(10,20);
	System.out.println(add);
	
}
}
