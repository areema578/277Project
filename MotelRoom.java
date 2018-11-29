package patternsProject;

import java.util.ArrayList;

public abstract class MotelRoom {
	
	private String type = "";
	private double cost = 0;
	private RoachColony roachColony;
	private ArrayList<Ammenities> ammenities = null;
	private int roomNumber = null;
	
	
	public MotelRoom(RoachColony roachColony, 
			String type, ArrayList<Ammenity> ammenities,
			int roomNumber) {
		
		this.roachColony = roachColony;
		this.ammenities = ammenities; 
		this.roomNumber = roomNumber;
		
	}
	
	public double getCost() {
	}
	
}
