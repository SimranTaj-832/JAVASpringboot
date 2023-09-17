<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
<h1>Admin Login</h1>
<form:form method="post" action="save">
<table>
<tr><td>Admin Id:</td><td><form:input path="id"/></td>
<tr><td>Password:</td><td><form:input path="pass"/></td>
<tr><td></td><td><input type="submit" value="Login"/></td></tr></table>
</form:form>
</body>
</html>