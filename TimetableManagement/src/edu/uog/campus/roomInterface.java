package edu.uog.campus;

import java.util.List;
import java.util.Scanner;

public class roomInterface {

	public static void RoomManu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("Rooms Menu");
			System.out.println("=====================================================");
			System.out.println("1.   Insert");
			System.out.println("2.   Delete");
			System.out.println("3.   Show");
			System.out.println("4.   Search");
			System.out.println("5.   Delete All");
			System.out.println("10.   Back");
			System.out.print("Enter Your Choice [1-10]: ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("---------------------------------");
				System.out.println("Add New Room");
				System.out.println("---------------------------------");
				Room room = new Room();
				
				System.out.println("Enter Room Name: ");
				String name = scan.nextLine();
				name+=scan.nextLine();
				room.setROOM_NAME(name);

				System.out.println("Enter Room Flour: ");
				int flour = scan.nextInt();
				room.setROOM_FLOUR(flour);

				System.out.println("Enter Room Capacity: ");
				int capacity = scan.nextInt();
				room.setROOM_CAPACITY(capacity);

				System.out.println("Enter Room Type: ");
				String type = scan.nextLine();
				type+=scan.nextLine();
				room.setROOM_TYPE(type);

				room = roomData.Save(room);
				System.out.println(room.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete Room");
				System.out.println("---------------------------------");
				System.out.println("Enter Room ID: ");
				int room_ID = scan.nextInt();
				
				Room roomdelete = roomData.deleteOne(room_ID);
				System.out.println(roomdelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All Rooms Data");
				System.out.println("---------------------------------");
				List<Room> rooms = roomData.findAll();
				for (int i=0; i<rooms.size(); i++) {
					System.out.println(rooms.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search Room");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<Room> roomsearch = roomData.search(search);
				for (int i=0; i<roomsearch.size(); i++) {
					System.out.println(roomsearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
	
}
