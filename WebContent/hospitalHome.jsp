<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hospital Home Page</h1>
<a href="<%=request.getContextPath()%>/HospitalController?action=fillform">Fill Form</a>
<a href="<%=request.getContextPath()%>/HospitalController?action=order">order</a>
<a href="<%=request.getContextPath()%>/HospitalController?action=vieworder">view order</a>
</body>
</html>