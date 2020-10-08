<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="<%=request.getContextPath()%>/AdminController" method="post">
<label>AdharNo:</label>
<input type="text" name="adharno">
<br>
<label>Name:</label>
<input type="text" name="name">
<label>sex:</label>
<label>male</label>
<input type="radio" name="sex" value="male">
<label>female</label>
<input type="radio" name="sex" value="female">
<label>salary</label>
<input type="text" name="salary">
<label>Address</label>
<input type="text" name="address">
<br>
<label>Date of Birth</label>
<input type="date" name="date">
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