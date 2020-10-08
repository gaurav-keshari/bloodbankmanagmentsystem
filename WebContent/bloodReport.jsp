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
<label>Blood Group</label>
<input type="text" name="group">
<br>
<label>haemoglobin</label>
<input type="text" name="hg">
<label>plasma</label>

<input type="text" name="plasma">
<br>
<label>Platelets</label>
<input type="text" name="platelets">
<br>
<label>RBC</label>
<input type="text" name="rbc">
<br>
<label>WBC</label>
<input type="text" name="wbc">
<br>
<label>expiry date</label>
<input type="date" name="ed">
<br>
<label>disease in blood</label>
<input type="text" name="disease">
<br>
<label>form number</label>
<input type="text" name="fn">
<br>



<input type="hidden" value="bloodreport" name="action">
<br>
<br>
<input type="submit" value="submit">
</form>
</body>
</html>