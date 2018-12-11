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
	/**
	 * getter for description string variable
	 */
	public String getDescription() {
		return description;
	}

	@Override
	/**
	 * getter that returns the cost of room
	 */
	public double getcost() {
		return cost;
	}
	

	/**
	 * toString method that returns the description of the room.
	 */
	public String toString() {
		return description;
	}
	
	
}
