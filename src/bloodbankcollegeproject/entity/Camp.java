package bloodbankcollegeproject.entity;

public class Camp {

	private int campno;
	private String address;
	private String doctor;
	private String startDate;
	
	private String endDate;

	public int getCampno() {
		return campno;
	}

	public void setCampno(int campno) {
		this.campno = campno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Camp(int campno, String address, String doctor, String startDate, String endDate) {
		super();
		this.campno = campno;
		this.address = address;
		this.doctor = doctor;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	
	
	
}
