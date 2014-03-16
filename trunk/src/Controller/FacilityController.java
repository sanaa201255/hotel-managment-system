package Controller;


import Model.*;
import DB.*;

public class FacilityController {
	
	private DBFacility dbFacility;



	public FacilityController (){
	
		dbFacility =  new DBFacility();
	
}
	
	public void insertFacility(Facility facility) {
		
		dbFacility.insertFacility(facility);
		
	}
	
	
}