<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>fill hospital details</h2>
<form action="<%=request.getContextPath()%>/HospitalController" method="post">
<label>LicenseNo:</label>
<input type="text" name="license">
<br>
<label>Name:</label>
<input type="text" name="name">

<label>Address</label>
<input type="text" name="address">
<br>

<label>contact no:</label>
<input type="text" name="phoneno">
<br>



<input type="hidden" value="formsubmit" name="action">
<br>
<br>
<input type="submit" value="submit">
</form>
</body>
</html>