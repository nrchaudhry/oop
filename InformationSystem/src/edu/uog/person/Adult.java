package edu.uog.person;

public class Adult extends Person {

	public void setAge(int age) {
		if (age<18)
			System.out.println("Invalid Age!");
		else
			super.setAge(age); 
	}
}
