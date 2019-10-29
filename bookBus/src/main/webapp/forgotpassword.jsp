<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen"
	href="forgotpassword.css" />
<script src="register.js"></script>
<title>Forgot Password</title>
</head>
<body>
	<!--Top Heading and LOGO-->
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
		<div class="forgotpassword">
			<form action="forgotpassword.lti" method="post" id="form">
				<input type="email" name="email" placeholder="Enter email" required />
				<br>
				<button type="submit">Submit</button>
				<button type="button">Cancel</button>
			</form>

		</div>
	</div>
</body>
</html>