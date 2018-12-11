package patternsProject;

import java.util.ArrayList;

public abstract class MotelRoom {
	
	private String type = "";
	private double cost = 0;
	private RoachColony roachColony;
	private ArrayList<Amenity> amenities = null;
	private int roomNumber = -1;
	protected String description;
	
	
	public double getCost() {
		return cost;
	}

	public String getDescription() {
		return description;
	}
	
}
