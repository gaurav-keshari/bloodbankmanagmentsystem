<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Admin Home Page</h1>
<a href="<%=request.getContextPath()%>/AdminController?action=addEmp">Add Employee</a>
<br><br>
<a href="<%=request.getContextPath()%>/AdminController?action=viewEmp">View Employee</a>
<br><br>
<a href="<%=request.getContextPath()%>/AdminController?action=addCamp">add camp</a>
<br><br>
<a href="<%=request.getContextPath()%>/AdminController?action=viewCamp">view Camp</a>
<br><br>
<a href="<%=request.getContextPath()%>/AdminController?action=donationForm">Fill Account Form</a>
<br><br>
<a href="<%=request.getContextPath()%>/AdminController?action=viewdonationForm">view donation form</a>
<br><br>
<a href="<%=request.getContextPath()%>/AdminController?action=addbloodreport">add blood report</a>
<br><br>
<a href="<%=request.getContextPath()%>/AdminController?action=viewbloodreport">view blood report</a>
<br><br>
<a href="<%=request.getContextPath()%>/AdminController?action=logout">logout</a>
</body>
</html>