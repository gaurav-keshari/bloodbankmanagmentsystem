<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<form action="<%=request.getContextPath()%>/HospitalController" method="post">


<label>Blood type</label>
<input type="text" name="bloodtype">
<br>
<label>quantity</label>
<input type="date" name="quantity">
<br>

<input type="hidden" value="orderblood" name="action">
<br>
<br>
<input type="submit" value="submit">
</form>
</body>
</html>