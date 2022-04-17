package com.ob.marshallingfile;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ob.marshallingjackson.Employee;

public class MainMarshalling {
	public static void main(String[] args) throws IOException {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Soumya");
		employee.setDesignation("Developer");
		employee.setSalary(100000);
		employee.setPassword("xyz");

		ObjectMapper objectMapper = new ObjectMapper();
		String writeValueAsString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
		System.out.println(writeValueAsString);
	}
	
	

}
