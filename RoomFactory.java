package patternsProject;

public class RoomFactory {
	
	
	
	public Room createRoom(String type) {
		Room room = null;
		
		if(type.equals("regular")){
			room = new RegularRoom();
		}else if (type.equals("deluxe")) {
			room = new DeluxeRoom();
		}else if (type.equals("suite")) {
			room = new SuiteRoom();
		}
		return room;
	}

}
