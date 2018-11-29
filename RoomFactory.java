public class RoomFactory {
	
	public MotelRoom createRoom(String type) {
		MotelRoom room = null;
		
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
