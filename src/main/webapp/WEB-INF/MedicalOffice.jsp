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
		<h2 style="color:mediumSeaGreen;font-size:60;">
			<strong>Healthcare Portal</strong>
		</h2>
		<p style="color:mediumSeaGreen;font-size:40;">
			<strong>${medicalOffice.getName()} Medical Office</strong>
		</p>
		<p style="color:darkSlateGray;font-size:20;">
			<strong>Website:</strong> ${medicalOffice.getWebsite()}
			<br/>
			<strong>Contact:</strong> ${medicalOffice.getPhone()}
			<br/>
			<strong>Address:</strong> ${medicalOffice.showAddress()}
		</p>
		
		<p>
			${medicalOffice.getName()} has these doctors: ${medicalOffice.showHealthcareProviders()}
		</p>
		<p style="color:mediumSeaGreen;font-size:35;"><strong>Signup as a:</strong></p>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/newPatient'">PATIENT</button>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/newProvider'">HEALTHCARE PROVIDER</button>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/newAdmin'">ADMIN</button>
		
	</div>
	<img alt="logo" src="images/logo.png">
</body>
</html>
