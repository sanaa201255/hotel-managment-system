package DB;


import DB.GetMax;
import DB.DBConnection;
import Model.*;

import java.sql.*;
import java.util.*;


public class DBReservation implements IFDBReservation {
	
	private Connection conn;
	private DBRoom dbRoom;
	private Reservation reservationObj;
	private Facility facilityObj;
	private Room room;
	private Facility facility;
	private DBFacility dbFacility;
	private DBUser dbUser;
	
	
	
	public DBReservation() {
	      conn = DBConnection.getInstance().getDBcon();   
	    }
	
	public ArrayList<Reservation> getAllReservations() {
    	
        return multiWhere("");
    }

	public Reservation searchReservationId(int reservationId) {   
	
		String whereClause = "  reservation.reservationId = '" + reservationId + "'";
		System.out.println("searchReservationId " + whereClause);
		return singleWhereNF(whereClause);
	}
	
	public Reservation searchReservationGusestId(int guestId) {   
		
		String whereClause = "  reservation.guestId = '" + guestId + "'";
		System.out.println("searchReservationGusestId " + whereClause);
		return singleWhereNF(whereClause);
	}
	
	
	public ArrayList<Reservation>searchReservationsCheckIn(String checkIn) {   
		
		String whereClause = "  checkIn = '" + checkIn + "'";
		System.out.println("searchReservationGusestId " + whereClause);
		return multiWhere(whereClause);
	}
	
	public Reservation searchReservationRoomId(int roomId) {   
		
		String whereClause = "  roomId = '" + roomId + "'";
		System.out.println("searchReservationRoomId " + whereClause);
		return singleWhereNF(whereClause);
	}
	
	
	public Reservation searchReservationFRoomId(int roomId) {   
		
		String whereClause = "  roomId = '" + roomId + "'";
		System.out.println("searchReservationRoomId " + whereClause);
		return singleWhere(whereClause);
	}
	
	public Reservation searchReservationFGuestId(int guestId) {   
		
		String whereClause = "  reservation.guestId = '" + guestId + "'";
		System.out.println("searchReservationRoomId " + whereClause);
		return singleWhere(whereClause);
	}
	
	
	
	public ArrayList<Reservation> showAllReservations() {   
		
		String whereClause = "";
		System.out.println("showAllReservations " + whereClause);
		return multiWhere(whereClause);
	}
	
	
	public int getMaxReservationId () {
		
		int lastReservationId = GetMax.getMaxId("Select max(reservationId) from reservation");
		return lastReservationId;
	}
	//returns the number of the guest booked facility by date and time
	public int checkFacility(int facilityId,String date,String time){
		
		int res=0;
		ResultSet results;
		String query="Select NoOfPersons from FacilityLine where facilityId =  '"+
			    
			facilityId + "' AND facilityDate= '" +
			date + "'AND facilityTime = '"  +
			time + "'";
                 

	    System.out.println("insert : " + query);
	    try{ 
    	
	      Statement stmt = conn.createStatement();
	      stmt.setQueryTimeout(5);
	      results = stmt.executeQuery(query);
	      
	      while(results.next()){
	    	  
	    	 res= res + results.getInt("noOfPersons");
	      }
	      stmt.close();
	      
	    }
	    
	    catch(SQLException ex){
	    	System.out.println("reservation is not created"+ ex);
	    }
		

		   return res;


	
	    
	}
	
	
	

// checks for booked facilities by one guest for particular date 	
public int checkBookedFacilitiesDay(int reservationId,String date){
		
		int bookedFacilities=0;
		ResultSet results;
		String query="Select NoOfPersons from FacilityLine where reservationId =  '"+
			    
			reservationId + "' AND facilityDate= '" +
			date +"'";
                 

	    System.out.println("insert : " + query);
	    try{ 
    	
	      Statement stmt = conn.createStatement();
	      stmt.setQueryTimeout(5);
	      results = stmt.executeQuery(query);
	      
	      while(results.next()){
	    	  
	    	  bookedFacilities++;
	      }
	      stmt.close();
	      
	    }
	    
	    catch(SQLException ex){
	    	System.out.println("reservation is not created"+ ex);
	    }
		

		   return bookedFacilities;


	
	    
	}
	
//checks for booked facilities by one guest for particular date  and time
public int checkBookedFacilitiesTime(int reservationId,String date,String time){
	
	int facilitiesAtTime=0;
	ResultSet results;
	String query="Select NoOfPersons from FacilityLine where reservationId =  '"+
		    
	reservationId + "' AND facilityDate= '" +
	date + "'AND facilityTime = '"  +
	time + "'";
             

    System.out.println("insert : " + query);
    try{ 
	
      Statement stmt = conn.createStatement();
      stmt.setQueryTimeout(5);
      results = stmt.executeQuery(query);
      
      while(results.next()){
    	  
    	  facilitiesAtTime++;
      }
      stmt.close();
      
    }
    
    catch(SQLException ex){
    	System.out.println("reservation is not created"+ ex);
    }
	

	   return facilitiesAtTime;



    
}
	
	

	
	public int createReservation(Reservation reservation){
	
	    int nextReservationId = GetMax.getMaxId("Select max(reservationId) from reservation");
	    nextReservationId = nextReservationId + 1;
	    System.out.println("next guestId = " +  nextReservationId);

	    int rc = -1;
	    	String query="INSERT INTO reservation(reservationId, guestId, totalPrice, status, deposit, packageId)  VALUES('"+
	    
			nextReservationId + "','" +
		    reservation.getGuest().getUserId()  + "','"  +
		    reservation.getTotalPrice()  + "','"  +
		    reservation.getStatusId()  + "','"  +
		    reservation.getDeposit()  + "','"  +
		    reservation.getPackageId() + "')";
                 

	    System.out.println("insert : " + query);
	    try{ 
    	
	      Statement stmt = conn.createStatement();
	      stmt.setQueryTimeout(5);
	 	  rc = stmt.executeUpdate(query);
	      stmt.close();
	    }
	    
	    catch(SQLException ex){
	    	System.out.println("reservation is not created");
	    }
	    	return(rc);
	}
	
	public int insertReservationLine(ReservationLine reservationLine, int reservationId){

			int nextRoomLineId = GetMax.getMaxId("Select max(roomLineId) from roomline");
			nextRoomLineId = nextRoomLineId + 1;
    		int rc = -1;
    		String query="INSERT INTO roomLine(reservationId, roomId, checkIn, checkOut,childrenNo, adultNo, roomLineId)  VALUES('"+
		    
			reservationId + "','" +
			reservationLine.getRoom().getRoomId()  + "','"  +
			reservationLine.getCheckIn()  + "','"  +
			reservationLine.getCheckOut()  + "','"  +
			reservationLine.getChildrenNo()  + "','"  +
			reservationLine.getAdultNo() + "','" +
			nextRoomLineId + "')";

    	System.out.println("insert : " + query);

		room = reservationLine.getRoom();
		dbRoom = new DBRoom();
		

		try{ 
	       Statement stmt = conn.createStatement();
	       stmt.setQueryTimeout(5);
	  	   rc = stmt.executeUpdate(query);
	       stmt.close();
		}
		
		catch(SQLException ex){
			
			System.out.println("reservation is not created");
		}
    
   	
			return(rc);
    }
	

public int updateReservation(Reservation reservation) {
    	
		Reservation reservationObj  = reservation;
		int rc=-1;
		

		String query="UPDATE reservation SET "+
	
	 	  "totalPrice ='"+ reservationObj.getTotalPrice() +"', "+
          "deposit ='"+ reservationObj.getDeposit() + "' " +
          
	      "WHERE reservationId = '"+ reservationObj.getReservationId() + "'";
          
		System.out.println("Update query:" + query);	
		
			try {
				
				Statement stmt = conn.createStatement();
				stmt.setQueryTimeout(5);
				rc = stmt.executeUpdate(query);

				stmt.close();
			}
			
			catch(Exception ex){
				
				System.out.println("Update exception in user db: "+ex);
			}
			
				return(rc);
	}
	
	
	
	
	
	
	
	public int updateReservationLine(ReservationLine rLine) {
    	
		ReservationLine reservationLineObj  = rLine;
		int rc=-1;
		

		String query="UPDATE RoomLine SET "+
	
	 	  "roomId ='"+ reservationLineObj.getRoom().getRoomId() +"', "+
	 	  "checkIn ='"+  reservationLineObj.getCheckIn() + "', " +
          "checkOut ='"+ reservationLineObj.getCheckOut() + "', " +
          "adultNo ='"+ reservationLineObj.getAdultNo() + "', " +
          "childrenNo ='"+ reservationLineObj.getChildrenNo() + "' " +
          
	      "WHERE roomLineId = '"+ reservationLineObj.getReservationLineId() + "'";
          
		System.out.println("Update query:" + query);	
		
			try {
				
				Statement stmt = conn.createStatement();
				stmt.setQueryTimeout(5);
				rc = stmt.executeUpdate(query);

				stmt.close();
			}
			
			catch(Exception ex){
				
				System.out.println("Update exception in user db: "+ex);
			}
			
				return(rc);
	}
	
	public int updateReservationStatus(Reservation reservation) {
    	
		Reservation reservationObj  = reservation;
		int rc=-1;
		

		String query="UPDATE reservation SET "+
	
          "status ='"+ reservationObj.getStatusId() + "' " +
          
	      "WHERE reservationId = '"+ reservationObj.getReservationId() + "'";
          
		System.out.println("Update query:" + query);	
		
			try {
				
				Statement stmt = conn.createStatement();
				stmt.setQueryTimeout(5);
				rc = stmt.executeUpdate(query);

				stmt.close();
			}
			
			catch(Exception ex){
				
				System.out.println("Update exception in reservation db: "+ex);
			}
			
				return(rc);
	}
	

	public int insertFacilityLine(FacilityLine facilityLine,int reservationId){

		int nextFacilityLineId = GetMax.getMaxId("Select max(facilityLineId) from facilityline");
		nextFacilityLineId = nextFacilityLineId + 1;
		int rc = -1;
		String query="INSERT INTO FacilityLine(facilityLineId, facilityId, facilityDate, facilityTime,NoOfPersons,reservationId,instructor)  VALUES('"+
	    
				
		nextFacilityLineId + "','" +
		facilityLine.getFacility().getFacilityId()  + "','"  +
		facilityLine.getFacilityDate()  + "','"  +
		facilityLine.getFacilityTime()  + "','"  +
		facilityLine.getNoOfUsers()  + "','"  +
		reservationId + "','" +
		facilityLine.getInstructor()    + "')";

		System.out.println("insert : " + query);

		facility = facilityLine.getFacility();
		dbFacility = new DBFacility();
	

			try{ 
			   Statement stmt = conn.createStatement();
			   stmt.setQueryTimeout(5);
			   rc = stmt.executeUpdate(query);
			   stmt.close();
			}
			catch(SQLException ex){
				System.out.println("FacilityLine is not created");
 
			}

				return(rc);
	}

	public int deleteReservation(int reservationId) {
		int rc=-1;
		String query="DELETE FROM reservation WHERE reservationId = '" +
  			reservationId + "'";
            System.out.println(query);
         try{ 
	 		Statement stmt = conn.createStatement();
	 		stmt.setQueryTimeout(5);
	 	  	rc = stmt.executeUpdate(query);
	 	  	stmt.close();
		}
	        catch(Exception ex){
	        	System.out.println("Delete exception in reservation db: "+ex);
	        }
         		return(rc);
	}


	public int deleteFacilityLine(int facilityLineId) {
		int rc=-1;
		String query="DELETE FROM facilityLine WHERE facilityLineId = '" +
				facilityLineId + "'";
            System.out.println(query);
         try{ 
	 		Statement stmt = conn.createStatement();
	 		stmt.setQueryTimeout(5);
	 	  	rc = stmt.executeUpdate(query);
	 	  	stmt.close();
		}
	        catch(Exception ex){
	        	System.out.println("Delete exception in reservation db: "+ex);
	        }
         		return(rc);
	}

	
	
	
	private Reservation singleWhere(String whereClause){
	
			ResultSet results;
			Reservation reservationObj = new Reservation();
	            
	        String query =  buildQuery(whereClause);
	        System.out.println(query);
	        
        try { 
	 		Statement stmt = conn.createStatement();
	 		stmt.setQueryTimeout(5);
	 		results = stmt.executeQuery(query);
	 		reservationObj = buildReservation(results);
	        stmt.close();
	        
        }	
        catch(Exception e){
        	System.out.println("Query exception: "+e);
        }
        return reservationObj;
}
	
	
	private Reservation singleWhereNF(String whereClause){
		
		ResultSet results;
		Reservation reservationObj = new Reservation();
            
        String query =  buildQueryNF(whereClause);
        System.out.println(query);
        
    try { 
 		Statement stmt = conn.createStatement();
 		stmt.setQueryTimeout(5);
 		results = stmt.executeQuery(query);
 		reservationObj = buildReservationNF(results);
        stmt.close();
        
    }	
    catch(Exception e){
    	System.out.println("Query exception: "+e);
    }
    return reservationObj;
}
	
	public ArrayList<Reservation> multiWhere(String wClause) {
	
	    ResultSet results;
	    ArrayList<Reservation> list = new ArrayList<Reservation>();	
		
	    String query =  buildManyQuery(wClause);

        try { 
        	
        	
                    
        	
        	
			Statement stmt = conn.createStatement();
		 	stmt.setQueryTimeout(5);
		 	results = stmt.executeQuery(query);
		 	
		 	Reservation reservationObj = new Reservation();
		 	


        	while(results.next()){
    			
        		reservationObj = buildManyReservation(results);	
	             list.add(reservationObj);	
    		}
		
			     
		 	
             stmt.close();   
		
        }
        catch(Exception e){
 		
	 		System.out.println("Query exception - select: "+e);
			e.printStackTrace();
        }
        
        	return list;
	}


	private String buildQuery(String whereClause) {
	
	    String query="SELECT reservation.reservationId, guestId, totalPrice, status, deposit," +
	    		" packageId,roomLineId, roomId, checkIn, checkOut, childrenNo, adultNo, facilityId," +
	    		" facilityDate, facilityTime, noOfPersons, facilityLineId FROM reservation, roomLine,facilityLine " +
	    		"where reservation.reservationId=facilityLine.reservationid and" +
	    		" reservation.reservationId=roomLine.reservationId ";
		
	    if (whereClause.length()>0)
	    	query=query+" AND"+ whereClause;
		
	    return query;
	}
	

	private String buildQueryNF(String whereClause) {
	
	    String query="SELECT reservation.reservationId, guestId, totalPrice, status, deposit," +
	    		" packageId,roomLineId, roomId, checkIn, checkOut, childrenNo, adultNo" +
	    		"  FROM reservation, roomLine " +
	    		"where" +
	    		" reservation.reservationId=roomLine.reservationId ";
		
	    if (whereClause.length()>0)
	    	query=query+" AND"+ whereClause;
		
	    return query;
	}
	
	

	private String buildManyQuery(String whereClause) {
	
	    String query="SELECT reservation.reservationId, guestId, totalPrice, status, deposit, packageId,roomLineId, roomId, checkIn, checkOut, childrenNo, adultNo FROM reservation, roomLine where reservation.reservationId=roomLine.reservationId ";
		
	    if (whereClause.length()>0)
	    	query=query+" AND"+ whereClause;
		
	    return query;
	}

	

	private Reservation buildReservation(ResultSet results) {
	
		reservationObj = new Reservation();
		dbRoom=new DBRoom();
		dbUser = new DBUser();
		dbFacility  = new DBFacility();
		try {
		
			
			while(results.next()){
	
				int guestId = results.getInt("guestId");

				reservationObj.setReservationId(results.getInt("reservationId"));
				reservationObj.setGuest(dbUser.searchGuestId(guestId));
				reservationObj.setTotalPrice(results.getInt("totalPrice"));
				reservationObj.setStatusId(results.getString("status"));
				reservationObj.setDeposit(results.getDouble("deposit"));
				reservationObj.setPackageId(results.getInt("packageId"));
				reservationObj.addReservationLine(results.getInt("roomLineId"),
						
						results.getInt( "roomId"), results.getString("checkIn"),
						results.getString("checkOut"), results.getInt("childrenNo"),
						results.getInt( "adultNo"), results.getInt("reservationId"));
				reservationObj.addFacilityLine( 
						results.getInt("facilityId"),
						
						
						results.getString("facilityDate"),results.getString("facilityTime"),
						results.getInt("noOfPersons"),results.getInt("facilityLineId"));
					
				
			}	
			

		}
		catch(Exception e) {
			System.err.println(e);
		}

		return reservationObj;	
			 
		}
	
	private Reservation buildReservationNF(ResultSet results) {
		
		reservationObj = new Reservation();
		dbRoom=new DBRoom();
		dbUser = new DBUser();
		
		try {
		
			
			while(results.next()){
	
				int guestId = results.getInt("guestId");

				reservationObj.setReservationId(results.getInt("reservationId"));
				reservationObj.setGuest(dbUser.searchGuestId(guestId));
				reservationObj.setTotalPrice(results.getInt("totalPrice"));
				reservationObj.setStatusId(results.getString("status"));
				reservationObj.setDeposit(results.getDouble("deposit"));
				reservationObj.setPackageId(results.getInt("packageId"));
				reservationObj.addReservationLine(results.getInt("roomLineId"),
						results.getInt( "roomId"), results.getString("checkIn"),
						results.getString("checkOut"), results.getInt("childrenNo"),
						results.getInt( "adultNo"), results.getInt("reservationId"));
				
			}	
			

		}
		catch(Exception e) {
			System.err.println(e);
		}

		return reservationObj;	
			 
		}
	
	
	

	private Reservation buildManyReservation(ResultSet results) {
		
		reservationObj = new Reservation();
		dbRoom=new DBRoom();
		dbUser = new DBUser();
		
		try {
		
			
	
			int guestId = results.getInt("guestId");

			reservationObj.setReservationId(results.getInt("reservationId"));
			reservationObj.setGuest(dbUser.searchGuestId(guestId));
			reservationObj.setTotalPrice(results.getInt("totalPrice"));
			reservationObj.setStatusId(results.getString("status"));
			reservationObj.setDeposit(results.getDouble("deposit"));
			reservationObj.setPackageId(results.getInt("packageId"));
			reservationObj.addReservationLine(results.getInt("roomLineId"),
					
					results.getInt( "roomId"), results.getString("checkIn"),
					results.getString("checkOut"), results.getInt("childrenNo"),
					results.getInt( "adultNo"), results.getInt("reservationId"));
				
			
			

		}
		catch(Exception e) {
			System.err.println(e);
		}

		return reservationObj;	
			 
		}



}
