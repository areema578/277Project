public class RoachColony {

	String name;
	int population;
	double growthRate;
	
	public RoachColony(String name, int population, double growthRate) {
		this.name = name;
		this.population = population;
		this.growthRate = growthRate;
	}
	
	public String toString() {
		return "Colony name: " + name + ", Population: " + population;
	}
	
}
