package bloodbankcollegeproject.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bloodbankcollegeproject.entity.OrderBlood;

public class OrderBloodModel {

	public boolean addOrder(OrderBlood ob)
	{
		
		int license=ob.getLicenseno();
		String bloodtype=ob.getBloodtype();
		String quantity=ob.getQuantity();
		
		
		Connection con=null;
		PreparedStatement stmt1=null;
		
		String query="insert into orderblood(licenseno,bloodtype,quantity) values (?,?,?)";
		
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
		     con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/bloodbank_db","root","11223344");  
			
		     stmt1=con.prepareStatement(query);
		     stmt1.setInt(1,license);
		     stmt1.setString(2,bloodtype);
		     stmt1.setString(3,quantity);
			stmt1.executeUpdate();
			
				
				return true;
				
			}
			
		
		
	
	 catch (Exception e) {
	
		e.printStackTrace();
	}
	
		return false;
		
		
		
	}
}
