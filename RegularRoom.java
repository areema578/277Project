
/**	 Scott Arima, Howard Chenn, Riley Haldeman, Joshua Hernandez
     December 6, 2018
     Purpose: Regular room that extends MotelRoomClass
     Inputs: description and cost per night.
     Outputs: description and cost of room.
*/
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
	

	public String toString() {
		return null;
	}
	
}
