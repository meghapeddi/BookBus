<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen"
	href="resetpassword.css" />
<script src="password.js"></script>
<title>Reset Password</title>
</head>
<body>
	<div class="top_nav">
		<div class="logo">
			<img src="logo.png" style="width: inherit;" alt="LOGO">
		</div>



		<div class="heading">
			<h1>bookBUS</h1>
		</div>

		<!--Navigation Bar-->
		<div class="nav"></div>

	</div>

	<div class="container">
		<form action="resetPassword.lti" method="post" id="form" onsubmit="return passwordValidate()">
			<div>
				<input id="password" type="password" name="new" placeholder="Enter New Password" required/>
				<br> <input id="confirmpassword" type="password" name="confirm"
					placeholder="Confirm Password" required/> <br>
				<button type="submit">Submit</button>
				<button type="submit">Cancel</button>
			</div>
			<br>
		</form>
	</div>
	</div>
	</div>
</body>
</html>