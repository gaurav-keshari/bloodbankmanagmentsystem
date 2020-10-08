package bloodbankcollegeproject.entity;

public class DonationForm {

	int formno;
	public DonationForm(String dod, int quantity, int cost, int di, int ci, String diesease) {
		super();
		this.dod = dod;
		this.quantity = quantity;
		this.cost = cost;
		this.di = di;
		this.ci = ci;
		this.diesease = diesease;
	}
	String dod;
	int quantity;
	int cost;
	int di;
	int ci;
	String diesease;
	public int getFormno() {
		return formno;
	}
	public void setFormno(int formno) {
		this.formno = formno;
	}
	public String getDod() {
		return dod;
	}
	public void setDod(String dod) {
		this.dod = dod;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getDi() {
		return di;
	}
	public void setDi(int di) {
		this.di = di;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public String getDiesease() {
		return diesease;
	}
	public void setDiesease(String diesease) {
		this.diesease = diesease;
	}
	public DonationForm(int formno, String dod, int quantity, int cost, int di, int ci, String diesease) {
		super();
		this.formno = formno;
		this.dod = dod;
		this.quantity = quantity;
		this.cost = cost;
		this.di = di;
		this.ci = ci;
		this.diesease = diesease;
	}
	
	
	
}
