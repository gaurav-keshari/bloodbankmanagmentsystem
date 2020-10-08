package bloodbankcollegeproject.model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bloodbankcollegeproject.entity.Camp;
import bloodbankcollegeproject.entity.Employee;


public class CampModel {

	public boolean addCamp(Camp camp)
	{   int campno=camp.getCampno();
	String address=camp.getAddress();
	String doctor=camp.getDoctor();
	String sd=camp.getStartDate();
	String ed=camp.getEndDate();
		Connection con=null;
		
		PreparedStatement stmt2=null;
		String query="insert into camp(id,address,doctor,startdate,enddate) values (?,?,?,?,?)";
	
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
		     con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/bloodbank_db","root","11223344");  
			
		    
			
			
				 stmt2=con.prepareStatement(query);
			     stmt2.setInt(1,campno);
			    
			     stmt2.setString(2,address);
			     stmt2.setString(3,doctor);
			     stmt2.setString(4,sd);
			     stmt2.setString(5,ed);
			   
				 stmt2.executeUpdate();  
				
				return true;
				
			
			
		
		
	
	} catch (Exception e) {
	
		e.printStackTrace();
	}
	
		return false;
		
		
	}
	
	public List<Camp> viewCamp() {
		String query="select * from camp";
		Connection con=null;
		
		Statement stmt2=null;
		ResultSet rs;
		List<Camp> camp=new ArrayList<>();
		
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
		     con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/bloodbank_db","root","11223344");  
			
		    
		
				 stmt2=con.createStatement();
			  
			   
				 rs=stmt2.executeQuery(query);
				
				while(rs.next())
				{	
					camp.add(new Camp(rs.getInt("id"),rs.getString("address"),rs.getString("doctor"),rs.getString("startdate"),rs.getString("enddate")));
					
				}
			
			    return camp;
			
		
		

	} catch (Exception e) {

		e.printStackTrace();
	}

		return null;
		
	}

	
	
	
	
	
	
	
}
