<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>login admin page</h1>
<form action="<%=request.getContextPath()%>/SiteController"
		method="post">
		<label>email:</label> <input type="email" required name="email">
		<label>password:</label> <input type="password" required
			name="password"> <input type="hidden"
			value="adminlogin" name="action"> <input type="submit"
			value="sign IN">

	</form>
</body>
</html>