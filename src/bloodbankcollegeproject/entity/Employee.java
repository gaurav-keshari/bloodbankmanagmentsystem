package bloodbankcollegeproject.entity;



public class Employee {

	
	private String empId;
	private String name;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", contact=" + contact + ", dob=" + dob + "]";
	}
	private int salary;
	private String address;
	private int contact;
	private String dob;
	public String getEmpId() {
		return empId;
	}
	public Employee(String empId, String name, int salary, String address, int contact ,String dob) {
	
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.contact = contact;
		this.dob=dob;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	
	
	
	
	
	
	
	
	
}
