 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@ page import="java.util.List" %>
    <%@ page import="bloodbankcollegeproject.entity.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>total employee is</h1>
<%
List<Employee> emp=(List)request.getAttribute("emp");
for(int i=0;i<emp.size();i++)
{
	
out.print("<b>id: </b>"+emp.get(i).getEmpId());
out.print("  <b>name:: </b> "+emp.get(i).getName());
out.print("<b>  address:: </b> "+emp.get(i).getAddress());
out.print("  <b>salary::  </b>"+emp.get(i).getSalary());
out.print(" <b> contact:: </b> "+emp.get(i).getContact());
out.print(" <b> dob:: </b>"+emp.get(i).getDob());
out.print("<br>");
out.print("<hr>");
}
%>


</body>
</html> 