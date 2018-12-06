package patternsProject;

public abstract class Amenity extends MotelRoom {
	
	protected MotelRoom motel;
	
	public Amenity(MotelRoom motel)
	{
		this.motel = motel;
	}
	
//	MotelRoom motRoom = new AmenityDecorator(motRoom);
	
	
	public double cost;
	
	public String discription;
	
	public double getACost()
	{
		return cost;
	}
	
	
}
