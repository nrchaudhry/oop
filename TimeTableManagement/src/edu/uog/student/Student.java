package edu.uog.student;

import edu.uog.person.Person;

public class Student extends Person {

	private int STUDENT_ID;
	
	private String STUDENT_ROLLNO;
	
	private String STUDY_PROGRAM;
	
	private String STUDY_YEAR;

	public int getSTUDENT_ID() {
		return STUDENT_ID;
	}

	public void setSTUDENT_ID(int sTUDENT_ID) {
		STUDENT_ID = sTUDENT_ID;
	}

	public String getSTUDENT_ROLLNO() {
		return STUDENT_ROLLNO;
	}

	public void setSTUDENT_ROLLNO(String sTUDENT_ROLLNO) {
		STUDENT_ROLLNO = sTUDENT_ROLLNO;
	}

	public String getSTUDY_PROGRAM() {
		return STUDY_PROGRAM;
	}

	public void setSTUDY_PROGRAM(String sTUDY_PROGRAM) {
		STUDY_PROGRAM = sTUDY_PROGRAM;
	}

	public String getSTUDY_YEAR() {
		return STUDY_YEAR;
	}

	public void setSTUDY_YEAR(String sTUDY_YEAR) {
		STUDY_YEAR = sTUDY_YEAR;
	}
}
