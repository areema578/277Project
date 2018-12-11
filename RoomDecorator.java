/**	 Scott Arima, Howard Chenn, Riley Haldeman, Joshua Hernandez
     December 6, 2018
     Purpose: Abstract Amenity Decorator to be attached to different rooms
     Inputs: MotelRoom object that amenity is decorating.
     Outputs: Amenity cost and description.
*/
package patternsProject;

public abstract class RoomDecorator extends MotelRoom {
	
	protected MotelRoom room;
	
	public RoomDecorator()
	{
		this.room = room;
	}
	
//	MotelRoom motRoom = new AmenityDecorator(motRoom);
	
	
	public double cost;
	
	public String description;
	
	public double getACost()
	{
		return cost;
	}
	

	public String toString() {
		return description;
	}
	
	
}
