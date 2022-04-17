package com.ob.springlistbean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
public class ListofName {
	private List<String> name;
	
	

	public ListofName(List<String> name) {
		super();
		this.name = name;
	}

	public ListofName() {
		super();
	}

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ListofName [name=" + name + "]";
	}
	
	

}
