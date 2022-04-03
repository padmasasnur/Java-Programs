package com.onebill.has$relationship;

public class MainStore {
	public static void main(String[] args) {
		Laptop  laptop = new Laptop();
		
		Battery battery = new Battery();
		battery.brand = "Dell";
		battery.capacity = 200000;
		battery.type = "Lithium";
		
		Rom rom = new Rom();
		rom.type = "DDDR4";
		rom.size = 16;
		rom.clockspeed = 2.4;
		
		
		 Screen screen = new Screen();
		 screen.brand = "DDDR4";
		 screen.resolution = 1000;
		 screen.size = 32;
		 screen.type = "oled";
		 
		 laptop.brand = "hp";
		 laptop.price = 100000;
		 laptop.battery = battery;
		 laptop.rom = rom;
		 laptop.screen = screen;
		 System.out.println("laptop");



		
		





		
		
		
	}

}
