package com.ob.springjavaconfig;

import com.ob.springjavaconfig1.Engine;

public class Car {
	private String modelName;
	private String brand;
	private double price;
	private Engine engine;

	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
	

}
