package com.ob.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Value(value = "realMe")
	String name;
	@Value(value = "XT")
	String model;
	@Value(value = "20000")
	Double price;
	@Autowired
	Sim sim;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", model=" + model + ", price=" + price + ", sim=" + sim + "]";
	}
	
	

}
