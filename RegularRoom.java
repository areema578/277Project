package patternsProject;

public class RegularRoom extends MotelRoom{
	
	private static double cost;
	
	public RegularRoom() {
		cost = 50;
		description = "Regular Room";
	}
	
	public String getDescription() {
		return description;
	}

	@Override
	public double getcost() {
		return cost;
	}
}
