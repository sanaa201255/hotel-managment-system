package DB;

import Model.*;

public interface IFDBEvent {

	public ListEvents getAllEvents();
    public Event searchEventId(int eventId);
    public ListEvents searchEventDate(String eventDate);
    public int insertEvent(Event event);
    public int updateEvent(Event event);
    public int deleteEvent(int facilityId);

}
