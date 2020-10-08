package bloodbankcollegeproject.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bloodbankcollegeproject.entity.DonationForm;
import bloodbankcollegeproject.entity.Employee;

public class DonationFormModel {

	
	public boolean addForm(DonationForm df)
	{
		
		String dod=df.getDod();
		int quantity=df.getQuantity();
		int cost=df.getCost();
		int di=df.getDi();
		int ci=df.getCi();
		String disease=df.getDiesease();
        Connection con=null;
		
		PreparedStatement stmt2=null;
		String query="insert into donationform(dod,quantity,cost,di,ci,disease) values (?,?,?,?,?,?)";
	
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
		     con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/bloodbank_db","root","11223344");  
			
		    
			
			
				 stmt2=con.prepareStatement(query);
			    
			    
			     stmt2.setString(1,dod);
			     stmt2.setInt(2,quantity);
			     stmt2.setInt(3,cost);
			     stmt2.setInt(4,di);
			     stmt2.setInt(5, ci);
			     stmt2.setString(6,disease);
			   
				 stmt2.executeUpdate();  
				
				return true;
				
			
			
		
		
	
	} catch (Exception e) {
	
		e.printStackTrace();
	}
	
		return false;
		
	}
	public List<DonationForm> viewForm() {
		String query="select * from donationform";
		Connection con=null;
		
		Statement stmt2=null;
		ResultSet rs;
		List<DonationForm> form=new ArrayList<>();
		
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
		     con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/bloodbank_db","root","11223344");  
			
		    
		
				 stmt2=con.createStatement();
			  
			   
				 rs=stmt2.executeQuery(query);
				
				while(rs.next())
				{	
					form.add(new DonationForm(rs.getInt("formno"),rs.getString("dod"),rs.getInt("quantity"),rs.getInt("cost"),rs.getInt("di"),rs.getInt("ci"),rs.getString("disease")));
					System.out.print("donor added last");
				}
			
			    return form;
			
		
		

	} catch (Exception e) {

		e.printStackTrace();
	}

		return null;
		
	}

	
}
