package com.ob.springlistbean;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigName {
	@Bean
	public ListofName name() {
		return new ListofName(Arrays.asList("Soumya","Gouri","Lavu","Pramila","Meghu"));
		
	}
	

}
