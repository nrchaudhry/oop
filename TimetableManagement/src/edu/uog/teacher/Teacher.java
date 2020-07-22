package edu.uog.teacher;

import edu.uog.person.Person;

public class Teacher {

	public static String csvFile = "D:\\Teachers.csv";

	private int TEACHER_ID;
	
	private Person PERSON_ID;

	private String EMPLOYEE_CODE;
	
	public int getTEACHER_ID() {
		return TEACHER_ID;
	}

	public void setTEACHER_ID(int tEACHER_ID) {
		TEACHER_ID = tEACHER_ID;
	}

	public Person getPERSON_ID() {
		return PERSON_ID;
	}

	public void setPERSON_ID(Person pERSON_ID) {
		PERSON_ID = pERSON_ID;
	}

	public String getEMPLOYEE_CODE() {
		return EMPLOYEE_CODE;
	}

	public void setEMPLOYEE_CODE(String eMPLOYEE_CODE) {
		EMPLOYEE_CODE = eMPLOYEE_CODE;
	}

	public String toString() {
		String str = null;
		
		str = "" + this.TEACHER_ID;
		
		return str;
	}
}
