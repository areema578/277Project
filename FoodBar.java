/**	 Scott Arima, Howard Chenn, Riley Haldeman, Joshua Hernandez
     December 6, 2018
     Purpose: Concrete Amenity Decorator to be attached to different rooms
     Inputs: MotelRoom object that amenity is decorating.
     Outputs: Amenity cost and description.
*/


package patternsProject;

public class FoodBar extends Amenity{
	MotelRoom room;
	/**
	 * Constructor for Food Bar, cost is set to 10.0
	 * @param motel is parent object being passed to Amenity Parent object
	 */
	public FoodBar(MotelRoom room) {
		super(room);
		cost = 10.0;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Getter method for description string.
	 */
	public String getDescription()
	{
		return room.getDescription() + "Food Bar";
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
	
	

}
