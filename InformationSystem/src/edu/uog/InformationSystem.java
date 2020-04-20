package edu.uog;

import edu.uog.employee.Employee;
import edu.uog.student.Student;

public class InformationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student p1 = new Student();
		Employee e1 = new Employee();
		
		p1.setName("Ali");
		p1.setAge(20);
		p1.setGender("Male");
		
		p1.setRollNo("11111111-001");
		
//		System.out.println("Name : "+p1.getName());
//		System.out.println("Roll No : "+p1.getRollNo());
		
//		p1.eat();
		e1.eat();
	}

}
