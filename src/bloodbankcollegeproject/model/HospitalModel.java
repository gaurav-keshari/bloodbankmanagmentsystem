package bloodbankcollegeproject.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bloodbankcollegeproject.entity.Donor;
import bloodbankcollegeproject.entity.Hospital;

public class HospitalModel {

	public boolean addHospital(Hospital hospital)
	{   String email=hospital.getEmail();
		int license=hospital.getLicense();
		String name=hospital.getName();
		String address=hospital.getAddress();
		
		int phone=hospital.getPhone();
		Connection con=null;
		PreparedStatement stmt1=null;
		PreparedStatement stmt2=null;
		String query="insert into hospital(license,name,address,phone,email) values (?,?,?,?,?)";
		String checkquery="select * from hospital_account where email=?";
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
		     con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/bloodbank_db","root","11223344");  
			
		     stmt1=con.prepareStatement(checkquery);
		     stmt1.setString(1,email);
			ResultSet rs=stmt1.executeQuery();  
			if(rs.next())
			{    System.out.println("entered");
				 stmt2=con.prepareStatement(query);
			     stmt2.setInt(1,license);
			     stmt2.setString(2,name);
			     stmt2.setString(3,address);
			     stmt2.setInt(4,phone);
			     stmt2.setString(5,email);
			    
				 stmt2.executeUpdate();  
				
				return true;
				
			}
			else {
				return false;
			    
			}
		
		
	
	} catch (Exception e) {
	
		e.printStackTrace();
	}
	
		return false;
		
	
}
	public Hospital viewHospital(String email)
	{
		Connection con=null;
		PreparedStatement stmt1=null;
		String checkquery="select * from hospital where email=?";
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
		     con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/bloodbank_db","root","11223344");  
			
		     stmt1=con.prepareStatement(checkquery);
		     stmt1.setString(1,email);
			ResultSet rs=stmt1.executeQuery();  
			if(rs.next())
			{    Hospital hospital=new Hospital(rs.getInt("license"));
				
				return hospital;
				
			}
			else {
				return null;
			    
			}
		
		
	
	} catch (Exception e) {
	
		e.printStackTrace();
	}
	
		
		
		return null;
	}
}
