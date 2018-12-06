package patternsProject;

public class FoodBar extends Amenity{

	public FoodBar(MotelRoom motel) {
		super(motel);
		
		cost = 10.0;
		// TODO Auto-generated constructor stub
	}

	public String getDescription()
	{
		return motel.getDescription() + "Food Bar";
	}
	
	public double getACost()
	{
		return super.getACost();
	}
	
	

}
