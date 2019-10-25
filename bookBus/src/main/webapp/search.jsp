<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

	<form action="submit">
		<div class="bus_detail">
			<div class="bus_card">
				<span id="busname">${busDetails }</span><br>
				<p id="type">AC</p>
			</div>

			<div class="ac"></div>
			<div class="time">7:50</div>
			<div class="sourcestops">
				<select name="src_stps" id="">
					<option value="borivali">Borivali</option>
					<option value="dadar">Dadar</option>
					<option value="kalyan">Kalyan</option>
					<option value="vashi">Vashi</option>

				</select>
			</div>
			<div class="deststops">
				<select name="dest_stps" id="">
					<option value="hinjewadi">Hinjewadi</option>
					<option value="swargate">Swargate</option>
					<option value="wakad">Wakad</option>
					<option value="kothrud">Kothrud</option>
				</select>
			</div>

			<div class="seatsnum"
				style="width: 6%; display: inline-block; float: left; margin: 41px -33px;">
				<label>Seats:</label> <span>20</span>
			</div>

			<div class="seatbtn">
				<button onclick="">View Seats</button>
			</div>
		</div>
	</form>
	<footer>
	<p>Copyright @LTI</p>
	</footer>
</body>
</html>