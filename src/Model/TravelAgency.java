package Model;

public class TravelAgency extends User{
	
	private String travelAgencyName;
	private String companyId;
	private String contractStart;
	private String contractEnd;
	private int commission;
	
		
	public TravelAgency(int userId, String fName, String lName, String address,
			String country, String city, String phone, String username,
			String password, String email, String type,String cpr,
			String travelAgencyName, String companyId, String contractStart,
			String contractEnd, int commission) {
		super(userId, fName, lName, address, country, city, phone, username,
				password, email, type,cpr);
		this.travelAgencyName = travelAgencyName;
		this.companyId = companyId;
		this.contractStart = contractStart;
		this.contractEnd = contractEnd;
		this.commission = commission;
	}

	public TravelAgency() {
		super();
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getContractStart() {
		return contractStart;
	}

	public void setContractStart(String contractStart) {
		this.contractStart = contractStart;
	}

	public String getContractEnd() {
		return contractEnd;
	}

	public void setContractEnd(String contractEnd) {
		this.contractEnd = contractEnd;
	}

	public int getCommission() {
		return commission;
	}

	public String getTravelAgencyName() {
		return travelAgencyName;
	}

	public void setTravelAgencyName(String travelAgencyName) {
		this.travelAgencyName = travelAgencyName;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}
	
	
}
