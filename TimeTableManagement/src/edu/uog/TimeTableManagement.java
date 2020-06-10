package edu.uog;

import java.util.List;
import java.util.Scanner;

import edu.uog.campus.Room;
import edu.uog.campus.roomData;
import edu.uog.campus.roomInterface;
import edu.uog.course.Course;
import edu.uog.course.courseData;

public class TimeTableManagement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice=-1;
		
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("Main Menu");
			System.out.println("=====================================================");
			System.out.println("1.   Rooms");
			System.out.println("2.   Courses");
			System.out.println("3.   ");
			System.out.println("4.   ");
			System.out.println("10.   Quit");
			System.out.println("Enter Your Choice [1-10]: ");
			choice = scan.nextInt();
	
			switch (choice) {
			case 1:
				roomInterface.RoomManu();
				choice=-1;
				break;

			case 2:
				choice = -1;
				while (choice!=4) {
					System.out.println("=====================================================");
					System.out.println("Course Menu");
					System.out.println("=====================================================");
					System.out.println("1.   Insert");
					System.out.println("2.   Delete");
					System.out.println("3.   Show");
					System.out.println("4.   Back");
					System.out.print("Enter Your Choice [1-4]: ");
					choice = scan.nextInt();
		
					switch (choice) {
					case 1:
						System.out.print("Add New Room");
						Room room = new Room();
						room.setROOM_NAME("LR-03");
						room.setROOM_FLOUR(1);
						room.setROOM_CAPACITY(50);
						room.setROOM_TYPE("Lab Course");
						room = roomData.Save(room);
						System.out.println(room.toString());
						System.out.println("---------------------------------");
						break;
					case 2:
						break;
					case 3:
						System.out.println("FindAll");
						List<Room> rooms = roomData.findAll();
						for (int i=0; i<rooms.size(); i++) {
							System.out.println(rooms.get(i).toString());
						}
						System.out.println("---------------------------------");
						break;
					case 4:
						break;
					}
				}
				choice=-1;
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 10:
				break;
			default:
				System.out.println("Invalid Choice!");
			}
		}
		
//		roomData roomdata = new roomData();
//		
//		System.out.println("FindOne");
//		Course course = coursedata.findOne(1);
//		System.out.println(course.toString());
//		System.out.println("---------------------------------");
//	
//		System.out.println("FindAll");
//		List<Course> courses = courseData.findAll();
//		for (int i=0; i<courses.size(); i++) {
//			System.out.println(courses.get(i).toString());
//		}
//		System.out.println("---------------------------------");
//
//		System.out.println("Search");
//		courses = coursedata.search("CR-");
//		for (int i=0; i<courses.size(); i++) {
//			System.out.println(courses.get(i).toString());
//		}
//		System.out.println("---------------------------------");
//	
//		System.out.println("Save");
//		Room room = new Room();
//		room.setROOM_NAME("LR-03");
//		room.setROOM_FLOUR(1);
//		room.setROOM_CAPACITY(50);
//		room.setROOM_TYPE("Lab Course");
//		room = roomdata.Save(room);
//		System.out.println(room.toString());
//		System.out.println("---------------------------------");
//
//		System.out.println("FindAll");
//		courses = coursedata.findAll();
//		for (int i=0; i<courses.size(); i++) {
//			System.out.println(courses.get(i).toString());
//		}
//		System.out.println("---------------------------------");
//
//		System.out.println("Save Course");
//		Course prerequistcourse = new Course();
//		prerequistcourse = courseData.findByCode("CS-102");
//		
//		Course course = new Course();
//		course.setCOURSE_CODE("CS-106");
//		course.setCOURSE_TITLE("Object Oriented Programming");
//		course.setCOURSE_DESC("It is programming course");
//		course.setCOURSE_CREDITHOUR(4);
//		course.setCOURSEPRERQUIST_ID(prerequistcourse);
//		course = courseData.Save(course);
//		System.out.println(room.toString());
//		System.out.println("---------------------------------");
	}
}
