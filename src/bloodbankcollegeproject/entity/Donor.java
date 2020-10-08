package bloodbankcollegeproject.entity;



public class Donor {
	private String email;
	private int adharno;
	private String name;
	private String sex;
	private String address;
	private String date;
	private int contactNo;
	private double weight;
	private double height;
	public String getEmail() {
		return email;
	}

	

	public void setEmail(String email) {
		this.email = email;
	}



	public Donor(String email, int adharno, String name, String sex, String address, String date, int contactNo,
			double weight, double height) {
		super();
		this.email = email;
		this.adharno = adharno;
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.date = date;
		this.contactNo = contactNo;
		this.weight = weight;
		this.height = height;
	}
	
	public int getAdharno() {
		return adharno;
	}
	public void setAdharno(int adharno) {
		this.adharno = adharno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String dob) {
		this.date = dob;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	

}
