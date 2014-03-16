package Model;

import java.util.ArrayList;
import DB.*;

public class Reservation {

private int reservationId;	
private ReservationLine reservationLine;

private ArrayList<ReservationLine> reservationLines;
private FacilityLine facilityLine;
private ArrayList<FacilityLine> facilityLines;
private Guest guest;
private double totalPrice;
private String status;
private double deposit;

private int packageId;
private DBRoom dbRoom;
private DBFacility dbFacility;
private Room room;
private Facility facility;

public Reservation(int reservationId, Guest guest, double totalPrice,
		String status, double deposit, FacilityLine facilityLine, int packageId,
		ReservationLine reservationLine) {
	this.reservationId = reservationId;
	this.guest = guest;
	this.totalPrice = totalPrice;
	this.status = status;
	this.deposit = deposit;
	this.facilityLine = facilityLine;
	this.packageId = packageId;
	this.reservationLine = reservationLine;
	reservationLines =  new ArrayList<ReservationLine>();
	facilityLines =  new ArrayList<FacilityLine>() ;
			
}

public Reservation() {
	reservationLines =  new ArrayList<ReservationLine>() ;
	facilityLines =  new ArrayList<FacilityLine>() ;
	
}

public int getReservationId() {
	return reservationId;
}

public void setReservationId(int reservationId) {
	this.reservationId = reservationId;
}

public Guest getGuest() {
	return guest;
}

public void setGuest(Guest guest) {
	this.guest = guest;
}

public double getTotalPrice() {
	return totalPrice;
}

public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}

public String getStatusId() {
	return status;
}

public void setStatusId(String status) {
	this.status = status;
}

public double getDeposit() {
	return deposit;
}

public void setDeposit(double deposit) {
	this.deposit = deposit;
}

public FacilityLine getFacilityLine() {
	return facilityLine;
}

public void setFacilityLine(FacilityLine facilityLine) {
	this.facilityLine = facilityLine;
}

public int getPackageId() {
	return packageId;
}

public void setPackageId(int packageId) {
	this.packageId = packageId;
}


public void setReservationLine(ReservationLine reservationLine) {
	this.reservationLine = reservationLine;
}

public void addFacilityLine(int facilityId, String facilityDate,
		String facilityTime, int noOfUsers,int facilityLineId){
	
	dbFacility =  new DBFacility();
	
	facility = dbFacility.searchFacilityId(facilityId);
	
	facilityLine = new FacilityLine(facilityDate,
			 facilityTime, noOfUsers,facilityLineId);
	facilityLine.setFacility(facility);
	
	facilityLines.add(facilityLine);

}


public void addReservationLine(int id,int roomId, String checkIn, String checkOut,
		int childrenNo, int adulNo,int reservationId){
	
	dbRoom= new DBRoom();
	room = dbRoom.searchRoomId(roomId);
	reservationLine = new ReservationLine( id,  checkIn,  checkOut,
			 childrenNo,  adulNo,reservationId);
	
	reservationLine.setRoom(room);
	
	
	reservationLines.add(reservationLine);

}




public void deleteReservationLine(int id){
	
	
	for(int a=0;reservationLines.get(a).getReservationLineId()==id;a++){
	reservationLines.remove(a);
	}
	
	

}

public ArrayList<FacilityLine> getFacilityLines(){
	
	
	return facilityLines;
		
	}




public ArrayList<ReservationLine> getReservationLines(){
	
	
	return reservationLines;
		
}



	}
