
/**	 Scott Arima, Howard Chenn, Riley Haldeman, Joshua Hernandez
     December 6, 2018
     Purpose: Abstract motel room class.
     Inputs: description of room.
     Outputs: N/A
*/

package patternsProject;


public abstract class MotelRoom {
	
	protected String description;
	
	public String getDescription() {
		return description;
	}

	public abstract double getcost();
	
}
