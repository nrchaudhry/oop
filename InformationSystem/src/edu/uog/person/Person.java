package edu.uog.person;

public class Person {
	private String Name;
	
	private int age;
	
	private String gender;

	private String address;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void eat() {
		System.out.println("Person is eating food!");
	}
	
	public void walk() {
		
	}
}
