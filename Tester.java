package patternsProject;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		RoachMotel rm = RoachMotel.getInstance();
		rm.createRooms();
		System.out.println(rm);
		ArrayList<String> amenities = new ArrayList<String>();
        amenities.add("Foodbar");
        amenities.add("Spa");

		RoachColony colony1 = new RoachColony("1st Colony", 5, 0.5);
		RoachColony colony2 = new RoachColony("2nd Colony", 10, 1.5);
		RoachColony colony3 = new RoachColony("3rd Colony", 25, 0.35);
		RoachColony colony4 = new RoachColony("4th Colony", 40, 0.75);
		RoachColony colony5 = new RoachColony("5th Colony", 36, 2.0);
		RoachColony colony6 = new RoachColony("6th Colony", 89, .30);
		RoachColony colony7 = new RoachColony("7th Colony", 55, 0.75);
		
        RoachMotel rMotel = RoachMotel.getInstance();
        rMotel.createRooms(); // creates rooms
        rMotel.checkIn(colony1, "Suite", amenities);
        
        amenities.add("RefillFood");
        amenities.add("Shower");
        
        rMotel.checkIn(colony2, "Deluxe", amenities);
        amenities.remove(3);
        rMotel.checkIn(colony3, "Regular", amenities);
        amenities.remove(2);
        rMotel.checkIn(colony4, "Regular", amenities);
        amenities.remove(0);
        rMotel.checkIn(colony5, "Regular", amenities);
        
        rMotel.sprayRoom(colony2);
        
        colony1.throwParty();
        colony1.throwParty();
        colony1.throwParty();

        

        
//        rMotel.checkIn(colony6, "Regular", amenities);
//        rMotel.checkIn(colony7, "Regular", amenities);
        
	}
	
}
