package patternsProject;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		RoachMotel rMotel = RoachMotel.getInstance();
		rMotel.createRooms();
		System.out.println(rMotel);
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
	
        rMotel.checkIn(colony1, "Suite", amenities);
      
        rMotel.checkIn(colony2, "Deluxe", amenities);
        amenities.remove(3);
        rMotel.checkIn(colony3, "Regular", amenities);
        amenities.remove(2);
        rMotel.checkIn(colony4, "Regular", amenities);
        amenities.remove(0);
        rMotel.checkIn(colony5, "Regular", amenities);
        
        rMotel.sprayRoom(colony2); //spray room
        
        System.out.println(rMotel); //check available rooms
        
        rMotel.checkOut(101); //check out based on room number
        
        System.out.println(rMotel);

        rMotel.checkIn(colony6, "Regular", amenities);
        System.out.println(rMotel);
        
        rMotel.checkIn(colony7, "Regular", amenities);
        
        rMotel.checkOut(105);
        
	}
	
}
