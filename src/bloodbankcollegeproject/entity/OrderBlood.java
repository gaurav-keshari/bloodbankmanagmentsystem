package bloodbankcollegeproject.entity;

public class OrderBlood {
 private int orderno;
 private String bloodtype;
 private String quantity;
 private int licenseno;
public OrderBlood(int orderno, String bloodtype, String quantity) {

	this.orderno = orderno;
	this.bloodtype = bloodtype;
	this.quantity = quantity;
}
public OrderBlood(String bloodtype, String quantity, int licenseno) {
	
	this.bloodtype = bloodtype;
	this.quantity = quantity;
	this.licenseno = licenseno;
}
public int getOrderno() {
	return orderno;
}
public void setOrderno(int orderno) {
	this.orderno = orderno;
}
public String getBloodtype() {
	return bloodtype;
}
public void setBloodtype(String bloodtype) {
	this.bloodtype = bloodtype;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public int getLicenseno() {
	return licenseno;
}
public void setLicenseno(int licenseno) {
	this.licenseno = licenseno;
}


}
