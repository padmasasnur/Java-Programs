package com.onebill.abstractshape;

public class Area extends Shape {
	@Override
	public void RectangleArea(int length,int breadth) {
		System.out.println(length*breadth);
	}
	@Override
	public void SquareArea(int side) {
		System.out.println(side*side);
		
		
	}
	@Override
	public void CircleArea(float radius) {
		System.out.println(3.142*radius*radius);
		
		
	}

}
