/**	 Scott Arima, Howard Chenn, Riley Haldeman, Joshua Hernandez
     December 6, 2018
     Purpose: Concrete Amenity Decorator to be attached to different rooms
     Inputs: MotelRoom object that amenity is decorating.
     Outputs: Amenity cost and description.
*/
package patternsProject;

public class RefillFood extends Amenity{

	/**
	 * Constructor for Food Bar Refill, cost is set to 5.0
	 * @param motel is parent object being passed to Amenity Parent object
	 */
	public RefillFood(MotelRoom motel) {
		super(motel);
		
		cost = 5.0;
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Getter method for description string.
	 */
	public String getDescription()
	{
		return motel.getDescription() + "Food Bar Refill";
	}
	
	/**
	 * Getter method for cost variable.
	 */
	public double getACost()
	{
		return super.getACost();
	}
	
	

}
