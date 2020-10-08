package bloodbankcollegeproject.model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;

import bloodbankcollegeproject.entity.Employee;

public class EmployeeModel {
public boolean empAdd(Employee emp)
{
	  
			String id=emp.getEmpId();
			String name=emp.getName();
			String address=emp.getAddress();
		    int salary=emp.getSalary();
		    int contact=emp.getContact();
		  
			String date=emp.getDob();
			System.out.println("inside model");
			System.out.println(date);
		
			
			Connection con=null;
			
			PreparedStatement stmt2=null;
			String query="insert into employee(id,name,salary,address,contact,dob) values (?,?,?,?,?,?)";
			
			try{  
				Class.forName("com.mysql.cj.jdbc.Driver");  
			     con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/bloodbank_db","root","11223344");  
				
			    
			
					 stmt2=con.prepareStatement(query);
				     
				     stmt2.setString(1, id);
				     stmt2.setString(2,name);
				     stmt2.setInt(3, salary);
				     stmt2.setString(4, address);
				    stmt2.setInt(5,contact);
				    stmt2.setString(6,date);
					 stmt2.executeUpdate();  
					
					return true;
					
				
				    
				
			
			
		
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
			return false;
			
}

public List<Employee> viewEmp() {
	String query="select * from employee";
	Connection con=null;
	
	Statement stmt2=null;
	ResultSet rs;
	List<Employee> emp=new ArrayList<>();
	
	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
	     con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/bloodbank_db","root","11223344");  
		
	    
	
			 stmt2=con.createStatement();
		  
		   
			 rs=stmt2.executeQuery(query);
			
			while(rs.next())
			{	System.out.print("emp added 1");
				emp.add(new Employee(rs.getString("id"),rs.getString("name"),rs.getInt("salary"),rs.getString("address"),rs.getInt("contact"),rs.getString("dob")));
				System.out.print("emp added last");
			}
		
		    return emp;
		
	
	

} catch (Exception e) {

	e.printStackTrace();
}

	return null;
	
}


}
