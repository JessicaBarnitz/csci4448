<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
		<p style="color:mediumSeaGreen;font-size:35"><strong>Appointments</strong></p>
		<form:form action="appointment" method="post" commandName="appointment">
			<table border="0">
			<p style="white-space:pre-line;">
			<strong>${patient.getFirstName()} has the following appointments:</strong>
				${patient.showAppointments()}
			</p>
			</table>
		</form:form>
		<p></p>
		<button style="color:mediumSeaGreen;" type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/patient'">Back</button>
	</div>
	<img alt="logo" src="images/logo.png">
</body>
</html>