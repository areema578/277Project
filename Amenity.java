/**	 Scott Arima, Howard Chenn, Riley Haldeman, Joshua Hernandez
     December 6, 2018
     Purpose: Abstract Amenity Decorator to be attached to different rooms
     Inputs: MotelRoom object that amenity is decorating.
     Outputs: Amenity cost and description.
*/
package patternsProject;

public abstract class Amenity extends MotelRoom {
	
	/**
	 * motel room parent object
	 */
	protected MotelRoom motel;
	
	/**
	 * Constructor
	 * @param motel is the parent object being used to contruct decorator
	 */
	public Amenity(MotelRoom motel)
	{
		this.motel = motel;
	}
	
//	MotelRoom motRoom = new AmenityDecorator(motRoom);
	
	/**
	 * cost variable
	 */
	public double cost;
	
	/**
	 * temporary description
	 */
	public String description = "unknown amenity";
	
	/**
	 * getter method for description
	 * @returns string description of decorator
	 */
	public abstract String getDescription();
	
	/**
	 * getter method for amenity cost
	 * @return
	 */
	public double getACost()
	{
		return cost;
	}
	

	public String toString() {
		return null;
	}
	
}
