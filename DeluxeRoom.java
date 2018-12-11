package patternsProject;


public class DeluxeRoom extends MotelRoom {
	
	private double cost;
	
	public DeluxeRoom() {
		description = "Deluxe Room";
		cost = 75;
	}
	
	public String getDescription() {
		return description;
	}

	@Override
	public double getcost() {
		return cost;
	}
	
	
}
