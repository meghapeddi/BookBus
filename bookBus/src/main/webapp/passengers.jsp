<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="passengers.lti" method="POST">
		Passenger Name:<input type="text" name="passengerName" required /> 
		Passenger Age:<input type="number" name="age" required />
		Enter Seat number:<input type="text" name="seatNo" required />
		<div class="gender">
			<div class="male">
				<input type="radio" value="male" name="gender" required /> <label>male</label>
			</div>

			<div class="female">
				<input type="radio" value="female" name="gender" required /> <label>female</label>
			</div>
		</div>
		<div style="width: 97%; margin-top: 6px; height: inherit;">
			<div style="width: 50%; float: left;">
				<button type="submit" onclick="return passwordValidate()">Add</button>
			</div>
			<div>
				<button type="button">Proceed</button>
			</div>
		</div>
	</form>
</body>
</html>