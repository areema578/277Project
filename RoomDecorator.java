package patternsProject;

public abstract class RoomDecorator extends MotelRoom {
	
	protected MotelRoom motel;
	
	public RoomDecorator()
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
