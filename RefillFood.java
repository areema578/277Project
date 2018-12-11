/**	 Scott Arima, Howard Chenn, Riley Haldeman, Joshua Hernandez
     December 6, 2018
     Purpose: Food Bar refill amenity
     Inputs: cost of amenity
     Outputs: 
*/
package patternsProject;

public class RefillFood extends Amenity{
	MotelRoom room;
	public RefillFood(MotelRoom motel) {
		super(motel);
		
		cost = 5.0;
		// TODO Auto-generated constructor stub
	}
	/**
	 * getter for room description + ammenities
	 */
	public String getDescription()
	{
		return motel.getDescription() + "Food Bar Refill";
	}
	
	/**
	 * getter for amenity cost
	 */
	public double getACost()
	{
		return super.getACost();
	}

	/**
	 * getter for room+ amenity cost
	 */
	public double getcost() {
		// TODO Auto-generated method stub
		return room.getcost() + cost;
	}
	
	/**
	 * toString method for room description
	 */
	public String toString() {
		return description;
	}
	
	
	

}
