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
		<h2 style="color:mediumSeaGreen;font-size:60;">
			<strong>Healthcare Portal</strong>
		</h2>
		<p style="color:mediumSeaGreen;font-size:40;"><strong>Welcome</strong></p>
		
		<p style="color:grey;padding:30px;">
			A healthcare portal for a medical office that schedules upcoming and previous patient appointments and securely 
			maintains the patient's health record.  Once this system is complete patients can sign up for the portal, log in, 
			request an appointment for a healthcare provider, have full access to their personal information, medical information 
			and billing information, and give consent to share their medical information. The medical office admin can sign up and 
			log in, add patients to the portal, have full access to the medical office schedule, can schedule/reschedule appointments 
			for the healthcare provider, can search for a patient by name or patient number, and have full access to patient personal 
			information and billing information. The healthcare providers can sign up and log in, have full access to the medical 
			office schedule, can schedule/reschedule appointments for the healthcare provider, can search for a patient by name or 
			patient number, have full access to patient personal information and medical information and when healthcare providers 
			refer patients to outside healthcare providers, they can share the patient's medical information for continuum of care, 
			with patient consent. 
		<p>
		<p style="color:mediumSeaGreen;font-size:35;"><strong>Are you a:</strong></p>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/newPatient'">PATIENT</button>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/provider'">HEALTHCARE PROVIDER</button>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/admin'">ADMIN</button>
		
	</div>
	<img alt="logo" src="images/logo.png">
</body>
</html>
