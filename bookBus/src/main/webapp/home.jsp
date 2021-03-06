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
	href="homepage.css" />
<title>Home</title>
</head>
<script>
        function mydashboard(){
            window.location.href="dashboard.jsp"
        }
</script>
<body>
	<div id="for-height">
		<!--Top Heading and LOGO-->
		<div class="top_nav">
			<div class="logo">
				<img src="logo.png" style="width: inherit;" alt="LOGO">
			</div>



			<div class="heading">
				<h1>bookBUS</h1>
			</div>

			<!--Navigation Bar-->
			<div class="nav">
				<div class="contact">
					<img onclick="mydashboard()" src="contact.png" style="width: 85%;"
						alt="CONTACT">
					<!-- <a href="logout.lti" style="color: black">Logout</a> -->
					<a href="<c:url value='/logout.lti' />">Logout</a>
				</div>
				
			</div>
		</div>

		<div class="username">
			<h2>Hello  ${user.fname}</h2>
		</div>

		<div id="searchForm">
			<form action="search.lti" method="POST" style="padding: 37px;">
				<div class="fields">
					<label>From</label>
					
					 <select class="box" name="src">
						<c:forEach var="cs" items="${cities}">
						<option value=${cs.city}>${cs.city}</option>
						</c:forEach>
					</select>
				</div>
				<div class="fields">
					<label>To</label> 
					<select class="box" name="destination">
						<c:forEach var="cs" items="${cities}">
						<option value=${cs.city}>${cs.city}</option>
						</c:forEach>
					</select>
				</div>
				<div class="fields">
					<label>Date of Journey</label> <input type="date" class="date"
						name="date" />
					<%-- <fmt:formatDate value="${dateVar}" pattern="yyyy-mm-dd" /> --%>
				</div>
				<div class="fields">
					<button type="submit">Search</button>
				</div>
			</form>
		</div>
	</div>
	<footer>
	<p>&#169 2019 Book Bus , All rights reserved</p>
	<p>Privacy Policy</p>
	<p>
		<a href="FAQ'S"></a>FAQS
	</p>
	</footer>
</body>
</html>