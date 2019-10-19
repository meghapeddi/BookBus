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

		<form action="#">
			<h2>Register</h2>

			<input type="name" placeholder="First Name" /> <input type="name"
				placeholder="Last Name" /> <input type="email" placeholder="Email" />

			<input type="password" placeholder="Password" /> <input
				type="password" placeholder="Confirm Password" />

			<div style="width: 100%; height: inherit;">
				<div style="margin-left: 4px; width: 50%; float: left;">
					<label>Date of Birth:</label>
				</div>
				<div style="width: 100%; display: inline-block;">
					<input type="date" />
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