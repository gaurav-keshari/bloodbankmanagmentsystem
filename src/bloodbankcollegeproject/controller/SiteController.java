package bloodbankcollegeproject.controller;



import java.io.IOException;
import java.sql.SQLException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bloodbankcollegeproject.entity.DonorAccount;
import bloodbankcollegeproject.entity.HospitalAccount;
import bloodbankcollegeproject.model.DonorAcModel;
import bloodbankcollegeproject.model.HospitalAcModel;


@WebServlet("/SiteController")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
     
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		
		switch(action)
		{
		case "donorloginsubmit":
			DonorAccount donorAccount=new DonorAccount(request.getParameter("email"),request.getParameter("password"));
			boolean b;
			try {
				b=loginDonor(donorAccount);
				if(b)
				{
					request.getSession().invalidate();
					HttpSession newSession=request.getSession(true);
					newSession.setMaxInactiveInterval(300);
					newSession.setAttribute("email",request.getParameter("email"));
					response.sendRedirect(request.getContextPath()+"/DonorController?action=donorhome");
					
				}
				else {
				request.getRequestDispatcher("loginDonorFail.jsp").forward(request, response);
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "donorsignupsubmit":
			DonorAccount donorAccount2=new DonorAccount(request.getParameter("email"),request.getParameter("password"));
			boolean check;
			try {
				check=signupDonor(donorAccount2);
				if(check)
				request.getRequestDispatcher("loginDonor.jsp").forward(request, response);
				else
					request.getRequestDispatcher("signupDonorFail.jsp").forward(request, response);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			break;
		case "adminlogin":
		
			loginAdmin(request,response);
			break;
		case "hospitalsignupsubmit":
			signupHospital(request,response);
			break;
		case "hospitalloginsubmit":
			signinHospital(request,response);
			request.getRequestDispatcher("hospitalHome.jsp").forward(request, response);
			break;
			default:
				request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

	private void signinHospital(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		HospitalAccount hospitalAccount=new HospitalAccount(request.getParameter("email"),request.getParameter("password"));
		boolean b;
		try {
			b=new HospitalAcModel().loginCheck(hospitalAccount);
			if(b)
			{
				request.getSession().invalidate();
				HttpSession newSession=request.getSession(true);
				newSession.setMaxInactiveInterval(300);
				newSession.setAttribute("email",request.getParameter("email"));
			System.out.println(b);
				
			}
			else {
			request.getRequestDispatcher("loginHospitalFail.jsp").forward(request, response);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	private void signupHospital(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HospitalAccount hospitalAccount=new HospitalAccount(request.getParameter("email"),request.getParameter("password"));
		boolean check;
		try {
			check=new HospitalAcModel().addHospitalAcModel(hospitalAccount);
			if(check)
			response.sendRedirect(request.getContextPath()+"/signinHospital.jsp");
			else
				request.getRequestDispatcher("signupHospitalFail.jsp").forward(request, response);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

	private void loginAdmin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		boolean b=(email.equals("gaurav@gmail.com"))&&(password.equals("1234"));
	
		if(b)
		{
			
			request.getSession().invalidate();
			HttpSession newSession=request.getSession(true);
			newSession.setMaxInactiveInterval(300);
			newSession.setAttribute("email",email);
		
			response.sendRedirect(request.getContextPath()+"/AdminController?action=home");
			
		}
		else {
		response.sendRedirect("admin.jsp");
		}
		
	}

	private boolean signupDonor(DonorAccount donorAccount) throws SQLException {
		DonorAcModel donorAcModel=new DonorAcModel();
		boolean check;
		check=donorAcModel.addDonorAcModel(donorAccount);
		if(check)
		{return true;
		}
		else
		{
			return false;
		}
		
	}

	private boolean loginDonor(DonorAccount donorAccount) throws SQLException {
		boolean b=new DonorAcModel().loginCheck(donorAccount);
		return b;
		
	}

}
