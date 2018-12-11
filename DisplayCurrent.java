package patternsProject;

public class DisplayCurrent implements Observer, DisplayElement{
	
	private Subject waitlist;
	//values (colony, roomType, amenities, roomNum)
	
	public DisplayCurrent(Subject waitlist) {
		this.waitlist = waitlist;
		waitlist.addObserver(this);
	}

	@Override
	public void update() {
		//values (colony, roomType, amenities, roomNum)
		
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Colony name has received the notfication from the motel");
	}

	@Override
	public void setSubject(Subject subject) {
		// TODO Auto-generated method stub
		
	}

}
