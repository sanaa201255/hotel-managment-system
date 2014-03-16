package DB	;
import Model.*;


import java.util.ArrayList;


public interface IFDBFacility {
   
	
	    public ArrayList<Facility> getAllFacilities();
	    public Facility searchFacilityId(int facilityId);
	    public ArrayList<Facility>  searchFacilityType(String facilityType);
	    public int insertFacility(Facility facility);
	    public int updateFacility(Facility facility);
	    public int updateFacilityStatus(Facility facility);
	    public int deleteFacility(int facilityId);
}