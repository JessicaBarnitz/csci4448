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
		<p style="color:mediumSeaGreen;"><i>This is the ${user} healthcare portal</i></p>
		<p style="color:mediumSeaGreen;font-size:35"><strong>Welcome, ${firstName}</strong></p>
		
		
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/billing'">Update Billing Information</button>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/personal'">Update Personal Information</button>
		<button type="button" onclick="location.href='http://localhost:8080/SpringMVCTutorial/medical'">Update Medical Information</button>
		<p></p>
		
		<!-- <form NAME="form1" ACTION="formAction.jsp" METHOD="POST"> 
		<form NAME="form1" ACTION="http://localhost:8080/SpringMVCTutorial/formAction" METHOD="POST">
			<input TYPE="HIDDEN" NAME="buttonName">
			<input TYPE="BUTTON" VALUE="Schedule Appointment" ONCLICK="button1()">
			<input TYPE="BUTTON" VALUE="Cancel Appointment" ONCLICK="button2()">
			<input TYPE="BUTTON" VALUE="Update Medical Information" ONCLICK="button3()">
			<p></p>
			<input TYPE="BUTTON" VALUE="Update Billing Information" ONCLICK="button4()">
			<input TYPE="BUTTON" VALUE="Update Personal Information" ONCLICK="button5()">
			<input TYPE="BUTTON" VALUE="Appointments" ONCLICK="button6()">
		</form>
		
		<script LANGUAGE="JavaScript">
			
			function button1()
			{
				document.form1.buttonName.value = "Schedule Appointment"
				form1.submit()
			}
			function button2()
			{
				document.form1.buttonName.value = "Cancel Appointment"
				form1.submit()
			}
			function button3()
			{
				document.form1.buttonName.value = "Update Medical Information"
				form1.submit()
			}
			function button4()
			{
				document.form1.buttonName.value = "Update Billing Information"
				form1.submit()
			}
			function button5()
			{
				document.form1.buttonName.value = "Update Personal Information"
				form1.submit()
			}
			function button6()
			{
				document.form1.buttonName.value = "Appointments"
				form1.submit()
			}
		</script>-->
	</div>
	<img alt="logo" src="images/logo.png">
</body>
</html>