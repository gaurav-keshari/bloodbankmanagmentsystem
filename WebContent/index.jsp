<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
*
{background-color:red;
}

</style>
<title>Insert title here</title>
</head>
<body>
	<h1>Blood bank managment system</h1>
	<ul>
		<li><a
			href="<%=request.getContextPath()%>/HomeController?action=home">Home</a></li>
		<li><a
			href="<%=request.getContextPath()%>/HomeController?action=donorlogin">DonorLogin</a></li>
		<li><a
			href="<%=request.getContextPath()%>/HomeController?action=donorsignup">DonorSignUp</a></li>
			<li><a
			href="<%=request.getContextPath()%>/HomeController?action=hospitalsignup">Hospital SignUp</a></li>
			
			<li><a
			href="<%=request.getContextPath()%>/HomeController?action=hospitalsignin">Hospital sign in</a></li>
			

	</ul>
</body>
</html>