<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>deposit</title>
</head>
<body>
<h1>Deposit</h1>
<form:form method="post" action="save">
<table>
<tr><td>Enter Account number:</td><td><form:input path="acnum"/></td>
<tr><td>Amount :</td><td><form:input path="amt"/></td>
<tr><td></td><td><input type="submit" value="Submit"/></td></tr></table>
</form:form>
</body>
</html>