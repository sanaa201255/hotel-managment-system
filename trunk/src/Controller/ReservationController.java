package Controller;

import java.util.ArrayList;

import DB.*;
import Model.*;

public class ReservationController {
	
	
	private DBReservation dbReservation;
	private DBPackages dbPackages;
	private DBFacility dbFacilities;
	
	public ReservationController() {
		
	}
	
	
	public Reservation searchReservationId (int reservationId) {
		
		dbReservation = new DBReservation();
		return dbReservation.searchReservationId(reservationId);
		
	}
	
	public Reservation searchReservationGusestId(int guestId) {
		
		dbReservation = new DBReservation();
		return dbReservation.searchReservationGusestId(guestId);
	}
	
	public Reservation searchReservationFGuestId(int guestId){
		
		dbReservation = new DBReservation();
		return dbReservation.searchReservationFGuestId( guestId);
		
	}
	
	
	
	
	public ArrayList<Reservation>searchReservationsCheckIn(String checkIn) {
		
		dbReservation = new DBReservation();
		return dbReservation.searchReservationsCheckIn(checkIn);
		
	}
	
	
	
	
	public int getMaxReservationId () {
		
	  dbReservation = new DBReservation();
	   return dbReservation.getMaxReservationId();
		
		
	}
	
	public Reservation searchReservationRoomId(int roomId) {
		
		dbReservation = new DBReservation();
		return dbReservation.searchReservationRoomId(roomId);
		
		
	}
	
	
	public Reservation searchReservationFRoomId(int roomId) {
		
		dbReservation = new DBReservation();
		return dbReservation.searchReservationFRoomId(roomId);
		
		
	}
	
		public int checkFacility(int facilityId,String date,String time){
			
			
			dbReservation = new DBReservation();
			return dbReservation.checkFacility( facilityId, date, time);
			
		}
	
		 public int checkBookedFacilitiesDay(int reservationId,String date){
			

			dbReservation = new DBReservation();
			return dbReservation.checkBookedFacilitiesDay( reservationId, date);
			
			
		}
		 
		 
		 public int checkBookedFacilitiesTime(int reservationId,String date,String time){
			 
			 	dbReservation = new DBReservation();
				return dbReservation.checkBookedFacilitiesTime(  reservationId, date, time);
			 
			 
		 }

	
	
	public int createReservation(Reservation reservation) {
		
		dbReservation = new DBReservation();
		return dbReservation.createReservation(reservation);
		
	}
	
	public int insertRerservationine(ReservationLine roomLine, int reservationId) {
		
		dbReservation = new DBReservation();
		return dbReservation.insertReservationLine(roomLine, reservationId);
	}
	
	public int insertFacilityLine(FacilityLine facilityLine,int reservationId) {
		
		dbReservation = new DBReservation();
		return dbReservation.insertFacilityLine(facilityLine, reservationId);
			
	}
	
	
	public void deletePackage(int packageId) {
		
		   dbPackages = new DBPackages();
		   dbPackages.deletePackage(packageId);
		
	}
	
	
	public int deleteReservation(int reservationId) {
		
		dbReservation = new DBReservation();
		return dbReservation.deleteReservation(reservationId);
		
	}
	
	
	public ArrayList<Reservation> getAllReservations() {
		
		dbReservation = new DBReservation();
		return dbReservation.getAllReservations();
		
	}
	
	
	public ArrayList<Reservation> showAllReservations() {
		
		dbReservation = new DBReservation();
		return dbReservation.showAllReservations();
	}
	
	public ArrayList<Packages> getAllPackages() {
		
		dbPackages = new DBPackages();
		return dbPackages.getAllPackages();
	}
	
	 public void insertPackage(Packages packages) {
		 
		    dbPackages = new DBPackages();
			dbPackages.insertPackage(packages);
		 
	 }
	 public ArrayList<Facility> getAllFacilities() {
		 
		 dbFacilities =  new DBFacility();
		 
		 return dbFacilities.getAllFacilities();
		 
	 }
	 
	 
	 public Facility searchFacilityId(int facilityId) {
		 
		 dbFacilities =  new DBFacility();
		 
		 
		 return dbFacilities.searchFacilityId(facilityId);
	 }

	 
	 
	 public void deleteFacilityLine(int facilityLineId){
		 
		 dbReservation = new DBReservation();
		 
		 dbReservation.deleteFacilityLine(facilityLineId);
		 
		 
	 }
	 
	 public void updateReservationLine(ReservationLine rLine){
		 
		 dbReservation = new DBReservation();
		 dbReservation.updateReservationLine(rLine);
		 
		 
	 }
	 
	 public void updateReservationStatus(Reservation reservation) {
		 
		 dbReservation = new DBReservation();
		 dbReservation.updateReservationStatus(reservation);
	 }
	 
	 public void updateReservation(Reservation reservation){
		 
		 dbReservation = new DBReservation();
		 dbReservation.updateReservation(reservation);
	 }
	 
	 
	 }

