package patternsProject;

import java.util.Queue;

public class Waitlist implements Observer {

    private static Waitlist list;

    private static RoachMotel motel;

    private Queue<RoachColony> waitlist;

    private Waitlist() {
    	//the actual waitlist (FIFO)
    }

    /**
     * Create and/or return singleton instance of WaitList
     */
    public static synchronized Waitlist getList() {
        if (list == null) list = new Waitlist();
        return list;
    }

    /**
     * Adds a RoachColony to the WaitList
     */
    public void add(RoachColony colony) {
        waitlist.add(colony);
    }

    /**
     * Receives update from RoachMotel and checks in a RoachColony if there is vacancy
     */
    @Override
    public void update() {
//        if (motel.getVacancy() && waitlist.size() > 0) {
//        	motel.checkIn(waitlist.remove());
//        }
    }

    /**
     * Get instance of the observer's subject
     */
    @Override
    public void setSubject(Subject subject) {
        this.motel = (RoachMotel)subject;
    }
    

	public String toString() {
		return null;
	}
	

}
