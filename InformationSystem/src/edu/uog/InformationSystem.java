package edu.uog;

import edu.uog.employee.Employee;
import edu.uog.person.Adult;
import edu.uog.person.Person;
import edu.uog.student.Student;

public class InformationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		Employee e1 = new Employee();
		Adult p2 = new Adult();
		
//		p1.setName("Ali");
//		p1.setAge(10);
//		p2.setAge(10);
//		p1.setGender("Male");
		
//		p1.setRollNo("11111111-001");
		
//		System.out.println("Name : "+p1.getName());
//		System.out.println("Roll No : "+p1.getRollNo());
		
		p1.eat();
		e1.eat();
		
		
//		System.out.println("Person Age : "+p1.getAge());
//		System.out.println("Person Age : "+p2.getAge());
	}

}
