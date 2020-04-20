package edu.uog.student;

import edu.uog.person.Person;

public class Student extends Person {
	
	private String RollNo;
	
	private String Program;
	
	private int StudyYear;

	public String getRollNo() {
		return RollNo;
	}

	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}

	public String getProgram() {
		return Program;
	}

	public void setProgram(String program) {
		Program = program;
	}

	public int getStudyYear() {
		return StudyYear;
	}

	public void setStudyYear(int studyYear) {
		StudyYear = studyYear;
	}
	
	public void study() {
		
	}
	
	public void takeExam() {
		
	}

}
