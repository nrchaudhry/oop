package edu.uog.teacher;

import edu.uog.person.Person;

public class Teacher extends Person {

	public static String csvFile = "D:\\Teachers.csv";

	private int TEACHER_ID;

	public int getTEACHER_ID() {
		return TEACHER_ID;
	}

	public void setTEACHER_ID(int tEACHER_ID) {
		TEACHER_ID = tEACHER_ID;
	}

	public String toString() {
		String str = null;
		
		str = "" + this.TEACHER_ID;
		
		return str;
	}
}
