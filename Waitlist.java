package patternsProject;

import java.util.Queue;

public class Waitlist implements Observer {

    private static Waitlist list;

    private static RoachMotel motel;

    private Queue<MotelRoom> waitlist;

    private Waitlist() {
        waitlist = new Queue<>();
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
    public void add(MotelRoom in) {
        waitlist.add(in);
    }

    /**
     * Receives update from RoachMotel and checks in a RoachColony if there is vacancy
     */
    @Override
    public void update() {
        if (motel.getVacancy() && waitlist.size() > 0) motel.admitRoom(waitlist.remove());
    }

    /**
     * Get instance of the observer's subject
     */
    @Override
    public void setSubject(Subject subject) {
        this.motel = (RoachMotel)subject;
    }

}
