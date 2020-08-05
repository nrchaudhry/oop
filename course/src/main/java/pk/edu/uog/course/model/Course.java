package pk.edu.uog.course.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TBLCOURSE")
public class Course {

//	public static String csvFile = "Courses.csv";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long COURSE_ID;
	
	@Column(name = "COURSE_CODE")
	private String COURSE_CODE;
	
	@Column(name = "COURSE_TITLE")
	private String COURSE_TITLE;
	
	@Column(name = "COURSE_DESC")
	private String COURSE_DESC;
	
	@Column(name = "COURSE_CREDITHOUR")
	private Long COURSE_CREDITHOUR;
	
	@Column(name = "COURSEPRERQUIST_ID")
	private Long COURSEPRERQUIST_ID;

	@Column(name = "ISACTIVE")
	private String ISACTIVE;

	@JsonIgnore
	@Column(name = "MODIFIED_BY")
	 private Long MODIFIED_BY;

	@JsonIgnore
	@Column(name = "MODIFIED_WHEN")
	private String MODIFIED_WHEN;

	@JsonIgnore
	@Column(name = "MODIFIED_WORKSTATION")
	private String MODIFIED_WORKSTATION;

	public long getCOURSE_ID() {
		return COURSE_ID;
	}

	public void setCOURSE_ID(long cOURSE_ID) {
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

	public Long getCOURSE_CREDITHOUR() {
		return COURSE_CREDITHOUR;
	}

	public void setCOURSE_CREDITHOUR(Long cOURSE_CREDITHOUR) {
		COURSE_CREDITHOUR = cOURSE_CREDITHOUR;
	}

	public Long getCOURSEPRERQUIST_ID() {
		return COURSEPRERQUIST_ID;
	}

	public void setCOURSEPRERQUIST_ID(Long cOURSEPRERQUIST_ID) {
		COURSEPRERQUIST_ID = cOURSEPRERQUIST_ID;
	}

	public String getISACTIVE() {
		return ISACTIVE;
	}

	public void setISACTIVE(String iSACTIVE) {
		ISACTIVE = iSACTIVE;
	}

	@JsonIgnore
	public Long getMODIFIED_BY() {
		return MODIFIED_BY;
	}

	public void setMODIFIED_BY(Long mODIFIED_BY) {
		MODIFIED_BY = mODIFIED_BY;
	}

	@JsonIgnore
	public String getMODIFIED_WHEN() {
		return MODIFIED_WHEN;
	}

	public void setMODIFIED_WHEN(String mODIFIED_WHEN) {
		MODIFIED_WHEN = mODIFIED_WHEN;
	}

	@JsonIgnore
	public String getMODIFIED_WORKSTATION() {
		return MODIFIED_WORKSTATION;
	}

	public void setMODIFIED_WORKSTATION(String mODIFIED_WORKSTATION) {
		MODIFIED_WORKSTATION = mODIFIED_WORKSTATION;
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
