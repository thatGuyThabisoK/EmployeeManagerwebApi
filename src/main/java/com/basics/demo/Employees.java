package com.basics.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class Employees {
	
	private ArrayList<Employee> listOfEmployees = new ArrayList<>();
	
	
	public ArrayList<Employee> getEmployees(){
		return listOfEmployees;
	}
	
	public void setEmployee(ArrayList<Employee> arr) {
		listOfEmployees = arr;
	}

	public void addEmployee(Employee emp) {
		
		listOfEmployees.add(emp);
	}
	
	

}
