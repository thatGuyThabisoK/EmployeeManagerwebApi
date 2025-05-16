package com.basics.demo;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
class HewlettParkardApplicationTests {
	
	private ArrayList<Employee> emps = new ArrayList<Employee>();
	private final Employee employee = new Employee("1333ee","Thabiso","Kobe","kobathena@gmaol.com","dev");
	
	
	private MockMvc mockMvc;
	
	@Autowired
	private EmployeeManager emp;
	
	@MockitoBean
	private Employees manager;

	@Test
	public void contextLoads() {
	}

}
