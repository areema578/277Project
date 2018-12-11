package patternsProject;

public class RoomFactory {
	
	public MotelRoom createRoom(String type) {
		MotelRoom room = null;
		
		if(type.equals("regular")){
			room = new RegularRoom(null, type, null, 0);
		}else if (type.equals("deluxe")) {
			room = new DeluxeRoom(null, type, null, 0);
		}else if (type.equals("suite")) {
			room = new SuiteRoom(null, type, null, 0);
		}
		return room;
	}

}
