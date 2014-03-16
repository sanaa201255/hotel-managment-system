package Model;

public class Packages {
	
	private int packageId;
	private double discount;
	private String description;
	private String status;
	
	public Packages(int packageId, double discount, String description, String status) {
		this.packageId = packageId;
		this.discount = discount;
		this.description = description;
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Packages() {
		
	}

	public int getPackageId() {
		return packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
