package edu.uog;

import java.util.List;

import edu.uog.course.Course;
import edu.uog.course.courseData;

public class TimeTableManagement {

	public static void main(String[] args) {
		courseData coursedata = new courseData();
		
//		System.out.println("FindOne");
//		Course course = coursedata.findOne(1);
//		System.out.println(course.toString());
//		System.out.println("---------------------------------");
	
		System.out.println("FindAll");
		List<Course> courses = coursedata.findAll();
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
//		System.out.println("Save");
//		course.setCOURSE_NAME("LR-03");
//		course.setCOURSE_FLOUR(1);
//		course.setCOURSE_CAPACITY(50);
//		course.setCOURSE_TYPE("Lab Course");
//		course = coursedata.Save(course);
//		System.out.println(course.toString());
//		System.out.println("---------------------------------");
//
//		System.out.println("FindAll");
//		courses = coursedata.findAll();
//		for (int i=0; i<courses.size(); i++) {
//			System.out.println(courses.get(i).toString());
//		}
//		System.out.println("---------------------------------");

	}
}
