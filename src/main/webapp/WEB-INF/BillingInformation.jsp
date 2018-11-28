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
		<p style="color:mediumSeaGreen;font-size:35"><strong>Billing Information</strong></p>
		For patient ${patient.getFirstName()} ${patient.getLastName()}
		<form:form action="billing" method="post" modelAttribute="billingInformationForm">
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
					<td><form:input path="insurance" /></td>
				</tr>
				<tr>
					<td>Insurance Plan:</td>
					<td><form:input path="insurancePlan" /></td>
				</tr>
				<tr>
					<td>Insurance Plan Number:</td>
					<td><form:input path="insurancePlanNumber" /></td>
				</tr>
				<tr>
					<td>Effective Date (mm/dd/yyyy):</td>
					<td><form:input path="effectiveDate" /></td>
				</tr>
				<tr>
					<td>Co-pay:</td>
					<td><form:input path="copay" /></td>
				</tr>
				<tr>
					<td>Billing Address Street:</td>
					<td><form:input path="billingAddress.street" /></td>
				</tr>
				<tr>
					<td>Billing Address City:</td>
					<td><form:input path="billingAddress.city" /></td>
				</tr>
				<tr>
					<td>Billing Address County:</td>
					<td><form:input path="billingAddress.county" /></td>
				</tr>
				<tr>
					<td>Billing Address State:</td>
					<td><form:input path="billingAddress.state" /></td>
				</tr>
				<tr>
					<td>Billing Address Zipcode:</td>
					<td><form:input path="billingAddress.zipcode" /></td>
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