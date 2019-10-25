<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen"
	href="register.css" />
<script src="register.js"></script>
<title>Register</title>
</head>
<body>
	<div class="container" id="container">

		<form name="registerForm" action="register.lti" method="post"
			onsubmit="return registerValidate() && contactValidate()">
			<h2>Register</h2>

			<input name="fname" placeholder="First Name" required /> <input
				name="lname" placeholder="Last Name" required /> <input
				type="email" name="email" placeholder="Email" required /> <input
				id="password" type="password" placeholder="Password" required /> <input
				id="confirmpassword" type="password" placeholder="Confirm Password"
				required /> <input name="contactno" placeholder="ContactNo"
				required />
			<div class="gender">
				<div class="male">
					<input type="radio" value="male" name="gender" required /> <label>male</label>
				</div>

				<div class="female">
					<input type="radio" value="female" name="gender" required /> <label>female</label>
				</div>

				<div class="other">
					<input type="radio" value="other" name="gender" required /> <label>other</label>
				</div>
			</div>

			<div style="width: 97%; margin-top: 6px; height: inherit;">
				<div style="width: 50%; float: left;">
					<button type="submit" onclick="return passwordValidate()">Submit</button>
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