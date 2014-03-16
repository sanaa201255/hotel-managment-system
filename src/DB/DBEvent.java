package DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import Model.Event;
import Model.ListEvents;

public class DBEvent implements IFDBEvent {
	
	private Connection conn;
	private DBUser dbUser;
		
		public DBEvent() {
			
	        conn = DBConnection.getInstance().getDBcon();
		}
		
		//Returns Linked List with all Events
		public ListEvents getAllEvents() {
			
			 return multiWhereEvents("");
		}
		
		//Returns single Event object by eventId
		public Event searchEventId(int eventId) {
			
			String whereClause = "  eventId = '" + eventId + "'";
	    	System.out.println("searchEventId " + whereClause);
	        return singleWhereEvent(whereClause);
		}
		
		//Returns  Events  by eventDate
		public ListEvents searchEventDate(String eventDate) {
			
			String whereClause = "  eventDate = '" + eventDate + "'";
	    	System.out.println("searchEventDate " + whereClause);
	        return multiWhereEvents(whereClause);
		}
		
		//Insert Event object
		public int insertEvent(Event event) {
			
			int nextEventId = GetMax.getMaxId("Select max(eventId) from Events");
			nextEventId = nextEventId + 1;
	        System.out.println("nnextEventId = " +  nextEventId);
	  
	       int rc = -1;
		   String query="INSERT INTO Events (eventId,date,timeFrom, timeTo,type,description,totalParticipants,status,staffId )  VALUES('"+
			    
				nextEventId + "','" +
				event.getDate()  + "','"  +
				event.getTimeFrom()  + "','"  +
				event.getTimeTo()  + "','"  +
				event.getType()  + "','"  +
				event.getDescription()  + "','"  +
				event.getTotalParticipants()  + "','"  +
				event.getStatus() + "','"  +
				event.getStaff().getUserId() + "')";
			    
		  
	       System.out.println("insert : " + query);
	       try{ 
	          Statement stmt = conn.createStatement();
	          stmt.setQueryTimeout(5);
	     	  rc = stmt.executeUpdate(query);
	          stmt.close();
	       }
	       catch(SQLException ex){
	          System.out.println("Event is not created");
	          System.out.println(ex);
	        
	       }
	       return(rc);
			
		}
		//Update Event object
		public int updateEvent(Event event) {
			
			Event eventObj  = event;
			int rc=-1;

			String query="UPDATE Events SET "+

	              "date ='"+ eventObj.getDate() + "', " +
	              "timeFrom ='"+ eventObj.getTimeFrom() + "' ," +
	              "timeTo ='"+ eventObj.getTimeTo() + "' ," +
	              "totalParticipants ='"+ eventObj.getTotalParticipants() + "' " +
	              "status ='"+ eventObj.getStatus() + "' " +

			      "WHERE eventId = '"+ eventObj.getEventId() + "'";
	              
			System.out.println("Update query:" + query);
	  		try {
		 		Statement stmt = conn.createStatement();
		 		stmt.setQueryTimeout(5);
		 	 	rc = stmt.executeUpdate(query);

		 	 	stmt.close();
			}
		 	catch(Exception ex){
		 	 	System.out.println("Update exception in Event db: "+ex);
		  	}
			return(rc);
			
		}

		// Update the status of an event
		public int updateEventStatus(Event event) {
			
			Event eventObj  = event;
			int rc=-1;

			String query="UPDATE Events SET "+


	              "status ='"+ eventObj.getStatus() + "' " +

			      "WHERE eventId = '"+ eventObj.getEventId() + "'";
	              
			System.out.println("Update query:" + query);
	  		try {
		 		Statement stmt = conn.createStatement();
		 		stmt.setQueryTimeout(5);
		 	 	rc = stmt.executeUpdate(query);

		 	 	stmt.close();
			}
		 	catch(Exception ex){
		 	 	System.out.println("Update exception in EventStatus db: "+ex);
		  	}
			return(rc);
			
		}

		//Delete event
		public int deleteEvent(int eventId) {
			
			
			  int rc=-1;
			  
			  	String query="DELETE FROM Events WHERE eventId = '" +
			  			eventId + "'";
		                System.out.println(query);
			  	try{ 
			 		Statement stmt = conn.createStatement();
			 		stmt.setQueryTimeout(5);
			 	  	rc = stmt.executeUpdate(query);
			 	  	stmt.close();
		  		}
		   	        catch(Exception ex){
			 	  	System.out.println("Delete exception in eventId db: "+ex);
		   	        }
				return(rc);
			
		}
		
		private ListEvents multiWhereEvents(String wClause) {
			
	        ResultSet results;
	        ListEvents list = new ListEvents();	
		
	    String query =  buildQueryEvent(wClause);

	        try { 
	        	
		Statement stmt = conn.createStatement();
	 	stmt.setQueryTimeout(5);
	 	results = stmt.executeQuery(query);
	 	
		Event eventObj = new Event();
		
		
		
		while(results.next()){
		
			eventObj = buildEvent(results);	
	
	             list.add(0,eventObj);	
	            
	
		}
	             stmt.close();     
			
		}
	 	catch(Exception e){
	 		System.out.println("Query exception E te tuka- select: "+e);
			e.printStackTrace();
	 	}
		return list;
	}

		private Event singleWhereEvent(String whereClause)
		{
			ResultSet results;
			Event eventObj = new Event();
	                
		        String query =  buildQueryEvent(whereClause);
	                System.out.println(query);
			try { 
		 		Statement stmt = conn.createStatement();
		 		stmt.setQueryTimeout(5);
		 		results = stmt.executeQuery(query);
		 		
		 		if( results.next() ){
		 			eventObj = buildEvent(results);
	                            stmt.close();
	                           
				}
	                       else { 
	                    	   eventObj = null;
	                        }
			}	
		 	catch(Exception e){
		 		System.out.println("Query exception: "+e);
		 	}
			return eventObj;
		}
		
		private String buildQueryEvent(String whereClause) {
			
		    String query="SELECT eventId,date,timeFrom, timeTo,type,description,totalParticipants,status,staffId FROM Events ";
			
			if (whereClause.length()>0)
				query=query+" where  "+ whereClause;
				
			return query;
		}
		
		
			private Event buildEvent(ResultSet results) {
				
				dbUser = new DBUser();
				Event eventObj = new Event();
			
				try {
				
					eventObj.setEventId(results.getInt("eventId"));
					eventObj.setDate(results.getString("date"));
					eventObj.setTimeFrom(results.getString("timeFrom"));
					eventObj.setTimeTo(results.getString("timeTo"));
					eventObj.setType(results.getString("type"));
					eventObj.setDescription(results.getString("description"));
					eventObj.setTotalParticipants(results.getInt("totalParticipants"));
					eventObj.setStatus(results.getString("status"));
					
					eventObj.setStaff(dbUser.searchStaffId( results.getInt("staffId")));
					
	                }
	         catch(Exception e) {
	        	 System.err.println(e);
	         }
	         return eventObj;
	      }
	}