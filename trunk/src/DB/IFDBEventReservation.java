package DB;


import java.util.ArrayList;
import Model.*;

	public interface IFDBEventReservation {

		public ArrayList<EventReservation> EventReservations();
	    public ArrayList<EventReservation> searchEventId(int eventId);
	    public ArrayList<EventReservation> searchEventReservationGuestId(int guestId);
	    public int createEventReservation(EventReservation eventReservation,int guestId);
	    public int updateEventReservation(EventReservation eventReservation,int guestId);
	    public int deleteEventReservation(int eventId,int guestId);

	}
