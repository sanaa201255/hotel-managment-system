package Model;

public class Event {
	
	private int eventId;
	private String date;
	private String timeFrom;
	private String timeTo;
	private String type;
	private String description;
	private int totalParticipants;
	private String status;
	private Staff staff; 
	
	
	
	public Event(int eventId, String date, String timeFrom, String timeTo,
			String type, String description, int totalParticipants, String status,Staff staff) {
		
		this.eventId = eventId;
		this.date = date;
		this.timeFrom = timeFrom;
		this.timeTo = timeTo;
		this.type = type;
		this.description = description;
		this.totalParticipants = totalParticipants;
		this.status = status;
		this.staff= staff;
	}
	
	public Event() {
		
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTimeFrom() {
		return timeFrom;
	}

	public void setTimeFrom(String timeFrom) {
		this.timeFrom = timeFrom;
	}

	public String getTimeTo() {
		return timeTo;
	}

	public void setTimeTo(String timeTo) {
		this.timeTo = timeTo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTotalParticipants() {
		return totalParticipants;
	}

	public void setTotalParticipants(int totalParticipants) {
		this.totalParticipants = totalParticipants;
	}

	public String getStatus() {
		return status;
	}

	public void setStatusId(String status) {
		this.status = status;
	}
	
	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	
	
}
