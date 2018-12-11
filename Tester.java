package patternsProject;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		RoachMotel rm = RoachMotel.getInstance();
		rm.createRooms();
		System.out.println(rm);
		RoachColony rc1 = new RoachColony("First Colony", 100, 200);
		ArrayList<String> amenities = new ArrayList<String>();
        amenities.add("Foodbar");
        amenities.add("Spa");
        amenities.add("RefillFood");
        amenities.add("Shower");
        
		RoachColony colony1 = new RoachColony("1st Colony", 5, 0.5);
		RoachColony colony2 = new RoachColony("2nd Colony", 10, 1.5);
		RoachColony colony3 = new RoachColony("3rd Colony", 25, 0.35);
		RoachColony colony4 = new RoachColony("4th Colony", 40, 0.75);
		RoachColony colony5 = new RoachColony("5th Colony", 36, 2.0);
		RoachColony colony6 = new RoachColony("6th Colony", 89, .30);
		RoachColony colony7 = new RoachColony("7th Colony", 55, 0.75);
		
        RoachMotel rMotel = RoachMotel.getInstance();
        rMotel.createRooms(); // creates rooms
        amenities.add("FoodBar");
        rMotel.checkIn(colony1, "Regular", amenities);

	}
	
}
