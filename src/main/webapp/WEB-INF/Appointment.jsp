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
		<p style="color:mediumSeaGreen;font-size:35"><strong>Appointment</strong></p>
		<form:form action="appointment" method="post" commandName="appointment">
			<table border="0">
			<!-- Appointment.java
					this.datetime = _datetime;
        			this.reason = _reason;
//        			this.healthcareProvider = _healthcareProvider;
//        			this.patient = _patient;-->	
				<!-- check date and time -->
				<tr> 
					<td>Date and Time (mm/dd/yyyy):</td>
					<td><form:input path="datetime" /></td>
				</tr>
				<tr>
					<td>Reason for Visit:</td>
					<td><form:input path="reason" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form:form>
	</div>
	<img alt="logo" src="images/logo.png">
</body>
</html>