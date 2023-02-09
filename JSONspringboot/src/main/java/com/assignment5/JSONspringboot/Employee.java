package com.assignment5.JSONspringboot;

public class Employee {
	
	private String name;
	private int empid;
	Employee(){}
	Employee(String name, int empid){
		this.name=name;
		this.empid=empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}

}
