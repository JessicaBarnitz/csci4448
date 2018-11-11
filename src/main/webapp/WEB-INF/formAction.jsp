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
        <h1>Determining Which Button Was Clicked</h1>
        You clicked 
        <%= request.getParameter("buttonName") %>

	</div>
	<img alt="logo" src="images/logo.png">
</body>
</html>