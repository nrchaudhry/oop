package edu.uog;

import java.util.List;

import edu.uog.campus.Room;
import edu.uog.campus.roomData;

public class TimeTableManagement {

	public static void main(String[] args) {
		roomData roomdata = new roomData();
		
		System.out.println("FindOne");
		Room room = roomdata.findOne(3);
		System.out.println(room.toString());
		System.out.println("---------------------------------");
	
		System.out.println("FindAll");
		List<Room> rooms = roomdata.findAll();
		for (int i=0; i<rooms.size(); i++) {
			System.out.println(rooms.get(i).toString());
		}
		System.out.println("---------------------------------");

		System.out.println("Search");
		rooms = roomdata.search("CR-");
		for (int i=0; i<rooms.size(); i++) {
			System.out.println(rooms.get(i).toString());
		}
		System.out.println("---------------------------------");
	
		System.out.println("Save");
		room.setROOM_NAME("LR-03");
		room.setROOM_FLOUR(1);
		room.setROOM_CAPACITY(50);
		room.setROOM_TYPE("Lab Room");
		room = roomdata.Save(room);
		System.out.println(room.toString());
		System.out.println("---------------------------------");

		System.out.println("FindAll");
		rooms = roomdata.findAll();
		for (int i=0; i<rooms.size(); i++) {
			System.out.println(rooms.get(i).toString());
		}
		System.out.println("---------------------------------");

	}
}
