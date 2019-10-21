<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" type="text/css" media="screen" href="main.css" />
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form action="addStops.lti" method = "post">
			<h2>Add stops</h2>
			<input type="text" name = "city" placeholder="city" /> 
			<input type="text" name = "stopName" placeholder="stopname" />
			<button type = "submit">Add</button>
		</form>
</body>
</html>