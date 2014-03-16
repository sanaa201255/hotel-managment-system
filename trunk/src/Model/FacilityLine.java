package Model;

public class FacilityLine {

private Facility facility;
private int facilityLineId;
private String facilityDate;
private String facilityTime;
private int noOfUsers;
private String instructor;



public FacilityLine( String facilityDate,
		String facilityTime, int noOfUsers,int facilityLineId) {

	this.facilityDate = facilityDate;
	this.facilityTime = facilityTime;
	this.noOfUsers = noOfUsers;
	this.facilityLineId = facilityLineId;
}

public int getFacilityLineId() {
	return facilityLineId;
}

public void setFacilityLineId(int facilityLineId) {
	this.facilityLineId = facilityLineId;
}

public FacilityLine() {
	
}

public Facility getFacility() {
	return facility;
}

public void setFacility(Facility facility) {
	this.facility = facility;
}

public String getFacilityDate() {
	return facilityDate;
}

public void setFacilityDate(String facilityDate) {
	this.facilityDate = facilityDate;
}

public String getFacilityTime() {
	return facilityTime;
}

public void setFacilityTime(String facilityTime) {
	this.facilityTime = facilityTime;
}

public int getNoOfUsers() {
	return noOfUsers;
}

public void setNoOfUsers(int noOfUsers) {
	this.noOfUsers = noOfUsers;
}


public String getInstructor() {
	return instructor;
}

public void setInstructor(String instructor) {
	this.instructor = instructor;
}


}
