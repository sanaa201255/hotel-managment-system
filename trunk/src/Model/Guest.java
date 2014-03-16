package Model;

public class Guest extends User{

	
	private TravelAgency travelAgency;
	private String guestType;
	
	
	public Guest() {
		super();
		
	}
	
	public Guest(int userId, String fName, String lName, String address,
			String country, String city, String phone, String username,
			String password, String email, String type,String cpr,
			TravelAgency travelAgency, String guestType) {
		super(userId, fName, lName, address, country, city, phone, username,
				password, email, type,cpr);
		this.travelAgency = travelAgency;
		this.guestType = guestType;
	}
	
	public TravelAgency getTravelAgency() {
		return travelAgency;
	}
	public void setTravelAgency(TravelAgency travelAgency) {
		this.travelAgency = travelAgency;
	}
	public String getGuestType() {
		return guestType;
	}
	public void setGuestType(String guestType) {
		this.guestType = guestType;
	}
	public Guest(int userId, String fName, String lName, String address,
			String country, String city, String phone, String username,
			String password, String email, String type,String cpr) {
		super(userId, fName, lName, address, country, city, phone, username, password,
				email, type,cpr);

	}

}
