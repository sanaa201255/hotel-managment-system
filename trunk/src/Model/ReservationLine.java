package Model;



public class ReservationLine {
	
	
	private int reservationLineId;
	private Room room;
	private String checkIn;
	private String checkOut;
	private int childrenNo;
	private int adultNo;
	

	private int reservationIn;
	
	
	public ReservationLine(int reservationLineId, String checkIn, String checkOut,
			int childrenNo, int adulNo,int reservationId) {
		
		this.reservationLineId=reservationLineId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.childrenNo = childrenNo;
		this.adultNo = adulNo;
		this.reservationIn = reservationId;
	}
	
	public ReservationLine() {
		
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public int getChildrenNo() {
		return childrenNo;
	}

	public void setChildrenNo(int childrenNo) {
		this.childrenNo = childrenNo;
	}

	public int getAdultNo() {
		return adultNo;
	}

	public void setAdultNo(int adultNo) {
		this.adultNo = adultNo;
	}
	public int getReservationLineId() {
		return reservationLineId;
	}

	public void setReservationLineId(int reservationLineId) {
		this.reservationLineId = reservationLineId;
	}

	public int getReservationIn() {
		return reservationIn;
	}

	public void setReservationIn(int reservationIn) {
		this.reservationIn = reservationIn;
	}


	
	
}
