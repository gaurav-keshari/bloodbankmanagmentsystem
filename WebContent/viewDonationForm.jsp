<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@ page import="java.util.List" %>
    <%@ page import="bloodbankcollegeproject.entity.DonationForm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> donation form details</h1>
<%
List<DonationForm> c=(List<DonationForm>)request.getAttribute("form");
for(int i=0;i<c.size();i++)
{
	
out.print("<b>id: </b>"+c.get(i).getFormno());
out.print("  <b>date of donation:: </b> "+c.get(i).getDod());
out.print(" <b>cost paid:: </b> "+c.get(i).getCost());
out.print("<b>  quantity:: </b> "+c.get(i).getQuantity());
out.print("  <b>donor id::  </b>"+c.get(i).getDi());
out.print(" <b>camp id:: </b> "+c.get(i).getCi());
out.print(" <b>disease:: </b> "+c.get(i).getDiesease());


out.print("<br>");
out.print("<hr>");
}
%>
</body>
</html>