<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen" href="admin.css" />
<script src="addBuses.js"></script>
<title>Admin</title>
</head>
<body>
	<!--Top Heading and LOGO-->
	<div class="top_nav">
		<div class="logo">
			<img src="logo.png" style="width: inherit;" alt="LOGO">
		</div>
		<div class="contact_icon">
			<img src="contact.png" style="width: 90%;" " alt="CONTACT">
		</div>
		<div class="heading">
			<h1>bookBUS</h1> 
		</div>
	</div>


	<!--Container Design for the Admin form-->
	<div class="container">

		<h3>Administrator</h3>
		<h4>Update Details</h4>

		<form name="adminForm" action="addbuses.lti"
			onsubmit="return validateBusNo() && validateBusTime()" method="post">
			<input type="text" placeholder="Enter Bus number" name="busNo"><br>
			 <input type="text" placeholder="Enter Bus name" name="busName" required><br> 
			 <label>Source:</label>
			 <select
				style="width: 48%;" name="src">
				<option value="Mumbai" >Mumbai</option>
				<option value="Pune">Pune</option>
				<option value="Goa">Goa</option>
				<option value="Bangalore" >Bangalore</option>
			</select><br>
		    <label>Destination:</label>
		    <select style="width: 40%;" name="destination">
				<option value="Pune" >Pune</option>
				<option value="Goa" >Goa</option>
				<option value="Bangalore" >Bangalore</option>
				<option value="Mumbai" >Mumbai</option>
			</select><br>
		    <input type="text" placeholder="Enter Slot number" name="slotNo"><br> 
		    <label>Type:</label>
		    <select name="type">
				<option value="AC" >AC</option>
				<option value="NON AC">NON-AC</option>
				<br>
				<!-- <input type="text" placeholder="Departure time" name="depttime">
				<input type="text" placeholder="Arrival time" name="arrivaltime">
				<br>
				<label>Day:</label>
				<select>
					<option value="Sunday">Sunday</option>
					<option value="Monday">Monday</option>
					<option value="Tuesday">Tuesday</option>
					<option value="Wednesday">Wednesday</option>
					<option value="Thursday">Thursday</option>
					<option value="Friday">Friday</option>
					<option value="Saturday">Saturday</option>-->
			</select> <br>
			
			<input type="text" placeholder="Enter Fare" name="fare"><br>
			<button type="submit">Add Bus</button>
		</form>
	</div>


	<!--Footer of the Page-->
	<footer>
		<p>Copyright @LTI</p>
	</footer>

</body>
</html>