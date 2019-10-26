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
<link rel="stylesheet" type="text/css" media="screen" href="search.css" />
<title>Search</title>
</head>
<body>
	<div class="top_nav">
		<div class="logo">
			<img src="logo.png" style="width: inherit;" alt="LOGO">
		</div>
		<div class="contact_icon">
			<img src="contact.png" style="width: 80%;" alt="CONTACT"> <a
				href="home.html" style="color: black">Logout</a>
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
				<span> Mumbai (All Locations)</span>
			</div>

			<div class="arrow">
				<img class="arrow_img" src="arrow.png" alt="">
			</div>

			<div class="dest">
				<span> Pune, Swargate </span>
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

	 	<form action="search.lti" method="POST">
	<%-- 		<c:forEach var="buses" items="${ bus }"> --%>
	<%-- 		<p>${ buses.busName }</p> --%>
	<!-- 		<div class="bus_detail"> -->
	<!-- 			<div class="bus_card"> -->
	<%-- 				<span id=	"busname">${ buses.busName }</span><br> --%>
	<%-- 				<p id="type">${ busDetails.type }</p> --%>
	<!-- 			</div> -->

	<!-- 			<div class="ac"></div> -->
	<%-- 			<div class="time">${ busDetails.departureTime }</div> --%>
	<%-- 			<div class="time">${ busDetails.arrivalTime }</div> --%>
	<!-- 			<div class="sourcestops"> -->
	<!-- 				<select name="src_stps" id=""> -->
	<%-- 				<c:forEach var="srcStops" items="${ srcList }"> --%>
	<%-- 					<option value="${ srcList.stopName }">${ srcList.stopName }</option> --%>
	<%-- 				</c:forEach> --%>
	<!-- 				</select> -->
	<!-- 			</div> -->
	<!-- 			<div class="deststops"> -->
	<!-- 				<select name="dest_stps" id=""> -->
	<%-- 					<c:forEach var="destStops" items="${ destList }"> --%>
	<%-- 					<option value="${ destList.stopName }">${ destList.stopName }</option> --%>
	<%-- 					</c:forEach> --%>
	<!-- 				</select> -->
	<!-- 			</div> -->

	<!-- 			<div class="seatsnum" -->
	<!-- 				style="width: 6%; display: inline-block; float: left; margin: 41px -33px;"> -->
	<%-- 				<label>Seats:</label> <span>${ busDetails.SeatsAvailable.availableSeats }</span> --%>
	<!-- 			</div> -->

	<!-- 			<div class="seatbtn"> -->
	<!-- 				<button onclick="">View Seats</button> -->
	<!-- 			</div> -->
	<!-- 		</div> -->
	<%-- 		</c:forEach> --%>
	<!-- 	</form> -->


	<table border="1">
		<thead>
			<tr>
				<th>Bus no</th>
				<th>Bus name</th>
				<th>Source</th>
				<th>Destination</th>
				<th>Type</th>
				<th>Fare</th>
				<th>Arrival Time</th>
				<th>Departure Time</th>
				<th>Time of travel</th>
				<th>Source Stops</th>
				<th>Destination Stops</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="data" items="${bus}">
				<tr>
					<td>${data.busNo}</td>
					<td>${data.busName}</td>
					<td>${data.src}</td>
					<td>${data.destination}</td>
					<td>${data.type}</td>
					<td>${data.fare}</td>
					<td>${data.departureTime}</td>
					<td>${data.arrivalTime}</td>
					<td>${data.travelTime}</td>
					<td><select name="src_stps" id="">
		 				<c:forEach var="srcStops" items="${ srcList }">
		 					<option value="${ srcStops.stopName }">${ srcStops.stopName }</option>
						</c:forEach>
	 					</select>
	 				</td>
	 				<td><select name="dest_stps" id="">
	 						<c:forEach var="destStops" items="${ destList }">
		 					<option value="${ destStops.stopName }">${ destStops.stopName }</option>
		 					</c:forEach>
	 					</select>
	 				</td>
	 				<td><div class="seatbtn">
	 						<button onclick="">View Seats</button>
	 					</div>
	 				</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<footer>
	<p>Copyright @LTI</p>
	</footer>
</body>
</html>