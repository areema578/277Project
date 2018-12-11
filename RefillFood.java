package patternsProject;

public class RefillFood extends Amenity{

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
		return cost;
	}
	
	

}
