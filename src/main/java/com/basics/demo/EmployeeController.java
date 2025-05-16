package com.basics.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	private EmployeeManager employees;
	
	
	@Autowired
	public EmployeeController(EmployeeManager emp) {
		employees = emp;
		employees.init();
	}
	
	@GetMapping
	public ArrayList<Employee> getEmployees(){
		
		return employees.getEmployees();
	}
	
	@PostMapping
	public void insertEmployee(@RequestBody Employee emp) {
		employees.addEmployee(emp);
	}
	
	

}
