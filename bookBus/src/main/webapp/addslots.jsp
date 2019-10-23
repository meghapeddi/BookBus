<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen"
	href="addslots.css" />
<script src="admin.js"></script>
<title>Add Slots</title>
</head>
<body>
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

		<!--Navigation Bar-->
		<div class="nav">
			<ul>
				<li><a href="#home">Freq Routes</a></li>
				<li><a href="#news">Profits</a></li>
				<li><a href="#contact">Preferred Buses</a></li>
				<li><a href="#about">Reservation Details</a></li>
			</ul>
		</div>

		<div class="contact_icon">
			<div class="dropdown">
				<img src="contact.png" style="width: 80%;" alt="CONTACT"> <a
					href="home.jsp" style="color: black">Logout</a>
			</div>
		</div>

	</div>

	<div class="side_nav">
		<ul>
			<li><a href="addbusdetails.jsp">Add Bus Details</a></li>

			<li><a class="active" href="addslots.jsp">Add Slots</a></li>

			<li><a href="addstops.jsp">Add Stops</a></li>

		</ul>

	</div>

	<!--Container Design for the Admin form-->
	<div class="container">

		<h3>Administrator</h3>
		<h4>Add Slots</h4>

		<form name="adminForm" action="submit"
			onsubmit="return validateBusTime()">

			<label>Slot No:</label> <select style="width: 22%;">
				<option value="SM1">SM1</option>
				<option value="SM2">SM2</option>
				<option value="SM3">SM3</option>
				<option value="SM4">SM4</option>
			</select> <br> <input type="text" placeholder="Departure Time"
				name="depttime"> <br> <input type="text"
				placeholder="Arrival Time" name="arrivaltime" required> <br>
			<input type="text" placeholder="Travel Time" name="traveltime"
				required> <br> <label>Day:</label> <select
				style="width: 24%;">
				<option value="sunday">Sunday</option>
				<option value="monday">Monday</option>
				<option value="tuesday">Tuesday</option>
				<option value="wednesday">Wednesday</option>
				<option value="thursday">Thursday</option>
				<option value="friday">Friday</option>
				<option value="saturday">Saturday</option>
			</select> <br> <br>
			<button type="submit">Add Slots</button>
		</form>
	</div>


	<!--Footer of the Page-->
	<footer>
	<p>Copyright @LTI</p>
	</footer>

</body>


</html>