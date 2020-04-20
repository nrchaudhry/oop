package edu.uog.employee;

import edu.uog.person.Person;

public class Employee extends Person {
	
	private String EmployeeNo;

	public String getEmployeeNo() {
		return EmployeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		EmployeeNo = employeeNo;
	}

	public void eat() {
		Person.eat();
		System.out.println("Employee is eating food!");
	}
}
