<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen" href="payment.css" />
<script src="login.js"></script>
<title>Payment</title>
</head>
<body>
	<div class="container" id="container">

		<form name="registerForm" action="booking.lti" method="post"
			onsubmit="return registerValidate()">
			<h2>Payment</h2>
			<input type="text" name="cardNumber" placeholder="Card Number" required /> 
			<div class="selectField">
			<div class="fields">
                <label>Month</label>
                <select class="box">
                    <option value="" disabled="disabled"></option>
                    <option value="01">01</option>
                    <option value="02">02</option>
                    <option value="03">03</option>
                    <option value="04">04</option>
                    <option value="05">05</option>
                    <option value="06">06</option>
                    <option value="07">07</option>
                    <option value="08">08</option>
                    <option value="09">09</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                </select>
            </div>
            <div class="fields">
                <label>Year</label>
                <select class="box">
                    <option value="" disabled="disabled"></option>
                    <option value="2019">2019</option>
                    <option value="2020">2020</option>
                    <option value="2021">2021</option>
                    <option value="2022">2022</option>
                    <option value="2023">2023</option>
                    <option value="2024">2024</option>
                    <option value="2025">2025</option>
                    <option value="2026">2026</option>
                    <option value="2027">2027</option>
                    <option value="2028">2028</option>
                    <option value="2029">2029</option>
                    <option value="2030">2030</option>
                </select>
            </div>
            </div>
			<!-- <input id="month" type="text" placeholder="Enter month" name="month" required />
			<input id="year" type="text" placeholder="Enter year" name="year" required /> -->
			<input id="cvv" type="text" placeholder="Enter CVV" name="cvv" required />
			<input id="name" type="text" placeholder="Card Owner" name="cardOwner" required />
			<div style="width: 97%; margin-top: 26px; height: inherit;">
				<div style="width: 50%; float: left;">
				
					<button type="submit">Pay</button>
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