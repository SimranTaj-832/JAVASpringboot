<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Account</title>
</head>
<body>
<h1>Create Account</h1>
<form:form method="post" action="save">
<table>
<tr><td>Enter Id:</td><td><form:input path="cid"/></td>
<tr><td>Type(Savings/Salary):</td><td><form:input path="actyp"/></td>
<tr><td>Balance:</td><td><form:input path="bal"/></td>
<tr><td></td><td><input type="submit" value="Submit"/></td></tr></table>
</form:form>
</body>
</html>