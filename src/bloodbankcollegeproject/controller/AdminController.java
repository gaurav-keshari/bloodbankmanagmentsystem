package bloodbankcollegeproject.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bloodbankcollegeproject.entity.BloodReport;
import bloodbankcollegeproject.entity.Camp;
import bloodbankcollegeproject.entity.DonationForm;
import bloodbankcollegeproject.entity.Employee;
import bloodbankcollegeproject.model.BloodReportModel;
import bloodbankcollegeproject.model.CampModel;
import bloodbankcollegeproject.model.DonationFormModel;
import bloodbankcollegeproject.model.EmployeeModel;

@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		switch (action) {
		case "home":
			request.getRequestDispatcher("adminHome.jsp").forward(request, response);
			break;

		case "addEmp":
			request.getRequestDispatcher("addEmp.jsp").forward(request, response);
			break;
		case "viewEmp":
			List<Employee> emp = new ArrayList<>();
			emp = viewEmp(request, response);
			request.setAttribute("emp", emp);
			request.getRequestDispatcher("viewEmp.jsp").forward(request, response);
			break;
		case "addCamp":
			request.getRequestDispatcher("addCamp.jsp").forward(request, response);
			break;
		case "viewCamp":
			List<Camp> c = new ArrayList<>();
			c = viewCamp(request, response);
			request.setAttribute("camp", c);
			request.getRequestDispatcher("viewCamp.jsp").forward(request, response);
			break;
		case "viewdonationForm":
			List<DonationForm> df = new ArrayList<>();
			df = viewForm(request, response);
			request.setAttribute("form", df);
			request.getRequestDispatcher("viewDonationForm.jsp").forward(request, response);

		case "donationForm":
			System.out.println("donation form called");
			request.getRequestDispatcher("donationForm.jsp").forward(request, response);
			break;
		case "addbloodreport":
			request.getRequestDispatcher("bloodReport.jsp").forward(request, response);
			break;
		case "viewbloodreport":
			List<BloodReport> br = new ArrayList<>();
			br = viewReport(request, response);
			request.setAttribute("report", br);
			request.getRequestDispatcher("viewBloodReport.jsp").forward(request, response);
		}

	}

	private List<BloodReport> viewReport(HttpServletRequest request, HttpServletResponse response) {
		List<BloodReport> r = new ArrayList<>();
		r = new BloodReportModel().viewReport();
		return r;
	}

	private List<DonationForm> viewForm(HttpServletRequest request, HttpServletResponse response) {
		List<DonationForm> df = new ArrayList<>();
		df = new DonationFormModel().viewForm();
		return df;
	}

	private List<Camp> viewCamp(HttpServletRequest request, HttpServletResponse response) {
		List<Camp> c = new ArrayList<>();
		c = new CampModel().viewCamp();
		return c;

	}

	private List<Employee> viewEmp(HttpServletRequest request, HttpServletResponse response) {
		List<Employee> emp = new ArrayList<>();
		emp = new EmployeeModel().viewEmp();
		return emp;

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		switch (action) {

		case "formsubmit":
			String adharno = request.getParameter("adharno");
			String phoneNO = request.getParameter("phoneno");
			String salary = request.getParameter("salary");
			int sal = Integer.parseInt(salary);

			String name = request.getParameter("name");

			String ad = request.getParameter("address");
			String d = request.getParameter("date");
			System.out.println("date value is");
			System.out.println(d);
			int phone = Integer.parseInt(phoneNO);
			Employee employee = new Employee(adharno, name, sal, ad, phone, d);
			boolean bm = new EmployeeModel().empAdd(employee);
			System.out.println(bm);
			if (bm) {
				System.out.println("executed");
			} else {
				System.out.println(" not executed");

			}
			request.getRequestDispatcher("viewEmp.jsp").forward(request, response);
			break;
		case "addcamp":
			addCamp(request, response);
			request.getRequestDispatcher("viewCamp.jsp").forward(request, response);
			break;
		case "formdonation":
			boolean b = formDonation(request, response);
			if (b) {
				List<DonationForm> df = new ArrayList<>();
				df = viewForm(request, response);
				request.setAttribute("form", df);
				request.getRequestDispatcher("viewDonationForm.jsp").forward(request, response);

			}
			break;
		case "bloodreport":
			boolean bool = addBloodReport(request, response);
			System.out.println(bool);
			if (bool) {
				List<BloodReport> br = new ArrayList<>();
				br = viewReport(request, response);
				request.setAttribute("report", br);
				
				request.getRequestDispatcher("viewBloodReport.jsp");
			}
			break;
		}

	}

	private boolean addBloodReport(HttpServletRequest request, HttpServletResponse response) {

		String hg = request.getParameter("hg");
		String plasma = request.getParameter("plasma");
		String platelets = request.getParameter("platelets");
		String rbc = request.getParameter("rbc");
		String wbc = request.getParameter("wbc");
		String ed = request.getParameter("ed");
		String disease = request.getParameter("disease");
		String group = request.getParameter("group");
		int formno = Integer.parseInt(request.getParameter("fn"));
		BloodReport br = new BloodReport(group, hg, plasma, platelets, rbc, wbc, ed, disease, formno);
		boolean b = new BloodReportModel().addBlood(br);
		return b;

	}

	private boolean formDonation(HttpServletRequest request, HttpServletResponse response) {

		String date = request.getParameter("dod");
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		int cost = Integer.parseInt(request.getParameter("cost"));
		int di = Integer.parseInt(request.getParameter("di"));
		int ci = Integer.parseInt(request.getParameter("ci"));
		String disease = request.getParameter("disease");
		DonationForm df = new DonationForm(date, quantity, cost, di, ci, disease);
		boolean bm = new DonationFormModel().addForm(df);
		return bm;
	}

	private void addCamp(HttpServletRequest request, HttpServletResponse response) {
		String campno = request.getParameter("campno");

		int id = Integer.parseInt(campno);

		String ad = request.getParameter("address");
		String doc = request.getParameter("doctor");
		String ds = request.getParameter("startdate");
		String de = request.getParameter("enddate");
		Camp c = new Camp(id, ad, doc, ds, de);
		boolean bm = new CampModel().addCamp(c);
		if (bm) {
			System.out.println("executed");
		} else {
			System.out.println(" not executed");

		}

	}

}
