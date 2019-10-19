<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen" href="main.css" />
<title>Register</title>
</head>
<body>
	<div class="container" id="container">

		<form action="register.lti" method = "post">
			<h2>Register</h2>

			<input name="fname" placeholder="First Name" /> 
			<input name="lname"placeholder="Last Name" /> 
			<input type="email" name="email" placeholder="Email" />

			 <input name="password" type="password" placeholder="Password" /> 
			<!-- <input type="password" placeholder="Confirm Password" /> --> 
			
			<input name="contactno" placeholder="contactno"/>
			<div class="gender">
			<div class = "male">
			<label>male:</label>
			<input type="radio" value="male" name="gender"/>
			</div>
			<div class = "female">
			<label>female:</label>
			<input type="radio" value="female" name="gender"/>
			</div>
			<div class ="other">
			<label>other:</label>
			<input type="radio" value="other" name="gender"/>
			</div>
			</div>
			
			<div style="width: 97%; margin-top: 6px; height: inherit;">
				<div style="width: 50%; float: left;">
					<button type="submit">Submit</button>
				</div>
				<div>
					<button type="button">Cancel</button>
				</div>
			</div>
		</form>
	</div>
	</div>
	<footer>
	<p>Footer</p>
	</footer>
</body>
</html>