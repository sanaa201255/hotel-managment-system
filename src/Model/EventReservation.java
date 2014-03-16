package Model;



public class EventReservation {

	private Event event;
	private Guest guest;
	private String status;
	private int np;

	
	
	
	public EventReservation(Event event, Guest guest, String status,int np) {
		
		this.event = event;
		this.guest = guest;
		this.status = status;
		this.np=np;
	
	}
	
	public EventReservation() {
		
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}



	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public int getNp() {
		return np;
	}

	public void setNp(int np) {
		this.np = np;
	}

	
	
	
	


}
