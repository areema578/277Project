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
	
	/**
	 * constructor for Roach colony
	 * @param name- name as a string type
	 * @param population - population as a integer type
	 * @param growthRate - growthrate as a double tyoe
	 */
	public RoachColony(String name, int population, double growthRate) {
		this.name = name;
		this.population = population;
		this.growthRate = growthRate;
	}
	/**
	 * getter for name of colony
	 * @return - name as a string variable
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * this method throws a party for the roach colony
	 */
	public void throwParty() {
		System.out.println(this.getName() + " is throwing a party");
		this.population = (int) (this.population + (this.growthRate * this.population ));
		System.out.println("Population of Roach Conlony: " + this.population );
	}
	/**
	 * getter method for population
	 * @return the population as an integer
	 */
	public int getPopulation() {
		return this.population;
	}
	/**
	 * getter method for the GrowthRate
	 * @return the growthrate as a double
	 */
	public double getGrowthRate() {
		return this.growthRate;
	}
	/**
	 * toString method that returns the conlony name and population
	 */
	public String toString() {
		return "Colony name: " + name + ", Population: " + population;
	}
	/**
	 * setter for population
	 * @param pop - the integer value to set the population up. 
	 */
	public void setPopulation(int pop) {
		this.population = pop;
	}

	@Override
	/**
	 * updates to notify roachColony of vacant room
	 */
	public void update() {
		System.out.println( getName() + " received the notification from the motel");
		System.out.println(" There is a room avaible to check in!");
	}

	@Override
	/**
	 * sets the subject
	 */
	public void setSubject(Subject subject) {
		
	}
	/**
	 * getter for the Ammenities boolean
	 * @return - the boolean for shower ammenitiy
	 */
	public boolean getAmenities() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
