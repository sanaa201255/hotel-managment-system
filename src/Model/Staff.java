package Model;

public class Staff extends User {

private String position;
private String contractStart;
private String contractEnd;
private double salary;
private String officePhone;

public Staff(int userId, String fName, String lName, String address,
		String country, String city, String phone, String username,
		String password, String email, String type,String cpr,
		String position, String contractStart, String contractEnd,
		double salary, String officePhone) {
	super(userId, fName, lName, address, country, city, phone, username,
			password, email, type,cpr);
	this.position = position;
	this.contractStart = contractStart;
	this.contractEnd = contractEnd;
	this.salary = salary;
	this.officePhone = officePhone;
}

public Staff() {
	super();
}

public String getPosition() {
	return position;
}

public void setPosition(String position) {
	this.position = position;
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

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public String getOfficePhone() {
	return officePhone;
}

public void setOfficePhone(String officePhone) {
	this.officePhone = officePhone;
}


}
