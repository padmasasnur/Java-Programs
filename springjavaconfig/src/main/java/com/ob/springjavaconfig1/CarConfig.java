package com.ob.springjavaconfig1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ob.springjavaconfig.Car;
@Configuration
public class CarConfig {
	@Bean(name = "suzuki" )
	public Car car1(){
		Car car = new Car();
		car.setModelName("Maruti");
		car.setBrand("Suzuki 800");
		car.setPrice(100000);
		return car;
		
	}
	@Bean(name = "audi")
	public Car car2(Engine engine ){
		Car car = new Car();
		car.setModelName("audi");
		car.setBrand("A4");
		car.setPrice(100000);
		return car;
		
	}
	@Bean
	public Engine getEngine() {
		Engine engine = new Engine();
		engine.setSerialNum(1);
		engine.setName("S20");
		engine.setModel("S30");
		return engine;
		
	}


}
