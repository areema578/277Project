package patternsProject;

public class RoomFactory {
	private String roomType;
	public RoomFactory() {}
	
	public MotelRoom createRoom(String type) {
		MotelRoom room = null;
		this.roomType = type;
		if(type.equals("Regular")){
			room = new RegularRoom();
		}else if (type.equals("Deluxe")) {
			room = new DeluxeRoom();
		}else if (type.equals("Suite")) {
			room = new SuiteRoom();
		}
		
		return room;
	}
	/**
	 * to string method that returns roomType as a string
	 */
	public String toString() {
		return roomType;
	}

}
