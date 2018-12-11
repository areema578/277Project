package patternsProject;

public class RoomFactory {
	
	public RoomFactory() {}
	
	public MotelRoom createRoom(String type) {
		MotelRoom room = null;
		 
		if(type.equals("Regular")){
			room = new RegularRoom();
		}else if (type.equals("Deluxe")) {
			room = new DeluxeRoom();
		}else if (type.equals("Suite")) {
			room = new SuiteRoom();
		}
		
		return room;
	}

}
