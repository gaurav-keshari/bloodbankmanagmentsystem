<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Donation Form of Donor</h1>
<form action="<%=request.getContextPath()%>/AdminController" method="post">

<label>Date of Donation</label>
<input type="date" name="dod">
<label>quantity</label>

<input type="text" name="quantity">
<br>
<label>cost Paid</label>
<input type="text" name="cost">
<br>

<br>
<label>Donor Id</label>
<input type="text" name="di">
<br>
<label>Camp Id</label>
<input type="text" name="ci">
<br>
<label>Any Disease</label>
<input type="text" name="disease">
<input type="hidden" value="formdonation" name="action">
<br>
<br>
<input type="submit" value="submit">
</form>
</body>
</html>