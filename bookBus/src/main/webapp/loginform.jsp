<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Form</h1>
	<%
		String user = (String) session.getAttribute("username");
		if (user != null) {
			out.println("Welcome" + user);
		} else {
	%>
	<form action="checkLogin.jsp">
		<table>
			<tr>
				<td>Username:</td>
				<td><input name="username"></td>
				<td>Password:</td>
				<td><input name="password"></td>
			</tr>
		</table>
		<input type="submit" value="Login">
			</form>
	<%
		}
	%>
</body>
</html>