package com.onebill.accessspecifiertest;

import com.onebill.accessspecifier.Demo;

public class Test extends Demo{
	
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		System.out.println(demo.x);
		
		Test test = new Test();
		System.out.println(test.y);  //protected accessspecifier
	}

}
