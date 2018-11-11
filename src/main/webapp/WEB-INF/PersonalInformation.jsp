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
					<td><form:input path="phone" /></td>
				</tr>
				<tr>
					<td>Contact Email:</td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td>Home Address:</td>
					<td><form:input path="homeAddress" /></td>
				</tr>
				<tr>
					<td>Emergency Contact Name:</td>
					<td><form:input path="emergencyContactName" /></td>
				</tr>
				<tr>
					<td>Emergency Contact Number:</td>
					<td><form:input path="emergencyContactPhone" /></td>
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