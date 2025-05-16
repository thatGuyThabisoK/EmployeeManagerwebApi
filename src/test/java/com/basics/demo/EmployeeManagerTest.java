package com.basics.demo;


import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.*;


import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;



@ExtendWith(MockitoExtension.class)
public class EmployeeManagerTest {
	
	@Mock
	private Employees emps;
	
	@InjectMocks
	private EmployeeManager manager;
	
	@Test
	void getEmployeesTest() throws Exception {
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee("2fhdajdv","kevin","Lee","kevLee3@gmail.com","cleaner"));
		employees.add(new Employee("2683sdv","kevin","Lee","kevLed@gmail.com","security"));
		employees.add(new Employee("8783sdv","kevin","Lee","kevLee2wfs@gmail.com","admin"));
	
		when(emps.getEmployees()).thenReturn(employees);
		
		ArrayList<Employee> results = manager.getEmployees();
		
		assertIterableEquals(employees,results);
		
	}
	
	@Test
	void insertEmployeeTest() throws Exception{
		var emp = new Employee("8783sdv","kevin","Lee","kevLee2wfs@gmail.com","admin");
		
		manager.addEmployee(emp);
		verify(emps).addEmployee(emp);;
		
	}
	
	@Test
	void initTest() {
		manager.init();
		
		verify(emps).setEmployee(any());
	}
	
	@Test
	void initTestIfContainerIsInitialized() {
		manager.init();
		ArrayList<Employee> emps = manager.getEmployees();
		assertNotNull(emps);
	}
	
	

}
