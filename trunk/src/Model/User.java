package Model;

public class User {

private int userId;
private String fName;
private String lName;
private String address;
private String country;
private String city;
private String phone;
private String username;
private String password;
private String email;
private String type;
private String cpr;

public User(int userId, String fName, String lName, String address,
		String country, String city, String phone, String username,
		String password, String email, String type,String cpr) {
	super();
	this.userId = userId;
	this.fName = fName;
	this.lName = lName;
	this.address = address;
	this.country = country;
	this.city = city;
	this.phone = phone;
	this.username = username;
	this.password = password;
	this.email = email;
	this.type = type;
	this.cpr=cpr;
}

public User() {

}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getfName() {
	return fName;
}

public void setfName(String fName) {
	this.fName = fName;
}

public String getlName() {
	return lName;
}

public void setlName(String lName) {
	this.lName = lName;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}



public String getCpr() {
return cpr;
}

public void setCpr(String cpr) {
this.cpr = cpr;
}



}
