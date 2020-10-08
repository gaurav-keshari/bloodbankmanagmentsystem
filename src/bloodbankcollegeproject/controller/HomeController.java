package bloodbankcollegeproject.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		switch(action)
		{   case "home":
		      request.getRequestDispatcher("index.jsp").forward(request,response);
		      break;
			case "donorlogin":
			loginDonor(request,response);
			break;
			case "donorsignup":
				signUpDonor(request,response);
				break;
			case "hospitalsignup":
				signupHospital(request,response);
				break;
			case "hospitalsignin":
				signinHospital(request,response);
				break;
				default:
			request.getRequestDispatcher("error.jsp").forward(request, response);
				
		}
	}

	
	


	private void signinHospital(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("signinHospital.jsp").forward(request, response);
		
	}





	private void signupHospital(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("signupHospital.jsp").forward(request, response);
		
	}





	private void signUpDonor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("signupDonor.jsp").forward(request,response);
		
	}
	

	private void loginDonor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("loginDonor.jsp").forward(request,response);
		
	}


	
}
