package bloodbankcollegeproject.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import bloodbankcollegeproject.entity.DonorAccount;


public class DonorAcModel {

	

	public boolean addDonorAcModel(DonorAccount donorAccount) throws SQLException {
		String email=donorAccount.getEmail();
		String password=donorAccount.getPassword();
		Connection con=null;
		PreparedStatement stmt1=null;
		PreparedStatement stmt2=null;
		String query="insert into donor_account(email,password) values (?,?)";
		String checkquery="select * from donor_account where email=?";
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
		     con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/bloodbank_db","root","11223344");  
			
		     stmt1=con.prepareStatement(checkquery);
		     stmt1.setString(1,email);
			ResultSet rs=stmt1.executeQuery();  
			if(rs.next())
			{
				
				return false;
			}
			else {
				
			     stmt2=con.prepareStatement(query);
			     stmt2.setString(1,email);
			     stmt2.setString(2,password);
				 stmt2.executeUpdate();  
				
				return true;
			}
		
		
	
	} catch (Exception e) {
	
		e.printStackTrace();
	}
	finally {
		stmt1.close();
	}
		return false;
	}
	public boolean loginCheck(DonorAccount donorAccount) throws SQLException
	{
	String email=donorAccount.getEmail();
	String password=donorAccount.getPassword();
	Connection con=null;
	PreparedStatement stmt=null;
	
	
	String checkquery="select * from donor_account where email=? and password=?";
	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
	     con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/bloodbank_db","root","11223344");  
		
	     stmt=con.prepareStatement(checkquery);
	     stmt.setString(1,email);
	     stmt.setString(2,password);
		ResultSet rs=stmt.executeQuery();  
		if(rs.next())
		{
			
			return true;
		}
		else {
			
		   return false;
		}
	
	

} catch (Exception e) {

	e.printStackTrace();
}
finally {
	stmt.close();
}
	return false;
}
}

