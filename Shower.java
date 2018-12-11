/**	 Scott Arima, Howard Chenn, Riley Haldeman, Joshua Hernandez
     December 6, 2018
     Purpose: Concrete Amenity Decorator to be attached to different rooms
     Inputs: MotelRoom object that amenity is decorating.
     Outputs: Amenity cost and description.
*/
package patternsProject;

public class Shower extends Amenity{
	MotelRoom room;
	/**
	 * Constructor for Shower Decorator, cost is set to 25.0
	 * @param motel is parent object being passed to Amenity Parent object
	 */
	public Shower(MotelRoom room) 
	{
		super(room);
		
		cost = 25.0;
	}
	
	String description = "Shower";
	
	/**
	 * Getter method for description string.
	 */
	public String getDescription()
	{
		String temp =  room.getDescription() + this.description; 
		return temp;
	}
	
	/**
	 * Getter method for cost variable.
	 */
	public double getACost()
	{
		return super.getACost();
	}

	@Override
	public double getcost() {
		// TODO Auto-generated method stub
		return room.getcost() + cost;
	}
	
	public String toString() {
		return null;
	}

}
