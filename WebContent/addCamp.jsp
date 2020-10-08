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
<label>CampNo:</label>
<input type="text" name="campno">
<br>
<label>Address</label>
<input type="text" name="address">
<br>
<label>Doctor in charge</label>
<input type="text" name="doctor">
<br>
<label>Start date</label>
<input type="date" name="startdate">
<br>
<label>end date</label>
<input type="date" name="enddate">
<input type="hidden" value="addcamp" name="action">
<br>
<br>
<input type="submit" value="submit">
</form>

</body>
</html>