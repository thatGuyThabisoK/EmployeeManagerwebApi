package com.basics.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeManager {
	
	private Employees employees;
	
	@Autowired
	public EmployeeManager(Employees emp) {
		employees = emp;
	}
	
public void init() {
		ArrayList<Employee> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(new Employee("223gnsmv","kevin","Lee","kevLee223@gmail.com","admin"));
		listOfEmployees.add(new Employee("25yhwdv","kevin","Lee","kev3@gmail.com","general worker"));
		listOfEmployees.add(new Employee("2fhdajdv","kevin","Lee","kevLee3@gmail.com","cleaner"));
		listOfEmployees.add(new Employee("2683sdv","kevin","Lee","kevLed@gmail.com","security"));
		listOfEmployees.add(new Employee("8783sdv","kevin","Lee","kevLee2wfs@gmail.com","admin"));
		employees.setEmployee(listOfEmployees);
	}

public ArrayList<Employee> getEmployees() {
	return employees.getEmployees();
}

public void addEmployee(Employee emp) {
	employees.addEmployee(emp);
	
}

}
