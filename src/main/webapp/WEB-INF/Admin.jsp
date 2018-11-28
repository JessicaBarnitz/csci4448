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
		<p style="color:mediumSeaGreen;"><i>This is the ${admin.getUser()} healthcare portal</i></p>
		<p style="color:mediumSeaGreen;font-size:35"><strong>Welcome, ${admin.getFirstName()} ${admin.getLastName()}</strong></p>
		
		<p style="white-space:pre-line;">
			<strong>${admin.getState()}</strong>
		</p>
		
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/addPatient'">Add Patient</button>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/officeSchedule'">Office Schedule</button>
		<p></p>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/searchPatient'">Search for Patient</button>
		${patient.getFirstName()} ${patient.getLastName()}
		<p></p>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/schedule'">Schedule Patient Appointment</button>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/cancel'">Cancel Patient Appointment</button>
		<p></p>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/personal'">Update Patient Personal</button>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/billing'">Update Patient Billing</button>
		<p></p>
		
		<button style="color:mediumSeaGreen;" type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/medicalOffice'">Back</button>
	</div>
		<script type="text/javascript">
			function removeObserverUpdate()
			{
				${admin.getState()}
				admin.setState("");
				${admin.getState()}
			}
			setTimeout('removeObserverUpdate()', 5000);
		</script>
	<img alt="logo" src="images/logo.png">
</body>
</html>