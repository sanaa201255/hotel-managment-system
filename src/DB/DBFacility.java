package DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.Facility;
import DB.DBConnection;
import DB.GetMax;

public class DBFacility implements IFDBFacility  {
	
	private Connection conn;
	
	
	public DBFacility() {
		
        conn = DBConnection.getInstance().getDBcon();
}
	
	
	public ArrayList<Facility> getAllFacilities() {
		
		 return multiWhereFacilities("");
	}

	public Facility searchFacilityId(int facilityId) {
		
		String whereClause = "  facilityId = '" + facilityId + "'";
    	System.out.println("SearchFacilityId " + whereClause);
        return singleWhereFacility(whereClause);
	}

	public ArrayList<Facility>  searchFacilityType(String facilityType) {
		
		String whereClause = "  facilityType = '" + facilityType + "'";
    	System.out.println("SearchFacilityId " + whereClause);
        return multiWhereFacilities(whereClause);
	}

	public int insertFacility(Facility facility) {
		
		int nextFacilityId = GetMax.getMaxId("Select max(facilityId) from Facilities");
		nextFacilityId = nextFacilityId + 1;
        System.out.println("next facilityId = " +  nextFacilityId);
  
       int rc = -1;
	   String query="INSERT INTO Facilities (facilityId, facilityType, capacity, facilityPrice, status )  VALUES('"+
		    
			nextFacilityId + "','" +
			facility.getFacilityType()  + "','"  +
			facility.getCapacity()  + "','"  +
			facility.getFacilityPrice()  + "','"  +
			facility.getStatus() + "')";
		    

       System.out.println("insert : " + query);
       try{ 
          Statement stmt = conn.createStatement();
          stmt.setQueryTimeout(5);
     	  rc = stmt.executeUpdate(query);
          stmt.close();
       }
       catch(SQLException ex){
          System.out.println("Facility is not created");
          System.out.println(ex);
        
       }
       return(rc);
		
	}

	public int updateFacility(Facility facility) {
		
		Facility facilityObj  = facility;
		int rc=-1;

		String query="UPDATE Facilities SET "+

             
              "status ='"+ facilityObj.getStatus() + "' " +

		      "WHERE facilityId = '"+ facilityObj.getFacilityId() + "'";
              
		System.out.println("Update query:" + query);
  		try {
	 		Statement stmt = conn.createStatement();
	 		stmt.setQueryTimeout(5);
	 	 	rc = stmt.executeUpdate(query);

	 	 	stmt.close();
		}
	 	catch(Exception ex){
	 	 	System.out.println("Update exception in Facilities db: "+ex);
	  	}
		return(rc);
		
	}

	
	public int updateFacilityStatus(Facility facility) {
		
		Facility facilityObj  = facility;
		int rc=-1;

		String query="UPDATE Facilities SET "+

              
              "status ='"+ facilityObj.getStatus() + "' " +

		      "WHERE facilityId = '"+ facilityObj.getFacilityId() + "'";
              
		System.out.println("Update query:" + query);
  		try {
	 		Statement stmt = conn.createStatement();
	 		stmt.setQueryTimeout(5);
	 	 	rc = stmt.executeUpdate(query);

	 	 	stmt.close();
		}
	 	catch(Exception ex){
	 	 	System.out.println("Update exception in Facilities status db: "+ex);
	  	}
		return(rc);
		
	}

	public int deleteFacility(int facilityId) {
		
		
		  int rc=-1;
		  
		  	String query="DELETE FROM Facilities WHERE facilityId = '" +
		  			facilityId + "'";
	                System.out.println(query);
		  	try{ 
		 		Statement stmt = conn.createStatement();
		 		stmt.setQueryTimeout(5);
		 	  	rc = stmt.executeUpdate(query);
		 	  	stmt.close();
	  		}
	   	        catch(Exception ex){
		 	  	System.out.println("Delete exception in facilityId db: "+ex);
	   	        }
			return(rc);
		
	}
	
	private ArrayList<Facility> multiWhereFacilities(String wClause) {
		
        ResultSet results;
    ArrayList<Facility> list = new ArrayList<Facility>();	
	
    String query =  buildQueryFacility(wClause);

        try { 
	Statement stmt = conn.createStatement();
 	stmt.setQueryTimeout(5);
 	results = stmt.executeQuery(query);
 	

	while(results.next()){
		Facility facilityObj = new Facility();
		facilityObj = buildFacility(results);	
             list.add(facilityObj);	
	}
             stmt.close();     
		
	}
 	catch(Exception e){
 		System.out.println("Query exception - select: "+e);
		e.printStackTrace();
 	}
	return list;
}

	private Facility singleWhereFacility(String whereClause)
	{
		ResultSet results;
		Facility facilityObj = new Facility();
                
	        String query =  buildQueryFacility(whereClause);
                System.out.println(query);
		try { 
	 		Statement stmt = conn.createStatement();
	 		stmt.setQueryTimeout(5);
	 		results = stmt.executeQuery(query);
	 		
	 		if( results.next() ){
	 			facilityObj = buildFacility(results);
                            stmt.close();
                           
			}
                       else { 
                    	   facilityObj = null;
                        }
		}	
	 	catch(Exception e){
	 		System.out.println("Query exception: "+e);
	 	}
		return facilityObj;
	}
	
	private String buildQueryFacility(String whereClause) {
		
	    String query="SELECT facilityId,facilityType,capacity, facilityPrice,status FROM Facilities ";
		
		if (whereClause.length()>0)
			query=query+"where  "+ whereClause;
			
		return query;
	}
	
	
		private Facility buildFacility(ResultSet results) {
		
			Facility facilityObj = new Facility();
		
			try {
				
				facilityObj.setFacilityId(results.getInt("facilityId"));
				facilityObj.setCapacity(results.getString("capacity"));
				facilityObj.setFacilityPrice(results.getDouble("facilityPrice"));
				facilityObj.setFacilityType(results.getString("facilityType"));
				facilityObj.setStatus(results.getString("status"));
				
				
                }
         catch(Exception e) {
        	 System.err.println(e);
         }
         return facilityObj;
      }
}
