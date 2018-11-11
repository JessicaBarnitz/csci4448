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
		<p style="color:mediumSeaGreen;font-size:35"><strong>Medical Information</strong></p>
		<form:form action="medical" method="post" commandName="medicalInformationForm">
			<table border="0">
			<!-- MedicalInformation.java
		        	this.allergies = null;
			    	this.immunizations = null;
			    	this.currentMedications = null;
			    	this.mentalStatusExam = "";
			    	this.functionalStatusExam = "";
			    	this.personalMedicalHistory = null;
			    	this.familyMedicalHistory = null;
			    	this.consent = false;-->	
				<tr>
					<td>Allergies:</td>
					<td><form:input path="allergies" /></td>
				</tr>
				<tr>
					<td>Immunizations:</td>
					<td><form:input path="immunizations" /></td>
				</tr>
				<tr>
					<td>Current Medications:</td>
					<td><form:input path="currentMedications" /></td>
				</tr>
				<tr>
					<td>Mental Status Exam:</td>
					<td><form:input path="mentalStatusExam" /></td>
				</tr>
				<tr>
					<td>Functional Status Exam:</td>
					<td><form:input path="functionalStatusExam" /></td>
				</tr>
				<tr>
					<td>Personal Medical History:</td>
					<td><form:input path="personalMedicalHistory" /></td>
				</tr>
				<tr>
					<td>Family Medical History:</td>
					<td><form:input path="familyMedicalHistory" /></td>
				</tr>
				<tr>
					<td>Continuum of Care Consent:</td>
					<td><form:input path="consent" /></td>
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