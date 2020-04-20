package edu.uog.employee;

import edu.uog.person.Person;

public class Employee extends Person {
	
	private String EmployeeNo;
	
	private String designation;
	
	private double salary;

	public String getEmployeeNo() {
		return EmployeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		EmployeeNo = employeeNo;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void eat() {
		System.out.println("Employee is eating food!");
	}
}
