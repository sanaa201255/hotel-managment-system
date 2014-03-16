package DB;

import DB.GetMax;
import DB.DBConnection;
import Model.*;

import java.sql.*;
import java.util.ArrayList;


public class DBPackages {
	
	private Connection conn;
    public DBPackages() {
    conn = DBConnection.getInstance().getDBcon();
    }

    public Packages getPackage() {
    	
        return singleWherePackages("");
    }


    public int deletePackage(int packageId) {
		int rc=-1;
		String query="DELETE FROM packages WHERE packageId = '" +
				packageId + "'";
            System.out.println(query);
         try{ 
	 		Statement stmt = conn.createStatement();
	 		stmt.setQueryTimeout(5);
	 	  	rc = stmt.executeUpdate(query);
	 	  	stmt.close();
		}
	        catch(Exception ex){
	        	System.out.println("Delete exception in packages db: "+ex);
	        }
         		return(rc);
	}
    
    
   public ArrayList<Packages> getAllPackages() {
    	
        return multiWherePackages("");
    }

    public Packages searchPackageId(int packageId) {   
    	
    	String whereClause = " where  packageId = '" + packageId + "'";
    	System.out.println("SearchPackageId " + whereClause);
        return singleWherePackages(whereClause);
    }
    
    public Packages searchDescription(String description) {   
    	
    	String whereClause = " where  description = '" + description + "'";
    	System.out.println("SearchPackageId " + whereClause);
        return singleWherePackages(whereClause);
    }

    
    public int insertPackage(Packages packages){
    	
        int nextPackageId = GetMax.getMaxId("Select max(packageId) from packages"); // 
        nextPackageId = nextPackageId + 1;
        System.out.println("next packageId = " +  nextPackageId);
  
       int rc = -1;
	   String query="INSERT INTO packages(packageId, discount ,description, status)  VALUES('"+
		    
			nextPackageId + "','" +
			packages.getDiscount()  + "','"  +
			packages.getDescription()  + "','"  +
			packages.getStatus() + "')";
		    
                     

       System.out.println("insert : " + query);
      try{ 
          Statement stmt = conn.createStatement();
          stmt.setQueryTimeout(5);
     	  rc = stmt.executeUpdate(query);
          stmt.close();
      }
       catch(SQLException ex){
          System.out.println("package is not created");
        
       }
       return(rc);

}
    


  
	private ArrayList<Packages> multiWherePackages(String wClause) {
		
        ResultSet results;
        ArrayList<Packages> list = new ArrayList<Packages>();	
        String query =  buildQueryPackages(wClause);

        try { 
			Statement stmt = conn.createStatement();
		 	stmt.setQueryTimeout(5);
		 	results = stmt.executeQuery(query);

		 	while(results.next()){
		 		Packages packagesObj = new Packages();
		 		packagesObj= buildPackage(results);	
		        list.add(packagesObj);	
		 	}
             	stmt.close();     
		
        }
        catch(Exception e){
        	System.out.println("Query exception - select: "+e);
        	e.printStackTrace();
        }
	return list;
}

	private Packages singleWherePackages(String whereClause)
	{
		ResultSet results;
		Packages packagesObj = new Packages();
                
	        String query =  buildQueryPackages(whereClause);
                System.out.println(query);
		try { 
	 		Statement stmt = conn.createStatement();
	 		stmt.setQueryTimeout(5);
	 		results = stmt.executeQuery(query);
	 		
	 		if( results.next() ){
	 			packagesObj  = buildPackage(results);
                            stmt.close();
                           
			}
                       else { 
                    	   packagesObj = null;
                        }
		}	
	 	catch(Exception e){
	 		System.out.println("Query exception: "+e);
	 	}
		return packagesObj;
	}

	private String buildQueryPackages(String whereClause) {
		
	    String query="SELECT packageId, discount, description ,status FROM packages";
		
		if (whereClause.length()>0)
			query=query+"  "+ whereClause;
			
		System.out.println(query);
		return query;
	}

	
	

	
	
	private Packages buildPackage(ResultSet results) {
		
		Packages packagesObj = new Packages();
		
			try {
				
				packagesObj.setPackageId(results.getInt("packageId"));
				packagesObj.setDescription(results.getString("description"));
				packagesObj.setStatus(results.getString("status"));
				packagesObj.setDiscount(results.getDouble("discount"));
			

				
                }
         catch(Exception e) {
        	 System.err.println(e);
         }
         return packagesObj ;
      }
	
	
	


}
