package edu.uog.course;

public class Course {

	public static String csvFile = "H:\\Courses.csv";

	private int COURSE_ID;
	
	private String COURSE_CODE;
	
	private String COURSE_TITLE;
	
	private String COURSE_DESC;
	
	private int COURSE_CREDITHOUR;
	
	private Course COURSEPRERQUIST_ID;

	public int getCOURSE_ID() {
		return COURSE_ID;
	}

	public void setCOURSE_ID(int cOURSE_ID) {
		COURSE_ID = cOURSE_ID;
	}

	public String getCOURSE_CODE() {
		return COURSE_CODE;
	}

	public void setCOURSE_CODE(String cOURSE_CODE) {
		COURSE_CODE = cOURSE_CODE;
	}

	public String getCOURSE_TITLE() {
		return COURSE_TITLE;
	}

	public void setCOURSE_TITLE(String cOURSE_TITLE) {
		COURSE_TITLE = cOURSE_TITLE;
	}

	public String getCOURSE_DESC() {
		return COURSE_DESC;
	}

	public void setCOURSE_DESC(String cOURSE_DESC) {
		COURSE_DESC = cOURSE_DESC;
	}

	public int getCOURSE_CREDITHOUR() {
		return COURSE_CREDITHOUR;
	}

	public void setCOURSE_CREDITHOUR(int cOURSE_CREDITHOUR) {
		COURSE_CREDITHOUR = cOURSE_CREDITHOUR;
	}

	public Course getCOURSEPRERQUIST_ID() {
		return COURSEPRERQUIST_ID;
	}

	public void setCOURSEPRERQUIST_ID(Course cOURSEPRERQUIST_ID) {
		COURSEPRERQUIST_ID = cOURSEPRERQUIST_ID;
	}

	public String toString() {
		String str = null;
		
		str = this.COURSE_ID
				+ "," + this.COURSE_CODE
				+ "," + this.COURSE_TITLE
				+ "," + this.COURSE_DESC
				+ "," + this.COURSE_CREDITHOUR
				+ "," + this.COURSEPRERQUIST_ID;
		
		return str;
	}
}
