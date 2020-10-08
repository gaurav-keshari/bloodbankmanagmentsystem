<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@ page import="java.util.List" %>
    <%@ page import="bloodbankcollegeproject.entity.BloodReport" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Blood Report </h1>
<%
List<BloodReport> c=(List<BloodReport>)request.getAttribute("report");
for(int i=0;i<c.size();i++)
{
	
out.print("<b>id: </b>"+c.get(i).getBagno());
out.print("  <b>blood group:: </b> "+c.get(i).getGroup());
out.print(" <b>haemoglobin:: </b> "+c.get(i).getHg());
out.print("<b> plasma:: </b> "+c.get(i).getPlasma());
out.print("  <b>platelets::  </b>"+c.get(i).getPlatelets());
out.print(" <b>rbc</b> "+c.get(i).getRbc());
out.print(" <b>wbc:: </b> "+c.get(i).getWbc());
out.print("  <b>expiry date::  </b>"+c.get(i).getEd());
out.print(" <b>disease</b> "+c.get(i).getDisease());
out.print(" <b>form no:: </b> "+c.get(i).getFormno());




out.print("<br>");
out.print("<hr>");
}
%>


</body>
</html>