 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@ page import="java.util.List" %>
    <%@ page import="bloodbankcollegeproject.entity.Camp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>total camp is</h1>
<%
List<Camp> c=(List)request.getAttribute("camp");
for(int i=0;i<c.size();i++)
{
	
out.print("<b>id: </b>"+c.get(i).getCampno());
out.print("  <b>address:: </b> "+c.get(i).getAddress());
out.print("<b>  doctor:: </b> "+c.get(i).getDoctor());
out.print("  <b>start date::  </b>"+c.get(i).getStartDate());
out.print(" <b> end date:: </b> "+c.get(i).getEndDate());

out.print("<br>");
out.print("<hr>");
}
%>


</body>
</html> 