package patternsProject;

import java.util.ArrayList;

public abstract class MotelRoom {
	
	private String type = "";
	private double cost = 0;
	private RoachColony roachColony;
	private ArrayList<Amenity> amenities = null;
	private int roomNumber = -1;
	
	
	public MotelRoom(RoachColony roachColony, 
			String type, ArrayList<Amenity> amenities,
			int roomNumber) {
		
		this.roachColony = roachColony;
		this.amenities = amenities; 
		this.roomNumber = roomNumber;
		
	}
	
	public double getCost() {
		return cost;
	}
	
}
