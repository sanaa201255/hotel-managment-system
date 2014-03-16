package Model;

public class Facility {

	private int facilityId;
	private String facilityType;
	private String capacity;
	private double facilityPrice;
	private String status;
	
	
	public Facility(int facilityId, String facilityType, String capacity,
			double facilityPrice, String status) {
		this.facilityId = facilityId;
		this.facilityType = facilityType;
		this.capacity = capacity;
		this.facilityPrice = facilityPrice;
		this.status = status;
	}
	
	public Facility() {
		
	}

	public int getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}

	public String getFacilityType() {
		return facilityType;
	}

	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public double getFacilityPrice() {
		return facilityPrice;
	}

	public void setFacilityPrice(double facilityPrice) {
		this.facilityPrice = facilityPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
