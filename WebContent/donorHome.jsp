<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Donor Home Page</h1>
<a href="<%=request.getContextPath()%>/DonorController?action=formsubmission">Fill Account Form</a>
<br>
<a href="<%=request.getContextPath()%>/DonorController?action=viewprofile">view profile and update profile</a>
<br>
<a href="<%=request.getContextPath()%>/DonorController?action=logout">logout</a>
</body>
</html>