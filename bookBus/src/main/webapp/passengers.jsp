<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen" href="passengers.css" />
<title>Passengers</title>
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
    
    

    <div class="container">
        
            <h3>Passengers</h3>
            <h4>Select Seats</h4>
        
        <div>
            <img style="width:25%; margin: 12px 1px;" src="seat.jpg">
            </div>

            <div class="pass_details">
	<form action="passengers.lti" method="POST">
				
		<div>
		<input type="text" name="passengerName" placeholder="Passenger Name" required /> 
		</div>
		<div>
		<input type="number" name="age" placeholder="Passenger Age" required />
		</div>
		
		<div>
		<input type="text" name="seatNo" placeholder="Enter Seat number" required />
		</div>
		<div class="gender">
			<div class="male">
				<input type="radio" value="male" name="gender" required /> <label>male</label>
			</div>

			<div class="female">
				<input type="radio" value="female" name="gender" required /> <label>female</label>
			</div>
		</div>
		<br>
		<div style="display: inline-block; margin: 1px 10px;">
			<div style="float: left;">
				<button type="submit" onclick="return passwordValidate()">Add</button>
			</div>
			<div style="float: left; margin: 1px 10px;">
				<button type="button" onclick="location.href='home.jsp'">Cancel</button>
			</div>
		</div>
	</form>
	</div>
	</div>
</body>
</html>