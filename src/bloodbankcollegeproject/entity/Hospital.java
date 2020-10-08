package bloodbankcollegeproject.entity;

public class Hospital {
 private int license;
 private   String name;
 private  String address;
 private  int phone;
 private   String email;
 
 
public Hospital(int license, String name, String address, int phone, String email) {
	
	this.license = license;
	this.name = name;
	this.address = address;
	this.phone = phone;
	this.email = email;
}
public Hospital(int license) {
	this.license=license;
}
public int getLicense() {
	return license;
}
public void setLicense(int license) {
	this.license = license;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
	
	
}
