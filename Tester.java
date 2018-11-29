import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		RoachMotel rm = RoachMotel.getInstance();
		rm.createRooms();
		System.out.println(rm);
		RoachColony rc1 = new RoachColony("First Colony", 100, 200);
		ArrayList amenities = new ArrayList();
        amenities.add("foodbar");
        amenities.add("spa");
        amenities.add("refillbar");
        amenities.add("shower");
	}
	
}
