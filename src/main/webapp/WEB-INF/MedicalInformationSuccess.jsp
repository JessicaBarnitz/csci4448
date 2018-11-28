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
		<p style="color:mediumSeaGreen;font-size:35"><strong>Medical Information Updated</strong></p>
		For patient ${patient.getFirstName()} ${patient.getLastName()}
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
					<td>${medicalInformationForm.allergies}</td>
				</tr>
				<tr>
					<td>Immunizations:</td>
					<td>${medicalInformationForm.immunizations}</td>
				</tr>
				<tr>
					<td>Current Medications:</td>
					<td>${medicalInformationForm.currentMedications}</td>
				</tr>
				<tr>
					<td>Mental Status Exam:</td>
					<td>${medicalInformationForm.mentalStatusExam}</td>
				</tr>
				<tr>
					<td>Functional Status Exam:</td>
					<td>${medicalInformationForm.functionalStatusExam}</td>
				</tr>
				<tr>
					<td>Personal Medical History:</td>
					<td>${medicalInformationForm.personalMedicalHistory}</td>
				</tr>
				<tr>
					<td>Family Medical History:</td>
					<td>${medicalInformationForm.familyMedicalHistory}</td>
				</tr>
				<tr>
					<td>Continuum of Care Consent:</td>
					<td>${medicalInformationForm.consent}</td>
				</tr>
			</table>
		</form:form>
		<script type="text/javascript">
			function Redirect()
			{
				//window.location = "http://localhost:8080/SpringMVCTutorial/patient";//<-object is not stored
				window.history.go(-2);
			}
			document.write("You will be redirected back to the home portal in 5 seconds");
			setTimeout('Redirect()', 5000);
		</script>
	</div>
	<img alt="logo" src="images/logo.png">
</body>
</html>