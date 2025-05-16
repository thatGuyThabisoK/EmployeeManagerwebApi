package com.basics.demo;

public class Employee {
	
	private String first_name, last_name, email, employee_id, title;
	

	public Employee(String employee_id,String first_name, String last_name, String email,  String title) {
	
		setFirst_name(first_name);
		setLast_name(last_name);
		setEmail(email);
		setEmployee_id(employee_id);
		setTitle(title);
		
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getEmployee_id() {
		return employee_id;
	}


	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	
	@Override
    public String toString() {
        return "Employee [id=" + employee_id + ", firstName=" + first_name +
                ", lastName=" + last_name + ", email=" + email + "]";
    }
	
}
