<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen" href="main.css" />
<title>Login</title>
</head>
<body>
<div class="container" id="container">

		<form action="login.lti" method = "post">
			<h2>Login</h2>

			<input type = "email" name="email" placeholder="Enter email" />
			<input type = "password" name="password" placeholder="Enter password" /><br> 
			
			<div style="width: 97%; margin-top: 6px; height: inherit;">
				<div style="width: 50%; float: left;">
					<button type="submit">Submit</button>
				</div>
				<div>
					<button type="button">Cancel</button>
				</div>
			</div>
		</form>
</body>
</html>