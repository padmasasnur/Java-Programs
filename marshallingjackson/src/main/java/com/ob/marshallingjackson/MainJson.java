package com.ob.marshallingjackson;

import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MainJson {
	public static void main(String[] args) throws IOException {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Soumya");
		employee.setDesignation("Developer");
		employee.setSalary(100000);

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writerWithDefaultPrettyPrinter().writeValue(new FileWriter("emp.json"), employee);
	}
}
