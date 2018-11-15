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
		<p style="color:mediumSeaGreen;font-size:35"><strong>Personal Information</strong></p>
		<form:form action="personal" method="post" commandName="personalInformationForm">
			<table border="0">
			<!-- PersonalInformation.java
		        this.phone = "contact number";
		        this.email = "contact email";
		        this.homeAddress = null;
		        this.emergencyContactName = "emergency contact name";
		        this.emergencyContactPhone = "emergency contact number";-->	
				<tr>
					<td>Contact Phone:</td>
					<td>${personalInformationForm.phone}</td>
				</tr>
				<tr>
					<td>Contact Email:</td>
					<td>${personalInformationForm.email}</td>
				</tr>
				<tr>
					<td>Home Address:</td>
					<td>${personalInformationForm.homeAddress}</td>
				</tr>
				<tr>
					<td>Emergency Contact Name:</td>
					<td>${personalInformationForm.emergencyContactName}</td>
				</tr>
				<tr>
					<td>Emergency Contact Number:</td>
					<td>${personalInformationForm.emergencyContactPhone}</td>
				</tr>
			</table>
		</form:form>
		<script type="text/javascript">
			function Redirect()
			{
				window.location = "http://localhost:8080/SpringMVCTutorial/patient";
			}
			document.write("You will be redirected back to the patient portal in 5 seconds");
			setTimeout('Redirect()', 5000);
		</script>
	</div>
	<img alt="logo" src="images/logo.png">
</body>
</html>