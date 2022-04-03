package com.onebill.has$relationship;

public class Laptop {
	String brand;
	Rom rom;
	Battery battery;
	double price;
    Screen screen;
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", rom=" + rom + ", battery=" + battery + ", screen=" + screen + ", price="
				+ price + "]";
	}
	
	

}
