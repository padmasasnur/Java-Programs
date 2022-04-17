package com.ob.springjavaconfig1;


public class Engine {
	private int serialNum;
	private String name;
	private String model;
	
	
	public int getSerialNum() {
		return serialNum;
	}


	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	@Override
	public String toString() {
		return "Engine [serialNum=" + serialNum + ", name=" + name + ", model=" + model + "]";
	}
	
	

}
