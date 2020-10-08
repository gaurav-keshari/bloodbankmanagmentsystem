package bloodbankcollegeproject.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bloodbankcollegeproject.entity.Hospital;
import bloodbankcollegeproject.entity.OrderBlood;
import bloodbankcollegeproject.model.HospitalModel;
import bloodbankcollegeproject.model.OrderBloodModel;


@WebServlet("/HospitalController")
public class HospitalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		switch(action) {
		case "hospitalhome":
			request.getRequestDispatcher("hospitalHome.jsp").forward(request, response);
			break;
		case "fillform":
			request.getRequestDispatcher("hospitalForm.jsp").forward(request, response);
			break;
		case "order":
			request.getRequestDispatcher("order.jsp").forward(request, response);
			break;
		case "vieworder":
			request.getRequestDispatcher("vieworder.jsp").forward(request, response);
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		switch(action)
		{
		case "formsubmit":
			formSubmit(request,response);
			break;
		case "orderblood":
			orderBlood(request,response);
		}
	}

	private void orderBlood(HttpServletRequest request, HttpServletResponse response) {
		String bloodtype=request.getParameter("bloodtype");
		String quantity=request.getParameter("quantity");
		String email=(String) request.getSession().getAttribute("email");
		Hospital hospital=new HospitalModel().viewHospital(email);
		int licenseno=hospital.getLicense();
		OrderBlood ob=new OrderBlood(bloodtype,quantity,licenseno);
		boolean b=new OrderBloodModel().addOrder(ob);
		
	}
	
	

	private void formSubmit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email=(String) request.getSession().getAttribute("email");
	int license=Integer.parseInt(request.getParameter("license"));
	String name=request.getParameter("name");
	int phone=Integer.parseInt(request.getParameter("phoneno"));
	String address=request.getParameter("address");
	Hospital hospital=new Hospital(license,name,address,phone,email);
	boolean bm=new HospitalModel().addHospital(hospital);
	if(bm)
	{
		request.getRequestDispatcher("viewHospital.jsp").forward(request, response);
	}
		
	}

}
