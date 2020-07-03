package edu.uog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.uog.campus.Room;
import edu.uog.campus.roomData;

import edu.uog.campus.roomInterface;
import edu.uog.course.Course;
import edu.uog.course.courseData;
import edu.uog.person.Person;
import edu.uog.student.Student;
import edu.uog.teacher.Teacher;

public class TimeTableManagement {

	public static void main(String[] args) {
		courseData coursedata = new courseData();
		roomData roomdata = new roomData();
		
		List<Student> students = new ArrayList<Student>();
		
		Person person = new Person();
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		person.setFORE_NAME("USAMA RAHEEM");
		
		student.setPERSON_ID(person);
		student.setSTUDENT_ROLLNO("19011519-001");
		
		teacher.setPERSON_ID(person);
		teacher.setEMPLOYEE_CODE("0041");
		
		System.out.println("Student Name: "+student.getPERSON_ID().getFORE_NAME());
		System.out.println("Teacher Name: "+teacher.getPERSON_ID().getFORE_NAME());
		

//		s2 = s1;
//		if (s1 == s2)
//			System.out.println("Student Equal!");
//		
//		student.setFORE_NAME("USAMA MUSTAFA");
//		student.setSTUDENT_ROLLNO("19011519-001");
//		students.add(student);
//		
//		student = new Student();
//		student.setFORE_NAME("USAMA RAHEEM");
//		student.setSTUDENT_ROLLNO("19011519-002");
//		students.add(student);
//		
//		student = new Student();
//		student.setFORE_NAME("USAMA SAEED");
//		student.setSTUDENT_ROLLNO("19011519-003");
//		students.add(student);
//
//		student = new Student();
//		student.setFORE_NAME("Jawad Altaf");
//		student.setSTUDENT_ROLLNO("19011519-004");
//		students.add(student);
//
//		for (int i=0;i<students.size();i++) {
//			System.out.println(students.get(i).getSTUDENT_ROLLNO()+"\t"+students.get(i).getFORE_NAME());
//		}
//		
//		person.setFORE_NAME("ABC");
//
//		teacher.setFORE_NAME("Dr. Nauman Riaz");
//		teacher.setTEACHER_ID(1);
//		
	}
}
