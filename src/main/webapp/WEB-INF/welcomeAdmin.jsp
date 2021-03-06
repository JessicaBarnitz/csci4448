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
		<p style="color:mediumSeaGreen;font-size:35"><strong>Welcome, new ${admin.getUser()}</strong></p>
		<p style="color:mediumSeaGreen;font-size:35"><strong>Please Sign Up:</strong></p>
		<form:form action="admin" method="POST" modelAttribute="admin">
			<table border="0">
			<!-- User.java
		            this.username = ""; 
			        this.password = "";
			        this.firstName = "";
			        this.lastName = "";
			        this.dateOfBirth = null;-->	
				<tr>
					<td>First Name:</td>
					<td><form:input path="firstName" /></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<td>Date of Birth:</td>
					<td><form:input path="dateOfBirth" /></td>
				</tr>
				<tr>
					<td>Job Title:</td>
					<td><form:input path="jobTitle" /></td>
				</tr>
				<tr>
					<td>Username:</td>
					<td><form:input path="username" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:input path="password" /></td>
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


