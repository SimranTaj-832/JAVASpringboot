<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Employee</h1>
<form:form method="POST" action="/editsave">
<table>
<tr><td></td><td><form:hidden path="id"/></td></tr>
<tr><td>Name:</td><td><form:input path="name"/></td></tr>
<tr><td>Salary:</td><td><form:input path="salary"/></td></tr>
<tr><td></td><td><input type="submit" value="Edit Save"/></td></tr>
</table>
</form:form>
</body>
</html>