package edu.uog.timetable;

public class TimeSlot {

	public static String csvFile = "D:\\TimeSlots.csv";

	private int TIMESLOT_ID;
	
	private WeekDay WEEKDAY_ID;
	
	private String TIMESLOT_START;
	
	private String TIMESLOT_END;

	public int getTIMESLOT_ID() {
		return TIMESLOT_ID;
	}

	public void setTIMESLOT_ID(int tIMESLOT_ID) {
		TIMESLOT_ID = tIMESLOT_ID;
	}

	public WeekDay getWEEKDAY_ID() {
		return WEEKDAY_ID;
	}

	public void setWEEKDAY_ID(WeekDay wEEKDAY_ID) {
		WEEKDAY_ID = wEEKDAY_ID;
	}

	public String getTIMESLOT_START() {
		return TIMESLOT_START;
	}

	public void setTIMESLOT_START(String tIMESLOT_START) {
		TIMESLOT_START = tIMESLOT_START;
	}

	public String getTIMESLOT_END() {
		return TIMESLOT_END;
	}

	public void setTIMESLOT_END(String tIMESLOT_END) {
		TIMESLOT_END = tIMESLOT_END;
	}
	
	public String toString() {
		String str = null;
		
		str = this.TIMESLOT_ID
				+ "," + this.WEEKDAY_ID.getWEEKDAY_ID()
				+ "," + this.TIMESLOT_START
				+ "," + this.TIMESLOT_END;
		
		return str;
	}
}
