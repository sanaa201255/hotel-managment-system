package DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DB.GetMax;
import DB.DBConnection;
import Model.Guest;
import Model.TravelAgency;
import Model.User;
import Model.Staff;


public class DBUser implements IFDBUser{
	
	private Connection conn;
	
	public DBUser() {
		
		conn = DBConnection.getInstance().getDBcon();
	}
	
	public ArrayList<User> getAllUsers() {
    	
		return multiWhereUser("");
}
	
	
	private ArrayList<User> multiWhereUser(String wClause) {
		
		ResultSet results;
		ArrayList<User> list = new ArrayList<User>();	
		String query =  buildQueryUser(wClause);

		try { 
			Statement stmt = conn.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);
	

			while(results.next()){
				User userObj = new User();
				userObj = buildUser(results); 
				list.add(userObj);	
			}
			stmt.close();     
	
		}
		catch(Exception e){
			System.out.println("Query exception - select: "+e);
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int logIn(String username,String password) {
		
		
		int userId = 0;	
		if (username != null && password!=null) {
		
		ResultSet results;
		String query="Select userId from users where username =  '"+ 
                  
             username + "'AND password = '"  + 
             password + "'"; 
		
		System.out.println("insert : " + query); 
	       try{  
	        
	         Statement stmt = conn.createStatement(); 
	         stmt.setQueryTimeout(5); 
	         results = stmt.executeQuery(query); 
	          
	         if(results.next()){ 
	               
	             userId = results.getInt("userId"); 
	         } 
	         stmt.close(); 
	         
	       } 
	        
	       catch(SQLException ex){ 
	            System.out.println("reservation is not created"+ ex); 
	       } 

		}
		return userId; 
		

	    
	        
	   }
		
		
		
	
	
	public int checkUser(String username,String password){ 
        
        int res=0; 
        ResultSet results; 
        String query="Select userId from users where username =  '"+ 
                  
             
             username + "'AND password = '"  + 
             password + "'"; 
                

       System.out.println("insert : " + query); 
       try{  
        
         Statement stmt = conn.createStatement(); 
         stmt.setQueryTimeout(5); 
         results = stmt.executeQuery(query); 
          
         while(results.next()){ 
               
             res= res + results.getInt("userId"); 
         } 
         stmt.close(); 
          
       } 
        
       catch(SQLException ex){ 
            System.out.println("reservation is not created"+ ex); 
       } 
         

           return res; 


    
        
   }
	
	public ArrayList<Staff> getAllStaff() {
    	
		return multiWhereStaff("");
	}
	
	
	public User searchUserId(int userId) {   

		String whereClause = " userId = '" + userId + "'";
		System.out.println("SearchUserId " + whereClause);
		return singleWhereUser(whereClause);
    
	}

	public TravelAgency searchTravelAgencyId(int trAId) {   
    	
		String whereClause = " travelAgencyId = '" + trAId + "'";
		System.out.println("SearchUserCPR " + whereClause);
		return singleWhereTravelAgency(whereClause);
}
	
	public Staff searchStaffId(int staffId) {   
    	
		String whereClause = " staffId ='" + staffId + "'";
		System.out.println("SearchStaffId " + whereClause);
		return singleWhereStaff(whereClause);
}
	
	
	public Staff searchStaffCpr(String cpr) {   
    	
		String whereClause = " cpr ='" + cpr + "'";
		System.out.println("SearchUserCPR " + whereClause);
		return singleWhereStaff(whereClause);
}
	
	
	
	
public int insertStaff(Staff staff){
    	
		int nextUserId = GetMax.getMaxId("Select max(userId) from users");
		nextUserId = nextUserId + 1;
		System.out.println("next userId = " +  nextUserId);

		int rc = -1;
		String query="INSERT INTO users(userId, fName, lName, address, country, city, phone, username, password, email, type)  VALUES('"+
	    
		nextUserId + "','" +
		staff.getfName()  + "','"  +
		staff.getlName()  + "','"  +
		staff.getAddress()  + "','"  +
		staff.getCountry()  + "','"  +
		staff.getCity()  + "','"  +
		staff.getPhone()  + "','"  +
		staff.getUsername()  + "','"  +
		staff.getPassword()  + "','"  +
		staff.getEmail()  + "','"  +
		staff.getType()  + "') " +
	    
      	"INSERT INTO staff(staffId, position, contractStart, contractEnd, salary, officePhone )  VALUES('"+
      	
  
		nextUserId + "','" +
		staff.getPosition()  + "','"  +
		staff.getContractStart()  +  "','" +
		staff.getContractEnd()  + "','"  +
		staff.getSalary()  + "','"  +
		staff.getOfficePhone()  + "') ";
 
                 

		System.out.println("insert : " + query);
		
			try{ 
				Statement stmt = conn.createStatement();
				stmt.setQueryTimeout(5);
				rc = stmt.executeUpdate(query);
				stmt.close();
			}
			
			catch(SQLException ex){
				System.out.println("user is not created");
    
			}
				return(rc);
	}
	
	
	private ArrayList<Staff> multiWhereStaff(String wClause) {
		
        ResultSet results;
	    ArrayList<Staff> list = new ArrayList<Staff>();	
		
	    String query =  buildQueryStaff(wClause);
  
            try { 
            	
            Statement stmt = conn.createStatement();
            stmt.setQueryTimeout(5);
            results = stmt.executeQuery(query);
	 
	 			while(results.next()){
	 				Staff staffObj = new Staff();
	 				staffObj = buildStaff(results);	
	 				list.add(staffObj);	
	 			}
	 				stmt.close();     
			
            }
            catch(Exception e){
	 		System.out.println("Query exception - select: "+e);
			e.printStackTrace();
            }
            
            return list;
		}
	
	
	
	
	
	public int updateUser(User user) {
    	
		User userObj  = user;
		int rc=-1;

		String query="UPDATE user SET "+
	
	 	  "address ='"+ userObj.getAddress()+"', "+
	 	  "country ='"+ userObj.getCountry() + "', " +
          "city ='"+ userObj.getCity() + "', " +
          "phone ='"+ userObj.getPhone() + "' " +
          "username ='"+ userObj.getUsername() + "' " +
          "password ='"+ userObj.getPassword() + "' " +
          "email ='"+ userObj.getEmail() + "' " +
          "type ='"+ userObj.getType() + "' " +
          
	      "WHERE userId = '"+ userObj.getUserId() + "'";
          
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
	
	
	 
	
	public int deleteUser(int userId) {
    	
       	int rc=-1;

       	String query="DELETE FROM users WHERE userId = '" +
			userId + "'";
        System.out.println(query);
        
        	try{ 
        		Statement stmt = conn.createStatement();
        		stmt.setQueryTimeout(5);
        		rc = stmt.executeUpdate(query);
        		stmt.close();
        	}
        	
        	catch(Exception ex){
        		System.out.println("Delete exception in user db: "+ex);
        	}
        		return(rc);
}
	
	
	
	private Staff singleWhereStaff(String whereClause){
		
		ResultSet results;
		Staff staffObj = new Staff();  
        String query =  buildQueryStaff(whereClause);
        System.out.println(query);
        
        	try { 
        		Statement stmt = conn.createStatement();
        		stmt.setQueryTimeout(5);
        		results = stmt.executeQuery(query);
 		
        		if( results.next() ){
        			staffObj = buildStaff(results);
                    stmt.close();
                       
        		}
                   else { 
                	   staffObj = null;
                    }
        	}	
        	catch(Exception e){
        		System.out.println("Query exception: "+e);
        	}
        	
        		return staffObj;
	}
	
	
	
	
	
	private String buildQueryStaff(String whereClause) {
		
		String query="SELECT userId, fName, lName, address, country, city, phone, username, password, email, type, staffId, position, contractStart, contractEnd, salary, officePhone FROM users, staff where users.userId=staff.staffId";
	
		if (whereClause.length()>0)
			query=query+" and  "+ whereClause;
		
		return query;
	}
	
	
	
	
	
	private Staff buildStaff(ResultSet results) {
		
		Staff staffObj = new Staff();
	
			try {
				staffObj.setUserId(results.getInt("userId"));
				staffObj.setfName(results.getString("fName"));
				staffObj.setlName(results.getString("lName"));
				staffObj.setAddress(results.getString("address"));
				staffObj.setCountry(results.getString("country"));
				staffObj.setCity(results.getString("city"));
				staffObj.setPhone(results.getString("phone"));
				staffObj.setUsername(results.getString("username"));
				staffObj.setPassword(results.getString("password"));
				staffObj.setEmail(results.getString("email"));
				staffObj.setUserId(results.getInt("staffId"));
				staffObj.setPosition(results.getString("position"));
				staffObj.setContractStart(results.getString("contractStart"));
				staffObj.setContractEnd(results.getString("contractEnd"));
				staffObj.setSalary(results.getDouble("salary"));
				staffObj.setOfficePhone(results.getString("officePhone"));
			}				
			catch(Exception e) {
				System.err.println(e);
			}
				return staffObj;
  }

	
				
	public ArrayList<Guest> getAllGuest() {
    	
		return multiWhereGuest("");
	}
	
	
	
	public Guest searchGuestId(int userId) {   
    	
    	
		String whereClause1 = "  userId = '" + userId + "'";
		System.out.println("SearchUserId " + whereClause1);
		return singleWhereGuest(whereClause1);
	}
	
	
	public ArrayList<Guest> searchMultiGuestCpr(String cpr) {   
    	
    	
		String whereClause1 = " cpr like '%" + cpr + "%'";
		System.out.println("SearchCPR " + whereClause1);
		return multiWhereGuest(whereClause1);
	}
	
	public Guest searchGuestCpr(String cpr) {   
    	
    	
		String whereClause1 = " cpr = '" + cpr + "'";
		System.out.println("SearchCPR " + whereClause1);
		return singleWhereGuest(whereClause1);
	}
	
	
	public int insertGuest(Guest guest){
    	
		int nextUserId = GetMax.getMaxId("Select max(userId) from users");
		nextUserId = nextUserId + 1;
		System.out.println("next userId = " +  nextUserId);

		int rc = -1;
		if(guest.getTravelAgency()== null) {
			
		
		String query="INSERT INTO users (userId, fName, lName, address, country, city, " +
				"phone, username, password, email,cpr, type)  VALUES('"+
	    
		nextUserId + "','" +
	    guest.getfName()  + "','"  +
	    guest.getlName()   + "','"  +
	    guest.getAddress()  + "','"  +
	    guest.getCountry()  + "','"  +
	    guest.getCity()  + "','"  +
	    guest.getPhone() + "','" +
	    guest.getUsername() + "','"  +
	    guest.getPassword()  + "','"  +
	    guest.getEmail() + "','"  +
	    guest.getCpr() + "','"  +
	    guest.getType() + "') " +
	    
      "INSERT INTO guest(guestId)  VALUES('"+
    

		 nextUserId + "')";
	 
		System.out.println("insert : " + query);
		
		try{ 
			Statement stmt = conn.createStatement();
	        stmt.setQueryTimeout(5);
	     	rc = stmt.executeUpdate(query);
	        stmt.close();
		}
		catch(SQLException ex){
			System.out.println("User is not created");
    
		}
			return(rc);
}
		
		else {
			

			
			
			String query="INSERT INTO users (userId, fName, lName, address, country, city, " +
					"phone, username, password, email,cpr, type)  VALUES('"+
		    
			nextUserId + "','" +
		    guest.getfName()  + "','"  +
		    guest.getlName()   + "','"  +
		    guest.getAddress()  + "','"  +
		    guest.getCountry()  + "','"  +
		    guest.getCity()  + "','"  +
		    guest.getPhone() + "','" +
		    guest.getUsername() + "','"  +
		    guest.getPassword()  + "','"  +
		    guest.getEmail() + "','"  +
		    guest.getCpr() + "','"  +
		    guest.getType() + "') " +
		    
	      "INSERT INTO guest(guestId, travelAgencyId)  VALUES('"+
	    
 				 nextUserId + "','"  +
 				 guest.getTravelAgency().getUserId()  + "')";
		 
			System.out.println("insert : " + query);
			
			try{ 
				Statement stmt = conn.createStatement();
		        stmt.setQueryTimeout(5);
		     	rc = stmt.executeUpdate(query);
		        stmt.close();
			}
			catch(SQLException ex){
				System.out.println("User is not created");
	    
			}
				return(rc);
	}
			
		}

	
	
	
	
	
	
	
public int insertTravelAgency(TravelAgency travelAgency){
    	
		int nextUserId = GetMax.getMaxId("Select max(userId) from users");
		nextUserId = nextUserId + 1;
		System.out.println("next userId = " +  nextUserId);

		int rc = -1;
		String query="INSERT INTO users(userId, fName, lName, address, country, city, phone, username, password, email, type)  VALUES('"+
	    
		nextUserId + "','" +
		travelAgency.getfName()  + "','"  +
		travelAgency.getlName()  + "','"  +
		travelAgency.getAddress()  + "','"  +
		travelAgency.getCountry()  + "','"  +
		travelAgency.getCity()  + "','"  +
		travelAgency.getPhone() + "','" +
		travelAgency.getUsername() + "','" +
		travelAgency.getPassword() + "','" +
		travelAgency.getEmail() + "','" +
		travelAgency.getType() + "')" +
	    
      "INSERT INTO TravelAgency(travelAgencyId, companyId, contractStart, contractEnd, travelAgencyName)  VALUES('"+
    
		nextUserId + "','" +
		travelAgency.getCompanyId()  + "','"  +
		travelAgency.getContractStart()  + "','"  +
		travelAgency.getContractEnd()  + "','"  +
		travelAgency.getTravelAgencyName()  + "')";
	 
		
		System.out.println("insert : " + query);
		
		try{ 
			Statement stmt = conn.createStatement();
	        stmt.setQueryTimeout(5);
	     	rc = stmt.executeUpdate(query);
	        stmt.close();
		}
		catch(SQLException ex){
			System.out.println("User is not created");
    
		}
			return(rc);
}
	


public int updateTravelAgency(TravelAgency travelAgency) {
	
	TravelAgency travelAgencyObj  = travelAgency;
	int rc=-1;

	String query="UPDATE travelAgency SET "+

 	  "address ='"+ travelAgencyObj.getAddress()+"', "+
 	  "country ='"+ travelAgencyObj.getCountry() + "', " +
      "city ='"+ travelAgencyObj.getCity() + "', " +
      "phone ='"+ travelAgencyObj.getPhone() + "' " +
      "username ='"+ travelAgencyObj.getUsername() + "' " +
      "password ='"+ travelAgencyObj.getPassword() + "' " +
      "email ='"+ travelAgencyObj.getEmail() + "' " +
      "type ='"+ travelAgencyObj.getType() + "' " +
      
      "WHERE travelAgencyId = '"+ travelAgencyObj.getUserId() + "'";
      
	

	
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



	
	
	
	
	
	
	
	
	private ArrayList<Guest> multiWhereGuest(String wClause1) {
		
        ResultSet results;
        ArrayList<Guest> list = new ArrayList<Guest>();			
        String query =  buildQueryGuest(wClause1);

        try { 
			Statement stmt = conn.createStatement();
		 	stmt.setQueryTimeout(5);
		 	results = stmt.executeQuery(query);

		 		while(results.next()){
		 			Guest guestObj = new Guest();
		 			guestObj = buildGuest(results);	
		 			list.add(guestObj);	
		 		}
		 	stmt.close();     
	
        }
        
        catch(Exception e){
        	System.out.println("Query exception - select: "+e);
        	e.printStackTrace();
        }
        return list;
}

	
	
	
	
	
	private Guest singleWhereGuest (String whereClause){
		
		ResultSet results;
		Guest guestObj = new Guest();   
        String query =  buildQueryGuest(whereClause);
        System.out.println(query);
        
        	try { 
        		
	 		Statement stmt = conn.createStatement();
	 		stmt.setQueryTimeout(5);
	 		results = stmt.executeQuery(query);
 		
	 			if( results.next() ){
	 				guestObj = buildGuest(results);
                    stmt.close();
                       
	 			}
                   else { 
                        guestObj = null;
                    }
        	}	
        	catch(Exception e){
        		System.out.println("Query exception: "+e);
        	}
        		return guestObj;
	}
	
	
	private TravelAgency singleWhereTravelAgency (String whereClause){
		
		ResultSet results;
		TravelAgency travelAgencyObj = new TravelAgency();   
        String query =  buildQueryTravelAgency(whereClause);
        System.out.println(query);
        
        	try { 
        		
	 		Statement stmt = conn.createStatement();
	 		stmt.setQueryTimeout(5);
	 		results = stmt.executeQuery(query);
 		
	 			if( results.next() ){
	 				travelAgencyObj = buildTravelAgency(results);
                    stmt.close();
                       
	 			}
                   else { 
                	   travelAgencyObj = null;
                    }
        	}	
        	catch(Exception e){
        		System.out.println("Query exception: "+e);
        	}
        		return travelAgencyObj;
	}
	
	
	
	
	
	
	
	private User singleWhereUser(String whereClause){
		
		
		ResultSet results;
		User userObj = new User();   
        String query =  buildQueryUser(whereClause);
        System.out.println(query);
        
        	try { 
		 		Statement stmt = conn.createStatement();
		 		stmt.setQueryTimeout(5);
		 		results = stmt.executeQuery(query);
 		
		 			if( results.next() ){
		 				userObj = buildUser(results);
                        stmt.close();
                       
		 			}
		 			
                   else { 
                	   userObj = null;
                    }
        	}	
        	catch(Exception e){
        		System.out.println("Query exception: "+e);
        	}
        		return userObj;
	}
	
	
	

	
	private String buildQueryGuest(String whereClause) {
		
		String query="SELECT userId, fName, lName, address, country, " +
				"city, phone, username,password, email, cpr, type, guestId, travelAgencyId " +
				"FROM users, guest where users.userId=guest.guestId AND type = 'guest' ";
	
			if (whereClause.length()>0)
				query=query+" AND "+ whereClause;
		
				return query;
	}
	
	
	private String buildQueryTravelAgency(String whereClause) {
		
		String query="SELECT userId, fName, lName, address, country, city, phone, username," +
				"	password, email, type, travelAgencyId, companyId,contractStart,contractEnd," +
				"travelAgencyNAme FROM users, travelAgency where " +
				"users.userId=travelAgency.travelAgencyId AND";
	
			if (whereClause.length()>0)
				query=query+"  "+ whereClause;
		
				return query;
	}
	
	
		
	
	
	private String buildQueryUser(String whereClause) {
		
		String query="SELECT userId, fName, lName, address, country, city, phone, username, password, email, type FROM users";
	
			if (whereClause.length()>0)
			query=query+"  where"+ whereClause;
		
				return query;
}

	
	
	
	
		private Guest buildGuest(ResultSet results) {
	
			Guest guestObj = new Guest();
			try {
				
			guestObj.setUserId(results.getInt("userId"));
			guestObj.setfName(results.getString("fName"));
			guestObj.setlName(results.getString("lName"));
			guestObj.setAddress(results.getString("address"));
			guestObj.setCountry(results.getString("country"));
			guestObj.setCity(results.getString("city"));
			guestObj.setPhone(results.getString("phone"));
			guestObj.setUsername(results.getString("username"));
			guestObj.setPassword(results.getString("password"));
			guestObj.setEmail(results.getString("email"));
			guestObj.setCpr(results.getString("cpr"));
			guestObj.setUserId(results.getInt("guestId"));
			guestObj.setTravelAgency(searchTravelAgencyId(results.getInt("travelAgencyId")));
			}
		
		catch(Exception e) {
			System.err.println(e);
		}
			return guestObj;
}

	
		
		
		private TravelAgency buildTravelAgency(ResultSet results) {
			
			TravelAgency travelAgencyObj = new TravelAgency();
			
			
			try {
			travelAgencyObj.setUserId(results.getInt("userId"));
			travelAgencyObj.setfName(results.getString("fName"));
			travelAgencyObj.setlName(results.getString("lName"));
			travelAgencyObj.setAddress(results.getString("address"));
			travelAgencyObj.setCountry(results.getString("country"));
			travelAgencyObj.setCity(results.getString("city"));
			travelAgencyObj.setPhone(results.getString("phone"));
			travelAgencyObj.setUsername(results.getString("username"));
			travelAgencyObj.setPassword(results.getString("password"));
			travelAgencyObj.setEmail(results.getString("email"));
			travelAgencyObj.setCompanyId(results.getString("companyId"));
			travelAgencyObj.setContractStart(results.getString("contractStart"));
			travelAgencyObj.setContractEnd(results.getString("contractEnd"));
			travelAgencyObj.setTravelAgencyName(results.getString("travelAgencyNAme"));
			
			}
		
		catch(Exception e) {
			System.err.println(e);
		}
			return travelAgencyObj;
}
	
	
	
	
	private User buildUser(ResultSet results) {
		
		User userObj = new User();
			try {
				userObj.setUserId(results.getInt("userId"));
				userObj.setfName(results.getString("fName"));
				userObj.setlName(results.getString("lName"));
				userObj.setAddress(results.getString("address"));
				userObj.setCountry(results.getString("country"));
				userObj.setType(results.getString("type"));
				userObj.setCity(results.getString("city"));
				userObj.setPhone(results.getString("phone"));
				userObj.setUsername(results.getString("username"));
				userObj.setPassword(results.getString("password"));
				userObj.setEmail(results.getString("email"));
			}
			catch(Exception e) {
				System.err.println(e);
			}
				return userObj;
}

	public int updateStaff(int staffId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTravelAgency(int travelAgencyId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateGuest(Guest guest) {
	     
		  Guest guestObj = guest;
		  int rc=-1;

		  String query="UPDATE users SET "+
		 
		          "address ='"+ guestObj.getAddress()+"', "+
		          "country ='"+ guestObj.getCountry() + "', " +
		          "city ='"+ guestObj.getCity() + "', " +
		          "phone ='"+ guestObj.getPhone() + "', " +
		          "email ='"+ guestObj.getEmail() + "' " +
		          
		       "WHERE userId = '"+ guestObj.getUserId() + "'";
		          
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

	
	
	
	
}
