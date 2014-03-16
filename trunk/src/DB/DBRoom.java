package DB;

import DB.GetMax;
import DB.DBConnection;
import Model.*;
import java.sql.*;
import java.util.ArrayList;


public class DBRoom {
	
	private Connection conn;
    public DBRoom() {
    conn = DBConnection.getInstance().getDBcon();
    }

    public Room getRoom() {
    	
        return singleWhereRoom("");
    }

    
    public int deleteRoom(int roomId) {
		int rc=-1;
		String query="DELETE FROM rooms WHERE roomId = '" +
  			roomId + "'";
            System.out.println(query);
         try{ 
	 		Statement stmt = conn.createStatement();
	 		stmt.setQueryTimeout(5);
	 	  	rc = stmt.executeUpdate(query);
	 	  	stmt.close();
		}
	        catch(Exception ex){
	        	System.out.println("Delete exception in room db: "+ex);
	        }
         		return(rc);
	}

    
    
   public ArrayList<Room> getAllRooms() {
    	
        return multiWhereRooms("");
    }

    public Room searchRoomId(int roomId) {   
    	
    	String whereClause = " where  roomId = '" + roomId + "'";
    	System.out.println("SearchRoomId " + whereClause);
        return singleWhereRoom(whereClause);
    }

    
    public int insertRoom(Room room){
    	
        int nextRoomId = GetMax.getMaxId("Select max(roomId) from rooms"); // 
        nextRoomId = nextRoomId + 1;
        System.out.println("next roomId = " +  nextRoomId);
  
       int rc = -1;
	   String query="INSERT INTO rooms(roomId, status, description, price, roomType)  VALUES('"+
		    
			nextRoomId + "','" +
			room.getStatus()  + "','"  +
			room.getDescription()  + "','"  +
			room.getPrice()  + "','"  +
			room.getRoomType() + "')";
		    
                     

       System.out.println("insert : " + query);
      try{ 
          Statement stmt = conn.createStatement();
          stmt.setQueryTimeout(5);
     	  rc = stmt.executeUpdate(query);
          stmt.close();
      }
       catch(SQLException ex){
          System.out.println("Room is not created");
        
       }
       return(rc);

}
    


    public int updateRoomStatus(Room room) {
    	
		Room roomObj  = room;
		int rc=-1;

		String query="UPDATE rooms SET "+

  			"status ='"+ roomObj.getStatus() + "' " +
             

		      "WHERE roomId = '"+ roomObj.getRoomId() + "'";
              
		System.out.println("Update query:" + query);
  		try {
	 		Statement stmt = conn.createStatement();
	 		stmt.setQueryTimeout(5);
	 	 	rc = stmt.executeUpdate(query);

	 	 	stmt.close();
		}
	 	catch(Exception ex){
	 	 	System.out.println("Update exception in person db: "+ex);
	  	}
		return(rc);
	}
    
    public int updateRoomDescription(Room room) {
    	
		Room roomObj  = room;
		int rc=-1;

		String query="UPDATE rooms SET "+

  			"description ='"+ roomObj.getDescription() + "' " +
             

		      "WHERE roomId = '"+ roomObj.getRoomId() + "'";
              
		System.out.println("Update query:" + query);
  		try {
	 		Statement stmt = conn.createStatement();
	 		stmt.setQueryTimeout(5);
	 	 	rc = stmt.executeUpdate(query);

	 	 	stmt.close();
		}
	 	catch(Exception ex){
	 	 	System.out.println("Update exception in person db: "+ex);
	  	}
		return(rc);
	}


    public int updateRoomPrice(Room room) {
	
	Room roomObj  = room;
	int rc=-1;

	String query="UPDATE rooms SET "+

			"price ='"+ roomObj.getPrice() + "' " +
         

	      "WHERE roomId = '"+ roomObj.getRoomId() + "'";
          
	System.out.println("Update query:" + query);
		try {
 		Statement stmt = conn.createStatement();
 		stmt.setQueryTimeout(5);
 	 	rc = stmt.executeUpdate(query);

 	 	stmt.close();
	}
 	catch(Exception ex){
 	 	System.out.println("Update exception in person db: "+ex);
  	}
	return(rc);
}

    public int updateRoomLastClean(Room room) {
	
	Room roomObj  = room;
	int rc=-1;

	String query="UPDATE rooms SET "+

			"lastClean = GETDATE() " +
         

	      "WHERE roomId = '"+ roomObj.getRoomId() + "'";
          
	System.out.println("Update query:" + query);
		try {
 		Statement stmt = conn.createStatement();
 		stmt.setQueryTimeout(5);
 	 	rc = stmt.executeUpdate(query);

 	 	stmt.close();
	}
 	catch(Exception ex){
 	 	System.out.println("Update exception in person db: "+ex);
  	}
	return(rc);
}
    
    



	private ArrayList<Room> multiWhereRooms(String wClause) {
		
        ResultSet results;
        ArrayList<Room> list = new ArrayList<Room>();	
        String query =  buildQueryRoom(wClause);

        try { 
			Statement stmt = conn.createStatement();
		 	stmt.setQueryTimeout(5);
		 	results = stmt.executeQuery(query);

		 	while(results.next()){
				Room roomObj = new Room();
				roomObj = buildRoom1(results);	
		        list.add(roomObj);	
		 	}
             	stmt.close();     
		
        }
        catch(Exception e){
        	System.out.println("Query exception - select: "+e);
        	e.printStackTrace();
        }
	return list;
}

	private Room singleWhereRoom(String whereClause)
	{
		ResultSet results;
		Room roomObj = new Room();
                
	        String query =  buildQueryRoom(whereClause);
                System.out.println(query);
		try { 
	 		Statement stmt = conn.createStatement();
	 		stmt.setQueryTimeout(5);
	 		results = stmt.executeQuery(query);
	 		
	 		if( results.next() ){
	 			roomObj = buildRoom1(results);
                            stmt.close();
                           
			}
                       else { 
                    	   roomObj = null;
                        }
		}	
	 	catch(Exception e){
	 		System.out.println("Query exception: "+e);
	 	}
		return roomObj;
	}

	private String buildQueryRoom(String whereClause) {
		
	    String query="SELECT roomId, roomType, status, description, price, lastClean FROM rooms";
		
		if (whereClause.length()>0)
			query=query+"  "+ whereClause;
			
		System.out.println(query);
		return query;
	}

	
	

	
	
	private Room buildRoom1(ResultSet results) {
		
		Room RoomObj = new Room();
		
			try {
				
				RoomObj.setRoomId(results.getInt("roomId"));
				RoomObj.setRoomType(results.getString("roomType"));
				RoomObj.setStatus(results.getString("status"));
				RoomObj.setDescription(results.getString("description"));
				RoomObj.setPrice(results.getInt("price"));
				RoomObj.setLastClean(results.getString("lastClean"));
			

				
                }
         catch(Exception e) {
        	 System.err.println(e);
         }
         return RoomObj ;
      }
	
	
	


}
