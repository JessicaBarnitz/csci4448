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
			<strong>Contact:</strong> ${medicalOffice.getPhone()}
			<br/>
			<strong>Website:</strong> ${medicalOffice.getWebsite()}
			<br/>
			<strong>Address:</strong> ${medicalOffice.showAddress()}
		</p>
		<p style="white-space:pre-line;">
			<strong>${medicalOffice.getName()} has these Healthcare Providers:</strong>
			${medicalOffice.showHealthcareProviders()}
		</p>
		<p style="color:mediumSeaGreen;font-size:35;"><strong>Click for access:</strong></p>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/patient'">PATIENT PORTAL</button>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/medicalOffice'">MEDICAL OFFICE PORTAL</button>
	</div>
	<img alt="logo" src="images/logo.png">
</body>
</html>
