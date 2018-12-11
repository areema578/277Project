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
	
	public String getDescription()
	{
		return motel.getDescription() + "Food Bar Refill";
	}
	
	public double getACost()
	{
		return super.getACost();
	}


	public double getcost() {
		// TODO Auto-generated method stub
		return room.getcost() + cost;
	}
	

	public String toString() {
		return null;
	}
	
	
	

}
