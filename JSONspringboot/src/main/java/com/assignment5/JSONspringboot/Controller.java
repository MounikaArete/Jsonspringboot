package com.assignment5.JSONspringboot;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
	
@GetMapping("getEmployee")
	
Employee getOneEmployee () {

		Employee employee1 = new Employee("Heena",1234);
		
		return employee1;
	
}
	ArrayList<Employee>myEmployeeList=new ArrayList<>();
	
	@GetMapping("getAllEmployees")
	
	ArrayList<Employee>getEmployees(){
		
		Employee employee1 = new Employee("Heena",1234);
		Employee employee2 = new Employee("Meena",1235);
		Employee employee3 = new Employee("Reena",1236);
		Employee employee4 = new Employee("Sheena",1237);
		
		myEmployeeList.add(employee1);
		myEmployeeList.add(employee2);
		myEmployeeList.add(employee3);
		myEmployeeList.add(employee4);
		
			
			return myEmployeeList;
	}
}
