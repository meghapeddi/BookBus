<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import = "java.io.*,java.util.*, java.sql.*" %>
<%@ page import = "javax.servlet.http.*, javax.servlet.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen"
	href="addstops.css" />
<script src="admin.js"></script>
<title>Add Stops</title>
</head>
<body>
	<!--Top Heading and LOGO-->
	<div class="top_nav">
		<div class="logo">
			<img class="dropbtn" src="logo.png" style="width: inherit;"
				alt="LOGO">
		</div>


		<!--Heading-->
		<div class="heading">
			<h1>bookBUS</h1>
		</div>

<!-- 		<!--Navigation Bar--> 
<!-- 		<div class="nav"> -->
<!-- 			<ul> -->
<!-- 				<li><a href="#home">Freq Routes</a></li> -->
<!-- 				<li><a href="#news">Profits</a></li> -->
<!-- 				<li><a href="#contact">Preferred Buses</a></li> -->
<!-- 				<li><a href="#about">Reservation Details</a></li> -->
<!-- 			</ul> -->
<!-- 		</div> -->

		<div class="contact_icon">
			<div class="dropdown">
				<img src="contact.png" style="width: 80%;" alt="CONTACT">
				<a href="<c:url value='/adminLogout.lti' />">Logout</a>
			</div>
		</div>
	</div>

	<div class="side_nav">
		<ul>
			<li><a href="addbusdetails.jsp">Add Bus Details</a></li>

			<li><a class="active" href="addstops.jsp">Add Stops</a></li>

		</ul>

	</div>

	<!--Container Design for the Admin form-->
	<div class="container">

		<h3>Administrator</h3>
		<h4>Add Stops</h4>

		<form name="adminForm" action="addStops.lti" method="POST">

			<label>City:</label> <select style="width: 23.5%;" name = "city">
				<c:forEach var="cs" items="${cities}">
					<option value= ${ cs.city }>${cs.city}</option>
				</c:forEach>
			</select> <br> <input type="text" placeholder="Stop Name" name="stopName"
				required> <br>

			<button type="submit">Add Stops</button>
		</form>	
	</div>


	<!--Footer of the Page-->
	<footer>
	<p>Copyright @LTI</p>
	</footer>
</body>
</html>