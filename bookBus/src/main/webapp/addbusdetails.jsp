<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen"
	href="addbusdetails.css" />
<script src="admin.js"></script>
<title>Add Bus Details</title>
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
				<img src="contact.png" style="width: 80%;" alt="CONTACT"> <a
					href="home.jsp" style="color: black">Logout</a>
			</div>
		</div>

	</div>

	<div class="side_nav">
		<ul>
			<li><a class="active" href="addbusdetails.jsp">Add Bus
					Details</a></li>


			<li><a href="addstops.jsp">Add Stops</a></li>

		</ul>

	</div>

	<!--Container Design for the Admin form-->
	<div class="container">

		<h3>Administrator</h3>
		<h4>Add Bus Details</h4>

		<form name="adminForm" action="submit"
			onsubmit="return validateBusNo() && validateBusTime()">
			<input type="text" placeholder="Enter Bus number" name="busno" required>
			 <input type="text" placeholder="Enter Bus name"
				name="busname" required> <br> <label>Source:</label> <select
				style="width: 18%;">
				<option value="Mumbai">Mumbai</option>
				<option value="Pune">Pune</option>
				<option value="Goa">Goa</option>
				<option value="Bangalore">Bangalore</option>
			</select><br> <label>Destination:</label> <select style="width: 15%;">
				<option value="Pune">Pune</option>
				<option value="Goa">Goa</option>
				<option value="Bangalore">Bangalore</option>
				<option value="Mumbai">Mumbai</option>
			</select> <br>
			<input type="text" placeholder="Departure Time" name="depttime" required> 
			<input type="text" placeholder="Arrival Time" name="arrivaltime" required><br>
			<input type="text" placeholder="Travel Time" name="travelltime" required>
			<input type="text" placeholder="Fare" name="fare" required><br>
			 <label>Type:</label> <select>
				<option value="AC">AC</option>
				<option value="NON AC">NON-AC</option>
			</select> <br>
			<button type="submit">Add Bus</button>
		</form>
	</div>


	<!--Footer of the Page-->
	<footer>
	<p>Copyright @LTI</p>
	</footer>

</body>
</html>