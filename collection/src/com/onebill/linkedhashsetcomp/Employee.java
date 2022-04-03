package com.onebill.linkedhashsetcomp;

public class Employee implements Comparable  {
	private int eId;
	private String ename; 

	public Employee() {
		super();
	}

	public Employee(int eId, String ename) {
		super();
		this.eId = eId;
		this.ename = ename;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}

	
	@Override
	public String toString() {
		return "EmployeeDetails [eId=" + eId + ", ename=" + ename + "]";
	}

	@Override
	public int compareTo(Object obj) {
		Employee emp = (Employee) obj;
		return (this.eId-emp.eId);
	}


}
