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
		
		<form NAME="form1" ACTION="formAction.jsp" METHOD="POST">
			<input TYPE="HIDDEN" NAME="buttonName">
			<input TYPE="BUTTON" VALUE="Search for Patient" ONCLICK="button1()">
			<input TYPE="BUTTON" VALUE="Schedule Appointment" ONCLICK="button2()">
			<p></p>
			<input TYPE="BUTTON" VALUE="Update Patient Personal" ONCLICK="button3()">
			<input TYPE="BUTTON" VALUE="Update Patient Medical" ONCLICK="button4()">
			<input TYPE="BUTTON" VALUE="Office Schedule" ONCLICK="button5()">
		</form>
		
		<script LANGUAGE="JavaScript">
			function button1()
			{
				document.form1.buttonName.value = "Search for Patient"
				form1.submit()
			}
			function button2()
			{
				document.form1.buttonName.value = "Schedule Appointment"
				form1.submit()
			}
			function button3()
			{
				document.form1.buttonName.value = "Update Patient Personal"
				form1.submit()
			}
			function button4()
			{
				document.form1.buttonName.value = "Update Patient Medical"
				form1.submit()
			}
			function button5()
			{
				document.form1.buttonName.value = "Office Schedule"
				form1.submit()
			}
		</script>
	</div>
	<img alt="logo" src="${pageContext.request.contextPath}/logo.png">
</body>
</html>