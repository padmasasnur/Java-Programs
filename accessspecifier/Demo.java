package com.onebill.accessspecifier;

public class Demo {
	public int x = 10;
	protected int y = 20;
	int z = 30;
	private int a = 40;
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.x);
		System.out.println(demo.y);
		System.out.println(demo.z);
		System.out.println(demo.a);

	}

}
