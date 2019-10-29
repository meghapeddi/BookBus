<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*, java.sql.*"%>
<%@ page import="javax.servlet.http.*, javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen" href="search.css" />
<title>Search</title>
</head>
<body>
<body>
	<div class="top_nav">
		<div class="logo">
			<img src="logo.png" style="width: inherit;" alt="LOGO">
		</div>
		<div class="contact_icon">
			<img src="contact.png" style="width: 80%;" alt="CONTACT"> 
			<a href="<c:url value='/logout.lti' />">Logout</a>
		</div>
		<div class="heading">
			<h1>bookBUS</h1>
		</div>
	</div>


	<!--Search Functionality-->


	<div class="search_cont">
		<div class="source_date">
			<label> Onward Journey</label><br>
			<div class="source">
				<span>${src}</span>
			</div>

			<div class="arrow">
				<img class="arrow_img" src="arrow.png" alt="">
			</div>

			<div class="dest">
				<span>${destination}</span>
			</div>


			<i onclick="" class="left"></i> <span class="date">30 OCT</span> <i
				onclick="" class="right"></i>

		</div>

	</div>

	<!--Sort Functionality-->

	<div class="sort_cont">
		<label>Sort By:</label><br> <a href="">Fare</a>

		<div class="ammenities">
			<h3
				style="font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; color: rgb(145, 142, 142);">Ammenities</h3>
			<div class="ammen">
				<span>WIFI</span>
			</div>
			<div class="ammen">
				<span>Water Bottle</span>
			</div>
			<div class="ammen">
				<span>Blankets</span>
			</div>
			<div class="ammen">
				<span>Charging Point</span>
			</div>
			<div class="ammen">
				<span>Movie</span>
			</div>
			<div class="ammen">
				<span>Emergency Assist</span>
			</div>
		</div>
	</div>

	<form action="sendBusNo.lti" method="POST">
		<c:forEach var="buses" items="${bus}">
			<div class="bus_detail">
				<div class="bus_card">
					<span id="busname">${buses.busName}</span><br> <span
						style="font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; font-size: 16px; color: darkgrey;">Type:</span>
					<p id="type">${buses.type}</p>
				</div>

				<div class="ac"></div>
				<div class="time">
					<span
						style="font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; font-size: 18px; color: gray;">Departure</span><br>
					${buses.departureTime}
				</div>

				<div class="time">
					<span
						style="font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; font-size: 18px; color: gray;">Arrival</span><br>
					${buses.arrivalTime}
				</div>
				<div class="sourcestops">
					<span
						style="font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; font-size: 16px; color: gray;">Board
						Point</span><br> <select name="src_stps" id="">
						<c:forEach var="srcStops" items="${srcList}">
							<option value="${srcStops.stopName}">${srcStops.stopName}</option>
						</c:forEach>
					</select>
				</div>
				<div class="deststops">
					<span
						style="font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; font-size: 16px; color: gray;">Drop
						Point</span><br> <select name="dest_stps" id="">
						<c:forEach var="destStops" items="${destList}">
							<option value="${destStops.stopName}">${destStops.stopName}</option>
						</c:forEach>
					</select>
				</div>

				<div class="avail_stops">
					<span style="font-size: 18px; color: gray;">Available Seats</span>
					<p style="margin: 8px 52px;">${buses.seatsAvailable.availableSeats}</p>
				</div>


				<div class="seatbtn">
					<button name="busNo" value=${buses.busNo }
						onclick="location.href='noOfSeats.jsp'">View Seats</button>

				</div>

			</div>
		</c:forEach>
	</form>

	<footer>
	<p>Copyright @LTI</p>
	</footer>
</body>
</html>