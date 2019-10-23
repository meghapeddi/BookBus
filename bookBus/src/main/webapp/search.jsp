<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>Bus no</th>
				<th>Bus name</th>
				<th>Source</th>
				<th>Destination</th>
				<th>Slot no</th>
				<th>Type</th>
				<th>No of seats</th>
				<th>Fare</th>
				<th>Arrival Time</th>
				<th>Departure Time</th>
				<th>Time of travel</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="data" items="${obj}">
				<tr>
					<td>${data.busNo}</td>
					<td>${data.busName}</td>
					<td>${data.src}</td>
					<td>${data.destination}</td>
					<td>${data.slotNo}</td>
					<td>${data.type}</td>
					<td>${data.noOfSeats}</td>
					<td>${data.fare}</td>
					<td>${data.departureTime}</td>
					<td>${data.arrivalTime}</td>
					<td>${data.travelTime}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>