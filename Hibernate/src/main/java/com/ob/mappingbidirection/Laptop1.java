package com.ob.mappingbidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.ob.mappingonetone.Trainee;

@Entity
public class Laptop1 {
	@Id
	private int id;
	private String brand;
	private String rom;
	private String battery;
	
	@OneToOne(mappedBy = "laptop1")
	private Trainee1 trainee1;
	
	
	public Laptop1() {
		super();
	}

	
	public Laptop1(int id, String brand, String rom, String battery) {
		super();
		this.id = id;
		this.brand = brand;
		this.rom = rom;
		this.battery = battery;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getRom() {
		return rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public Trainee1 getTrainee1() {
		return trainee1;
	}

	public void setTrainee1(Trainee1 trainee1) {
		this.trainee1 = trainee1;
	}
	
	
	
	

}
