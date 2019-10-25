<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen" href="login.css" />
<script src="login.js"></script>
<title>Login</title>
</head>
<body>
	<div class="container" id="container">

		<form name="registerForm" action="register.lti" method="post"
			onsubmit="return registerValidate()">
			<h2>Login</h2>

			<input type="email" name="email" placeholder="Email" required /> <input
				id="password" type="password" placeholder="Password" required />
				
				<div class="forgot">
				<a href="forgotpassword.jsp">Forgot Password</a>
				</div>
			<div style="width: 97%; margin-top: 26px; height: inherit;">
				<div style="width: 50%; float: left;">
				
					<button type="submit">Sign In</button>
				</div>
				<div>
					<button type="submit" onclick="location.href='register.jsp'">Sign
						Up</button>
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