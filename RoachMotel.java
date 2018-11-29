package patternsProject;

import java.util.ArrayList;

public class RoachMotel { //simple locking

	private RoachMotel() {}
	
	private static RoachMotel uniqueInstance;
	
	public static RoachMotel getInstance() {
		
		synchronized(RoachMotel.class) {
			if(uniqueInstance == null) {
				uniqueInstance = new RoachMotel();
			}
		}
		return uniqueInstance;
	}
	
	protected ArrayList<Integer> roomNumAv = new ArrayList<Integer>();
	protected ArrayList<MotelRoom> rooms = new ArrayList<MotelRoom>();
	
	public void createRooms() {
		roomNumAv.add(101);
		roomNumAv.add(102);
		roomNumAv.add(103);
		roomNumAv.add(104);
		roomNumAv.add(105);
	}
	
	public void checkIn(RoachColony colony, String roomType, ArrayList<Amenities> amenities) {
		int roomNum = roomNumAv.get(0);
		if(roomType.equals("Regular")) {
			MotelRoom room = new RegularRoom(colony, roomType, amenities, roomNum);
		}
		else if(roomType.equals("Deluxe")) {
			MotelRoom room = new DeluxeRoom(colony, roomType, amenities, roomNum);
		}
		else { //suite
			MotelRoom room = new SuiteRoom(colony, roomType, amenities, roomNum);
		}
		rooms.add(room);
		roomNumAv.remove(0);
		//cost per night (decorator for amenities)
		System.out.println("Amenities: " + amenities + "\nCost per night: $" + room.getCost());
	}
	
	public String toString() {
		return "Available Rooms: " + roomNumAv;
	}
	
}
