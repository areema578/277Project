package patternsProject;

public class Shower extends Amenity{

	public Shower(MotelRoom motel) {
		super(motel);
		
		cost = 25.0;
		// TODO Auto-generated constructor stub
	}

	
	public String getDescription()
	{
		return motel.getDescription() + "Shower";
	}
	
	
	public double getACost()
	{
		return super.getACost();
	}
	
	

}
