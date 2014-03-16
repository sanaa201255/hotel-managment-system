package Controller;

import java.util.ArrayList;

import DB.*;
import Model.*;


public class EventController {
	
	private DBEvent dbEvent;
	private DBEventReservation eReservation;
	
	public EventController(){
		
		
	}
	
	public int insertEvent(Event event){
		
		dbEvent = new DBEvent();
		return dbEvent.insertEvent(event);
		
		
	}
	
	public ListEvents getAllEvents(){
		
		dbEvent = new DBEvent();
		return dbEvent.getAllEvents();
		
	}
	
	
	public void createEventReservation(EventReservation eventReservation){
		
		eReservation = new DBEventReservation();
		eReservation.createEventReservation(eventReservation);
		
		
		
	}
	
	
	
	public Event searchEventId(int eventId){
		
		dbEvent = new DBEvent();
		
		return dbEvent.searchEventId(eventId);
		
	}
	
	public  ArrayList<EventReservation> getAllEventReservations () {
		
		eReservation = new DBEventReservation();
		return eReservation.getAllEventReservations();
		
	}
	
public  ArrayList<EventReservation> getAllEventReservationsGuest () {
		
		eReservation = new DBEventReservation();
		return eReservation.getAllEventReservationsGuest();
		
	}
	
	
	public void updateEventReservation(EventReservation eventReservation){
		
		eReservation = new DBEventReservation();
		eReservation.updateEventReservation(eventReservation);
		
		
		
	}
	
	public EventReservation searchEventReservation(int eventId,int userId){
		
		
		eReservation = new DBEventReservation();
		return eReservation.searchEventReservation(eventId, userId);
	
	}
	
	
	
	public void  deleteEventReservation(int eventId, int guestId){
		
		
		eReservation = new DBEventReservation();
		eReservation.deleteEventReservation(eventId, guestId);
	}
	
	public int checkeventMembersNumber(int eventId){
		
		eReservation = new DBEventReservation();
		return eReservation.checkeventMembersNumber(eventId);
		
	}
	
	public EventWaitingListQueue<EventReservation> getWaitingList(){
		
		eReservation = new DBEventReservation();
		return eReservation.getWaitingList();
		
		
	}

	
	
	public void updateEventReservationStatus(EventReservation eventReservation){
		
		eReservation = new DBEventReservation();
		eReservation.updateEventReservationStatus(eventReservation);
		
	}
}
