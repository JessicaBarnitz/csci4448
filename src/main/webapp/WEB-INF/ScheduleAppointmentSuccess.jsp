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
		<p style="color:mediumSeaGreen;font-size:35"><strong>Schedule Appointment Success</strong></p>
		<form:form action="appointment" method="POST" modelAttribute="appointment">
			<table border="0">
			<!-- Appointment.java
				    this.date = null;
			        this.time = "";
			        this.reason = "";
			        this.healthcareProvider = null;
			        this.patient = null;-->	
				<tr>
					<td>Date:</td>
					<td>${appointment.date}</td>
				</tr>
			</table>
		</form:form>
		<p></p>
		<script type="text/javascript">
			function Redirect()
			{
				window.history.go(-2);
			}
			document.write("You will be redirected back to the patient portal in 5 seconds");
			setTimeout('Redirect()', 5000);
		</script>
	</div>
	<img alt="logo" src="images/logo.png">
</body>
</html>