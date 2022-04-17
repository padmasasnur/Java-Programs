package com.ob.autospringconfig;
//bean
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ob.springjavaconfig.Car;
import com.ob.springjavaconfig1.Engine;

@Configuration
public class CarConfig {
	@Bean(name = "suzuki")
	public Car car1() {
		Car car = new Car();
		car.setModelName("Maruti");
		car.setBrand("Suzuki 800");
		car.setPrice(100000);
		return car;

	}

	@Bean(name = "audi")
	public Car car2() {
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

	@Bean
	public Engine getEngine1() {
		Engine engine = new Engine();
		engine.setSerialNum(1);
		engine.setName("S20");
		engine.setModel("S30");
		return engine;

	}

}
