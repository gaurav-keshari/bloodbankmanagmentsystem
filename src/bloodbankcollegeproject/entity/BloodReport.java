package bloodbankcollegeproject.entity;

public class BloodReport {
private int bagno;
private String group;
private String hg;
private String plasma;
private String platelets;
public String getPlatelets() {
	return platelets;
}
public void setPlatelets(String platelets) {
	this.platelets = platelets;
}
private String rbc;
private String wbc;
private String ed;
private String disease;
private int formno;


public String getGroup() {
	return group;
}
public void setGroup(String group) {
	this.group = group;
}







public BloodReport(String group, String hg, String plasma, String platelets, String rbc, String wbc, String ed,
		String disease, int formno) {
	
	this.group = group;
	this.hg = hg;
	this.plasma = plasma;
	this.platelets = platelets;
	this.rbc = rbc;
	this.wbc = wbc;
	this.ed = ed;
	this.disease = disease;
	this.formno = formno;
}
public BloodReport(int bagno, String group, String hg, String plasma, String platelets, String rbc, String wbc,
		String ed, String disease, int formno) {
	
	this.bagno = bagno;
	this.group = group;
	this.hg = hg;
	this.plasma = plasma;
	this.platelets = platelets;
	this.rbc = rbc;
	this.wbc = wbc;
	this.ed = ed;
	this.disease = disease;
	this.formno = formno;
}
public int getBagno() {
	return bagno;
}
public void setBagno(int bagno) {
	this.bagno = bagno;
}
public String getHg() {
	return hg;
}
public void setHg(String hg) {
	this.hg = hg;
}
public String getPlasma() {
	return plasma;
}
public void setPlasma(String plasma) {
	this.plasma = plasma;
}
public String getRbc() {
	return rbc;
}
public void setRbc(String rbc) {
	this.rbc = rbc;
}
public String getWbc() {
	return wbc;
}
public void setWbc(String wbc) {
	this.wbc = wbc;
}
public String getEd() {
	return ed;
}
public void setEd(String ed) {
	this.ed = ed;
}
public String getDisease() {
	return disease;
}
public void setDisease(String disease) {
	this.disease = disease;
}
public int getFormno() {
	return formno;
}
public void setFormno(int formno) {
	this.formno = formno;
}


}
