package DB;

import java.sql.*;



public class GetMax {
    
  
    public GetMax() {
    }
 
    
    public static int getMaxId(String query){
	ResultSet results;
	int id = -1;
	
	try{ 
	   Statement stmt = DBConnection.getInstance().getDBcon().createStatement();
	   results = stmt.executeQuery(query);
	   if( results.next() ){
		 id = results.getInt(1);
	    }
	   
	    }
	catch(Exception e){
	    System.out.println("Query exception: Error in reading maxid" + e);
	}
	return id;
}
}
