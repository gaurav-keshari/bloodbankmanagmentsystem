package bloodbankcollegeproject.controller;

import java.io.IOException;

import java.sql.Date;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import bloodbankcollegeproject.entity.Donor;
import bloodbankcollegeproject.model.DonorModel;

@WebServlet("/DonorController")
public class DonorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		switch(action)
		{
		case "donorhome":
			request.getRequestDispatcher("donorHome.jsp").forward(request,response);
			break;
		case "formsubmission":
			request.getRequestDispatcher("donorForm.jsp").forward(request, response);
			break;
		case "viewprofile":
			System.out.println("case in");
			Donor donor;
			donor=viewProfile(request,response);
			
			String temp="adharno="+donor.getAdharno()+"&name="+donor.getName()+"&address="+donor.getAddress()+"&date="+
					donor.getDate()+"&contact="+donor.getContactNo()+"&height="+donor.getHeight()+"&weight="+donor.getWeight()+"&height="+donor.getHeight();
			request.getRequestDispatcher("donorProfile.jsp?"+temp).forward(request, response);
			break;
		case "logout":
			request.getSession().invalidate();
			response.sendRedirect("index.jsp");
			break;
	default:
		request.getRequestDispatcher("error.jsp").forward(request, response);
		
		}
	}


	private Donor viewProfile(HttpServletRequest request, HttpServletResponse response) {
		String email=(String) request.getSession().getAttribute("email");
		
		DonorModel donorModel=new DonorModel();
		Donor donor=donorModel.viewDonor(email);
		return donor;
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		switch(action)
		{
		case "formsubmit":
			String adharno=request.getParameter("adharno");
			String phoneNO=request.getParameter("phoneno");
			String weight=request.getParameter("weight");
			String height=request.getParameter("height");
			String email=(String) request.getSession().getAttribute("email");
			int id=Integer.parseInt(adharno);
			String name=request.getParameter("name");
			String s=request.getParameter("sex");
			String ad=request.getParameter("address");
			String d=(request.getParameter("dob"));
			int phoneno=Integer.parseInt(phoneNO);
			double w=Double.parseDouble(weight);
			double h=Double.parseDouble(height);
			Donor donor=new Donor(email,id,name,s,ad,d,phoneno,w,h);
			
		   boolean dm=new DonorModel().addDonor(donor);
		   if(dm)
		   {
			   request.getRequestDispatcher("donorHome.jsp").forward(request, response);
		   }
		   else
		   {
			   
			   request.getRequestDispatcher("donorForm.jsp").forward(request, response);
		   }
			break;
		
		case "updateform":
			
			String adhar=request.getParameter("adharno");
			String phone=request.getParameter("phoneno");
			String wt=request.getParameter("weight");
			String ht=request.getParameter("height");
			String e=(String) request.getSession().getAttribute("email");
			int i=Integer.parseInt(adhar);
			String n=request.getParameter("name");
			String se=request.getParameter("sex");
			String ads=request.getParameter("address");
		String da=(request.getParameter("dob"));
			int ph=Integer.parseInt(phone);
			double wet=Double.parseDouble(wt);
			double hit=Double.parseDouble(ht);
			Donor don=new Donor(e,i,n,se,ads,da,ph,wet,hit);
			
		   boolean dme =new DonorModel().updateDonor(don);
		   if(dme)
		   {
			   request.getRequestDispatcher("donorHome.jsp").forward(request, response);
		   }
		   else
		   {
			   
			   request.getRequestDispatcher("error.jsp").forward(request, response);
		   }
			break;
		

			
	
			
		}
		
		
	}
	
	

}
