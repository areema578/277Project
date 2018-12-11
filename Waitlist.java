package patternsProject;

import java.util.PriorityQueue;
import java.util.Queue;

public class Waitlist implements Observer {

    private static Waitlist list;

    private static RoachMotel motel;

    private Queue<MotelRoom> waitlist;

    private Waitlist() {
    	waitlist = new PriorityQueue<MotelRoom>();
    }

    /**
     * Create singleton instance of WaitList
     * @return waitlist
     */
    public static synchronized Waitlist getList() {
        if (list == null) {
        	list = new Waitlist();
        }
        return list;
    }

    /**
     * Adds a RoachColony to the WaitList
     */
    public void waitListAdd(MotelRoom room) {
        waitlist.add(room);
    }
    
    public Queue<MotelRoom> getQueue() {
    	return waitlist;
    }
  
    /**
     * Receives update from RoachMotel and adds a RoachColony if there is vacancy
     */
    @Override
    public void update() {
        if (motel.getVacancy() && waitlist.size() > 0) {
        	motel.admit(waitlist.remove());
        }
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
