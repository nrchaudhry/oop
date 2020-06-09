package edu.uog;

import java.util.List;

import edu.uog.campus.Room;
import edu.uog.campus.roomData;
import edu.uog.course.Course;
import edu.uog.course.courseData;

public class TimeTableManagement {

	public static void main(String[] args) {
		roomData roomdata = new roomData();
		
//		System.out.println("FindOne");
//		Course course = coursedata.findOne(1);
//		System.out.println(course.toString());
//		System.out.println("---------------------------------");
	
		System.out.println("FindAll");
		List<Course> courses = courseData.findAll();
		for (int i=0; i<courses.size(); i++) {
			System.out.println(courses.get(i).toString());
		}
		System.out.println("---------------------------------");

//		System.out.println("Search");
//		courses = coursedata.search("CR-");
//		for (int i=0; i<courses.size(); i++) {
//			System.out.println(courses.get(i).toString());
//		}
//		System.out.println("---------------------------------");
//	
		System.out.println("Save");
		Room room = new Room();
		room.setROOM_NAME("LR-03");
		room.setROOM_FLOUR(1);
		room.setROOM_CAPACITY(50);
		room.setROOM_TYPE("Lab Course");
		room = roomdata.Save(room);
		System.out.println(room.toString());
		System.out.println("---------------------------------");
//
//		System.out.println("FindAll");
//		courses = coursedata.findAll();
//		for (int i=0; i<courses.size(); i++) {
//			System.out.println(courses.get(i).toString());
//		}
//		System.out.println("---------------------------------");

		System.out.println("Save Course");
		Course prerequistcourse = new Course();
		prerequistcourse = courseData.findByCode("CS-102");
		
		Course course = new Course();
		course.setCOURSE_CODE("CS-106");
		course.setCOURSE_TITLE("Object Oriented Programming");
		course.setCOURSE_DESC("It is programming course");
		course.setCOURSE_CREDITHOUR(4);
		course.setCOURSEPRERQUIST_ID(prerequistcourse);
		course = courseData.Save(course);
		System.out.println(room.toString());
		System.out.println("---------------------------------");
	}
}
