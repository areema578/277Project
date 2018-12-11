package patternsProject;

import java.util.ArrayList;

public abstract class MotelRoom {
	
	private String type = "";
	private double cost = 0;
	private RoachColony roachColony;
	private ArrayList<Amenity> ammenities = null;
	private int roomNumber = -1;
	
	
	public MotelRoom(RoachColony roachColony, 
			String type, ArrayList<Amenity> ammenities,
			int roomNumber) {
		
		this.roachColony = roachColony;
		this.ammenities = ammenities; 
		this.roomNumber = roomNumber;
		
	}
	
	public double getCost() {
		return cost;
	}
	
}
