package Controller;

import java.util.ArrayList;

import Model.*;
import DB.*;

public class UserController {
	
	private DBUser user;

	private DBUser dbUser;
	


	public UserController (){
		
		user =  new DBUser();
		
	}
	
	public void createGuest(Guest guest){
		
		user.insertGuest(guest);
		
	}
	
	public void updateGuest (Guest guest) {
		
		user.updateGuest(guest);
	
	}
	
	public Guest searchGuest(String cpr){
		
		return user.searchGuestCpr(cpr);
		
	}
	
	public ArrayList<Guest> searchMultiGuestCpr(String cpr) {
		
		return user.searchMultiGuestCpr(cpr);
		
		
	}
	
	public ArrayList<Guest> getAllGuest() {
		
		return user.getAllGuest();
		
	}
	
	public Staff searchStaffCpr(String cpr){
		
		dbUser = new DBUser();
		
		return dbUser.searchStaffCpr(cpr);
		
	}
	
	public void insertStaff(Staff staff)  {
		
	user.insertStaff(staff);
}
	
	public void insertTravelAgency(TravelAgency travelAgency) {
		
		user.insertTravelAgency(travelAgency);
		
	}
	
	public ArrayList<User> getAllUsers() {
		
		return user.getAllUsers();
		
	}

	public int logIn(String username,String password){
		
		dbUser = new DBUser();
		return dbUser.logIn(username, password);
		
	}
	
	public boolean checkUser(String username,String password)
    {
        User user = searchGuest(username);
        if(user !=null)
        {
            if(user.getUsername().toLowerCase().equals(username.toLowerCase()))
            {
                if(user.getPassword().toLowerCase().equals(password.toLowerCase()))
                return true;
            }
            else
            {
            return false;
            }
        }
        
        return false;
    }
	
	public User searchUserId(int userId) {
		dbUser = new DBUser();
		return dbUser.searchUserId(userId);
		
	}
	
	public Staff searchStaffId(int staffId) {
		
		dbUser = new DBUser();
		return dbUser.searchStaffId(staffId);
		
	}
}
