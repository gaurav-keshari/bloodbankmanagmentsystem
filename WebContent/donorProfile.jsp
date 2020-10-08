<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

adharno:<%=request.getParameter("adharno")%>
<form action="<%=request.getContextPath()%>/DonorController" method="post">

<input type="hidden" name="adharno" value="<%=request.getParameter("adharno") %>">
<br>
<label>Name:</label>
<input type="text" name="name" value="<%=request.getParameter("name")%>">


<input type="radio"  name="sex" value="male" style="display:none">

<input type="radio" name="sex" value="female" style="display:none">
<br>
<label>Address</label>
<input type="text" name="address" value="<%=request.getParameter("address")%>">
<br>
<label>Date of Birth:</label>
<%=request.getParameter("date")%>
<br>
<label>contact no:</label>
<input type="text" name="phoneno" value="<%=request.getParameter("contact")%>">
<br>
<label>weight</label>
<input type="text" name="weight" value="<%=request.getParameter("weight")%>">(in kg)
<br>
<label>height</label>
<input type="text" name="height" value="<%=request.getParameter("height")%>">(in cm)
<input type="hidden" value="updateform" name="action">
<br>
<br>
<input type="submit" value="submit">
</form>

</body>
</html>