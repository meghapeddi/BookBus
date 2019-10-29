<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen" href="noOfSeats.css" />

<title>No of Seats</title>
</head>
<body>
	<!--Top Heading and LOGO-->
<div class="top_nav">
    <div class="logo">
        <img class="dropbtn" src="logo.png" style="width:inherit;" alt="LOGO">
    </div>

    
<!--Heading-->
    <div class="heading">
        <h1>
            bookBUS
        </h1>
        </div>

    <div class="contact_icon">
        <div class="dropdown">
            <img src="contact.png" style="width: 80%;" alt="CONTACT">
            <a href="<c:url value='/logout.lti' />">Logout</a>
        </div>
        </div>
    
</div>



<!--Container Design for the Admin form-->
<div class="container">   

<h3>Seating</h3>

<%-- <div class="source_date">
			<label> Onward Journey</label><br>
			<div class="source">
				<span>${searchData.boardingPoint}</span>
			</div>

			<div class="arrow">
				<img class="arrow_img" src="arrow.png" alt="">
			</div>

			<div class="dest">
				<span>${searchData.dropPoint}</span>
			</div>
</div>
 --%>


<div class="seatinput">


<label> Select Number of Seats:</label>
	<form action="seatsSelected.lti" method="POST">
		<select name="noOfSeats">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
		</select>
		<br>
		<button type="submit">Continue</button>
	</form>
	
	</div>
	
	<!--Footer of the Page-->
<footer>
    <p>Copyright @LTI</p>
</footer>
</body>
</html>