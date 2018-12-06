package patternsProject;

public class Spa extends Amenity{

	public Spa(MotelRoom motel) {
		super(motel);
		
		cost = 20.0;
		// TODO Auto-generated constructor stub
	}

	public String getDescription()
	{
		return motel.getDescription() + "Spa";
	}
	
	public double getACost()
	{
		return super.getACost();
	}
	
	

}
