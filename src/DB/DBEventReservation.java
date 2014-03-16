package DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import Model.*;


public class DBEventReservation implements IFDBEventReservation {

	private Connection conn;
	private EventWaitingListQueue<EventReservation> queue;
	
	
	public DBEventReservation(){
		
		   conn = DBConnection.getInstance().getDBcon();   
		   queue =new  EventWaitingListQueue<EventReservation>();
		
	}
	
	
	//Returns Array list of type EventReservation
	public ArrayList<EventReservation> getAllEventReservations() {
		
		  return multiWhere("");

	}
	
	
	public EventWaitingListQueue<EventReservation> getWaitingList() {
		
		  return multiWhereWaitingList("");

	}
	
	public ArrayList<EventReservation> getAllEventReservationsGuest() {
		
		  return multiWhereGuest("");

	}
	

	public EventReservation searchEventReservation(int eventId,int userId) {
		
		String whereClause = "  eventId = '" + eventId + "' AND guestId='" + userId + "'";
		System.out.println("searchEventId" + whereClause);
		return singleWhere(whereClause);
	}

	public ArrayList<EventReservation> searchEventReservationGuestId(int guestId){
			
			String whereClause = "  eventId = '" + guestId + "'";
			System.out.println("searchEventReservationGuestId" + whereClause);
			return multiWhere(whereClause);
			
	}
	
	
	//  Checks for the number of the participants in the event 
	public int checkeventMembersNumber(int eventId){
		
		int res=0;
		ResultSet results;
		String query="Select numberOfparticipants from eventsReservation where eventId =  '"+
			    
			eventId + "' AND userStatus= '" +
			"booked" + "'";
                 

	    System.out.println("insert : " + query);
	    try{ 
    	
	      Statement stmt = conn.createStatement();
	      stmt.setQueryTimeout(5);
	      results = stmt.executeQuery(query);
	      
	      while(results.next()){
	    	  
	    	 res= res + results.getInt("numberOfparticipants");
	      }
	      stmt.close();
	      
	    }
	    
	    catch(SQLException ex){
	    	System.out.println("reservation is not created"+ ex);
	    }
		

		   return res;


	
	    
	}
	
	
	
	

	public int createEventReservation(EventReservation eventReservation) {
		
		 	
		    int rc = -1;
		    	String query="INSERT INTO EventsReservation(eventId, guestId, userStatus,numberOfparticipants)  VALUES('"+
		    
			
				eventReservation.getEvent().getEventId()  + "','"  +
				eventReservation.getGuest().getUserId()  + "','"  +
				eventReservation.getStatus()  + "','"  +
			    eventReservation.getNp() + "')";
	                 

		    System.out.println("insert : " + query);
		    try{ 
	    	
		      Statement stmt = conn.createStatement();
		      stmt.setQueryTimeout(5);
		 	  rc = stmt.executeUpdate(query);
		      stmt.close();
		    }
		    
		    catch(SQLException ex){
		    	System.out.println("reservations is not created");
		    }
		    	return(rc);
	
	}

	public int updateEventReservation(EventReservation eventReservation) {
		
		EventReservation eventReservationObj  = eventReservation;
		int rc=-1;

		String query="UPDATE eventsReservation SET " +

			  "numberOfparticipants ='"+ eventReservationObj.getNp() + "' " +

		      "WHERE eventId = '"+ eventReservationObj.getEvent().getEventId() + "' AND guestId = '"+ eventReservationObj.getGuest().getUserId() + "'";
              
		System.out.println("Update query:" + query);
  		try {
	 		Statement stmt = conn.createStatement();
	 		stmt.setQueryTimeout(5);
	 	 	rc = stmt.executeUpdate(query);

	 	 	stmt.close();
		}
	 	catch(Exception ex){
	 	 	System.out.println("Update exception in eventReservation db: "+ex);
	  	}
		return(rc);

	}
	
	
public int updateEventReservationStatus(EventReservation eventReservation) {
		
		EventReservation eventReservationObj  = eventReservation;
		int rc=-1;

		String query="UPDATE eventsReservation SET " +

			  "userStatus ='"+ eventReservationObj.getStatus() + "' " +

		      "WHERE eventId = '"+ eventReservationObj.getEvent().getEventId() + "' AND guestId = '"+ eventReservationObj.getGuest().getUserId() + "'";
              
		System.out.println("Update query:" + query);
  		try {
	 		Statement stmt = conn.createStatement();
	 		stmt.setQueryTimeout(5);
	 	 	rc = stmt.executeUpdate(query);

	 	 	stmt.close();
		}
	 	catch(Exception ex){
	 	 	System.out.println("Update exception in eventReservation db: "+ex);
	  	}
		return(rc);

	}


	public int deleteEventReservation(int eventId, int guestId) {
		
		
		 int rc=-1;
		  
		  	String query="DELETE FROM EventsReservation WHERE eventId = '" +
		  			eventId + "' AND guestId = '" +
		  			guestId + "' ";
	                System.out.println(query);
		  	try{ 
		 		Statement stmt = conn.createStatement();
		 		stmt.setQueryTimeout(5);
		 	  	rc = stmt.executeUpdate(query);
		 	  	stmt.close();
	  		}
	   	        catch(Exception ex){
		 	  	System.out.println("Delete exception in EventReservation db: "+ex);
	   	        }
			return(rc);

	}
	
	
	public EventWaitingListQueue<EventReservation> addQueue(EventReservation er){
		
		queue.add(er);
		return queue;
		
	}
	
	
	public EventWaitingListQueue<EventReservation> getQueue(){
		
		
		return queue;
		
	}
	
	
private ArrayList<EventReservation> multiWhere(String wClause) {
		
       ResultSet results;
    ArrayList<EventReservation> list = new ArrayList<EventReservation>();	
	
    String query =  buildQuery(wClause);

        try { 
	Statement stmt = conn.createStatement();
 	stmt.setQueryTimeout(5);
 	results = stmt.executeQuery(query);
 	

	while(results.next()){
		
		EventReservation eventReservationObj = new EventReservation();
		eventReservationObj = build(results);
		
	
			
             list.add(eventReservationObj);	
             
		
		
	
             
	}
             stmt.close();     
		
	}
 	catch(Exception e){
 		System.out.println("Query exception - select: "+e);
		e.printStackTrace();
		
 	}
        
   
        
	return list;
}


private ArrayList<EventReservation> multiWhereGuest(String wClause) {
	
    ResultSet results;
 ArrayList<EventReservation> list = new ArrayList<EventReservation>();	
	
 String query =  buildQueryGuest(wClause);

     try { 
	Statement stmt = conn.createStatement();
	stmt.setQueryTimeout(5);
	results = stmt.executeQuery(query);
	

	while(results.next()){
		
		EventReservation eventReservationObj = new EventReservation();
		eventReservationObj = build(results);
		
	
			
          list.add(eventReservationObj);	
          
		
		
	
          
	}
          stmt.close();     
		
	}
	catch(Exception e){
		System.out.println("Query exception - select: "+e);
		e.printStackTrace();
		
	}
     

     
	return list;
}




private EventWaitingListQueue<EventReservation> multiWhereWaitingList(String wClause) {
	
    ResultSet results;
    queue = new EventWaitingListQueue<EventReservation>();	
	
    String query =  buildQueryWaitingList(wClause);
    System.out.println("insert : " + query);

     try { 
	Statement stmt = conn.createStatement();
	stmt.setQueryTimeout(5);
	results = stmt.executeQuery(query);
	

	while(results.next()){
		
		EventReservation eventReservationObj = new EventReservation();
		eventReservationObj = build(results);
		
	
			
		queue.add(eventReservationObj);	
          
		
		
	
          
	}
          stmt.close();     
		
	}
	catch(Exception e){
		System.out.println("Query exception - select: "+e);
		e.printStackTrace();
		
	}
     

     
	return queue;
}





	private EventReservation singleWhere(String whereClause){
		ResultSet results;
		EventReservation eventReservationObj = new EventReservation();
                
	        String query =  buildQuery(whereClause);
                System.out.println(query);
		try { 
	 		Statement stmt = conn.createStatement();
	 		stmt.setQueryTimeout(5);
	 		results = stmt.executeQuery(query);
	 		
	 		if( results.next() ){
	 			eventReservationObj = build(results);
                            stmt.close();
                           
			}
                       else { 
                    	   eventReservationObj = null;
                        }
		}	
	 	catch(Exception e){
	 		System.out.println("Query exception: "+e);
	 	}
		return eventReservationObj;
	}
	
	private String buildQuery(String whereClause) {
		
	    String query="SELECT eventId,guestId,userStatus,numberOfParticipants FROM eventsReservation where " +
	    		"userstatus='booked'";
		
		if (whereClause.length()>0)
			query=query+" AND "+ whereClause;
			
		return query;
	}
	
private String buildQueryGuest(String whereClause) {
		
	    String query="SELECT eventId,guestId,userStatus,numberOfParticipants FROM eventsReservation ";
		
		if (whereClause.length()>0)
			query=query+" Where "+ whereClause;
			
		return query;
	}
	
	
	private String buildQueryWaitingList(String whereClause) {
		
	    String query="SELECT eventId,guestId,userStatus,numberOfParticipants FROM eventsReservation where " +
	    		"userstatus='waiting'";
		
		if (whereClause.length()>0)
			query=query+" AND "+ whereClause;
			
		return query;
	}
	
	
	
	
		private EventReservation build(ResultSet results) {
		
			EventReservation eventReservationObj = new EventReservation();
			DBEvent dbEvent = new DBEvent(); 
			DBUser dbUser = new DBUser(); 
		
			try {
				
				eventReservationObj.setEvent(dbEvent.searchEventId((results.getInt("eventId"))));
				eventReservationObj.setGuest(dbUser.searchGuestId(results.getInt("guestID")));
				eventReservationObj.setStatus((results.getString("userstatus")));
				eventReservationObj.setNp(results.getInt("numberOfParticipants"));

                }
         catch(Exception e) {
        	 System.err.println(e);
         }
         return eventReservationObj;
      }

		@Override
		public int createEventReservation(EventReservation eventReservation,
				int guestId) {
			// TODO Auto-generated method stub
			return 0;
		}



		@Override
		public ArrayList<EventReservation> EventReservations() {
			// TODO Auto-generated method stub
			return null;
		}



		@Override
		public int updateEventReservation(EventReservation eventReservation,
				int guestId) {
			// TODO Auto-generated method stub
			return 0;
		}



		@Override
		public ArrayList<EventReservation> searchEventId(int eventId) {
			// TODO Auto-generated method stub
			return null;
		}
	
	
	
	
	


}
