package bloodbankcollegeproject.model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bloodbankcollegeproject.entity.Donor;

public class DonorModel {
	public boolean addDonor(Donor donor)
	{   String email=donor.getEmail();
		int id=donor.getAdharno();
		String name=donor.getName();
		String address=donor.getAddress();
		String sex=donor.getSex();
		String date=donor.getDate();
		double height=donor.getHeight();
		double weight=donor.getWeight();
		int phone=donor.getContactNo();
		Connection con=null;
		PreparedStatement stmt1=null;
		PreparedStatement stmt2=null;
		String query="insert into donor(email,id,name,address,sex,dob,height,weight,phone) values (?,?,?,?,?,?,?,?,?)";
		String checkquery="select * from donor_account where email=?";
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
			     stmt2.setString(1,email);
			     stmt2.setInt(2, id);
			     stmt2.setString(3,name);
			     stmt2.setString(4, address);
			     stmt2.setString(5, sex);
			     stmt2.setString(6, date);
			     stmt2.setDouble(7, height);
			     stmt2.setDouble(8, weight);
			     stmt2.setInt(9, phone);
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
	public Donor viewDonor(String email)
	{
		String checkquery="select * from donor where email=?";
		Connection con=null;
		PreparedStatement stmt1=null;
		
	Donor donor;
		
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
		     con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/bloodbank_db","root","11223344");  
			
		     stmt1=con.prepareStatement(checkquery);
		     stmt1.setString(1,email);
			ResultSet rs=stmt1.executeQuery(); 
			
			if(rs.next())
			{   System.out.println("value inserted fetch");
				donor=new Donor(rs.getString("email"),rs.getInt("id"),rs.getString("name"),rs.getString("sex"),rs.getString("address"),rs.getString("dob"),rs.getInt("phone"),rs.getDouble("height"),rs.getDouble("weight"));
				
				return donor;
				
			}
			
		
		
	
	} catch (Exception e) {
		System.out.println("some exception has occured");
	
		e.printStackTrace();
	}
		return null;
	}
	public boolean updateDonor(Donor donor) {
		
		String email=donor.getEmail();
		int id=donor.getAdharno();
		String name=donor.getName();
		String address=donor.getAddress();
		String sex=donor.getSex();
		String date=donor.getDate();
		double height=donor.getHeight();
		double weight=donor.getWeight();
		int phone=donor.getContactNo();
		Connection con=null;
		PreparedStatement stmt2=null;
		
	
		String query="update donor set name=?,address=?,height=?,weight=?,phone=? where id=?";
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
		     con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/bloodbank_db","root","11223344");  
			
		    stmt2=con.prepareStatement("query");
			
		
			   System.out.println("entered");
				 stmt2=con.prepareStatement(query);
			    
			    
			     stmt2.setString(1,name);
			     stmt2.setString(2, address);
			    
			    
			     stmt2.setDouble(3, height);
			     stmt2.setDouble(4, weight);
			     stmt2.setInt(5, phone);
			     stmt2.setInt(6,id);
				 stmt2.executeUpdate();
				
				return true;
				
			
		
		
	
	} catch (Exception e) {
	
		e.printStackTrace();
	}
	
		return false;
		
		
	}
}
