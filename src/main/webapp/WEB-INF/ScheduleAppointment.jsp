<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false" %>

<!Doctype>
<html>
<head>
<meta charset="UTF-8">
	<title>Healthcare Portal</title>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<link rel="stylesheet" href="/resources/demos/style.css">
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script>
	$( function() {
	  $( "#datepicker" ).datepicker();
	} );
	</script>
</head>
<body>

<body>
	<div align="center">
		<h2 style="color:mediumSeaGreen;font-size:60">
			<strong>Healthcare Portal</strong>
		</h2>
		<p style="color:mediumSeaGreen;font-size:35"><strong>Schedule Appointment</strong></p>
		<form:form action="appointment" method="post" modelAttribute="appointment">
			<table border="0">
			<!-- Appointment.java
					this.datetime = _datetime;
        			this.reason = _reason;
//        			this.healthcareProvider = _healthcareProvider;
//        			this.patient = _patient;-->	
				<!-- check date and time -->
				<tr> 
					<td>Date:</td>
					<td><form:input path="date" type="text" id="datepicker"/></td>
				</tr>
				<tr> 
					<td>Time:</td>
					<td><form:select path="time" items="${timesList}" /></td>
				</tr>
				<tr>
					<td>Reason for Visit:</td>
					<td><form:input path="reason" /></td>
				</tr>
				<tr>
					<td>Healthcare Provider Specific?</td>
					<td><form:select path="healthcareProvider" items="${healthcareProviderList}" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input style="color:mediumSeaGreen" type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form:form>
	</div>
	<img alt="logo" src="images/logo.png">
</body>
</html>