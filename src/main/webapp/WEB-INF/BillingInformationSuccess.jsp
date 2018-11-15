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
		<p style="color:mediumSeaGreen;font-size:35"><strong>Billing Information Success</strong></p>
		<form:form action="billing" method="post" commandName="billingInformationForm">
			<table border="0">
			<!-- BillingInformation.java
				    this.insurance = false;
			        this.insurancePlan="name";
			        this.insurancePlanNumber="number";
			        this.effectiveDate=null;
			        this.copay="amount";
			        this.billingAddress=null;-->	
				<tr>
					<td>Insurance:</td>
					<td>${billingInformationForm.insurance}</td>
				</tr>
				<tr>
					<td>Insurance Plan:</td>
					<td>${billingInformationForm.insurancePlan}</td>
				</tr>
				<tr>
					<td>Insurance Plan Number:</td>
					<td>${billingInformationForm.insurancePlanNumber}</td>
				</tr>
				<tr>
					<td>Effective Date (mm/dd/yyyy):</td>
					<td>${billingInformationForm.effectiveDate}</td>
				</tr>
				<tr>
					<td>Co-pay:</td>
					<td>${billingInformationForm.copay}</td>
				</tr>
				<tr>
					<td>Billing Address:</td>
					<td>${billingInformationForm.billingAddress}</td>
				</tr>
			</table>
		</form:form>
		<p></p>
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