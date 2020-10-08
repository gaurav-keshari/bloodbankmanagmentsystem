package bloodbankcollegeproject.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bloodbankcollegeproject.entity.BloodReport;
import bloodbankcollegeproject.entity.Camp;
import bloodbankcollegeproject.entity.Donor;


public class BloodReportModel {
public boolean addBlood(BloodReport br)
{
	
String group=br.getGroup();
String hg=br.getHg();
String plasma=br.getPlasma();
String platelets=br.getPlatelets();
String rbc=br.getRbc();
String wbc=br.getWbc();
String ed=br.getEd();
String disease=br.getDisease();
int formno=br.getFormno();
		Connection con=null;
		
		PreparedStatement stmt2=null;
		String query="insert into bloodreport(hg,plasma,platelets,rbc,wbc,ed,disease,bg,formno) values (?,?,?,?,?,?,?,?,?)";
	
		try{ 
			
			Class.forName("com.mysql.cj.jdbc.Driver");  
		     con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/bloodbank_db","root","11223344");  
			
		       
			
			   
				 stmt2=con.prepareStatement(query);
				
			     stmt2.setString(1,hg);
			     stmt2.setString(2,plasma);
			     stmt2.setString(3,platelets);
			     stmt2.setString(4,rbc);
			     stmt2.setString(5,wbc);
			     stmt2.setString(6,ed);
			     stmt2.setString(7,disease);
			     stmt2.setString(8, group);
			     stmt2.setInt(9,formno);
			    
			   
			     
				 stmt2.executeUpdate();  
				
				return true;
				
			
			
		
		
	
	} catch (Exception e) {
	
		e.printStackTrace();
	}
	
		
	
	
	
	
	return false;
	

	
}

public List<BloodReport> viewReport() {
	String query="select * from bloodreport";
	Connection con=null;
	
	Statement stmt2=null;
	ResultSet rs;
	List<BloodReport> report=new ArrayList<>();
	
	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
	     con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/bloodbank_db","root","11223344");  
		
	    
	
			 stmt2=con.createStatement();
		  
		   
			 rs=stmt2.executeQuery(query);
			
			while(rs.next())
			{	
				report.add(new BloodReport(rs.getInt("bagno"),rs.getString("bg"),rs.getString("hg"),rs.getString("plasma"),rs.getString("platelets"),rs.getString("rbc"),rs.getString("wbc"),rs.getString("ed"),rs.getString("disease"),rs.getInt("formno")));
				
			}
		
		    return report;
		
	
	

} catch (Exception e) {

	e.printStackTrace();
}

	return null;
	
}
}
