package com.ob.springannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sim {
	@Value(value = "jio")
	String name;
	@Value(value = "8073433100")
	String number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Sim [name=" + name + ", number=" + number + "]";
	}
	
	

}
