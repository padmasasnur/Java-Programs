package com.ob.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {
	@Bean(name = "suzuki")
	public Car car1(){
		Car car = new Car();
		car.setModelName("Maruti");
		car.setBrand("Suzuki 800");
		car.setPrice(100000);
		return car;
		
	}
	@Bean(name = "audi")
	public Car car2(){
		Car car = new Car();
		car.setModelName("audi");
		car.setBrand("A4");
		car.setPrice(100000);
		return car;
		
	}

}
