package patternsProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

public class RoachMotel implements Subject { //simple locking
	private ArrayList<Observer> observers = new ArrayList<>();
	private ArrayList<Integer> roomNumAv = new ArrayList<Integer>();
	private HashMap<Integer, MotelRoom> rooms = new HashMap<Integer, MotelRoom>();
	private HashMap<RoachColony, Integer> guests = new HashMap<RoachColony, Integer>();
	private HashMap<RoachColony, MotelRoom> ColonyRooms = new HashMap<RoachColony, MotelRoom>();
	private RoomFactory roomFactory = new RoomFactory();
	
	private static Waitlist waitList;
	
	private boolean vacancy;
	private boolean updated;
	private int capacity; 

	private RoachMotel() {
		observers = new ArrayList<Observer>(); //list of observers
		vacancy = true;
		roomNumAv = new ArrayList<Integer>(); //just room numbers
		rooms = new HashMap<Integer, MotelRoom>(); //rooms taken list
		capacity = 5;
		
		//???????? creation of waitlist ????????????
		waitList = Waitlist.getList();
		addObserver(waitList);
		waitList.setSubject(this);
	}
	
	private static RoachMotel uniqueInstance;
	
	public static RoachMotel getInstance() { //singleton idea
		
		synchronized(RoachMotel.class) {
			if(uniqueInstance == null) {
				uniqueInstance = new RoachMotel();
			}
		}
		return uniqueInstance;
	}
	
	public void createRooms() { //just to create the room numbers
		roomNumAv.add(101);
		roomNumAv.add(102);
		roomNumAv.add(103);
		roomNumAv.add(104);
		roomNumAv.add(105);
	}
	
	public void checkIn(RoachColony colony, String roomType, ArrayList<String> amenities) {
		if( roomNumAv.size() == 0) {
			vacancy = false;
		}
		
		if(vacancy) {
			
			MotelRoom motelRoom = roomFactory.createRoom(roomType); //create the rooms based on input
			rooms.put(roomNumAv.get(0), motelRoom);
			roomNumAv.remove(0);
			//cost per night (decorator for amenities)
			System.out.println("Amenities: " + amenities + "\nCost per night: $" + motelRoom.getcost());
			
			//adding ammenities to room description
			for(int i = 0; i < amenities.size(); i++) {
				if(amenities.get(i).equals("Shower")) {
					motelRoom = new Shower(motelRoom);
				}
				else if(amenities.get(i).equals("Spa")) {
					motelRoom = new Spa(motelRoom);
				}
				else if(amenities.get(i).equals("FoodBar")) {
					motelRoom = new FoodBar(motelRoom);
				}
				else if(amenities.get(i).equals("RefillFood")) {
					motelRoom = new RefillFood(motelRoom);
				}
			}
			ColonyRooms.put(colony, motelRoom);
		} else {
			
			System.out.println("Motel Rooms are booked, added "+ colony.getName() + " to waitlist" );
			waitList.add(colony); //????
		}
		setVacancy(rooms.size() != capacity); //checks if the number of rooms taken equals capacity
		//if they equal then vacancy is false
		//if they dont equal then vacancy is true, available rooms
	}
	
	public MotelRoom getRoom(int key) { //tester to get the room
		return rooms.get(key);
	}
	
	public void checkOut(int roomNumber) {
		rooms.remove(roomNumber);
		setVacancy(rooms.size() != capacity);
	}
	
	public String toString() {
		return "Available Rooms: " + roomNumAv;
	}

	@Override
	public void addObserver(Observer observer) {
		if(!observers.contains(observer)) { //cant add the same
			observers.add(observer);
		} //adding to the waitlist
	}

	@Override
	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if( i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		/*
		for(int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			//update
		}
		*/
		ArrayList<Observer> temp = null;
		if(!updated) {
			return;
		}
		temp = new ArrayList<>(observers);
		this.updated = false; //marking if it is updated/changed
		for(Observer observer : temp) {
			observer.update();
		}
	}
	
	public boolean getVacancy() {
		return vacancy;
	}
	
	public void setVacancy(boolean vacancy) {
		this.vacancy = vacancy;
		this.updated = true;
		notifyObservers();
	}
	
	public void sprayRoom(RoachColony colony) {
		int pop = colony.getPopulation();
		System.out.println("Sprayed " + colony.getName() );
		if(ColonyRooms.get(colony).description.contains("Shower")) {
			pop -= pop * 0.25;
			System.out.println("Room has a shower! Colony Population went from: " 
			+ colony.getPopulation() + "to " + pop );
			colony.setPopulation(pop);
		}else {
			pop -= pop * 0.50;
			System.out.println("Room does not have ashower! Colony Population went from: " 
			+ colony.getPopulation() + "to " + pop );
			colony.setPopulation(pop);
		}
	}
}
