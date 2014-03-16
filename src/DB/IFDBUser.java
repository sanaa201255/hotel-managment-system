package DB;


import Model.*;

import java.util.ArrayList;

public interface IFDBUser {
   
    public ArrayList<User> getAllUsers();
    public ArrayList<Staff> getAllStaff();
    public ArrayList<Guest> getAllGuest();    
    public Staff searchStaffCpr(String cpr);
    public User searchUserId(int userId);
    public Guest searchGuestCpr(String cpr);
    public ArrayList<Guest> searchMultiGuestCpr(String cpr);
    public int insertGuest(Guest guest);
    public int insertStaff(Staff staff);
    public int insertTravelAgency(TravelAgency travelAgency);
    public int updateGuest(Guest guest);
    public int updateStaff(int staffId);
    public int updateTravelAgency(int travelAgencyId);
    public int deleteUser(int userId);
    
    
}
