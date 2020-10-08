<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/SiteController"
		method="post">
		<label>email:</label> <input type="email" required name="email">
		<label>password:</label> <input type="password" required
			name="password"> <input type="hidden"
			value="donorsignupsubmit" name="action"> <input type="submit"
			value="sign up">


	</form>
</body>
</html>