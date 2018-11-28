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
		<p style="color:mediumSeaGreen;font-size:35"><strong>Search for Patient</strong></p>
		<form:form action="searchPatient" method="post" modelAttribute="searchPatient">
			<table border="0">	
				<tr>
					<td>Patient First Name:</td>
					<td><form:input path="firstName" /></td> 
				</tr>
				<tr>
					<td>Patient Last Name:</td>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<td style="margin: 10px; padding:5px"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input style="color:mediumSeaGreen" type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form:form>
		<strong>OR</strong>
		<form:form action="searchPatient" method="post" modelAttribute="searchPatient">
			<table border="0">	
				<tr>
					<td>Patient ID:</td>
					<td><form:input path="patientID" /></td> 
				</tr>
				<tr>
					<td style="margin: 10px; padding:5px"></td>
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