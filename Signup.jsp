<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="webjars/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="header.css">
<script src="webjars/jquery/3.3.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>

</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<ul class="nav navbar-nav navbar-left">
				<li><img src="WEB-INF/images/Logo.png"></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><h5>
							<span class="glyphicon glyphicon-home"></span> Home
						</h5></a></li>
				<li><a href="#"><h5>
							<span class="glyphicon glyphicon-user"></span> Sign Up
						</h5></a></li>
				<li><a href="#"><h5>
							<span class="glyphicon glyphicon-log-in"></span> Login
						</h5></a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
		</div>
	</nav>
	<footer>
		<a href="#">follow us on : <span
			class="glyphicon glyphicon-envelope"> reddyganesh775@gmail.com
		</span></a><a href="#"> <span class="glyphicon glyphicon-phone">9731719159</span></a>
	</footer>

	<form action="register.do" method="post">
		<pre>
<div>
Email : <input type="email" name="email" id="email">
UserName : <input type="text" name="userName" id="userNamae">
MobileNo : <input type="tel" name="mobileNo" id="mobileNo">
Type     :<select name="type" id="type">
             <option value="select">Select</option>
            <option value="employee">Employee</option>
            <option value="other">Other</option>
            </select>
            
            <input type="submit" value="submit"> <input
					type="reset" value="clear">
            </div>
</pre>

	</form>
</body>
</html>