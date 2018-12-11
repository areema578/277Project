/**	 Scott Arima, Howard Chenn, Riley Haldeman, Joshua Hernandez
     December 6, 2018
     Purpose: Concrete Amenity Decorator to be attached to different rooms
     Inputs: MotelRoom object that amenity is decorating.
     Outputs: Amenity cost and description.
*/
package patternsProject;

public class Spa extends Amenity{

	/**
	 * Constructor for Spa Decorator, cost set to 20.0
	 * @param motel is parent object being passed to Amenity Parent object
	 */
	public Spa(MotelRoom motel) {
		super(motel);
		
		cost = 20.0;
	}

	/**
	 * Getter method for description string.
	 */
	public String getDescription()
	{
		return motel.getDescription() + "Spa";
	}
	
	public double getACost()
	{
		return super.getACost();
	}

	@Override
	public double getcost() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
