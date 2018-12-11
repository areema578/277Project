/**	 Scott Arima, Howard Chenn, Riley Haldeman, Joshua Hernandez
     December 6, 2018
     Purpose: Roach colony class which is able to throwParties, set population/growth rate
     Inputs: name , population and growth rate.
     Outputs: name , population and growth rate.
*/
package patternsProject;

public class RoachColony implements Observer {

	private String name;
	private int population;
	private double growthRate;
	
	public RoachColony(String name, int population, double growthRate) {
		this.name = name;
		this.population = population;
		this.growthRate = growthRate;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void throwParty() {
		System.out.println(this.getName() + " is throwing a party");
		this.population = (int) (this.population + (this.growthRate * this.population ));
	}
	
	public int getPopulation() {
		return this.population;
	}
	
	public double getGrowthRate() {
		return this.growthRate;
	}
	
	public String toString() {
		return "Colony name: " + name + ", Population: " + population;
	}
	
	public void setPopulation(int pop) {
		this.population = pop;
	}

	@Override
	public void update() {
		System.out.println( getName() + " received the notification from the motel");
		System.out.println(" There is a room avaible to check in!");
	}

	@Override
	public void setSubject(Subject subject) {
		
	}

	public boolean getAmenities() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
