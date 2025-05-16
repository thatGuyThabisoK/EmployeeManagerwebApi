package com.basics.demo;

import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;


@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {
	
	@MockitoBean
	private EmployeeManager manager;
	
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private EmployeeController employee;
	
	
	
	@Test
	void getEmployeesTest() throws Exception {
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(new Employee("2fhdajdv","kevin","Lee","kevLee3@gmail.com","cleaner"));
		emps.add(new Employee("2683sdv","kevin","Lee","kevLed@gmail.com","security"));
		emps.add(new Employee("8783sdv","kevin","Lee","kevLee2wfs@gmail.com","admin"));
		when(manager.getEmployees()).thenReturn(emps);
		
		mvc.perform(get("/employees"))
        .andDo(print())
        .andExpect(status().isOk()) // Assert array size
        .andExpect(jsonPath("$[0].employee_id", is("2fhdajdv"))) // Assert individual fields
        .andExpect(jsonPath("$[1].employee_id", is("2683sdv")))
        .andExpect(jsonPath("$[2].employee_id", is("8783sdv")));
		
	}
	
	@Test
	void insertEmployeeTest() throws Exception{
		var emp = new Employee("8783sdv","kevin","Lee","kevLee2wfs@gmail.com","admin");
		
		employee.insertEmployee(emp);
		verify(manager).addEmployee(emp);;
		
	}
	
	
	
	
	

}
