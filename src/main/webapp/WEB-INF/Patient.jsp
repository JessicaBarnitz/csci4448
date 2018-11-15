<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>

<!Doctype>
<html>
<head>
<meta charset="UTF-8">
	<title>Healthcare Portal</title>
</head>
<body>
	<div align="center">
		<h2 style="color:mediumSeaGreen;font-size:60">
			<strong>Healthcare Portal</strong>
		</h2>
		<p style="color:mediumSeaGreen;"><i>This is the ${user} healthcare portal</i></p>
		<p style="color:mediumSeaGreen;font-size:35"><strong>Welcome, ${firstName} </strong></p>
		
		
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/billing'">Update Billing Information</button>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/personal'">Update Personal Information</button>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/medical'">Update Medical Information</button>
		<p></p>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/appointment'">Appointments</button>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/schedule'">Schedule Appointment</button>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/cancel'">Cancel Appointment</button>
	
	</div>
	<img alt="logo" src="images/logo.png">
</body>
</html>