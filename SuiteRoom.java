package patternsProject;

public class SuiteRoom extends MotelRoom{
	private double cost;
	
	public SuiteRoom() {
		cost = 100;
		description = "SuiteRoom";
	}

	public String getDescription() {
		return description;
	}

	@Override
	public double getcost() {
		return cost;
	}
	

	public String toString() {
		return null;
	}
	
}
