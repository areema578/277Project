/**	 Scott Arima, Howard Chenn, Riley Haldeman, Joshua Hernandez
     December 6, 2018
     Purpose: Specific room that extends MotelRoomClass
     Inputs: description and cost per night.
     Outputs: description and cost of room.
*/
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
	

	public String toString() {
		return null;
	}
	
	
}
